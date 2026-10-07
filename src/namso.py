#!/usr/bin/env python3
"""Port educativo en Python estándar de la lógica LOCAL recuperable del APK
``app.namso_gen.spacehowen`` (decompilado con jadx; ver docs/python-port.md).

Alcance: solo lo que el código fuente decompilado define de forma local:
generador de tarjetas con Luhn, IBAN (ES/DE/IT/FR), CPF, contraseñas,
variantes de correo con puntos, y el clasificador "LIVE/DIED" offline del
checker (``h3.e1.h0``) junto con su modelo de gate/envejecimiento.

Los clientes HTTP y Firebase se implementan en módulos separados y se delegan
desde esta CLI. GUI, SDKs Android y código de los servidores no están portados.

IMPORTANTE: el estado LIVE/DIED del checker NO valida nada con un banco. Tras
comprobar formato (marca, Luhn, vencimiento) el resultado es una tirada de
dado (5 % o el ``livePct`` del gate). Es una simulación.

Las referencias ``Clase.java:línea`` apuntan a decompiled/jadx/sources/.
El aleatorio de la app es kotlin.random (no determinista); aquí se usa
``random.Random`` para poder hacer demos reproducibles con ``--seed``. Solo
``KotlinXorWow`` replica bit a bit el PRNG sembrado de la app.
"""
import argparse
import itertools
import random
import sys
import unicodedata

# --------------------------------------------------------------------------
# Utilidades Java/Kotlin
# --------------------------------------------------------------------------
M32 = 0xFFFFFFFF
M64 = 0xFFFFFFFFFFFFFFFF


def s32(v):
    v &= M32
    return v - (1 << 32) if v & 0x80000000 else v


def s64(v):
    v &= M64
    return v - (1 << 64) if v & (1 << 63) else v


def java_hashcode(s):
    """java.lang.String.hashCode() (entero con signo de 32 bits)."""
    raw = s.encode("utf-16-be", errors="surrogatepass")
    h = 0
    for i in range(0, len(raw), 2):
        h = (h * 31 + int.from_bytes(raw[i:i + 2], "big")) & M32
    return s32(h)


def kotlin_trim(text):
    """pc.g.B0: Character.isWhitespace(char) || Character.isSpaceChar(char)."""
    def whitespace(ch):
        return ch in "\t\n\v\f\r\x1c\x1d\x1e\x1f" or unicodedata.category(ch) in {"Zs", "Zl", "Zp"}
    start, end = 0, len(text)
    while start < end and whitespace(text[start]):
        start += 1
    while start < end and whitespace(text[end - 1]):
        end -= 1
    return text[start:end]


def java_digit(ch):
    """Character.isDigit(char): dígitos decimales del plano básico Unicode."""
    return ord(ch) <= 0xFFFF and ch.isdecimal()


def to_int_or_null(text):
    """Kotlin String.toIntOrNull (decimal, signo opcional)."""
    t = text
    if not t:
        return None
    body = t[1:] if t[0] in "+-" else t
    if not body:
        return None
    negative = t[0] == "-"
    limit = 1 << 31 if negative else (1 << 31) - 1
    value = 0
    for ch in body:
        if not java_digit(ch):
            return None
        value = value * 10 + int(ch)
        if value > limit:
            return None
    return -value if negative else value


class KotlinXorWow:
    """kotlin.random.XorWowRandom sembrado, como jd.l.a(long) (jd/l.java:50-67)
    y las rutinas de kc/d.java (c: nextInt(a,b), e: nextLong(a,b)) y kc/e.java.
    """

    def __init__(self, seed):
        seed = s64(seed)
        i = s32(seed)
        i10 = s32(seed >> 32)
        self.c, self.d, self.e, self.f = i & M32, i10 & M32, 0, 0
        self.r = (~i) & M32
        self.s = ((i << 10) ^ ((i10 & M32) >> 4)) & M32
        if (i10 | i | ~i) == 0:
            raise ValueError("estado inicial nulo")
        for _ in range(64):
            self.next_int_u()

    def next_int_u(self):  # kc/e.java:31-44, devuelve sin signo
        t = self.c ^ (self.c >> 2)
        self.c, self.d, self.e, self.f = self.d, self.e, self.f, self.r
        r = ((t ^ ((t << 1) & M32)) ^ self.f ^ ((self.f << 4) & M32)) & M32
        self.r = r
        self.s = (self.s + 362437) & M32
        return (r + self.s) & M32

    def next_bits(self, n):  # kc/e.java:26
        word = self.next_int_u()
        return 0 if n == 0 else word >> (32 - n)

    def next_int(self, lo, hi):  # kc/d.java:24-48 (hi exclusivo)
        if hi <= lo:
            raise ValueError("rango vacío")
        n = hi - lo
        if n & (n - 1) == 0:
            return lo + self.next_bits(n.bit_length() - 1)
        while True:
            b = self.next_int_u() >> 1
            v = b % n
            if (n - 1) + (b - v) < (1 << 31):
                return lo + v

    def next_long_u(self):  # kc/d.java:52 (d), con signo
        return s64((s32(self.next_int_u()) << 32) + s32(self.next_int_u()))

    def next_long(self, lo, hi):  # kc/d.java:56-96 (hi exclusivo)
        if hi <= lo:
            raise ValueError("rango vacío")
        n = hi - lo
        if n & (n - 1) == 0:
            low, high = n & M32, (n >> 32) & M32
            if low != 0:
                r = self.next_bits(low.bit_length() - 1)
            elif high == 1:
                r = self.next_int_u()
            else:
                r = (self.next_bits(high.bit_length() - 1) << 32) + self.next_int_u()
            return lo + r
        while True:
            b = (self.next_long_u() & M64) >> 1
            v = b % n
            if (n - 1) + (b - v) < (1 << 63):
                return lo + v


# --------------------------------------------------------------------------
# Luhn (aparece en dos sitios: generación v/n.java y checker e1.java)
# --------------------------------------------------------------------------
def luhn_check_digit(prefix):
    """Dígito de control Luhn para ``prefix`` (n.java:226-240). Duplica desde
    el dígito más a la derecha del prefijo; resultado ``(10 - suma%10) % 10``."""
    total, dbl = 0, True
    for ch in reversed(prefix):
        # n.java clamps char-'0', even for non-ASCII decimal characters.
        d = min(9, max(0, ord(ch) - ord("0")))
        if dbl:
            d *= 2
            if d > 9:
                d -= 9
        total += d
        dbl = not dbl
    return (10 - total % 10) % 10


def luhn_valid(number):
    """Validación Luhn estándar sobre el número completo (e1.java:560-571)."""
    total, dbl = 0, False
    for ch in reversed(number):
        d = ord(ch) - 48
        if dbl:
            d *= 2
            if d > 9:
                d -= 9
        total += d
        dbl = not dbl
    return total % 10 == 0


# --------------------------------------------------------------------------
# Marcas y generador de tarjetas
# --------------------------------------------------------------------------
# n3/a.java: (longitud, longitud CVV). Constantes recuperadas con el modo
# --fallback de jadx (el modo normal perdió los argumentos del enum).
BRANDS = {
    "AMEX": (15, 4), "VISA": (16, 3), "MASTERCARD": (16, 3),
    "DISCOVER": (16, 3), "JCB": (16, 3), "DINERS": (14, 3),
    "UNIONPAY": (16, 3), "UNKNOWN": (16, 3),
}


def brand_from_bin(bin_text):
    """Marca según los dígitos del BIN (jd/l.java:189-267). Quirk fiel: solo
    cuenta dígitos; las 'x' se descartan antes de decidir la marca."""
    digits = "".join(c for c in bin_text.lower() if java_digit(c))
    if len(digits) < 2:
        return "UNKNOWN"
    p2, p3, p4 = digits[:2], digits[:3], digits[:4]

    def inr(txt, a, b):
        v = to_int_or_null(txt)
        return v is not None and a <= v <= b

    if inr(p4, 3528, 3589):
        return "JCB"
    if inr(p4, 3337, 3349):
        return "DISCOVER"
    if p2 in ("33", "34", "37"):
        return "AMEX"
    if digits[0] == "4":
        return "VISA"
    if inr(p2, 51, 55) or inr(p4, 2221, 2720):
        return "MASTERCARD"
    if digits.startswith("6011") or p2 == "65" or inr(p3, 644, 649):
        return "DISCOVER"
    if p2 in ("36", "38") or inr(p3, 300, 305):
        return "DINERS"
    return "UNIONPAY" if p2 == "62" else "UNKNOWN"


def sanitize_bin(text):
    """h3.v.b0 (v.java:52-62): minúsculas, conserva solo dígitos y 'x'."""
    return "".join(c for c in text.lower() if java_digit(c) or c == "x")


def generate_cards(bin_text, qty, month="", year="", cvv="", rng=random):
    """Réplica de n.java case 5 (líneas 128-330). ``month``/``year`` vacíos =
    'Random' del spinner. Devuelve lista ``PAN|MM|AAAA|CVV``.

    - Longitud del PAN y del CVV según la marca (BRANDS).
    - Cada posición del BIN: dígito se mantiene, 'x' (o falta) = aleatorio.
    - Último dígito: Luhn. Prefijo más largo que len-1 se trunca.
    - Año aleatorio 2026-2040; mes aleatorio 01-12 (rangos fijos en la app).
    """
    if qty <= 0:
        raise ValueError("cantidad inválida (la app muestra error_invalid_quantity)")
    clean = sanitize_bin(bin_text)
    length, cvv_len = BRANDS[brand_from_bin(clean)]
    out = []
    for _ in range(qty):
        prefix = "".join(
            clean[i] if i < len(clean) and java_digit(clean[i]) else str(rng.randrange(10))
            for i in range(length - 1))
        pan = prefix + str(luhn_check_digit(prefix))
        if month and year:
            tail = "|%s|%s" % (month, year)
        elif month:
            tail = "|%s|%d" % (month, rng.randrange(2026, 2041))
        elif year:
            tail = "|%02d|%s" % (rng.randrange(1, 13), year)
        else:
            tail = "|%02d|%d" % (rng.randrange(1, 13), rng.randrange(2026, 2041))
        c = "|" + cvv if cvv else "|" + "".join(str(rng.randrange(10)) for _ in range(cvv_len))
        out.append(pan + tail + c)
    return out


# --------------------------------------------------------------------------
# Checker offline (h3.e1)
# --------------------------------------------------------------------------
def checker_brand(pan):
    """Marca del checker, confirmada en DEX h3/e1.h0 (0x543700..0x543950).
    Solo importa si es None (=> "ERROR"). Reglas: AMEX 15 dígitos 34/37; VISA
    empieza por 4 y 13-16 dígitos; 16 dígitos: MC 51-55/2221-2720, DISCOVER
    6011/65/644-649/622126-622925, JCB 3528-3589; DINERS 14
    dígitos 36/38/300-305."""
    n = len(pan)

    def pre(k):
        return to_int_or_null(pan[:k])

    if n == 15 and pan[:2] in ("34", "37"):
        return "AMEX"
    if pan.startswith("4") and 13 <= n <= 16:
        return "VISA"
    if n == 16:
        if pre(2) is not None and 51 <= pre(2) <= 55:
            return "MASTERCARD"
        if pre(4) is not None and 2221 <= pre(4) <= 2720:
            return "MASTERCARD"
        if (pan.startswith("6011") or pan.startswith("65")
                or (pre(3) is not None and 644 <= pre(3) <= 649)
                or (pre(6) is not None and 622126 <= pre(6) <= 622925)):
            return "DISCOVER"
        if pre(4) is not None and 3528 <= pre(4) <= 3589:
            return "JCB"
    if n == 14 and (pan[:2] in ("36", "38") or (pre(3) is not None and 300 <= pre(3) <= 305)):
        return "DINERS"
    return None


def is_expired(month, year, today):
    """e1.o0 (e1.java:612-632). True = vencida o NO parseable.
    ``today`` = (año, mes). No valida rango de mes (13+ nunca vence en el año)."""
    m, y = to_int_or_null(month), to_int_or_null(year)
    if m is None or y is None:
        return True
    ty, tm = today
    if y != ty:
        return y < ty
    return m < tm


def classify_card(line, bin_ok, premium, live_pct, today, rng=random):
    """e1.h0 (e1.java:334-600). ``line`` = ``PAN|MM|AAAA|CVV``.

    Orden: != 4 campos -> ERROR; marca desconocida -> ERROR; <13 dígitos ->
    DIED; Luhn inválido o vencida -> DIED; ``bin_ok`` False -> ERROR;
    después SOLO una tirada aleatoria: LIVE si randint(0..99) < pct, con
    pct = live_pct del gate (premium; 10 si no hay gate) o 5 (no premium).
    El CVV (campo 4) nunca se usa. No hay validación bancaria."""
    parts = kotlin_trim(line).split("|")
    if len(parts) != 4:
        return "ERROR"
    pan = "".join(c for c in parts[0] if java_digit(c))
    if checker_brand(pan) is None:
        return "ERROR"
    if len(pan) < 13:
        return "DIED"
    if not luhn_valid(pan) or is_expired(parts[1], parts[2], today):
        return "DIED"
    if not bin_ok:
        return "ERROR"
    pct = (live_pct if live_pct is not None else 10) if premium else 5
    return "LIVE" if rng.randrange(100) < pct else "DIED"


def gate_config(name):
    """e1.i0 (e1.java:602-610), PRNG kotlin exacto sembrado con
    ``name.hashCode()``: (livePct 1..10, vidaMin, vidaMax) en ms."""
    if not name or not kotlin_trim(name):
        return None
    r = KotlinXorWow(java_hashcode(name))
    pct = r.next_int(1, 11)
    vmin = r.next_long(1_800_000, 21_600_000)
    vmax = r.next_long(21_600_000, 172_800_000) + vmin
    return {"nombre": name, "livePct": pct, "vidaMinMs": vmin, "vidaMaxMs": vmax}


def live_still_alive(card, stored_ts_ms, now_ms, gate=None):
    """Envejecimiento de una tarjeta LIVE en caché (h3.j0 / m0.java
    ~76-96, j0.java líneas 78-98 del fichero): semilla ``hash(card)*31+ts``,
    límite = nextLong(min,max); si now-ts > límite => DIED. Sin gate (o
    GRATIS): rango 30 min - 24 h. ``stored_ts_ms`` lo daba el servidor
    (get_status.php), que aquí NO existe: es un parámetro del usuario."""
    lo, hi = (gate["vidaMinMs"], gate["vidaMaxMs"]) if gate else (1_800_000, 86_400_000)
    seed = s64(java_hashcode(card) * 31 + stored_ts_ms)
    if hi <= lo:
        hi = lo + 1
    return not (s64(now_ms - stored_ts_ms) > KotlinXorWow(seed).next_long(lo, hi))


# --------------------------------------------------------------------------
# IBAN (h3.c0)
# --------------------------------------------------------------------------
def _letters_to_digits(s):
    """Letra -> ord(ch)-55 (A=10..Z=35); dígito se conserva (c0.java:176)."""
    return "".join(c if java_digit(c) else str(ord(c.upper()) - 55) for c in s)


def iban_check_digits(country, bban):
    """c0.b0 (c0.java:50-56): ``98 - (bban+país_numérico+'00') mod 97``,
    relleno a 2 dígitos. Es el ISO 13616 estándar."""
    n = int(_letters_to_digits(bban) + _letters_to_digits(country) + "00")
    return "%02d" % (98 - n % 97)


def iban_mod97_ok(iban):
    """Comprobación ISO 13616 (utilidad didáctica, NO existe en el APK)."""
    r = iban[4:] + iban[:4]
    return int(_letters_to_digits(r)) % 97 == 1


def _es_dc(s):
    """c0.c0 (c0.java:58-68): dígito de control CCC español."""
    w = (1, 2, 4, 8, 5, 10, 9, 7, 3, 6)
    t = sum(w[i] * int(c) for i, c in enumerate(s)) % 11
    v = 11 - t if t else 0
    return "1" if v == 10 else str(v)


def iban_es(rng=random):
    """España (c0.java:299-307). Banco fijo "0049", oficina 1000-9999,
    cuenta = 0..99999999 rellena a 10. DC1 sobre "00"+banco+oficina, DC2
    sobre la cuenta. Nota: el 1000 inferior viene de la constante
    zzbbs.zzq.zzf (=1000)."""
    bank, office = "0049", "%04d" % rng.randrange(1000, 10000)
    acct = "%010d" % rng.randrange(0, 100_000_000)
    bban = bank + office + _es_dc("00" + bank + office) + _es_dc(acct) + acct
    return "ES" + iban_check_digits("ES", bban) + bban


def iban_de(rng=random):
    """Alemania (c0.java:246-264). BLZ fijo "10050000"; cuenta "5"+9 dígitos
    repetida hasta que el Luhn con pesos 2,1,2,1... cuadre (mod 10 == 0)."""
    while True:
        acct = "5%09d" % rng.randrange(0, 1_000_000_000)
        total = 0
        for i, c in enumerate(acct):
            v = (2 if i % 2 == 0 else 1) * int(c)
            total += v - 9 if v > 9 else v
        if total % 10 == 0:
            break
    bban = "10050000" + acct
    return "DE" + iban_check_digits("DE", bban) + bban


def iban_it(rng=random):
    """Italia (c0.java:157-181). Cuenta 12 dígitos aleatoria; CIN = letra
    ``chr(65 + suma % 26)`` con la tabla de pesos impares sobre
    "00542803280"+cuenta (se aplica el mismo valor a dígitos y letras)."""
    acct = "%012d" % rng.randrange(0, 1_000_000_000_000)
    s = "00542803280" + acct
    w = [1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 1, 0, 5, 7, 9, 13, 15, 17, 19, 21, 1, 0, 5]
    total = sum((int(c) if java_digit(c) else ord(c.upper()) - 64) * w[i]
                for i, c in enumerate(s))
    bban = chr(65 + total % 26) + "0542803280" + acct
    return "IT" + iban_check_digits("IT", bban) + bban


def iban_fr(rng=random):
    """Francia (c0.java:189-243). Banco "30003"+sucursal "00070"; cuenta de
    10 dígitos + 1 letra A-Z repetida hasta que la suma de valores (dígito o
    letra-55) sea múltiplo de 10; clave RIB FIJA "92" (no es la real: el
    IBAN cumple mod 97 pero la clave RIB no se calcula)."""
    while True:
        acct = "".join(str(rng.randrange(10)) for _ in range(10)) + chr(rng.randrange(65, 91))
        if sum(int(_letters_to_digits(c)) for c in acct) % 10 == 0:
            break
    bban = "30003" + "00070" + acct + "92"
    return "FR" + iban_check_digits("FR", bban) + bban


IBAN_GENERATORS = {"ES": iban_es, "DE": iban_de, "IT": iban_it, "FR": iban_fr}


# --------------------------------------------------------------------------
# CPF, contraseñas, correos con puntos
# --------------------------------------------------------------------------
def _cpf_digit(digits, n):
    """h3.x.b0 (x.java:171-182): suma ponderada (n-i)*d[i] para i<n-1,
    ``(suma*10) % 11``; 10 -> 0."""
    t = sum((n - i) * digits[i] for i in range(n - 1))
    r = (t * 10) % 11
    return 0 if r in (10, 11) else r


def generate_cpf(rng=random):
    """Genera CPF brasileño sintético ``ddd.ddd.ddd-dd`` (x.java:205-229)."""
    d = [rng.randrange(10) for _ in range(9)]
    d.append(_cpf_digit(d, 10))
    d.append(_cpf_digit(d, 11))
    s = "".join(map(str, d))
    return "%s.%s.%s-%s" % (s[:3], s[3:6], s[6:9], s[9:])


def cpf_valid(cpf):
    """Re-verificación que hace la app tras generar (x.java:230-240)."""
    s = cpf.replace(".", "").replace("-", "")
    if len(s) != 11:
        return False
    d = [int(c) for c in s]
    return _cpf_digit(d, 10) == d[9] and _cpf_digit(d, 11) == d[10]


PASSWORD_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>/?"


def generate_password(length_text="12", rng=random):
    """k.java:110-120. Longitud no numérica -> 12; <=0 -> cadena vacía.
    Alfabeto de 89 caracteres, ``nextInt(89)`` por posición. Usa el PRNG no
    criptográfico de kotlin (la app NO usa SecureRandom): didáctico, no
    apto para contraseñas reales."""
    n = to_int_or_null(length_text)
    n = 12 if n is None else n
    return "".join(PASSWORD_CHARS[rng.randrange(len(PASSWORD_CHARS))] for _ in range(max(n, 0)))


def dot_variants(s):
    """i1.b0 (i1.java:35-52): variantes con puntos insertados, en el mismo
    orden que la app (primero la original, luego por posición del primer
    punto). Generador perezoso: el total es 2^(len-1)."""
    yield s
    if len(s) == 1:
        return
    for i in range(1, len(s)):
        for v in dot_variants(s[i:]):
            yield s[:i] + "." + v


def mail_variants(local, domain, count=5):
    """n.java case 8 (394-440): primeras ``count`` variantes + '@' + dominio."""
    return ["%s@%s" % (v, domain) for v in itertools.islice(dot_variants(local), max(count, 0))]


# --------------------------------------------------------------------------
# CLI
# --------------------------------------------------------------------------
def _today(text):
    y, m = text.split("-")[:2]
    return int(y), int(m)


def _demo():
    """Demostración determinista (datos sintéticos, sin red)."""
    rng = random.Random(2026)
    today = (2026, 10)
    print("== Generador (BIN sintético 4111xxxxxxxxxxxx, seed 2026) ==")
    cards = generate_cards("4111xxxxxxxxxxxx", 3, "12", "2030", "", rng)
    for c in cards:
        print(c, "| Luhn:", luhn_valid(c.split("|")[0]))
    print("AMEX 3782xxxxxxxxxxx:", generate_cards("3782xxxxxxxxxxx", 1, "", "", "", rng)[0])
    print("== Checker offline (hoy=2026-10, gate=PREMIUM) ==")
    gate = gate_config("PREMIUM")
    print("gate_config PREMIUM:", gate)
    sample = ["4111111111111111|12|2030|123",   # Luhn ok, vigente
              "4111111111111112|12|2030|123",   # Luhn mal
              "4111111111111111|01|2020|123",   # vencida
              "1234567890123456|12|2030|123",   # marca desconocida
              "4111111111111111|12|2030"]       # 3 campos
    for line in sample:
        print("%-34s -> %s" % (line, classify_card(line, True, True, gate["livePct"], today, rng)))
    n = 10000
    live = sum(classify_card(sample[0], True, False, None, today, rng) == "LIVE" for _ in range(n))
    print("tarjeta válida x%d, no premium: LIVE=%d (%.1f%%, esperado ~5%%): es un dado" % (n, live, live * 100 / n))
    print("== IBAN ==")
    for cc, fn in IBAN_GENERATORS.items():
        i = fn(rng)
        print(cc, i, "mod97:", iban_mod97_ok(i))
    print("== CPF ==", end=" ")
    c = generate_cpf(rng)
    print(c, cpf_valid(c))
    print("== Password(16) ==", generate_password("16", rng))
    print("== Mail puntos ==", mail_variants("abcd", "gmail.com", 5))
    print("== Envejecimiento LIVE (ts=0) ==")
    for hrs in (0.1, 1, 12, 30):
        print(" %5.1f h -> %s" % (hrs, "LIVE" if live_still_alive(
            "4111111111111111", 0, int(hrs * 3600_000), gate) else "DIED"))


def main(argv=None):
    argv = sys.argv[1:] if argv is None else list(argv)
    if argv and argv[0] == "auth":
        from auth import main as auth_main
        return auth_main(argv[1:])
    if argv and argv[0] == "data":
        from data_tools import main as data_main
        return data_main(argv[1:])
    if argv and argv[0] == "firebase":
        from firebase_config import main as firebase_main
        return firebase_main(argv[1:])
    if argv and argv[0] == "checker":
        from checker import main as checker_main
        return checker_main(argv[1:])
    if argv and argv[0] in {"terminal", "remote", "storage"}:
        from terminal import main as terminal_main
        return terminal_main(argv[1:] if argv[0] == "terminal" else argv)
    ap = argparse.ArgumentParser(
        description="Port educativo de la lógica local de Namso Gen (APK "
                    "app.namso_gen.spacehowen). Generadores sintéticos; remote usa red. "
                    "LIVE/DIED del checker es una simulación, no validación bancaria.")
    ap.add_argument("--seed", type=int, help="semilla del PRNG de Python (reproducible; no replica kotlin.random)")
    sub = ap.add_subparsers(dest="cmd", required=True)

    p = sub.add_parser("gen-card", help="genera PAN|MM|AAAA|CVV con Luhn (n.java case 5)")
    p.add_argument("bin", help="BIN, 'x' = dígito aleatorio (ej. 4111xxxxxxxxxxxx)")
    p.add_argument("-n", "--qty", type=int, default=5)
    p.add_argument("--month", default="", help="MM; vacío = aleatorio")
    p.add_argument("--year", default="", help="AAAA; vacío = aleatorio 2026-2040")
    p.add_argument("--cvv", default="", help="CVV fijo; vacío = aleatorio")

    p = sub.add_parser("check", help="clasificación offline LIVE/DIED/ERROR (e1.h0)")
    p.add_argument("card", nargs="+", help="PAN|MM|AAAA|CVV")
    p.add_argument("--premium", action="store_true")
    p.add_argument("--gate", help="nombre de gate (premium) para livePct sembrado")
    p.add_argument("--no-bin", action="store_true", help="simula fallo de la consulta BIN => ERROR")
    p.add_argument("--today", default=None, help="AAAA-MM de referencia (por defecto hoy)")

    p = sub.add_parser("gate", help="configuración de gate sembrada (e1.i0)")
    p.add_argument("name")

    p = sub.add_parser("iban", help="IBAN sintético ES/DE/IT/FR (c0)")
    p.add_argument("country", choices=sorted(IBAN_GENERATORS))
    p.add_argument("-n", type=int, default=1)

    p = sub.add_parser("cpf", help="CPF sintético (x)")
    p.add_argument("-n", type=int, default=1)

    p = sub.add_parser("password", help="contraseña (k, case 1)")
    p.add_argument("length", nargs="?", default="12")

    p = sub.add_parser("mail-dots", help="variantes de correo con puntos (i1.b0)")
    p.add_argument("local")
    p.add_argument("--domain", default="gmail.com")
    p.add_argument("-n", "--count", type=int, default=5)

    sub.add_parser("demo", help="demostración determinista (seed 2026, sin red)")
    sub.add_parser("auth", help="sesión propia: login, status, refresh, logout; auth --help")
    sub.add_parser("data", help="correo local y selección de dataset: data --help")
    sub.add_parser("firebase", help="Remote Config real: firebase fetch o firebase gates")
    sub.add_parser("checker", help="flujo de gates recuperado: checker --help")
    sub.add_parser("remote", help="servicios HTTP: remote list o remote call --help")
    sub.add_parser("storage", help="persistencia: storage --help")
    sub.add_parser("terminal", help="CLI unificada y menú interactivo: terminal --help")

    a = ap.parse_args(argv)
    rng = random.Random(a.seed) if a.seed is not None else random.Random()
    if a.cmd == "gen-card":
        print("\n".join(generate_cards(a.bin, a.qty, a.month, a.year, a.cvv, rng)))
    elif a.cmd == "check":
        import datetime
        t = _today(a.today) if a.today else (datetime.date.today().year, datetime.date.today().month)
        g = gate_config(a.gate) if a.gate else None
        for c in a.card:
            print(c, "->", classify_card(c, not a.no_bin, a.premium or bool(g),
                                         g["livePct"] if g else None, t, rng))
    elif a.cmd == "gate":
        print(gate_config(a.name))
    elif a.cmd == "iban":
        for _ in range(a.n):
            print(IBAN_GENERATORS[a.country](rng))
    elif a.cmd == "cpf":
        for _ in range(a.n):
            print(generate_cpf(rng))
    elif a.cmd == "password":
        print(generate_password(a.length, rng))
    elif a.cmd == "mail-dots":
        print("\n".join(mail_variants(a.local, a.domain, a.count)))
    elif a.cmd == "demo":
        _demo()
    return 0


if __name__ == "__main__":
    sys.exit(main())

package com.google.android.recaptcha.internal;

import da.v;
import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
class zzfx extends zzfy {
    final zzft zzb;
    final Character zzc;

    public zzfx(zzft zzftVar, Character ch) {
        this.zzb = zzftVar;
        if (ch != null && zzftVar.zzd('=')) {
            throw new IllegalArgumentException(zzfi.zza("Padding character %s was already in alphabet", ch));
        }
        this.zzc = ch;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfx) {
            zzfx zzfxVar = (zzfx) obj;
            if (this.zzb.equals(zzfxVar.zzb)) {
                Character ch = this.zzc;
                Character ch2 = zzfxVar.zzc;
                if (ch == ch2) {
                    return true;
                }
                if (ch != null && ch.equals(ch2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Character ch = this.zzc;
        return (ch == null ? 0 : ch.hashCode()) ^ this.zzb.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.zzb);
        if (8 % this.zzb.zzb != 0) {
            if (this.zzc == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.zzc);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    public int zza(byte[] bArr, CharSequence charSequence) throws zzfw {
        zzft zzftVar;
        CharSequence charSequenceZze = zze(charSequence);
        if (!this.zzb.zzc(charSequenceZze.length())) {
            throw new zzfw(v.f(charSequenceZze.length(), "Invalid input length "));
        }
        int i = 0;
        int i10 = 0;
        while (i < charSequenceZze.length()) {
            long jZzb = 0;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                zzftVar = this.zzb;
                if (i11 >= zzftVar.zzc) {
                    break;
                }
                jZzb <<= zzftVar.zzb;
                if (i + i11 < charSequenceZze.length()) {
                    jZzb |= (long) this.zzb.zzb(charSequenceZze.charAt(i12 + i));
                    i12++;
                }
                i11++;
            }
            int i13 = zzftVar.zzd;
            int i14 = i12 * zzftVar.zzb;
            int i15 = (i13 - 1) * 8;
            while (i15 >= (i13 * 8) - i14) {
                bArr[i10] = (byte) ((jZzb >>> i15) & 255);
                i15 -= 8;
                i10++;
            }
            i += this.zzb.zzc;
        }
        return i10;
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    public void zzb(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        zzff.zzd(0, i10, bArr.length);
        while (i11 < i10) {
            zzf(appendable, bArr, i11, Math.min(this.zzb.zzd, i10 - i11));
            i11 += this.zzb.zzd;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    public final int zzc(int i) {
        return (int) (((((long) this.zzb.zzb) * ((long) i)) + 7) / 8);
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    public final int zzd(int i) {
        zzft zzftVar = this.zzb;
        return zzftVar.zzc * zzga.zza(i, zzftVar.zzd, RoundingMode.CEILING);
    }

    @Override // com.google.android.recaptcha.internal.zzfy
    public final CharSequence zze(CharSequence charSequence) {
        charSequence.getClass();
        if (this.zzc == null) {
            return charSequence;
        }
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                break;
            }
        } while (charSequence.charAt(length) == '=');
        return charSequence.subSequence(0, length + 1);
    }

    public final void zzf(Appendable appendable, byte[] bArr, int i, int i10) throws IOException {
        zzff.zzd(i, i + i10, bArr.length);
        int i11 = 0;
        zzff.zza(i10 <= this.zzb.zzd);
        long j4 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            j4 = (j4 | ((long) (bArr[i + i12] & 255))) << 8;
        }
        int i13 = (i10 + 1) * 8;
        zzft zzftVar = this.zzb;
        while (i11 < i10 * 8) {
            long j10 = j4 >>> ((i13 - zzftVar.zzb) - i11);
            zzft zzftVar2 = this.zzb;
            appendable.append(zzftVar2.zza(((int) j10) & zzftVar2.zza));
            i11 += this.zzb.zzb;
        }
        if (this.zzc != null) {
            while (i11 < this.zzb.zzd * 8) {
                this.zzc.getClass();
                appendable.append('=');
                i11 += this.zzb.zzb;
            }
        }
    }

    public zzfx(String str, String str2, Character ch) {
        this(new zzft(str, str2.toCharArray()), ch);
    }
}

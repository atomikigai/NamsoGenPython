package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f5455d = {"+HH", "+HHmm", "+HH:mm", "+HHMM", "+HH:MM", "+HHMMss", "+HH:MM:ss", "+HHMMSS", "+HH:MM:SS", "+HHmmss", "+HH:mm:ss", "+H", "+Hmm", "+H:mm", "+HMM", "+H:MM", "+HMMss", "+H:MM:ss", "+HMMSS", "+H:MM:SS", "+Hmmss", "+H:mm:ss"};
    public static final j e = new j("+HH:MM:ss", "Z");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5458c;

    static {
        new j("+HH:MM:ss", "0");
    }

    public j(String str, String str2) {
        for (int i = 0; i < 22; i++) {
            if (f5455d[i].equals(str)) {
                this.f5457b = i;
                this.f5458c = i % 11;
                this.f5456a = str2;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid zone offset pattern: ".concat(str));
    }

    @Override // j$.time.format.f
    public final boolean u(p pVar, StringBuilder sb2) {
        Long lA = pVar.a(j$.time.temporal.a.OFFSET_SECONDS);
        boolean z4 = false;
        if (lA == null) {
            return false;
        }
        int intExact = Math.toIntExact(lA.longValue());
        String str = this.f5456a;
        if (intExact == 0) {
            sb2.append(str);
            return true;
        }
        int iAbs = Math.abs((intExact / 3600) % 100);
        int iAbs2 = Math.abs((intExact / 60) % 60);
        int iAbs3 = Math.abs(intExact % 60);
        int length = sb2.length();
        sb2.append(intExact < 0 ? "-" : "+");
        if (this.f5457b < 11 || iAbs >= 10) {
            a(false, iAbs, sb2);
        } else {
            sb2.append((char) (iAbs + 48));
        }
        int i = this.f5458c;
        if ((i >= 3 && i <= 8) || ((i >= 9 && iAbs3 > 0) || (i >= 1 && iAbs2 > 0))) {
            a(i > 0 && i % 2 == 0, iAbs2, sb2);
            iAbs += iAbs2;
            if (i == 7 || i == 8 || (i >= 5 && iAbs3 > 0)) {
                if (i > 0 && i % 2 == 0) {
                    z4 = true;
                }
                a(z4, iAbs3, sb2);
                iAbs += iAbs3;
            }
        }
        if (iAbs == 0) {
            sb2.setLength(length);
            sb2.append(str);
        }
        return true;
    }

    public static void a(boolean z4, int i, StringBuilder sb2) {
        sb2.append(z4 ? ":" : "");
        sb2.append((char) ((i / 10) + 48));
        sb2.append((char) ((i % 10) + 48));
    }

    public final String toString() {
        String strReplace = this.f5456a.replace("'", "''");
        return "Offset(" + f5455d[this.f5457b] + ",'" + strReplace + "')";
    }
}

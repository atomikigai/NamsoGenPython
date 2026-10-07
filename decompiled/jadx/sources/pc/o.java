package pc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class o extends n {
    public static boolean Z(String str, String str2) {
        jc.i.e(str, "<this>");
        jc.i.e(str2, "suffix");
        return str.endsWith(str2);
    }

    public static boolean a0(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equalsIgnoreCase(str2);
    }

    public static final boolean b0(int i, int i10, int i11, String str, String str2, boolean z4) {
        jc.i.e(str, "<this>");
        jc.i.e(str2, "other");
        return !z4 ? str.regionMatches(i, str2, i10, i11) : str.regionMatches(z4, i, str2, i10, i11);
    }

    public static String c0(String str, String str2, String str3) {
        jc.i.e(str, "<this>");
        int iI0 = g.i0(str, str2, 0, false);
        if (iI0 < 0) {
            return str;
        }
        int length = str2.length();
        int i = length >= 1 ? length : 1;
        int length2 = str3.length() + (str.length() - length);
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb2 = new StringBuilder(length2);
        int i10 = 0;
        do {
            sb2.append((CharSequence) str, i10, iI0);
            sb2.append(str3);
            i10 = iI0 + length;
            if (iI0 >= str.length()) {
                break;
            }
            iI0 = g.i0(str, str2, iI0 + i, false);
        } while (iI0 > 0);
        sb2.append((CharSequence) str, i10, str.length());
        String string = sb2.toString();
        jc.i.d(string, "toString(...)");
        return string;
    }

    public static boolean d0(String str, int i, String str2, boolean z4) {
        jc.i.e(str, "<this>");
        return !z4 ? str.startsWith(str2, i) : b0(i, 0, str2.length(), str, str2, z4);
    }

    public static boolean e0(String str, String str2, boolean z4) {
        jc.i.e(str, "<this>");
        jc.i.e(str2, "prefix");
        return !z4 ? str.startsWith(str2) : b0(0, 0, str2.length(), str, str2, z4);
    }
}

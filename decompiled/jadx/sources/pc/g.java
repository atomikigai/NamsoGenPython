package pc;

import da.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends o {
    public static String A0(int i, String str) {
        jc.i.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(q1.a.j(i, "Requested character count ", " is less than zero.").toString());
        }
        int length = str.length();
        if (i > length) {
            i = length;
        }
        String strSubstring = str.substring(0, i);
        jc.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static CharSequence B0(CharSequence charSequence) {
        jc.i.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i = 0;
        boolean z4 = false;
        while (i <= length) {
            boolean zO = android.support.v4.media.session.a.o(charSequence.charAt(!z4 ? i : length));
            if (z4) {
                if (!zO) {
                    break;
                }
                length--;
            } else if (zO) {
                i++;
            } else {
                z4 = true;
            }
        }
        return charSequence.subSequence(i, length + 1);
    }

    public static boolean f0(CharSequence charSequence, String str, boolean z4) {
        jc.i.e(charSequence, "<this>");
        return k0(charSequence, str, 0, z4, 2) >= 0;
    }

    public static boolean g0(CharSequence charSequence, char c10) {
        jc.i.e(charSequence, "<this>");
        return j0(charSequence, c10, 0, 2) >= 0;
    }

    public static final int h0(CharSequence charSequence) {
        jc.i.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int i0(CharSequence charSequence, String str, int i, boolean z4) {
        jc.i.e(charSequence, "<this>");
        jc.i.e(str, "string");
        if (!z4 && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        mc.e eVar = new mc.e(i, length, 1);
        boolean z10 = charSequence instanceof String;
        int i10 = eVar.f7108c;
        int i11 = eVar.f7107b;
        int i12 = eVar.f7106a;
        if (!z10 || !(str instanceof String)) {
            boolean z11 = z4;
            if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
                return -1;
            }
            while (true) {
                CharSequence charSequence2 = charSequence;
                boolean z12 = z11;
                z11 = z12;
                if (q0(str, 0, charSequence2, i12, str.length(), z12)) {
                    return i12;
                }
                if (i12 == i11) {
                    return -1;
                }
                i12 += i10;
                charSequence = charSequence2;
            }
        } else {
            if ((i10 <= 0 || i12 > i11) && (i10 >= 0 || i11 > i12)) {
                return -1;
            }
            int i13 = i12;
            while (true) {
                String str2 = str;
                boolean z13 = z4;
                if (o.b0(0, i13, str.length(), str2, (String) charSequence, z13)) {
                    return i13;
                }
                if (i13 == i11) {
                    return -1;
                }
                i13 += i10;
                str = str2;
                z4 = z13;
            }
        }
    }

    public static int j0(CharSequence charSequence, char c10, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        jc.i.e(charSequence, "<this>");
        return !(charSequence instanceof String) ? l0(charSequence, new char[]{c10}, i, false) : ((String) charSequence).indexOf(c10, i);
    }

    public static /* synthetic */ int k0(CharSequence charSequence, String str, int i, boolean z4, int i10) {
        if ((i10 & 2) != 0) {
            i = 0;
        }
        if ((i10 & 4) != 0) {
            z4 = false;
        }
        return i0(charSequence, str, i, z4);
    }

    public static final int l0(CharSequence charSequence, char[] cArr, int i, boolean z4) {
        jc.i.e(charSequence, "<this>");
        if (!z4 && cArr.length == 1 && (charSequence instanceof String)) {
            int length = cArr.length;
            if (length == 0) {
                throw new NoSuchElementException("Array is empty.");
            }
            if (length != 1) {
                throw new IllegalArgumentException("Array has more than one element.");
            }
            return ((String) charSequence).indexOf(cArr[0], i);
        }
        if (i < 0) {
            i = 0;
        }
        int iH0 = h0(charSequence);
        if (i > iH0) {
            return -1;
        }
        while (true) {
            char cCharAt = charSequence.charAt(i);
            for (char c10 : cArr) {
                if (android.support.v4.media.session.a.f(c10, cCharAt, z4)) {
                    return i;
                }
            }
            if (i == iH0) {
                return -1;
            }
            i++;
        }
    }

    public static boolean m0(CharSequence charSequence) {
        jc.i.e(charSequence, "<this>");
        for (int i = 0; i < charSequence.length(); i++) {
            if (!android.support.v4.media.session.a.o(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static int n0(String str, char c10, int i, int i10) {
        if ((i10 & 2) != 0) {
            i = h0(str);
        }
        jc.i.e(str, "<this>");
        return str.lastIndexOf(c10, i);
    }

    public static String o0(int i, String str) {
        CharSequence charSequenceSubSequence;
        jc.i.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(q1.a.j(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            sb2.append((CharSequence) str);
            int length = i - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append(' ');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static String p0(int i, String str) {
        CharSequence charSequenceSubSequence;
        jc.i.e(str, "<this>");
        if (i < 0) {
            throw new IllegalArgumentException(q1.a.j(i, "Desired length ", " is less than zero."));
        }
        if (i <= str.length()) {
            charSequenceSubSequence = str.subSequence(0, str.length());
        } else {
            StringBuilder sb2 = new StringBuilder(i);
            int length = i - str.length();
            int i10 = 1;
            if (1 <= length) {
                while (true) {
                    sb2.append('0');
                    if (i10 == length) {
                        break;
                    }
                    i10++;
                }
            }
            sb2.append((CharSequence) str);
            charSequenceSubSequence = sb2;
        }
        return charSequenceSubSequence.toString();
    }

    public static final boolean q0(CharSequence charSequence, int i, CharSequence charSequence2, int i10, int i11, boolean z4) {
        jc.i.e(charSequence, "<this>");
        jc.i.e(charSequence2, "other");
        if (i10 < 0 || i < 0 || i > charSequence.length() - i11 || i10 > charSequence2.length() - i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!android.support.v4.media.session.a.f(charSequence.charAt(i + i12), charSequence2.charAt(i10 + i12), z4)) {
                return false;
            }
        }
        return true;
    }

    public static String r0(String str, String str2) {
        if (!o.e0(str, str2, false)) {
            return str;
        }
        String strSubstring = str.substring(str2.length());
        jc.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String s0(String str, String str2) {
        if (!o.Z(str, str2)) {
            return str;
        }
        String strSubstring = str.substring(0, str.length() - str2.length());
        jc.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static final void t0(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(v.f(i, "Limit must be non-negative, but was ").toString());
        }
    }

    public static final List u0(CharSequence charSequence, String str, int i) {
        t0(i);
        int iI0 = i0(charSequence, str, 0, false);
        if (iI0 == -1 || i == 1) {
            return jd.d.D(charSequence.toString());
        }
        boolean z4 = i > 0;
        int i10 = 10;
        if (z4 && i <= 10) {
            i10 = i;
        }
        ArrayList arrayList = new ArrayList(i10);
        int length = 0;
        do {
            arrayList.add(charSequence.subSequence(length, iI0).toString());
            length = str.length() + iI0;
            if (z4 && arrayList.size() == i - 1) {
                break;
            }
            iI0 = i0(charSequence, str, length, false);
        } while (iI0 != -1);
        arrayList.add(charSequence.subSequence(length, charSequence.length()).toString());
        return arrayList;
    }

    public static List v0(CharSequence charSequence, char[] cArr, int i) {
        int i10 = (i & 4) != 0 ? 0 : 2;
        jc.i.e(charSequence, "<this>");
        if (cArr.length == 1) {
            return u0(charSequence, String.valueOf(cArr[0]), i10);
        }
        t0(i10);
        oc.i iVar = new oc.i(new c(charSequence, i10, new p(cArr, 0)), 0);
        ArrayList arrayList = new ArrayList(vb.k.U(iVar));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            mc.e eVar = (mc.e) bVar.next();
            jc.i.e(eVar, "range");
            arrayList.add(charSequence.subSequence(eVar.f7106a, eVar.f7107b + 1).toString());
        }
    }

    public static List w0(String str, String[] strArr) {
        jc.i.e(str, "<this>");
        if (strArr.length == 1) {
            String str2 = strArr[0];
            if (str2.length() != 0) {
                return u0(str, str2, 0);
            }
        }
        t0(0);
        oc.i iVar = new oc.i(new c(str, 0, new p(vb.h.H(strArr), 1)), 0);
        ArrayList arrayList = new ArrayList(vb.k.U(iVar));
        Iterator it = iVar.iterator();
        while (true) {
            b bVar = (b) it;
            if (!bVar.hasNext()) {
                return arrayList;
            }
            mc.e eVar = (mc.e) bVar.next();
            jc.i.e(eVar, "range");
            arrayList.add(str.subSequence(eVar.f7106a, eVar.f7107b + 1).toString());
        }
    }

    public static String x0(String str, String str2) {
        jc.i.e(str, "<this>");
        jc.i.e(str2, "delimiter");
        jc.i.e(str, "missingDelimiterValue");
        int iK0 = k0(str, str2, 0, false, 6);
        if (iK0 == -1) {
            return str;
        }
        String strSubstring = str.substring(str2.length() + iK0, str.length());
        jc.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String y0(String str, String str2) {
        int iN0 = n0(str, '.', 0, 6);
        if (iN0 == -1) {
            return str2;
        }
        String strSubstring = str.substring(iN0 + 1, str.length());
        jc.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static String z0(String str) {
        jc.i.e(str, "<this>");
        jc.i.e(str, "missingDelimiterValue");
        int iN0 = n0(str, ':', 0, 6);
        if (iN0 == -1) {
            return str;
        }
        String strSubstring = str.substring(0, iN0);
        jc.i.d(strSubstring, "substring(...)");
        return strSubstring;
    }
}

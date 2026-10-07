package bd;

import java.io.EOFException;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f1550a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f1551b = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f1552c = new b();

    public static final g a(b bVar, String str) {
        g gVar = new g(str);
        g.f1579d.put(str, gVar);
        return gVar;
    }

    public static String b(int i, int i10, int i11, String str, String str2) throws EOFException {
        int i12 = (i11 & 1) != 0 ? 0 : i;
        int length = (i11 & 2) != 0 ? str.length() : i10;
        boolean z4 = (i11 & 8) == 0;
        boolean z10 = (i11 & 16) == 0;
        boolean z11 = (i11 & 32) == 0;
        boolean z12 = (i11 & 64) == 0;
        jc.i.e(str, "<this>");
        int iCharCount = i12;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            int i13 = 128;
            int i14 = 32;
            if (iCodePointAt < 32 || iCodePointAt == 127 || ((iCodePointAt >= 128 && !z12) || pc.g.g0(str2, (char) iCodePointAt) || ((iCodePointAt == 37 && (!z4 || (z10 && !d(iCharCount, length, str)))) || (iCodePointAt == 43 && z11)))) {
                od.f fVar = new od.f();
                fVar.Z(i12, iCharCount, str);
                od.f fVar2 = null;
                while (iCharCount < length) {
                    int iCodePointAt2 = str.codePointAt(iCharCount);
                    if (!z4 || (iCodePointAt2 != 9 && iCodePointAt2 != 10 && iCodePointAt2 != 12 && iCodePointAt2 != 13)) {
                        if (iCodePointAt2 == 43 && z11) {
                            fVar.a0(z4 ? "+" : "%2B");
                        } else if (iCodePointAt2 < i14 || iCodePointAt2 == 127 || ((iCodePointAt2 >= i13 && !z12) || pc.g.g0(str2, (char) iCodePointAt2) || (iCodePointAt2 == 37 && (!z4 || (z10 && !d(iCharCount, length, str)))))) {
                            if (fVar2 == null) {
                                fVar2 = new od.f();
                            }
                            fVar2.b0(iCodePointAt2);
                            while (!fVar2.d()) {
                                byte b10 = fVar2.readByte();
                                fVar.V(37);
                                char[] cArr = o.f1625j;
                                fVar.V(cArr[((b10 & 255) >> 4) & 15]);
                                fVar.V(cArr[b10 & 15]);
                            }
                        } else {
                            fVar.b0(iCodePointAt2);
                        }
                    }
                    iCharCount += Character.charCount(iCodePointAt2);
                    i13 = 128;
                    i14 = 32;
                }
                return fVar.E(fVar.f7734b, pc.a.f7846a);
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        String strSubstring = str.substring(i12, length);
        jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static boolean d(int i, int i10, String str) {
        int i11 = i + 2;
        return i11 < i10 && str.charAt(i) == '%' && cd.b.q(str.charAt(i + 1)) != -1 && cd.b.q(str.charAt(i11)) != -1;
    }

    public static String e(int i, int i10, String str, int i11) {
        int i12;
        if ((i11 & 1) != 0) {
            i = 0;
        }
        if ((i11 & 2) != 0) {
            i10 = str.length();
        }
        boolean z4 = (i11 & 4) == 0;
        jc.i.e(str, "<this>");
        int iCharCount = i;
        while (iCharCount < i10) {
            char cCharAt = str.charAt(iCharCount);
            if (cCharAt == '%' || (cCharAt == '+' && z4)) {
                od.f fVar = new od.f();
                fVar.Z(i, iCharCount, str);
                while (iCharCount < i10) {
                    int iCodePointAt = str.codePointAt(iCharCount);
                    if (iCodePointAt == 37 && (i12 = iCharCount + 2) < i10) {
                        int iQ = cd.b.q(str.charAt(iCharCount + 1));
                        int iQ2 = cd.b.q(str.charAt(i12));
                        if (iQ == -1 || iQ2 == -1) {
                            fVar.b0(iCodePointAt);
                            iCharCount += Character.charCount(iCodePointAt);
                        } else {
                            fVar.V((iQ << 4) + iQ2);
                            iCharCount = Character.charCount(iCodePointAt) + i12;
                        }
                    } else if (iCodePointAt == 43 && z4) {
                        fVar.V(32);
                        iCharCount++;
                    } else {
                        fVar.b0(iCodePointAt);
                        iCharCount += Character.charCount(iCodePointAt);
                    }
                }
                return fVar.E(fVar.f7734b, pc.a.f7846a);
            }
            iCharCount++;
        }
        String strSubstring = str.substring(i, i10);
        jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    public static ArrayList f(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iJ0 = pc.g.j0(str, '&', i, 4);
            if (iJ0 == -1) {
                iJ0 = str.length();
            }
            int iJ1 = pc.g.j0(str, '=', i, 4);
            if (iJ1 == -1 || iJ1 > iJ0) {
                String strSubstring = str.substring(i, iJ0);
                jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                String strSubstring2 = str.substring(i, iJ1);
                jc.i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring2);
                String strSubstring3 = str.substring(iJ1 + 1, iJ0);
                jc.i.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                arrayList.add(strSubstring3);
            }
            i = iJ0 + 1;
        }
        return arrayList;
    }

    public synchronized g c(String str) {
        g gVar;
        String strConcat;
        try {
            jc.i.e(str, "javaName");
            LinkedHashMap linkedHashMap = g.f1579d;
            gVar = (g) linkedHashMap.get(str);
            if (gVar == null) {
                if (pc.o.e0(str, "TLS_", false)) {
                    String strSubstring = str.substring(4);
                    jc.i.d(strSubstring, "this as java.lang.String).substring(startIndex)");
                    strConcat = "SSL_".concat(strSubstring);
                } else if (pc.o.e0(str, "SSL_", false)) {
                    String strSubstring2 = str.substring(4);
                    jc.i.d(strSubstring2, "this as java.lang.String).substring(startIndex)");
                    strConcat = "TLS_".concat(strSubstring2);
                } else {
                    strConcat = str;
                }
                gVar = (g) linkedHashMap.get(strConcat);
                if (gVar == null) {
                    gVar = new g(str);
                }
                linkedHashMap.put(str, gVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return gVar;
    }
}

package gd;

import bd.j;
import bd.m;
import bd.o;
import bd.x;
import com.google.android.gms.internal.ads.zzbbs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import od.i;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import vb.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    static {
        i iVar = i.f7735d;
        z9.c.l("\"\\");
        z9.c.l("\t ,=");
    }

    public static final boolean a(x xVar) {
        if (jc.i.a((String) xVar.f1696a.f1681b, "HEAD")) {
            return false;
        }
        int i = xVar.f1699d;
        return (((i >= 100 && i < 200) || i == 204 || i == 304) && cd.b.j(xVar) == -1 && !"chunked".equalsIgnoreCase(x.c(xVar, "Transfer-Encoding"))) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009f  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(bd.b bVar, o oVar, m mVar) {
        List list;
        int i;
        j jVar;
        long j4;
        jc.i.e(bVar, "<this>");
        jc.i.e(oVar, "url");
        jc.i.e(mVar, "headers");
        if (bVar == bd.b.f1551b) {
            return;
        }
        Pattern pattern = j.f1603j;
        int size = mVar.size();
        int i10 = 0;
        ArrayList arrayList = null;
        for (int i11 = 0; i11 < size; i11++) {
            if ("Set-Cookie".equalsIgnoreCase(mVar.g(i11))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(mVar.i(i11));
            }
        }
        List listUnmodifiableList = q.f9297a;
        if (arrayList != null) {
            List listUnmodifiableList2 = Collections.unmodifiableList(arrayList);
            jc.i.d(listUnmodifiableList2, "{\n      Collections.unmodifiableList(result)\n    }");
            list = listUnmodifiableList2;
        } else {
            list = listUnmodifiableList;
        }
        int size2 = list.size();
        int i12 = 0;
        ArrayList arrayList2 = null;
        while (i12 < size2) {
            String str = (String) list.get(i12);
            jc.i.e(str, "setCookie");
            long jCurrentTimeMillis = System.currentTimeMillis();
            byte[] bArr = cd.b.f1822a;
            char c10 = ';';
            int iG = cd.b.g(str, ';', i10, str.length());
            char c11 = '=';
            int iG2 = cd.b.g(str, '=', i10, iG);
            if (iG2 == iG) {
                i = i10;
                jVar = null;
                break;
            }
            String strY = cd.b.y(i10, iG2, str);
            if (strY.length() == 0 || cd.b.l(strY) != -1) {
                i = i10;
                jVar = null;
                break;
            }
            String strY2 = cd.b.y(iG2 + 1, iG, str);
            if (cd.b.l(strY2) != -1) {
                i = i10;
            } else {
                int i13 = iG + 1;
                int length = str.length();
                int i14 = i10;
                int i15 = i14;
                int i16 = i15;
                long j10 = -1;
                long jV = 253402300799999L;
                String str2 = null;
                String str3 = null;
                boolean z4 = true;
                while (true) {
                    if (i13 < length) {
                        int iG3 = cd.b.g(str, c10, i13, length);
                        int iG4 = cd.b.g(str, c11, i13, iG3);
                        String strY3 = cd.b.y(i13, iG4, str);
                        String strY4 = iG4 < iG3 ? cd.b.y(iG4 + 1, iG3, str) : "";
                        if (strY3.equalsIgnoreCase("expires")) {
                            try {
                                jV = n9.b.v(strY4.length(), strY4);
                                i15 = 1;
                            } catch (NumberFormatException | IllegalArgumentException unused) {
                            }
                        } else if (strY3.equalsIgnoreCase("max-age")) {
                            try {
                                long j11 = Long.parseLong(strY4);
                                j10 = j11 <= 0 ? Long.MIN_VALUE : j11;
                            } catch (NumberFormatException e) {
                                Pattern patternCompile = Pattern.compile("-?\\d+");
                                jc.i.d(patternCompile, "compile(...)");
                                if (!patternCompile.matcher(strY4).matches()) {
                                    throw e;
                                }
                                j10 = pc.o.e0(strY4, "-", false) ? Long.MIN_VALUE : Long.MAX_VALUE;
                            }
                            i15 = 1;
                        } else if (strY3.equalsIgnoreCase("domain")) {
                            if (pc.o.Z(strY4, ".")) {
                                throw new IllegalArgumentException("Failed requirement.");
                            }
                            String strD = n9.b.D(pc.g.r0(strY4, "."));
                            if (strD == null) {
                                throw new IllegalArgumentException();
                            }
                            str3 = strD;
                            z4 = false;
                        } else if (strY3.equalsIgnoreCase("path")) {
                            str2 = strY4;
                        } else if (strY3.equalsIgnoreCase("secure")) {
                            i16 = 1;
                        } else if (strY3.equalsIgnoreCase("httponly")) {
                            i14 = 1;
                        }
                        i13 = iG3 + 1;
                        c10 = ';';
                        c11 = '=';
                    } else {
                        if (j10 == Long.MIN_VALUE) {
                            j4 = Long.MIN_VALUE;
                        } else if (j10 != -1) {
                            long j12 = jCurrentTimeMillis + (j10 <= 9223372036854775L ? j10 * ((long) zzbbs.zzq.zzf) : Long.MAX_VALUE);
                            j4 = (j12 < jCurrentTimeMillis || j12 > 253402300799999L) ? 253402300799999L : j12;
                        } else {
                            j4 = jV;
                        }
                        String str4 = oVar.f1629d;
                        if (str3 == null) {
                            str3 = str4;
                        } else if (!jc.i.a(str4, str3)) {
                            if (pc.o.Z(str4, str3) && str4.charAt((str4.length() - str3.length()) - 1) == '.') {
                                pc.f fVar = cd.b.f1826f;
                                fVar.getClass();
                                if (!fVar.f7863a.matcher(str4).matches()) {
                                }
                            }
                            i = 0;
                        }
                        if (str4.length() == str3.length() || PublicSuffixDatabase.f7772g.a(str3) != null) {
                            String strSubstring = "/";
                            i = 0;
                            if (str2 == null || !pc.o.e0(str2, "/", false)) {
                                String strB = oVar.b();
                                int iN0 = pc.g.n0(strB, '/', 0, 6);
                                if (iN0 != 0) {
                                    strSubstring = strB.substring(0, iN0);
                                    jc.i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                                }
                                str2 = strSubstring;
                            }
                            jVar = new j(strY, strY2, j4, str3, str2, i16, i14, i15, z4);
                            break;
                        }
                        i = 0;
                    }
                }
            }
            jVar = null;
            break;
            if (jVar != null) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                arrayList2.add(jVar);
            }
            i12++;
            i10 = i;
        }
        if (arrayList2 != null) {
            listUnmodifiableList = Collections.unmodifiableList(arrayList2);
            jc.i.d(listUnmodifiableList, "{\n        Collections.un…ableList(cookies)\n      }");
        }
        listUnmodifiableList.isEmpty();
    }
}

package dd;

import aa.c;
import bd.m;
import bd.p;
import bd.t;
import bd.v;
import bd.w;
import bd.x;
import bd.z;
import gd.f;
import java.util.ArrayList;
import jc.i;
import pc.g;
import pc.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements p {
    /* JADX WARN: Code duplicated, block: B:171:0x013c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x007c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:174:0x0082 A[EDGE_INSN: B:174:0x0082->B:24:0x0082 BREAK  A[LOOP:2: B:18:0x0066->B:22:0x0077], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0061  */
    /* JADX WARN: Code duplicated, block: B:19:0x0068  */
    /* JADX WARN: Code duplicated, block: B:22:0x0077 A[LOOP:2: B:18:0x0066->B:22:0x0077, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0145  */
    /* JADX WARN: Code duplicated, block: B:60:0x014d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:63:0x0158  */
    /* JADX WARN: Code duplicated, block: B:64:0x015e  */
    /* JADX WARN: Code duplicated, block: B:66:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x016c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0174  */
    /* JADX WARN: Code duplicated, block: B:70:0x0177  */
    /* JADX WARN: Code duplicated, block: B:72:0x017f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0182  */
    /* JADX WARN: Code duplicated, block: B:75:0x018a  */
    /* JADX WARN: Code duplicated, block: B:76:0x018d  */
    /* JADX WARN: Code duplicated, block: B:78:0x0195  */
    /* JADX WARN: Code duplicated, block: B:79:0x019d  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:85:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:87:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:88:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:90:0x01cb  */
    @Override // bd.p
    public final x a(f fVar) {
        c cVar;
        c cVar2;
        int i;
        int i10;
        int length;
        int length2;
        c cVar3;
        String string;
        m mVar;
        int i11;
        String string2;
        int length3;
        System.currentTimeMillis();
        v vVar = fVar.e;
        c cVar4 = new c(21, vVar, (Object) null);
        bd.c cVar5 = (bd.c) vVar.f1685g;
        if (cVar5 == null) {
            int i12 = bd.c.f1559n;
            m mVar2 = (m) vVar.f1683d;
            int size = mVar2.size();
            String str = null;
            int i13 = 0;
            boolean z4 = true;
            boolean z10 = false;
            boolean z11 = false;
            int iX = -1;
            int iX2 = -1;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            int iX3 = -1;
            int iX4 = -1;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            while (i13 < size) {
                String strG = mVar2.g(i13);
                String strI = mVar2.i(i13);
                if (o.a0(strG, "Cache-Control")) {
                    if (str == null) {
                        str = strI;
                    }
                    i10 = 0;
                    while (i10 < strI.length()) {
                        length = strI.length();
                        length2 = i10;
                        while (true) {
                            if (length2 < length) {
                                cVar3 = cVar4;
                                length2 = strI.length();
                                break;
                            }
                            cVar3 = cVar4;
                            if (g.g0("=,;", strI.charAt(length2))) {
                                break;
                            }
                            length2++;
                            cVar4 = cVar3;
                        }
                        String strSubstring = strI.substring(i10, length2);
                        i.d(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
                        string = g.B0(strSubstring).toString();
                        if (length2 != strI.length() || strI.charAt(length2) == ',' || strI.charAt(length2) == ';') {
                            mVar = mVar2;
                            i11 = size;
                            i10 = length2 + 1;
                            string2 = null;
                        } else {
                            int i14 = length2 + 1;
                            byte[] bArr = cd.b.f1822a;
                            int length4 = strI.length();
                            while (true) {
                                if (i14 >= length4) {
                                    length3 = strI.length();
                                    break;
                                }
                                char cCharAt = strI.charAt(i14);
                                int i15 = i14;
                                if (cCharAt != ' ' && cCharAt != '\t') {
                                    length3 = i15;
                                    break;
                                }
                                i14 = i15 + 1;
                            }
                            if (length3 >= strI.length() || strI.charAt(length3) != '\"') {
                                int length5 = strI.length();
                                int length6 = length3;
                                while (true) {
                                    if (length6 >= length5) {
                                        mVar = mVar2;
                                        i11 = size;
                                        length6 = strI.length();
                                        break;
                                    }
                                    mVar = mVar2;
                                    i11 = size;
                                    if (g.g0(",;", strI.charAt(length6))) {
                                        break;
                                    }
                                    length6++;
                                    mVar2 = mVar;
                                    size = i11;
                                }
                                String strSubstring2 = strI.substring(length3, length6);
                                i.d(strSubstring2, "this as java.lang.String…ing(startIndex, endIndex)");
                                string2 = g.B0(strSubstring2).toString();
                                i10 = length6;
                            } else {
                                int i16 = length3 + 1;
                                int iJ0 = g.j0(strI, '\"', i16, 4);
                                string2 = strI.substring(i16, iJ0);
                                i.d(string2, "this as java.lang.String…ing(startIndex, endIndex)");
                                mVar = mVar2;
                                i11 = size;
                                i10 = iJ0 + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(string)) {
                            z10 = true;
                        } else if ("no-store".equalsIgnoreCase(string)) {
                            z11 = true;
                        } else if ("max-age".equalsIgnoreCase(string)) {
                            iX = cd.b.x(-1, string2);
                        } else if ("s-maxage".equalsIgnoreCase(string)) {
                            iX2 = cd.b.x(-1, string2);
                        } else if ("private".equalsIgnoreCase(string)) {
                            z12 = true;
                        } else if ("public".equalsIgnoreCase(string)) {
                            z13 = true;
                        } else if ("must-revalidate".equalsIgnoreCase(string)) {
                            z14 = true;
                        } else if ("max-stale".equalsIgnoreCase(string)) {
                            iX3 = cd.b.x(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, string2);
                        } else if ("min-fresh".equalsIgnoreCase(string)) {
                            iX4 = cd.b.x(-1, string2);
                        } else if ("only-if-cached".equalsIgnoreCase(string)) {
                            z15 = true;
                        } else if ("no-transform".equalsIgnoreCase(string)) {
                            z16 = true;
                        } else if ("immutable".equalsIgnoreCase(string)) {
                            z17 = true;
                        }
                        cVar4 = cVar3;
                        mVar2 = mVar;
                        size = i11;
                    }
                    i13++;
                    cVar4 = cVar4;
                    mVar2 = mVar2;
                    size = size;
                } else {
                    if (o.a0(strG, "Pragma")) {
                    }
                    i13++;
                    cVar4 = cVar4;
                    mVar2 = mVar2;
                    size = size;
                }
                z4 = false;
                i10 = 0;
                while (i10 < strI.length()) {
                    length = strI.length();
                    length2 = i10;
                    while (true) {
                        if (length2 < length) {
                            cVar3 = cVar4;
                            length2 = strI.length();
                            break;
                        }
                        cVar3 = cVar4;
                        if (g.g0("=,;", strI.charAt(length2))) {
                            break;
                            break;
                        }
                        length2++;
                        cVar4 = cVar3;
                    }
                    String strSubstring3 = strI.substring(i10, length2);
                    i.d(strSubstring3, "this as java.lang.String…ing(startIndex, endIndex)");
                    string = g.B0(strSubstring3).toString();
                    if (length2 != strI.length()) {
                        mVar = mVar2;
                        i11 = size;
                        i10 = length2 + 1;
                        string2 = null;
                    } else {
                        mVar = mVar2;
                        i11 = size;
                        i10 = length2 + 1;
                        string2 = null;
                    }
                    if ("no-cache".equalsIgnoreCase(string)) {
                        z10 = true;
                    } else if ("no-store".equalsIgnoreCase(string)) {
                        z11 = true;
                    } else if ("max-age".equalsIgnoreCase(string)) {
                        iX = cd.b.x(-1, string2);
                    } else if ("s-maxage".equalsIgnoreCase(string)) {
                        iX2 = cd.b.x(-1, string2);
                    } else if ("private".equalsIgnoreCase(string)) {
                        z12 = true;
                    } else if ("public".equalsIgnoreCase(string)) {
                        z13 = true;
                    } else if ("must-revalidate".equalsIgnoreCase(string)) {
                        z14 = true;
                    } else if ("max-stale".equalsIgnoreCase(string)) {
                        iX3 = cd.b.x(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, string2);
                    } else if ("min-fresh".equalsIgnoreCase(string)) {
                        iX4 = cd.b.x(-1, string2);
                    } else if ("only-if-cached".equalsIgnoreCase(string)) {
                        z15 = true;
                    } else if ("no-transform".equalsIgnoreCase(string)) {
                        z16 = true;
                    } else if ("immutable".equalsIgnoreCase(string)) {
                        z17 = true;
                    }
                    cVar4 = cVar3;
                    mVar2 = mVar;
                    size = i11;
                }
                i13++;
                cVar4 = cVar4;
                mVar2 = mVar2;
                size = size;
            }
            cVar = cVar4;
            bd.c cVar6 = new bd.c(z10, z11, iX, iX2, z12, z13, z14, iX3, iX4, z15, z16, z17, !z4 ? null : str);
            vVar.f1685g = cVar6;
            cVar5 = cVar6;
        } else {
            cVar = cVar4;
        }
        if (cVar5.f1566j) {
            Object obj = null;
            cVar2 = new c(21, obj, obj);
        } else {
            cVar2 = cVar;
        }
        v vVar2 = (v) cVar2.f263b;
        x xVar = (x) cVar2.f264c;
        if (vVar2 == null && xVar == null) {
            return new x(vVar, t.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new m((String[]) new ArrayList(20).toArray(new String[0])), cd.b.f1824c, null, null, null, -1L, System.currentTimeMillis(), null);
        }
        if (vVar2 == null) {
            i.b(xVar);
            w wVarG = xVar.g();
            x xVarA = a.a(xVar);
            w.b(xVarA, "cacheResponse");
            wVarG.i = xVarA;
            return wVarG.a();
        }
        x xVarB = fVar.b(vVar2);
        if (xVar != null) {
            if (xVarB.f1699d == 304) {
                w wVarG2 = xVar.g();
                m mVar3 = xVar.f1700f;
                m mVar4 = xVarB.f1700f;
                ArrayList arrayList = new ArrayList(20);
                int size2 = mVar3.size();
                int i17 = 0;
                while (i17 < size2) {
                    String strG2 = mVar3.g(i17);
                    int i18 = size2;
                    String strI2 = mVar3.i(i17);
                    m mVar5 = mVar3;
                    if ("Warning".equalsIgnoreCase(strG2)) {
                        i = i17;
                        if (o.e0(strI2, "1", false)) {
                        }
                        i17 = i + 1;
                        size2 = i18;
                        mVar3 = mVar5;
                    } else {
                        i = i17;
                    }
                    if ("Content-Length".equalsIgnoreCase(strG2) || "Content-Encoding".equalsIgnoreCase(strG2) || "Content-Type".equalsIgnoreCase(strG2) || !a.b(strG2) || mVar4.d(strG2) == null) {
                        i.e(strG2, "name");
                        i.e(strI2, "value");
                        arrayList.add(strG2);
                        arrayList.add(g.B0(strI2).toString());
                    }
                    i17 = i + 1;
                    size2 = i18;
                    mVar3 = mVar5;
                }
                int size3 = mVar4.size();
                for (int i19 = 0; i19 < size3; i19++) {
                    String strG3 = mVar4.g(i19);
                    if (!"Content-Length".equalsIgnoreCase(strG3) && !"Content-Encoding".equalsIgnoreCase(strG3) && !"Content-Type".equalsIgnoreCase(strG3) && a.b(strG3)) {
                        String strI3 = mVar4.i(i19);
                        i.e(strG3, "name");
                        i.e(strI3, "value");
                        arrayList.add(strG3);
                        arrayList.add(g.B0(strI3).toString());
                    }
                }
                wVarG2.f1690f = new m((String[]) arrayList.toArray(new String[0])).h();
                wVarG2.f1693k = xVarB.f1705v;
                wVarG2.f1694l = xVarB.f1706w;
                x xVarA2 = a.a(xVar);
                w.b(xVarA2, "cacheResponse");
                wVarG2.i = xVarA2;
                x xVarA3 = a.a(xVarB);
                w.b(xVarA3, "networkResponse");
                wVarG2.h = xVarA3;
                wVarG2.a();
                z zVar = xVarB.f1701r;
                i.b(zVar);
                zVar.close();
                i.b(null);
                throw null;
            }
            z zVar2 = xVar.f1701r;
            if (zVar2 != null) {
                cd.b.d(zVar2);
            }
        }
        w wVarG3 = xVarB.g();
        x xVarA4 = a.a(xVar);
        w.b(xVarA4, "cacheResponse");
        wVarG3.i = xVarA4;
        x xVarA5 = a.a(xVarB);
        w.b(xVarA5, "networkResponse");
        wVarG3.h = xVarA5;
        return wVarG3.a();
    }
}

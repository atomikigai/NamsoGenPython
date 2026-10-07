package x;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f9992a = new b();

    public static boolean a(w.d dVar) {
        int[] iArr = dVar.f9392p0;
        int i = iArr[0];
        int i10 = iArr[1];
        w.d dVar2 = dVar.T;
        w.e eVar = dVar2 != null ? (w.e) dVar2 : null;
        if (eVar != null) {
            int i11 = eVar.f9392p0[0];
        }
        if (eVar != null) {
            int i12 = eVar.f9392p0[1];
        }
        boolean z4 = i == 1 || dVar.A() || i == 2 || (i == 3 && dVar.f9394r == 0 && dVar.W == 0.0f && dVar.t(0)) || (i == 3 && dVar.f9394r == 1 && dVar.u(0, dVar.q()));
        boolean z10 = i10 == 1 || dVar.B() || i10 == 2 || (i10 == 3 && dVar.f9395s == 0 && dVar.W == 0.0f && dVar.t(1)) || (i10 == 3 && dVar.f9395s == 1 && dVar.u(1, dVar.k()));
        return (dVar.W > 0.0f && (z4 || z10)) || (z4 && z10);
    }

    public static n b(w.d dVar, int i, ArrayList arrayList, n nVar) {
        int i10;
        int i11 = i == 0 ? dVar.f9388n0 : dVar.f9390o0;
        if (i11 != -1 && (nVar == null || i11 != nVar.f10000b)) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                n nVar2 = (n) arrayList.get(i12);
                if (nVar2.f10000b == i11) {
                    if (nVar != null) {
                        nVar.c(i, nVar2);
                        arrayList.remove(nVar);
                    }
                    nVar = nVar2;
                    break;
                }
            }
        } else if (i11 != -1) {
            return nVar;
        }
        if (nVar == null) {
            if (dVar instanceof w.i) {
                w.i iVar = (w.i) dVar;
                int i13 = 0;
                while (true) {
                    if (i13 >= iVar.f9444r0) {
                        i10 = -1;
                        break;
                    }
                    w.d dVar2 = iVar.f9443q0[i13];
                    if ((i == 0 && (i10 = dVar2.f9388n0) != -1) || (i == 1 && (i10 = dVar2.f9390o0) != -1)) {
                        break;
                    }
                    i13++;
                }
                if (i10 != -1) {
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        n nVar3 = (n) arrayList.get(i14);
                        if (nVar3.f10000b == i10) {
                            nVar = nVar3;
                            break;
                        }
                    }
                }
            }
            if (nVar == null) {
                nVar = new n();
                nVar.f9999a = new ArrayList();
                nVar.f10002d = null;
                nVar.e = -1;
                int i15 = n.f9998f;
                n.f9998f = i15 + 1;
                nVar.f10000b = i15;
                nVar.f10001c = i;
            }
            arrayList.add(nVar);
        }
        int i16 = nVar.f10000b;
        ArrayList arrayList2 = nVar.f9999a;
        if (arrayList2.contains(dVar)) {
            return nVar;
        }
        arrayList2.add(dVar);
        if (dVar instanceof w.h) {
            w.h hVar = (w.h) dVar;
            hVar.f9440t0.c(hVar.f9441u0 == 0 ? 1 : 0, arrayList, nVar);
        }
        if (i == 0) {
            dVar.f9388n0 = i16;
            dVar.I.c(i, arrayList, nVar);
            dVar.K.c(i, arrayList, nVar);
        } else {
            dVar.f9390o0 = i16;
            dVar.J.c(i, arrayList, nVar);
            dVar.M.c(i, arrayList, nVar);
            dVar.L.c(i, arrayList, nVar);
        }
        dVar.P.c(i, arrayList, nVar);
        return nVar;
    }

    public static void c(int i, w.d dVar, z.e eVar, boolean z4) {
        w.c cVar;
        w.c cVar2;
        boolean z10;
        w.c cVar3;
        w.c cVar4;
        if (dVar.f9385m) {
            return;
        }
        if (!(dVar instanceof w.e) && dVar.z() && a(dVar)) {
            w.e.V(dVar, eVar, new b());
        }
        w.c cVarI = dVar.i(2);
        w.c cVarI2 = dVar.i(4);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<w.c> hashSet = cVarI.f9359a;
        if (hashSet != null && cVarI.f9361c) {
            for (w.c cVar5 : hashSet) {
                w.d dVar2 = cVar5.f9362d;
                int i10 = i + 1;
                boolean zA = a(dVar2);
                w.c cVar6 = dVar2.I;
                w.c cVar7 = dVar2.K;
                if (dVar2.z() && zA) {
                    z10 = true;
                    w.e.V(dVar2, eVar, new b());
                } else {
                    z10 = true;
                }
                boolean z11 = ((cVar5 == cVar6 && (cVar4 = cVar7.f9363f) != null && cVar4.f9361c) || (cVar5 == cVar7 && (cVar3 = cVar6.f9363f) != null && cVar3.f9361c)) ? z10 : false;
                int i11 = dVar2.f9392p0[0];
                if (i11 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f9363f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.J(iE, dVar2.q() + iE);
                            c(i10, dVar2, eVar, z4);
                        } else if (cVar5 == cVar7 && cVar6.f9363f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.J(iE2 - dVar2.q(), iE2);
                            c(i10, dVar2, eVar, z4);
                        } else if (z11 && !dVar2.x()) {
                            d(i10, dVar2, eVar, z4);
                        }
                    }
                } else if (i11 == 3 && dVar2.f9398v >= 0 && dVar2.f9397u >= 0 && (dVar2.f9377g0 == 8 || (dVar2.f9394r == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.x() && !dVar2.F && z11 && !dVar2.x()) {
                        e(i10, dVar, eVar, dVar2, z4);
                    }
                }
            }
        }
        if (dVar instanceof w.h) {
            return;
        }
        HashSet<w.c> hashSet2 = cVarI2.f9359a;
        if (hashSet2 != null && cVarI2.f9361c) {
            for (w.c cVar8 : hashSet2) {
                w.d dVar3 = cVar8.f9362d;
                int i12 = i + 1;
                boolean zA2 = a(dVar3);
                w.c cVar9 = dVar3.I;
                w.c cVar10 = dVar3.K;
                if (dVar3.z() && zA2) {
                    w.e.V(dVar3, eVar, new b());
                }
                boolean z12 = (cVar8 == cVar9 && (cVar2 = cVar10.f9363f) != null && cVar2.f9361c) || (cVar8 == cVar10 && (cVar = cVar9.f9363f) != null && cVar.f9361c);
                int i13 = dVar3.f9392p0[0];
                if (i13 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f9363f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.J(iE3, dVar3.q() + iE3);
                            c(i12, dVar3, eVar, z4);
                        } else if (cVar8 == cVar10 && cVar9.f9363f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.J(iE4 - dVar3.q(), iE4);
                            c(i12, dVar3, eVar, z4);
                        } else if (z12 && !dVar3.x()) {
                            d(i12, dVar3, eVar, z4);
                        }
                    }
                } else if (i13 == 3 && dVar3.f9398v >= 0 && dVar3.f9397u >= 0) {
                    if (dVar3.f9377g0 == 8 || (dVar3.f9394r == 0 && dVar3.W == 0.0f)) {
                        if (!dVar3.x() && !dVar3.F && z12 && !dVar3.x()) {
                            e(i12, dVar, eVar, dVar3, z4);
                        }
                    }
                }
            }
        }
        dVar.f9385m = true;
    }

    public static void d(int i, w.d dVar, z.e eVar, boolean z4) {
        float f10 = dVar.f9372d0;
        w.c cVar = dVar.I;
        int iD = cVar.f9363f.d();
        w.c cVar2 = dVar.K;
        int iD2 = cVar2.f9363f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iQ = dVar.q();
        int i10 = (iD2 - iD) - iQ;
        if (iD > iD2) {
            i10 = (iD - iD2) - iQ;
        }
        int i11 = ((int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10)) + iD;
        int i12 = i11 + iQ;
        if (iD > iD2) {
            i12 = i11 - iQ;
        }
        dVar.J(i11, i12);
        c(i + 1, dVar, eVar, z4);
    }

    public static void e(int i, w.d dVar, z.e eVar, w.d dVar2, boolean z4) {
        float f10 = dVar2.f9372d0;
        w.c cVar = dVar2.I;
        int iE = cVar.e() + cVar.f9363f.d();
        w.c cVar2 = dVar2.K;
        int iD = cVar2.f9363f.d() - cVar2.e();
        if (iD >= iE) {
            int iQ = dVar2.q();
            if (dVar2.f9377g0 != 8) {
                int i10 = dVar2.f9394r;
                if (i10 == 2) {
                    iQ = (int) (dVar2.f9372d0 * 0.5f * (dVar instanceof w.e ? dVar.q() : dVar.T.q()));
                } else if (i10 == 0) {
                    iQ = iD - iE;
                }
                iQ = Math.max(dVar2.f9397u, iQ);
                int i11 = dVar2.f9398v;
                if (i11 > 0) {
                    iQ = Math.min(i11, iQ);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iQ)) + 0.5f));
            dVar2.J(i12, iQ + i12);
            c(i + 1, dVar2, eVar, z4);
        }
    }

    public static void f(int i, w.d dVar, z.e eVar) {
        float f10 = dVar.f9373e0;
        w.c cVar = dVar.J;
        int iD = cVar.f9363f.d();
        w.c cVar2 = dVar.L;
        int iD2 = cVar2.f9363f.d();
        int iE = cVar.e() + iD;
        int iE2 = iD2 - cVar2.e();
        if (iD == iD2) {
            f10 = 0.5f;
        } else {
            iD = iE;
            iD2 = iE2;
        }
        int iK = dVar.k();
        int i10 = (iD2 - iD) - iK;
        if (iD > iD2) {
            i10 = (iD - iD2) - iK;
        }
        int i11 = (int) (i10 > 0 ? (f10 * i10) + 0.5f : f10 * i10);
        int i12 = iD + i11;
        int i13 = i12 + iK;
        if (iD > iD2) {
            i12 = iD - i11;
            i13 = i12 - iK;
        }
        dVar.K(i12, i13);
        i(i + 1, dVar, eVar);
    }

    public static void g(int i, w.d dVar, z.e eVar, w.d dVar2) {
        float f10 = dVar2.f9373e0;
        w.c cVar = dVar2.J;
        int iE = cVar.e() + cVar.f9363f.d();
        w.c cVar2 = dVar2.L;
        int iD = cVar2.f9363f.d() - cVar2.e();
        if (iD >= iE) {
            int iK = dVar2.k();
            if (dVar2.f9377g0 != 8) {
                int i10 = dVar2.f9395s;
                if (i10 == 2) {
                    iK = (int) (f10 * 0.5f * (dVar instanceof w.e ? dVar.k() : dVar.T.k()));
                } else if (i10 == 0) {
                    iK = iD - iE;
                }
                iK = Math.max(dVar2.f9400x, iK);
                int i11 = dVar2.f9401y;
                if (i11 > 0) {
                    iK = Math.min(i11, iK);
                }
            }
            int i12 = iE + ((int) ((f10 * ((iD - iE) - iK)) + 0.5f));
            dVar2.K(i12, iK + i12);
            i(i + 1, dVar2, eVar);
        }
    }

    public static boolean h(int i, int i10, int i11, int i12) {
        return (i11 == 1 || i11 == 2 || (i11 == 4 && i != 2)) || (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2));
    }

    public static void i(int i, w.d dVar, z.e eVar) {
        boolean z4;
        w.c cVar;
        w.c cVar2;
        w.c cVar3;
        w.c cVar4;
        if (dVar.f9387n) {
            return;
        }
        if (!(dVar instanceof w.e) && dVar.z() && a(dVar)) {
            w.e.V(dVar, eVar, new b());
        }
        w.c cVarI = dVar.i(3);
        w.c cVarI2 = dVar.i(5);
        int iD = cVarI.d();
        int iD2 = cVarI2.d();
        HashSet<w.c> hashSet = cVarI.f9359a;
        if (hashSet != null && cVarI.f9361c) {
            for (w.c cVar5 : hashSet) {
                w.d dVar2 = cVar5.f9362d;
                int i10 = i + 1;
                boolean zA = a(dVar2);
                w.c cVar6 = dVar2.J;
                w.c cVar7 = dVar2.L;
                if (dVar2.z() && zA) {
                    w.e.V(dVar2, eVar, new b());
                }
                boolean z10 = (cVar5 == cVar6 && (cVar4 = cVar7.f9363f) != null && cVar4.f9361c) || (cVar5 == cVar7 && (cVar3 = cVar6.f9363f) != null && cVar3.f9361c);
                int i11 = dVar2.f9392p0[1];
                if (i11 != 3 || zA) {
                    if (!dVar2.z()) {
                        if (cVar5 == cVar6 && cVar7.f9363f == null) {
                            int iE = cVar6.e() + iD;
                            dVar2.K(iE, dVar2.k() + iE);
                            i(i10, dVar2, eVar);
                        } else if (cVar5 == cVar7 && cVar6.f9363f == null) {
                            int iE2 = iD - cVar7.e();
                            dVar2.K(iE2 - dVar2.k(), iE2);
                            i(i10, dVar2, eVar);
                        } else if (z10 && !dVar2.y()) {
                            f(i10, dVar2, eVar);
                        }
                    }
                } else if (i11 == 3 && dVar2.f9401y >= 0 && dVar2.f9400x >= 0 && (dVar2.f9377g0 == 8 || (dVar2.f9395s == 0 && dVar2.W == 0.0f))) {
                    if (!dVar2.y() && !dVar2.F && z10 && !dVar2.y()) {
                        g(i10, dVar, eVar, dVar2);
                    }
                }
            }
        }
        boolean z11 = true;
        z11 = true;
        z11 = true;
        if (dVar instanceof w.h) {
            return;
        }
        HashSet<w.c> hashSet2 = cVarI2.f9359a;
        if (hashSet2 != null && cVarI2.f9361c) {
            for (w.c cVar8 : hashSet2) {
                w.d dVar3 = cVar8.f9362d;
                int i12 = i + 1;
                boolean zA2 = a(dVar3);
                w.c cVar9 = dVar3.J;
                w.c cVar10 = dVar3.L;
                if (dVar3.z() && zA2) {
                    w.e.V(dVar3, eVar, new b());
                }
                boolean z12 = (cVar8 == cVar9 && (cVar2 = cVar10.f9363f) != null && cVar2.f9361c) || (cVar8 == cVar10 && (cVar = cVar9.f9363f) != null && cVar.f9361c);
                int i13 = dVar3.f9392p0[1];
                if (i13 != 3 || zA2) {
                    if (!dVar3.z()) {
                        if (cVar8 == cVar9 && cVar10.f9363f == null) {
                            int iE3 = cVar9.e() + iD2;
                            dVar3.K(iE3, dVar3.k() + iE3);
                            i(i12, dVar3, eVar);
                        } else if (cVar8 == cVar10 && cVar9.f9363f == null) {
                            int iE4 = iD2 - cVar10.e();
                            dVar3.K(iE4 - dVar3.k(), iE4);
                            i(i12, dVar3, eVar);
                        } else if (z12 && !dVar3.y()) {
                            f(i12, dVar3, eVar);
                        }
                    }
                } else if (i13 == 3 && dVar3.f9401y >= 0 && dVar3.f9400x >= 0 && (dVar3.f9377g0 == 8 || (dVar3.f9395s == 0 && dVar3.W == 0.0f))) {
                    if (!dVar3.y() && !dVar3.F && z12 && !dVar3.y()) {
                        g(i12, dVar, eVar, dVar3);
                    }
                }
            }
        }
        w.c cVarI3 = dVar.i(6);
        if (cVarI3.f9359a != null && cVarI3.f9361c) {
            int iD3 = cVarI3.d();
            for (w.c cVar11 : cVarI3.f9359a) {
                w.d dVar4 = cVar11.f9362d;
                int i14 = i + 1;
                boolean zA3 = a(dVar4);
                w.c cVar12 = dVar4.M;
                if (dVar4.z() && zA3) {
                    w.e.V(dVar4, eVar, new b());
                }
                if (dVar4.f9392p0[z11 ? 1 : 0] != 3 || zA3) {
                    if (!dVar4.z()) {
                        if (cVar11 == cVar12) {
                            int iE5 = cVar11.e() + iD3;
                            if (dVar4.E) {
                                int i15 = iE5 - dVar4.f9366a0;
                                int i16 = dVar4.V + i15;
                                dVar4.Z = i15;
                                dVar4.J.l(i15);
                                dVar4.L.l(i16);
                                cVar12.l(iE5);
                                z4 = z11 ? 1 : 0;
                                dVar4.f9383l = z4;
                            } else {
                                z4 = z11 ? 1 : 0;
                            }
                            i(i14, dVar4, eVar);
                        }
                        z11 = z4;
                    }
                }
                z4 = z11 ? 1 : 0;
                z11 = z4;
            }
        }
        dVar.f9387n = z11;
    }
}

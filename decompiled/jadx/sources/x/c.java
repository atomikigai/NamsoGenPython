package x;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayList f9974k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9975l;

    public c(w.d dVar, int i) {
        w.d dVar2;
        super(dVar);
        ArrayList arrayList = new ArrayList();
        this.f9974k = arrayList;
        this.f10007f = i;
        w.d dVar3 = this.f10004b;
        w.d dVarM = dVar3.m(i);
        while (true) {
            dVar2 = dVar3;
            dVar3 = dVarM;
            if (dVar3 == null) {
                break;
            } else {
                dVarM = dVar3.m(this.f10007f);
            }
        }
        this.f10004b = dVar2;
        int i10 = this.f10007f;
        arrayList.add(i10 == 0 ? dVar2.f9371d : i10 == 1 ? dVar2.e : null);
        w.d dVarL = dVar2.l(this.f10007f);
        while (dVarL != null) {
            int i11 = this.f10007f;
            arrayList.add(i11 == 0 ? dVarL.f9371d : i11 == 1 ? dVarL.e : null);
            dVarL = dVarL.l(this.f10007f);
        }
        int size = arrayList.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList.get(i12);
            i12++;
            o oVar = (o) obj;
            int i13 = this.f10007f;
            if (i13 == 0) {
                oVar.f10004b.f9367b = this;
            } else if (i13 == 1) {
                oVar.f10004b.f9369c = this;
            }
        }
        if (this.f10007f == 0 && ((w.e) this.f10004b.T).f9408v0 && arrayList.size() > 1) {
            this.f10004b = ((o) arrayList.get(arrayList.size() - 1)).f10004b;
        }
        this.f9975l = this.f10007f == 0 ? this.f10004b.f9379i0 : this.f10004b.f9381j0;
    }

    /* JADX WARN: Code duplicated, block: B:293:0x00e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:64:0x00da  */
    /* JADX WARN: Code duplicated, block: B:65:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:67:0x00e0 A[ADDED_TO_REGION] */
    @Override // x.d
    public final void a(d dVar) {
        int i;
        int i10;
        boolean z4;
        float f10;
        int i11;
        int i12;
        int i13;
        int i14;
        float f11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        float f12;
        f fVar = this.h;
        if (fVar.f9988j) {
            f fVar2 = this.i;
            if (fVar2.f9988j) {
                w.d dVar2 = this.f10004b.T;
                boolean z10 = dVar2 instanceof w.e ? ((w.e) dVar2).f9408v0 : false;
                int i21 = fVar2.f9987g - fVar.f9987g;
                ArrayList arrayList = this.f9974k;
                int size = arrayList.size();
                int i22 = 0;
                while (true) {
                    i = -1;
                    i10 = 8;
                    if (i22 >= size) {
                        i22 = -1;
                        break;
                    } else if (((o) arrayList.get(i22)).f10004b.f9377g0 != 8) {
                        break;
                    } else {
                        i22++;
                    }
                }
                int i23 = size - 1;
                for (int i24 = i23; i24 >= 0; i24--) {
                    if (((o) arrayList.get(i24)).f10004b.f9377g0 != 8) {
                        i = i24;
                        break;
                    }
                }
                int i25 = 0;
                while (true) {
                    if (i25 >= 2) {
                        z4 = z10;
                        f10 = 0.0f;
                        i11 = 0;
                        i12 = 0;
                        i13 = 0;
                        break;
                    }
                    f10 = 0.0f;
                    int i26 = 0;
                    i13 = 0;
                    int i27 = 0;
                    int i28 = 0;
                    while (i26 < size) {
                        o oVar = (o) arrayList.get(i26);
                        w.d dVar3 = oVar.f10004b;
                        boolean z11 = z10;
                        if (dVar3.f9377g0 == i10) {
                            i19 = i25;
                        } else {
                            i28++;
                            if (i26 > 0 && i26 >= i22) {
                                i13 += oVar.h.f9986f;
                            }
                            g gVar = oVar.e;
                            int i29 = gVar.f9987g;
                            i19 = i25;
                            boolean z12 = oVar.f10006d != 3;
                            if (z12) {
                                int i30 = this.f10007f;
                                if (i30 == 0 && !dVar3.f9371d.e.f9988j) {
                                    return;
                                }
                                if (i30 == 1 && !dVar3.e.e.f9988j) {
                                    return;
                                }
                            } else {
                                if (oVar.f10003a == 1 && i19 == 0) {
                                    i20 = gVar.f9991m;
                                    i27++;
                                } else {
                                    if (gVar.f9988j) {
                                        i20 = i29;
                                    }
                                    if (z12) {
                                        i13 += i20;
                                    } else {
                                        i27++;
                                        f12 = dVar3.k0[this.f10007f];
                                        if (f12 >= 0.0f) {
                                            f10 += f12;
                                        }
                                    }
                                    if (i26 >= i23 && i26 < i) {
                                        i13 += -oVar.i.f9986f;
                                    }
                                }
                                z12 = true;
                                if (z12) {
                                    i27++;
                                    f12 = dVar3.k0[this.f10007f];
                                    if (f12 >= 0.0f) {
                                        f10 += f12;
                                    }
                                } else {
                                    i13 += i20;
                                }
                                if (i26 >= i23) {
                                }
                            }
                            i20 = i29;
                            if (z12) {
                                i27++;
                                f12 = dVar3.k0[this.f10007f];
                                if (f12 >= 0.0f) {
                                    f10 += f12;
                                }
                            } else {
                                i13 += i20;
                            }
                            if (i26 >= i23) {
                            }
                        }
                        i26++;
                        z10 = z11;
                        i25 = i19;
                        i10 = 8;
                    }
                    z4 = z10;
                    int i31 = i25;
                    if (i13 < i21 || i27 == 0) {
                        i11 = i27;
                        i12 = i28;
                        break;
                    } else {
                        i25 = i31 + 1;
                        z10 = z4;
                        i10 = 8;
                    }
                }
                int i32 = fVar.f9987g;
                if (z4) {
                    i32 = fVar2.f9987g;
                }
                float f13 = 0.5f;
                if (i13 > i21) {
                    i32 = z4 ? i32 + ((int) (((i13 - i21) / 2.0f) + 0.5f)) : i32 - ((int) (((i13 - i21) / 2.0f) + 0.5f));
                }
                if (i11 > 0) {
                    float f14 = i21 - i13;
                    int i33 = (int) ((f14 / i11) + 0.5f);
                    int i34 = 0;
                    int i35 = 0;
                    while (i34 < size) {
                        float f15 = f13;
                        o oVar2 = (o) arrayList.get(i34);
                        int i36 = i32;
                        w.d dVar4 = oVar2.f10004b;
                        int i37 = i11;
                        g gVar2 = oVar2.e;
                        float f16 = f14;
                        int i38 = i33;
                        if (dVar4.f9377g0 != 8 && oVar2.f10006d == 3 && !gVar2.f9988j) {
                            int i39 = f10 > 0.0f ? (int) (((dVar4.k0[this.f10007f] * f16) / f10) + f15) : i38;
                            if (this.f10007f == 0) {
                                i17 = dVar4.f9398v;
                                i18 = dVar4.f9397u;
                            } else {
                                i17 = dVar4.f9401y;
                                i18 = dVar4.f9400x;
                            }
                            int iMax = Math.max(i18, oVar2.f10003a == 1 ? Math.min(i39, gVar2.f9991m) : i39);
                            if (i17 > 0) {
                                iMax = Math.min(i17, iMax);
                            }
                            if (iMax != i39) {
                                i35++;
                                i39 = iMax;
                            }
                            gVar2.d(i39);
                        }
                        i34++;
                        i32 = i36;
                        f13 = f15;
                        i11 = i37;
                        f14 = f16;
                        i33 = i38;
                    }
                    i14 = i32;
                    f11 = f13;
                    int i40 = i11;
                    if (i35 > 0) {
                        i11 = i40 - i35;
                        i13 = 0;
                        for (int i41 = 0; i41 < size; i41++) {
                            o oVar3 = (o) arrayList.get(i41);
                            if (oVar3.f10004b.f9377g0 != 8) {
                                if (i41 > 0 && i41 >= i22) {
                                    i13 += oVar3.h.f9986f;
                                }
                                i13 += oVar3.e.f9987g;
                                if (i41 < i23 && i41 < i) {
                                    i13 += -oVar3.i.f9986f;
                                }
                            }
                        }
                    } else {
                        i11 = i40;
                    }
                    i16 = 2;
                    if (this.f9975l == 2 && i35 == 0) {
                        i15 = 0;
                        this.f9975l = 0;
                    } else {
                        i15 = 0;
                    }
                } else {
                    i14 = i32;
                    f11 = 0.5f;
                    i15 = 0;
                    i16 = 2;
                }
                if (i13 > i21) {
                    this.f9975l = i16;
                }
                if (i12 > 0 && i11 == 0 && i22 == i) {
                    this.f9975l = i16;
                }
                int i42 = this.f9975l;
                if (i42 == 1) {
                    int i43 = i12 > 1 ? (i21 - i13) / (i12 - 1) : i12 == 1 ? (i21 - i13) / 2 : i15;
                    if (i11 > 0) {
                        i43 = i15;
                    }
                    int i44 = i14;
                    for (int i45 = i15; i45 < size; i45++) {
                        o oVar4 = (o) arrayList.get(z4 ? size - (i45 + 1) : i45);
                        w.d dVar5 = oVar4.f10004b;
                        f fVar3 = oVar4.i;
                        f fVar4 = oVar4.h;
                        if (dVar5.f9377g0 == 8) {
                            fVar4.d(i44);
                            fVar3.d(i44);
                        } else {
                            if (i45 > 0) {
                                i44 = z4 ? i44 - i43 : i44 + i43;
                            }
                            if (i45 > 0 && i45 >= i22) {
                                i44 = z4 ? i44 - fVar4.f9986f : i44 + fVar4.f9986f;
                            }
                            if (z4) {
                                fVar3.d(i44);
                            } else {
                                fVar4.d(i44);
                            }
                            g gVar3 = oVar4.e;
                            int i46 = gVar3.f9987g;
                            if (oVar4.f10006d == 3 && oVar4.f10003a == 1) {
                                i46 = gVar3.f9991m;
                            }
                            i44 = z4 ? i44 - i46 : i44 + i46;
                            if (z4) {
                                fVar4.d(i44);
                            } else {
                                fVar3.d(i44);
                            }
                            oVar4.f10008g = true;
                            if (i45 < i23 && i45 < i) {
                                i44 = z4 ? i44 - (-fVar3.f9986f) : i44 + (-fVar3.f9986f);
                            }
                        }
                    }
                    return;
                }
                if (i42 == 0) {
                    int i47 = (i21 - i13) / (i12 + 1);
                    if (i11 > 0) {
                        i47 = i15;
                    }
                    int i48 = i14;
                    for (int i49 = i15; i49 < size; i49++) {
                        o oVar5 = (o) arrayList.get(z4 ? size - (i49 + 1) : i49);
                        w.d dVar6 = oVar5.f10004b;
                        f fVar5 = oVar5.i;
                        f fVar6 = oVar5.h;
                        if (dVar6.f9377g0 == 8) {
                            fVar6.d(i48);
                            fVar5.d(i48);
                        } else {
                            int i50 = z4 ? i48 - i47 : i48 + i47;
                            if (i49 > 0 && i49 >= i22) {
                                i50 = z4 ? i50 - fVar6.f9986f : i50 + fVar6.f9986f;
                            }
                            if (z4) {
                                fVar5.d(i50);
                            } else {
                                fVar6.d(i50);
                            }
                            g gVar4 = oVar5.e;
                            int iMin = gVar4.f9987g;
                            if (oVar5.f10006d == 3 && oVar5.f10003a == 1) {
                                iMin = Math.min(iMin, gVar4.f9991m);
                            }
                            i48 = z4 ? i50 - iMin : i50 + iMin;
                            if (z4) {
                                fVar6.d(i48);
                            } else {
                                fVar5.d(i48);
                            }
                            if (i49 < i23 && i49 < i) {
                                i48 = z4 ? i48 - (-fVar5.f9986f) : i48 + (-fVar5.f9986f);
                            }
                        }
                    }
                    return;
                }
                if (i42 == 2) {
                    float f17 = this.f10007f == 0 ? this.f10004b.f9372d0 : this.f10004b.f9373e0;
                    if (z4) {
                        f17 = 1.0f - f17;
                    }
                    int i51 = (int) (((i21 - i13) * f17) + f11);
                    if (i51 < 0 || i11 > 0) {
                        i51 = i15;
                    }
                    int i52 = z4 ? i14 - i51 : i14 + i51;
                    for (int i53 = i15; i53 < size; i53++) {
                        o oVar6 = (o) arrayList.get(z4 ? size - (i53 + 1) : i53);
                        w.d dVar7 = oVar6.f10004b;
                        f fVar7 = oVar6.i;
                        f fVar8 = oVar6.h;
                        if (dVar7.f9377g0 == 8) {
                            fVar8.d(i52);
                            fVar7.d(i52);
                        } else {
                            if (i53 > 0 && i53 >= i22) {
                                i52 = z4 ? i52 - fVar8.f9986f : i52 + fVar8.f9986f;
                            }
                            if (z4) {
                                fVar7.d(i52);
                            } else {
                                fVar8.d(i52);
                            }
                            g gVar5 = oVar6.e;
                            int i54 = gVar5.f9987g;
                            if (oVar6.f10006d == 3 && oVar6.f10003a == 1) {
                                i54 = gVar5.f9991m;
                            }
                            i52 = z4 ? i52 - i54 : i52 + i54;
                            if (z4) {
                                fVar8.d(i52);
                            } else {
                                fVar7.d(i52);
                            }
                            if (i53 < i23 && i53 < i) {
                                i52 = z4 ? i52 - (-fVar7.f9986f) : i52 + (-fVar7.f9986f);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // x.o
    public final void d() {
        ArrayList arrayList = this.f9974k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        w.d dVar = ((o) arrayList.get(0)).f10004b;
        w.d dVar2 = ((o) arrayList.get(size2 - 1)).f10004b;
        int i10 = this.f10007f;
        f fVar = this.i;
        f fVar2 = this.h;
        if (i10 == 0) {
            w.c cVar = dVar.I;
            w.c cVar2 = dVar2.K;
            f fVarI = o.i(cVar, 0);
            int iE = cVar.e();
            w.d dVarM = m();
            if (dVarM != null) {
                iE = dVarM.I.e();
            }
            if (fVarI != null) {
                o.b(fVar2, fVarI, iE);
            }
            f fVarI2 = o.i(cVar2, 0);
            int iE2 = cVar2.e();
            w.d dVarN = n();
            if (dVarN != null) {
                iE2 = dVarN.K.e();
            }
            if (fVarI2 != null) {
                o.b(fVar, fVarI2, -iE2);
            }
        } else {
            w.c cVar3 = dVar.J;
            w.c cVar4 = dVar2.L;
            f fVarI3 = o.i(cVar3, 1);
            int iE3 = cVar3.e();
            w.d dVarM2 = m();
            if (dVarM2 != null) {
                iE3 = dVarM2.J.e();
            }
            if (fVarI3 != null) {
                o.b(fVar2, fVarI3, iE3);
            }
            f fVarI4 = o.i(cVar4, 1);
            int iE4 = cVar4.e();
            w.d dVarN2 = n();
            if (dVarN2 != null) {
                iE4 = dVarN2.L.e();
            }
            if (fVarI4 != null) {
                o.b(fVar, fVarI4, -iE4);
            }
        }
        fVar2.f9982a = this;
        fVar.f9982a = this;
    }

    @Override // x.o
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9974k;
            if (i >= arrayList.size()) {
                return;
            }
            ((o) arrayList.get(i)).e();
            i++;
        }
    }

    @Override // x.o
    public final void f() {
        this.f10005c = null;
        ArrayList arrayList = this.f9974k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((o) obj).f();
        }
    }

    @Override // x.o
    public final long j() {
        ArrayList arrayList = this.f9974k;
        int size = arrayList.size();
        long j4 = 0;
        for (int i = 0; i < size; i++) {
            o oVar = (o) arrayList.get(i);
            j4 = ((long) oVar.i.f9986f) + oVar.j() + j4 + ((long) oVar.h.f9986f);
        }
        return j4;
    }

    @Override // x.o
    public final boolean k() {
        ArrayList arrayList = this.f9974k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((o) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final w.d m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f9974k;
            if (i >= arrayList.size()) {
                return null;
            }
            w.d dVar = ((o) arrayList.get(i)).f10004b;
            if (dVar.f9377g0 != 8) {
                return dVar;
            }
            i++;
        }
    }

    public final w.d n() {
        ArrayList arrayList = this.f9974k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w.d dVar = ((o) arrayList.get(size)).f10004b;
            if (dVar.f9377g0 != 8) {
                return dVar;
            }
        }
        return null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChainRun ");
        sb2.append(this.f10007f == 0 ? "horizontal : " : "vertical : ");
        ArrayList arrayList = this.f9974k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb2.append("<");
            sb2.append((o) obj);
            sb2.append("> ");
        }
        return sb2.toString();
    }
}

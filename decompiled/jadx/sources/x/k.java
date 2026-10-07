package x;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f9993k = new int[2];

    public static void m(int[] iArr, int i, int i10, int i11, int i12, float f10, int i13) {
        int i14 = i10 - i;
        int i15 = i12 - i11;
        if (i13 != -1) {
            if (i13 == 0) {
                iArr[0] = (int) ((i15 * f10) + 0.5f);
                iArr[1] = i15;
                return;
            } else {
                if (i13 != 1) {
                    return;
                }
                iArr[0] = i14;
                iArr[1] = (int) ((i14 * f10) + 0.5f);
                return;
            }
        }
        int i16 = (int) ((i15 * f10) + 0.5f);
        int i17 = (int) ((i14 / f10) + 0.5f);
        if (i16 <= i14) {
            iArr[0] = i16;
            iArr[1] = i15;
        } else if (i17 <= i15) {
            iArr[0] = i14;
            iArr[1] = i17;
        }
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0268  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278  */
    /* JADX WARN: Code duplicated, block: B:11:0x0026  */
    @Override // x.d
    public final void a(d dVar) {
        float f10;
        int iG;
        int i;
        int iG2;
        float f11;
        float f12;
        float f13;
        int i10;
        if (u.e.d(this.f10009j) == 3) {
            w.d dVar2 = this.f10004b;
            l(dVar2.I, dVar2.K, 0);
            return;
        }
        g gVar = this.e;
        boolean z4 = gVar.f9988j;
        f fVar = this.h;
        f fVar2 = this.i;
        if (z4 || this.f10006d != 3) {
            f10 = 0.5f;
        } else {
            w.d dVar3 = this.f10004b;
            int i11 = dVar3.f9394r;
            if (i11 == 2) {
                f10 = 0.5f;
                w.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    g gVar2 = dVar4.f9371d.e;
                    if (gVar2.f9988j) {
                        gVar.d((int) ((gVar2.f9987g * dVar3.f9399w) + 0.5f));
                    }
                }
            } else if (i11 == 3) {
                int i12 = dVar3.f9395s;
                if (i12 == 0 || i12 == 3) {
                    m mVar = dVar3.e;
                    f fVar3 = mVar.h;
                    f fVar4 = mVar.i;
                    boolean z10 = dVar3.I.f9363f != null;
                    boolean z11 = dVar3.J.f9363f != null;
                    boolean z12 = dVar3.K.f9363f != null;
                    boolean z13 = dVar3.L.f9363f != null;
                    f10 = 0.5f;
                    int i13 = dVar3.X;
                    if (z10 && z11 && z12 && z13) {
                        float f14 = dVar3.W;
                        boolean z14 = fVar3.f9988j;
                        ArrayList arrayList = fVar3.f9990l;
                        int[] iArr = f9993k;
                        if (z14 && fVar4.f9988j) {
                            if (fVar.f9984c && fVar2.f9984c) {
                                m(iArr, ((f) fVar.f9990l.get(0)).f9987g + fVar.f9986f, ((f) fVar2.f9990l.get(0)).f9987g - fVar2.f9986f, fVar3.f9987g + fVar3.f9986f, fVar4.f9987g - fVar4.f9986f, f14, i13);
                                gVar.d(iArr[0]);
                                this.f10004b.e.e.d(iArr[1]);
                                return;
                            }
                            return;
                        }
                        if (fVar.f9988j && fVar2.f9988j) {
                            if (!fVar3.f9984c || !fVar4.f9984c) {
                                return;
                            }
                            m(iArr, fVar.f9987g + fVar.f9986f, fVar2.f9987g - fVar2.f9986f, ((f) arrayList.get(0)).f9987g + fVar3.f9986f, ((f) fVar4.f9990l.get(0)).f9987g - fVar4.f9986f, f14, i13);
                            gVar.d(iArr[0]);
                            this.f10004b.e.e.d(iArr[1]);
                        }
                        if (!fVar.f9984c || !fVar2.f9984c || !fVar3.f9984c || !fVar4.f9984c) {
                            return;
                        }
                        m(iArr, ((f) fVar.f9990l.get(0)).f9987g + fVar.f9986f, ((f) fVar2.f9990l.get(0)).f9987g - fVar2.f9986f, ((f) arrayList.get(0)).f9987g + fVar3.f9986f, ((f) fVar4.f9990l.get(0)).f9987g - fVar4.f9986f, f14, i13);
                        gVar.d(iArr[0]);
                        this.f10004b.e.e.d(iArr[1]);
                    } else if (z10 && z12) {
                        if (!fVar.f9984c || !fVar2.f9984c) {
                            return;
                        }
                        float f15 = dVar3.W;
                        int i14 = ((f) fVar.f9990l.get(0)).f9987g + fVar.f9986f;
                        int i15 = ((f) fVar2.f9990l.get(0)).f9987g - fVar2.f9986f;
                        if (i13 == -1 || i13 == 0) {
                            int iG3 = g(i15 - i14, 0);
                            int i16 = (int) ((iG3 * f15) + 0.5f);
                            int iG4 = g(i16, 1);
                            if (i16 != iG4) {
                                iG3 = (int) ((iG4 / f15) + 0.5f);
                            }
                            gVar.d(iG3);
                            this.f10004b.e.e.d(iG4);
                        } else if (i13 == 1) {
                            int iG5 = g(i15 - i14, 0);
                            int i17 = (int) ((iG5 / f15) + 0.5f);
                            int iG6 = g(i17, 1);
                            if (i17 != iG6) {
                                iG5 = (int) ((iG6 * f15) + 0.5f);
                            }
                            gVar.d(iG5);
                            this.f10004b.e.e.d(iG6);
                        }
                    } else if (z11 && z13) {
                        if (!fVar3.f9984c || !fVar4.f9984c) {
                            return;
                        }
                        float f16 = dVar3.W;
                        int i18 = ((f) fVar3.f9990l.get(0)).f9987g + fVar3.f9986f;
                        int i19 = ((f) fVar4.f9990l.get(0)).f9987g - fVar4.f9986f;
                        if (i13 == -1) {
                            iG = g(i19 - i18, 1);
                            i = (int) ((iG / f16) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f16) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f10004b.e.e.d(iG);
                        } else if (i13 == 0) {
                            int iG7 = g(i19 - i18, 1);
                            int i20 = (int) ((iG7 * f16) + 0.5f);
                            int iG8 = g(i20, 0);
                            if (i20 != iG8) {
                                iG7 = (int) ((iG8 / f16) + 0.5f);
                            }
                            gVar.d(iG8);
                            this.f10004b.e.e.d(iG7);
                        } else if (i13 == 1) {
                            iG = g(i19 - i18, 1);
                            i = (int) ((iG / f16) + 0.5f);
                            iG2 = g(i, 0);
                            if (i != iG2) {
                                iG = (int) ((iG2 * f16) + 0.5f);
                            }
                            gVar.d(iG2);
                            this.f10004b.e.e.d(iG);
                        }
                    }
                } else {
                    int i21 = dVar3.X;
                    if (i21 != -1) {
                        if (i21 == 0) {
                            f13 = dVar3.e.e.f9987g / dVar3.W;
                            i10 = (int) (f13 + 0.5f);
                        } else if (i21 != 1) {
                            i10 = 0;
                        } else {
                            f11 = dVar3.e.e.f9987g;
                            f12 = dVar3.W;
                        }
                        gVar.d(i10);
                        f10 = 0.5f;
                    } else {
                        f11 = dVar3.e.e.f9987g;
                        f12 = dVar3.W;
                    }
                    f13 = f11 * f12;
                    i10 = (int) (f13 + 0.5f);
                    gVar.d(i10);
                    f10 = 0.5f;
                }
            } else {
                f10 = 0.5f;
            }
        }
        boolean z15 = fVar.f9984c;
        ArrayList arrayList2 = fVar.f9990l;
        if (z15) {
            boolean z16 = fVar2.f9984c;
            ArrayList arrayList3 = fVar2.f9990l;
            if (z16) {
                if (fVar.f9988j && fVar2.f9988j && gVar.f9988j) {
                    return;
                }
                if (!gVar.f9988j && this.f10006d == 3) {
                    w.d dVar5 = this.f10004b;
                    if (dVar5.f9394r == 0 && !dVar5.x()) {
                        f fVar5 = (f) arrayList2.get(0);
                        f fVar6 = (f) arrayList3.get(0);
                        int i22 = fVar5.f9987g + fVar.f9986f;
                        int i23 = fVar6.f9987g + fVar2.f9986f;
                        fVar.d(i22);
                        fVar2.d(i23);
                        gVar.d(i23 - i22);
                        return;
                    }
                }
                if (!gVar.f9988j && this.f10006d == 3 && this.f10003a == 1 && arrayList2.size() > 0 && arrayList3.size() > 0) {
                    int iMin = Math.min((((f) arrayList3.get(0)).f9987g + fVar2.f9986f) - (((f) arrayList2.get(0)).f9987g + fVar.f9986f), gVar.f9991m);
                    w.d dVar6 = this.f10004b;
                    int i24 = dVar6.f9398v;
                    int iMax = Math.max(dVar6.f9397u, iMin);
                    if (i24 > 0) {
                        iMax = Math.min(i24, iMax);
                    }
                    gVar.d(iMax);
                }
                if (gVar.f9988j) {
                    f fVar7 = (f) arrayList2.get(0);
                    f fVar8 = (f) arrayList3.get(0);
                    int i25 = fVar7.f9987g;
                    int i26 = fVar.f9986f + i25;
                    int i27 = fVar8.f9987g;
                    int i28 = fVar2.f9986f + i27;
                    float f17 = this.f10004b.f9372d0;
                    if (fVar7 == fVar8) {
                        f17 = f10;
                    } else {
                        i25 = i26;
                        i27 = i28;
                    }
                    fVar.d((int) ((((i27 - i25) - gVar.f9987g) * f17) + i25 + f10));
                    fVar2.d(fVar.f9987g + gVar.f9987g);
                }
            }
        }
    }

    @Override // x.o
    public final void d() {
        w.d dVar;
        w.d dVar2;
        int i;
        w.d dVar3;
        w.d dVar4;
        int i10;
        w.d dVar5 = this.f10004b;
        boolean z4 = dVar5.f9365a;
        g gVar = this.e;
        if (z4) {
            gVar.d(dVar5.q());
        }
        boolean z10 = gVar.f9988j;
        ArrayList arrayList = gVar.f9989k;
        ArrayList arrayList2 = gVar.f9990l;
        f fVar = this.i;
        f fVar2 = this.h;
        if (!z10) {
            w.d dVar6 = this.f10004b;
            int i11 = dVar6.f9392p0[0];
            this.f10006d = i11;
            if (i11 != 3) {
                if (i11 == 4 && (dVar4 = dVar6.T) != null && ((i10 = dVar4.f9392p0[0]) == 1 || i10 == 4)) {
                    int iQ = (dVar4.q() - this.f10004b.I.e()) - this.f10004b.K.e();
                    o.b(fVar2, dVar4.f9371d.h, this.f10004b.I.e());
                    o.b(fVar, dVar4.f9371d.i, -this.f10004b.K.e());
                    gVar.d(iQ);
                    return;
                }
                if (i11 == 1) {
                    gVar.d(dVar6.q());
                }
            }
        } else if (this.f10006d == 4 && (dVar2 = (dVar = this.f10004b).T) != null && ((i = dVar2.f9392p0[0]) == 1 || i == 4)) {
            o.b(fVar2, dVar2.f9371d.h, dVar.I.e());
            o.b(fVar, dVar2.f9371d.i, -this.f10004b.K.e());
            return;
        }
        if (gVar.f9988j) {
            w.d dVar7 = this.f10004b;
            if (dVar7.f9365a) {
                w.c[] cVarArr = dVar7.Q;
                w.c cVar = cVarArr[0];
                w.c cVar2 = cVar.f9363f;
                if (cVar2 != null && cVarArr[1].f9363f != null) {
                    if (dVar7.x()) {
                        fVar2.f9986f = this.f10004b.Q[0].e();
                        fVar.f9986f = -this.f10004b.Q[1].e();
                        return;
                    }
                    f fVarH = o.h(this.f10004b.Q[0]);
                    if (fVarH != null) {
                        o.b(fVar2, fVarH, this.f10004b.Q[0].e());
                    }
                    f fVarH2 = o.h(this.f10004b.Q[1]);
                    if (fVarH2 != null) {
                        o.b(fVar, fVarH2, -this.f10004b.Q[1].e());
                    }
                    fVar2.f9983b = true;
                    fVar.f9983b = true;
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar2, fVarH3, this.f10004b.Q[0].e());
                        o.b(fVar, fVar2, gVar.f9987g);
                        return;
                    }
                    return;
                }
                w.c cVar3 = cVarArr[1];
                if (cVar3.f9363f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar, fVarH4, -this.f10004b.Q[1].e());
                        o.b(fVar2, fVar, -gVar.f9987g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof w.i) || dVar7.T == null || dVar7.i(7).f9363f != null) {
                    return;
                }
                w.d dVar8 = this.f10004b;
                o.b(fVar2, dVar8.T.f9371d.h, dVar8.r());
                o.b(fVar, fVar2, gVar.f9987g);
                return;
            }
        }
        if (this.f10006d == 3) {
            w.d dVar9 = this.f10004b;
            int i12 = dVar9.f9394r;
            if (i12 == 2) {
                w.d dVar10 = dVar9.T;
                if (dVar10 != null) {
                    g gVar2 = dVar10.e.e;
                    arrayList2.add(gVar2);
                    gVar2.f9989k.add(gVar);
                    gVar.f9983b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                }
            } else if (i12 == 3) {
                if (dVar9.f9395s == 3) {
                    fVar2.f9982a = this;
                    fVar.f9982a = this;
                    m mVar = dVar9.e;
                    mVar.h.f9982a = this;
                    mVar.i.f9982a = this;
                    gVar.f9982a = this;
                    if (dVar9.y()) {
                        arrayList2.add(this.f10004b.e.e);
                        this.f10004b.e.e.f9989k.add(gVar);
                        m mVar2 = this.f10004b.e;
                        mVar2.e.f9982a = this;
                        arrayList2.add(mVar2.h);
                        arrayList2.add(this.f10004b.e.i);
                        this.f10004b.e.h.f9989k.add(gVar);
                        this.f10004b.e.i.f9989k.add(gVar);
                    } else if (this.f10004b.x()) {
                        this.f10004b.e.e.f9990l.add(gVar);
                        arrayList.add(this.f10004b.e.e);
                    } else {
                        this.f10004b.e.e.f9990l.add(gVar);
                    }
                } else {
                    g gVar3 = dVar9.e.e;
                    arrayList2.add(gVar3);
                    gVar3.f9989k.add(gVar);
                    this.f10004b.e.h.f9989k.add(gVar);
                    this.f10004b.e.i.f9989k.add(gVar);
                    gVar.f9983b = true;
                    arrayList.add(fVar2);
                    arrayList.add(fVar);
                    fVar2.f9990l.add(gVar);
                    fVar.f9990l.add(gVar);
                }
            }
        }
        w.d dVar11 = this.f10004b;
        w.c[] cVarArr2 = dVar11.Q;
        w.c cVar4 = cVarArr2[0];
        w.c cVar5 = cVar4.f9363f;
        if (cVar5 != null && cVarArr2[1].f9363f != null) {
            if (dVar11.x()) {
                fVar2.f9986f = this.f10004b.Q[0].e();
                fVar.f9986f = -this.f10004b.Q[1].e();
                return;
            }
            f fVarH5 = o.h(this.f10004b.Q[0]);
            f fVarH6 = o.h(this.f10004b.Q[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f10009j = 4;
            return;
        }
        if (cVar5 != null) {
            f fVarH7 = o.h(cVar4);
            if (fVarH7 != null) {
                o.b(fVar2, fVarH7, this.f10004b.Q[0].e());
                c(fVar, fVar2, 1, gVar);
                return;
            }
            return;
        }
        w.c cVar6 = cVarArr2[1];
        if (cVar6.f9363f != null) {
            f fVarH8 = o.h(cVar6);
            if (fVarH8 != null) {
                o.b(fVar, fVarH8, -this.f10004b.Q[1].e());
                c(fVar2, fVar, -1, gVar);
                return;
            }
            return;
        }
        if ((dVar11 instanceof w.i) || (dVar3 = dVar11.T) == null) {
            return;
        }
        o.b(fVar2, dVar3.f9371d.h, dVar11.r());
        c(fVar, fVar2, 1, gVar);
    }

    @Override // x.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f9988j) {
            this.f10004b.Y = fVar.f9987g;
        }
    }

    @Override // x.o
    public final void f() {
        this.f10005c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.f10008g = false;
    }

    @Override // x.o
    public final boolean k() {
        return this.f10006d != 3 || this.f10004b.f9394r == 0;
    }

    public final void n() {
        this.f10008g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f9988j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f9988j = false;
        this.e.f9988j = false;
    }

    public final String toString() {
        return "HorizontalRun " + this.f10004b.f9378h0;
    }
}

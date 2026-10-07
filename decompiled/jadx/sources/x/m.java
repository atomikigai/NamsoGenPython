package x;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends o {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f f9996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f9997l;

    @Override // x.d
    public final void a(d dVar) {
        float f10;
        float f11;
        float f12;
        int i;
        if (u.e.d(this.f10009j) == 3) {
            w.d dVar2 = this.f10004b;
            l(dVar2.J, dVar2.L, 1);
            return;
        }
        g gVar = this.e;
        if (gVar.f9984c && !gVar.f9988j && this.f10006d == 3) {
            w.d dVar3 = this.f10004b;
            int i10 = dVar3.f9395s;
            if (i10 == 2) {
                w.d dVar4 = dVar3.T;
                if (dVar4 != null) {
                    g gVar2 = dVar4.e.e;
                    if (gVar2.f9988j) {
                        gVar.d((int) ((gVar2.f9987g * dVar3.f9402z) + 0.5f));
                    }
                }
            } else if (i10 == 3) {
                g gVar3 = dVar3.f9371d.e;
                if (gVar3.f9988j) {
                    int i11 = dVar3.X;
                    if (i11 != -1) {
                        if (i11 == 0) {
                            f12 = gVar3.f9987g * dVar3.W;
                            i = (int) (f12 + 0.5f);
                        } else if (i11 != 1) {
                            i = 0;
                        } else {
                            f10 = gVar3.f9987g;
                            f11 = dVar3.W;
                        }
                        gVar.d(i);
                    } else {
                        f10 = gVar3.f9987g;
                        f11 = dVar3.W;
                    }
                    f12 = f10 / f11;
                    i = (int) (f12 + 0.5f);
                    gVar.d(i);
                }
            }
        }
        f fVar = this.h;
        boolean z4 = fVar.f9984c;
        ArrayList arrayList = fVar.f9990l;
        if (z4) {
            f fVar2 = this.i;
            boolean z10 = fVar2.f9984c;
            ArrayList arrayList2 = fVar2.f9990l;
            if (z10) {
                if (fVar.f9988j && fVar2.f9988j && gVar.f9988j) {
                    return;
                }
                if (!gVar.f9988j && this.f10006d == 3) {
                    w.d dVar5 = this.f10004b;
                    if (dVar5.f9394r == 0 && !dVar5.y()) {
                        f fVar3 = (f) arrayList.get(0);
                        f fVar4 = (f) arrayList2.get(0);
                        int i12 = fVar3.f9987g + fVar.f9986f;
                        int i13 = fVar4.f9987g + fVar2.f9986f;
                        fVar.d(i12);
                        fVar2.d(i13);
                        gVar.d(i13 - i12);
                        return;
                    }
                }
                if (!gVar.f9988j && this.f10006d == 3 && this.f10003a == 1 && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar5 = (f) arrayList.get(0);
                    int i14 = (((f) arrayList2.get(0)).f9987g + fVar2.f9986f) - (fVar5.f9987g + fVar.f9986f);
                    int i15 = gVar.f9991m;
                    if (i14 < i15) {
                        gVar.d(i14);
                    } else {
                        gVar.d(i15);
                    }
                }
                if (gVar.f9988j && arrayList.size() > 0 && arrayList2.size() > 0) {
                    f fVar6 = (f) arrayList.get(0);
                    f fVar7 = (f) arrayList2.get(0);
                    int i16 = fVar6.f9987g;
                    int i17 = fVar.f9986f + i16;
                    int i18 = fVar7.f9987g;
                    int i19 = fVar2.f9986f + i18;
                    float f13 = this.f10004b.f9373e0;
                    if (fVar6 == fVar7) {
                        f13 = 0.5f;
                    } else {
                        i16 = i17;
                        i18 = i19;
                    }
                    fVar.d((int) ((((i18 - i16) - gVar.f9987g) * f13) + i16 + 0.5f));
                    fVar2.d(fVar.f9987g + gVar.f9987g);
                }
            }
        }
    }

    @Override // x.o
    public final void d() {
        w.d dVar;
        w.d dVar2;
        w.d dVar3;
        w.d dVar4;
        f fVar = this.f9996k;
        w.d dVar5 = this.f10004b;
        boolean z4 = dVar5.f9365a;
        g gVar = this.e;
        if (z4) {
            gVar.d(dVar5.k());
        }
        boolean z10 = gVar.f9988j;
        ArrayList arrayList = gVar.f9989k;
        ArrayList arrayList2 = gVar.f9990l;
        f fVar2 = this.i;
        f fVar3 = this.h;
        if (!z10) {
            w.d dVar6 = this.f10004b;
            this.f10006d = dVar6.f9392p0[1];
            if (dVar6.E) {
                this.f9997l = new a(this);
            }
            int i = this.f10006d;
            if (i != 3) {
                if (i == 4 && (dVar4 = this.f10004b.T) != null && dVar4.f9392p0[1] == 1) {
                    int iK = (dVar4.k() - this.f10004b.J.e()) - this.f10004b.L.e();
                    o.b(fVar3, dVar4.e.h, this.f10004b.J.e());
                    o.b(fVar2, dVar4.e.i, -this.f10004b.L.e());
                    gVar.d(iK);
                    return;
                }
                if (i == 1) {
                    gVar.d(this.f10004b.k());
                }
            }
        } else if (this.f10006d == 4 && (dVar2 = (dVar = this.f10004b).T) != null && dVar2.f9392p0[1] == 1) {
            o.b(fVar3, dVar2.e.h, dVar.J.e());
            o.b(fVar2, dVar2.e.i, -this.f10004b.L.e());
            return;
        }
        boolean z11 = gVar.f9988j;
        if (z11) {
            w.d dVar7 = this.f10004b;
            if (dVar7.f9365a) {
                w.c[] cVarArr = dVar7.Q;
                w.c cVar = cVarArr[2];
                w.c cVar2 = cVar.f9363f;
                if (cVar2 != null && cVarArr[3].f9363f != null) {
                    if (dVar7.y()) {
                        fVar3.f9986f = this.f10004b.Q[2].e();
                        fVar2.f9986f = -this.f10004b.Q[3].e();
                    } else {
                        f fVarH = o.h(this.f10004b.Q[2]);
                        if (fVarH != null) {
                            o.b(fVar3, fVarH, this.f10004b.Q[2].e());
                        }
                        f fVarH2 = o.h(this.f10004b.Q[3]);
                        if (fVarH2 != null) {
                            o.b(fVar2, fVarH2, -this.f10004b.Q[3].e());
                        }
                        fVar3.f9983b = true;
                        fVar2.f9983b = true;
                    }
                    w.d dVar8 = this.f10004b;
                    if (dVar8.E) {
                        o.b(fVar, fVar3, dVar8.f9366a0);
                        return;
                    }
                    return;
                }
                if (cVar2 != null) {
                    f fVarH3 = o.h(cVar);
                    if (fVarH3 != null) {
                        o.b(fVar3, fVarH3, this.f10004b.Q[2].e());
                        o.b(fVar2, fVar3, gVar.f9987g);
                        w.d dVar9 = this.f10004b;
                        if (dVar9.E) {
                            o.b(fVar, fVar3, dVar9.f9366a0);
                            return;
                        }
                        return;
                    }
                    return;
                }
                w.c cVar3 = cVarArr[3];
                if (cVar3.f9363f != null) {
                    f fVarH4 = o.h(cVar3);
                    if (fVarH4 != null) {
                        o.b(fVar2, fVarH4, -this.f10004b.Q[3].e());
                        o.b(fVar3, fVar2, -gVar.f9987g);
                    }
                    w.d dVar10 = this.f10004b;
                    if (dVar10.E) {
                        o.b(fVar, fVar3, dVar10.f9366a0);
                        return;
                    }
                    return;
                }
                w.c cVar4 = cVarArr[4];
                if (cVar4.f9363f != null) {
                    f fVarH5 = o.h(cVar4);
                    if (fVarH5 != null) {
                        o.b(fVar, fVarH5, 0);
                        o.b(fVar3, fVar, -this.f10004b.f9366a0);
                        o.b(fVar2, fVar3, gVar.f9987g);
                        return;
                    }
                    return;
                }
                if ((dVar7 instanceof w.i) || dVar7.T == null || dVar7.i(7).f9363f != null) {
                    return;
                }
                w.d dVar11 = this.f10004b;
                o.b(fVar3, dVar11.T.e.h, dVar11.s());
                o.b(fVar2, fVar3, gVar.f9987g);
                w.d dVar12 = this.f10004b;
                if (dVar12.E) {
                    o.b(fVar, fVar3, dVar12.f9366a0);
                    return;
                }
                return;
            }
        }
        if (z11 || this.f10006d != 3) {
            gVar.b(this);
        } else {
            w.d dVar13 = this.f10004b;
            int i10 = dVar13.f9395s;
            if (i10 == 2) {
                w.d dVar14 = dVar13.T;
                if (dVar14 != null) {
                    g gVar2 = dVar14.e.e;
                    arrayList2.add(gVar2);
                    gVar2.f9989k.add(gVar);
                    gVar.f9983b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            } else if (i10 == 3 && !dVar13.y()) {
                w.d dVar15 = this.f10004b;
                if (dVar15.f9394r != 3) {
                    g gVar3 = dVar15.f9371d.e;
                    arrayList2.add(gVar3);
                    gVar3.f9989k.add(gVar);
                    gVar.f9983b = true;
                    arrayList.add(fVar3);
                    arrayList.add(fVar2);
                }
            }
        }
        w.d dVar16 = this.f10004b;
        w.c[] cVarArr2 = dVar16.Q;
        w.c cVar5 = cVarArr2[2];
        w.c cVar6 = cVar5.f9363f;
        if (cVar6 != null && cVarArr2[3].f9363f != null) {
            if (dVar16.y()) {
                fVar3.f9986f = this.f10004b.Q[2].e();
                fVar2.f9986f = -this.f10004b.Q[3].e();
            } else {
                f fVarH6 = o.h(this.f10004b.Q[2]);
                f fVarH7 = o.h(this.f10004b.Q[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f10009j = 4;
            }
            if (this.f10004b.E) {
                c(fVar, fVar3, 1, this.f9997l);
            }
        } else if (cVar6 != null) {
            f fVarH8 = o.h(cVar5);
            if (fVarH8 != null) {
                o.b(fVar3, fVarH8, this.f10004b.Q[2].e());
                c(fVar2, fVar3, 1, gVar);
                if (this.f10004b.E) {
                    c(fVar, fVar3, 1, this.f9997l);
                }
                if (this.f10006d == 3) {
                    w.d dVar17 = this.f10004b;
                    if (dVar17.W > 0.0f) {
                        k kVar = dVar17.f9371d;
                        if (kVar.f10006d == 3) {
                            kVar.e.f9989k.add(gVar);
                            arrayList2.add(this.f10004b.f9371d.e);
                            gVar.f9982a = this;
                        }
                    }
                }
            }
        } else {
            w.c cVar7 = cVarArr2[3];
            if (cVar7.f9363f != null) {
                f fVarH9 = o.h(cVar7);
                if (fVarH9 != null) {
                    o.b(fVar2, fVarH9, -this.f10004b.Q[3].e());
                    c(fVar3, fVar2, -1, gVar);
                    if (this.f10004b.E) {
                        c(fVar, fVar3, 1, this.f9997l);
                    }
                }
            } else {
                w.c cVar8 = cVarArr2[4];
                if (cVar8.f9363f != null) {
                    f fVarH10 = o.h(cVar8);
                    if (fVarH10 != null) {
                        o.b(fVar, fVarH10, 0);
                        c(fVar3, fVar, -1, this.f9997l);
                        c(fVar2, fVar3, 1, gVar);
                    }
                } else if (!(dVar16 instanceof w.i) && (dVar3 = dVar16.T) != null) {
                    o.b(fVar3, dVar3.e.h, dVar16.s());
                    c(fVar2, fVar3, 1, gVar);
                    if (this.f10004b.E) {
                        c(fVar, fVar3, 1, this.f9997l);
                    }
                    if (this.f10006d == 3) {
                        w.d dVar18 = this.f10004b;
                        if (dVar18.W > 0.0f) {
                            k kVar2 = dVar18.f9371d;
                            if (kVar2.f10006d == 3) {
                                kVar2.e.f9989k.add(gVar);
                                arrayList2.add(this.f10004b.f9371d.e);
                                gVar.f9982a = this;
                            }
                        }
                    }
                }
            }
        }
        if (arrayList2.size() == 0) {
            gVar.f9984c = true;
        }
    }

    @Override // x.o
    public final void e() {
        f fVar = this.h;
        if (fVar.f9988j) {
            this.f10004b.Z = fVar.f9987g;
        }
    }

    @Override // x.o
    public final void f() {
        this.f10005c = null;
        this.h.c();
        this.i.c();
        this.f9996k.c();
        this.e.c();
        this.f10008g = false;
    }

    @Override // x.o
    public final boolean k() {
        return this.f10006d != 3 || this.f10004b.f9395s == 0;
    }

    public final void m() {
        this.f10008g = false;
        f fVar = this.h;
        fVar.c();
        fVar.f9988j = false;
        f fVar2 = this.i;
        fVar2.c();
        fVar2.f9988j = false;
        f fVar3 = this.f9996k;
        fVar3.c();
        fVar3.f9988j = false;
        this.e.f9988j = false;
    }

    public final String toString() {
        return "VerticalRun " + this.f10004b.f9378h0;
    }
}

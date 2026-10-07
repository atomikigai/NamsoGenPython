package x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public w.d f10004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public l f10005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10006d;
    public final g e = new g(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10007f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10008g = false;
    public final f h = new f(this);
    public final f i = new f(this);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10009j = 1;

    public o(w.d dVar) {
        this.f10004b = dVar;
    }

    public static void b(f fVar, f fVar2, int i) {
        fVar.f9990l.add(fVar2);
        fVar.f9986f = i;
        fVar2.f9989k.add(fVar);
    }

    public static f h(w.c cVar) {
        w.c cVar2 = cVar.f9363f;
        if (cVar2 == null) {
            return null;
        }
        w.d dVar = cVar2.f9362d;
        int iD = u.e.d(cVar2.e);
        if (iD == 1) {
            return dVar.f9371d.h;
        }
        if (iD == 2) {
            return dVar.e.h;
        }
        if (iD == 3) {
            return dVar.f9371d.i;
        }
        if (iD == 4) {
            return dVar.e.i;
        }
        if (iD != 5) {
            return null;
        }
        return dVar.e.f9996k;
    }

    public static f i(w.c cVar, int i) {
        w.c cVar2 = cVar.f9363f;
        if (cVar2 == null) {
            return null;
        }
        w.d dVar = cVar2.f9362d;
        o oVar = i == 0 ? dVar.f9371d : dVar.e;
        int iD = u.e.d(cVar2.e);
        if (iD == 1 || iD == 2) {
            return oVar.h;
        }
        if (iD == 3 || iD == 4) {
            return oVar.i;
        }
        return null;
    }

    public final void c(f fVar, f fVar2, int i, g gVar) {
        fVar.f9990l.add(fVar2);
        fVar.f9990l.add(this.e);
        fVar.h = i;
        fVar.i = gVar;
        fVar2.f9989k.add(fVar);
        gVar.f9989k.add(fVar);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int i, int i10) {
        if (i10 == 0) {
            w.d dVar = this.f10004b;
            int i11 = dVar.f9398v;
            int iMax = Math.max(dVar.f9397u, i);
            if (i11 > 0) {
                iMax = Math.min(i11, i);
            }
            if (iMax != i) {
                return iMax;
            }
        } else {
            w.d dVar2 = this.f10004b;
            int i12 = dVar2.f9401y;
            int iMax2 = Math.max(dVar2.f9400x, i);
            if (i12 > 0) {
                iMax2 = Math.min(i12, i);
            }
            if (iMax2 != i) {
                return iMax2;
            }
        }
        return i;
    }

    public long j() {
        g gVar = this.e;
        if (gVar.f9988j) {
            return gVar.f9987g;
        }
        return 0L;
    }

    public abstract boolean k();

    /* JADX WARN: Code duplicated, block: B:28:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x0069  */
    public final void l(w.c cVar, w.c cVar2, int i) {
        g gVar;
        float f10;
        int i10;
        f fVarH = h(cVar);
        f fVarH2 = h(cVar2);
        if (fVarH.f9988j && fVarH2.f9988j) {
            int iE = cVar.e() + fVarH.f9987g;
            int iE2 = fVarH2.f9987g - cVar2.e();
            int i11 = iE2 - iE;
            g gVar2 = this.e;
            if (!gVar2.f9988j && this.f10006d == 3) {
                int i12 = this.f10003a;
                if (i12 == 0) {
                    gVar2.d(g(i11, i));
                } else if (i12 == 1) {
                    gVar2.d(Math.min(g(gVar2.f9991m, i), i11));
                } else if (i12 == 2) {
                    w.d dVar = this.f10004b;
                    w.d dVar2 = dVar.T;
                    if (dVar2 != null) {
                        g gVar3 = (i == 0 ? dVar2.f9371d : dVar2.e).e;
                        if (gVar3.f9988j) {
                            gVar2.d(g((int) ((gVar3.f9987g * (i == 0 ? dVar.f9399w : dVar.f9402z)) + 0.5f), i));
                        }
                    }
                } else if (i12 == 3) {
                    w.d dVar3 = this.f10004b;
                    o oVar = dVar3.f9371d;
                    if (oVar.f10006d == 3 && oVar.f10003a == 3) {
                        m mVar = dVar3.e;
                        if (mVar.f10006d != 3 || mVar.f10003a != 3) {
                            if (i == 0) {
                                oVar = dVar3.e;
                            }
                            gVar = oVar.e;
                            if (gVar.f9988j) {
                                f10 = dVar3.W;
                                if (i == 1) {
                                    i10 = (int) ((gVar.f9987g / f10) + 0.5f);
                                } else {
                                    i10 = (int) ((f10 * gVar.f9987g) + 0.5f);
                                }
                                gVar2.d(i10);
                            }
                        }
                    } else {
                        if (i == 0) {
                            oVar = dVar3.e;
                        }
                        gVar = oVar.e;
                        if (gVar.f9988j) {
                            f10 = dVar3.W;
                            if (i == 1) {
                                i10 = (int) ((gVar.f9987g / f10) + 0.5f);
                            } else {
                                i10 = (int) ((f10 * gVar.f9987g) + 0.5f);
                            }
                            gVar2.d(i10);
                        }
                    }
                }
            }
            if (gVar2.f9988j) {
                int i13 = gVar2.f9987g;
                f fVar = this.i;
                f fVar2 = this.h;
                if (i13 == i11) {
                    fVar2.d(iE);
                    fVar.d(iE2);
                    return;
                }
                w.d dVar4 = this.f10004b;
                float f11 = i == 0 ? dVar4.f9372d0 : dVar4.f9373e0;
                if (fVarH == fVarH2) {
                    iE = fVarH.f9987g;
                    iE2 = fVarH2.f9987g;
                    f11 = 0.5f;
                }
                fVar2.d((int) ((((iE2 - iE) - i13) * f11) + iE + 0.5f));
                fVar.d(fVar2.f9987g + gVar2.f9987g);
            }
        }
    }
}

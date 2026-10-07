package w;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends d {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public float f9437q0 = -1.0f;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f9438r0 = -1;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f9439s0 = -1;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public c f9440t0 = this.J;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f9441u0 = 0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f9442v0;

    public h() {
        this.R.clear();
        this.R.add(this.f9440t0);
        int length = this.Q.length;
        for (int i = 0; i < length; i++) {
            this.Q[i] = this.f9440t0;
        }
    }

    @Override // w.d
    public final boolean A() {
        return this.f9442v0;
    }

    @Override // w.d
    public final boolean B() {
        return this.f9442v0;
    }

    @Override // w.d
    public final void Q(u.c cVar, boolean z4) {
        if (this.T == null) {
            return;
        }
        c cVar2 = this.f9440t0;
        cVar.getClass();
        int iN = u.c.n(cVar2);
        if (this.f9441u0 == 1) {
            this.Y = iN;
            this.Z = 0;
            L(this.T.k());
            O(0);
            return;
        }
        this.Y = 0;
        this.Z = iN;
        O(this.T.q());
        L(0);
    }

    public final void R(int i) {
        this.f9440t0.l(i);
        this.f9442v0 = true;
    }

    public final void S(int i) {
        if (this.f9441u0 == i) {
            return;
        }
        this.f9441u0 = i;
        ArrayList arrayList = this.R;
        arrayList.clear();
        if (this.f9441u0 == 1) {
            this.f9440t0 = this.I;
        } else {
            this.f9440t0 = this.J;
        }
        arrayList.add(this.f9440t0);
        c[] cVarArr = this.Q;
        int length = cVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            cVarArr[i10] = this.f9440t0;
        }
    }

    @Override // w.d
    public final void b(u.c cVar, boolean z4) {
        e eVar = (e) this.T;
        if (eVar == null) {
            return;
        }
        Object objI = eVar.i(2);
        Object objI2 = eVar.i(4);
        d dVar = this.T;
        boolean z10 = dVar != null && dVar.f9392p0[0] == 2;
        if (this.f9441u0 == 0) {
            objI = eVar.i(3);
            objI2 = eVar.i(5);
            d dVar2 = this.T;
            z10 = dVar2 != null && dVar2.f9392p0[1] == 2;
        }
        if (this.f9442v0) {
            c cVar2 = this.f9440t0;
            if (cVar2.f9361c) {
                u.f fVarK = cVar.k(cVar2);
                cVar.d(fVarK, this.f9440t0.d());
                if (this.f9438r0 != -1) {
                    if (z10) {
                        cVar.f(cVar.k(objI2), fVarK, 0, 5);
                    }
                } else if (this.f9439s0 != -1 && z10) {
                    u.f fVarK2 = cVar.k(objI2);
                    cVar.f(fVarK, cVar.k(objI), 0, 5);
                    cVar.f(fVarK2, fVarK, 0, 5);
                }
                this.f9442v0 = false;
                return;
            }
        }
        if (this.f9438r0 != -1) {
            u.f fVarK3 = cVar.k(this.f9440t0);
            cVar.e(fVarK3, cVar.k(objI), this.f9438r0, 8);
            if (z10) {
                cVar.f(cVar.k(objI2), fVarK3, 0, 5);
                return;
            }
            return;
        }
        if (this.f9439s0 != -1) {
            u.f fVarK4 = cVar.k(this.f9440t0);
            u.f fVarK5 = cVar.k(objI2);
            cVar.e(fVarK4, fVarK5, -this.f9439s0, 8);
            if (z10) {
                cVar.f(fVarK4, cVar.k(objI), 0, 5);
                cVar.f(fVarK5, fVarK4, 0, 5);
                return;
            }
            return;
        }
        if (this.f9437q0 != -1.0f) {
            u.f fVarK6 = cVar.k(this.f9440t0);
            u.f fVarK7 = cVar.k(objI2);
            float f10 = this.f9437q0;
            u.b bVarL = cVar.l();
            bVarL.f8723d.g(fVarK6, -1.0f);
            bVarL.f8723d.g(fVarK7, f10);
            cVar.c(bVarL);
        }
    }

    @Override // w.d
    public final boolean c() {
        return true;
    }

    @Override // w.d
    public final c i(int i) {
        int iD = u.e.d(i);
        if (iD != 1) {
            if (iD != 2) {
                if (iD != 3) {
                    if (iD != 4) {
                        return null;
                    }
                }
            }
            if (this.f9441u0 == 0) {
                return this.f9440t0;
            }
            return null;
        }
        if (this.f9441u0 == 1) {
            return this.f9440t0;
        }
        return null;
    }
}

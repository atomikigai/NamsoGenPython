package w;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends i {

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f9341s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public boolean f9342t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f9343u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f9344v0;

    @Override // w.d
    public final boolean A() {
        return this.f9344v0;
    }

    @Override // w.d
    public final boolean B() {
        return this.f9344v0;
    }

    public final boolean T() {
        int i;
        int i10;
        int i11;
        boolean z4 = true;
        int i12 = 0;
        while (true) {
            i = this.f9444r0;
            if (i12 >= i) {
                break;
            }
            d dVar = this.f9443q0[i12];
            if ((this.f9342t0 || dVar.c()) && ((((i10 = this.f9341s0) == 0 || i10 == 1) && !dVar.A()) || (((i11 = this.f9341s0) == 2 || i11 == 3) && !dVar.B()))) {
                z4 = false;
            }
            i12++;
        }
        if (!z4 || i <= 0) {
            return false;
        }
        int iMax = 0;
        boolean z10 = false;
        for (int i13 = 0; i13 < this.f9444r0; i13++) {
            d dVar2 = this.f9443q0[i13];
            if (this.f9342t0 || dVar2.c()) {
                if (!z10) {
                    int i14 = this.f9341s0;
                    if (i14 == 0) {
                        iMax = dVar2.i(2).d();
                    } else if (i14 == 1) {
                        iMax = dVar2.i(4).d();
                    } else if (i14 == 2) {
                        iMax = dVar2.i(3).d();
                    } else if (i14 == 3) {
                        iMax = dVar2.i(5).d();
                    }
                    z10 = true;
                }
                int i15 = this.f9341s0;
                if (i15 == 0) {
                    iMax = Math.min(iMax, dVar2.i(2).d());
                } else if (i15 == 1) {
                    iMax = Math.max(iMax, dVar2.i(4).d());
                } else if (i15 == 2) {
                    iMax = Math.min(iMax, dVar2.i(3).d());
                } else if (i15 == 3) {
                    iMax = Math.max(iMax, dVar2.i(5).d());
                }
            }
        }
        int i16 = iMax + this.f9343u0;
        int i17 = this.f9341s0;
        if (i17 == 0 || i17 == 1) {
            J(i16, i16);
        } else {
            K(i16, i16);
        }
        this.f9344v0 = true;
        return true;
    }

    public final int U() {
        int i = this.f9341s0;
        if (i == 0 || i == 1) {
            return 0;
        }
        return (i == 2 || i == 3) ? 1 : -1;
    }

    @Override // w.d
    public final void b(u.c cVar, boolean z4) {
        boolean z10;
        int i;
        int i10;
        c[] cVarArr = this.Q;
        c cVar2 = this.I;
        cVarArr[0] = cVar2;
        int i11 = 2;
        c cVar3 = this.J;
        cVarArr[2] = cVar3;
        c cVar4 = this.K;
        cVarArr[1] = cVar4;
        c cVar5 = this.L;
        cVarArr[3] = cVar5;
        for (c cVar6 : cVarArr) {
            cVar6.i = cVar.k(cVar6);
        }
        int i12 = this.f9341s0;
        if (i12 < 0 || i12 >= 4) {
            return;
        }
        c cVar7 = cVarArr[i12];
        if (!this.f9344v0) {
            T();
        }
        if (this.f9344v0) {
            this.f9344v0 = false;
            int i13 = this.f9341s0;
            if (i13 == 0 || i13 == 1) {
                cVar.d(cVar2.i, this.Y);
                cVar.d(cVar4.i, this.Y);
                return;
            } else {
                if (i13 == 2 || i13 == 3) {
                    cVar.d(cVar3.i, this.Z);
                    cVar.d(cVar5.i, this.Z);
                    return;
                }
                return;
            }
        }
        int i14 = 0;
        while (true) {
            if (i14 >= this.f9444r0) {
                z10 = false;
                break;
            }
            d dVar = this.f9443q0[i14];
            if ((this.f9342t0 || dVar.c()) && ((((i10 = this.f9341s0) == 0 || i10 == 1) && dVar.f9392p0[0] == 3 && dVar.I.f9363f != null && dVar.K.f9363f != null) || ((i10 == 2 || i10 == 3) && dVar.f9392p0[1] == 3 && dVar.J.f9363f != null && dVar.L.f9363f != null))) {
                z10 = true;
                break;
            }
            i14++;
        }
        boolean z11 = cVar2.g() || cVar4.g();
        boolean z12 = cVar3.g() || cVar5.g();
        int i15 = !(!z10 && (((i = this.f9341s0) == 0 && z11) || ((i == 2 && z12) || ((i == 1 && z11) || (i == 3 && z12))))) ? 4 : 5;
        int i16 = 0;
        while (i16 < this.f9444r0) {
            d dVar2 = this.f9443q0[i16];
            if (this.f9342t0 || dVar2.c()) {
                u.f fVarK = cVar.k(dVar2.Q[this.f9341s0]);
                c[] cVarArr2 = dVar2.Q;
                int i17 = this.f9341s0;
                c cVar8 = cVarArr2[i17];
                cVar8.i = fVarK;
                c cVar9 = cVar8.f9363f;
                int i18 = (cVar9 == null || cVar9.f9362d != this) ? 0 : cVar8.f9364g;
                if (i17 == 0 || i17 == i11) {
                    u.f fVar = cVar7.i;
                    int i19 = this.f9343u0 - i18;
                    u.b bVarL = cVar.l();
                    u.f fVarM = cVar.m();
                    fVarM.f8744d = 0;
                    bVarL.c(fVar, fVarK, fVarM, i19);
                    cVar.c(bVarL);
                } else {
                    u.f fVar2 = cVar7.i;
                    int i20 = this.f9343u0 + i18;
                    u.b bVarL2 = cVar.l();
                    u.f fVarM2 = cVar.m();
                    fVarM2.f8744d = 0;
                    bVarL2.b(fVar2, fVarK, fVarM2, i20);
                    cVar.c(bVarL2);
                }
                cVar.e(cVar7.i, fVarK, this.f9343u0 + i18, i15);
            }
            i16++;
            i11 = 2;
        }
        int i21 = this.f9341s0;
        if (i21 == 0) {
            cVar.e(cVar4.i, cVar2.i, 0, 8);
            cVar.e(cVar2.i, this.T.K.i, 0, 4);
            cVar.e(cVar2.i, this.T.I.i, 0, 0);
            return;
        }
        if (i21 == 1) {
            cVar.e(cVar2.i, cVar4.i, 0, 8);
            cVar.e(cVar2.i, this.T.I.i, 0, 4);
            cVar.e(cVar2.i, this.T.K.i, 0, 0);
        } else if (i21 == 2) {
            cVar.e(cVar5.i, cVar3.i, 0, 8);
            cVar.e(cVar3.i, this.T.L.i, 0, 4);
            cVar.e(cVar3.i, this.T.J.i, 0, 0);
        } else if (i21 == 3) {
            cVar.e(cVar3.i, cVar5.i, 0, 8);
            cVar.e(cVar3.i, this.T.J.i, 0, 4);
            cVar.e(cVar3.i, this.T.L.i, 0, 0);
        }
    }

    @Override // w.d
    public final boolean c() {
        return true;
    }

    @Override // w.d
    public final String toString() {
        String strM = q1.a.m(new StringBuilder("[Barrier] "), this.f9378h0, " {");
        for (int i = 0; i < this.f9444r0; i++) {
            d dVar = this.f9443q0[i];
            if (i > 0) {
                strM = v.h(strM, ", ");
            }
            StringBuilder sbB = u.e.b(strM);
            sbB.append(dVar.f9378h0);
            strM = sbB.toString();
        }
        return v.h(strM, "}");
    }
}

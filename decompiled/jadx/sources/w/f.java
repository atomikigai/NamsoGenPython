package w;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9413a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c f9416d;
    public c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f9417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f9418g;
    public int h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f9419j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f9420k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f9426q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f9427r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d f9414b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f9415c = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f9421l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f9422m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f9423n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f9424o = 0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f9425p = 0;

    public f(g gVar, int i, c cVar, c cVar2, c cVar3, c cVar4, int i10) {
        this.f9427r = gVar;
        this.f9413a = i;
        this.f9416d = cVar;
        this.e = cVar2;
        this.f9417f = cVar3;
        this.f9418g = cVar4;
        this.h = gVar.f9433w0;
        this.i = gVar.f9429s0;
        this.f9419j = gVar.f9434x0;
        this.f9420k = gVar.f9430t0;
        this.f9426q = i10;
    }

    public final void a(d dVar) {
        int i = this.f9413a;
        g gVar = this.f9427r;
        if (i == 0) {
            int iU = gVar.U(dVar, this.f9426q);
            if (dVar.f9392p0[0] == 3) {
                this.f9425p++;
                iU = 0;
            }
            this.f9421l = iU + (dVar.f9377g0 != 8 ? gVar.P0 : 0) + this.f9421l;
            int iT = gVar.T(dVar, this.f9426q);
            if (this.f9414b == null || this.f9415c < iT) {
                this.f9414b = dVar;
                this.f9415c = iT;
                this.f9422m = iT;
            }
        } else {
            int iU2 = gVar.U(dVar, this.f9426q);
            int iT2 = gVar.T(dVar, this.f9426q);
            if (dVar.f9392p0[1] == 3) {
                this.f9425p++;
                iT2 = 0;
            }
            this.f9422m = iT2 + (dVar.f9377g0 != 8 ? gVar.Q0 : 0) + this.f9422m;
            if (this.f9414b == null || this.f9415c < iU2) {
                this.f9414b = dVar;
                this.f9415c = iU2;
                this.f9421l = iU2;
            }
        }
        this.f9424o++;
    }

    public final void b(boolean z4, int i, boolean z10) {
        g gVar;
        int i10;
        int i11;
        d dVar;
        boolean z11;
        char c10;
        float f10;
        float f11;
        int i12;
        float f12;
        float f13;
        int i13;
        int i14 = this.f9424o;
        int i15 = 0;
        while (true) {
            gVar = this.f9427r;
            if (i15 >= i14 || (i13 = this.f9423n + i15) >= gVar.f9428b1) {
                break;
            }
            d dVar2 = gVar.a1[i13];
            if (dVar2 != null) {
                dVar2.D();
            }
            i15++;
        }
        if (i14 == 0 || this.f9414b == null) {
            return;
        }
        boolean z12 = z10 && i == 0;
        int i16 = -1;
        int i17 = -1;
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = this.f9423n + (z4 ? (i14 - 1) - i18 : i18);
            if (i19 >= gVar.f9428b1) {
                break;
            }
            d dVar3 = gVar.a1[i19];
            if (dVar3 != null && dVar3.f9377g0 == 0) {
                if (i16 == -1) {
                    i16 = i18;
                }
                i17 = i18;
            }
        }
        if (this.f9413a == 0) {
            d dVar4 = this.f9414b;
            dVar4.f9381j0 = gVar.E0;
            c cVar = dVar4.L;
            c cVar2 = dVar4.J;
            int i20 = this.i;
            if (i > 0) {
                i20 += gVar.Q0;
            }
            cVar2.a(this.e, i20);
            if (z10) {
                cVar.a(this.f9418g, this.f9420k);
            }
            if (i > 0) {
                this.e.f9362d.L.a(cVar2, 0);
            }
            if (gVar.S0 != 3 || dVar4.E) {
                dVar = dVar4;
                break;
            }
            int i21 = 0;
            while (true) {
                if (i21 < i14) {
                    int i22 = this.f9423n + (z4 ? (i14 - 1) - i21 : i21);
                    if (i22 < gVar.f9428b1) {
                        dVar = gVar.a1[i22];
                        if (dVar.E) {
                            break;
                        } else {
                            i21++;
                        }
                    }
                }
                dVar = dVar4;
                break;
            }
            int i23 = 0;
            d dVar5 = null;
            while (i23 < i14) {
                int i24 = z4 ? (i14 - 1) - i23 : i23;
                int i25 = this.f9423n + i24;
                if (i25 >= gVar.f9428b1) {
                    return;
                }
                d dVar6 = gVar.a1[i25];
                if (dVar6 == null) {
                    i14 = i14;
                    z11 = z12;
                    i17 = i17;
                    c10 = 3;
                } else {
                    c cVar3 = dVar6.L;
                    c cVar4 = dVar6.J;
                    c cVar5 = dVar6.I;
                    z11 = z12;
                    if (i23 == 0) {
                        dVar6.f(cVar5, this.f9416d, this.h);
                    }
                    if (i24 == 0) {
                        int i26 = gVar.D0;
                        if (z4) {
                            f10 = 1.0f;
                            f11 = 1.0f - gVar.J0;
                        } else {
                            f10 = 1.0f;
                            f11 = gVar.J0;
                        }
                        if (this.f9423n != 0 || (i12 = gVar.F0) == -1) {
                            if (!z10 || (i12 = gVar.H0) == -1) {
                                i12 = i26;
                                f12 = f11;
                            } else if (z4) {
                                f13 = gVar.N0;
                                f12 = f10 - f13;
                            } else {
                                f12 = gVar.N0;
                            }
                        } else if (z4) {
                            f13 = gVar.L0;
                            f12 = f10 - f13;
                        } else {
                            f12 = gVar.L0;
                        }
                        dVar6.f9379i0 = i12;
                        dVar6.f9372d0 = f12;
                    }
                    if (i23 == i14 - 1) {
                        dVar6.f(dVar6.K, this.f9417f, this.f9419j);
                    }
                    if (dVar5 != null) {
                        c cVar6 = dVar5.K;
                        cVar5.a(cVar6, gVar.P0);
                        if (i23 == i16) {
                            int i27 = this.h;
                            if (cVar5.h()) {
                                cVar5.h = i27;
                            }
                        }
                        cVar6.a(cVar5, 0);
                        if (i23 == i17 + 1) {
                            int i28 = this.f9419j;
                            if (cVar6.h()) {
                                cVar6.h = i28;
                            }
                        }
                    }
                    if (dVar6 != dVar4) {
                        int i29 = gVar.S0;
                        c10 = 3;
                        if (i29 == 3 && dVar.E && dVar6 != dVar && dVar6.E) {
                            dVar6.M.a(dVar.M, 0);
                        } else if (i29 == 0) {
                            cVar4.a(cVar2, 0);
                        } else if (i29 == 1) {
                            cVar3.a(cVar, 0);
                        } else if (z11) {
                            cVar4.a(this.e, this.i);
                            cVar3.a(this.f9418g, this.f9420k);
                        } else {
                            cVar4.a(cVar2, 0);
                            cVar3.a(cVar, 0);
                        }
                    } else {
                        c10 = 3;
                    }
                    dVar5 = dVar6;
                }
                i23++;
                z12 = z11;
                i17 = i17;
                i14 = i14;
            }
            return;
        }
        int i30 = i14;
        boolean z13 = z12;
        int i31 = i17;
        d dVar7 = this.f9414b;
        dVar7.f9379i0 = gVar.D0;
        c cVar7 = dVar7.I;
        c cVar8 = dVar7.K;
        int i32 = this.h;
        if (i > 0) {
            i32 += gVar.P0;
        }
        if (z4) {
            cVar8.a(this.f9417f, i32);
            if (z10) {
                cVar7.a(this.f9416d, this.f9419j);
            }
            if (i > 0) {
                this.f9417f.f9362d.I.a(cVar8, 0);
            }
        } else {
            cVar7.a(this.f9416d, i32);
            if (z10) {
                cVar8.a(this.f9417f, this.f9419j);
            }
            if (i > 0) {
                this.f9416d.f9362d.K.a(cVar7, 0);
            }
        }
        int i33 = 0;
        d dVar8 = null;
        while (true) {
            int i34 = i30;
            if (i33 >= i34 || (i10 = this.f9423n + i33) >= gVar.f9428b1) {
                return;
            }
            d dVar9 = gVar.a1[i10];
            if (dVar9 == null) {
                i30 = i34;
            } else {
                c cVar9 = dVar9.J;
                c cVar10 = dVar9.K;
                c cVar11 = dVar9.I;
                if (i33 == 0) {
                    dVar9.f(cVar9, this.e, this.i);
                    int i35 = gVar.E0;
                    float f14 = gVar.K0;
                    if (this.f9423n == 0) {
                        int i36 = gVar.G0;
                        i30 = i34;
                        i11 = -1;
                        if (i36 != -1) {
                            f14 = gVar.M0;
                        }
                        i35 = i36;
                        dVar9.f9381j0 = i35;
                        dVar9.f9373e0 = f14;
                    } else {
                        i30 = i34;
                        i11 = -1;
                    }
                    if (z10 && (i36 = gVar.I0) != i11) {
                        f14 = gVar.O0;
                        i35 = i36;
                    }
                    dVar9.f9381j0 = i35;
                    dVar9.f9373e0 = f14;
                } else {
                    i30 = i34;
                }
                if (i33 == i30 - 1) {
                    dVar9.f(dVar9.L, this.f9418g, this.f9420k);
                }
                if (dVar8 != null) {
                    c cVar12 = dVar8.L;
                    cVar9.a(cVar12, gVar.Q0);
                    if (i33 == i16) {
                        int i37 = this.i;
                        if (cVar9.h()) {
                            cVar9.h = i37;
                        }
                    }
                    cVar12.a(cVar9, 0);
                    if (i33 == i31 + 1) {
                        int i38 = this.f9420k;
                        if (cVar12.h()) {
                            cVar12.h = i38;
                        }
                    }
                }
                if (dVar9 != dVar7) {
                    if (z4) {
                        int i39 = gVar.R0;
                        if (i39 == 0) {
                            cVar10.a(cVar8, 0);
                        } else if (i39 == 1) {
                            cVar11.a(cVar7, 0);
                        } else if (i39 == 2) {
                            cVar11.a(cVar7, 0);
                            cVar10.a(cVar8, 0);
                        }
                    } else {
                        int i40 = gVar.R0;
                        if (i40 == 0) {
                            cVar11.a(cVar7, 0);
                        } else if (i40 == 1) {
                            cVar10.a(cVar8, 0);
                        } else if (i40 == 2) {
                            if (z13) {
                                cVar11.a(this.f9416d, this.h);
                                cVar10.a(this.f9417f, this.f9419j);
                            } else {
                                cVar11.a(cVar7, 0);
                                cVar10.a(cVar8, 0);
                            }
                        }
                    }
                }
                dVar8 = dVar9;
            }
            i33++;
        }
    }

    public final int c() {
        return this.f9413a == 1 ? this.f9422m - this.f9427r.Q0 : this.f9422m;
    }

    public final int d() {
        return this.f9413a == 0 ? this.f9421l - this.f9427r.P0 : this.f9421l;
    }

    public final void e(int i) {
        g gVar;
        int i10;
        int i11 = this.f9425p;
        if (i11 == 0) {
            return;
        }
        int i12 = this.f9424o;
        int i13 = i / i11;
        int i14 = 0;
        while (true) {
            gVar = this.f9427r;
            if (i14 >= i12 || (i10 = this.f9423n + i14) >= gVar.f9428b1) {
                break;
            }
            d dVar = gVar.a1[i10];
            if (this.f9413a == 0) {
                if (dVar != null) {
                    int[] iArr = dVar.f9392p0;
                    if (iArr[0] == 3 && dVar.f9394r == 0) {
                        gVar.V(1, i13, iArr[1], dVar.k(), dVar);
                    }
                }
            } else if (dVar != null) {
                int[] iArr2 = dVar.f9392p0;
                if (iArr2[1] == 3 && dVar.f9395s == 0) {
                    int i15 = i13;
                    gVar.V(iArr2[0], dVar.q(), 1, i15, dVar);
                    i13 = i15;
                }
            }
            i14++;
        }
        this.f9421l = 0;
        this.f9422m = 0;
        this.f9414b = null;
        this.f9415c = 0;
        int i16 = this.f9424o;
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = this.f9423n + i17;
            if (i18 >= gVar.f9428b1) {
                return;
            }
            d dVar2 = gVar.a1[i18];
            if (this.f9413a == 0) {
                int iQ = dVar2.q();
                int i19 = gVar.P0;
                if (dVar2.f9377g0 == 8) {
                    i19 = 0;
                }
                this.f9421l = iQ + i19 + this.f9421l;
                int iT = gVar.T(dVar2, this.f9426q);
                if (this.f9414b == null || this.f9415c < iT) {
                    this.f9414b = dVar2;
                    this.f9415c = iT;
                    this.f9422m = iT;
                }
            } else {
                int iU = gVar.U(dVar2, this.f9426q);
                int iT2 = gVar.T(dVar2, this.f9426q);
                int i20 = gVar.Q0;
                if (dVar2.f9377g0 == 8) {
                    i20 = 0;
                }
                this.f9422m = iT2 + i20 + this.f9422m;
                if (this.f9414b == null || this.f9415c < iU) {
                    this.f9414b = dVar2;
                    this.f9415c = iU;
                    this.f9421l = iU;
                }
            }
        }
    }

    public final void f(int i, c cVar, c cVar2, c cVar3, c cVar4, int i10, int i11, int i12, int i13, int i14) {
        this.f9413a = i;
        this.f9416d = cVar;
        this.e = cVar2;
        this.f9417f = cVar3;
        this.f9418g = cVar4;
        this.h = i10;
        this.i = i11;
        this.f9419j = i12;
        this.f9420k = i13;
        this.f9426q = i14;
    }
}

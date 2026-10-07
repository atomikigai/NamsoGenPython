package w;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean[] f9445a = new boolean[3];

    /* JADX WARN: Code duplicated, block: B:188:0x0292  */
    /* JADX WARN: Code duplicated, block: B:205:0x02db  */
    /* JADX WARN: Code duplicated, block: B:207:0x02de  */
    /* JADX WARN: Code duplicated, block: B:209:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:232:0x0376  */
    /* JADX WARN: Code duplicated, block: B:234:0x0392  */
    /* JADX WARN: Code duplicated, block: B:236:0x0397  */
    /* JADX WARN: Code duplicated, block: B:240:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:251:0x042b  */
    /* JADX WARN: Code duplicated, block: B:406:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:409:0x06b2  */
    /* JADX WARN: Code duplicated, block: B:410:0x06b5  */
    /* JADX WARN: Code duplicated, block: B:413:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:414:0x06be  */
    /* JADX WARN: Code duplicated, block: B:416:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:418:0x06ca  */
    /* JADX WARN: Code duplicated, block: B:421:0x06d2  */
    /* JADX WARN: Code duplicated, block: B:423:0x06d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:433:0x06f2 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0114  */
    public static void a(e eVar, u.c cVar, ArrayList arrayList, int i) {
        int i10;
        b[] bVarArr;
        int i11;
        int i12;
        boolean z4;
        boolean z10;
        boolean z11;
        int i13;
        d dVar;
        u.c cVar2;
        u.f fVar;
        c cVar3;
        u.f fVar2;
        d dVar2;
        int i14;
        c cVar4;
        u.f fVar3;
        d dVar3;
        int i15;
        c[] cVarArr;
        int i16;
        c cVar5;
        c cVar6;
        u.f fVar4;
        c cVar7;
        u.f fVar5;
        int size;
        ArrayList arrayList2;
        int i17;
        float f10;
        u.f fVar6;
        u.f fVar7;
        u.f fVar8;
        u.f fVar9;
        u.b bVarL;
        float f11;
        c cVar8;
        d dVar4;
        int i18;
        int i19;
        d dVar5;
        e eVar2 = eVar;
        if (i == 0) {
            i10 = eVar2.f9412z0;
            bVarArr = eVar2.C0;
            i11 = 0;
        } else {
            i10 = eVar2.A0;
            bVarArr = eVar2.B0;
            i11 = 2;
        }
        int i20 = i10;
        b[] bVarArr2 = bVarArr;
        int i21 = 0;
        while (i21 < i20) {
            b bVar = bVarArr2[i21];
            boolean z12 = bVar.f9358q;
            d dVar6 = bVar.f9345a;
            c[] cVarArr2 = dVar6.Q;
            int i22 = 3;
            int i23 = 8;
            float f12 = 0.0f;
            if (z12) {
                i12 = i21;
            } else {
                int i24 = bVar.f9353l;
                int i25 = i24 * 2;
                d dVar7 = dVar6;
                d dVar8 = dVar7;
                boolean z13 = false;
                while (!z13) {
                    bVar.i++;
                    d[] dVarArr = dVar7.f9386m0;
                    c[] cVarArr3 = dVar7.Q;
                    dVarArr[i24] = null;
                    dVar7.f9384l0[i24] = null;
                    if (dVar7.f9377g0 != i23) {
                        dVar7.j(i24);
                        cVarArr3[i25].e();
                        int i26 = i25 + 1;
                        cVarArr3[i26].e();
                        cVarArr3[i25].e();
                        cVarArr3[i26].e();
                        if (bVar.f9346b == null) {
                            bVar.f9346b = dVar7;
                        }
                        bVar.f9348d = dVar7;
                        int i27 = dVar7.f9392p0[i24];
                        if (i27 == i22) {
                            int i28 = dVar7.f9396t[i24];
                            if (i28 == 0 || i28 == i22 || i28 == 2) {
                                bVar.f9351j++;
                                float f13 = dVar7.k0[i24];
                                if (f13 > 0.0f) {
                                    bVar.f9352k += f13;
                                }
                                i19 = i24;
                                if (dVar7.f9377g0 != 8 && i27 == 3 && (i28 == 0 || i28 == 3)) {
                                    if (f13 < 0.0f) {
                                        bVar.f9355n = true;
                                    } else {
                                        bVar.f9356o = true;
                                    }
                                    if (bVar.h == null) {
                                        bVar.h = new ArrayList();
                                    }
                                    bVar.h.add(dVar7);
                                }
                                if (bVar.f9349f == null) {
                                    bVar.f9349f = dVar7;
                                }
                                d dVar9 = bVar.f9350g;
                                if (dVar9 != null) {
                                    dVar9.f9384l0[i19] = dVar7;
                                }
                                bVar.f9350g = dVar7;
                            } else {
                                i21 = i21;
                                i19 = i24;
                            }
                            if (i19 == 0) {
                                if (dVar7.f9394r == 0 && dVar7.f9397u == 0) {
                                    int i29 = dVar7.f9398v;
                                }
                            } else if (dVar7.f9395s == 0 && dVar7.f9400x == 0) {
                                int i30 = dVar7.f9401y;
                            }
                        } else {
                            i21 = i21;
                            i19 = i24;
                        }
                    } else {
                        i21 = i21;
                        i19 = i24;
                    }
                    d dVar10 = dVar8;
                    if (dVar10 != dVar7) {
                        dVar10.f9386m0[i19] = dVar7;
                    }
                    c cVar9 = cVarArr3[i25 + 1].f9363f;
                    if (cVar9 != null) {
                        dVar5 = cVar9.f9362d;
                        c cVar10 = dVar5.Q[i25].f9363f;
                        if (cVar10 == null || cVar10.f9362d != dVar7) {
                            dVar5 = null;
                        }
                    } else {
                        dVar5 = null;
                    }
                    if (dVar5 == null) {
                        dVar5 = dVar7;
                        z13 = true;
                    }
                    dVar8 = dVar7;
                    i24 = i19;
                    i22 = 3;
                    i23 = 8;
                    dVar7 = dVar5;
                    i21 = i21;
                }
                i12 = i21;
                int i31 = i24;
                d dVar11 = bVar.f9346b;
                if (dVar11 != null) {
                    dVar11.Q[i25].e();
                }
                d dVar12 = bVar.f9348d;
                if (dVar12 != null) {
                    dVar12.Q[i25 + 1].e();
                }
                bVar.f9347c = dVar7;
                if (i31 == 0 && bVar.f9354m) {
                    bVar.e = dVar7;
                } else {
                    bVar.e = dVar6;
                }
                bVar.f9357p = bVar.f9356o && bVar.f9355n;
            }
            bVar.f9358q = true;
            if (arrayList == 0 || arrayList.contains(dVar6)) {
                d dVar13 = bVar.f9347c;
                d dVar14 = bVar.f9346b;
                d dVar15 = bVar.f9348d;
                d dVar16 = bVar.e;
                float f14 = bVar.f9352k;
                int[] iArr = eVar2.f9392p0;
                c[] cVarArr4 = eVar2.Q;
                boolean z14 = iArr[i] == 2;
                if (i == 0) {
                    int i32 = dVar16.f9379i0;
                    boolean z15 = i32 == 0;
                    boolean z16 = i32 == 1;
                    z4 = i32 == 2;
                    z11 = z16;
                    z10 = z15;
                } else {
                    int i33 = dVar16.f9381j0;
                    boolean z17 = i33 == 0;
                    boolean z18 = i33 == 1;
                    z4 = i33 == 2;
                    z10 = z17;
                    z11 = z18;
                }
                boolean z19 = false;
                while (!z19) {
                    c[] cVarArr5 = dVar6.Q;
                    int[] iArr2 = dVar6.f9392p0;
                    c cVar11 = cVarArr5[i11];
                    int i34 = z4 ? 1 : 4;
                    int iE = cVar11.e();
                    boolean z20 = z14;
                    boolean z21 = z4;
                    boolean z22 = iArr2[i] == 3 && dVar6.f9396t[i] == 0;
                    c cVar12 = cVar11.f9363f;
                    if (cVar12 != null && dVar6 != dVar6) {
                        iE = cVar12.e() + iE;
                    }
                    int i35 = iE;
                    if (z21 && dVar6 != dVar6 && dVar6 != dVar14) {
                        i34 = 8;
                    }
                    d dVar17 = dVar6;
                    c cVar13 = cVar11.f9363f;
                    if (cVar13 != null) {
                        if (dVar6 == dVar14) {
                            cVar.f(cVar11.i, cVar13.i, i35, 6);
                        } else {
                            cVar.f(cVar11.i, cVar13.i, i35, 8);
                        }
                        if (z22 && !z21) {
                            i34 = 5;
                        }
                        cVar.e(cVar11.i, cVar11.f9363f.i, i35, (dVar6 == dVar14 && z21 && dVar6.S[i]) ? 5 : i34);
                    }
                    if (z20) {
                        if (dVar6.f9377g0 == 8 || iArr2[i] != 3) {
                            i18 = 0;
                        } else {
                            i18 = 0;
                            cVar.f(cVarArr5[i11 + 1].i, cVarArr5[i11].i, 0, 5);
                        }
                        cVar.f(cVarArr5[i11].i, cVarArr4[i11].i, i18, 8);
                    }
                    c cVar14 = cVarArr5[i11 + 1].f9363f;
                    if (cVar14 != null) {
                        dVar4 = cVar14.f9362d;
                        c cVar15 = dVar4.Q[i11].f9363f;
                        if (cVar15 == null || cVar15.f9362d != dVar6) {
                            dVar4 = null;
                        }
                    } else {
                        dVar4 = null;
                    }
                    if (dVar4 != null) {
                        dVar6 = dVar4;
                    } else {
                        z19 = true;
                    }
                    dVar6 = dVar17;
                    z14 = z20;
                    z4 = z21;
                }
                boolean z23 = z14;
                boolean z24 = z4;
                if (dVar15 != null) {
                    int i36 = i11 + 1;
                    if (dVar13.Q[i36].f9363f != null) {
                        c cVar16 = dVar15.Q[i36];
                        if (dVar15.f9392p0[i] == 3 && dVar15.f9396t[i] == 0 && !z24) {
                            c cVar17 = cVar16.f9363f;
                            if (cVar17.f9362d == eVar2) {
                                cVar.e(cVar16.i, cVar17.i, -cVar16.e(), 5);
                            } else if (z24) {
                                cVar8 = cVar16.f9363f;
                                if (cVar8.f9362d == eVar2) {
                                    cVar.e(cVar16.i, cVar8.i, -cVar16.e(), 4);
                                }
                            }
                        } else if (z24) {
                            cVar8 = cVar16.f9363f;
                            if (cVar8.f9362d == eVar2) {
                                cVar.e(cVar16.i, cVar8.i, -cVar16.e(), 4);
                            }
                        }
                        cVar.g(cVar16.i, dVar13.Q[i36].f9363f.i, -cVar16.e(), 6);
                    }
                }
                if (z23) {
                    int i37 = i11 + 1;
                    u.f fVar10 = cVarArr4[i37].i;
                    c cVar18 = dVar13.Q[i37];
                    cVar.f(fVar10, cVar18.i, cVar18.e(), 8);
                }
                ArrayList arrayList3 = bVar.h;
                if (arrayList3 != null && (size = arrayList3.size()) > 1) {
                    if (bVar.f9355n && !bVar.f9357p) {
                        f14 = bVar.f9351j;
                    }
                    d dVar18 = null;
                    float f15 = 0.0f;
                    int i38 = 0;
                    while (i38 < size) {
                        d dVar19 = (d) arrayList3.get(i38);
                        float[] fArr = dVar19.k0;
                        c[] cVarArr6 = dVar19.Q;
                        float f16 = fArr[i];
                        if (f16 >= f12) {
                            arrayList2 = arrayList3;
                            i17 = size;
                            if (f16 == f12) {
                                cVar.e(cVarArr6[i11 + 1].i, cVarArr6[i11].i, 0, 8);
                                i38 = i38;
                                f10 = f12;
                                f15 = f15;
                                i20 = i20;
                            } else {
                                float f17 = f15;
                                if (dVar18 != null) {
                                    c[] cVarArr7 = dVar18.Q;
                                    fVar6 = cVarArr7[i11].i;
                                    int i39 = i11 + 1;
                                    fVar7 = cVarArr7[i39].i;
                                    fVar8 = cVarArr6[i11].i;
                                    fVar9 = cVarArr6[i39].i;
                                    bVarL = cVar.l();
                                    f11 = f12;
                                    bVarL.f8721b = f11;
                                    f10 = f11;
                                    if (f14 != f11 || f17 == f16) {
                                        bVarL.f8723d.g(fVar6, 1.0f);
                                        bVarL.f8723d.g(fVar7, -1.0f);
                                        bVarL.f8723d.g(fVar9, 1.0f);
                                        bVarL.f8723d.g(fVar8, -1.0f);
                                    } else if (f17 == f10) {
                                        bVarL.f8723d.g(fVar6, 1.0f);
                                        bVarL.f8723d.g(fVar7, -1.0f);
                                    } else if (f16 == f12) {
                                        bVarL.f8723d.g(fVar8, 1.0f);
                                        bVarL.f8723d.g(fVar9, -1.0f);
                                    } else {
                                        float f18 = (f17 / f14) / (f16 / f14);
                                        bVarL.f8723d.g(fVar6, 1.0f);
                                        bVarL.f8723d.g(fVar7, -1.0f);
                                        bVarL.f8723d.g(fVar9, f18);
                                        bVarL.f8723d.g(fVar8, -f18);
                                    }
                                    cVar.c(bVarL);
                                } else {
                                    i38 = i38;
                                    f10 = f12;
                                    i20 = i20;
                                }
                                f15 = f16;
                                dVar18 = dVar19;
                            }
                        } else {
                            if (bVar.f9357p) {
                                arrayList2 = arrayList3;
                                i17 = size;
                                cVar.e(cVarArr6[i11 + 1].i, cVarArr6[i11].i, 0, 4);
                            } else {
                                f16 = 1.0f;
                                arrayList2 = arrayList3;
                                i17 = size;
                                if (f16 == f12) {
                                    cVar.e(cVarArr6[i11 + 1].i, cVarArr6[i11].i, 0, 8);
                                } else {
                                    float f19 = f15;
                                    if (dVar18 != null) {
                                        c[] cVarArr8 = dVar18.Q;
                                        fVar6 = cVarArr8[i11].i;
                                        int i310 = i11 + 1;
                                        fVar7 = cVarArr8[i310].i;
                                        fVar8 = cVarArr6[i11].i;
                                        fVar9 = cVarArr6[i310].i;
                                        bVarL = cVar.l();
                                        f11 = f12;
                                        bVarL.f8721b = f11;
                                        f10 = f11;
                                        if (f14 != f11) {
                                            bVarL.f8723d.g(fVar6, 1.0f);
                                            bVarL.f8723d.g(fVar7, -1.0f);
                                            bVarL.f8723d.g(fVar9, 1.0f);
                                            bVarL.f8723d.g(fVar8, -1.0f);
                                        } else {
                                            bVarL.f8723d.g(fVar6, 1.0f);
                                            bVarL.f8723d.g(fVar7, -1.0f);
                                            bVarL.f8723d.g(fVar9, 1.0f);
                                            bVarL.f8723d.g(fVar8, -1.0f);
                                        }
                                        cVar.c(bVarL);
                                    } else {
                                        i38 = i38;
                                        f10 = f12;
                                        i20 = i20;
                                    }
                                    f15 = f16;
                                    dVar18 = dVar19;
                                }
                            }
                            i38 = i38;
                            f10 = f12;
                            f15 = f15;
                            i20 = i20;
                        }
                        i38++;
                        i20 = i20;
                        arrayList3 = arrayList2;
                        size = i17;
                        f12 = f10;
                    }
                }
                i13 = i20;
                if (dVar14 == null || !(dVar14 == dVar15 || z24)) {
                    dVar = dVar15;
                    if (!z10 || dVar14 == null) {
                        int i40 = 8;
                        if (z11 && dVar14 != null) {
                            int i41 = bVar.f9351j;
                            boolean z25 = i41 > 0 && bVar.i == i41;
                            d dVar20 = dVar14;
                            d dVar21 = dVar20;
                            while (dVar21 != null) {
                                c[] cVarArr9 = dVar21.Q;
                                d dVar22 = dVar21.f9386m0[i];
                                while (dVar22 != null && dVar22.f9377g0 == i40) {
                                    dVar22 = dVar22.f9386m0[i];
                                }
                                if (dVar21 == dVar14 || dVar21 == dVar || dVar22 == null) {
                                    dVar20 = dVar20;
                                } else {
                                    if (dVar22 == dVar) {
                                        dVar22 = null;
                                    }
                                    c cVar19 = cVarArr9[i11];
                                    u.f fVar11 = cVar19.i;
                                    int i42 = i11 + 1;
                                    u.f fVar12 = dVar20.Q[i42].i;
                                    int iE2 = cVar19.e();
                                    int iE3 = cVarArr9[i42].e();
                                    if (dVar22 != null) {
                                        cVar3 = dVar22.Q[i11];
                                        fVar2 = cVar3.i;
                                        c cVar20 = cVar3.f9363f;
                                        fVar = cVar20 != null ? cVar20.i : null;
                                    } else {
                                        c cVar21 = dVar.Q[i11];
                                        u.f fVar13 = cVar21 != null ? cVar21.i : null;
                                        fVar = cVarArr9[i42].i;
                                        cVar3 = cVar21;
                                        fVar2 = fVar13;
                                    }
                                    if (cVar3 != null) {
                                        iE3 += cVar3.e();
                                    }
                                    int iE4 = iE2 + dVar20.Q[i42].e();
                                    d dVar23 = dVar22;
                                    u.f fVar14 = fVar2;
                                    int i43 = z25 ? 8 : 4;
                                    if (fVar11 == null || fVar12 == null || fVar14 == null || fVar == null) {
                                        dVar2 = dVar23;
                                    } else {
                                        dVar2 = dVar23;
                                        cVar.b(fVar11, fVar12, iE4, 0.5f, fVar14, fVar, iE3, i43);
                                    }
                                    dVar22 = dVar2;
                                }
                                if (dVar21.f9377g0 != 8) {
                                    dVar20 = dVar21;
                                }
                                dVar21 = dVar22;
                                dVar20 = dVar20;
                                i40 = 8;
                            }
                            cVar2 = cVar;
                            c cVar22 = dVar14.Q[i11];
                            c cVar23 = cVarArr2[i11].f9363f;
                            int i44 = i11 + 1;
                            c cVar24 = dVar.Q[i44];
                            c cVar25 = dVar13.Q[i44].f9363f;
                            if (cVar23 != null) {
                                if (dVar14 != dVar) {
                                    cVar2.e(cVar22.i, cVar23.i, cVar22.e(), 5);
                                } else if (cVar25 != null) {
                                    cVar2.b(cVar22.i, cVar23.i, cVar22.e(), 0.5f, cVar24.i, cVar25.i, cVar24.e(), 5);
                                }
                            }
                            if (cVar25 != null && dVar14 != dVar) {
                                cVar2.e(cVar24.i, cVar25.i, -cVar24.e(), 5);
                            }
                        }
                        if ((z10 || z11) && dVar14 != null && dVar14 != dVar) {
                            cVarArr = dVar14.Q;
                            c cVar26 = cVarArr[i11];
                            if (dVar == null) {
                                dVar = dVar14;
                            }
                            c[] cVarArr10 = dVar.Q;
                            i16 = i11 + 1;
                            cVar5 = cVarArr10[i16];
                            cVar6 = cVar26.f9363f;
                            if (cVar6 != null) {
                                fVar4 = cVar6.i;
                            } else {
                                fVar4 = null;
                            }
                            cVar7 = cVar5.f9363f;
                            if (cVar7 != null) {
                                fVar5 = cVar7.i;
                            } else {
                                fVar5 = null;
                            }
                            if (dVar13 != dVar) {
                                c cVar27 = dVar13.Q[i16].f9363f;
                                fVar5 = cVar27 != null ? cVar27.i : null;
                            }
                            if (dVar14 == dVar) {
                                cVar5 = cVarArr[i16];
                            }
                            if (fVar4 == null && fVar5 != null) {
                                cVar2.b(cVar26.i, fVar4, cVar26.e(), 0.5f, fVar5, cVar5.i, cVarArr10[i16].e(), 5);
                            }
                        }
                    } else {
                        int i45 = bVar.f9351j;
                        boolean z26 = i45 > 0 && bVar.i == i45;
                        d dVar24 = dVar14;
                        d dVar25 = dVar24;
                        while (dVar24 != null) {
                            c[] cVarArr11 = dVar24.Q;
                            d dVar26 = dVar24.f9386m0[i];
                            while (true) {
                                if (dVar26 == null) {
                                    i14 = 8;
                                    break;
                                }
                                i14 = 8;
                                if (dVar26.f9377g0 != 8) {
                                    break;
                                } else {
                                    dVar26 = dVar26.f9386m0[i];
                                }
                            }
                            if (dVar26 != null || dVar24 == dVar) {
                                c cVar28 = cVarArr11[i11];
                                u.f fVar15 = cVar28.i;
                                c cVar29 = cVar28.f9363f;
                                u.f fVar16 = cVar29 != null ? cVar29.i : null;
                                if (dVar25 != dVar24) {
                                    fVar16 = dVar25.Q[i11 + 1].i;
                                } else if (dVar24 == dVar14) {
                                    c cVar30 = cVarArr2[i11].f9363f;
                                    fVar16 = cVar30 != null ? cVar30.i : null;
                                }
                                int iE5 = cVar28.e();
                                int i46 = i11 + 1;
                                int iE6 = cVarArr11[i46].e();
                                if (dVar26 != null) {
                                    cVar4 = dVar26.Q[i11];
                                    fVar3 = cVar4.i;
                                } else {
                                    cVar4 = dVar13.Q[i46].f9363f;
                                    fVar3 = cVar4 != null ? cVar4.i : null;
                                }
                                u.f fVar17 = cVarArr11[i46].i;
                                if (cVar4 != null) {
                                    iE6 += cVar4.e();
                                }
                                int iE7 = dVar25.Q[i46].e() + iE5;
                                if (fVar15 == null || fVar16 == null || fVar3 == null || fVar17 == null) {
                                    dVar3 = dVar26;
                                    i15 = 8;
                                } else {
                                    if (dVar24 == dVar14) {
                                        iE7 = dVar14.Q[i11].e();
                                    }
                                    if (dVar24 == dVar) {
                                        iE6 = dVar.Q[i46].e();
                                    }
                                    dVar3 = dVar26;
                                    i15 = 8;
                                    cVar.b(fVar15, fVar16, iE7, 0.5f, fVar3, fVar17, iE6, z26 ? 8 : 5);
                                }
                            } else {
                                dVar3 = dVar26;
                                i15 = i14;
                            }
                            if (dVar24.f9377g0 != i15) {
                                dVar25 = dVar24;
                            }
                            dVar24 = dVar3;
                            dVar25 = dVar25;
                            cVarArr2 = cVarArr2;
                        }
                    }
                } else {
                    c cVar31 = cVarArr2[i11];
                    int i47 = i11 + 1;
                    c cVar32 = dVar13.Q[i47];
                    c cVar33 = cVar31.f9363f;
                    u.f fVar18 = cVar33 != null ? cVar33.i : null;
                    c cVar34 = cVar32.f9363f;
                    u.f fVar19 = cVar34 != null ? cVar34.i : null;
                    c cVar35 = dVar14.Q[i11];
                    if (dVar15 != null) {
                        cVar32 = dVar15.Q[i47];
                    }
                    if (fVar18 == null || fVar19 == null) {
                        dVar = dVar15;
                    } else {
                        float f20 = i == 0 ? dVar16.f9372d0 : dVar16.f9373e0;
                        int iE8 = cVar35.e();
                        int iE9 = cVar32.e();
                        u.f fVar20 = cVar35.i;
                        u.f fVar21 = cVar32.i;
                        u.f fVar22 = fVar18;
                        dVar = dVar15;
                        cVar.b(fVar20, fVar22, iE8, f20, fVar19, fVar21, iE9, 7);
                    }
                }
                cVar2 = cVar;
                if (z10) {
                    cVarArr = dVar14.Q;
                    c cVar210 = cVarArr[i11];
                    if (dVar == null) {
                        dVar = dVar14;
                    }
                    c[] cVarArr12 = dVar.Q;
                    i16 = i11 + 1;
                    cVar5 = cVarArr12[i16];
                    cVar6 = cVar210.f9363f;
                    if (cVar6 != null) {
                        fVar4 = cVar6.i;
                    } else {
                        fVar4 = null;
                    }
                    cVar7 = cVar5.f9363f;
                    if (cVar7 != null) {
                        fVar5 = cVar7.i;
                    } else {
                        fVar5 = null;
                    }
                    if (dVar13 != dVar) {
                        c cVar211 = dVar13.Q[i16].f9363f;
                        fVar5 = cVar211 != null ? cVar211.i : null;
                    }
                    if (dVar14 == dVar) {
                        cVar5 = cVarArr[i16];
                    }
                    if (fVar4 == null) {
                    }
                } else {
                    cVarArr = dVar14.Q;
                    c cVar212 = cVarArr[i11];
                    if (dVar == null) {
                        dVar = dVar14;
                    }
                    c[] cVarArr13 = dVar.Q;
                    i16 = i11 + 1;
                    cVar5 = cVarArr13[i16];
                    cVar6 = cVar212.f9363f;
                    if (cVar6 != null) {
                        fVar4 = cVar6.i;
                    } else {
                        fVar4 = null;
                    }
                    cVar7 = cVar5.f9363f;
                    if (cVar7 != null) {
                        fVar5 = cVar7.i;
                    } else {
                        fVar5 = null;
                    }
                    if (dVar13 != dVar) {
                        c cVar213 = dVar13.Q[i16].f9363f;
                        fVar5 = cVar213 != null ? cVar213.i : null;
                    }
                    if (dVar14 == dVar) {
                        cVar5 = cVarArr[i16];
                    }
                    if (fVar4 == null) {
                    }
                }
            } else {
                i13 = i20;
            }
            i21 = i12 + 1;
            eVar2 = eVar;
            i20 = i13;
        }
    }

    public static void b(e eVar, u.c cVar, d dVar) {
        dVar.f9389o = -1;
        c cVar2 = dVar.M;
        int[] iArr = dVar.f9392p0;
        c cVar3 = dVar.L;
        c cVar4 = dVar.J;
        c cVar5 = dVar.K;
        c cVar6 = dVar.I;
        dVar.f9391p = -1;
        int[] iArr2 = eVar.f9392p0;
        if (iArr2[0] != 2 && iArr[0] == 4) {
            int i = cVar6.f9364g;
            int iQ = eVar.q() - cVar5.f9364g;
            cVar6.i = cVar.k(cVar6);
            cVar5.i = cVar.k(cVar5);
            cVar.d(cVar6.i, i);
            cVar.d(cVar5.i, iQ);
            dVar.f9389o = 2;
            dVar.Y = i;
            int i10 = iQ - i;
            dVar.U = i10;
            int i11 = dVar.f9368b0;
            if (i10 < i11) {
                dVar.U = i11;
            }
        }
        if (iArr2[1] == 2 || iArr[1] != 4) {
            return;
        }
        int i12 = cVar4.f9364g;
        int iK = eVar.k() - cVar3.f9364g;
        cVar4.i = cVar.k(cVar4);
        cVar3.i = cVar.k(cVar3);
        cVar.d(cVar4.i, i12);
        cVar.d(cVar3.i, iK);
        if (dVar.f9366a0 > 0 || dVar.f9377g0 == 8) {
            u.f fVarK = cVar.k(cVar2);
            cVar2.i = fVarK;
            cVar.d(fVarK, dVar.f9366a0 + i12);
        }
        dVar.f9391p = 2;
        dVar.Z = i12;
        int i13 = iK - i12;
        dVar.V = i13;
        int i14 = dVar.f9370c0;
        if (i13 < i14) {
            dVar.V = i14;
        }
    }

    public static final boolean c(int i, int i10) {
        return (i & i10) == i10;
    }
}

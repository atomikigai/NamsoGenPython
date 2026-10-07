package x;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w.e f9976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f9977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f9978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public w.e f9979d;
    public ArrayList e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z.e f9980f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f9981g;
    public ArrayList h;

    public final void a(f fVar, int i, ArrayList arrayList, l lVar) {
        o oVar = fVar.f9985d;
        l lVar2 = oVar.f10005c;
        f fVar2 = oVar.i;
        f fVar3 = oVar.h;
        if (lVar2 == null) {
            w.e eVar = this.f9976a;
            if (oVar == eVar.f9371d || oVar == eVar.e) {
                return;
            }
            if (lVar == null) {
                lVar = new l();
                lVar.f9994a = null;
                lVar.f9995b = new ArrayList();
                lVar.f9994a = oVar;
                arrayList.add(lVar);
            }
            oVar.f10005c = lVar;
            lVar.f9995b.add(oVar);
            ArrayList arrayList2 = fVar3.f9989k;
            int size = arrayList2.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                d dVar = (d) obj;
                if (dVar instanceof f) {
                    a((f) dVar, i, arrayList, lVar);
                }
            }
            ArrayList arrayList3 = fVar2.f9989k;
            int size2 = arrayList3.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList3.get(i12);
                i12++;
                d dVar2 = (d) obj2;
                if (dVar2 instanceof f) {
                    a((f) dVar2, i, arrayList, lVar);
                }
            }
            if (i == 1 && (oVar instanceof m)) {
                ArrayList arrayList4 = ((m) oVar).f9996k.f9989k;
                int size3 = arrayList4.size();
                int i13 = 0;
                while (i13 < size3) {
                    Object obj3 = arrayList4.get(i13);
                    i13++;
                    d dVar3 = (d) obj3;
                    if (dVar3 instanceof f) {
                        a((f) dVar3, i, arrayList, lVar);
                    }
                }
            }
            ArrayList arrayList5 = fVar3.f9990l;
            int size4 = arrayList5.size();
            int i14 = 0;
            while (i14 < size4) {
                Object obj4 = arrayList5.get(i14);
                i14++;
                a((f) obj4, i, arrayList, lVar);
            }
            ArrayList arrayList6 = fVar2.f9990l;
            int size5 = arrayList6.size();
            int i15 = 0;
            while (i15 < size5) {
                Object obj5 = arrayList6.get(i15);
                i15++;
                a((f) obj5, i, arrayList, lVar);
            }
            if (i == 1 && (oVar instanceof m)) {
                ArrayList arrayList7 = ((m) oVar).f9996k.f9990l;
                int size6 = arrayList7.size();
                while (i10 < size6) {
                    Object obj6 = arrayList7.get(i10);
                    i10++;
                    a((f) obj6, i, arrayList, lVar);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x01c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:112:0x01de  */
    /* JADX WARN: Code duplicated, block: B:114:0x0207  */
    /* JADX WARN: Code duplicated, block: B:116:0x020a  */
    /* JADX WARN: Code duplicated, block: B:117:0x021f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0224  */
    /* JADX WARN: Code duplicated, block: B:121:0x0228  */
    /* JADX WARN: Code duplicated, block: B:126:0x025f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0269  */
    /* JADX WARN: Code duplicated, block: B:134:0x029a  */
    /* JADX WARN: Code duplicated, block: B:136:0x02a1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:148:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:149:0x0306  */
    /* JADX WARN: Code duplicated, block: B:152:0x0311  */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:156:0x0337  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1 A[PHI: r0
      0x00d1: PHI (r0v22 int) = (r0v20 int), (r0v99 int) binds: [B:68:0x00c9, B:62:0x00c0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x012c  */
    /* JADX WARN: Code duplicated, block: B:84:0x0131  */
    /* JADX WARN: Code duplicated, block: B:85:0x0144  */
    /* JADX WARN: Code duplicated, block: B:87:0x0147  */
    /* JADX WARN: Code duplicated, block: B:89:0x014b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0182  */
    /* JADX WARN: Code duplicated, block: B:97:0x018c  */
    public final void b(w.e eVar) {
        int i;
        int i10;
        int iQ;
        int iK;
        int i11;
        int iK2;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        float f10;
        int i24;
        int i25;
        ArrayList arrayList = eVar.f9403q0;
        int[] iArr = eVar.f9392p0;
        int size = arrayList.size();
        char c10 = 0;
        int i26 = 0;
        while (i26 < size) {
            Object obj = arrayList.get(i26);
            i26++;
            w.d dVar = (w.d) obj;
            int[] iArr2 = dVar.f9392p0;
            w.c[] cVarArr = dVar.Q;
            w.c cVar = dVar.L;
            w.c cVar2 = dVar.J;
            w.c cVar3 = dVar.K;
            w.c cVar4 = dVar.I;
            int i27 = iArr2[c10];
            int i28 = iArr2[1];
            c10 = c10;
            if (dVar.f9377g0 == 8) {
                dVar.f9365a = true;
            } else {
                float f11 = dVar.f9399w;
                if (f11 < 1.0f && i27 == 3) {
                    dVar.f9394r = 2;
                }
                float f12 = dVar.f9402z;
                if (f12 < 1.0f && i28 == 3) {
                    dVar.f9395s = 2;
                }
                if (dVar.W > 0.0f) {
                    if (i27 == 3) {
                        i25 = 2;
                        if (i28 == 2 || i28 == 1) {
                            i = 3;
                            dVar.f9394r = 3;
                        } else {
                            i = 3;
                        }
                    } else {
                        i = 3;
                        i25 = 2;
                    }
                    if (i28 == i && (i27 == i25 || i27 == 1)) {
                        dVar.f9395s = i;
                    } else if (i27 == i && i28 == i) {
                        if (dVar.f9394r == 0) {
                            dVar.f9394r = i;
                        }
                        if (dVar.f9395s == 0) {
                            dVar.f9395s = i;
                        }
                    }
                } else {
                    i = 3;
                }
                if (i27 == i && dVar.f9394r == 1 && (cVar4.f9363f == null || cVar3.f9363f == null)) {
                    i27 = 2;
                }
                if (i28 == 3 && dVar.f9395s == 1 && (cVar2.f9363f == null || cVar.f9363f == null)) {
                    i28 = 2;
                }
                k kVar = dVar.f9371d;
                kVar.f10006d = i27;
                int i29 = dVar.f9394r;
                kVar.f10003a = i29;
                m mVar = dVar.e;
                mVar.f10006d = i28;
                ArrayList arrayList2 = arrayList;
                int i30 = dVar.f9395s;
                mVar.f10003a = i30;
                if (i27 == 4 || i27 == 1) {
                    if (i28 == 4) {
                        i10 = 1;
                    } else if (i28 != 1) {
                        i12 = 2;
                        if (i28 == 2) {
                            i10 = 1;
                        } else {
                            if (i27 != 3) {
                                i13 = i12;
                                i14 = i28;
                                i15 = 1;
                            } else if (i28 == i12 && i28 != 1) {
                                i13 = i12;
                                i16 = 3;
                                i14 = i28;
                                i15 = 1;
                                if (i14 != i16) {
                                    if (i27 == i13 && i27 != i15) {
                                        i20 = i16;
                                        i17 = i27;
                                        i18 = i13;
                                    } else if (i30 == i16) {
                                        if (i27 == i13) {
                                            f(i13, 0, i13, 0, dVar);
                                        }
                                        int iQ2 = dVar.q();
                                        f10 = dVar.W;
                                        if (dVar.X == -1) {
                                            f10 = 1.0f / f10;
                                        }
                                        f(i15, iQ2, i15, (int) ((iQ2 * f10) + 0.5f), dVar);
                                        dVar.f9371d.e.d(dVar.q());
                                        dVar.e.e.d(dVar.k());
                                        dVar.f9365a = true;
                                    } else if (i30 == 1) {
                                        f(i27, 0, i13, 0, dVar);
                                        dVar.e.e.f9991m = dVar.k();
                                    } else {
                                        i21 = i13;
                                        i22 = i27;
                                        if (i30 == 2) {
                                            i23 = iArr[1];
                                            if (i23 != i15 || i23 == 4) {
                                                f(i22, dVar.q(), i15, (int) ((f12 * eVar.k()) + 0.5f), dVar);
                                                dVar.f9371d.e.d(dVar.q());
                                                dVar.e.e.d(dVar.k());
                                                dVar.f9365a = true;
                                            } else {
                                                i17 = i22;
                                                i18 = i21;
                                                i20 = 3;
                                            }
                                        } else {
                                            i17 = i22;
                                            if (cVarArr[2].f9363f != null || cVarArr[3].f9363f == null) {
                                                f(i21, 0, i14, 0, dVar);
                                                dVar.f9371d.e.d(dVar.q());
                                                dVar.e.e.d(dVar.k());
                                                dVar.f9365a = true;
                                            } else {
                                                i18 = i21;
                                            }
                                        }
                                    }
                                    i15 = i15;
                                    i19 = 1;
                                    if (i17 == i20 && i14 == i20) {
                                        if (i29 != i19 || i30 == i19) {
                                            f(i18, 0, i18, 0, dVar);
                                            dVar.f9371d.e.f9991m = dVar.q();
                                            dVar.e.e.f9991m = dVar.k();
                                        } else if (i30 == 2 && i29 == 2 && iArr[c10] == i15 && iArr[i19] == i15) {
                                            f(i15, (int) ((f11 * eVar.q()) + 0.5f), i15, (int) ((f12 * eVar.k()) + 0.5f), dVar);
                                            dVar.f9371d.e.d(dVar.q());
                                            dVar.e.e.d(dVar.k());
                                            dVar.f9365a = true;
                                        }
                                    }
                                } else {
                                    i17 = i27;
                                    i18 = i13;
                                }
                                i19 = 1;
                                i20 = 3;
                                if (i17 == i20) {
                                    if (i29 != i19) {
                                        f(i18, 0, i18, 0, dVar);
                                        dVar.f9371d.e.f9991m = dVar.q();
                                        dVar.e.e.f9991m = dVar.k();
                                    } else {
                                        f(i18, 0, i18, 0, dVar);
                                        dVar.f9371d.e.f9991m = dVar.q();
                                        dVar.e.e.f9991m = dVar.k();
                                    }
                                }
                            } else if (i29 == 3) {
                                if (i28 == i12) {
                                    f(i12, 0, i12, 0, dVar);
                                }
                                int iK3 = dVar.k();
                                f(1, (int) ((iK3 * dVar.W) + 0.5f), 1, iK3, dVar);
                                dVar.f9371d.e.d(dVar.q());
                                dVar.e.e.d(dVar.k());
                                dVar.f9365a = true;
                            } else {
                                i13 = i12;
                                if (i29 == 1) {
                                    f(i13, 0, i28, 0, dVar);
                                    dVar.f9371d.e.f9991m = dVar.q();
                                } else if (i29 == 2) {
                                    i24 = iArr[c10];
                                    if (i24 != 1 || i24 == 4) {
                                        f(1, (int) ((f11 * eVar.q()) + 0.5f), i28, dVar.k(), dVar);
                                        dVar.f9371d.e.d(dVar.q());
                                        dVar.e.e.d(dVar.k());
                                        dVar.f9365a = true;
                                    } else {
                                        i14 = i28;
                                        i15 = 1;
                                    }
                                } else {
                                    i14 = i28;
                                    i15 = 1;
                                    if (cVarArr[c10].f9363f != null || cVarArr[1].f9363f == null) {
                                        f(i13, 0, i14, 0, dVar);
                                        dVar.f9371d.e.d(dVar.q());
                                        dVar.e.e.d(dVar.k());
                                        dVar.f9365a = true;
                                    }
                                }
                            }
                            i16 = 3;
                            if (i14 != i16) {
                                i17 = i27;
                                i18 = i13;
                            } else if (i27 == i13) {
                                if (i30 == i16) {
                                    if (i27 == i13) {
                                        f(i13, 0, i13, 0, dVar);
                                    }
                                    int iQ3 = dVar.q();
                                    f10 = dVar.W;
                                    if (dVar.X == -1) {
                                        f10 = 1.0f / f10;
                                    }
                                    f(i15, iQ3, i15, (int) ((iQ3 * f10) + 0.5f), dVar);
                                    dVar.f9371d.e.d(dVar.q());
                                    dVar.e.e.d(dVar.k());
                                    dVar.f9365a = true;
                                } else if (i30 == 1) {
                                    f(i27, 0, i13, 0, dVar);
                                    dVar.e.e.f9991m = dVar.k();
                                } else {
                                    i21 = i13;
                                    i22 = i27;
                                    if (i30 == 2) {
                                        i23 = iArr[1];
                                        if (i23 != i15) {
                                        }
                                        f(i22, dVar.q(), i15, (int) ((f12 * eVar.k()) + 0.5f), dVar);
                                        dVar.f9371d.e.d(dVar.q());
                                        dVar.e.e.d(dVar.k());
                                        dVar.f9365a = true;
                                    } else {
                                        i17 = i22;
                                        if (cVarArr[2].f9363f != null) {
                                        }
                                        f(i21, 0, i14, 0, dVar);
                                        dVar.f9371d.e.d(dVar.q());
                                        dVar.e.e.d(dVar.k());
                                        dVar.f9365a = true;
                                    }
                                }
                            } else if (i30 == i16) {
                                if (i27 == i13) {
                                    f(i13, 0, i13, 0, dVar);
                                }
                                int iQ4 = dVar.q();
                                f10 = dVar.W;
                                if (dVar.X == -1) {
                                    f10 = 1.0f / f10;
                                }
                                f(i15, iQ4, i15, (int) ((iQ4 * f10) + 0.5f), dVar);
                                dVar.f9371d.e.d(dVar.q());
                                dVar.e.e.d(dVar.k());
                                dVar.f9365a = true;
                            } else if (i30 == 1) {
                                f(i27, 0, i13, 0, dVar);
                                dVar.e.e.f9991m = dVar.k();
                            } else {
                                i21 = i13;
                                i22 = i27;
                                if (i30 == 2) {
                                    i23 = iArr[1];
                                    if (i23 != i15) {
                                    }
                                    f(i22, dVar.q(), i15, (int) ((f12 * eVar.k()) + 0.5f), dVar);
                                    dVar.f9371d.e.d(dVar.q());
                                    dVar.e.e.d(dVar.k());
                                    dVar.f9365a = true;
                                } else {
                                    i17 = i22;
                                    if (cVarArr[2].f9363f != null) {
                                    }
                                    f(i21, 0, i14, 0, dVar);
                                    dVar.f9371d.e.d(dVar.q());
                                    dVar.e.e.d(dVar.k());
                                    dVar.f9365a = true;
                                }
                            }
                            i19 = 1;
                            i20 = 3;
                            if (i17 == i20) {
                                if (i29 != i19) {
                                    f(i18, 0, i18, 0, dVar);
                                    dVar.f9371d.e.f9991m = dVar.q();
                                    dVar.e.e.f9991m = dVar.k();
                                } else {
                                    f(i18, 0, i18, 0, dVar);
                                    dVar.f9371d.e.f9991m = dVar.q();
                                    dVar.e.e.f9991m = dVar.k();
                                }
                            }
                        }
                    } else {
                        i10 = 1;
                    }
                    iQ = dVar.q();
                    if (i27 == 4) {
                        iQ = (eVar.q() - cVar4.f9364g) - cVar3.f9364g;
                        i27 = i10;
                    }
                    iK = dVar.k();
                    if (i28 == 4) {
                        i11 = i10;
                        iK2 = (eVar.k() - cVar2.f9364g) - cVar.f9364g;
                    } else {
                        i11 = i28;
                        iK2 = iK;
                    }
                    f(i27, iQ, i11, iK2, dVar);
                    dVar.f9371d.e.d(dVar.q());
                    dVar.e.e.d(dVar.k());
                    dVar.f9365a = true;
                } else {
                    i12 = 2;
                    if (i27 == 2) {
                        if (i28 == 4) {
                            i10 = 1;
                        } else if (i28 != 1) {
                            i12 = 2;
                            if (i28 == 2) {
                                i10 = 1;
                            } else {
                                if (i27 != 3) {
                                    if (i28 == i12) {
                                    }
                                    if (i29 == 3) {
                                        if (i28 == i12) {
                                            f(i12, 0, i12, 0, dVar);
                                        }
                                        int iK4 = dVar.k();
                                        f(1, (int) ((iK4 * dVar.W) + 0.5f), 1, iK4, dVar);
                                        dVar.f9371d.e.d(dVar.q());
                                        dVar.e.e.d(dVar.k());
                                        dVar.f9365a = true;
                                    } else {
                                        i13 = i12;
                                        if (i29 == 1) {
                                            f(i13, 0, i28, 0, dVar);
                                            dVar.f9371d.e.f9991m = dVar.q();
                                        } else if (i29 == 2) {
                                            i24 = iArr[c10];
                                            if (i24 != 1) {
                                            }
                                            f(1, (int) ((f11 * eVar.q()) + 0.5f), i28, dVar.k(), dVar);
                                            dVar.f9371d.e.d(dVar.q());
                                            dVar.e.e.d(dVar.k());
                                            dVar.f9365a = true;
                                        } else {
                                            i14 = i28;
                                            i15 = 1;
                                            if (cVarArr[c10].f9363f != null) {
                                            }
                                            f(i13, 0, i14, 0, dVar);
                                            dVar.f9371d.e.d(dVar.q());
                                            dVar.e.e.d(dVar.k());
                                            dVar.f9365a = true;
                                        }
                                    }
                                } else {
                                    i13 = i12;
                                    i14 = i28;
                                    i15 = 1;
                                }
                                i16 = 3;
                                if (i14 != i16) {
                                    i17 = i27;
                                    i18 = i13;
                                } else if (i27 == i13) {
                                    if (i30 == i16) {
                                        if (i27 == i13) {
                                            f(i13, 0, i13, 0, dVar);
                                        }
                                        int iQ5 = dVar.q();
                                        f10 = dVar.W;
                                        if (dVar.X == -1) {
                                            f10 = 1.0f / f10;
                                        }
                                        f(i15, iQ5, i15, (int) ((iQ5 * f10) + 0.5f), dVar);
                                        dVar.f9371d.e.d(dVar.q());
                                        dVar.e.e.d(dVar.k());
                                        dVar.f9365a = true;
                                    } else if (i30 == 1) {
                                        f(i27, 0, i13, 0, dVar);
                                        dVar.e.e.f9991m = dVar.k();
                                    } else {
                                        i21 = i13;
                                        i22 = i27;
                                        if (i30 == 2) {
                                            i23 = iArr[1];
                                            if (i23 != i15) {
                                            }
                                            f(i22, dVar.q(), i15, (int) ((f12 * eVar.k()) + 0.5f), dVar);
                                            dVar.f9371d.e.d(dVar.q());
                                            dVar.e.e.d(dVar.k());
                                            dVar.f9365a = true;
                                        } else {
                                            i17 = i22;
                                            if (cVarArr[2].f9363f != null) {
                                            }
                                            f(i21, 0, i14, 0, dVar);
                                            dVar.f9371d.e.d(dVar.q());
                                            dVar.e.e.d(dVar.k());
                                            dVar.f9365a = true;
                                        }
                                    }
                                } else if (i30 == i16) {
                                    if (i27 == i13) {
                                        f(i13, 0, i13, 0, dVar);
                                    }
                                    int iQ6 = dVar.q();
                                    f10 = dVar.W;
                                    if (dVar.X == -1) {
                                        f10 = 1.0f / f10;
                                    }
                                    f(i15, iQ6, i15, (int) ((iQ6 * f10) + 0.5f), dVar);
                                    dVar.f9371d.e.d(dVar.q());
                                    dVar.e.e.d(dVar.k());
                                    dVar.f9365a = true;
                                } else if (i30 == 1) {
                                    f(i27, 0, i13, 0, dVar);
                                    dVar.e.e.f9991m = dVar.k();
                                } else {
                                    i21 = i13;
                                    i22 = i27;
                                    if (i30 == 2) {
                                        i23 = iArr[1];
                                        if (i23 != i15) {
                                        }
                                        f(i22, dVar.q(), i15, (int) ((f12 * eVar.k()) + 0.5f), dVar);
                                        dVar.f9371d.e.d(dVar.q());
                                        dVar.e.e.d(dVar.k());
                                        dVar.f9365a = true;
                                    } else {
                                        i17 = i22;
                                        if (cVarArr[2].f9363f != null) {
                                        }
                                        f(i21, 0, i14, 0, dVar);
                                        dVar.f9371d.e.d(dVar.q());
                                        dVar.e.e.d(dVar.k());
                                        dVar.f9365a = true;
                                    }
                                }
                                i19 = 1;
                                i20 = 3;
                                if (i17 == i20) {
                                    if (i29 != i19) {
                                        f(i18, 0, i18, 0, dVar);
                                        dVar.f9371d.e.f9991m = dVar.q();
                                        dVar.e.e.f9991m = dVar.k();
                                    } else {
                                        f(i18, 0, i18, 0, dVar);
                                        dVar.f9371d.e.f9991m = dVar.q();
                                        dVar.e.e.f9991m = dVar.k();
                                    }
                                }
                            }
                        } else {
                            i10 = 1;
                        }
                        iQ = dVar.q();
                        if (i27 == 4) {
                            iQ = (eVar.q() - cVar4.f9364g) - cVar3.f9364g;
                            i27 = i10;
                        }
                        iK = dVar.k();
                        if (i28 == 4) {
                            i11 = i10;
                            iK2 = (eVar.k() - cVar2.f9364g) - cVar.f9364g;
                        } else {
                            i11 = i28;
                            iK2 = iK;
                        }
                        f(i27, iQ, i11, iK2, dVar);
                        dVar.f9371d.e.d(dVar.q());
                        dVar.e.e.d(dVar.k());
                        dVar.f9365a = true;
                    } else {
                        if (i27 != 3) {
                            if (i28 == i12) {
                            }
                            if (i29 == 3) {
                                if (i28 == i12) {
                                    f(i12, 0, i12, 0, dVar);
                                }
                                int iK5 = dVar.k();
                                f(1, (int) ((iK5 * dVar.W) + 0.5f), 1, iK5, dVar);
                                dVar.f9371d.e.d(dVar.q());
                                dVar.e.e.d(dVar.k());
                                dVar.f9365a = true;
                            } else {
                                i13 = i12;
                                if (i29 == 1) {
                                    f(i13, 0, i28, 0, dVar);
                                    dVar.f9371d.e.f9991m = dVar.q();
                                } else if (i29 == 2) {
                                    i24 = iArr[c10];
                                    if (i24 != 1) {
                                    }
                                    f(1, (int) ((f11 * eVar.q()) + 0.5f), i28, dVar.k(), dVar);
                                    dVar.f9371d.e.d(dVar.q());
                                    dVar.e.e.d(dVar.k());
                                    dVar.f9365a = true;
                                } else {
                                    i14 = i28;
                                    i15 = 1;
                                    if (cVarArr[c10].f9363f != null) {
                                    }
                                    f(i13, 0, i14, 0, dVar);
                                    dVar.f9371d.e.d(dVar.q());
                                    dVar.e.e.d(dVar.k());
                                    dVar.f9365a = true;
                                }
                            }
                        } else {
                            i13 = i12;
                            i14 = i28;
                            i15 = 1;
                        }
                        i16 = 3;
                        if (i14 != i16) {
                            i17 = i27;
                            i18 = i13;
                        } else if (i27 == i13) {
                            if (i30 == i16) {
                                if (i27 == i13) {
                                    f(i13, 0, i13, 0, dVar);
                                }
                                int iQ7 = dVar.q();
                                f10 = dVar.W;
                                if (dVar.X == -1) {
                                    f10 = 1.0f / f10;
                                }
                                f(i15, iQ7, i15, (int) ((iQ7 * f10) + 0.5f), dVar);
                                dVar.f9371d.e.d(dVar.q());
                                dVar.e.e.d(dVar.k());
                                dVar.f9365a = true;
                            } else if (i30 == 1) {
                                f(i27, 0, i13, 0, dVar);
                                dVar.e.e.f9991m = dVar.k();
                            } else {
                                i21 = i13;
                                i22 = i27;
                                if (i30 == 2) {
                                    i23 = iArr[1];
                                    if (i23 != i15) {
                                    }
                                    f(i22, dVar.q(), i15, (int) ((f12 * eVar.k()) + 0.5f), dVar);
                                    dVar.f9371d.e.d(dVar.q());
                                    dVar.e.e.d(dVar.k());
                                    dVar.f9365a = true;
                                } else {
                                    i17 = i22;
                                    if (cVarArr[2].f9363f != null) {
                                    }
                                    f(i21, 0, i14, 0, dVar);
                                    dVar.f9371d.e.d(dVar.q());
                                    dVar.e.e.d(dVar.k());
                                    dVar.f9365a = true;
                                }
                            }
                        } else if (i30 == i16) {
                            if (i27 == i13) {
                                f(i13, 0, i13, 0, dVar);
                            }
                            int iQ8 = dVar.q();
                            f10 = dVar.W;
                            if (dVar.X == -1) {
                                f10 = 1.0f / f10;
                            }
                            f(i15, iQ8, i15, (int) ((iQ8 * f10) + 0.5f), dVar);
                            dVar.f9371d.e.d(dVar.q());
                            dVar.e.e.d(dVar.k());
                            dVar.f9365a = true;
                        } else if (i30 == 1) {
                            f(i27, 0, i13, 0, dVar);
                            dVar.e.e.f9991m = dVar.k();
                        } else {
                            i21 = i13;
                            i22 = i27;
                            if (i30 == 2) {
                                i23 = iArr[1];
                                if (i23 != i15) {
                                }
                                f(i22, dVar.q(), i15, (int) ((f12 * eVar.k()) + 0.5f), dVar);
                                dVar.f9371d.e.d(dVar.q());
                                dVar.e.e.d(dVar.k());
                                dVar.f9365a = true;
                            } else {
                                i17 = i22;
                                if (cVarArr[2].f9363f != null) {
                                }
                                f(i21, 0, i14, 0, dVar);
                                dVar.f9371d.e.d(dVar.q());
                                dVar.e.e.d(dVar.k());
                                dVar.f9365a = true;
                            }
                        }
                        i19 = 1;
                        i20 = 3;
                        if (i17 == i20) {
                            if (i29 != i19) {
                                f(i18, 0, i18, 0, dVar);
                                dVar.f9371d.e.f9991m = dVar.q();
                                dVar.e.e.f9991m = dVar.k();
                            } else {
                                f(i18, 0, i18, 0, dVar);
                                dVar.f9371d.e.f9991m = dVar.q();
                                dVar.e.e.f9991m = dVar.k();
                            }
                        }
                    }
                }
                arrayList = arrayList2;
            }
        }
    }

    public final void c() {
        w.e eVar = this.f9976a;
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = this.e;
        arrayList2.clear();
        w.e eVar2 = this.f9979d;
        eVar2.f9371d.f();
        eVar2.e.f();
        arrayList2.add(eVar2.f9371d);
        arrayList2.add(eVar2.e);
        ArrayList arrayList3 = eVar2.f9403q0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            w.d dVar = (w.d) obj;
            if (dVar instanceof w.h) {
                i iVar = new i(dVar);
                dVar.f9371d.f();
                dVar.e.f();
                iVar.f10007f = ((w.h) dVar).f9441u0;
                arrayList2.add(iVar);
            } else {
                if (dVar.x()) {
                    if (dVar.f9367b == null) {
                        dVar.f9367b = new c(dVar, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f9367b);
                } else {
                    arrayList2.add(dVar.f9371d);
                }
                if (dVar.y()) {
                    if (dVar.f9369c == null) {
                        dVar.f9369c = new c(dVar, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(dVar.f9369c);
                } else {
                    arrayList2.add(dVar.e);
                }
                if (dVar instanceof w.i) {
                    arrayList2.add(new j(dVar));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj2 = arrayList2.get(i10);
            i10++;
            ((o) obj2).f();
        }
        int size3 = arrayList2.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList2.get(i11);
            i11++;
            o oVar = (o) obj3;
            if (oVar.f10004b != eVar2) {
                oVar.d();
            }
        }
        arrayList.clear();
        e(eVar.f9371d, 0, arrayList);
        e(eVar.e, 1, arrayList);
        this.f9977b = false;
    }

    public final int d(w.e eVar, int i) {
        ArrayList arrayList;
        int i10;
        long j4;
        float f10;
        long j10;
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        long j11 = 0;
        int i11 = 0;
        long jMax = 0;
        while (i11 < size) {
            o oVar = ((l) arrayList2.get(i11)).f9994a;
            if (!(oVar instanceof c) ? !(i != 0 ? (oVar instanceof m) : (oVar instanceof k)) : ((c) oVar).f10007f != i) {
                f fVar = (i == 0 ? eVar.f9371d : eVar.e).h;
                f fVar2 = (i == 0 ? eVar.f9371d : eVar.e).i;
                f fVar3 = oVar.h;
                f fVar4 = oVar.i;
                boolean zContains = fVar3.f9990l.contains(fVar);
                boolean zContains2 = fVar4.f9990l.contains(fVar2);
                long j12 = oVar.j();
                if (zContains && zContains2) {
                    long jB = l.b(fVar3, j11);
                    long jA = l.a(fVar4, j11);
                    long j13 = jB - j12;
                    int i12 = fVar4.f9986f;
                    arrayList = arrayList2;
                    i10 = size;
                    if (j13 >= (-i12)) {
                        j13 += (long) i12;
                    }
                    long j14 = fVar3.f9986f;
                    long j15 = ((-jA) - j12) - j14;
                    if (j15 >= j14) {
                        j15 -= j14;
                    }
                    w.d dVar = oVar.f10004b;
                    if (i == 0) {
                        f10 = dVar.f9372d0;
                    } else if (i == 1) {
                        f10 = dVar.f9373e0;
                    } else {
                        dVar.getClass();
                        f10 = -1.0f;
                    }
                    if (f10 > 0.0f) {
                        j10 = (long) ((j13 / (1.0f - f10)) + (j15 / f10));
                    } else {
                        j10 = 0;
                    }
                    float f11 = j10;
                    j4 = (((long) fVar3.f9986f) + ((((long) ((f11 * f10) + 0.5f)) + j12) + ((long) (((1.0f - f10) * f11) + 0.5f)))) - ((long) fVar4.f9986f);
                } else {
                    arrayList = arrayList2;
                    i10 = size;
                    if (zContains) {
                        j4 = Math.max(l.b(fVar3, fVar3.f9986f), ((long) fVar3.f9986f) + j12);
                    } else if (zContains2) {
                        j4 = Math.max(-l.a(fVar4, fVar4.f9986f), ((long) (-fVar4.f9986f)) + j12);
                    } else {
                        j4 = (oVar.j() + ((long) fVar3.f9986f)) - ((long) fVar4.f9986f);
                    }
                }
            } else {
                arrayList = arrayList2;
                i10 = size;
                j4 = j11;
            }
            jMax = Math.max(jMax, j4);
            i11++;
            arrayList2 = arrayList;
            size = i10;
            j11 = 0;
        }
        return (int) jMax;
    }

    public final void e(o oVar, int i, ArrayList arrayList) {
        f fVar = oVar.h;
        f fVar2 = oVar.i;
        ArrayList arrayList2 = fVar.f9989k;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            d dVar = (d) obj;
            if (dVar instanceof f) {
                a((f) dVar, i, arrayList, null);
            } else if (dVar instanceof o) {
                a(((o) dVar).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = fVar2.f9989k;
        int size2 = arrayList3.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList3.get(i12);
            i12++;
            d dVar2 = (d) obj2;
            if (dVar2 instanceof f) {
                a((f) dVar2, i, arrayList, null);
            } else if (dVar2 instanceof o) {
                a(((o) dVar2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((m) oVar).f9996k.f9989k;
            int size3 = arrayList4.size();
            while (i10 < size3) {
                Object obj3 = arrayList4.get(i10);
                i10++;
                d dVar3 = (d) obj3;
                if (dVar3 instanceof f) {
                    a((f) dVar3, i, arrayList, null);
                }
            }
        }
    }

    public final void f(int i, int i10, int i11, int i12, w.d dVar) {
        b bVar = this.f9981g;
        bVar.f9967a = i;
        bVar.f9968b = i11;
        bVar.f9969c = i10;
        bVar.f9970d = i12;
        this.f9980f.b(dVar, bVar);
        dVar.O(bVar.e);
        dVar.L(bVar.f9971f);
        dVar.E = bVar.h;
        dVar.I(bVar.f9972g);
    }

    public final void g() {
        a aVar;
        e eVar = this;
        ArrayList arrayList = eVar.f9976a.f9403q0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            int i10 = i + 1;
            w.d dVar = (w.d) arrayList.get(i);
            if (!dVar.f9365a) {
                int[] iArr = dVar.f9392p0;
                int i11 = iArr[0];
                int i12 = iArr[1];
                int i13 = dVar.f9394r;
                int i14 = dVar.f9395s;
                boolean z4 = i11 == 2 || (i11 == 3 && i13 == 1);
                boolean z10 = i12 == 2 || (i12 == 3 && i14 == 1);
                g gVar = dVar.f9371d.e;
                boolean z11 = gVar.f9988j;
                g gVar2 = dVar.e.e;
                boolean z12 = gVar2.f9988j;
                boolean z13 = z4;
                if (z11 && z12) {
                    eVar.f(1, gVar.f9987g, 1, gVar2.f9987g, dVar);
                    dVar.f9365a = true;
                } else if (z11 && z10) {
                    f(1, gVar.f9987g, 2, gVar2.f9987g, dVar);
                    if (i12 == 3) {
                        dVar.e.e.f9991m = dVar.k();
                    } else {
                        dVar.e.e.d(dVar.k());
                        dVar.f9365a = true;
                    }
                } else if (z12 && z13) {
                    f(2, gVar.f9987g, 1, gVar2.f9987g, dVar);
                    if (i11 == 3) {
                        dVar.f9371d.e.f9991m = dVar.q();
                    } else {
                        dVar.f9371d.e.d(dVar.q());
                        dVar.f9365a = true;
                    }
                }
                if (dVar.f9365a && (aVar = dVar.e.f9997l) != null) {
                    aVar.d(dVar.f9366a0);
                }
                eVar = this;
            }
            i = i10;
        }
    }
}

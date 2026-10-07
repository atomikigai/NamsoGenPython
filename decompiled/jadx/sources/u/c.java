package u;

import java.util.ArrayList;
import java.util.Arrays;
import s5.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static boolean f8724p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f8725q = 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f8728c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public b[] f8730f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q5.d f8734l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b f8737o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8726a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8727b = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8729d = 32;
    public int e = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f8731g = false;
    public boolean[] h = new boolean[32];
    public int i = 1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8732j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8733k = 32;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f[] f8735m = new f[f8725q];

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f8736n = 0;

    public c() {
        this.f8730f = null;
        this.f8730f = new b[32];
        s();
        q5.d dVar = new q5.d();
        dVar.f8039a = new p0.e();
        dVar.f8040b = new p0.e();
        dVar.f8041c = new f[32];
        this.f8734l = dVar;
        d dVar2 = new d(dVar);
        dVar2.f8738f = new f[128];
        dVar2.f8739g = new f[128];
        dVar2.h = 0;
        dVar2.i = new j(dVar2, 2);
        this.f8728c = dVar2;
        this.f8737o = new b(dVar);
    }

    public static int n(Object obj) {
        f fVar = ((w.c) obj).i;
        if (fVar != null) {
            return (int) (fVar.e + 0.5f);
        }
        return 0;
    }

    public final f a(int i) {
        p0.e eVar = (p0.e) this.f8734l.f8040b;
        int i10 = eVar.f7784b;
        Object obj = null;
        if (i10 > 0) {
            int i11 = i10 - 1;
            Object[] objArr = eVar.f7783a;
            Object obj2 = objArr[i11];
            objArr[i11] = null;
            eVar.f7784b = i11;
            obj = obj2;
        }
        f fVar = (f) obj;
        if (fVar == null) {
            fVar = new f(i);
            fVar.f8751w = i;
        } else {
            fVar.c();
            fVar.f8751w = i;
        }
        int i12 = this.f8736n;
        int i13 = f8725q;
        if (i12 >= i13) {
            int i14 = i13 * 2;
            f8725q = i14;
            this.f8735m = (f[]) Arrays.copyOf(this.f8735m, i14);
        }
        f[] fVarArr = this.f8735m;
        int i15 = this.f8736n;
        this.f8736n = i15 + 1;
        fVarArr[i15] = fVar;
        return fVar;
    }

    public final void b(f fVar, f fVar2, int i, float f10, f fVar3, f fVar4, int i10, int i11) {
        b bVarL = l();
        if (fVar2 == fVar3) {
            bVarL.f8723d.g(fVar, 1.0f);
            bVarL.f8723d.g(fVar4, 1.0f);
            bVarL.f8723d.g(fVar2, -2.0f);
        } else if (f10 == 0.5f) {
            bVarL.f8723d.g(fVar, 1.0f);
            bVarL.f8723d.g(fVar2, -1.0f);
            bVarL.f8723d.g(fVar3, -1.0f);
            bVarL.f8723d.g(fVar4, 1.0f);
            if (i > 0 || i10 > 0) {
                bVarL.f8721b = (-i) + i10;
            }
        } else if (f10 <= 0.0f) {
            bVarL.f8723d.g(fVar, -1.0f);
            bVarL.f8723d.g(fVar2, 1.0f);
            bVarL.f8721b = i;
        } else if (f10 >= 1.0f) {
            bVarL.f8723d.g(fVar4, -1.0f);
            bVarL.f8723d.g(fVar3, 1.0f);
            bVarL.f8721b = -i10;
        } else {
            float f11 = 1.0f - f10;
            bVarL.f8723d.g(fVar, f11 * 1.0f);
            bVarL.f8723d.g(fVar2, f11 * (-1.0f));
            bVarL.f8723d.g(fVar3, (-1.0f) * f10);
            bVarL.f8723d.g(fVar4, 1.0f * f10);
            if (i > 0 || i10 > 0) {
                bVarL.f8721b = (i10 * f10) + ((-i) * f11);
            }
        }
        if (i11 != 8) {
            bVarL.a(this, i11);
        }
        c(bVarL);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:58:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f8  */
    public final void c(b bVar) {
        boolean z4;
        boolean z10;
        f fVarF;
        if (this.f8732j + 1 >= this.f8733k || this.i + 1 >= this.e) {
            o();
        }
        if (bVar.e) {
            z4 = false;
        } else {
            ArrayList arrayList = bVar.f8722c;
            if (this.f8730f.length != 0) {
                boolean z11 = false;
                while (!z11) {
                    int iD = bVar.f8723d.d();
                    for (int i = 0; i < iD; i++) {
                        f fVarE = bVar.f8723d.e(i);
                        if (fVarE.f8743c != -1 || fVarE.f8745f) {
                            arrayList.add(fVarE);
                        }
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i10 = 0; i10 < size; i10++) {
                            f fVar = (f) arrayList.get(i10);
                            if (fVar.f8745f) {
                                bVar.h(this, fVar, true);
                            } else {
                                bVar.i(this, this.f8730f[fVar.f8743c], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z11 = true;
                    }
                }
                if (bVar.f8720a != null && bVar.f8723d.d() == 0) {
                    bVar.e = true;
                    this.f8726a = true;
                }
            }
            if (bVar.e()) {
                return;
            }
            float f10 = bVar.f8721b;
            float f11 = 0.0f;
            if (f10 < 0.0f) {
                bVar.f8721b = f10 * (-1.0f);
                a aVar = bVar.f8723d;
                int i11 = aVar.h;
                for (int i12 = 0; i11 != -1 && i12 < aVar.f8713a; i12++) {
                    float[] fArr = aVar.f8718g;
                    fArr[i11] = fArr[i11] * (-1.0f);
                    i11 = aVar.f8717f[i11];
                }
            }
            int iD2 = bVar.f8723d.d();
            float f12 = 0.0f;
            float f13 = 0.0f;
            f fVar2 = null;
            f fVar3 = null;
            int i13 = 0;
            boolean z12 = false;
            boolean z13 = false;
            while (i13 < iD2) {
                float f14 = bVar.f8723d.f(i13);
                f fVarE2 = bVar.f8723d.e(i13);
                float f15 = f11;
                if (fVarE2.f8751w == 1) {
                    if (fVar2 == null) {
                        if (fVarE2.f8750v <= 1) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        fVar2 = fVarE2;
                        f12 = f14;
                    } else {
                        if (f12 > f14) {
                            if (fVarE2.f8750v > 1) {
                                z12 = false;
                            }
                            fVar2 = fVarE2;
                            f12 = f14;
                        } else if (z12 || fVarE2.f8750v > 1) {
                        }
                        z12 = true;
                        fVar2 = fVarE2;
                        f12 = f14;
                    }
                } else if (fVar2 == null && f14 < f15) {
                    if (fVar3 == null) {
                        if (fVarE2.f8750v <= 1) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        fVar3 = fVarE2;
                        f13 = f14;
                    } else {
                        if (f13 > f14) {
                            if (fVarE2.f8750v > 1) {
                                z13 = false;
                            }
                            fVar3 = fVarE2;
                            f13 = f14;
                        } else if (z13 || fVarE2.f8750v > 1) {
                        }
                        z13 = true;
                        fVar3 = fVarE2;
                        f13 = f14;
                    }
                }
                i13++;
                f11 = f15;
            }
            float f16 = f11;
            if (fVar2 == null) {
                fVar2 = fVar3;
            }
            if (fVar2 == null) {
                z10 = true;
            } else {
                bVar.g(fVar2);
                z10 = false;
            }
            if (bVar.f8723d.d() == 0) {
                bVar.e = true;
            }
            if (z10) {
                if (this.i + 1 >= this.e) {
                    o();
                }
                f fVarA = a(3);
                int i14 = this.f8727b + 1;
                this.f8727b = i14;
                this.i++;
                fVarA.f8742b = i14;
                q5.d dVar = this.f8734l;
                ((f[]) dVar.f8041c)[i14] = fVarA;
                bVar.f8720a = fVarA;
                int i15 = this.f8732j;
                h(bVar);
                if (this.f8732j == i15 + 1) {
                    b bVar2 = this.f8737o;
                    bVar2.f8720a = null;
                    bVar2.f8723d.b();
                    for (int i16 = 0; i16 < bVar.f8723d.d(); i16++) {
                        bVar2.f8723d.a(bVar.f8723d.e(i16), bVar.f8723d.f(i16), true);
                    }
                    r(this.f8737o);
                    if (fVarA.f8743c == -1) {
                        if (bVar.f8720a == fVarA && (fVarF = bVar.f(null, fVarA)) != null) {
                            bVar.g(fVarF);
                        }
                        if (!bVar.e) {
                            bVar.f8720a.e(this, bVar);
                        }
                        ((p0.e) dVar.f8039a).a(bVar);
                        this.f8732j--;
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            f fVar4 = bVar.f8720a;
            if (fVar4 == null) {
                return;
            }
            if (fVar4.f8751w != 1 && bVar.f8721b < f16) {
                return;
            }
        }
        if (z4) {
            return;
        }
        h(bVar);
    }

    public final void d(f fVar, int i) {
        int i10 = fVar.f8743c;
        if (i10 == -1) {
            fVar.d(this, i);
            for (int i11 = 0; i11 < this.f8727b + 1; i11++) {
                f fVar2 = ((f[]) this.f8734l.f8041c)[i11];
            }
            return;
        }
        if (i10 == -1) {
            b bVarL = l();
            bVarL.f8720a = fVar;
            float f10 = i;
            fVar.e = f10;
            bVarL.f8721b = f10;
            bVarL.e = true;
            c(bVarL);
            return;
        }
        b bVar = this.f8730f[i10];
        if (bVar.e) {
            bVar.f8721b = i;
            return;
        }
        if (bVar.f8723d.d() == 0) {
            bVar.e = true;
            bVar.f8721b = i;
            return;
        }
        b bVarL2 = l();
        if (i < 0) {
            bVarL2.f8721b = i * (-1);
            bVarL2.f8723d.g(fVar, 1.0f);
        } else {
            bVarL2.f8721b = i;
            bVarL2.f8723d.g(fVar, -1.0f);
        }
        c(bVarL2);
    }

    public final void e(f fVar, f fVar2, int i, int i10) {
        if (i10 == 8 && fVar2.f8745f && fVar.f8743c == -1) {
            fVar.d(this, fVar2.e + i);
            return;
        }
        b bVarL = l();
        boolean z4 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z4 = true;
            }
            bVarL.f8721b = i;
        }
        if (z4) {
            bVarL.f8723d.g(fVar, 1.0f);
            bVarL.f8723d.g(fVar2, -1.0f);
        } else {
            bVarL.f8723d.g(fVar, -1.0f);
            bVarL.f8723d.g(fVar2, 1.0f);
        }
        if (i10 != 8) {
            bVarL.a(this, i10);
        }
        c(bVarL);
    }

    public final void f(f fVar, f fVar2, int i, int i10) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f8744d = 0;
        bVarL.b(fVar, fVar2, fVarM, i);
        if (i10 != 8) {
            bVarL.f8723d.g(j(i10), (int) (bVarL.f8723d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void g(f fVar, f fVar2, int i, int i10) {
        b bVarL = l();
        f fVarM = m();
        fVarM.f8744d = 0;
        bVarL.c(fVar, fVar2, fVarM, i);
        if (i10 != 8) {
            bVarL.f8723d.g(j(i10), (int) (bVarL.f8723d.c(fVarM) * (-1.0f)));
        }
        c(bVarL);
    }

    public final void h(b bVar) {
        int i;
        if (bVar.e) {
            bVar.f8720a.d(this, bVar.f8721b);
        } else {
            b[] bVarArr = this.f8730f;
            int i10 = this.f8732j;
            bVarArr[i10] = bVar;
            f fVar = bVar.f8720a;
            fVar.f8743c = i10;
            this.f8732j = i10 + 1;
            fVar.e(this, bVar);
        }
        if (this.f8726a) {
            int i11 = 0;
            while (i11 < this.f8732j) {
                if (this.f8730f[i11] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.f8730f[i11];
                if (bVar2 != null && bVar2.e) {
                    bVar2.f8720a.d(this, bVar2.f8721b);
                    ((p0.e) this.f8734l.f8039a).a(bVar2);
                    this.f8730f[i11] = null;
                    int i12 = i11 + 1;
                    int i13 = i12;
                    while (true) {
                        i = this.f8732j;
                        if (i12 >= i) {
                            break;
                        }
                        b[] bVarArr2 = this.f8730f;
                        int i14 = i12 - 1;
                        b bVar3 = bVarArr2[i12];
                        bVarArr2[i14] = bVar3;
                        f fVar2 = bVar3.f8720a;
                        if (fVar2.f8743c == i12) {
                            fVar2.f8743c = i14;
                        }
                        i13 = i12;
                        i12++;
                    }
                    if (i13 < i) {
                        this.f8730f[i13] = null;
                    }
                    this.f8732j = i - 1;
                    i11--;
                }
                i11++;
            }
            this.f8726a = false;
        }
    }

    public final void i() {
        for (int i = 0; i < this.f8732j; i++) {
            b bVar = this.f8730f[i];
            bVar.f8720a.e = bVar.f8721b;
        }
    }

    public final f j(int i) {
        if (this.i + 1 >= this.e) {
            o();
        }
        f fVarA = a(4);
        float[] fArr = fVarA.f8747s;
        int i10 = this.f8727b + 1;
        this.f8727b = i10;
        this.i++;
        fVarA.f8742b = i10;
        fVarA.f8744d = i;
        ((f[]) this.f8734l.f8041c)[i10] = fVarA;
        d dVar = this.f8728c;
        dVar.i.f8445b = fVarA;
        Arrays.fill(fArr, 0.0f);
        fArr[fVarA.f8744d] = 1.0f;
        dVar.j(fVarA);
        return fVarA;
    }

    public final f k(Object obj) {
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            o();
        }
        if (!(obj instanceof w.c)) {
            return null;
        }
        w.c cVar = (w.c) obj;
        f fVar = cVar.i;
        if (fVar == null) {
            cVar.k();
            fVar = cVar.i;
        }
        int i = fVar.f8742b;
        q5.d dVar = this.f8734l;
        if (i != -1 && i <= this.f8727b && ((f[]) dVar.f8041c)[i] != null) {
            return fVar;
        }
        if (i != -1) {
            fVar.c();
        }
        int i10 = this.f8727b + 1;
        this.f8727b = i10;
        this.i++;
        fVar.f8742b = i10;
        fVar.f8751w = 1;
        ((f[]) dVar.f8041c)[i10] = fVar;
        return fVar;
    }

    public final b l() {
        Object obj;
        q5.d dVar = this.f8734l;
        p0.e eVar = (p0.e) dVar.f8039a;
        int i = eVar.f7784b;
        if (i > 0) {
            int i10 = i - 1;
            Object[] objArr = eVar.f7783a;
            obj = objArr[i10];
            objArr[i10] = null;
            eVar.f7784b = i10;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(dVar);
        }
        bVar.f8720a = null;
        bVar.f8723d.b();
        bVar.f8721b = 0.0f;
        bVar.e = false;
        return bVar;
    }

    public final f m() {
        if (this.i + 1 >= this.e) {
            o();
        }
        f fVarA = a(3);
        int i = this.f8727b + 1;
        this.f8727b = i;
        this.i++;
        fVarA.f8742b = i;
        ((f[]) this.f8734l.f8041c)[i] = fVarA;
        return fVarA;
    }

    public final void o() {
        int i = this.f8729d * 2;
        this.f8729d = i;
        this.f8730f = (b[]) Arrays.copyOf(this.f8730f, i);
        q5.d dVar = this.f8734l;
        dVar.f8041c = (f[]) Arrays.copyOf((f[]) dVar.f8041c, this.f8729d);
        int i10 = this.f8729d;
        this.h = new boolean[i10];
        this.e = i10;
        this.f8733k = i10;
    }

    public final void p() {
        d dVar = this.f8728c;
        if (dVar.e()) {
            i();
            return;
        }
        if (!this.f8731g) {
            q(dVar);
            return;
        }
        for (int i = 0; i < this.f8732j; i++) {
            if (!this.f8730f[i].e) {
                q(dVar);
                return;
            }
        }
        i();
    }

    public final void q(d dVar) {
        for (int i = 0; i < this.f8732j; i++) {
            b bVar = this.f8730f[i];
            int i10 = 1;
            if (bVar.f8720a.f8751w != 1) {
                float f10 = 0.0f;
                if (bVar.f8721b < 0.0f) {
                    boolean z4 = false;
                    int i11 = 0;
                    while (!z4) {
                        i11 += i10;
                        float f11 = Float.MAX_VALUE;
                        int i12 = -1;
                        int i13 = -1;
                        int i14 = 0;
                        int i15 = 0;
                        while (i14 < this.f8732j) {
                            b bVar2 = this.f8730f[i14];
                            if (bVar2.f8720a.f8751w != i10 && !bVar2.e && bVar2.f8721b < f10) {
                                int iD = bVar2.f8723d.d();
                                int i16 = 0;
                                while (i16 < iD) {
                                    f fVarE = bVar2.f8723d.e(i16);
                                    float fC = bVar2.f8723d.c(fVarE);
                                    if (fC > f10) {
                                        for (int i17 = 0; i17 < 9; i17++) {
                                            float f12 = fVarE.f8746r[i17] / fC;
                                            if ((f12 < f11 && i17 == i15) || i17 > i15) {
                                                i15 = i17;
                                                i13 = fVarE.f8742b;
                                                i12 = i14;
                                                f11 = f12;
                                            }
                                        }
                                    }
                                    i16++;
                                    f10 = 0.0f;
                                }
                            }
                            i14++;
                            f10 = 0.0f;
                            i10 = 1;
                        }
                        if (i12 != -1) {
                            b bVar3 = this.f8730f[i12];
                            bVar3.f8720a.f8743c = -1;
                            bVar3.g(((f[]) this.f8734l.f8041c)[i13]);
                            f fVar = bVar3.f8720a;
                            fVar.f8743c = i12;
                            fVar.e(this, bVar3);
                        } else {
                            z4 = true;
                        }
                        if (i11 > this.i / 2) {
                            z4 = true;
                        }
                        f10 = 0.0f;
                        i10 = 1;
                    }
                    break;
                }
            }
        }
        r(dVar);
        i();
    }

    public final void r(b bVar) {
        boolean z4;
        int i = 0;
        for (int i10 = 0; i10 < this.i; i10++) {
            this.h[i10] = false;
        }
        boolean z10 = false;
        int i11 = 0;
        while (!z10) {
            int i12 = 1;
            i11++;
            if (i11 >= this.i * 2) {
                return;
            }
            f fVar = bVar.f8720a;
            if (fVar != null) {
                this.h[fVar.f8742b] = true;
            }
            f fVarD = bVar.d(this.h);
            if (fVarD != null) {
                boolean[] zArr = this.h;
                int i13 = fVarD.f8742b;
                if (zArr[i13]) {
                    return;
                } else {
                    zArr[i13] = true;
                }
            }
            if (fVarD != null) {
                float f10 = Float.MAX_VALUE;
                int i14 = i;
                int i15 = -1;
                while (i14 < this.f8732j) {
                    b bVar2 = this.f8730f[i14];
                    if (bVar2.f8720a.f8751w != i12 && !bVar2.e) {
                        a aVar = bVar2.f8723d;
                        int i16 = aVar.h;
                        if (i16 == -1) {
                            z4 = false;
                            break;
                        }
                        int i17 = 0;
                        while (true) {
                            if (i16 == -1 || i17 >= aVar.f8713a) {
                                z4 = false;
                                break;
                            } else if (aVar.e[i16] == fVarD.f8742b) {
                                z4 = true;
                                break;
                            } else {
                                i16 = aVar.f8717f[i16];
                                i17++;
                            }
                        }
                        if (z4) {
                            float fC = bVar2.f8723d.c(fVarD);
                            if (fC < 0.0f) {
                                float f11 = (-bVar2.f8721b) / fC;
                                if (f11 < f10) {
                                    f10 = f11;
                                    i15 = i14;
                                }
                            }
                        }
                    }
                    i14++;
                    i12 = 1;
                }
                if (i15 > -1) {
                    b bVar3 = this.f8730f[i15];
                    bVar3.f8720a.f8743c = -1;
                    bVar3.g(fVarD);
                    f fVar2 = bVar3.f8720a;
                    fVar2.f8743c = i15;
                    fVar2.e(this, bVar3);
                }
            } else {
                z10 = true;
            }
            i = 0;
        }
    }

    public final void s() {
        for (int i = 0; i < this.f8732j; i++) {
            b bVar = this.f8730f[i];
            if (bVar != null) {
                ((p0.e) this.f8734l.f8039a).a(bVar);
            }
            this.f8730f[i] = null;
        }
    }

    public final void t() {
        q5.d dVar;
        int i = 0;
        while (true) {
            dVar = this.f8734l;
            f[] fVarArr = (f[]) dVar.f8041c;
            if (i >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i];
            if (fVar != null) {
                fVar.c();
            }
            i++;
        }
        p0.e eVar = (p0.e) dVar.f8040b;
        f[] fVarArr2 = this.f8735m;
        int length = this.f8736n;
        eVar.getClass();
        if (length > fVarArr2.length) {
            length = fVarArr2.length;
        }
        for (int i10 = 0; i10 < length; i10++) {
            f fVar2 = fVarArr2[i10];
            int i11 = eVar.f7784b;
            Object[] objArr = eVar.f7783a;
            if (i11 < objArr.length) {
                objArr[i11] = fVar2;
                eVar.f7784b = i11 + 1;
            }
        }
        this.f8736n = 0;
        Arrays.fill((f[]) dVar.f8041c, (Object) null);
        this.f8727b = 0;
        d dVar2 = this.f8728c;
        dVar2.h = 0;
        dVar2.f8721b = 0.0f;
        this.i = 1;
        for (int i12 = 0; i12 < this.f8732j; i12++) {
            b bVar = this.f8730f[i12];
        }
        s();
        this.f8732j = 0;
        this.f8737o = new b(dVar);
    }
}

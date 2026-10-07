package u;

import da.v;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f8723d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f8720a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8721b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f8722c = new ArrayList();
    public boolean e = false;

    public b(q5.d dVar) {
        this.f8723d = new a(this, dVar);
    }

    public final void a(c cVar, int i) {
        this.f8723d.g(cVar.j(i), 1.0f);
        this.f8723d.g(cVar.j(i), -1.0f);
    }

    public final void b(f fVar, f fVar2, f fVar3, int i) {
        boolean z4 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z4 = true;
            }
            this.f8721b = i;
        }
        if (z4) {
            this.f8723d.g(fVar, 1.0f);
            this.f8723d.g(fVar2, -1.0f);
            this.f8723d.g(fVar3, -1.0f);
        } else {
            this.f8723d.g(fVar, -1.0f);
            this.f8723d.g(fVar2, 1.0f);
            this.f8723d.g(fVar3, 1.0f);
        }
    }

    public final void c(f fVar, f fVar2, f fVar3, int i) {
        boolean z4 = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z4 = true;
            }
            this.f8721b = i;
        }
        if (z4) {
            this.f8723d.g(fVar, 1.0f);
            this.f8723d.g(fVar2, -1.0f);
            this.f8723d.g(fVar3, 1.0f);
        } else {
            this.f8723d.g(fVar, -1.0f);
            this.f8723d.g(fVar2, 1.0f);
            this.f8723d.g(fVar3, -1.0f);
        }
    }

    public f d(boolean[] zArr) {
        return f(zArr, null);
    }

    public boolean e() {
        return this.f8720a == null && this.f8721b == 0.0f && this.f8723d.d() == 0;
    }

    public final f f(boolean[] zArr, f fVar) {
        int i;
        int iD = this.f8723d.d();
        f fVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iD; i10++) {
            float f11 = this.f8723d.f(i10);
            if (f11 < 0.0f) {
                f fVarE = this.f8723d.e(i10);
                if ((zArr == null || !zArr[fVarE.f8742b]) && fVarE != fVar && (((i = fVarE.f8751w) == 3 || i == 4) && f11 < f10)) {
                    f10 = f11;
                    fVar2 = fVarE;
                }
            }
        }
        return fVar2;
    }

    public final void g(f fVar) {
        f fVar2 = this.f8720a;
        if (fVar2 != null) {
            this.f8723d.g(fVar2, -1.0f);
            this.f8720a.f8743c = -1;
            this.f8720a = null;
        }
        float fH = this.f8723d.h(fVar, true) * (-1.0f);
        this.f8720a = fVar;
        if (fH == 1.0f) {
            return;
        }
        this.f8721b /= fH;
        a aVar = this.f8723d;
        int i = aVar.h;
        for (int i10 = 0; i != -1 && i10 < aVar.f8713a; i10++) {
            float[] fArr = aVar.f8718g;
            fArr[i] = fArr[i] / fH;
            i = aVar.f8717f[i];
        }
    }

    public final void h(c cVar, f fVar, boolean z4) {
        if (fVar.f8745f) {
            float fC = this.f8723d.c(fVar);
            this.f8721b = (fVar.e * fC) + this.f8721b;
            this.f8723d.h(fVar, z4);
            if (z4) {
                fVar.b(this);
            }
            if (this.f8723d.d() == 0) {
                this.e = true;
                cVar.f8726a = true;
            }
        }
    }

    public void i(c cVar, b bVar, boolean z4) {
        a aVar = this.f8723d;
        aVar.getClass();
        float fC = aVar.c(bVar.f8720a);
        aVar.h(bVar.f8720a, z4);
        a aVar2 = bVar.f8723d;
        int iD = aVar2.d();
        for (int i = 0; i < iD; i++) {
            f fVarE = aVar2.e(i);
            aVar.a(fVarE, aVar2.c(fVarE) * fC, z4);
        }
        this.f8721b = (bVar.f8721b * fC) + this.f8721b;
        if (z4) {
            bVar.f8720a.b(this);
        }
        if (this.f8720a == null || this.f8723d.d() != 0) {
            return;
        }
        this.e = true;
        cVar.f8726a = true;
    }

    public String toString() {
        boolean z4;
        String strH = v.h(this.f8720a == null ? "0" : "" + this.f8720a, " = ");
        if (this.f8721b != 0.0f) {
            StringBuilder sbB = e.b(strH);
            sbB.append(this.f8721b);
            strH = sbB.toString();
            z4 = true;
        } else {
            z4 = false;
        }
        int iD = this.f8723d.d();
        for (int i = 0; i < iD; i++) {
            f fVarE = this.f8723d.e(i);
            if (fVarE != null) {
                float f10 = this.f8723d.f(i);
                if (f10 != 0.0f) {
                    String string = fVarE.toString();
                    if (z4) {
                        if (f10 > 0.0f) {
                            strH = v.h(strH, " + ");
                        } else {
                            strH = v.h(strH, " - ");
                            f10 *= -1.0f;
                        }
                    } else if (f10 < 0.0f) {
                        strH = v.h(strH, "- ");
                        f10 *= -1.0f;
                    }
                    strH = f10 == 1.0f ? v.h(strH, string) : strH + f10 + " " + string;
                    z4 = true;
                }
            }
        }
        return !z4 ? v.h(strH, "0.0") : strH;
    }
}

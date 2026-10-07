package u;

import b0.h;
import java.util.Arrays;
import s5.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public f[] f8738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f[] f8739g;
    public int h;
    public j i;

    @Override // u.b
    public final f d(boolean[] zArr) {
        int i = -1;
        for (int i10 = 0; i10 < this.h; i10++) {
            f[] fVarArr = this.f8738f;
            f fVar = fVarArr[i10];
            if (!zArr[fVar.f8742b]) {
                j jVar = this.i;
                jVar.f8445b = fVar;
                int i11 = 8;
                if (i != -1) {
                    f fVar2 = fVarArr[i];
                    while (i11 >= 0) {
                        float f10 = fVar2.f8747s[i11];
                        float f11 = ((f) jVar.f8445b).f8747s[i11];
                        if (f11 != f10) {
                            if (f11 >= f10) {
                                break;
                            }
                            i = i10;
                            break;
                            break;
                        }
                        i11--;
                    }
                } else {
                    while (i11 >= 0) {
                        float f12 = ((f) jVar.f8445b).f8747s[i11];
                        if (f12 > 0.0f) {
                            break;
                        }
                        if (f12 < 0.0f) {
                            i = i10;
                            break;
                        }
                        i11--;
                    }
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f8738f[i];
    }

    @Override // u.b
    public final boolean e() {
        return this.h == 0;
    }

    @Override // u.b
    public final void i(c cVar, b bVar, boolean z4) {
        f fVar = bVar.f8720a;
        if (fVar == null) {
            return;
        }
        float[] fArr = fVar.f8747s;
        a aVar = bVar.f8723d;
        int iD = aVar.d();
        for (int i = 0; i < iD; i++) {
            f fVarE = aVar.e(i);
            float f10 = aVar.f(i);
            j jVar = this.i;
            jVar.f8445b = fVarE;
            if (fVarE.f8741a) {
                boolean z10 = true;
                for (int i10 = 0; i10 < 9; i10++) {
                    float[] fArr2 = ((f) jVar.f8445b).f8747s;
                    float f11 = (fArr[i10] * f10) + fArr2[i10];
                    fArr2[i10] = f11;
                    if (Math.abs(f11) < 1.0E-4f) {
                        ((f) jVar.f8445b).f8747s[i10] = 0.0f;
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    ((d) jVar.f8446c).k((f) jVar.f8445b);
                }
            } else {
                for (int i11 = 0; i11 < 9; i11++) {
                    float f12 = fArr[i11];
                    if (f12 != 0.0f) {
                        float f13 = f12 * f10;
                        if (Math.abs(f13) < 1.0E-4f) {
                            f13 = 0.0f;
                        }
                        ((f) jVar.f8445b).f8747s[i11] = f13;
                    } else {
                        ((f) jVar.f8445b).f8747s[i11] = 0.0f;
                    }
                }
                j(fVarE);
            }
            this.f8721b = (bVar.f8721b * f10) + this.f8721b;
        }
        k(fVar);
    }

    public final void j(f fVar) {
        int i;
        int i10 = this.h + 1;
        f[] fVarArr = this.f8738f;
        if (i10 > fVarArr.length) {
            f[] fVarArr2 = (f[]) Arrays.copyOf(fVarArr, fVarArr.length * 2);
            this.f8738f = fVarArr2;
            this.f8739g = (f[]) Arrays.copyOf(fVarArr2, fVarArr2.length * 2);
        }
        f[] fVarArr3 = this.f8738f;
        int i11 = this.h;
        fVarArr3[i11] = fVar;
        int i12 = i11 + 1;
        this.h = i12;
        if (i12 > 1 && fVarArr3[i11].f8742b > fVar.f8742b) {
            int i13 = 0;
            while (true) {
                i = this.h;
                if (i13 >= i) {
                    break;
                }
                this.f8739g[i13] = this.f8738f[i13];
                i13++;
            }
            Arrays.sort(this.f8739g, 0, i, new h(12));
            for (int i14 = 0; i14 < this.h; i14++) {
                this.f8738f[i14] = this.f8739g[i14];
            }
        }
        fVar.f8741a = true;
        fVar.a(this);
    }

    public final void k(f fVar) {
        int i = 0;
        while (i < this.h) {
            if (this.f8738f[i] == fVar) {
                while (true) {
                    int i10 = this.h;
                    if (i >= i10 - 1) {
                        this.h = i10 - 1;
                        fVar.f8741a = false;
                        return;
                    } else {
                        f[] fVarArr = this.f8738f;
                        int i11 = i + 1;
                        fVarArr[i] = fVarArr[i11];
                        i = i11;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // u.b
    public final String toString() {
        j jVar = this.i;
        String str = " goal -> (" + this.f8721b + ") : ";
        for (int i = 0; i < this.h; i++) {
            jVar.f8445b = this.f8738f[i];
            str = str + jVar + " ";
        }
        return str;
    }
}

package u;

import da.v;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f8714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q5.d f8715c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f8713a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8716d = 8;
    public int[] e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f8717f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f8718g = new float[8];
    public int h = -1;
    public int i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f8719j = false;

    public a(b bVar, q5.d dVar) {
        this.f8714b = bVar;
        this.f8715c = dVar;
    }

    public final void a(f fVar, float f10, boolean z4) {
        if (f10 <= -0.001f || f10 >= 0.001f) {
            int i = this.h;
            b bVar = this.f8714b;
            if (i == -1) {
                this.h = 0;
                this.f8718g[0] = f10;
                this.e[0] = fVar.f8742b;
                this.f8717f[0] = -1;
                fVar.f8750v++;
                fVar.a(bVar);
                this.f8713a++;
                if (this.f8719j) {
                    return;
                }
                int i10 = this.i + 1;
                this.i = i10;
                int[] iArr = this.e;
                if (i10 >= iArr.length) {
                    this.f8719j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i11 = -1;
            for (int i12 = 0; i != -1 && i12 < this.f8713a; i12++) {
                int i13 = this.e[i];
                int i14 = fVar.f8742b;
                if (i13 == i14) {
                    float[] fArr = this.f8718g;
                    float f11 = fArr[i] + f10;
                    if (f11 > -0.001f && f11 < 0.001f) {
                        f11 = 0.0f;
                    }
                    fArr[i] = f11;
                    if (f11 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f8717f[i];
                        } else {
                            int[] iArr2 = this.f8717f;
                            iArr2[i11] = iArr2[i];
                        }
                        if (z4) {
                            fVar.b(bVar);
                        }
                        if (this.f8719j) {
                            this.i = i;
                        }
                        fVar.f8750v--;
                        this.f8713a--;
                        return;
                    }
                    return;
                }
                if (i13 < i14) {
                    i11 = i;
                }
                i = this.f8717f[i];
            }
            int length = this.i;
            int i15 = length + 1;
            if (this.f8719j) {
                int[] iArr3 = this.e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i15;
            }
            int[] iArr4 = this.e;
            if (length >= iArr4.length && this.f8713a < iArr4.length) {
                int i16 = 0;
                while (true) {
                    int[] iArr5 = this.e;
                    if (i16 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i16] == -1) {
                        length = i16;
                        break;
                    }
                    i16++;
                }
            }
            int[] iArr6 = this.e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i17 = this.f8716d * 2;
                this.f8716d = i17;
                this.f8719j = false;
                this.i = length - 1;
                this.f8718g = Arrays.copyOf(this.f8718g, i17);
                this.e = Arrays.copyOf(this.e, this.f8716d);
                this.f8717f = Arrays.copyOf(this.f8717f, this.f8716d);
            }
            this.e[length] = fVar.f8742b;
            this.f8718g[length] = f10;
            if (i11 != -1) {
                int[] iArr7 = this.f8717f;
                iArr7[length] = iArr7[i11];
                iArr7[i11] = length;
            } else {
                this.f8717f[length] = this.h;
                this.h = length;
            }
            fVar.f8750v++;
            fVar.a(bVar);
            this.f8713a++;
            if (!this.f8719j) {
                this.i++;
            }
            int i18 = this.i;
            int[] iArr8 = this.e;
            if (i18 >= iArr8.length) {
                this.f8719j = true;
                this.i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i = this.h;
        for (int i10 = 0; i != -1 && i10 < this.f8713a; i10++) {
            f fVar = ((f[]) this.f8715c.f8041c)[this.e[i]];
            if (fVar != null) {
                fVar.b(this.f8714b);
            }
            i = this.f8717f[i];
        }
        this.h = -1;
        this.i = -1;
        this.f8719j = false;
        this.f8713a = 0;
    }

    public final float c(f fVar) {
        int i = this.h;
        for (int i10 = 0; i != -1 && i10 < this.f8713a; i10++) {
            if (this.e[i] == fVar.f8742b) {
                return this.f8718g[i];
            }
            i = this.f8717f[i];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f8713a;
    }

    public final f e(int i) {
        int i10 = this.h;
        for (int i11 = 0; i10 != -1 && i11 < this.f8713a; i11++) {
            if (i11 == i) {
                return ((f[]) this.f8715c.f8041c)[this.e[i10]];
            }
            i10 = this.f8717f[i10];
        }
        return null;
    }

    public final float f(int i) {
        int i10 = this.h;
        for (int i11 = 0; i10 != -1 && i11 < this.f8713a; i11++) {
            if (i11 == i) {
                return this.f8718g[i10];
            }
            i10 = this.f8717f[i10];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f10) {
        if (f10 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i = this.h;
        b bVar = this.f8714b;
        if (i == -1) {
            this.h = 0;
            this.f8718g[0] = f10;
            this.e[0] = fVar.f8742b;
            this.f8717f[0] = -1;
            fVar.f8750v++;
            fVar.a(bVar);
            this.f8713a++;
            if (this.f8719j) {
                return;
            }
            int i10 = this.i + 1;
            this.i = i10;
            int[] iArr = this.e;
            if (i10 >= iArr.length) {
                this.f8719j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i11 = -1;
        for (int i12 = 0; i != -1 && i12 < this.f8713a; i12++) {
            int i13 = this.e[i];
            int i14 = fVar.f8742b;
            if (i13 == i14) {
                this.f8718g[i] = f10;
                return;
            }
            if (i13 < i14) {
                i11 = i;
            }
            i = this.f8717f[i];
        }
        int length = this.i;
        int i15 = length + 1;
        if (this.f8719j) {
            int[] iArr2 = this.e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i15;
        }
        int[] iArr3 = this.e;
        if (length >= iArr3.length && this.f8713a < iArr3.length) {
            int i16 = 0;
            while (true) {
                int[] iArr4 = this.e;
                if (i16 >= iArr4.length) {
                    break;
                }
                if (iArr4[i16] == -1) {
                    length = i16;
                    break;
                }
                i16++;
            }
        }
        int[] iArr5 = this.e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i17 = this.f8716d * 2;
            this.f8716d = i17;
            this.f8719j = false;
            this.i = length - 1;
            this.f8718g = Arrays.copyOf(this.f8718g, i17);
            this.e = Arrays.copyOf(this.e, this.f8716d);
            this.f8717f = Arrays.copyOf(this.f8717f, this.f8716d);
        }
        this.e[length] = fVar.f8742b;
        this.f8718g[length] = f10;
        if (i11 != -1) {
            int[] iArr6 = this.f8717f;
            iArr6[length] = iArr6[i11];
            iArr6[i11] = length;
        } else {
            this.f8717f[length] = this.h;
            this.h = length;
        }
        fVar.f8750v++;
        fVar.a(bVar);
        int i18 = this.f8713a + 1;
        this.f8713a = i18;
        if (!this.f8719j) {
            this.i++;
        }
        int[] iArr7 = this.e;
        if (i18 >= iArr7.length) {
            this.f8719j = true;
        }
        if (this.i >= iArr7.length) {
            this.f8719j = true;
            this.i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z4) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i10 = 0;
        int i11 = -1;
        while (i != -1 && i10 < this.f8713a) {
            if (this.e[i] == fVar.f8742b) {
                if (i == this.h) {
                    this.h = this.f8717f[i];
                } else {
                    int[] iArr = this.f8717f;
                    iArr[i11] = iArr[i];
                }
                if (z4) {
                    fVar.b(this.f8714b);
                }
                fVar.f8750v--;
                this.f8713a--;
                this.e[i] = -1;
                if (this.f8719j) {
                    this.i = i;
                }
                return this.f8718g[i];
            }
            i10++;
            i11 = i;
            i = this.f8717f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.h;
        String string = "";
        for (int i10 = 0; i != -1 && i10 < this.f8713a; i10++) {
            StringBuilder sbB = e.b(v.h(string, " -> "));
            sbB.append(this.f8718g[i]);
            sbB.append(" : ");
            StringBuilder sbB2 = e.b(sbB.toString());
            sbB2.append(((f[]) this.f8715c.f8041c)[this.e[i]]);
            string = sbB2.toString();
            i = this.f8717f[i];
        }
        return string;
    }
}

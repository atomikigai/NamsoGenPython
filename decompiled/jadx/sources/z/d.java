package z;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ViewGroup.MarginLayoutParams {
    public int A;
    public int B;
    public int C;
    public int D;
    public float E;
    public float F;
    public String G;
    public float H;
    public float I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public float R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;
    public boolean X;
    public String Y;
    public int Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10725a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f10726a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10727b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f10728b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f10729c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f10730c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f10731d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f10732d0;
    public int e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f10733e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10734f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f10735f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10736g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f10737g0;
    public int h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f10738h0;
    public int i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f10739i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10740j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f10741j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10742k;
    public int k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10743l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f10744l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10745m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f10746m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10747n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public int f10748n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10749o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f10750o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10751p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public w.d f10752p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f10753q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f10754r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10755s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f10756t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f10757u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f10758v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f10759w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f10760x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f10761y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f10762z;

    public final void a() {
        this.f10732d0 = false;
        this.f10726a0 = true;
        this.f10728b0 = true;
        int i = ((ViewGroup.MarginLayoutParams) this).width;
        if (i == -2 && this.W) {
            this.f10726a0 = false;
            if (this.L == 0) {
                this.L = 1;
            }
        }
        int i10 = ((ViewGroup.MarginLayoutParams) this).height;
        if (i10 == -2 && this.X) {
            this.f10728b0 = false;
            if (this.M == 0) {
                this.M = 1;
            }
        }
        if (i == 0 || i == -1) {
            this.f10726a0 = false;
            if (i == 0 && this.L == 1) {
                ((ViewGroup.MarginLayoutParams) this).width = -2;
                this.W = true;
            }
        }
        if (i10 == 0 || i10 == -1) {
            this.f10728b0 = false;
            if (i10 == 0 && this.M == 1) {
                ((ViewGroup.MarginLayoutParams) this).height = -2;
                this.X = true;
            }
        }
        if (this.f10729c == -1.0f && this.f10725a == -1 && this.f10727b == -1) {
            return;
        }
        this.f10732d0 = true;
        this.f10726a0 = true;
        this.f10728b0 = true;
        if (!(this.f10752p0 instanceof w.h)) {
            this.f10752p0 = new w.h();
        }
        ((w.h) this.f10752p0).S(this.V);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    /* JADX WARN: Code duplicated, block: B:26:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x007a  */
    /* JADX WARN: Code duplicated, block: B:39:0x0082 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x008b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x008d  */
    @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
    public final void resolveLayoutDirection(int i) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
        int i15 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
        super.resolveLayoutDirection(i);
        boolean z4 = false;
        boolean z10 = 1 == getLayoutDirection();
        this.f10738h0 = -1;
        this.f10739i0 = -1;
        this.f10735f0 = -1;
        this.f10737g0 = -1;
        this.f10741j0 = this.f10759w;
        this.k0 = this.f10761y;
        float f10 = this.E;
        this.f10744l0 = f10;
        int i16 = this.f10725a;
        this.f10746m0 = i16;
        int i17 = this.f10727b;
        this.f10748n0 = i17;
        float f11 = this.f10729c;
        this.f10750o0 = f11;
        if (z10) {
            int i18 = this.f10755s;
            if (i18 != -1) {
                this.f10738h0 = i18;
            } else {
                int i19 = this.f10756t;
                if (i19 != -1) {
                    this.f10739i0 = i19;
                } else {
                    i10 = this.f10757u;
                    if (i10 != -1) {
                        this.f10737g0 = i10;
                        z4 = true;
                    }
                    i11 = this.f10758v;
                    if (i11 != -1) {
                        this.f10735f0 = i11;
                        z4 = true;
                    }
                    i12 = this.A;
                    if (i12 != Integer.MIN_VALUE) {
                        this.k0 = i12;
                    }
                    i13 = this.B;
                    if (i13 != Integer.MIN_VALUE) {
                        this.f10741j0 = i13;
                    }
                    if (z4) {
                        this.f10744l0 = 1.0f - f10;
                    }
                    if (this.f10732d0 && this.V == 1 && this.f10731d) {
                        if (f11 != -1.0f) {
                            this.f10750o0 = 1.0f - f11;
                            this.f10746m0 = -1;
                            this.f10748n0 = -1;
                        } else if (i16 != -1) {
                            this.f10748n0 = i16;
                            this.f10746m0 = -1;
                            this.f10750o0 = -1.0f;
                        } else if (i17 != -1) {
                            this.f10746m0 = i17;
                            this.f10748n0 = -1;
                            this.f10750o0 = -1.0f;
                        }
                    }
                }
            }
            z4 = true;
            i10 = this.f10757u;
            if (i10 != -1) {
                this.f10737g0 = i10;
                z4 = true;
            }
            i11 = this.f10758v;
            if (i11 != -1) {
                this.f10735f0 = i11;
                z4 = true;
            }
            i12 = this.A;
            if (i12 != Integer.MIN_VALUE) {
                this.k0 = i12;
            }
            i13 = this.B;
            if (i13 != Integer.MIN_VALUE) {
                this.f10741j0 = i13;
            }
            if (z4) {
                this.f10744l0 = 1.0f - f10;
            }
            if (this.f10732d0) {
                if (f11 != -1.0f) {
                    this.f10750o0 = 1.0f - f11;
                    this.f10746m0 = -1;
                    this.f10748n0 = -1;
                } else if (i16 != -1) {
                    this.f10748n0 = i16;
                    this.f10746m0 = -1;
                    this.f10750o0 = -1.0f;
                } else if (i17 != -1) {
                    this.f10746m0 = i17;
                    this.f10748n0 = -1;
                    this.f10750o0 = -1.0f;
                }
            }
        } else {
            int i20 = this.f10755s;
            if (i20 != -1) {
                this.f10737g0 = i20;
            }
            int i21 = this.f10756t;
            if (i21 != -1) {
                this.f10735f0 = i21;
            }
            int i22 = this.f10757u;
            if (i22 != -1) {
                this.f10738h0 = i22;
            }
            int i23 = this.f10758v;
            if (i23 != -1) {
                this.f10739i0 = i23;
            }
            int i24 = this.A;
            if (i24 != Integer.MIN_VALUE) {
                this.f10741j0 = i24;
            }
            int i25 = this.B;
            if (i25 != Integer.MIN_VALUE) {
                this.k0 = i25;
            }
        }
        if (this.f10757u == -1 && this.f10758v == -1 && this.f10756t == -1 && this.f10755s == -1) {
            int i26 = this.f10736g;
            if (i26 != -1) {
                this.f10738h0 = i26;
                if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                    ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                }
            } else {
                int i27 = this.h;
                if (i27 != -1) {
                    this.f10739i0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i15 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i15;
                    }
                }
            }
            int i28 = this.e;
            if (i28 != -1) {
                this.f10735f0 = i28;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
                return;
            }
            int i29 = this.f10734f;
            if (i29 != -1) {
                this.f10737g0 = i29;
                if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i14 <= 0) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) this).leftMargin = i14;
            }
        }
    }
}

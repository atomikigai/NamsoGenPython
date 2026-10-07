package u;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8741a;
    public float e;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f8751w;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8742b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8743c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8744d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f8745f = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final float[] f8746r = new float[9];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[] f8747s = new float[9];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public b[] f8748t = new b[16];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8749u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f8750v = 0;

    public f(int i) {
        this.f8751w = i;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i10 = this.f8749u;
            if (i >= i10) {
                b[] bVarArr = this.f8748t;
                if (i10 >= bVarArr.length) {
                    this.f8748t = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f8748t;
                int i11 = this.f8749u;
                bVarArr2[i11] = bVar;
                this.f8749u = i11 + 1;
                return;
            }
            if (this.f8748t[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(b bVar) {
        int i = this.f8749u;
        int i10 = 0;
        while (i10 < i) {
            if (this.f8748t[i10] == bVar) {
                while (i10 < i - 1) {
                    b[] bVarArr = this.f8748t;
                    int i11 = i10 + 1;
                    bVarArr[i10] = bVarArr[i11];
                    i10 = i11;
                }
                this.f8749u--;
                return;
            }
            i10++;
        }
    }

    public final void c() {
        this.f8751w = 5;
        this.f8744d = 0;
        this.f8742b = -1;
        this.f8743c = -1;
        this.e = 0.0f;
        this.f8745f = false;
        int i = this.f8749u;
        for (int i10 = 0; i10 < i; i10++) {
            this.f8748t[i10] = null;
        }
        this.f8749u = 0;
        this.f8750v = 0;
        this.f8741a = false;
        Arrays.fill(this.f8747s, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f8742b - ((f) obj).f8742b;
    }

    public final void d(c cVar, float f10) {
        this.e = f10;
        this.f8745f = true;
        int i = this.f8749u;
        this.f8743c = -1;
        for (int i10 = 0; i10 < i; i10++) {
            this.f8748t[i10].h(cVar, this, false);
        }
        this.f8749u = 0;
    }

    public final void e(c cVar, b bVar) {
        int i = this.f8749u;
        for (int i10 = 0; i10 < i; i10++) {
            this.f8748t[i10].i(cVar, bVar, false);
        }
        this.f8749u = 0;
    }

    public final String toString() {
        return "" + this.f8742b;
    }
}

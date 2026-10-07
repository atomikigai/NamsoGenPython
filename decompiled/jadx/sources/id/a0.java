package id;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f5258b = new int[10];

    public final int a() {
        if ((this.f5257a & 128) != 0) {
            return this.f5258b[7];
        }
        return 65535;
    }

    public final void b(a0 a0Var) {
        jc.i.e(a0Var, "other");
        for (int i = 0; i < 10; i++) {
            if (((1 << i) & a0Var.f5257a) != 0) {
                c(i, a0Var.f5258b[i]);
            }
        }
    }

    public final void c(int i, int i10) {
        if (i >= 0) {
            int[] iArr = this.f5258b;
            if (i >= iArr.length) {
                return;
            }
            this.f5257a = (1 << i) | this.f5257a;
            iArr[i] = i10;
        }
    }
}

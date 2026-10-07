package l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f6353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f6354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f6356d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f6357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f6358g;
    public boolean h;

    public final void a(int i, int i10) {
        this.f6355c = i;
        this.f6356d = i10;
        this.h = true;
        if (this.f6358g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f6353a = i10;
            }
            if (i != Integer.MIN_VALUE) {
                this.f6354b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f6353a = i;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f6354b = i10;
        }
    }
}

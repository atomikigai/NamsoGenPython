package ea;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f3517c = new f(0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3519b;

    public f(int i, int i10) {
        this.f3518a = i;
        this.f3519b = i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f.class.getSimpleName());
        sb2.append("[position = ");
        sb2.append(this.f3518a);
        sb2.append(", length = ");
        return u3.b.c(sb2, this.f3519b, "]");
    }
}

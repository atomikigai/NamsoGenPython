package h6;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4971a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f4972b;

    public final synchronized float a() {
        synchronized (this) {
            float f10 = this.f4972b;
            if (f10 >= 0.0f) {
                return f10;
            }
            return 1.0f;
        }
    }
}

package m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.bumptech.glide.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile a f6957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.webkit.a f6958c = new androidx.webkit.a(2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f6959a = new d();

    public static a V() {
        if (f6957b != null) {
            return f6957b;
        }
        synchronized (a.class) {
            try {
                if (f6957b == null) {
                    f6957b = new a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f6957b;
    }
}

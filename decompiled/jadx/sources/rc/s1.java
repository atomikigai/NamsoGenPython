package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f8317a = new ThreadLocal();

    public static u0 a() {
        ThreadLocal threadLocal = f8317a;
        u0 u0Var = (u0) threadLocal.get();
        if (u0Var != null) {
            return u0Var;
        }
        h hVar = new h(Thread.currentThread());
        threadLocal.set(hVar);
        return hVar;
    }
}

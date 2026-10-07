package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f11413b;

    public w0(z0 z0Var, String str) {
        this.f11413b = z0Var;
        this.f11412a = str;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final synchronized void uncaughtException(Thread thread, Throwable th) {
        i0 i0Var = ((a1) this.f11413b.f159a).f11007t;
        a1.f(i0Var);
        i0Var.f11190f.c(th, this.f11412a);
    }
}

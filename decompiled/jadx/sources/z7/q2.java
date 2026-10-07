package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s5.j f11323c;

    public q2(s5.j jVar, long j4, long j10) {
        this.f11323c = jVar;
        this.f11321a = j4;
        this.f11322b = j10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        z0 z0Var = ((a1) ((t2) this.f11323c.f8446c).f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new v9.i0(this, 6));
    }
}

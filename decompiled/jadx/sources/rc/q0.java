package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u1 f8307c;

    public q0(long j4, u1 u1Var) {
        this.f8312a = j4;
        this.f8313b = -1;
        this.f8307c = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8307c.run();
    }

    @Override // rc.r0
    public final String toString() {
        return super.toString() + this.f8307c;
    }
}

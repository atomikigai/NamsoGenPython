package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g2 extends k {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ k2 f11142f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2(k2 k2Var, a1 a1Var, int i) {
        super(a1Var);
        this.e = i;
        this.f11142f = k2Var;
    }

    @Override // z7.k
    public final void b() {
        switch (this.e) {
            case 0:
                k2 k2Var = this.f11142f;
                k2Var.c();
                if (k2Var.j()) {
                    i0 i0Var = ((a1) k2Var.f159a).f11007t;
                    a1.f(i0Var);
                    i0Var.f11198y.b("Inactivity, disconnecting from the service");
                    k2Var.s();
                    break;
                }
                break;
            default:
                i0 i0Var2 = ((a1) this.f11142f.f159a).f11007t;
                a1.f(i0Var2);
                i0Var2.f11193t.b("Tasks have been queued for a long time");
                break;
        }
    }
}

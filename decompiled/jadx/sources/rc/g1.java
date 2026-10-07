package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1 extends k {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f8275t;

    public g1(yb.d dVar, q qVar) {
        super(1, dVar);
        this.f8275t = qVar;
    }

    @Override // rc.k
    public final Throwable q(l1 l1Var) {
        Throwable thB;
        Object objA = this.f8275t.A();
        if (!(objA instanceof i1) || (thB = ((i1) objA).b()) == null) {
            return objA instanceof s ? ((s) objA).f8315a : l1Var.u();
        }
        return thB;
    }

    @Override // rc.k
    public final String y() {
        return "AwaitContinuation";
    }
}

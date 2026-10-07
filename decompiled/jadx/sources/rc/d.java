package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c[] f8265a;

    public d(c[] cVarArr) {
        this.f8265a = cVarArr;
    }

    @Override // rc.i
    public final void c(Throwable th) {
        d();
    }

    public final void d() {
        for (c cVar : this.f8265a) {
            m0 m0Var = cVar.f8260f;
            if (m0Var == null) {
                jc.i.i("handle");
                throw null;
            }
            m0Var.f();
        }
    }

    @Override // ic.l
    public final Object invoke(Object obj) {
        d();
        return ub.k.f9073a;
    }

    public final String toString() {
        return "DisposeHandlersOnCancel[" + this.f8265a + ']';
    }
}

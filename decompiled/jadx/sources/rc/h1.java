package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1 extends f1 {
    public final l1 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i1 f8277f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final o f8278r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f8279s;

    public h1(l1 l1Var, i1 i1Var, o oVar, Object obj) {
        this.e = l1Var;
        this.f8277f = i1Var;
        this.f8278r = oVar;
        this.f8279s = obj;
    }

    @Override // ic.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Throwable) obj);
        return ub.k.f9073a;
    }

    @Override // rc.f1
    public final void m(Throwable th) {
        o oVarN = l1.N(this.f8278r);
        l1 l1Var = this.e;
        i1 i1Var = this.f8277f;
        Object obj = this.f8279s;
        if (oVarN != null) {
            while (oVarN.e.I((2 & 1) == 0, (2 & 2) != 0, new h1(l1Var, i1Var, oVarN, obj)) == n1.f8304a) {
                oVarN = l1.N(oVarN);
                if (oVarN == null) {
                }
            }
            return;
        }
        l1Var.k(l1Var.t(i1Var, obj));
    }
}

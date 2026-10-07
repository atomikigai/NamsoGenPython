package l;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends u1 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m0 f6267u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ p0 f6268v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(p0 p0Var, p0 p0Var2, m0 m0Var) {
        super(p0Var2);
        this.f6268v = p0Var;
        this.f6267u = m0Var;
    }

    @Override // l.u1
    public final k.c0 b() {
        return this.f6267u;
    }

    @Override // l.u1
    public final boolean c() {
        p0 p0Var = this.f6268v;
        if (p0Var.getInternalPopup().a()) {
            return true;
        }
        p0Var.f6389f.n(h0.b(p0Var), h0.a(p0Var));
        return true;
    }
}

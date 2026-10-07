package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class w1 extends wc.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    public w1(yb.d dVar, yb.i iVar) {
        x1 x1Var = x1.f8335a;
        super(dVar, iVar.H(x1Var) == null ? iVar.B(x1Var) : iVar);
        this.e = new ThreadLocal();
        if (dVar.getContext().H(yb.e.f10673a) instanceof x) {
            return;
        }
        Object objM = wc.a.m(iVar, null);
        wc.a.g(iVar, objM);
        Z(iVar, objM);
    }

    public final boolean Y() {
        boolean z4 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z4;
    }

    public final void Z(yb.i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new ub.f(iVar, obj));
    }

    @Override // wc.s, rc.l1
    public final void l(Object obj) {
        if (this.threadLocalIsSet) {
            ub.f fVar = (ub.f) this.e.get();
            if (fVar != null) {
                wc.a.g((yb.i) fVar.f9065a, fVar.f9066b);
            }
            this.e.remove();
        }
        Object objS = b0.s(obj);
        yb.d dVar = this.f9952d;
        yb.i context = dVar.getContext();
        Object objM = wc.a.m(context, null);
        w1 w1VarX = objM != wc.a.f9918f ? b0.x(dVar, context, objM) : null;
        try {
            this.f9952d.resumeWith(objS);
        } finally {
            if (w1VarX == null || w1VarX.Y()) {
                wc.a.g(context, objM);
            }
        }
    }
}

package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends f1 {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f8305f;

    public /* synthetic */ o0(Object obj, int i) {
        this.e = i;
        this.f8305f = obj;
    }

    @Override // ic.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                m((Throwable) obj);
                break;
            case 1:
                m((Throwable) obj);
                break;
            case 2:
                m((Throwable) obj);
                break;
            default:
                m((Throwable) obj);
                break;
        }
        return ub.k.f9073a;
    }

    @Override // rc.f1
    public final void m(Throwable th) {
        switch (this.e) {
            case 0:
                ((m0) this.f8305f).f();
                break;
            case 1:
                ((ic.l) this.f8305f).invoke(th);
                break;
            case 2:
                g1 g1Var = (g1) this.f8305f;
                Object objA = l().A();
                if (!(objA instanceof s)) {
                    g1Var.resumeWith(b0.w(objA));
                } else {
                    g1Var.resumeWith(r7.g.m(((s) objA).f8315a));
                }
                break;
            default:
                ((k) this.f8305f).resumeWith(ub.k.f9073a);
                break;
        }
    }
}

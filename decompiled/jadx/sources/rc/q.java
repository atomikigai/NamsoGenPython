package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class q extends l1 implements p {
    public final Object V(ac.c cVar) throws Throwable {
        Object objA;
        Object objW;
        do {
            objA = A();
            if (!(objA instanceof y0)) {
                if (objA instanceof s) {
                    throw ((s) objA).f8315a;
                }
                objW = b0.w(objA);
            }
            zb.a aVar = zb.a.f11555a;
            return objW;
        } while (S(objA) < 0);
        g1 g1Var = new g1(qd.b.r(cVar), this);
        g1Var.s();
        g1Var.u(new n0(I(false, true, new o0(g1Var, 2)), 0));
        objW = g1Var.r();
        zb.a aVar2 = zb.a.f11555a;
        zb.a aVar3 = zb.a.f11555a;
        return objW;
    }

    public final boolean W(Throwable th) {
        return K(new s(false, th));
    }
}

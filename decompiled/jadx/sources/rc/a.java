package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends l1 implements yb.d, a0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yb.i f8249c;

    public a(yb.i iVar, boolean z4) {
        super(z4);
        F((b1) iVar.H(y.f8337b));
        this.f8249c = iVar.B(this);
    }

    @Override // rc.l1
    public final void D(androidx.datastore.preferences.protobuf.d1 d1Var) {
        b0.n(d1Var, this.f8249c);
    }

    @Override // rc.l1
    public final void P(Object obj) {
        if (!(obj instanceof s)) {
            W(obj);
            return;
        }
        s sVar = (s) obj;
        V(s.f8314b.get(sVar) != 0, sVar.f8315a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void X(int i, a aVar, ic.p pVar) {
        int iD = u.e.d(i);
        if (iD == 0) {
            n9.b.C(pVar, aVar, this);
            return;
        }
        if (iD != 1) {
            if (iD == 2) {
                qd.b.r(((ac.a) pVar).create(aVar, this)).resumeWith(ub.k.f9073a);
                return;
            }
            if (iD != 3) {
                throw new androidx.datastore.preferences.protobuf.d1();
            }
            try {
                yb.i iVar = this.f8249c;
                Object objM = wc.a.m(iVar, null);
                try {
                    jc.t.a(2, pVar);
                    Object objInvoke = pVar.invoke(aVar, this);
                    wc.a.g(iVar, objM);
                    if (objInvoke != zb.a.f11555a) {
                        resumeWith(objInvoke);
                    }
                } catch (Throwable th) {
                    wc.a.g(iVar, objM);
                    throw th;
                }
            } catch (Throwable th2) {
                resumeWith(r7.g.m(th2));
            }
        }
    }

    @Override // rc.a0
    public final yb.i b() {
        return this.f8249c;
    }

    @Override // yb.d
    public final yb.i getContext() {
        return this.f8249c;
    }

    @Override // rc.l1
    public final String p() {
        return getClass().getSimpleName().concat(" was cancelled");
    }

    @Override // yb.d
    public final void resumeWith(Object obj) {
        Throwable thA = ub.h.a(obj);
        if (thA != null) {
            obj = new s(false, thA);
        }
        Object objL = L(obj);
        if (objL == b0.e) {
            return;
        }
        l(objL);
    }

    public void W(Object obj) {
    }

    public void V(boolean z4, Throwable th) {
    }
}

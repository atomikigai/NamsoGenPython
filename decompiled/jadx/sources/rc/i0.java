package rc;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class i0 extends yc.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f8280c;

    public i0(int i) {
        super(0L, yc.j.f10706g);
        this.f8280c = i;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract yb.d c();

    public Throwable d(Object obj) {
        s sVar = obj instanceof s ? (s) obj : null;
        if (sVar != null) {
            return sVar.f8315a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            p3.a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        jc.i.b(th);
        b0.n(new hc.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), c().getContext());
    }

    public abstract Object j();

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    @Override // java.lang.Runnable
    public final void run() {
        b1 b1Var;
        Object objM = ub.k.f9073a;
        t2.m mVar = this.f10699b;
        try {
            yb.d dVarC = c();
            jc.i.c(dVarC, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            wc.h hVar = (wc.h) dVarC;
            ac.c cVar = hVar.e;
            Object obj = hVar.f9933r;
            yb.i context = cVar.getContext();
            Object objM2 = wc.a.m(context, obj);
            w1 w1VarX = objM2 != wc.a.f9918f ? b0.x(cVar, context, objM2) : null;
            try {
                yb.i context2 = cVar.getContext();
                Object objJ = j();
                Throwable thD = d(objJ);
                if (thD == null) {
                    int i = this.f8280c;
                    boolean z4 = true;
                    if (i != 1 && i != 2) {
                        z4 = false;
                    }
                    if (z4) {
                        b1Var = (b1) context2.H(y.f8337b);
                    } else {
                        b1Var = null;
                    }
                } else {
                    b1Var = null;
                }
                if (b1Var != null && !b1Var.c()) {
                    CancellationException cancellationExceptionU = ((l1) b1Var).u();
                    b(objJ, cancellationExceptionU);
                    cVar.resumeWith(r7.g.m(cancellationExceptionU));
                } else if (thD != null) {
                    cVar.resumeWith(r7.g.m(thD));
                } else {
                    cVar.resumeWith(g(objJ));
                }
                if (w1VarX == null || w1VarX.Y()) {
                    wc.a.g(context, objM2);
                }
                try {
                    mVar.getClass();
                } catch (Throwable th) {
                    objM = r7.g.m(th);
                }
                h(null, ub.h.a(objM));
            } catch (Throwable th2) {
                if (w1VarX == null || w1VarX.Y()) {
                    wc.a.g(context, objM2);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                mVar.getClass();
            } catch (Throwable th4) {
                objM = r7.g.m(th4);
            }
            h(th3, ub.h.a(objM));
        }
    }

    public Object g(Object obj) {
        return obj;
    }
}

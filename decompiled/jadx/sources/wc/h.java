package wc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rc.b0;
import rc.i0;
import rc.s1;
import rc.u0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends i0 implements ac.d, yb.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9930s = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "_reusableCancellableContinuation");
    private volatile Object _reusableCancellableContinuation;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final rc.x f9931d;
    public final ac.c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f9932f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f9933r;

    public h(rc.x xVar, ac.c cVar) {
        super(-1);
        this.f9931d = xVar;
        this.e = cVar;
        this.f9932f = a.f9916c;
        this.f9933r = a.l(cVar.getContext());
    }

    @Override // rc.i0
    public final void b(Object obj, CancellationException cancellationException) {
        if (obj instanceof rc.t) {
            throw null;
        }
    }

    @Override // ac.d
    public final ac.d getCallerFrame() {
        ac.c cVar = this.e;
        if (cVar != null) {
            return cVar;
        }
        return null;
    }

    @Override // yb.d
    public final yb.i getContext() {
        return this.e.getContext();
    }

    @Override // rc.i0
    public final Object j() {
        Object obj = this.f9932f;
        this.f9932f = a.f9916c;
        return obj;
    }

    @Override // yb.d
    public final void resumeWith(Object obj) {
        ac.c cVar = this.e;
        yb.i context = cVar.getContext();
        Throwable thA = ub.h.a(obj);
        Object sVar = thA == null ? obj : new rc.s(false, thA);
        rc.x xVar = this.f9931d;
        if (xVar.T()) {
            this.f9932f = sVar;
            this.f8280c = 0;
            xVar.S(context, this);
            return;
        }
        u0 u0VarA = s1.a();
        if (u0VarA.f8326c >= 4294967296L) {
            this.f9932f = sVar;
            this.f8280c = 0;
            vb.g gVar = u0VarA.e;
            if (gVar == null) {
                gVar = new vb.g();
                u0VarA.e = gVar;
            }
            gVar.addLast(this);
            return;
        }
        u0VarA.W(true);
        try {
            yb.i context2 = cVar.getContext();
            Object objM = a.m(context2, this.f9933r);
            try {
                cVar.resumeWith(obj);
                a.g(context2, objM);
                while (u0VarA.Y()) {
                }
            } catch (Throwable th) {
                a.g(context2, objM);
                throw th;
            }
        } catch (Throwable th2) {
            try {
                h(th2, null);
            } finally {
                u0VarA.U(true);
            }
        }
    }

    public final String toString() {
        return "DispatchedContinuation[" + this.f9931d + ", " + b0.v(this.e) + ']';
    }

    @Override // rc.i0
    public final yb.d c() {
        return this;
    }
}

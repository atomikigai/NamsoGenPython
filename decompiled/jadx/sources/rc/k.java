package rc;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class k extends i0 implements j, ac.d, y1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8288f = AtomicIntegerFieldUpdater.newUpdater(k.class, "_decisionAndIndex");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8289r = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8290s = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_parentHandle");
    private volatile int _decisionAndIndex;
    private volatile Object _parentHandle;
    private volatile Object _state;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final yb.d f8291d;
    public final yb.i e;

    public k(int i, yb.d dVar) {
        super(i);
        this.f8291d = dVar;
        this.e = dVar.getContext();
        this._decisionAndIndex = 536870911;
        this._state = b.f8251a;
    }

    public static Object B(o1 o1Var, Object obj, int i, ic.l lVar) {
        if (obj instanceof s) {
            return obj;
        }
        if (i != 1 && i != 2) {
            return obj;
        }
        if (lVar != null || (o1Var instanceof i)) {
            return new r(obj, o1Var instanceof i ? (i) o1Var : null, lVar, (CancellationException) null, 16);
        }
        return obj;
    }

    public static void x(o1 o1Var, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + o1Var + ", already has " + obj).toString());
    }

    public final void A(Object obj, int i, ic.l lVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8289r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof o1)) {
                if (obj2 instanceof l) {
                    l lVar2 = (l) obj2;
                    if (l.f8298c.compareAndSet(lVar2, 0, 1)) {
                        if (lVar != null) {
                            l(lVar, lVar2.f8315a);
                            return;
                        }
                        return;
                    }
                }
                throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
            }
            Object objB = B((o1) obj2, obj, i, lVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objB)) {
                    if (!w()) {
                        o();
                    }
                    p(i);
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    public final i6.e C(Object obj, ic.l lVar) {
        i6.e eVar = b0.f8252a;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8289r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof o1)) {
                return null;
            }
            Object objB = B((o1) obj2, obj, this.f8280c, lVar);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, objB)) {
                    if (!w()) {
                        o();
                    }
                    return eVar;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
        }
    }

    @Override // rc.y1
    public final void a(wc.t tVar, int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f8288f;
            i10 = atomicIntegerFieldUpdater.get(this);
            if ((i10 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, ((i10 >> 29) << 29) + i));
        v(tVar);
    }

    @Override // rc.i0
    public final void b(Object obj, CancellationException cancellationException) {
        CancellationException cancellationException2;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8289r;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof o1) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof s) {
                return;
            }
            if (!(obj2 instanceof r)) {
                cancellationException2 = cancellationException;
                r rVar = new r(obj2, (i) null, (ic.l) null, cancellationException2, 14);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, rVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj2) {
                    }
                }
                return;
            }
            r rVar2 = (r) obj2;
            if (rVar2.e != null) {
                throw new IllegalStateException("Must be called at most once");
            }
            r rVarA = r.a(rVar2, null, cancellationException, 15);
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, rVarA)) {
                    i iVar = rVar2.f8309b;
                    if (iVar != null) {
                        k(iVar, cancellationException);
                    }
                    ic.l lVar = rVar2.f8310c;
                    if (lVar != null) {
                        l(lVar, cancellationException);
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj2);
            cancellationException2 = cancellationException;
            cancellationException = cancellationException2;
        }
    }

    @Override // rc.i0
    public final yb.d c() {
        return this.f8291d;
    }

    @Override // rc.i0
    public final Throwable d(Object obj) {
        Throwable thD = super.d(obj);
        if (thD != null) {
            return thD;
        }
        return null;
    }

    @Override // rc.j
    public final i6.e e(Object obj, ic.l lVar) {
        return C(obj, lVar);
    }

    @Override // rc.j
    public final void f(Object obj, ic.l lVar) {
        A(obj, this.f8280c, lVar);
    }

    @Override // rc.i0
    public final Object g(Object obj) {
        return obj instanceof r ? ((r) obj).f8308a : obj;
    }

    @Override // ac.d
    public final ac.d getCallerFrame() {
        yb.d dVar = this.f8291d;
        if (dVar instanceof ac.d) {
            return (ac.d) dVar;
        }
        return null;
    }

    @Override // yb.d
    public final yb.i getContext() {
        return this.e;
    }

    @Override // rc.j
    public final void i(Object obj) {
        p(this.f8280c);
    }

    @Override // rc.i0
    public final Object j() {
        return f8289r.get(this);
    }

    public final void k(i iVar, Throwable th) {
        try {
            iVar.c(th);
        } catch (Throwable th2) {
            b0.n(new androidx.datastore.preferences.protobuf.d1("Exception in invokeOnCancellation handler for " + this, th2), this.e);
        }
    }

    public final void l(ic.l lVar, Throwable th) {
        try {
            lVar.invoke(th);
        } catch (Throwable th2) {
            b0.n(new androidx.datastore.preferences.protobuf.d1("Exception in resume onCancellation handler for " + this, th2), this.e);
        }
    }

    public final void m(wc.t tVar, Throwable th) {
        yb.i iVar = this.e;
        int i = f8288f.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            tVar.g(i, iVar);
        } catch (Throwable th2) {
            b0.n(new androidx.datastore.preferences.protobuf.d1("Exception in invokeOnCancellation handler for " + this, th2), iVar);
        }
    }

    public final boolean n(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8289r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof o1)) {
                return false;
            }
            l lVar = new l(this, th, (obj instanceof i) || (obj instanceof wc.t));
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, lVar)) {
                    o1 o1Var = (o1) obj;
                    if (o1Var instanceof i) {
                        k((i) obj, th);
                    } else if (o1Var instanceof wc.t) {
                        m((wc.t) obj, th);
                    }
                    if (!w()) {
                        o();
                    }
                    p(this.f8280c);
                    return true;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
    }

    public final void o() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8290s;
        m0 m0Var = (m0) atomicReferenceFieldUpdater.get(this);
        if (m0Var == null) {
            return;
        }
        m0Var.f();
        atomicReferenceFieldUpdater.set(this, n1.f8304a);
    }

    public final void p(int i) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i10;
        do {
            atomicIntegerFieldUpdater = f8288f;
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("Already resumed");
                }
                boolean z4 = i == 4;
                yb.d dVar = this.f8291d;
                if (!z4 && (dVar instanceof wc.h)) {
                    boolean z10 = i == 1 || i == 2;
                    int i12 = this.f8280c;
                    if (z10 == (i12 == 1 || i12 == 2)) {
                        wc.h hVar = (wc.h) dVar;
                        x xVar = hVar.f9931d;
                        yb.i context = hVar.e.getContext();
                        if (xVar.T()) {
                            xVar.S(context, this);
                            return;
                        }
                        u0 u0VarA = s1.a();
                        if (u0VarA.f8326c >= 4294967296L) {
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
                            b0.t(this, dVar, true);
                            do {
                            } while (u0VarA.Y());
                        } catch (Throwable th) {
                            try {
                                h(th, null);
                            } finally {
                                u0VarA.U(true);
                            }
                        }
                        return;
                    }
                }
                b0.t(this, dVar, z4);
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
    }

    public Throwable q(l1 l1Var) {
        return l1Var.u();
    }

    public final Object r() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        b1 b1Var;
        boolean zW = w();
        do {
            atomicIntegerFieldUpdater = f8288f;
            i = atomicIntegerFieldUpdater.get(this);
            int i10 = i >> 29;
            if (i10 != 0) {
                if (i10 != 2) {
                    throw new IllegalStateException("Already suspended");
                }
                if (zW) {
                    z();
                }
                Object obj = f8289r.get(this);
                if (obj instanceof s) {
                    throw ((s) obj).f8315a;
                }
                int i11 = this.f8280c;
                if ((i11 != 1 && i11 != 2) || (b1Var = (b1) this.e.H(y.f8337b)) == null || b1Var.c()) {
                    return g(obj);
                }
                CancellationException cancellationExceptionU = ((l1) b1Var).u();
                b(obj, cancellationExceptionU);
                throw cancellationExceptionU;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 536870912 + (536870911 & i)));
        if (((m0) f8290s.get(this)) == null) {
            t();
        }
        if (zW) {
            z();
        }
        return zb.a.f11555a;
    }

    @Override // yb.d
    public final void resumeWith(Object obj) {
        Throwable thA = ub.h.a(obj);
        if (thA != null) {
            obj = new s(false, thA);
        }
        A(obj, this.f8280c, null);
    }

    public final void s() {
        m0 m0VarT = t();
        if (m0VarT == null || (f8289r.get(this) instanceof o1)) {
            return;
        }
        m0VarT.f();
        f8290s.set(this, n1.f8304a);
    }

    public final m0 t() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b1 b1Var = (b1) this.e.H(y.f8337b);
        if (b1Var == null) {
            return null;
        }
        m0 m0VarI = ((l1) b1Var).I((2 & 1) == 0, (2 & 2) != 0, new m(this));
        do {
            atomicReferenceFieldUpdater = f8290s;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, m0VarI)) {
                break;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
        return m0VarI;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(y());
        sb2.append('(');
        sb2.append(b0.v(this.f8291d));
        sb2.append("){");
        Object obj = f8289r.get(this);
        if (obj instanceof o1) {
            str = "Active";
        } else {
            str = obj instanceof l ? "Cancelled" : "Completed";
        }
        sb2.append(str);
        sb2.append("}@");
        sb2.append(b0.l(this));
        return sb2.toString();
    }

    public final void u(ic.l lVar) {
        v(lVar instanceof i ? (i) lVar : new n0(lVar, 1));
    }

    public final void v(o1 o1Var) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8289r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof b) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, o1Var)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return;
            }
            boolean z4 = true;
            if (obj instanceof i ? true : obj instanceof wc.t) {
                x(o1Var, obj);
                throw null;
            }
            if (obj instanceof s) {
                s sVar = (s) obj;
                if (!s.f8314b.compareAndSet(sVar, 0, 1)) {
                    x(o1Var, obj);
                    throw null;
                }
                if (obj instanceof l) {
                    Throwable th = sVar.f8315a;
                    if (o1Var instanceof i) {
                        k((i) o1Var, th);
                        return;
                    } else {
                        m((wc.t) o1Var, th);
                        return;
                    }
                }
                return;
            }
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (rVar.f8309b != null) {
                    x(o1Var, obj);
                    throw null;
                }
                if (o1Var instanceof wc.t) {
                    return;
                }
                i iVar = (i) o1Var;
                Throwable th2 = rVar.e;
                if (th2 != null) {
                    k(iVar, th2);
                    return;
                }
                r rVarA = r.a(rVar, iVar, null, 29);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVarA)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z4 = false;
                        break;
                    }
                }
                if (z4) {
                    return;
                }
            } else {
                if (o1Var instanceof wc.t) {
                    return;
                }
                r rVar2 = new r(obj, (i) o1Var, (ic.l) null, (CancellationException) null, 28);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, rVar2)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z4 = false;
                        break;
                    }
                }
                if (z4) {
                    return;
                }
            }
        }
    }

    public final boolean w() {
        if (this.f8280c != 2) {
            return false;
        }
        yb.d dVar = this.f8291d;
        jc.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return wc.h.f9930s.get((wc.h) dVar) != null;
    }

    public String y() {
        return "CancellableContinuation";
    }

    public final void z() {
        yb.d dVar = this.f8291d;
        Throwable th = null;
        wc.h hVar = dVar instanceof wc.h ? (wc.h) dVar : null;
        if (hVar != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wc.h.f9930s;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                i6.e eVar = wc.a.f9917d;
                if (obj != eVar) {
                    if (!(obj instanceof Throwable)) {
                        throw new IllegalStateException(("Inconsistent state " + obj).toString());
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != obj) {
                            throw new IllegalArgumentException("Failed requirement.");
                        }
                    }
                    th = (Throwable) obj;
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, eVar, this)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == eVar);
            }
            if (th == null) {
                return;
            }
            o();
            n(th);
        }
    }
}

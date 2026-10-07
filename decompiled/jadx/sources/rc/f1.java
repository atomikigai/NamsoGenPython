package rc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f1 extends wc.k implements m0, y0, ic.l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l1 f8273d;

    @Override // rc.y0
    public final boolean c() {
        return true;
    }

    @Override // rc.y0
    public final m1 e() {
        return null;
    }

    @Override // rc.m0
    public final void f() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        l1 l1VarL = l();
        while (true) {
            Object objA = l1VarL.A();
            if (objA instanceof f1) {
                if (objA != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = l1.f8300a;
                p0 p0Var = b0.f8258j;
                while (!atomicReferenceFieldUpdater2.compareAndSet(l1VarL, objA, p0Var)) {
                    if (atomicReferenceFieldUpdater2.get(l1VarL) != objA) {
                    }
                }
                return;
            }
            if (!(objA instanceof y0) || ((y0) objA).e() == null) {
                return;
            }
            while (true) {
                Object objI = i();
                if (objI instanceof wc.q) {
                    return;
                }
                if (objI == this) {
                    return;
                }
                jc.i.c(objI, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                wc.k kVar = (wc.k) objI;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = wc.k.f9941c;
                wc.q qVar = (wc.q) atomicReferenceFieldUpdater3.get(kVar);
                if (qVar == null) {
                    qVar = new wc.q(kVar);
                    atomicReferenceFieldUpdater3.lazySet(kVar, qVar);
                }
                do {
                    atomicReferenceFieldUpdater = wc.k.f9939a;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, objI, qVar)) {
                        kVar.g();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == objI);
            }
        }
    }

    public b1 getParent() {
        return l();
    }

    public final l1 l() {
        l1 l1Var = this.f8273d;
        if (l1Var != null) {
            return l1Var;
        }
        jc.i.i("job");
        throw null;
    }

    public abstract void m(Throwable th);

    @Override // wc.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + b0.l(this) + "[job@" + b0.l(l()) + ']';
    }
}

package rc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class m extends d1 {
    public final k e;

    public m(k kVar) {
        this.e = kVar;
    }

    @Override // ic.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Throwable) obj);
        return ub.k.f9073a;
    }

    @Override // rc.f1
    public final void m(Throwable th) {
        l1 l1VarL = l();
        k kVar = this.e;
        Throwable thQ = kVar.q(l1VarL);
        if (kVar.w()) {
            yb.d dVar = kVar.f8291d;
            jc.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            wc.h hVar = (wc.h) dVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wc.h.f9930s;
            loop0: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(hVar);
                i6.e eVar = wc.a.f9917d;
                if (jc.i.a(obj, eVar)) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(hVar, eVar, thQ)) {
                        if (atomicReferenceFieldUpdater.get(hVar) != eVar) {
                        }
                    }
                    return;
                } else {
                    if (obj instanceof Throwable) {
                        return;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, null)) {
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(hVar) == obj);
                }
            }
        }
        kVar.n(thQ);
        if (kVar.w()) {
            return;
        }
        kVar.o();
    }
}

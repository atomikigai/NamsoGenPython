package zc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rc.b0;
import ub.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends h implements a {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11561s = AtomicReferenceFieldUpdater.newUpdater(d.class, Object.class, "owner");
    private volatile Object owner;

    public d(boolean z4) {
        super(1, z4 ? 1 : 0);
        this.owner = z4 ? null : e.f11562a;
    }

    @Override // zc.a
    public final Object c(ac.c cVar) {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h.f11568r;
            int i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = this.f11569a;
            if (i10 > i11) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i11) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i11));
            } else {
                k kVar = k.f9073a;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11561s;
                if (i10 <= 0) {
                    rc.k kVarM = b0.m(qd.b.r(cVar));
                    try {
                        c cVar2 = new c(this, kVarM);
                        while (true) {
                            int andDecrement = atomicIntegerFieldUpdater.getAndDecrement(this);
                            if (andDecrement <= i11) {
                                if (andDecrement > 0) {
                                    d dVar = cVar2.f11560b;
                                    atomicReferenceFieldUpdater.set(dVar, null);
                                    cVar2.f11559a.f(kVar, new b(dVar, cVar2, 0));
                                    break;
                                }
                                if (a(cVar2)) {
                                    break;
                                }
                            }
                        }
                        Object objR = kVarM.r();
                        zb.a aVar = zb.a.f11555a;
                        if (objR != aVar) {
                            objR = kVar;
                        }
                        return objR == aVar ? objR : kVar;
                    } catch (Throwable th) {
                        kVarM.z();
                        throw th;
                    }
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i10, i10 - 1)) {
                    atomicReferenceFieldUpdater.set(this, null);
                    return kVar;
                }
            }
        }
    }

    @Override // zc.a
    public final void d(Object obj) {
        while (e()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11561s;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            i6.e eVar = e.f11562a;
            if (obj2 != eVar) {
                if (obj2 != obj && obj != null) {
                    throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, eVar)) {
                        b();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean e() {
        return Math.max(h.f11568r.get(this), 0) == 0;
    }

    public final String toString() {
        return "Mutex@" + b0.l(this) + "[isLocked=" + e() + ",owner=" + f11561s.get(this) + ']';
    }
}

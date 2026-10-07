package wc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rc.b0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9939a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_next");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9940b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_prev");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9941c = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_removedRef");
    private volatile Object _next = this;
    private volatile Object _prev = this;
    private volatile Object _removedRef;

    public final k g() {
        k kVar;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object obj;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f9940b;
            k kVar2 = (k) atomicReferenceFieldUpdater2.get(this);
            kVar = kVar2;
            while (true) {
                k kVar3 = null;
                while (true) {
                    atomicReferenceFieldUpdater = f9939a;
                    obj = atomicReferenceFieldUpdater.get(kVar);
                    if (obj == this) {
                        if (kVar2 != kVar) {
                            while (!atomicReferenceFieldUpdater2.compareAndSet(this, kVar2, kVar)) {
                                if (atomicReferenceFieldUpdater2.get(this) != kVar2) {
                                    break;
                                }
                            }
                            break loop0;
                        }
                        break;
                    }
                    if (k()) {
                        return null;
                    }
                    if (obj == null) {
                        break loop0;
                    }
                    if (obj instanceof p) {
                        ((p) obj).a(kVar);
                        break;
                    }
                    if (!(obj instanceof q)) {
                        jc.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
                        kVar3 = kVar;
                        kVar = (k) obj;
                    } else {
                        if (kVar3 != null) {
                            break;
                        }
                        kVar = (k) atomicReferenceFieldUpdater2.get(kVar);
                    }
                }
                k kVar4 = ((q) obj).f9951a;
                while (!atomicReferenceFieldUpdater.compareAndSet(kVar3, kVar, kVar4)) {
                    if (atomicReferenceFieldUpdater.get(kVar3) != kVar) {
                        break;
                    }
                }
                kVar = kVar3;
            }
        }
        return kVar;
    }

    public final void h(k kVar) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9940b;
            k kVar2 = (k) atomicReferenceFieldUpdater.get(kVar);
            if (i() != kVar) {
                return;
            }
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(kVar, kVar2, this)) {
                    if (k()) {
                        kVar.g();
                        return;
                    }
                    return;
                }
            } while (atomicReferenceFieldUpdater.get(kVar) == kVar2);
        }
    }

    public final Object i() {
        while (true) {
            Object obj = f9939a.get(this);
            if (!(obj instanceof p)) {
                return obj;
            }
            ((p) obj).a(this);
        }
    }

    public final k j() {
        k kVar;
        Object objI = i();
        q qVar = objI instanceof q ? (q) objI : null;
        if (qVar != null && (kVar = qVar.f9951a) != null) {
            return kVar;
        }
        jc.i.c(objI, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        return (k) objI;
    }

    public boolean k() {
        return i() instanceof q;
    }

    public String toString() {
        return new j(this, b0.class, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;", 1) + '@' + b0.l(this);
    }
}

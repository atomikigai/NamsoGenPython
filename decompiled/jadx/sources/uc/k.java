package uc;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends vc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f9103a = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "_state");
    private volatile Object _state;

    @Override // vc.d
    public final boolean a(vc.b bVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9103a;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        atomicReferenceFieldUpdater.set(this, j.f9101a);
        return true;
    }

    @Override // vc.d
    public final yb.d[] b(vc.b bVar) {
        f9103a.set(this, null);
        return vc.c.f9317a;
    }
}

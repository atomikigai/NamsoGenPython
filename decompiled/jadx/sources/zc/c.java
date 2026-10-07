package zc;

import ic.l;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rc.k;
import rc.y1;
import wc.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements rc.j, y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f11559a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f11560b;

    public c(d dVar, k kVar) {
        this.f11560b = dVar;
        this.f11559a = kVar;
    }

    @Override // rc.y1
    public final void a(t tVar, int i) {
        this.f11559a.a(tVar, i);
    }

    @Override // rc.j
    public final i6.e e(Object obj, l lVar) {
        d dVar = this.f11560b;
        b bVar = new b(dVar, this, 1);
        i6.e eVarC = this.f11559a.C((ub.k) obj, bVar);
        if (eVarC != null) {
            d.f11561s.set(dVar, null);
        }
        return eVarC;
    }

    @Override // rc.j
    public final void f(Object obj, l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = d.f11561s;
        d dVar = this.f11560b;
        atomicReferenceFieldUpdater.set(dVar, null);
        this.f11559a.f(ub.k.f9073a, new b(dVar, this, 0));
    }

    @Override // yb.d
    public final yb.i getContext() {
        return this.f11559a.e;
    }

    @Override // rc.j
    public final void i(Object obj) {
        this.f11559a.i(obj);
    }

    @Override // yb.d
    public final void resumeWith(Object obj) {
        this.f11559a.resumeWith(obj);
    }
}

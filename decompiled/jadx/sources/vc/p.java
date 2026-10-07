package vc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements yb.d, ac.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.d f9339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb.i f9340b;

    public p(yb.d dVar, yb.i iVar) {
        this.f9339a = dVar;
        this.f9340b = iVar;
    }

    @Override // ac.d
    public final ac.d getCallerFrame() {
        yb.d dVar = this.f9339a;
        if (dVar instanceof ac.d) {
            return (ac.d) dVar;
        }
        return null;
    }

    @Override // yb.d
    public final yb.i getContext() {
        return this.f9340b;
    }

    @Override // yb.d
    public final void resumeWith(Object obj) {
        this.f9339a.resumeWith(obj);
    }
}

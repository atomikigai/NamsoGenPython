package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl implements p, rc.a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f1022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yb.i f1023b;

    public LifecycleCoroutineScopeImpl(t tVar, yb.i iVar) {
        jc.i.e(iVar, "coroutineContext");
        this.f1022a = tVar;
        this.f1023b = iVar;
        if (tVar.f1093d == m.f1065a) {
            rc.b0.f(iVar, null);
        }
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        t tVar = this.f1022a;
        if (tVar.f1093d.compareTo(m.f1065a) <= 0) {
            tVar.f(this);
            rc.b0.f(this.f1023b, null);
        }
    }

    @Override // rc.a0
    public final yb.i b() {
        return this.f1023b;
    }
}

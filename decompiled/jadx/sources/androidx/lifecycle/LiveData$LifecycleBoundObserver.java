package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
class LiveData$LifecycleBoundObserver extends x implements p {
    public final r e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y f1024f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(y yVar, r rVar, z zVar) {
        super(yVar, zVar);
        this.f1024f = yVar;
        this.e = rVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        r rVar2 = this.e;
        m mVar = rVar2.l().f1093d;
        if (mVar == m.f1065a) {
            this.f1024f.i(this.f1100a);
            return;
        }
        m mVar2 = null;
        while (mVar2 != mVar) {
            b(e());
            mVar2 = mVar;
            mVar = rVar2.l().f1093d;
        }
    }

    @Override // androidx.lifecycle.x
    public final void c() {
        this.e.l().f(this);
    }

    @Override // androidx.lifecycle.x
    public final boolean d(r rVar) {
        return this.e == rVar;
    }

    @Override // androidx.lifecycle.x
    public final boolean e() {
        return this.e.l().f1093d.compareTo(m.f1068d) >= 0;
    }
}

package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class DefaultLifecycleObserverAdapter implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f1018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1019b;

    public DefaultLifecycleObserverAdapter(d dVar, p pVar) {
        this.f1018a = dVar;
        this.f1019b = pVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        int i = e.f1046a[lVar.ordinal()];
        if (i == 3) {
            this.f1018a.onResume();
        } else if (i == 7) {
            throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        p pVar = this.f1019b;
        if (pVar != null) {
            pVar.a(rVar, lVar);
        }
    }
}

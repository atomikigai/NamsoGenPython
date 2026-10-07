package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class LegacySavedStateHandleController$tryToAddRecreator$1 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t f1020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f2.d f1021b;

    public LegacySavedStateHandleController$tryToAddRecreator$1(t tVar, f2.d dVar) {
        this.f1020a = tVar;
        this.f1021b = dVar;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        if (lVar == l.ON_START) {
            this.f1020a.f(this);
            this.f1021b.g();
        }
    }
}

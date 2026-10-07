package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleController implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f1029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f1030c;

    public SavedStateHandleController(String str, h0 h0Var) {
        this.f1028a = str;
        this.f1029b = h0Var;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        if (lVar == l.ON_DESTROY) {
            this.f1030c = false;
            rVar.l().f(this);
        }
    }

    public final void b(t tVar, f2.d dVar) {
        jc.i.e(dVar, "registry");
        jc.i.e(tVar, "lifecycle");
        if (this.f1030c) {
            throw new IllegalStateException("Already attached to lifecycleOwner");
        }
        this.f1030c = true;
        tVar.a(this);
        dVar.f(this.f1028a, this.f1029b.e);
    }
}

package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class SavedStateHandleAttacher implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k0 f1027a;

    public SavedStateHandleAttacher(k0 k0Var) {
        this.f1027a = k0Var;
    }

    @Override // androidx.lifecycle.p
    public final void a(r rVar, l lVar) {
        if (lVar != l.ON_CREATE) {
            throw new IllegalStateException(("Next event must be ON_CREATE, it was " + lVar).toString());
        }
        rVar.l().f(this);
        k0 k0Var = this.f1027a;
        if (k0Var.f1061b) {
            return;
        }
        k0Var.f1062c = k0Var.f1060a.c("androidx.lifecycle.internal.SavedStateHandlesProvider");
        k0Var.f1061b = true;
    }
}

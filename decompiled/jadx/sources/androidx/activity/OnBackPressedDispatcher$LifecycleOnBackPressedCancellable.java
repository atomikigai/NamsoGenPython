package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements androidx.lifecycle.p, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.lifecycle.t f329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.fragment.app.b0 f330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b0 f332d;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(b0 b0Var, androidx.lifecycle.t tVar, androidx.fragment.app.b0 b0Var2) {
        jc.i.e(b0Var2, "onBackPressedCallback");
        this.f332d = b0Var;
        this.f329a = tVar;
        this.f330b = b0Var2;
        tVar.a(this);
    }

    @Override // androidx.lifecycle.p
    public final void a(androidx.lifecycle.r rVar, androidx.lifecycle.l lVar) {
        if (lVar != androidx.lifecycle.l.ON_START) {
            if (lVar != androidx.lifecycle.l.ON_STOP) {
                if (lVar == androidx.lifecycle.l.ON_DESTROY) {
                    cancel();
                    return;
                }
                return;
            } else {
                z zVar = this.f331c;
                if (zVar != null) {
                    zVar.cancel();
                    return;
                }
                return;
            }
        }
        b0 b0Var = this.f332d;
        b0Var.getClass();
        androidx.fragment.app.b0 b0Var2 = this.f330b;
        jc.i.e(b0Var2, "onBackPressedCallback");
        b0Var.f340b.addLast(b0Var2);
        z zVar2 = new z(b0Var, b0Var2);
        b0Var2.f848b.add(zVar2);
        b0Var.d();
        b0Var2.f849c = new a0(0, b0Var, b0.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0, 0, 1);
        this.f331c = zVar2;
    }

    @Override // androidx.activity.c
    public final void cancel() {
        this.f329a.f(this);
        this.f330b.f848b.remove(this);
        z zVar = this.f331c;
        if (zVar != null) {
            zVar.cancel();
        }
        this.f331c = null;
    }
}

package androidx.activity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final androidx.fragment.app.b0 f418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f419b;

    public z(b0 b0Var, androidx.fragment.app.b0 b0Var2) {
        jc.i.e(b0Var2, "onBackPressedCallback");
        this.f419b = b0Var;
        this.f418a = b0Var2;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ic.a, jc.h] */
    @Override // androidx.activity.c
    public final void cancel() {
        b0 b0Var = this.f419b;
        vb.g gVar = b0Var.f340b;
        androidx.fragment.app.b0 b0Var2 = this.f418a;
        gVar.remove(b0Var2);
        if (jc.i.a(b0Var.f341c, b0Var2)) {
            b0Var2.getClass();
            b0Var.f341c = null;
        }
        b0Var2.f848b.remove(this);
        ?? r10 = b0Var2.f849c;
        if (r10 != 0) {
            r10.a();
        }
        b0Var2.f849c = null;
    }
}

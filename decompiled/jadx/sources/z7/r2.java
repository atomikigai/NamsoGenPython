package z7;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 extends k {
    public final /* synthetic */ int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f11334f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r2(Object obj, g1 g1Var, int i) {
        super(g1Var);
        this.e = i;
        this.f11334f = obj;
    }

    @Override // z7.k
    public final void b() {
        switch (this.e) {
            case 0:
                s2 s2Var = (s2) this.f11334f;
                t2 t2Var = s2Var.f11346d;
                t2Var.c();
                a1 a1Var = (a1) t2Var.f159a;
                a1Var.f11012y.getClass();
                s2Var.a(SystemClock.elapsedRealtime(), false, false);
                u uVarH = a1Var.h();
                a1Var.f11012y.getClass();
                uVarH.f(SystemClock.elapsedRealtime());
                break;
            default:
                u2 u2Var = (u2) this.f11334f;
                u2Var.g();
                i0 i0Var = ((a1) u2Var.f159a).f11007t;
                a1.f(i0Var);
                i0Var.f11198y.b("Starting upload from DelayedRunnable");
                u2Var.f11411b.p();
                break;
        }
    }
}

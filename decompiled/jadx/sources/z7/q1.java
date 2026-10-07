package z7;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x1 f11320c;

    public /* synthetic */ q1(x1 x1Var, long j4, int i) {
        this.f11318a = i;
        this.f11320c = x1Var;
        this.f11319b = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11318a) {
            case 0:
                x1 x1Var = this.f11320c;
                q0 q0Var = ((a1) x1Var.f159a).f11006s;
                a1.d(q0Var);
                p0 p0Var = q0Var.f11312u;
                long j4 = this.f11319b;
                p0Var.b(j4);
                i0 i0Var = ((a1) x1Var.f159a).f11007t;
                a1.f(i0Var);
                i0Var.f11197x.c(Long.valueOf(j4), "Session timeout duration set");
                break;
            default:
                long j10 = this.f11319b;
                x1 x1Var2 = this.f11320c;
                x1Var2.n(j10, true);
                ((a1) x1Var2.f159a).n().t(new AtomicReference());
                break;
        }
    }
}

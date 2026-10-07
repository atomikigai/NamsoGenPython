package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0 f11178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j2 f11179c;

    public /* synthetic */ h2(j2 j2Var, b0 b0Var, int i) {
        this.f11177a = i;
        this.f11179c = j2Var;
        this.f11178b = b0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11177a) {
            case 0:
                synchronized (this.f11179c) {
                    try {
                        this.f11179c.f11217a = false;
                        if (!this.f11179c.f11219c.j()) {
                            i0 i0Var = ((a1) this.f11179c.f11219c.f159a).f11007t;
                            a1.f(i0Var);
                            i0Var.f11198y.b("Connected to service");
                            k2 k2Var = this.f11179c.f11219c;
                            b0 b0Var = this.f11178b;
                            k2Var.c();
                            k2Var.f11238d = b0Var;
                            k2Var.o();
                            k2Var.n();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f11179c) {
                    try {
                        this.f11179c.f11217a = false;
                        if (!this.f11179c.f11219c.j()) {
                            i0 i0Var2 = ((a1) this.f11179c.f11219c.f159a).f11007t;
                            a1.f(i0Var2);
                            i0Var2.f11197x.b("Connected to remote service");
                            k2 k2Var2 = this.f11179c.f11219c;
                            b0 b0Var2 = this.f11178b;
                            k2Var2.c();
                            com.google.android.gms.common.internal.i0.i(b0Var2);
                            k2Var2.f11238d = b0Var2;
                            k2Var2.o();
                            k2Var2.n();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }
}

package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f11063b;

    public /* synthetic */ c2(d2 d2Var, int i) {
        this.f11062a = i;
        this.f11063b = d2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11062a) {
            case 0:
                d2 d2Var = this.f11063b;
                d2Var.e = d2Var.f11078u;
                break;
            default:
                this.f11063b.f11078u = null;
                break;
        }
    }
}

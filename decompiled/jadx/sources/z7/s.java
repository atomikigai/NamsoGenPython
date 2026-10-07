package z7;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11336b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w f11337c;

    public /* synthetic */ s(w wVar, long j4, int i) {
        this.f11335a = i;
        this.f11337c = wVar;
        this.f11336b = j4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11335a) {
            case 0:
                ((u) this.f11337c).j(this.f11336b);
                break;
            default:
                d2 d2Var = (d2) this.f11337c;
                ((a1) d2Var.f159a).h().f(this.f11336b);
                d2Var.e = null;
                break;
        }
    }
}

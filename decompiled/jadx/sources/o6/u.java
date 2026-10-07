package o6;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f7673b;

    public /* synthetic */ u(v vVar, int i) {
        this.f7672a = i;
        this.f7673b = vVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7672a) {
            case 0:
                this.f7673b.zza();
                break;
            default:
                v vVar = this.f7673b;
                vVar.f7676c.execute(new u(vVar, 0));
                break;
        }
    }
}

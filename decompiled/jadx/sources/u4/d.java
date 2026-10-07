package u4;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f8857b;

    public /* synthetic */ d(e eVar, int i) {
        this.f8856a = i;
        this.f8857b = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8856a) {
            case 0:
                e eVar = this.f8857b;
                eVar.N = 0L;
                eVar.M.setVisibility(8);
                break;
            default:
                this.f8857b.finish();
                break;
        }
    }
}

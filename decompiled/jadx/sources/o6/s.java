package o6;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f7668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f7669c;

    public /* synthetic */ s(t tVar, String str, int i) {
        this.f7667a = i;
        this.f7668b = tVar;
        this.f7669c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7667a) {
            case 0:
                this.f7668b.f7671b.f7581b.evaluateJavascript(this.f7669c, null);
                break;
            default:
                this.f7668b.f7671b.f7581b.evaluateJavascript(this.f7669c, null);
                break;
        }
    }
}

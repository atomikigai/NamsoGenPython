package m0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f6966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f6967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6968c;

    public final void a(e eVar) {
        synchronized (this) {
            while (this.f6968c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f6967b == eVar) {
                return;
            }
            this.f6967b = eVar;
            if (this.f6966a) {
                eVar.onCancel();
            }
        }
    }
}

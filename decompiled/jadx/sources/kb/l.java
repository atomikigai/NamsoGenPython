package kb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ m f6187a;

    public l(m mVar) {
        this.f6187a = mVar;
    }

    public final void a() {
        m mVar = this.f6187a;
        synchronized (mVar) {
            mVar.f6193d = true;
        }
        this.f6187a.g();
    }
}

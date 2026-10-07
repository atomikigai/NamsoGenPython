package p0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7785c;

    public f(int i) {
        super(i);
        this.f7785c = new Object();
    }

    @Override // p0.e, p0.d
    public final boolean b(Object obj) {
        boolean zB;
        synchronized (this.f7785c) {
            zB = super.b(obj);
        }
        return zB;
    }

    @Override // p0.e, p0.d
    public final Object c() {
        Object objC;
        synchronized (this.f7785c) {
            objC = super.c();
        }
        return objC;
    }
}

package i2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f5138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f5139b;

    public f(g gVar, Throwable th) {
        super(th);
        this.f5138a = gVar;
        this.f5139b = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.f5139b;
    }
}

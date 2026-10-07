package yc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d f10695d;

    static {
        int i = j.f10703c;
        int i10 = j.f10704d;
        long j4 = j.e;
        String str = j.f10701a;
        d dVar = new d();
        dVar.f10697c = new b(i, i10, j4, str);
        f10695d = dVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // rc.x
    public final String toString() {
        return "Dispatchers.Default";
    }
}

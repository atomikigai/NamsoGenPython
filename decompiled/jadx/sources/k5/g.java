package k5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f6013a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6014b = ra.c.a("networkType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6015c = ra.c.a("mobileSubtype");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        n nVar = (n) ((v) obj);
        eVar.e(f6014b, nVar.f6039a);
        eVar.e(f6015c, nVar.f6040b);
    }
}

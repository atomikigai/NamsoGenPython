package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f3779a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f3780b = ra.c.a("baseAddress");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f3781c = ra.c.a("size");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f3782d = ra.c.a("name");
    public static final ra.c e = ra.c.a("uuid");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        k0 k0Var = (k0) ((f1) obj);
        eVar.d(f3780b, k0Var.f3775a);
        eVar.d(f3781c, k0Var.f3776b);
        eVar.e(f3782d, k0Var.f3777c);
        String str = k0Var.f3778d;
        eVar.e(e, str != null ? str.getBytes(s1.f3842a) : null);
    }
}

package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f3795a = new n();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f3796b = ra.c.a("type");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f3797c = ra.c.a("reason");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f3798d = ra.c.a("frames");
    public static final ra.c e = ra.c.a("causedBy");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f3799f = ra.c.a("overflowCount");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        l0 l0Var = (l0) ((g1) obj);
        eVar.e(f3796b, l0Var.f3783a);
        eVar.e(f3797c, l0Var.f3784b);
        eVar.e(f3798d, l0Var.f3785c);
        eVar.e(e, l0Var.f3786d);
        eVar.c(f3799f, l0Var.e);
    }
}

package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f3745a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f3746b = ra.c.a("arch");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f3747c = ra.c.a("model");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f3748d = ra.c.a("cores");
    public static final ra.c e = ra.c.a("ram");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f3749f = ra.c.a("diskSpace");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f3750g = ra.c.a("simulator");
    public static final ra.c h = ra.c.a("state");
    public static final ra.c i = ra.c.a("manufacturer");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ra.c f3751j = ra.c.a("modelClass");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        g0 g0Var = (g0) ((e1) obj);
        eVar.c(f3746b, g0Var.f3734a);
        eVar.e(f3747c, g0Var.f3735b);
        eVar.c(f3748d, g0Var.f3736c);
        eVar.d(e, g0Var.f3737d);
        eVar.d(f3749f, g0Var.e);
        eVar.a(f3750g, g0Var.f3738f);
        eVar.c(h, g0Var.f3739g);
        eVar.e(i, g0Var.h);
        eVar.e(f3751j, g0Var.i);
    }
}

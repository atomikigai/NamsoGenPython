package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f3728a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f3729b = ra.c.a("identifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f3730c = ra.c.a("version");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f3731d = ra.c.a("displayVersion");
    public static final ra.c e = ra.c.a("organization");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f3732f = ra.c.a("installationUuid");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f3733g = ra.c.a("developmentPlatform");
    public static final ra.c h = ra.c.a("developmentPlatformVersion");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        e0 e0Var = (e0) ((d1) obj);
        eVar.e(f3729b, e0Var.f3720a);
        eVar.e(f3730c, e0Var.f3721b);
        eVar.e(f3731d, e0Var.f3722c);
        eVar.e(e, null);
        eVar.e(f3732f, e0Var.f3723d);
        eVar.e(f3733g, e0Var.e);
        eVar.e(h, e0Var.f3724f);
    }
}

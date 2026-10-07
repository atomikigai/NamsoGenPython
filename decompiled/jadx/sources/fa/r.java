package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r f3826a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f3827b = ra.c.a("batteryLevel");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f3828c = ra.c.a("batteryVelocity");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f3829d = ra.c.a("proximityOn");
    public static final ra.c e = ra.c.a("orientation");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f3830f = ra.c.a("ramUsed");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f3831g = ra.c.a("diskUsed");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        p0 p0Var = (p0) ((m1) obj);
        eVar.e(f3827b, p0Var.f3815a);
        eVar.c(f3828c, p0Var.f3816b);
        eVar.a(f3829d, p0Var.f3817c);
        eVar.c(e, p0Var.f3818d);
        eVar.d(f3830f, p0Var.e);
        eVar.d(f3831g, p0Var.f3819f);
    }
}

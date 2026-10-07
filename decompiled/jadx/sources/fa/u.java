package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u f3849a = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f3850b = ra.c.a("platform");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f3851c = ra.c.a("version");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f3852d = ra.c.a("buildVersion");
    public static final ra.c e = ra.c.a("jailbroken");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        r0 r0Var = (r0) ((p1) obj);
        eVar.c(f3850b, r0Var.f3832a);
        eVar.e(f3851c, r0Var.f3833b);
        eVar.e(f3852d, r0Var.f3834c);
        eVar.a(e, r0Var.f3835d);
    }
}

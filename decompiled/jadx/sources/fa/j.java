package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f3756a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f3757b = ra.c.a("generator");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f3758c = ra.c.a("identifier");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f3759d = ra.c.a("appQualitySessionId");
    public static final ra.c e = ra.c.a("startedAt");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f3760f = ra.c.a("endedAt");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f3761g = ra.c.a("crashed");
    public static final ra.c h = ra.c.a("app");
    public static final ra.c i = ra.c.a("user");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ra.c f3762j = ra.c.a("os");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ra.c f3763k = ra.c.a("device");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ra.c f3764l = ra.c.a("events");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ra.c f3765m = ra.c.a("generatorType");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        d0 d0Var = (d0) ((r1) obj);
        eVar.e(f3757b, d0Var.f3708a);
        eVar.e(f3758c, d0Var.f3709b.getBytes(s1.f3842a));
        eVar.e(f3759d, d0Var.f3710c);
        eVar.d(e, d0Var.f3711d);
        eVar.e(f3760f, d0Var.e);
        eVar.a(f3761g, d0Var.f3712f);
        eVar.e(h, d0Var.f3713g);
        eVar.e(i, d0Var.h);
        eVar.e(f3762j, d0Var.i);
        eVar.e(f3763k, d0Var.f3714j);
        eVar.e(f3764l, d0Var.f3715k);
        eVar.c(f3765m, d0Var.f3716l);
    }
}

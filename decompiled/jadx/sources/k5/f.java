package k5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f6007a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6008b = ra.c.a("requestTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6009c = ra.c.a("requestUptimeMs");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f6010d = ra.c.a("clientInfo");
    public static final ra.c e = ra.c.a("logSource");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f6011f = ra.c.a("logSourceName");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f6012g = ra.c.a("logEvent");
    public static final ra.c h = ra.c.a("qosTier");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        l lVar = (l) ((s) obj);
        eVar.d(f6008b, lVar.f6033a);
        eVar.d(f6009c, lVar.f6034b);
        eVar.e(f6010d, lVar.f6035c);
        eVar.e(e, lVar.f6036d);
        eVar.e(f6011f, lVar.e);
        eVar.e(f6012g, lVar.f6037f);
        eVar.e(h, w.f6047a);
    }
}

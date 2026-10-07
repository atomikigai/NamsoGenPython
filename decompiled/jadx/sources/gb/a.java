package gb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4428a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f4429b = new ra.c("projectNumber", da.v.n(da.v.m(ua.e.class, new ua.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f4430c = new ra.c("messageId", da.v.n(da.v.m(ua.e.class, new ua.a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f4431d = new ra.c("instanceId", da.v.n(da.v.m(ua.e.class, new ua.a(3))));
    public static final ra.c e = new ra.c("messageType", da.v.n(da.v.m(ua.e.class, new ua.a(4))));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f4432f = new ra.c("sdkPlatform", da.v.n(da.v.m(ua.e.class, new ua.a(5))));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f4433g = new ra.c("packageName", da.v.n(da.v.m(ua.e.class, new ua.a(6))));
    public static final ra.c h = new ra.c("collapseKey", da.v.n(da.v.m(ua.e.class, new ua.a(7))));
    public static final ra.c i = new ra.c("priority", da.v.n(da.v.m(ua.e.class, new ua.a(8))));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ra.c f4434j = new ra.c("ttl", da.v.n(da.v.m(ua.e.class, new ua.a(9))));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final ra.c f4435k = new ra.c("topic", da.v.n(da.v.m(ua.e.class, new ua.a(10))));

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final ra.c f4436l = new ra.c("bulkId", da.v.n(da.v.m(ua.e.class, new ua.a(11))));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final ra.c f4437m = new ra.c("event", da.v.n(da.v.m(ua.e.class, new ua.a(12))));

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final ra.c f4438n = new ra.c("analyticsLabel", da.v.n(da.v.m(ua.e.class, new ua.a(13))));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final ra.c f4439o = new ra.c("campaignId", da.v.n(da.v.m(ua.e.class, new ua.a(14))));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final ra.c f4440p = new ra.c("composerLabel", da.v.n(da.v.m(ua.e.class, new ua.a(15))));

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        hb.d dVar = (hb.d) obj;
        ra.e eVar = (ra.e) obj2;
        eVar.d(f4429b, dVar.f5105a);
        eVar.e(f4430c, dVar.f5106b);
        eVar.e(f4431d, dVar.f5107c);
        eVar.e(e, dVar.f5108d);
        eVar.e(f4432f, hb.c.ANDROID);
        eVar.e(f4433g, dVar.e);
        eVar.e(h, dVar.f5109f);
        eVar.c(i, 0);
        eVar.c(f4434j, dVar.f5110g);
        eVar.e(f4435k, dVar.h);
        eVar.d(f4436l, 0L);
        eVar.e(f4437m, hb.a.MESSAGE_DELIVERED);
        eVar.e(f4438n, dVar.i);
        eVar.d(f4439o, 0L);
        eVar.e(f4440p, dVar.f5111j);
    }
}

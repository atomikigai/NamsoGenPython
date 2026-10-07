package k5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f6001a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6002b = ra.c.a("eventTimeMs");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6003c = ra.c.a("eventCode");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f6004d = ra.c.a("eventUptimeMs");
    public static final ra.c e = ra.c.a("sourceExtension");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f6005f = ra.c.a("sourceExtensionJsonProto3");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f6006g = ra.c.a("timezoneOffsetSeconds");
    public static final ra.c h = ra.c.a("networkConnectionInfo");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        k kVar = (k) ((r) obj);
        eVar.d(f6002b, kVar.f6027a);
        eVar.e(f6003c, kVar.f6028b);
        eVar.d(f6004d, kVar.f6029c);
        eVar.e(e, kVar.f6030d);
        eVar.e(f6005f, kVar.e);
        eVar.d(f6006g, kVar.f6031f);
        eVar.e(h, kVar.f6032g);
    }
}

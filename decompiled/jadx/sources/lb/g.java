package lb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f6903a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6904b = ra.c.a("sessionId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6905c = ra.c.a("firstSessionId");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f6906d = ra.c.a("sessionIndex");
    public static final ra.c e = ra.c.a("eventTimestampUs");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f6907f = ra.c.a("dataCollectionStatus");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f6908g = ra.c.a("firebaseInstallationId");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        v vVar = (v) obj;
        ra.e eVar = (ra.e) obj2;
        eVar.e(f6904b, vVar.f6951a);
        eVar.e(f6905c, vVar.f6952b);
        eVar.c(f6906d, vVar.f6953c);
        eVar.d(e, vVar.f6954d);
        eVar.e(f6907f, vVar.e);
        eVar.e(f6908g, vVar.f6955f);
    }
}

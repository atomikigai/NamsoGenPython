package lb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f6899a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6900b = ra.c.a("eventType");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6901c = ra.c.a("sessionData");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f6902d = ra.c.a("applicationInfo");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        r rVar = (r) obj;
        ra.e eVar = (ra.e) obj2;
        rVar.getClass();
        eVar.e(f6900b, j.SESSION_START);
        eVar.e(f6901c, rVar.f6942a);
        eVar.e(f6902d, rVar.f6943b);
    }
}

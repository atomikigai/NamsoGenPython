package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f3683a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f3684b = ra.c.a("pid");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f3685c = ra.c.a("processName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f3686d = ra.c.a("reasonCode");
    public static final ra.c e = ra.c.a("importance");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f3687f = ra.c.a("pss");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f3688g = ra.c.a("rss");
    public static final ra.c h = ra.c.a("timestamp");
    public static final ra.c i = ra.c.a("traceFile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final ra.c f3689j = ra.c.a("buildIdMappingForArch");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        ra.e eVar = (ra.e) obj2;
        y yVar = (y) ((y0) obj);
        eVar.c(f3684b, yVar.f3882a);
        eVar.e(f3685c, yVar.f3883b);
        eVar.c(f3686d, yVar.f3884c);
        eVar.c(e, yVar.f3885d);
        eVar.d(f3687f, yVar.e);
        eVar.d(f3688g, yVar.f3886f);
        eVar.d(h, yVar.f3887g);
        eVar.e(i, yVar.h);
        eVar.e(f3689j, yVar.i);
    }
}

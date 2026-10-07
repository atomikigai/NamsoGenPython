package l5;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6798a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6799b = new ra.c("window", v.n(v.m(ua.e.class, new ua.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6800c = new ra.c("logSourceMetrics", v.n(v.m(ua.e.class, new ua.a(2))));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f6801d = new ra.c("globalMetrics", v.n(v.m(ua.e.class, new ua.a(3))));
    public static final ra.c e = new ra.c("appNamespace", v.n(v.m(ua.e.class, new ua.a(4))));

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        o5.a aVar = (o5.a) obj;
        ra.e eVar = (ra.e) obj2;
        eVar.e(f6799b, aVar.f7558a);
        eVar.e(f6800c, aVar.f7559b);
        eVar.e(f6801d, aVar.f7560c);
        eVar.e(e, aVar.f7561d);
    }
}

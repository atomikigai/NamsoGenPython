package l5;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f6814a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6815b = new ra.c("startMs", v.n(v.m(ua.e.class, new ua.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6816c = new ra.c("endMs", v.n(v.m(ua.e.class, new ua.a(2))));

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        o5.g gVar = (o5.g) obj;
        ra.e eVar = (ra.e) obj2;
        eVar.d(f6815b, gVar.f7578a);
        eVar.d(f6816c, gVar.f7579b);
    }
}

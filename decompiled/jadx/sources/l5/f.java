package l5;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f6811a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6812b = new ra.c("currentCacheSizeBytes", v.n(v.m(ua.e.class, new ua.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6813c = new ra.c("maxCacheSizeBytes", v.n(v.m(ua.e.class, new ua.a(2))));

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        o5.f fVar = (o5.f) obj;
        ra.e eVar = (ra.e) obj2;
        eVar.d(f6812b, fVar.f7576a);
        eVar.d(f6813c, fVar.f7577b);
    }
}

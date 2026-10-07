package l5;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6807a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6808b = new ra.c("logSource", v.n(v.m(ua.e.class, new ua.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6809c = new ra.c("logEventDropped", v.n(v.m(ua.e.class, new ua.a(2))));

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        o5.e eVar = (o5.e) obj;
        ra.e eVar2 = (ra.e) obj2;
        eVar2.e(f6808b, eVar.f7574a);
        eVar2.e(f6809c, eVar.f7575b);
    }
}

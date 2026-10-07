package l5;

import da.v;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6804a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6805b = new ra.c("eventsDroppedCount", v.n(v.m(ua.e.class, new ua.a(1))));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6806c = new ra.c("reason", v.n(v.m(ua.e.class, new ua.a(3))));

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        o5.d dVar = (o5.d) obj;
        ra.e eVar = (ra.e) obj2;
        eVar.d(f6805b, dVar.f7571a);
        eVar.e(f6806c, dVar.f7572b);
    }
}

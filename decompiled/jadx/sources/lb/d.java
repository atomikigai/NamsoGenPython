package lb;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f6889a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6890b = ra.c.a("appId");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6891c = ra.c.a("deviceModel");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f6892d = ra.c.a("sessionSdkVersion");
    public static final ra.c e = ra.c.a("osVersion");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ra.c f6893f = ra.c.a("logEnvironment");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final ra.c f6894g = ra.c.a("androidAppInfo");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        b bVar = (b) obj;
        ra.e eVar = (ra.e) obj2;
        eVar.e(f6890b, bVar.f6883a);
        eVar.e(f6891c, Build.MODEL);
        eVar.e(f6892d, "1.0.2");
        eVar.e(e, Build.VERSION.RELEASE);
        eVar.e(f6893f, o.LOG_ENVIRONMENT_PROD);
        eVar.e(f6894g, bVar.f6884b);
    }
}

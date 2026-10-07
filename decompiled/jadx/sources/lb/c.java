package lb;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements ra.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6885a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra.c f6886b = ra.c.a("packageName");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ra.c f6887c = ra.c.a("versionName");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ra.c f6888d = ra.c.a("appBuildVersion");
    public static final ra.c e = ra.c.a("deviceManufacturer");

    @Override // ra.a
    public final void a(Object obj, Object obj2) {
        a aVar = (a) obj;
        ra.e eVar = (ra.e) obj2;
        eVar.e(f6886b, aVar.f6880a);
        eVar.e(f6887c, aVar.f6881b);
        eVar.e(f6888d, aVar.f6882c);
        eVar.e(e, Build.MANUFACTURER);
    }
}

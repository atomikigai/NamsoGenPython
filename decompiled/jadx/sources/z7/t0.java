package z7;

import com.google.android.gms.internal.measurement.zzn;
import com.google.android.gms.internal.measurement.zzu;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v0 f11362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f11363c;

    public /* synthetic */ t0(v0 v0Var, String str, int i) {
        this.f11361a = i;
        this.f11362b = v0Var;
        this.f11363c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws Throwable {
        switch (this.f11361a) {
            case 0:
                v0 v0Var = this.f11362b;
                j jVar = v0Var.f11411b.f11509c;
                z2.D(jVar);
                String str = this.f11363c;
                h1 h1VarW = jVar.w(str);
                HashMap map = new HashMap();
                map.put("platform", "android");
                map.put("package_name", str);
                ((a1) v0Var.f159a).f11005r.g();
                map.put("gmp_version", 79000L);
                if (h1VarW != null) {
                    String strL = h1VarW.L();
                    if (strL != null) {
                        map.put("app_version", strL);
                    }
                    map.put("app_version_int", Long.valueOf(h1VarW.F()));
                    map.put("dynamite_version", Long.valueOf(h1VarW.G()));
                }
                return map;
            case 1:
                return new zzn("internal.remoteConfig", new s5.j(this.f11362b, this.f11363c, 23, false));
            default:
                return new zzu("internal.appMetadata", new t0(this.f11362b, this.f11363c, 0));
        }
    }
}

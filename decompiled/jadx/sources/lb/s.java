package lb;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ta.c f6944a;

    static {
        ta.e eVar = new ta.e();
        eVar.a(r.class, f.f6899a);
        eVar.a(v.class, g.f6903a);
        eVar.a(i.class, e.f6895a);
        eVar.a(b.class, d.f6889a);
        eVar.a(a.class, c.f6885a);
        eVar.f8669d = true;
        f6944a = new ta.c(eVar);
    }

    public static b a(n9.g gVar) {
        gVar.a();
        Context context = gVar.f7359a;
        jc.i.d(context, "firebaseApp.applicationContext");
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        gVar.a();
        String str = gVar.f7361c.f7367b;
        jc.i.d(str, "firebaseApp.options.applicationId");
        jc.i.d(Build.MODEL, "MODEL");
        jc.i.d(Build.VERSION.RELEASE, "RELEASE");
        jc.i.d(packageName, "packageName");
        String str2 = packageInfo.versionName;
        if (str2 == null) {
            str2 = strValueOf;
        }
        jc.i.d(Build.MANUFACTURER, "MANUFACTURER");
        return new b(str, new a(packageName, str2, strValueOf));
    }

    public static r b(n9.g gVar, q qVar, nb.f fVar, Map map) {
        h hVar;
        jc.i.e(qVar, "sessionDetails");
        jc.i.e(fVar, "sessionsSettings");
        jc.i.e(map, "subscribers");
        String str = qVar.f6938a;
        String str2 = qVar.f6939b;
        int i = qVar.f6940c;
        long j4 = qVar.f6941d;
        da.l lVar = (da.l) map.get(mb.d.f7096b);
        h hVar2 = h.COLLECTION_DISABLED;
        h hVar3 = h.COLLECTION_ENABLED;
        h hVar4 = h.COLLECTION_SDK_NOT_INSTALLED;
        if (lVar == null) {
            hVar = hVar4;
        } else {
            hVar = lVar.f3113a.a() ? hVar3 : hVar2;
        }
        da.l lVar2 = (da.l) map.get(mb.d.f7095a);
        if (lVar2 == null) {
            hVar2 = hVar4;
        } else if (lVar2.f3113a.a()) {
            hVar2 = hVar3;
        }
        return new r(new v(str, str2, i, j4, new i(hVar, hVar2, fVar.a())), a(gVar));
    }
}

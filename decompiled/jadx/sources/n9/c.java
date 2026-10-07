package n9;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import e0.k;
import x9.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements ya.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7352c;

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.f7350a = i;
        this.f7352c = obj;
        this.f7351b = obj2;
    }

    @Override // ya.b
    public final Object get() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        switch (this.f7350a) {
            case 0:
                g gVar = (g) this.f7352c;
                Context context = (Context) this.f7351b;
                String strF = gVar.f();
                db.a aVar = new db.a();
                Context contextCreateDeviceProtectedStorageContext = k.createDeviceProtectedStorageContext(context);
                SharedPreferences sharedPreferences = contextCreateDeviceProtectedStorageContext.getSharedPreferences("com.google.firebase.common.prefs:" + strF, 0);
                boolean z4 = true;
                if (sharedPreferences.contains("firebase_data_collection_default_enabled")) {
                    z4 = sharedPreferences.getBoolean("firebase_data_collection_default_enabled", true);
                } else {
                    try {
                        PackageManager packageManager = contextCreateDeviceProtectedStorageContext.getPackageManager();
                        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextCreateDeviceProtectedStorageContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_data_collection_default_enabled")) {
                            z4 = applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
                        }
                        break;
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                }
                aVar.f3176a = z4;
                return aVar;
            case 1:
                return new p7.b((Context) this.f7351b, (String) this.f7352c);
            default:
                x9.f fVar = (x9.f) this.f7352c;
                x9.b bVar = (x9.b) this.f7351b;
                return bVar.f10319f.d(new s(bVar, fVar));
        }
    }

    public /* synthetic */ c(Context context, String str) {
        this.f7350a = 1;
        this.f7351b = context;
        this.f7352c = str;
    }
}

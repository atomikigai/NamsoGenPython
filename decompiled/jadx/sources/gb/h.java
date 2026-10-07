package gb;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.io.FileOutputStream;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class h implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4465b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4466c;

    public /* synthetic */ h(int i, Object obj, Object obj2) {
        this.f4464a = i;
        this.f4465b = obj;
        this.f4466c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        String str;
        ServiceInfo serviceInfo;
        String str2;
        int i;
        ComponentName componentNameStartService;
        switch (this.f4464a) {
            case 0:
                Context context = (Context) this.f4465b;
                Intent intent = (Intent) this.f4466c;
                r rVarG = r.g();
                rVarG.getClass();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) rVarG.f4496d).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (rVarG) {
                    try {
                        str = (String) rVarG.f4493a;
                        if (str == null) {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str2 = serviceInfo.name) == null) {
                                Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else {
                                if (str2.startsWith(".")) {
                                    rVarG.f4493a = context.getPackageName() + serviceInfo.name;
                                } else {
                                    rVarG.f4493a = serviceInfo.name;
                                }
                                str = (String) rVarG.f4493a;
                            }
                            str = null;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (str != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str));
                    }
                    intent2.setClassName(context.getPackageName(), str);
                }
                try {
                    if (rVarG.j(context)) {
                        componentNameStartService = a0.c(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e4) {
                    Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e4);
                    i = 401;
                }
                return Integer.valueOf(i);
            case 1:
                jb.b bVar = (jb.b) this.f4465b;
                jb.g gVar = (jb.g) this.f4466c;
                kb.k kVar = bVar.h;
                synchronized (kVar.f6184b) {
                    SharedPreferences.Editor editorEdit = kVar.f6183a.edit();
                    gVar.getClass();
                    editorEdit.putLong("fetch_timeout_in_seconds", 60L).putLong("minimum_fetch_interval_in_seconds", gVar.f5742a).commit();
                    break;
                }
                return null;
            default:
                kb.c cVar = (kb.c) this.f4465b;
                kb.e eVar = (kb.e) this.f4466c;
                kb.n nVar = cVar.f6149b;
                synchronized (nVar) {
                    FileOutputStream fileOutputStreamOpenFileOutput = nVar.f6203a.openFileOutput(nVar.f6204b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(eVar.f6156a.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th2) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th2;
                    }
                }
                return null;
        }
    }
}

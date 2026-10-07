package gb;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import android.view.View;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import q0.d2;
import q0.p1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f4481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f4482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f4483c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f4484d;
    public Serializable e;

    public static String b(n9.g gVar) {
        gVar.a();
        n9.j jVar = gVar.f7361c;
        String str = jVar.e;
        if (str != null) {
            return str;
        }
        gVar.a();
        String str2 = jVar.f7367b;
        if (!str2.startsWith("1:")) {
            return str2;
        }
        String[] strArrSplit = str2.split(":");
        if (strArrSplit.length < 2) {
            return null;
        }
        String str3 = strArrSplit[1];
        if (str3.isEmpty()) {
            return null;
        }
        return str3;
    }

    public synchronized String a() {
        try {
            if (((String) this.f4484d) == null) {
                f();
            }
        } catch (Throwable th) {
            throw th;
        }
        return (String) this.f4484d;
    }

    public PackageInfo c(String str) {
        try {
            return ((Context) this.f4483c).getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004c A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a A[Catch: all -> 0x0027, TRY_ENTER, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0077 A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[Catch: all -> 0x0027, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x000a, B:10:0x001d, B:15:0x0029, B:17:0x002f, B:19:0x0041, B:21:0x0047, B:24:0x004c, B:26:0x005f, B:28:0x0065, B:31:0x006a, B:33:0x0077, B:35:0x007c, B:34:0x007a), top: B:42:0x0001 }] */
    public boolean d() {
        int i;
        List<ResolveInfo> listQueryBroadcastReceivers;
        synchronized (this) {
            i = this.f4482b;
            if (i == 0) {
                PackageManager packageManager = ((Context) this.f4483c).getPackageManager();
                if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                    Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
                    i = 0;
                } else if (n7.c.h()) {
                    Intent intent = new Intent("com.google.iid.TOKEN_REQUEST");
                    intent.setPackage("com.google.android.gms");
                    listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
                    if (listQueryBroadcastReceivers != null) {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (n7.c.h()) {
                            this.f4482b = 2;
                        } else {
                            this.f4482b = 1;
                        }
                        i = this.f4482b;
                    } else {
                        Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                        if (n7.c.h()) {
                            this.f4482b = 2;
                        } else {
                            this.f4482b = 1;
                        }
                        i = this.f4482b;
                    }
                } else {
                    Intent intent2 = new Intent("com.google.android.c2dm.intent.REGISTER");
                    intent2.setPackage("com.google.android.gms");
                    List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent2, 0);
                    if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                        Intent intent3 = new Intent("com.google.iid.TOKEN_REQUEST");
                        intent3.setPackage("com.google.android.gms");
                        listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent3, 0);
                        if (listQueryBroadcastReceivers != null || listQueryBroadcastReceivers.size() <= 0) {
                            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
                            if (n7.c.h()) {
                                this.f4482b = 2;
                            } else {
                                this.f4482b = 1;
                            }
                            i = this.f4482b;
                        } else {
                            this.f4482b = 2;
                            i = 2;
                        }
                    } else {
                        this.f4482b = 1;
                        i = 1;
                    }
                }
            }
        }
        return i != 0;
    }

    public void e(d2 d2Var, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p1 p1Var = (p1) it.next();
            if ((p1Var.f7929a.c() & 8) != 0) {
                ((View) this.f4484d).setTranslationY(e8.a.c(p1Var.f7929a.b(), this.f4482b, 0));
                return;
            }
        }
    }

    public synchronized void f() {
        PackageInfo packageInfoC = c(((Context) this.f4483c).getPackageName());
        if (packageInfoC != null) {
            this.f4484d = Integer.toString(packageInfoC.versionCode);
            this.e = packageInfoC.versionName;
        }
    }
}

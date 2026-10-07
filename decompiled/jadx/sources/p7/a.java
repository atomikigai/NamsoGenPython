package p7;

import android.content.Context;
import android.content.res.Configuration;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f7821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f7822b;

    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        int i = configuration.colorMode & 3;
        int i10 = configuration2.colorMode & 3;
        if (i != i10) {
            configuration3.colorMode |= i10;
        }
        int i11 = configuration.colorMode & 12;
        int i12 = configuration2.colorMode & 12;
        if (i11 != i12) {
            configuration3.colorMode |= i12;
        }
    }

    public static synchronized boolean b(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f7821a;
        if (context2 != null && (bool = f7822b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f7822b = null;
        if (n7.c.h()) {
            f7822b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f7822b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f7822b = Boolean.FALSE;
            }
        }
        f7821a = applicationContext;
        return f7822b.booleanValue();
    }
}

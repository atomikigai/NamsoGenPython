package f7;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends ClassLoader {
    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z4) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z4);
        }
        if (!Log.isLoggable("CloudMessengerCompat", 3)) {
            return e.class;
        }
        Log.d("CloudMessengerCompat", "Using renamed FirebaseIidMessengerCompat class");
        return e.class;
    }
}

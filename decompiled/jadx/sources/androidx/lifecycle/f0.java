package androidx.lifecycle;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {
    public static void a(Activity activity) {
        jc.i.e(activity, "activity");
        activity.registerActivityLifecycleCallbacks(new g0.a());
    }
}

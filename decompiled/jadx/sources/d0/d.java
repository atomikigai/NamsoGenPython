package d0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f2747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Activity f2748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f2750d = false;
    public boolean e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f2751f = false;

    public d(Activity activity) {
        this.f2748b = activity;
        this.f2749c = activity.hashCode();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.f2748b == activity) {
            this.f2748b = null;
            this.e = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (!this.e || this.f2751f || this.f2750d) {
            return;
        }
        Object obj = this.f2747a;
        try {
            Object obj2 = e.f2754c.get(activity);
            if (obj2 == obj && activity.hashCode() == this.f2749c) {
                e.f2757g.postAtFrontOfQueue(new a3.e(e.f2753b.get(activity), obj2, 4, false));
                this.f2751f = true;
                this.f2747a = null;
            }
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.f2748b == activity) {
            this.f2750d = true;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}

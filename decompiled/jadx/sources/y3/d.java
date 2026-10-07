package y3;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final int e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActivityManager f10549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q3.e f10550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f10551d;

    static {
        e = Build.VERSION.SDK_INT < 26 ? 4 : 1;
    }

    public d(Context context) {
        this.f10551d = e;
        this.f10548a = context;
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        this.f10549b = activityManager;
        this.f10550c = new q3.e(context.getResources().getDisplayMetrics());
        if (Build.VERSION.SDK_INT < 26 || !activityManager.isLowRamDevice()) {
            return;
        }
        this.f10551d = 0.0f;
    }
}

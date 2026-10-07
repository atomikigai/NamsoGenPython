package h6;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.telephony.TelephonyManager;
import com.google.android.gms.internal.ads.zzbbs;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public Intent a(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("app_package", activity.getPackageName());
        intent.putExtra("app_uid", activity.getApplicationInfo().uid);
        return intent;
    }

    public zzbbs.zzq b(Context context, TelephonyManager telephonyManager) {
        return zzbbs.zzq.ENUM_UNKNOWN;
    }

    public boolean d(Context context) {
        return false;
    }

    public int e(AudioManager audioManager) {
        return 0;
    }

    public int g(Context context) {
        return ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
    }

    public void c(Context context) {
    }

    public void f(Activity activity) {
    }
}

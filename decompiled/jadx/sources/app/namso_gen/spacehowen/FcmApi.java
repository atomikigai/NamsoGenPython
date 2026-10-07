package app.namso_gen.spacehowen;

import a2.g;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.os.Build;
import android.util.Log;
import i3.p;
import jc.i;
import rc.b0;
import rc.k0;
import yb.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class FcmApi extends Application {
    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        if (p.f5195a == null) {
            p.f5195a = getSharedPreferences("krypt_prefs", 0);
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = getSystemService("notification");
            i.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
            NotificationManager notificationManager = (NotificationManager) systemService;
            if (notificationManager.getNotificationChannel("urgent_v2") == null) {
                NotificationChannel notificationChannel = new NotificationChannel("urgent_v2", getString(R.string.notification_channel_name), 4);
                notificationChannel.setDescription(getString(R.string.notification_channel_description));
                notificationChannel.enableVibration(true);
                notificationChannel.setLockscreenVisibility(1);
                notificationChannel.setShowBadge(true);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("urgent_v2");
            StringBuilder sb2 = new StringBuilder("ensurePriority: urgent_v2 importance=");
            sb2.append(notificationChannel2 != null ? notificationChannel2.getImportance() : -1);
            sb2.append(" (HIGH=4)");
            Log.d("FcmApi", sb2.toString());
            for (NotificationChannel notificationChannel3 : notificationManager.getNotificationChannels()) {
                Log.d("FcmApi", "ensurePriority: canal '" + notificationChannel3.getId() + "' (" + ((Object) notificationChannel3.getName()) + ") importancia=" + notificationChannel3.getImportance());
            }
        }
        b0.q(b0.b(k0.f8293b), null, new g(this, (d) null, 4), 3);
    }
}

package gb;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f4458a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX WARN: Code duplicated, block: B:132:0x0328  */
    /* JADX WARN: Code duplicated, block: B:13:0x003e  */
    /* JADX WARN: Code duplicated, block: B:196:0x015b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x031a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x0096  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:67:0x017a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v127 */
    /* JADX WARN: Type inference failed for: r0v128 */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v130 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r0v84, types: [int] */
    public static j a(FirebaseMessagingService firebaseMessagingService, e7.i iVar) {
        Bundle bundle;
        int identifier;
        String string;
        int identifier2;
        Uri defaultUri;
        Intent launchIntentForPackage;
        PendingIntent activity;
        Integer numValueOf;
        Integer num;
        int i;
        try {
            ApplicationInfo applicationInfo = firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 128);
            if (applicationInfo == null || (bundle = applicationInfo.metaData) == null) {
                bundle = Bundle.EMPTY;
            }
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: " + e);
        }
        Bundle bundle2 = bundle;
        String strY = iVar.y("gcm.n.android_channel_id");
        int i10 = 0;
        if (Build.VERSION.SDK_INT < 26) {
            strY = null;
        } else {
            try {
                if (firebaseMessagingService.getPackageManager().getApplicationInfo(firebaseMessagingService.getPackageName(), 0).targetSdkVersion < 26) {
                    strY = null;
                } else {
                    NotificationManager notificationManager = (NotificationManager) firebaseMessagingService.getSystemService(NotificationManager.class);
                    if (TextUtils.isEmpty(strY)) {
                        strY = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strY)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strY) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strY = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    } else if (notificationManager.getNotificationChannel(strY) == null) {
                        Log.w("FirebaseMessaging", "Notification Channel requested (" + strY + ") has not been created by the app. Manifest configuration, or default, value will be used.");
                        strY = bundle2.getString("com.google.firebase.messaging.default_notification_channel_id");
                        if (!TextUtils.isEmpty(strY)) {
                            Log.w("FirebaseMessaging", "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.");
                        } else if (notificationManager.getNotificationChannel(strY) == null) {
                            Log.w("FirebaseMessaging", "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.");
                        }
                        strY = "fcm_fallback_notification_channel";
                        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                            identifier = firebaseMessagingService.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", firebaseMessagingService.getPackageName());
                            if (identifier == 0) {
                                Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                                string = "Misc";
                            } else {
                                string = firebaseMessagingService.getString(identifier);
                            }
                            notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", string, 3));
                        }
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String packageName = firebaseMessagingService.getPackageName();
        Resources resources = firebaseMessagingService.getResources();
        PackageManager packageManager = firebaseMessagingService.getPackageManager();
        d0.t tVar = new d0.t(firebaseMessagingService, strY);
        String strX = iVar.x(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strX)) {
            tVar.e = d0.t.b(strX);
        }
        String strX2 = iVar.x(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strX2)) {
            tVar.f2773f = d0.t.b(strX2);
            d0.r rVar = new d0.r();
            rVar.e = d0.t.b(strX2);
            tVar.e(rVar);
        }
        String strY2 = iVar.y("gcm.n.icon");
        if (TextUtils.isEmpty(strY2)) {
            identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            if (identifier2 != 0 || !b(resources, identifier2)) {
                try {
                } catch (PackageManager.NameNotFoundException e4) {
                    Log.w("FirebaseMessaging", "Couldn't get own application info: " + e4);
                }
            }
            if (identifier2 != 0 || !b(resources, identifier2)) {
                identifier2 = 17301651;
            }
        } else {
            identifier2 = resources.getIdentifier(strY2, "drawable", packageName);
            if ((identifier2 == 0 || !b(resources, identifier2)) && ((identifier2 = resources.getIdentifier(strY2, "mipmap", packageName)) == 0 || !b(resources, identifier2))) {
                Log.w("FirebaseMessaging", "Icon resource " + strY2 + " not found. Notification will use default icon.");
                identifier2 = bundle2.getInt("com.google.firebase.messaging.default_notification_icon", 0);
                identifier2 = identifier2 != 0 ? packageManager.getApplicationInfo(packageName, 0).icon : packageManager.getApplicationInfo(packageName, 0).icon;
                if (identifier2 != 0) {
                    identifier2 = 17301651;
                } else {
                    identifier2 = 17301651;
                }
            }
        }
        tVar.f2784s.icon = identifier2;
        String strY3 = iVar.y("gcm.n.sound2");
        if (TextUtils.isEmpty(strY3)) {
            strY3 = iVar.y("gcm.n.sound");
        }
        if (TextUtils.isEmpty(strY3)) {
            defaultUri = null;
        } else if ("default".equals(strY3) || resources.getIdentifier(strY3, "raw", packageName) == 0) {
            defaultUri = RingtoneManager.getDefaultUri(2);
        } else {
            defaultUri = Uri.parse("android.resource://" + packageName + "/raw/" + strY3);
        }
        char c10 = 4;
        if (defaultUri != null) {
            Notification notification = tVar.f2784s;
            notification.sound = defaultUri;
            notification.audioStreamType = -1;
            notification.audioAttributes = d0.s.a(d0.s.e(d0.s.c(d0.s.b(), 4), 5));
        }
        String strY4 = iVar.y("gcm.n.click_action");
        if (TextUtils.isEmpty(strY4)) {
            String strY5 = iVar.y("gcm.n.link_android");
            if (TextUtils.isEmpty(strY5)) {
                strY5 = iVar.y("gcm.n.link");
            }
            Uri uri = !TextUtils.isEmpty(strY5) ? Uri.parse(strY5) : null;
            if (uri != null) {
                launchIntentForPackage = new Intent("android.intent.action.VIEW");
                launchIntentForPackage.setPackage(packageName);
                launchIntentForPackage.setData(uri);
            } else {
                launchIntentForPackage = packageManager.getLaunchIntentForPackage(packageName);
                if (launchIntentForPackage == null) {
                    Log.w("FirebaseMessaging", "No activity found to launch app");
                }
            }
        } else {
            launchIntentForPackage = new Intent(strY4);
            launchIntentForPackage.setPackage(packageName);
            launchIntentForPackage.setFlags(268435456);
        }
        AtomicInteger atomicInteger = f4458a;
        if (launchIntentForPackage == null) {
            activity = null;
        } else {
            launchIntentForPackage.addFlags(67108864);
            Bundle bundle3 = (Bundle) iVar.f3489b;
            Bundle bundle4 = new Bundle(bundle3);
            for (String str : bundle3.keySet()) {
                char c11 = c10;
                if (str.startsWith("google.c.") || str.startsWith("gcm.n.") || str.startsWith("gcm.notification.")) {
                    bundle4.remove(str);
                }
                c10 = c11;
            }
            launchIntentForPackage.putExtras(bundle4);
            if (iVar.m("google.c.a.e")) {
                launchIntentForPackage.putExtra("gcm.n.analytics_data", iVar.C());
            }
            activity = PendingIntent.getActivity(firebaseMessagingService, atomicInteger.incrementAndGet(), launchIntentForPackage, 1140850688);
        }
        tVar.f2774g = activity;
        PendingIntent broadcast = !iVar.m("google.c.a.e") ? null : PendingIntent.getBroadcast(firebaseMessagingService, atomicInteger.incrementAndGet(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(firebaseMessagingService, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(iVar.C())), 1140850688);
        if (broadcast != null) {
            tVar.f2784s.deleteIntent = broadcast;
        }
        String strY6 = iVar.y("gcm.n.color");
        if (TextUtils.isEmpty(strY6)) {
            i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
            if (i != 0) {
                numValueOf = Integer.valueOf(e0.k.getColor(firebaseMessagingService, i));
            } else {
                numValueOf = null;
            }
        } else {
            try {
                numValueOf = Integer.valueOf(Color.parseColor(strY6));
            } catch (IllegalArgumentException unused2) {
                Log.w("FirebaseMessaging", "Color is invalid: " + strY6 + ". Notification will use default color.");
                i = bundle2.getInt("com.google.firebase.messaging.default_notification_color", 0);
                if (i != 0) {
                    try {
                        numValueOf = Integer.valueOf(e0.k.getColor(firebaseMessagingService, i));
                    } catch (Resources.NotFoundException unused3) {
                        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
                        numValueOf = null;
                    }
                } else {
                    numValueOf = null;
                }
            }
        }
        if (numValueOf != null) {
            tVar.f2780o = numValueOf.intValue();
        }
        tVar.c(!iVar.m("gcm.n.sticky"));
        tVar.f2778m = iVar.m("gcm.n.local_only");
        String strY7 = iVar.y("gcm.n.ticker");
        if (strY7 != null) {
            tVar.f2784s.tickerText = d0.t.b(strY7);
        }
        Integer numN = iVar.n("gcm.n.notification_priority");
        if (numN == null) {
            numN = null;
        } else if (numN.intValue() < -2 || numN.intValue() > 2) {
            Log.w("FirebaseMessaging", "notificationPriority is invalid " + numN + ". Skipping setting notificationPriority.");
            numN = null;
        }
        if (numN != null) {
            tVar.f2775j = numN.intValue();
        }
        Integer numN2 = iVar.n("gcm.n.visibility");
        if (numN2 == null) {
            numN2 = null;
        } else if (numN2.intValue() < -1 || numN2.intValue() > 1) {
            Log.w("NotificationParams", "visibility is invalid: " + numN2 + ". Skipping setting visibility.");
            numN2 = null;
        }
        if (numN2 != null) {
            tVar.f2781p = numN2.intValue();
        }
        Integer numN3 = iVar.n("gcm.n.notification_count");
        if (numN3 == null) {
            num = null;
        } else if (numN3.intValue() < 0) {
            Log.w("FirebaseMessaging", "notificationCount is invalid: " + numN3 + ". Skipping setting notificationCount.");
            num = null;
        } else {
            num = numN3;
        }
        if (num != null) {
            tVar.i = num.intValue();
        }
        Long lW = iVar.w();
        if (lW != null) {
            tVar.f2776k = true;
            tVar.f2784s.when = lW.longValue();
        }
        long[] jArrZ = iVar.z();
        if (jArrZ != null) {
            tVar.f2784s.vibrate = jArrZ;
        }
        int[] iArrT = iVar.t();
        if (iArrT != null) {
            int i11 = iArrT[0];
            int i12 = iArrT[1];
            int i13 = iArrT[2];
            Notification notification2 = tVar.f2784s;
            notification2.ledARGB = i11;
            notification2.ledOnMS = i12;
            notification2.ledOffMS = i13;
            if (i12 != 0 && i13 != 0) {
                i10 = 1;
            }
            notification2.flags = (notification2.flags & (-2)) | i10;
        }
        boolean zM = iVar.m("gcm.n.default_sound");
        ?? r10 = zM;
        if (iVar.m("gcm.n.default_vibrate_timings")) {
            r10 = (zM ? 1 : 0) | 2;
        }
        ?? r11 = r10;
        if (iVar.m("gcm.n.default_light_settings")) {
            r11 = (r10 == true ? 1 : 0) | 4;
        }
        Notification notification3 = tVar.f2784s;
        notification3.defaults = r11;
        if ((r11 & 4) != 0) {
            notification3.flags |= 1;
        }
        String strY8 = iVar.y("gcm.n.tag");
        if (TextUtils.isEmpty(strY8)) {
            strY8 = "FCM-Notification:" + SystemClock.uptimeMillis();
        }
        return new j(tVar, strY8);
    }

    public static boolean b(Resources resources, int i) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!(resources.getDrawable(i, null) instanceof AdaptiveIconDrawable)) {
                return true;
            }
            Log.e("FirebaseMessaging", "Adaptive icons cannot be used in notifications. Ignoring icon id: " + i);
            return false;
        } catch (Resources.NotFoundException unused) {
            Log.e("FirebaseMessaging", "Couldn't find resource " + i + ", treating it as an invalid icon");
            return false;
        }
    }
}

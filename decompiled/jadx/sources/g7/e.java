package g7;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.FragmentManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import androidx.fragment.app.i0;
import androidx.fragment.app.w;
import com.firebase.ui.auth.KickoffActivity;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.m0;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object f4239d = new Object();
    public static final e e = new e();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4238c = f.f4240a;

    public static AlertDialog g(Activity activity, int i, y yVar, DialogInterface.OnCancelListener onCancelListener) {
        String string;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        activity.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(activity.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(activity, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(activity);
        }
        builder.setMessage(x.b(activity, i));
        builder.setOnCancelListener(onCancelListener);
        Resources resources = activity.getResources();
        if (i == 1) {
            string = resources.getString(app.namso_gen.spacehowen.R.string.common_google_play_services_install_button);
        } else if (i != 2) {
            string = i != 3 ? resources.getString(R.string.ok) : resources.getString(app.namso_gen.spacehowen.R.string.common_google_play_services_enable_button);
        } else {
            string = resources.getString(app.namso_gen.spacehowen.R.string.common_google_play_services_update_button);
        }
        if (string != null) {
            builder.setPositiveButton(string, yVar);
        }
        String strC = x.c(activity, i);
        if (strC != null) {
            builder.setTitle(strC);
        }
        Log.w("GoogleApiAvailability", da.v.f(i, "Creating dialog for Google Play services availability issue. ConnectionResult="), new IllegalArgumentException());
        return builder.create();
    }

    public static void h(Activity activity, AlertDialog alertDialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof w) {
                i0 i0VarP = ((w) activity).p();
                j jVar = new j();
                com.google.android.gms.common.internal.i0.j(alertDialog, "Cannot display null dialog");
                alertDialog.setOnCancelListener(null);
                alertDialog.setOnDismissListener(null);
                jVar.f4249v0 = alertDialog;
                jVar.f4250w0 = onCancelListener;
                jVar.e0(i0VarP, str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        c cVar = new c();
        com.google.android.gms.common.internal.i0.j(alertDialog, "Cannot display null dialog");
        alertDialog.setOnCancelListener(null);
        alertDialog.setOnDismissListener(null);
        cVar.f4232a = alertDialog;
        cVar.f4233b = onCancelListener;
        cVar.show(fragmentManager, str);
    }

    @Override // g7.f
    public final int c(Context context) {
        return d(context, f.f4240a);
    }

    public final Task e(KickoffActivity kickoffActivity) {
        com.google.android.gms.common.internal.i0.d("makeGooglePlayServicesAvailable must be called from the main thread");
        int iD = super.d(kickoffActivity, f4238c);
        if (iD == 0) {
            return Tasks.forResult(null);
        }
        m0 m0VarD = m0.d(kickoffActivity);
        m0VarD.c(new b(iD, null), 0);
        return m0VarD.e.getTask();
    }

    public final void f(GoogleApiActivity googleApiActivity, int i, GoogleApiActivity googleApiActivity2) {
        AlertDialog alertDialogG = g(googleApiActivity, i, new y(super.b(googleApiActivity, "d", i), googleApiActivity, 0), googleApiActivity2);
        if (alertDialogG == null) {
            return;
        }
        h(googleApiActivity, alertDialogG, "GooglePlayServicesErrorDialog", googleApiActivity2);
    }

    public final void i(Context context, int i, PendingIntent pendingIntent) {
        int i10;
        Log.w("GoogleApiAvailability", q1.a.j(i, "GMS core API Availability. ConnectionResult=", ", tag=null"), new IllegalArgumentException());
        if (i == 18) {
            new k(this, context).sendEmptyMessageDelayed(1, 120000L);
            return;
        }
        if (pendingIntent == null) {
            if (i == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strE = i == 6 ? x.e(context, "common_google_play_services_resolution_required_title") : x.c(context, i);
        if (strE == null) {
            strE = context.getResources().getString(app.namso_gen.spacehowen.R.string.common_google_play_services_notification_ticker);
        }
        String strD = (i == 6 || i == 19) ? x.d(context, "common_google_play_services_resolution_required_text", x.a(context)) : x.b(context, i);
        Resources resources = context.getResources();
        Object systemService = context.getSystemService("notification");
        com.google.android.gms.common.internal.i0.i(systemService);
        NotificationManager notificationManager = (NotificationManager) systemService;
        d0.t tVar = new d0.t(context, null);
        tVar.f2778m = true;
        tVar.c(true);
        tVar.e = d0.t.b(strE);
        d0.r rVar = new d0.r();
        rVar.e = d0.t.b(strD);
        tVar.e(rVar);
        PackageManager packageManager = context.getPackageManager();
        if (n7.c.f7305c == null) {
            n7.c.f7305c = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        if (n7.c.f7305c.booleanValue()) {
            tVar.f2784s.icon = context.getApplicationInfo().icon;
            tVar.f2775j = 2;
            if (n7.c.l(context)) {
                tVar.f2770b.add(new d0.l(resources.getString(app.namso_gen.spacehowen.R.string.common_open_on_phone), pendingIntent));
            } else {
                tVar.f2774g = pendingIntent;
            }
        } else {
            tVar.f2784s.icon = R.drawable.stat_sys_warning;
            tVar.f2784s.tickerText = d0.t.b(resources.getString(app.namso_gen.spacehowen.R.string.common_google_play_services_notification_ticker));
            tVar.f2784s.when = System.currentTimeMillis();
            tVar.f2774g = pendingIntent;
            tVar.f2773f = d0.t.b(strD);
        }
        if (n7.c.h()) {
            com.google.android.gms.common.internal.i0.l(n7.c.h());
            synchronized (f4239d) {
            }
            NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
            String string = context.getResources().getString(app.namso_gen.spacehowen.R.string.common_google_play_services_notification_channel_name);
            if (notificationChannel == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
            } else if (!string.contentEquals(notificationChannel.getName())) {
                notificationChannel.setName(string);
                notificationManager.createNotificationChannel(notificationChannel);
            }
            tVar.f2782q = "com.google.android.gms.availability";
        }
        Notification notificationA = tVar.a();
        if (i == 1 || i == 2 || i == 3) {
            h.f4242a.set(false);
            i10 = 10436;
        } else {
            i10 = 39789;
        }
        notificationManager.notify(i10, notificationA);
    }

    public final void j(Activity activity, com.google.android.gms.common.api.internal.l lVar, int i, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog alertDialogG = g(activity, i, new y(super.b(activity, "d", i), lVar, 1), onCancelListener);
        if (alertDialogG == null) {
            return;
        }
        h(activity, alertDialogG, "GooglePlayServicesErrorDialog", onCancelListener);
    }
}

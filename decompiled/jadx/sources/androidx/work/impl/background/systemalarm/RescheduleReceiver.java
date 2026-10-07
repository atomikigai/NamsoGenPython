package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import t2.m;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f1262a = m.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m.d().a(f1262a, String.format("Received intent %s", intent), new Throwable[0]);
        try {
            j jVarS = j.S(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (j.f8818x) {
                try {
                    jVarS.f8827u = pendingResultGoAsync;
                    if (jVarS.f8826t) {
                        pendingResultGoAsync.finish();
                        jVarS.f8827u = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            m.d().b(f1262a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}

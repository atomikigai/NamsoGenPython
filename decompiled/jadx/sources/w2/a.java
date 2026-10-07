package w2;

import a2.l;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import t2.m;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f9448a = m.f("Alarms");

    public static void a(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, b.a(context, str), 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        m.d().a(f9448a, "Cancelling existing alarm with (workSpecId, systemId) (" + str + ", " + i + ")", new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void b(Context context, j jVar, String str, long j4) {
        int iIntValue;
        WorkDatabase workDatabase = jVar.f8821o;
        l lVarU = workDatabase.u();
        c3.d dVarZ = lVarU.z(str);
        if (dVarZ != null) {
            a(context, str, dVarZ.f1737b);
            int i = dVarZ.f1737b;
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            PendingIntent service = PendingIntent.getService(context, i, b.a(context, str), 201326592);
            if (alarmManager != null) {
                alarmManager.setExact(0, j4, service);
                return;
            }
            return;
        }
        synchronized (d3.f.class) {
            workDatabase.c();
            try {
                Long lX = workDatabase.t().x("next_alarm_manager_id");
                iIntValue = lX != null ? lX.intValue() : 0;
                workDatabase.t().C(new c3.c("next_alarm_manager_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                workDatabase.q();
                workDatabase.n();
            } catch (Throwable th) {
                workDatabase.n();
                throw th;
            }
        }
        lVarU.C(new c3.d(str, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, b.a(context, str), 201326592);
        if (alarmManager2 != null) {
            alarmManager2.setExact(0, j4, service2);
        }
    }
}

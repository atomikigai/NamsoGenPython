package d3;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import y1.y;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f2808d = t2.m.f("ForceStopRunnable");
    public static final long e = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2.j f2810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2811c = 0;

    public e(Context context, u2.j jVar) {
        this.f2809a = context.getApplicationContext();
        this.f2810b = jVar;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = m0.b.b() ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + e;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0200  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0086  */
    public final void a() {
        boolean z4;
        int i;
        String string;
        String str = x2.b.e;
        Context context = this.f2809a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        ArrayList arrayListE = x2.b.e(context, jobScheduler);
        u2.j jVar = this.f2810b;
        a2.l lVarU = jVar.f8821o.u();
        lVarU.getClass();
        y yVarD = y.d(0, "SELECT DISTINCT work_spec_id FROM SystemIdInfo");
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVarU.f43b;
        workDatabase_Impl.b();
        Cursor cursorX = n9.b.x(workDatabase_Impl, yVarD);
        try {
            ArrayList arrayList = new ArrayList(cursorX.getCount());
            while (cursorX.moveToNext()) {
                arrayList.add(cursorX.getString(0));
            }
            cursorX.close();
            yVarD.g();
            HashSet hashSet = new HashSet(arrayListE != null ? arrayListE.size() : 0);
            if (arrayListE != null && !arrayListE.isEmpty()) {
                int size = arrayListE.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayListE.get(i10);
                    i10++;
                    JobInfo jobInfo = (JobInfo) obj;
                    PersistableBundle extras = jobInfo.getExtras();
                    if (extras != null) {
                        try {
                            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                                string = extras.getString("EXTRA_WORK_SPEC_ID");
                            } else {
                                string = null;
                            }
                        } catch (NullPointerException unused) {
                        }
                    } else {
                        string = null;
                    }
                    if (TextUtils.isEmpty(string)) {
                        x2.b.c(jobScheduler, jobInfo.getId());
                    } else {
                        hashSet.add(string);
                    }
                }
            }
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    z4 = false;
                    break;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
                if (!hashSet.contains((String) obj2)) {
                    t2.m.d().a(x2.b.e, "Reconciling jobs", new Throwable[0]);
                    z4 = true;
                    break;
                }
            }
            if (z4) {
                WorkDatabase workDatabase = jVar.f8821o;
                workDatabase.c();
                try {
                    c3.j jVarX = workDatabase.x();
                    int size3 = arrayList.size();
                    int i12 = 0;
                    while (i12 < size3) {
                        Object obj3 = arrayList.get(i12);
                        i12++;
                        jVarX.o((String) obj3, -1L);
                    }
                    workDatabase.q();
                    workDatabase.n();
                } catch (Throwable th) {
                    workDatabase.n();
                    throw th;
                }
            }
            WorkDatabase workDatabase2 = jVar.f8821o;
            c3.j jVarX2 = workDatabase2.x();
            gb.r rVarW = workDatabase2.w();
            workDatabase2.c();
            try {
                ArrayList arrayListF = jVarX2.f();
                boolean zIsEmpty = arrayListF.isEmpty();
                if (!zIsEmpty) {
                    int size4 = arrayListF.size();
                    int i13 = 0;
                    while (i13 < size4) {
                        Object obj4 = arrayListF.get(i13);
                        i13++;
                        c3.i iVar = (c3.i) obj4;
                        jVarX2.r(1, iVar.f1744a);
                        jVarX2.o(iVar.f1744a, -1L);
                    }
                }
                WorkDatabase_Impl workDatabase_Impl2 = (WorkDatabase_Impl) rVarW.f4493a;
                workDatabase_Impl2.b();
                c3.e eVar = (c3.e) rVarW.f4496d;
                i2.k kVarA = eVar.a();
                workDatabase_Impl2.c();
                try {
                    kVarA.c();
                    workDatabase_Impl2.q();
                    workDatabase_Impl2.n();
                    eVar.g(kVarA);
                    workDatabase2.q();
                    workDatabase2.n();
                    boolean z10 = !zIsEmpty || z4;
                    Long lX = jVar.f8825s.f2812a.t().x("reschedule_needed");
                    String str2 = f2808d;
                    if (lX != null && lX.longValue() == 1) {
                        t2.m.d().a(str2, "Rescheduling Workers.", new Throwable[0]);
                        jVar.V();
                        f fVar = jVar.f8825s;
                        fVar.getClass();
                        fVar.f2812a.t().C(new c3.c("reschedule_needed", 0L));
                        return;
                    }
                    try {
                        int i14 = m0.b.b() ? 570425344 : 536870912;
                        Intent intent = new Intent();
                        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i14);
                        if (Build.VERSION.SDK_INT < 30) {
                            if (broadcast == null) {
                                c(context);
                                i = 0;
                            }
                            if (z10) {
                                t2.m.d().a(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                                u2.d.a(jVar.f8820n, jVar.f8821o, jVar.f8823q);
                                return;
                            }
                            return;
                        }
                        if (broadcast != null) {
                            broadcast.cancel();
                        }
                        List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                        if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                            int i15 = 0;
                            while (true) {
                                if (i15 < historicalProcessExitReasons.size()) {
                                    if (historicalProcessExitReasons.get(i15).getReason() == 10) {
                                        i = 0;
                                    } else {
                                        i15++;
                                    }
                                }
                            }
                        }
                        if (z10) {
                            t2.m.d().a(str2, "Found unfinished work, scheduling it.", new Throwable[0]);
                            u2.d.a(jVar.f8820n, jVar.f8821o, jVar.f8823q);
                            return;
                        }
                        return;
                    } catch (IllegalArgumentException e4) {
                        e = e4;
                        i = 0;
                        t2.m.d().h(str2, "Ignoring exception", e);
                    } catch (SecurityException e10) {
                        e = e10;
                        i = 0;
                        t2.m.d().h(str2, "Ignoring exception", e);
                    }
                    t2.m.d().a(str2, "Application was force-stopped, rescheduling.", new Throwable[i]);
                    jVar.V();
                } catch (Throwable th2) {
                    workDatabase_Impl2.n();
                    eVar.g(kVarA);
                    throw th2;
                }
            } catch (Throwable th3) {
                workDatabase2.n();
                throw th3;
            }
        } catch (Throwable th4) {
            cursorX.close();
            yVarD.g();
            throw th4;
        }
    }

    public final boolean b() {
        t2.b bVar = this.f2810b.f8820n;
        bVar.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = f2808d;
        if (zIsEmpty) {
            t2.m.d().a(str, "The default process name was not specified.", new Throwable[0]);
            return true;
        }
        boolean zA = h.a(this.f2809a, bVar);
        t2.m.d().a(str, "Is default app process = " + zA, new Throwable[0]);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = f2808d;
        u2.j jVar = this.f2810b;
        try {
            if (!b()) {
                jVar.U();
                return;
            }
            while (true) {
                u2.i.a(this.f2809a);
                t2.m.d().a(str, "Performing cleanup operations.", new Throwable[0]);
                try {
                    a();
                    jVar.U();
                    return;
                } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteTableLockedException e4) {
                    int i = this.f2811c + 1;
                    this.f2811c = i;
                    if (i >= 3) {
                        t2.m.d().b(str, "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                        IllegalStateException illegalStateException = new IllegalStateException("The file system on the device is in a bad state. WorkManager cannot access the app's internal data store.", e4);
                        jVar.f8820n.getClass();
                        throw illegalStateException;
                    }
                    long j4 = ((long) i) * 300;
                    t2.m.d().a(str, "Retrying after " + j4, e4);
                    try {
                        Thread.sleep(((long) this.f2811c) * 300);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        } catch (Throwable th) {
            jVar.U();
            throw th;
        }
    }
}

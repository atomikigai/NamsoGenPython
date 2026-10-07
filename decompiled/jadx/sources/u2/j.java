package u2;

import a2.l;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import app.namso_gen.spacehowen.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import t2.m;
import y1.s;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.bumptech.glide.d {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static j f8816v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static j f8817w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f8818x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Context f8819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t2.b f8820n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WorkDatabase f8821o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final l f8822p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f8823q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f8824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d3.f f8825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f8826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f8827u;

    static {
        m.f("WorkManagerImpl");
        f8816v = null;
        f8817w = null;
        f8818x = new Object();
    }

    public j(Context context, t2.b bVar, l lVar) {
        s sVarC;
        boolean z4 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        d3.i iVar = (d3.i) lVar.f43b;
        int i = WorkDatabase.f1252m;
        if (z4) {
            jc.i.e(applicationContext, "context");
            sVarC = new s(applicationContext, WorkDatabase.class, null);
            sVarC.i = true;
        } else {
            String str = i.f8814a;
            sVarC = y1.c.c(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            sVarC.h = new a4.g(applicationContext);
        }
        jc.i.e(iVar, "executor");
        sVarC.f10500f = iVar;
        sVarC.f10499d.add(new f());
        sVarC.a(h.f8808a);
        sVarC.a(new g(applicationContext, 2, 3));
        sVarC.a(h.f8809b);
        sVarC.a(h.f8810c);
        sVarC.a(new g(applicationContext, 5, 6));
        sVarC.a(h.f8811d);
        sVarC.a(h.e);
        sVarC.a(h.f8812f);
        sVarC.a(new g(applicationContext));
        sVarC.a(new g(applicationContext, 10, 11));
        sVarC.a(h.f8813g);
        sVarC.f10508p = false;
        sVarC.f10509q = true;
        WorkDatabase workDatabase = (WorkDatabase) sVarC.b();
        Context applicationContext2 = context.getApplicationContext();
        m mVar = new m(bVar.f8530f);
        synchronized (m.class) {
            m.f8550b = mVar;
        }
        String str2 = d.f8800a;
        x2.b bVar2 = new x2.b(applicationContext2, this);
        d3.g.a(applicationContext2, SystemJobService.class, true);
        m.d().a(d.f8800a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
        List listAsList = Arrays.asList(bVar2, new v2.b(applicationContext2, bVar, lVar, this));
        b bVar3 = new b(context, bVar, lVar, workDatabase, listAsList);
        Context applicationContext3 = context.getApplicationContext();
        this.f8819m = applicationContext3;
        this.f8820n = bVar;
        this.f8822p = lVar;
        this.f8821o = workDatabase;
        this.f8823q = listAsList;
        this.f8824r = bVar3;
        this.f8825s = new d3.f(workDatabase);
        this.f8826t = false;
        if (applicationContext3.isDeviceProtectedStorage()) {
            throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
        }
        this.f8822p.m(new d3.e(applicationContext3, this));
    }

    public static j S(Context context) {
        j jVar;
        Object obj = f8818x;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    try {
                        jVar = f8816v;
                        if (jVar == null) {
                            jVar = f8817w;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return jVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (jVar != null) {
            return jVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public static void T(Context context, t2.b bVar) {
        synchronized (f8818x) {
            try {
                j jVar = f8816v;
                if (jVar != null && f8817w != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
                if (jVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (f8817w == null) {
                        f8817w = new j(applicationContext, bVar, new l(bVar.f8527b));
                    }
                    f8816v = f8817w;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void U() {
        synchronized (f8818x) {
            try {
                this.f8826t = true;
                BroadcastReceiver.PendingResult pendingResult = this.f8827u;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f8827u = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void V() {
        ArrayList arrayListE;
        String str = x2.b.e;
        Context context = this.f8819m;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListE = x2.b.e(context, jobScheduler)) != null && !arrayListE.isEmpty()) {
            int size = arrayListE.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayListE.get(i);
                i++;
                x2.b.c(jobScheduler, ((JobInfo) obj).getId());
            }
        }
        WorkDatabase workDatabase = this.f8821o;
        c3.j jVarX = workDatabase.x();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) jVarX.f1759a;
        workDatabase_Impl.b();
        c3.e eVar = (c3.e) jVarX.i;
        i2.k kVarA = eVar.a();
        workDatabase_Impl.c();
        try {
            kVarA.c();
            workDatabase_Impl.q();
            workDatabase_Impl.n();
            eVar.g(kVarA);
            d.a(this.f8820n, workDatabase, this.f8823q);
        } catch (Throwable th) {
            workDatabase_Impl.n();
            eVar.g(kVarA);
            throw th;
        }
    }

    public final void W(String str, q5.d dVar) {
        b3.b bVar = new b3.b(3);
        bVar.f1367c = this;
        bVar.f1366b = str;
        bVar.f1368d = dVar;
        this.f8822p.m(bVar);
    }

    public final void X(String str) {
        this.f8822p.m(new d3.j(this, str, false));
    }
}

package x2;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import c3.d;
import c3.i;
import d3.f;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import t2.m;
import u2.c;
import u2.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements c {
    public static final String e = m.f("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler f10259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f10260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f10261d;

    public b(Context context, j jVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        a aVar = new a(context);
        this.f10258a = context;
        this.f10260c = jVar;
        this.f10259b = jobScheduler;
        this.f10261d = aVar;
    }

    public static void c(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            m.d().b(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList e(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            m.d().b(e, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    @Override // u2.c
    public final void a(i... iVarArr) {
        int iA;
        j jVar = this.f10260c;
        WorkDatabase workDatabase = jVar.f8821o;
        f fVar = new f(workDatabase);
        for (i iVar : iVarArr) {
            workDatabase.c();
            try {
                i iVarL = workDatabase.x().l(iVar.f1744a);
                String str = e;
                if (iVarL == null) {
                    m.d().h(str, "Skipping scheduling " + iVar.f1744a + " because it's no longer in the DB", new Throwable[0]);
                    workDatabase.q();
                } else if (iVarL.f1745b != 1) {
                    m.d().h(str, "Skipping scheduling " + iVar.f1744a + " because it is no longer enqueued", new Throwable[0]);
                    workDatabase.q();
                } else {
                    d dVarZ = workDatabase.u().z(iVar.f1744a);
                    if (dVarZ != null) {
                        iA = dVarZ.f1737b;
                    } else {
                        jVar.f8820n.getClass();
                        iA = fVar.a(jVar.f8820n.f8531g);
                    }
                    if (dVarZ == null) {
                        jVar.f8821o.u().C(new d(iVar.f1744a, iA));
                    }
                    f(iVar, iA);
                    workDatabase.q();
                }
                workDatabase.n();
            } catch (Throwable th) {
                workDatabase.n();
                throw th;
            }
        }
    }

    @Override // u2.c
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0035  */
    @Override // u2.c
    public final void d(String str) {
        String string;
        Context context = this.f10258a;
        JobScheduler jobScheduler = this.f10259b;
        ArrayList arrayListE = e(context, jobScheduler);
        int i = 0;
        ArrayList arrayList = null;
        if (arrayListE != null) {
            ArrayList arrayList2 = new ArrayList(2);
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
                if (str.equals(string)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj2 = arrayList.get(i);
            i++;
            c(jobScheduler, ((Integer) obj2).intValue());
        }
        this.f10260c.f8821o.u().J(str);
    }

    public final void f(i iVar, int i) {
        JobScheduler jobScheduler = this.f10259b;
        JobInfo jobInfoA = this.f10261d.a(iVar, i);
        m mVarD = m.d();
        String str = iVar.f1744a;
        String str2 = e;
        mVarD.a(str2, "Scheduling work ID " + str + " Job ID " + i, new Throwable[0]);
        try {
            if (jobScheduler.schedule(jobInfoA) == 0) {
                m.d().h(str2, "Unable to schedule work ID " + iVar.f1744a, new Throwable[0]);
                if (iVar.f1757q && iVar.f1758r == 1) {
                    iVar.f1757q = false;
                    m.d().a(str2, "Scheduling a non-expedited job (work ID " + iVar.f1744a + ")", new Throwable[0]);
                    f(iVar, i);
                }
            }
        } catch (IllegalStateException e4) {
            ArrayList arrayListE = e(this.f10258a, jobScheduler);
            int size = arrayListE != null ? arrayListE.size() : 0;
            Locale locale = Locale.getDefault();
            Integer numValueOf = Integer.valueOf(size);
            j jVar = this.f10260c;
            String str3 = String.format(locale, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", numValueOf, Integer.valueOf(jVar.f8821o.x().g().size()), Integer.valueOf(jVar.f8820n.h));
            m.d().b(str2, str3, new Throwable[0]);
            throw new IllegalStateException(str3, e4);
        } catch (Throwable th) {
            m.d().b(str2, "Unable to schedule " + iVar, th);
        }
    }
}

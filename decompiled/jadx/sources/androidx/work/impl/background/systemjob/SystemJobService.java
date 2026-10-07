package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import da.v;
import java.util.Arrays;
import java.util.HashMap;
import q5.d;
import t2.m;
import u2.a;
import u2.j;
import u3.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f1266c = m.f("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f1267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f1268b = new HashMap();

    @Override // u2.a
    public final void c(String str, boolean z4) {
        JobParameters jobParameters;
        m.d().a(f1266c, v.h(str, " executed on JobScheduler"), new Throwable[0]);
        synchronized (this.f1268b) {
            jobParameters = (JobParameters) this.f1268b.remove(str);
        }
        if (jobParameters != null) {
            jobFinished(jobParameters, z4);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            j jVarS = j.S(getApplicationContext());
            this.f1267a = jVarS;
            jVarS.f8824r.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            m.d().h(f1266c, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        j jVar = this.f1267a;
        if (jVar != null) {
            jVar.f8824r.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string;
        if (this.f1267a == null) {
            m.d().a(f1266c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            jobFinished(jobParameters, true);
            return false;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            m.d().b(f1266c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        synchronized (this.f1268b) {
            try {
                if (this.f1268b.containsKey(string)) {
                    m.d().a(f1266c, "Job is already being executed by SystemJobService: " + string, new Throwable[0]);
                    return false;
                }
                m.d().a(f1266c, "onStartJob for " + string, new Throwable[0]);
                this.f1268b.put(string, jobParameters);
                int i = Build.VERSION.SDK_INT;
                d dVar = new d(4);
                if (jobParameters.getTriggeredContentUris() != null) {
                    dVar.f8040b = Arrays.asList(jobParameters.getTriggeredContentUris());
                }
                if (jobParameters.getTriggeredContentAuthorities() != null) {
                    dVar.f8039a = Arrays.asList(jobParameters.getTriggeredContentAuthorities());
                }
                if (i >= 28) {
                    dVar.f8041c = jobParameters.getNetwork();
                }
                this.f1267a.W(string, dVar);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        String string;
        boolean zContains;
        if (this.f1267a == null) {
            m.d().a(f1266c, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        try {
            PersistableBundle extras = jobParameters.getExtras();
            string = (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) ? null : extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
        }
        if (TextUtils.isEmpty(string)) {
            m.d().b(f1266c, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        m.d().a(f1266c, b.b("onStopJob for ", string), new Throwable[0]);
        synchronized (this.f1268b) {
            this.f1268b.remove(string);
        }
        this.f1267a.X(string);
        u2.b bVar = this.f1267a.f8824r;
        synchronized (bVar.f8799v) {
            zContains = bVar.f8797t.contains(string);
        }
        return !zContains;
    }
}

package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import a2.l;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.webkit.b;
import c3.j;
import java.util.concurrent.Executor;
import l5.i;
import l5.q;
import r5.d;
import v5.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1958a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i10 = jobParameters.getExtras().getInt("attemptNumber");
        q.b(getApplicationContext());
        l lVarA = i.a();
        lVarA.K(string);
        lVarA.f45d = a.b(i);
        if (string2 != null) {
            lVarA.f44c = Base64.decode(string2, 0);
        }
        j jVar = q.a().f6842d;
        ((Executor) jVar.e).execute(new d(jVar, lVarA.h(), i10, new b(16, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}

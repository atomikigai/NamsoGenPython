package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import v1.d;
import y9.j;
import z7.a1;
import z7.i0;
import z7.n2;
import z7.o2;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f2313a;

    @Override // z7.o2
    public final void b(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final d c() {
        if (this.f2313a == null) {
            this.f2313a = new d(this);
        }
        return this.f2313a;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        i0 i0Var = a1.m((Service) c().f9128a, null, null).f11007t;
        a1.f(i0Var);
        i0Var.f11198y.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        i0 i0Var = a1.m((Service) c().f9128a, null, null).f11007t;
        a1.f(i0Var);
        i0Var.f11198y.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d dVarC = c();
        if (intent == null) {
            dVarC.j().f11190f.b("onRebind called with null intent");
            return;
        }
        dVarC.getClass();
        dVarC.j().f11198y.c(intent.getAction(), "onRebind called. action");
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        d dVarC = c();
        i0 i0Var = a1.m((Service) dVarC.f9128a, null, null).f11007t;
        a1.f(i0Var);
        String string = jobParameters.getExtras().getString("action");
        i0Var.f11198y.c(string, "Local AppMeasurementJobService called. action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        n2 n2Var = new n2(dVarC, i0Var, jobParameters);
        z2 z2VarJ = z2.J((Service) dVarC.f9128a);
        z2VarJ.zzaB().l(new j(11, z2VarJ, n2Var));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d dVarC = c();
        if (intent == null) {
            dVarC.j().f11190f.b("onUnbind called with null intent");
            return true;
        }
        dVarC.getClass();
        dVarC.j().f11198y.c(intent.getAction(), "onUnbind called for intent. action");
        return true;
    }

    @Override // z7.o2
    public final boolean zzc(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // z7.o2
    public final void a(Intent intent) {
    }
}

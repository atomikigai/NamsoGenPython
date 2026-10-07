package z7;

import android.app.Service;
import android.app.job.JobParameters;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11280a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f11281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f11282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11283d;

    public n2(v1.d dVar, String str, Bundle bundle) {
        this.f11283d = dVar;
        this.f11281b = str;
        this.f11282c = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11280a) {
            case 0:
                v1.d dVar = (v1.d) this.f11281b;
                i0 i0Var = (i0) this.f11282c;
                JobParameters jobParameters = (JobParameters) this.f11283d;
                i0Var.f11198y.b("AppMeasurementJobService processed last upload request.");
                ((o2) ((Service) dVar.f9128a)).b(jobParameters);
                break;
            default:
                z2 z2Var = (z2) ((v1.d) this.f11283d).f9128a;
                d3 d3VarL = z2Var.L();
                Bundle bundle = (Bundle) this.f11282c;
                ((n7.b) z2Var.zzax()).getClass();
                q qVarI0 = d3VarL.i0("_err", bundle, "auto", System.currentTimeMillis(), false);
                com.google.android.gms.common.internal.i0.i(qVarI0);
                z2Var.f(qVarI0, (String) this.f11281b);
                break;
        }
    }

    public /* synthetic */ n2(v1.d dVar, i0 i0Var, JobParameters jobParameters) {
        this.f11281b = dVar;
        this.f11282c = i0Var;
        this.f11283d = jobParameters;
    }
}

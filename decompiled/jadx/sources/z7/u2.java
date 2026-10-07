package z7;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.zzbs;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends w2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f11380d;
    public r2 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f11381f;

    public u2(z2 z2Var) {
        super(z2Var);
        this.f11380d = (AlarmManager) ((a1) this.f159a).f11000a.getSystemService("alarm");
    }

    @Override // z7.w2
    public final void f() {
        a1 a1Var = (a1) this.f159a;
        AlarmManager alarmManager = this.f11380d;
        if (alarmManager != null) {
            Context context = a1Var.f11000a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza));
        }
        JobScheduler jobScheduler = (JobScheduler) a1Var.f11000a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(h());
        }
    }

    public final void g() {
        d();
        a1 a1Var = (a1) this.f159a;
        i0 i0Var = a1Var.f11007t;
        a1.f(i0Var);
        i0Var.f11198y.b("Unscheduling upload");
        AlarmManager alarmManager = this.f11380d;
        if (alarmManager != null) {
            Context context = a1Var.f11000a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), zzbs.zza));
        }
        j().a();
        JobScheduler jobScheduler = (JobScheduler) a1Var.f11000a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(h());
        }
    }

    public final int h() {
        if (this.f11381f == null) {
            this.f11381f = Integer.valueOf("measurement".concat(String.valueOf(((a1) this.f159a).f11000a.getPackageName())).hashCode());
        }
        return this.f11381f.intValue();
    }

    public final k j() {
        if (this.e == null) {
            this.e = new r2(this, this.f11411b.f11517w, 1);
        }
        return this.e;
    }
}

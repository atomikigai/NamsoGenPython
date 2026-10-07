package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import k1.a;
import v1.d;
import y9.j;
import z7.a1;
import z7.e1;
import z7.i0;
import z7.o2;
import z7.z1;
import z7.z2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements o2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f2315a;

    @Override // z7.o2
    public final void a(Intent intent) {
        SparseArray sparseArray = a.f5911a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f5911a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // z7.o2
    public final void b(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final d c() {
        if (this.f2315a == null) {
            this.f2315a = new d(this);
        }
        return this.f2315a;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        d dVarC = c();
        if (intent == null) {
            dVarC.j().f11190f.b("onBind called with null intent");
            return null;
        }
        dVarC.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new e1(z2.J((Service) dVarC.f9128a));
        }
        dVarC.j().f11193t.c(action, "onBind received unknown action");
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i10) {
        d dVarC = c();
        i0 i0Var = a1.m((Service) dVarC.f9128a, null, null).f11007t;
        a1.f(i0Var);
        if (intent == null) {
            i0Var.f11193t.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        i0Var.f11198y.d(Integer.valueOf(i10), "Local AppMeasurementService called. startId, action", action);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        z1 z1Var = new z1(dVarC, i10, i0Var, intent);
        z2 z2VarJ = z2.J((Service) dVarC.f9128a);
        z2VarJ.zzaB().l(new j(11, z2VarJ, z1Var));
        return 2;
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
        return stopSelfResult(i);
    }
}

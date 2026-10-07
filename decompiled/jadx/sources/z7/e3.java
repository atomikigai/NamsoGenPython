package z7;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzci;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zzci f11113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f11114b;

    public e3(AppMeasurementDynamiteService appMeasurementDynamiteService, zzci zzciVar) {
        this.f11114b = appMeasurementDynamiteService;
        this.f11113a = zzciVar;
    }

    @Override // z7.m1
    public final void a(Bundle bundle, String str, String str2, long j4) {
        try {
            this.f11113a.zze(str, str2, bundle, j4);
        } catch (RemoteException e) {
            a1 a1Var = this.f11114b.f2316a;
            if (a1Var != null) {
                i0 i0Var = a1Var.f11007t;
                a1.f(i0Var);
                i0Var.f11193t.c(e, "Event listener threw exception");
            }
        }
    }
}

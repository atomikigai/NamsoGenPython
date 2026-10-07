package z7;

import com.google.android.gms.internal.measurement.zzcf;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zzcf f11378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AppMeasurementDynamiteService f11379c;

    public /* synthetic */ u1(AppMeasurementDynamiteService appMeasurementDynamiteService, zzcf zzcfVar, int i) {
        this.f11377a = i;
        this.f11379c = appMeasurementDynamiteService;
        this.f11378b = zzcfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11377a) {
            case 0:
                k2 k2VarN = this.f11379c.f2316a.n();
                zzcf zzcfVar = this.f11378b;
                k2VarN.c();
                k2VarN.d();
                k2VarN.p(new b3.b(k2VarN, k2VarN.m(false), zzcfVar, 28));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.f11379c;
                d3 d3Var = appMeasurementDynamiteService.f2316a.f11010w;
                a1.d(d3Var);
                zzcf zzcfVar2 = this.f11378b;
                a1 a1Var = appMeasurementDynamiteService.f2316a;
                d3Var.v(zzcfVar2, a1Var.L != null && a1Var.L.booleanValue());
                break;
        }
    }
}

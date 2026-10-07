package z7;

import android.content.ComponentName;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j2 f11204b;

    public /* synthetic */ i2(j2 j2Var, int i) {
        this.f11203a = i;
        this.f11204b = j2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11203a) {
            case 0:
                j2 j2Var = this.f11204b;
                k2 k2Var = j2Var.f11219c;
                Context context = ((a1) k2Var.f159a).f11000a;
                ((a1) j2Var.f11219c.f159a).getClass();
                k2.q(k2Var, new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementService"));
                break;
            default:
                k2 k2Var2 = this.f11204b.f11219c;
                k2Var2.f11238d = null;
                k2Var2.n();
                break;
        }
    }
}

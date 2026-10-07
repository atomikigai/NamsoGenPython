package z7;

import com.google.android.gms.internal.measurement.zzqu;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j1 f11406a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f11408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f11409d;
    public final /* synthetic */ j1 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x1 f11410f;

    public v1(x1 x1Var, j1 j1Var, long j4, long j10, boolean z4, j1 j1Var2) {
        this.f11410f = x1Var;
        this.f11406a = j1Var;
        this.f11407b = j4;
        this.f11408c = j10;
        this.f11409d = z4;
        this.e = j1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        x1 x1Var = this.f11410f;
        j1 j1Var = this.f11406a;
        x1Var.r(j1Var);
        x1Var.n(this.f11407b, false);
        x1.y(this.f11410f, this.f11406a, this.f11408c, true, this.f11409d);
        zzqu.zzc();
        if (((a1) x1Var.f159a).f11005r.l(null, z.f11463j0)) {
            x1.x(x1Var, j1Var, this.e);
        }
    }
}

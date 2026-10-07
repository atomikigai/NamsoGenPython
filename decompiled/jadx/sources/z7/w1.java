package z7;

import com.google.android.gms.internal.measurement.zzqu;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11414a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f11415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f11416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f11417d;
    public final /* synthetic */ Object e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m0 f11418f;

    public w1(x1 x1Var, j1 j1Var, long j4, boolean z4, j1 j1Var2) {
        this.f11418f = x1Var;
        this.f11417d = j1Var;
        this.f11415b = j4;
        this.f11416c = z4;
        this.e = j1Var2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11414a) {
            case 0:
                x1 x1Var = (x1) this.f11418f;
                j1 j1Var = (j1) this.f11417d;
                x1Var.r(j1Var);
                x1.y((x1) this.f11418f, (j1) this.f11417d, this.f11415b, false, this.f11416c);
                zzqu.zzc();
                if (((a1) x1Var.f159a).f11005r.l(null, z.f11463j0)) {
                    x1.x(x1Var, j1Var, (j1) this.e);
                }
                break;
            default:
                ((d2) this.f11418f).g((b2) this.f11417d, (b2) this.e, this.f11415b, this.f11416c, null);
                break;
        }
    }

    public w1(d2 d2Var, b2 b2Var, b2 b2Var2, long j4, boolean z4) {
        this.f11418f = d2Var;
        this.f11417d = b2Var;
        this.e = b2Var2;
        this.f11415b = j4;
        this.f11416c = z4;
    }
}

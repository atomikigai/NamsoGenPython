package z7;

import android.os.Handler;
import com.google.android.gms.internal.measurement.zzby;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile zzby f11220d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g1 f11221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y9.j f11222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile long f11223c;

    public k(g1 g1Var) {
        com.google.android.gms.common.internal.i0.i(g1Var);
        this.f11221a = g1Var;
        this.f11222b = new y9.j(2, this, g1Var);
    }

    public final void a() {
        this.f11223c = 0L;
        d().removeCallbacks(this.f11222b);
    }

    public abstract void b();

    public final void c(long j4) {
        a();
        if (j4 >= 0) {
            ((n7.b) this.f11221a.zzax()).getClass();
            this.f11223c = System.currentTimeMillis();
            if (d().postDelayed(this.f11222b, j4)) {
                return;
            }
            this.f11221a.zzaA().f11190f.c(Long.valueOf(j4), "Failed to schedule delayed post. time");
        }
    }

    public final Handler d() {
        zzby zzbyVar;
        if (f11220d != null) {
            return f11220d;
        }
        synchronized (k.class) {
            try {
                if (f11220d == null) {
                    f11220d = new zzby(this.f11221a.zzaw().getMainLooper());
                }
                zzbyVar = f11220d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzbyVar;
    }
}

package z7;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.internal.measurement.zzph;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f11343a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f11344b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r2 f11345c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t2 f11346d;

    public s2(t2 t2Var) {
        this.f11346d = t2Var;
        a1 a1Var = (a1) t2Var.f159a;
        this.f11345c = new r2(this, a1Var, 0);
        a1Var.f11012y.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f11343a = jElapsedRealtime;
        this.f11344b = jElapsedRealtime;
    }

    public final boolean a(long j4, boolean z4, boolean z10) {
        t2 t2Var = this.f11346d;
        t2Var.c();
        t2Var.d();
        zzph.zzc();
        a1 a1Var = (a1) t2Var.f159a;
        if (!a1Var.f11005r.l(null, z.f11455e0)) {
            q0 q0Var = a1Var.f11006s;
            a1.d(q0Var);
            p0 p0Var = q0Var.f11316y;
            a1Var.f11012y.getClass();
            p0Var.b(System.currentTimeMillis());
        } else if (a1Var.b()) {
            q0 q0Var2 = a1Var.f11006s;
            a1.d(q0Var2);
            p0 p0Var2 = q0Var2.f11316y;
            a1Var.f11012y.getClass();
            p0Var2.b(System.currentTimeMillis());
        }
        long j10 = j4 - this.f11343a;
        if (!z4 && j10 < 1000) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11198y.c(Long.valueOf(j10), "Screen exposed for less than 1000 ms. Event not sent. time");
            return false;
        }
        if (!z10) {
            j10 = j4 - this.f11344b;
            this.f11344b = j4;
        }
        i0 i0Var2 = a1Var.f11007t;
        a1.f(i0Var2);
        i0Var2.f11198y.c(Long.valueOf(j10), "Recording user engagement, ms");
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j10);
        boolean z11 = !a1Var.f11005r.m();
        d2 d2Var = a1Var.f11013z;
        a1.e(d2Var);
        d3.p(d2Var.j(z11), bundle, true);
        if (!z10) {
            x1 x1Var = a1Var.A;
            a1.e(x1Var);
            x1Var.k("auto", "_e", bundle);
        }
        this.f11343a = j4;
        r2 r2Var = this.f11345c;
        r2Var.a();
        r2Var.c(3600000L);
        return true;
    }
}

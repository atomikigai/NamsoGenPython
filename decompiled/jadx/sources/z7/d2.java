package z7;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 extends m0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile b2 f11072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile b2 f11073d;
    public b2 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentHashMap f11074f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Activity f11075r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f11076s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile b2 f11077t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b2 f11078u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11079v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Object f11080w;

    public d2(a1 a1Var) {
        super(a1Var);
        this.f11080w = new Object();
        this.f11074f = new ConcurrentHashMap();
    }

    @Override // z7.m0
    public final boolean f() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00b7  */
    public final void g(b2 b2Var, b2 b2Var2, long j4, boolean z4, Bundle bundle) {
        long j10;
        boolean z10 = b2Var.e;
        a1 a1Var = (a1) this.f159a;
        c();
        boolean z11 = false;
        boolean z12 = (b2Var2 != null && b2Var2.f11030c == b2Var.f11030c && k1.e(b2Var2.f11029b, b2Var.f11029b) && k1.e(b2Var2.f11028a, b2Var.f11028a)) ? false : true;
        if (z4 && this.e != null) {
            z11 = true;
        }
        if (z12) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            d3.p(b2Var, bundle2, true);
            if (b2Var2 != null) {
                String str = b2Var2.f11028a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = b2Var2.f11029b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", b2Var2.f11030c);
            }
            if (z11) {
                t2 t2Var = a1Var.f11009v;
                a1.e(t2Var);
                s2 s2Var = t2Var.f11371f;
                long j11 = j4 - s2Var.f11344b;
                s2Var.f11344b = j4;
                if (j11 > 0) {
                    d3 d3Var = a1Var.f11010w;
                    a1.d(d3Var);
                    d3Var.n(bundle2, j11);
                }
            }
            if (!a1Var.f11005r.m()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != z10 ? "auto" : "app";
            a1Var.f11012y.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (z10) {
                long j12 = b2Var.f11032f;
                if (j12 == 0) {
                    j10 = jCurrentTimeMillis;
                } else {
                    j10 = j12;
                }
            } else {
                j10 = jCurrentTimeMillis;
            }
            x1 x1Var = a1Var.A;
            a1.e(x1Var);
            x1Var.l(bundle2, str3, "_vs", j10);
        }
        if (z11) {
            h(this.e, true, j4);
        }
        this.e = b2Var;
        if (z10) {
            this.f11078u = b2Var;
        }
        k2 k2VarN = a1Var.n();
        k2VarN.c();
        k2VarN.d();
        k2VarN.p(new y9.j(9, k2VarN, b2Var));
    }

    public final void h(b2 b2Var, boolean z4, long j4) {
        a1 a1Var = (a1) this.f159a;
        u uVarH = a1Var.h();
        a1Var.f11012y.getClass();
        uVarH.f(SystemClock.elapsedRealtime());
        boolean z10 = b2Var != null && b2Var.f11031d;
        t2 t2Var = a1Var.f11009v;
        a1.e(t2Var);
        if (!t2Var.f11371f.a(j4, z10, z4) || b2Var == null) {
            return;
        }
        b2Var.f11031d = false;
    }

    public final b2 j(boolean z4) {
        d();
        c();
        if (!z4) {
            return this.e;
        }
        b2 b2Var = this.e;
        return b2Var != null ? b2Var : this.f11078u;
    }

    public final String k(Class cls) {
        a1 a1Var = (a1) this.f159a;
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] strArrSplit = canonicalName.split("\\.");
        int length = strArrSplit.length;
        String str = length > 0 ? strArrSplit[length - 1] : "";
        int length2 = str.length();
        a1Var.getClass();
        return length2 > 100 ? str.substring(0, 100) : str;
    }

    public final void l(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!((a1) this.f159a).f11005r.m() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.f11074f.put(activity, new b2(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final b2 m(Activity activity) {
        com.google.android.gms.common.internal.i0.i(activity);
        b2 b2Var = (b2) this.f11074f.get(activity);
        if (b2Var == null) {
            String strK = k(activity.getClass());
            d3 d3Var = ((a1) this.f159a).f11010w;
            a1.d(d3Var);
            b2 b2Var2 = new b2(null, strK, d3Var.e0());
            this.f11074f.put(activity, b2Var2);
            b2Var = b2Var2;
        }
        return this.f11077t != null ? this.f11077t : b2Var;
    }

    public final void n(Activity activity, b2 b2Var, boolean z4) {
        b2 b2Var2;
        b2 b2Var3 = this.f11072c == null ? this.f11073d : this.f11072c;
        if (b2Var.f11029b == null) {
            b2Var2 = new b2(b2Var.f11028a, activity != null ? k(activity.getClass()) : null, b2Var.f11030c, b2Var.e, b2Var.f11032f);
        } else {
            b2Var2 = b2Var;
        }
        this.f11073d = this.f11072c;
        this.f11072c = b2Var2;
        ((a1) this.f159a).f11012y.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        z0 z0Var = ((a1) this.f159a).f11008u;
        a1.f(z0Var);
        z0Var.l(new w1(this, b2Var2, b2Var3, jElapsedRealtime, z4));
    }
}

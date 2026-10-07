package z7;

import android.os.Bundle;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r.e f11373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r.e f11374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f11375d;

    public u(a1 a1Var) {
        super(a1Var);
        this.f11374c = new r.e(0);
        this.f11373b = new r.e(0);
    }

    public final void d(String str, long j4) {
        a1 a1Var = (a1) this.f159a;
        if (str == null || str.length() == 0) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.b("Ad unit id must be a non-empty string");
        } else {
            z0 z0Var = a1Var.f11008u;
            a1.f(z0Var);
            z0Var.l(new a(this, str, j4, 0));
        }
    }

    public final void e(String str, long j4) {
        a1 a1Var = (a1) this.f159a;
        if (str == null || str.length() == 0) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11190f.b("Ad unit id must be a non-empty string");
        } else {
            z0 z0Var = a1Var.f11008u;
            a1.f(z0Var);
            z0Var.l(new a(this, str, j4, 1));
        }
    }

    public final void f(long j4) {
        d2 d2Var = ((a1) this.f159a).f11013z;
        a1.e(d2Var);
        b2 b2VarJ = d2Var.j(false);
        r.e eVar = this.f11373b;
        for (String str : (r.b) eVar.keySet()) {
            h(str, j4 - ((Long) eVar.get(str)).longValue(), b2VarJ);
        }
        if (!eVar.isEmpty()) {
            g(j4 - this.f11375d, b2VarJ);
        }
        j(j4);
    }

    public final void g(long j4, b2 b2Var) {
        a1 a1Var = (a1) this.f159a;
        if (b2Var == null) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11198y.b("Not logging ad exposure. No active activity");
        } else if (j4 < 1000) {
            i0 i0Var2 = a1Var.f11007t;
            a1.f(i0Var2);
            i0Var2.f11198y.c(Long.valueOf(j4), "Not logging ad exposure. Less than 1000 ms. exposure");
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j4);
            d3.p(b2Var, bundle, true);
            x1 x1Var = a1Var.A;
            a1.e(x1Var);
            x1Var.k("am", "_xa", bundle);
        }
    }

    public final void h(String str, long j4, b2 b2Var) {
        a1 a1Var = (a1) this.f159a;
        if (b2Var == null) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11198y.b("Not logging ad unit exposure. No active activity");
        } else {
            if (j4 < 1000) {
                i0 i0Var2 = a1Var.f11007t;
                a1.f(i0Var2);
                i0Var2.f11198y.c(Long.valueOf(j4), "Not logging ad unit exposure. Less than 1000 ms. exposure");
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j4);
            d3.p(b2Var, bundle, true);
            x1 x1Var = a1Var.A;
            a1.e(x1Var);
            x1Var.k("am", "_xu", bundle);
        }
    }

    public final void j(long j4) {
        r.e eVar = this.f11373b;
        Iterator it = ((r.b) eVar.keySet()).iterator();
        while (it.hasNext()) {
            eVar.put((String) it.next(), Long.valueOf(j4));
        }
        if (eVar.isEmpty()) {
            return;
        }
        this.f11375d = j4;
    }
}

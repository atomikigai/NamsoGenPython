package z7;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {
    public long A;
    public long B;
    public long C;
    public long D;
    public String E;
    public boolean F;
    public long G;
    public long H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a1 f11154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f11156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f11157d;
    public String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f11158f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f11159g;
    public long h;
    public long i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f11160j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f11161k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f11162l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f11163m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f11164n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f11165o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f11166p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f11167q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Boolean f11168r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f11169s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ArrayList f11170t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f11171u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f11172v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f11173w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f11174x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f11175y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f11176z;

    public h1(a1 a1Var, String str) {
        com.google.android.gms.common.internal.i0.i(a1Var);
        com.google.android.gms.common.internal.i0.e(str);
        this.f11154a = a1Var;
        this.f11155b = str;
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.c();
    }

    public final void A(List list) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        if (k1.d(this.f11170t, list)) {
            return;
        }
        this.F = true;
        this.f11170t = list != null ? new ArrayList(list) : null;
    }

    public final void B(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.f11174x != j4;
        this.f11174x = j4;
    }

    public final void C(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.f11173w != j4;
        this.f11173w = j4;
    }

    public final boolean D() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        return this.f11166p;
    }

    public final boolean E() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        return this.f11172v;
    }

    public final long F() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        return this.f11161k;
    }

    public final long G() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        return this.f11169s;
    }

    public final String H() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        return this.f11167q;
    }

    public final String I() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        String str = this.E;
        u(null);
        return str;
    }

    public final String J() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        return this.f11155b;
    }

    public final String K() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        return this.f11156c;
    }

    public final String L() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        return this.f11160j;
    }

    public final String M() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        return this.f11158f;
    }

    public final String a() {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        return this.f11157d;
    }

    public final void b() {
        a1 a1Var = this.f11154a;
        z0 z0Var = a1Var.f11008u;
        a1.f(z0Var);
        z0Var.c();
        long j4 = this.f11159g + 1;
        if (j4 > 2147483647L) {
            i0 i0Var = a1Var.f11007t;
            a1.f(i0Var);
            i0Var.f11193t.c(i0.k(this.f11155b), "Bundle index overflow. appId");
            j4 = 0;
        }
        this.F = true;
        this.f11159g = j4;
    }

    public final void c(String str) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.F |= true ^ k1.d(this.f11167q, str);
        this.f11167q = str;
    }

    public final void d(String str) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= !k1.d(this.f11156c, str);
        this.f11156c = str;
    }

    public final void e(String str) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= !k1.d(this.f11162l, str);
        this.f11162l = str;
    }

    public final void f(String str) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= !k1.d(this.f11160j, str);
        this.f11160j = str;
    }

    public final void g(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.f11161k != j4;
        this.f11161k = j4;
    }

    public final void h(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.G != j4;
        this.G = j4;
    }

    public final void i(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.B != j4;
        this.B = j4;
    }

    public final void j(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.C != j4;
        this.C = j4;
    }

    public final void k(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.A != j4;
        this.A = j4;
    }

    public final void l(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.f11176z != j4;
        this.f11176z = j4;
    }

    public final void m(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.D != j4;
        this.D = j4;
    }

    public final void n(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.f11175y != j4;
        this.f11175y = j4;
    }

    public final void o(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.f11164n != j4;
        this.f11164n = j4;
    }

    public final void p(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.f11169s != j4;
        this.f11169s = j4;
    }

    public final void q(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.H != j4;
        this.H = j4;
    }

    public final void r(String str) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= !k1.d(this.f11158f, str);
        this.f11158f = str;
    }

    public final void s(String str) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.F |= true ^ k1.d(this.f11157d, str);
        this.f11157d = str;
    }

    public final void t(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.f11163m != j4;
        this.f11163m = j4;
    }

    public final void u(String str) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= !k1.d(this.E, str);
        this.E = str;
    }

    public final void v(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.i != j4;
        this.i = j4;
    }

    public final void w(long j4) {
        com.google.android.gms.common.internal.i0.b(j4 >= 0);
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.f11159g != j4;
        this.f11159g = j4;
    }

    public final void x(long j4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.h != j4;
        this.h = j4;
    }

    public final void y(boolean z4) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= this.f11165o != z4;
        this.f11165o = z4;
    }

    public final void z(String str) {
        z0 z0Var = this.f11154a.f11008u;
        a1.f(z0Var);
        z0Var.c();
        this.F |= !k1.d(this.e, str);
        this.e = str;
    }
}

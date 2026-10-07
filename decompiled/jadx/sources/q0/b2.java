package q0;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class b2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d2 f7883b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f7884a;

    static {
        v1 t1Var;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            t1Var = new u1();
        } else {
            t1Var = i >= 29 ? new t1() : new r1();
        }
        f7883b = t1Var.b().f7892a.a().f7892a.b().f7892a.c();
    }

    public b2(d2 d2Var) {
        this.f7884a = d2Var;
    }

    public d2 a() {
        return this.f7884a;
    }

    public d2 b() {
        return this.f7884a;
    }

    public d2 c() {
        return this.f7884a;
    }

    public k e() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b2)) {
            return false;
        }
        b2 b2Var = (b2) obj;
        return n() == b2Var.n() && m() == b2Var.m() && p0.b.a(j(), b2Var.j()) && p0.b.a(h(), b2Var.h()) && p0.b.a(e(), b2Var.e());
    }

    public h0.c f(int i) {
        return h0.c.e;
    }

    public h0.c g() {
        return j();
    }

    public h0.c h() {
        return h0.c.e;
    }

    public int hashCode() {
        return p0.b.b(Boolean.valueOf(n()), Boolean.valueOf(m()), j(), h(), e());
    }

    public h0.c i() {
        return j();
    }

    public h0.c j() {
        return h0.c.e;
    }

    public h0.c k() {
        return j();
    }

    public d2 l(int i, int i10, int i11, int i12) {
        return f7883b;
    }

    public boolean m() {
        return false;
    }

    public boolean n() {
        return false;
    }

    public void d(View view) {
    }

    public void o(h0.c[] cVarArr) {
    }

    public void p(d2 d2Var) {
    }

    public void q(h0.c cVar) {
    }
}

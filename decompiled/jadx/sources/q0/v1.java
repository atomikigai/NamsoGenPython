package q0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d2 f7951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h0.c[] f7952b;

    public v1() {
        this(new d2());
    }

    public final void a() {
        h0.c[] cVarArr = this.f7952b;
        if (cVarArr != null) {
            h0.c cVarF = cVarArr[0];
            h0.c cVarF2 = cVarArr[1];
            d2 d2Var = this.f7951a;
            if (cVarF2 == null) {
                cVarF2 = d2Var.f7892a.f(2);
            }
            if (cVarF == null) {
                cVarF = d2Var.f7892a.f(1);
            }
            g(h0.c.a(cVarF, cVarF2));
            h0.c cVar = this.f7952b[jd.l.m(16)];
            if (cVar != null) {
                f(cVar);
            }
            h0.c cVar2 = this.f7952b[jd.l.m(32)];
            if (cVar2 != null) {
                d(cVar2);
            }
            h0.c cVar3 = this.f7952b[jd.l.m(64)];
            if (cVar3 != null) {
                h(cVar3);
            }
        }
    }

    public abstract d2 b();

    public void c(int i, h0.c cVar) {
        if (this.f7952b == null) {
            this.f7952b = new h0.c[9];
        }
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((i & i10) != 0) {
                this.f7952b[jd.l.m(i10)] = cVar;
            }
        }
    }

    public abstract void e(h0.c cVar);

    public abstract void g(h0.c cVar);

    public v1(d2 d2Var) {
        this.f7951a = d2Var;
    }

    public void d(h0.c cVar) {
    }

    public void f(h0.c cVar) {
    }

    public void h(h0.c cVar) {
    }
}

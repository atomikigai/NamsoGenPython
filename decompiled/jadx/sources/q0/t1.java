package q0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class t1 extends v1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f7941c;

    public t1() {
        this.f7941c = s1.a();
    }

    @Override // q0.v1
    public d2 b() {
        a();
        d2 d2VarG = d2.g(null, this.f7941c.build());
        d2VarG.f7892a.o(this.f7952b);
        return d2VarG;
    }

    @Override // q0.v1
    public void d(h0.c cVar) {
        this.f7941c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // q0.v1
    public void e(h0.c cVar) {
        this.f7941c.setStableInsets(cVar.d());
    }

    @Override // q0.v1
    public void f(h0.c cVar) {
        this.f7941c.setSystemGestureInsets(cVar.d());
    }

    @Override // q0.v1
    public void g(h0.c cVar) {
        this.f7941c.setSystemWindowInsets(cVar.d());
    }

    @Override // q0.v1
    public void h(h0.c cVar) {
        this.f7941c.setTappableElementInsets(cVar.d());
    }

    public t1(d2 d2Var) {
        WindowInsets.Builder builderA;
        super(d2Var);
        WindowInsets windowInsetsF = d2Var.f();
        if (windowInsetsF != null) {
            builderA = s1.b(windowInsetsF);
        } else {
            builderA = s1.a();
        }
        this.f7941c = builderA;
    }
}

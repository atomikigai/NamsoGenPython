package q0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class x1 extends w1 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public h0.c f7963m;

    public x1(d2 d2Var, WindowInsets windowInsets) {
        super(d2Var, windowInsets);
        this.f7963m = null;
    }

    @Override // q0.b2
    public d2 b() {
        return d2.g(null, this.f7959c.consumeStableInsets());
    }

    @Override // q0.b2
    public d2 c() {
        return d2.g(null, this.f7959c.consumeSystemWindowInsets());
    }

    @Override // q0.b2
    public final h0.c h() {
        if (this.f7963m == null) {
            WindowInsets windowInsets = this.f7959c;
            this.f7963m = h0.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f7963m;
    }

    @Override // q0.b2
    public boolean m() {
        return this.f7959c.isConsumed();
    }

    @Override // q0.b2
    public void q(h0.c cVar) {
        this.f7963m = cVar;
    }
}

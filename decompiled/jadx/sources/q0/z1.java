package q0;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class z1 extends y1 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public h0.c f7972n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h0.c f7973o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public h0.c f7974p;

    public z1(d2 d2Var, WindowInsets windowInsets) {
        super(d2Var, windowInsets);
        this.f7972n = null;
        this.f7973o = null;
        this.f7974p = null;
    }

    @Override // q0.b2
    public h0.c g() {
        if (this.f7973o == null) {
            this.f7973o = h0.c.c(this.f7959c.getMandatorySystemGestureInsets());
        }
        return this.f7973o;
    }

    @Override // q0.b2
    public h0.c i() {
        if (this.f7972n == null) {
            this.f7972n = h0.c.c(this.f7959c.getSystemGestureInsets());
        }
        return this.f7972n;
    }

    @Override // q0.b2
    public h0.c k() {
        if (this.f7974p == null) {
            this.f7974p = h0.c.c(this.f7959c.getTappableElementInsets());
        }
        return this.f7974p;
    }

    @Override // q0.w1, q0.b2
    public d2 l(int i, int i10, int i11, int i12) {
        return d2.g(null, this.f7959c.inset(i, i10, i11, i12));
    }

    @Override // q0.x1, q0.b2
    public void q(h0.c cVar) {
    }
}

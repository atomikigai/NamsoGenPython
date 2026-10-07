package q0;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends o1 {
    public final WindowInsetsAnimation e;

    public n1(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static h0.c e(WindowInsetsAnimation.Bounds bounds) {
        return h0.c.c(bounds.getUpperBound());
    }

    public static h0.c f(WindowInsetsAnimation.Bounds bounds) {
        return h0.c.c(bounds.getLowerBound());
    }

    public static void g(View view, gb.n nVar) {
        view.setWindowInsetsAnimationCallback(new m1(nVar));
    }

    @Override // q0.o1
    public final long a() {
        return this.e.getDurationMillis();
    }

    @Override // q0.o1
    public final float b() {
        return this.e.getInterpolatedFraction();
    }

    @Override // q0.o1
    public final int c() {
        return this.e.getTypeMask();
    }

    @Override // q0.o1
    public final void d(float f10) {
        this.e.setFraction(f10);
    }
}

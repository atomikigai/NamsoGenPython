package androidx.emoji2.text;

import android.graphics.Rect;
import android.view.View;
import x1.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f767c;

    public g(int i, String str, String str2) {
        this.f765a = i;
        this.f766b = str;
        this.f767c = str2;
    }

    public static g b(h0 h0Var, int i) {
        if (i == 0) {
            return new x1.u(h0Var, 0);
        }
        if (i == 1) {
            return new x1.u(h0Var, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    public abstract void a(g2.a aVar);

    public abstract void c(g2.a aVar);

    public abstract int d(View view);

    public abstract int e(View view);

    public abstract int f(View view);

    public abstract int g(View view);

    public abstract int h();

    public abstract int i();

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n();

    public abstract int o(View view);

    public abstract int p(View view);

    public abstract void q(int i);

    public abstract void r(g2.a aVar);

    public abstract void s(g2.a aVar);

    public abstract void t(g2.a aVar);

    public abstract void u(g2.a aVar);

    public abstract y1.w v(g2.a aVar);

    public g(h0 h0Var) {
        this.f765a = Integer.MIN_VALUE;
        this.f767c = new Rect();
        this.f766b = h0Var;
    }

    public g(k kVar) {
        this.f765a = 0;
        this.f767c = new d();
        this.f766b = kVar;
    }
}

package q0;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d2 f7891b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b2 f7892a;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f7891b = a2.f7881q;
        } else {
            f7891b = b2.f7883b;
        }
    }

    public d2(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f7892a = new a2(this, windowInsets);
            return;
        }
        if (i >= 29) {
            this.f7892a = new z1(this, windowInsets);
        } else if (i >= 28) {
            this.f7892a = new y1(this, windowInsets);
        } else {
            this.f7892a = new x1(this, windowInsets);
        }
    }

    public static h0.c e(h0.c cVar, int i, int i10, int i11, int i12) {
        int iMax = Math.max(0, cVar.f4545a - i);
        int iMax2 = Math.max(0, cVar.f4546b - i10);
        int iMax3 = Math.max(0, cVar.f4547c - i11);
        int iMax4 = Math.max(0, cVar.f4548d - i12);
        return (iMax == i && iMax2 == i10 && iMax3 == i11 && iMax4 == i12) ? cVar : h0.c.b(iMax, iMax2, iMax3, iMax4);
    }

    public static d2 g(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        d2 d2Var = new d2(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = v0.f7946a;
            if (g0.b(view)) {
                d2 d2VarA = k0.a(view);
                b2 b2Var = d2Var.f7892a;
                b2Var.p(d2VarA);
                b2Var.d(view.getRootView());
            }
        }
        return d2Var;
    }

    public final int a() {
        return this.f7892a.j().f4548d;
    }

    public final int b() {
        return this.f7892a.j().f4545a;
    }

    public final int c() {
        return this.f7892a.j().f4547c;
    }

    public final int d() {
        return this.f7892a.j().f4546b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d2) {
            return p0.b.a(this.f7892a, ((d2) obj).f7892a);
        }
        return false;
    }

    public final WindowInsets f() {
        b2 b2Var = this.f7892a;
        if (b2Var instanceof w1) {
            return ((w1) b2Var).f7959c;
        }
        return null;
    }

    public final int hashCode() {
        b2 b2Var = this.f7892a;
        if (b2Var == null) {
            return 0;
        }
        return b2Var.hashCode();
    }

    public d2() {
        this.f7892a = new b2(this);
    }
}

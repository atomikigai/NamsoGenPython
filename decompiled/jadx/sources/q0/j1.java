package q0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j1 implements View.OnApplyWindowInsetsListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gb.n f7912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d2 f7913b;

    public j1(View view, gb.n nVar) {
        d2 d2VarB;
        this.f7912a = nVar;
        WeakHashMap weakHashMap = v0.f7946a;
        d2 d2VarA = k0.a(view);
        if (d2VarA != null) {
            int i = Build.VERSION.SDK_INT;
            d2VarB = (i >= 30 ? new u1(d2VarA) : i >= 29 ? new t1(d2VarA) : new r1(d2VarA)).b();
        } else {
            d2VarB = null;
        }
        this.f7913b = d2VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        if (!view.isLaidOut()) {
            this.f7913b = d2.g(view, windowInsets);
            return k1.i(view, windowInsets);
        }
        d2 d2VarG = d2.g(view, windowInsets);
        b2 b2Var = d2VarG.f7892a;
        if (this.f7913b == null) {
            WeakHashMap weakHashMap = v0.f7946a;
            this.f7913b = k0.a(view);
        }
        if (this.f7913b == null) {
            this.f7913b = d2VarG;
            return k1.i(view, windowInsets);
        }
        gb.n nVarJ = k1.j(view);
        if (nVarJ != null && Objects.equals((WindowInsets) nVarJ.f4483c, windowInsets)) {
            return k1.i(view, windowInsets);
        }
        d2 d2Var = this.f7913b;
        int i = 0;
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if (!b2Var.f(i10).equals(d2Var.f7892a.f(i10))) {
                i |= i10;
            }
        }
        if (i == 0) {
            return k1.i(view, windowInsets);
        }
        d2 d2Var2 = this.f7913b;
        p1 p1Var = new p1(i, (i & 8) != 0 ? b2Var.f(8).f4548d > d2Var2.f7892a.f(8).f4548d ? k1.e : k1.f7915f : k1.f7916g, 160L);
        p1Var.f7929a.d(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(p1Var.f7929a.a());
        h0.c cVarF = b2Var.f(i);
        h0.c cVarF2 = d2Var2.f7892a.f(i);
        int iMin = Math.min(cVarF.f4545a, cVarF2.f4545a);
        int i11 = cVarF.f4546b;
        int i12 = cVarF2.f4546b;
        int iMin2 = Math.min(i11, i12);
        int i13 = cVarF.f4547c;
        int i14 = cVarF2.f4547c;
        int iMin3 = Math.min(i13, i14);
        int i15 = cVarF.f4548d;
        int i16 = i;
        int i17 = cVarF2.f4548d;
        h6.o0 o0Var = new h6.o0(25, h0.c.b(iMin, iMin2, iMin3, Math.min(i15, i17)), h0.c.b(Math.max(cVarF.f4545a, cVarF2.f4545a), Math.max(i11, i12), Math.max(i13, i14), Math.max(i15, i17)));
        k1.f(view, windowInsets, false);
        duration.addUpdateListener(new i1(p1Var, d2VarG, d2Var2, i16, view));
        duration.addListener(new m2.j(p1Var, view, 2));
        w.a(view, new b3.b(view, p1Var, o0Var, duration));
        this.f7913b = d2VarG;
        return k1.i(view, windowInsets);
    }
}

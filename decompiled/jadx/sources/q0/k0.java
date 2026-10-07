package q0;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {
    public static d2 a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        d2 d2VarG = d2.g(null, rootWindowInsets);
        b2 b2Var = d2VarG.f7892a;
        b2Var.p(d2VarG);
        b2Var.d(view.getRootView());
        return d2VarG;
    }

    public static int b(View view) {
        return view.getScrollIndicators();
    }

    public static void c(View view, int i) {
        view.setScrollIndicators(i);
    }

    public static void d(View view, int i, int i10) {
        view.setScrollIndicators(i, i10);
    }
}

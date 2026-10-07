package q0;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.PathInterpolator;
import app.namso_gen.spacehowen.R;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends o1 {
    public static final PathInterpolator e = new PathInterpolator(0.0f, 1.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final j1.a f7915f = new j1.a(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final DecelerateInterpolator f7916g = new DecelerateInterpolator();

    public static void e(View view) {
        gb.n nVarJ = j(view);
        if (nVarJ != null) {
            ((View) nVarJ.f4484d).setTranslationY(0.0f);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                e(viewGroup.getChildAt(i));
            }
        }
    }

    public static void f(View view, WindowInsets windowInsets, boolean z4) {
        gb.n nVarJ = j(view);
        if (nVarJ != null) {
            nVarJ.f4483c = windowInsets;
            if (!z4) {
                View view2 = (View) nVarJ.f4484d;
                int[] iArr = (int[]) nVarJ.e;
                view2.getLocationOnScreen(iArr);
                z4 = true;
                nVarJ.f4481a = iArr[1];
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                f(viewGroup.getChildAt(i), windowInsets, z4);
            }
        }
    }

    public static void g(View view, d2 d2Var, List list) {
        gb.n nVarJ = j(view);
        if (nVarJ != null) {
            nVarJ.e(d2Var, list);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), d2Var, list);
            }
        }
    }

    public static void h(View view, h6.o0 o0Var) {
        gb.n nVarJ = j(view);
        if (nVarJ != null) {
            View view2 = (View) nVarJ.f4484d;
            int[] iArr = (int[]) nVarJ.e;
            view2.getLocationOnScreen(iArr);
            int i = nVarJ.f4481a - iArr[1];
            nVarJ.f4482b = i;
            view2.setTranslationY(i);
            return;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                h(viewGroup.getChildAt(i10), o0Var);
            }
        }
    }

    public static WindowInsets i(View view, WindowInsets windowInsets) {
        return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
    }

    public static gb.n j(View view) {
        Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
        if (tag instanceof j1) {
            return ((j1) tag).f7912a;
        }
        return null;
    }
}

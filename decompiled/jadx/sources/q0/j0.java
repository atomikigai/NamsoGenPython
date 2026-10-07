package q0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import app.namso_gen.spacehowen.R;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j0 {
    public static void a(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static d2 b(View view, d2 d2Var, Rect rect) {
        WindowInsets windowInsetsF = d2Var.f();
        if (windowInsetsF != null) {
            return d2.g(view, view.computeSystemWindowInsets(windowInsetsF, rect));
        }
        rect.setEmpty();
        return d2Var;
    }

    public static boolean c(View view, float f10, float f11, boolean z4) {
        return view.dispatchNestedFling(f10, f11, z4);
    }

    public static boolean d(View view, float f10, float f11) {
        return view.dispatchNestedPreFling(f10, f11);
    }

    public static boolean e(View view, int i, int i10, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i10, iArr, iArr2);
    }

    public static boolean f(View view, int i, int i10, int i11, int i12, int[] iArr) {
        return view.dispatchNestedScroll(i, i10, i11, i12, iArr);
    }

    public static ColorStateList g(View view) {
        return view.getBackgroundTintList();
    }

    public static PorterDuff.Mode h(View view) {
        return view.getBackgroundTintMode();
    }

    public static float i(View view) {
        return view.getElevation();
    }

    public static d2 j(View view) {
        v1 t1Var;
        if (q1.f7933d && view.isAttachedToWindow()) {
            try {
                Object obj = q1.f7930a.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) q1.f7931b.get(obj);
                    Rect rect2 = (Rect) q1.f7932c.get(obj);
                    if (rect != null && rect2 != null) {
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 30) {
                            t1Var = new u1();
                        } else {
                            t1Var = i >= 29 ? new t1() : new r1();
                        }
                        t1Var.e(h0.c.b(rect.left, rect.top, rect.right, rect.bottom));
                        t1Var.g(h0.c.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        d2 d2VarB = t1Var.b();
                        d2VarB.f7892a.p(d2VarB);
                        d2VarB.f7892a.d(view.getRootView());
                        return d2VarB;
                    }
                }
            } catch (IllegalAccessException e) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
            }
        }
        return null;
    }

    public static String k(View view) {
        return view.getTransitionName();
    }

    public static float l(View view) {
        return view.getTranslationZ();
    }

    public static float m(View view) {
        return view.getZ();
    }

    public static boolean n(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean o(View view) {
        return view.isImportantForAccessibility();
    }

    public static boolean p(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static void q(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void r(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }

    public static void s(View view, float f10) {
        view.setElevation(f10);
    }

    public static void t(View view, boolean z4) {
        view.setNestedScrollingEnabled(z4);
    }

    public static void u(View view, t tVar) {
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(R.id.tag_on_apply_window_listener, tVar);
        }
        if (tVar == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new i0(view, tVar));
        }
    }

    public static void v(View view, String str) {
        view.setTransitionName(str);
    }

    public static void w(View view, float f10) {
        view.setTranslationZ(f10);
    }

    public static void x(View view, float f10) {
        view.setZ(f10);
    }

    public static boolean y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static void z(View view) {
        view.stopNestedScroll();
    }
}

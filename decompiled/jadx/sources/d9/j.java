package d9;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.namso_gen.spacehowen.R;
import com.google.android.material.snackbar.SnackbarContentLayout;
import gb.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends h {
    public static final int[] B = {R.attr.snackbarButtonStyle, R.attr.snackbarTextViewStyle};
    public final AccessibilityManager A;

    public j(Context context, ViewGroup viewGroup, SnackbarContentLayout snackbarContentLayout, SnackbarContentLayout snackbarContentLayout2) {
        super(context, viewGroup, snackbarContentLayout, snackbarContentLayout2);
        this.A = (AccessibilityManager) viewGroup.getContext().getSystemService("accessibility");
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:31:0x002c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x002a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:? A[LOOP:0: B:3:0x0002->B:35:?, LOOP_END, SYNTHETIC] */
    public static j g(View view, String str) {
        ViewGroup viewGroup;
        Object parent;
        ViewGroup viewGroup2 = null;
        while (true) {
            if (view instanceof CoordinatorLayout) {
                viewGroup = (ViewGroup) view;
                break;
            }
            if (!(view instanceof FrameLayout)) {
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            } else {
                if (view.getId() == 16908290) {
                    viewGroup = (ViewGroup) view;
                    break;
                }
                viewGroup2 = (ViewGroup) view;
                if (view != null) {
                    parent = view.getParent();
                    if (parent instanceof View) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                }
                if (view == null) {
                    viewGroup = viewGroup2;
                    break;
                }
            }
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
        Context context = viewGroup.getContext();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(B);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, -1);
        typedArrayObtainStyledAttributes.recycle();
        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) layoutInflaterFrom.inflate((resourceId == -1 || resourceId2 == -1) ? R.layout.design_layout_snackbar_include : R.layout.mtrl_layout_snackbar_include, viewGroup, false);
        j jVar = new j(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
        ((SnackbarContentLayout) jVar.i.getChildAt(0)).getMessageView().setText(str);
        jVar.f3067k = -1;
        return jVar;
    }

    public final void h() {
        r rVarH = r.h();
        int recommendedTimeoutMillis = this.f3067k;
        if (recommendedTimeoutMillis == -2) {
            recommendedTimeoutMillis = -2;
        } else if (Build.VERSION.SDK_INT >= 29) {
            recommendedTimeoutMillis = this.A.getRecommendedTimeoutMillis(recommendedTimeoutMillis, 3);
        }
        e eVar = this.f3076t;
        synchronized (rVarH.f4493a) {
            try {
                if (rVarH.k(eVar)) {
                    l lVar = (l) rVarH.f4495c;
                    lVar.f3080b = recommendedTimeoutMillis;
                    ((Handler) rVarH.f4494b).removeCallbacksAndMessages(lVar);
                    rVarH.s((l) rVarH.f4495c);
                    return;
                }
                l lVar2 = (l) rVarH.f4496d;
                if (lVar2 != null && lVar2.f3079a.get() == eVar) {
                    ((l) rVarH.f4496d).f3080b = recommendedTimeoutMillis;
                } else {
                    rVarH.f4496d = new l(recommendedTimeoutMillis, eVar);
                }
                l lVar3 = (l) rVarH.f4495c;
                if (lVar3 == null || !rVarH.c(lVar3, 4)) {
                    rVarH.f4495c = null;
                    rVarH.t();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

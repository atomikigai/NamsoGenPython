package q0;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 {
    public static boolean a(ViewParent viewParent, View view, float f10, float f11, boolean z4) {
        return viewParent.onNestedFling(view, f10, f11, z4);
    }

    public static boolean b(ViewParent viewParent, View view, float f10, float f11) {
        return viewParent.onNestedPreFling(view, f10, f11);
    }

    public static void c(ViewParent viewParent, View view, int i, int i10, int[] iArr) {
        viewParent.onNestedPreScroll(view, i, i10, iArr);
    }

    public static void d(ViewParent viewParent, View view, int i, int i10, int i11, int i12) {
        viewParent.onNestedScroll(view, i, i10, i11, i12);
    }

    public static void e(ViewParent viewParent, View view, View view2, int i) {
        viewParent.onNestedScrollAccepted(view, view2, i);
    }

    public static boolean f(ViewParent viewParent, View view, View view2, int i) {
        return viewParent.onStartNestedScroll(view, view2, i);
    }

    public static void g(ViewParent viewParent, View view) {
        viewParent.onStopNestedScroll(view);
    }
}

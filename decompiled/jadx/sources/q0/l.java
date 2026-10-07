package q0;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {
    public static void a(int i, int i10, int i11, Rect rect, int i12, int i13, Rect rect2, int i14) {
        Gravity.apply(i, i10, i11, rect, i12, i13, rect2, i14);
    }

    public static void b(int i, int i10, int i11, Rect rect, Rect rect2, int i12) {
        Gravity.apply(i, i10, i11, rect, rect2, i12);
    }

    public static void c(int i, Rect rect, Rect rect2, int i10) {
        Gravity.applyDisplay(i, rect, rect2, i10);
    }
}

package m2;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class v extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f7029d = true;
    public static boolean e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f7030f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f7031g = true;

    @Override // fa.c1
    public void E(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.E(view, i);
        } else if (f7031g) {
            try {
                view.setTransitionVisibility(i);
            } catch (NoSuchMethodError unused) {
                f7031g = false;
            }
        }
    }

    public void J(View view, int i, int i10, int i11, int i12) {
        if (f7030f) {
            try {
                view.setLeftTopRightBottom(i, i10, i11, i12);
            } catch (NoSuchMethodError unused) {
                f7030f = false;
            }
        }
    }

    public void K(View view, Matrix matrix) {
        if (f7029d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                f7029d = false;
            }
        }
    }

    public void L(View view, Matrix matrix) {
        if (e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}

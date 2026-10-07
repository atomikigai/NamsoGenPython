package m2;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends v {
    @Override // m2.v, fa.c1
    public final void E(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // m2.u
    public final float H(View view) {
        return view.getTransitionAlpha();
    }

    @Override // m2.u
    public final void I(View view, float f10) {
        view.setTransitionAlpha(f10);
    }

    @Override // m2.v
    public final void J(View view, int i, int i10, int i11, int i12) {
        view.setLeftTopRightBottom(i, i10, i11, i12);
    }

    @Override // m2.v
    public final void K(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // m2.v
    public final void L(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}

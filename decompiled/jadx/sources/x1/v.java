package x1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends t {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final /* synthetic */ w f10218q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(w wVar, Context context) {
        super(context);
        this.f10218q = wVar;
    }

    @Override // x1.t
    public final float d(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }

    @Override // x1.t
    public final int e(int i) {
        return Math.min(100, super.e(i));
    }

    @Override // x1.t
    public final void h(View view, q0 q0Var) {
        w wVar = this.f10218q;
        int[] iArrB = wVar.b(wVar.f10225a.getLayoutManager(), view);
        int i = iArrB[0];
        int i10 = iArrB[1];
        int iCeil = (int) Math.ceil(((double) e(Math.max(Math.abs(i), Math.abs(i10)))) / 0.3356d);
        if (iCeil > 0) {
            q0Var.f10175a = i;
            q0Var.f10176b = i10;
            q0Var.f10177c = iCeil;
            q0Var.e = this.f10210j;
            q0Var.f10179f = true;
        }
    }
}

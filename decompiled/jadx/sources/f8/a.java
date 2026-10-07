package f8;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.b;
import com.google.android.material.datepicker.o;
import java.util.WeakHashMap;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f3648a;

    @Override // b0.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        r(coordinatorLayout, view, i);
        if (this.f3648a == null) {
            this.f3648a = new o(view);
        }
        o oVar = this.f3648a;
        View view2 = oVar.f2445a;
        oVar.f2446b = view2.getTop();
        oVar.f2447c = view2.getLeft();
        o oVar2 = this.f3648a;
        View view3 = oVar2.f2445a;
        int top = 0 - (view3.getTop() - oVar2.f2446b);
        WeakHashMap weakHashMap = v0.f7946a;
        view3.offsetTopAndBottom(top);
        view3.offsetLeftAndRight(0 - (view3.getLeft() - oVar2.f2447c));
        return true;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.q(view, i);
    }
}

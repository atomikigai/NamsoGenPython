package x1;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends q0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RecyclerView f10250d;
    public final x0 e;

    public y0(RecyclerView recyclerView) {
        this.f10250d = recyclerView;
        x0 x0Var = this.e;
        if (x0Var != null) {
            this.e = x0Var;
        } else {
            this.e = new x0(this);
        }
    }

    @Override // q0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f10250d.O()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().S(accessibilityEvent);
        }
    }

    @Override // q0.c
    public final void d(View view, r0.l lVar) {
        this.f7886a.onInitializeAccessibilityNodeInfo(view, lVar.f8119a);
        RecyclerView recyclerView = this.f10250d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return;
        }
        h0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f10083b;
        layoutManager.T(recyclerView2.f1135c, recyclerView2.f1155s0, lVar);
    }

    @Override // q0.c
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f10250d;
        if (recyclerView.O() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        h0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f10083b;
        return layoutManager.g0(recyclerView2.f1135c, recyclerView2.f1155s0, i, bundle);
    }
}

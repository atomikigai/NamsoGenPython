package x1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends q0.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f10248d;
    public final WeakHashMap e = new WeakHashMap();

    public x0(y0 y0Var) {
        this.f10248d = y0Var;
    }

    @Override // q0.c
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        q0.c cVar = (q0.c) this.e.get(view);
        return cVar != null ? cVar.a(view, accessibilityEvent) : this.f7886a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // q0.c
    public final a4.b b(View view) {
        q0.c cVar = (q0.c) this.e.get(view);
        return cVar != null ? cVar.b(view) : super.b(view);
    }

    @Override // q0.c
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        q0.c cVar = (q0.c) this.e.get(view);
        if (cVar != null) {
            cVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // q0.c
    public final void d(View view, r0.l lVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f8119a;
        y0 y0Var = this.f10248d;
        RecyclerView recyclerView = y0Var.f10250d;
        RecyclerView recyclerView2 = y0Var.f10250d;
        boolean zO = recyclerView.O();
        View.AccessibilityDelegate accessibilityDelegate = this.f7886a;
        if (zO || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().U(view, lVar);
        q0.c cVar = (q0.c) this.e.get(view);
        if (cVar != null) {
            cVar.d(view, lVar);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // q0.c
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        q0.c cVar = (q0.c) this.e.get(view);
        if (cVar != null) {
            cVar.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // q0.c
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        q0.c cVar = (q0.c) this.e.get(viewGroup);
        return cVar != null ? cVar.f(viewGroup, view, accessibilityEvent) : this.f7886a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // q0.c
    public final boolean g(View view, int i, Bundle bundle) {
        y0 y0Var = this.f10248d;
        RecyclerView recyclerView = y0Var.f10250d;
        RecyclerView recyclerView2 = y0Var.f10250d;
        if (recyclerView.O() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        q0.c cVar = (q0.c) this.e.get(view);
        if (cVar != null) {
            if (cVar.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        n0 n0Var = recyclerView2.getLayoutManager().f10083b.f1135c;
        return false;
    }

    @Override // q0.c
    public final void h(View view, int i) {
        q0.c cVar = (q0.c) this.e.get(view);
        if (cVar != null) {
            cVar.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // q0.c
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        q0.c cVar = (q0.c) this.e.get(view);
        if (cVar != null) {
            cVar.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}

package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b0.b;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.g0;
import q0.v0;
import s8.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class ExpandableBehavior extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2597a = 0;

    public ExpandableBehavior() {
    }

    @Override // b0.b
    public abstract boolean b(View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b0.b
    public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        Object obj = (a) view2;
        boolean z4 = ((FloatingActionButton) obj).f2486z.f6226a;
        if (z4) {
            int i = this.f2597a;
            if (i != 0 && i != 2) {
                return false;
            }
        } else if (this.f2597a != 1) {
            return false;
        }
        this.f2597a = z4 ? 1 : 2;
        r((View) obj, view, z4, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b0.b
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        a aVar;
        int i10;
        WeakHashMap weakHashMap = v0.f7946a;
        if (!g0.c(view)) {
            ArrayList arrayListJ = coordinatorLayout.j(view);
            int size = arrayListJ.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    aVar = null;
                    break;
                }
                View view2 = (View) arrayListJ.get(i11);
                if (b(view, view2)) {
                    aVar = (a) view2;
                    break;
                }
                i11++;
            }
            if (aVar != null) {
                boolean z4 = ((FloatingActionButton) aVar).f2486z.f6226a;
                if (!z4 ? this.f2597a == 1 : !((i10 = this.f2597a) != 0 && i10 != 2)) {
                    int i12 = z4 ? 1 : 2;
                    this.f2597a = i12;
                    view.getViewTreeObserver().addOnPreDrawListener(new j9.a(this, view, i12, aVar));
                }
            }
        }
        return false;
    }

    public abstract void r(View view, View view2, boolean z4, boolean z10);

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
    }
}

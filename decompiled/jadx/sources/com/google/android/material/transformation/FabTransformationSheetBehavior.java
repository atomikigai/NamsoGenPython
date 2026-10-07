package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.namso_gen.spacehowen.R;
import b0.e;
import h6.o0;
import java.util.HashMap;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;
import z9.c;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class FabTransformationSheetBehavior extends FabTransformationBehavior {
    public HashMap i;

    public FabTransformationSheetBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior, com.google.android.material.transformation.ExpandableBehavior
    public final void r(View view, View view2, boolean z4, boolean z10) {
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z4) {
                this.i = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                boolean z11 = (childAt.getLayoutParams() instanceof e) && (((e) childAt.getLayoutParams()).f1319a instanceof FabTransformationScrimBehavior);
                if (childAt != view2 && !z11) {
                    if (z4) {
                        this.i.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        WeakHashMap weakHashMap = v0.f7946a;
                        d0.s(childAt, 4);
                    } else {
                        HashMap map = this.i;
                        if (map != null && map.containsKey(childAt)) {
                            int iIntValue = ((Integer) this.i.get(childAt)).intValue();
                            WeakHashMap weakHashMap2 = v0.f7946a;
                            d0.s(childAt, iIntValue);
                        }
                    }
                }
            }
            if (!z4) {
                this.i = null;
            }
        }
        super.r(view, view2, z4, z10);
    }

    @Override // com.google.android.material.transformation.FabTransformationBehavior
    public final o0 y(Context context, boolean z4) {
        int i = z4 ? R.animator.mtrl_fab_transformation_sheet_expand_spec : R.animator.mtrl_fab_transformation_sheet_collapse_spec;
        o0 o0Var = new o0(1, false);
        o0Var.f5061b = e8.e.b(context, i);
        o0Var.f5062c = new c();
        return o0Var;
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

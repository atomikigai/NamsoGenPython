package com.google.android.material.snackbar;

import a4.b;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;
import d9.e;
import d9.g;
import gb.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior<View> {
    public final b i;

    public BaseTransientBottomBar$Behavior() {
        b bVar = new b(8);
        this.f2338f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        this.f2339g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        this.e = 0;
        this.i = bVar;
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, b0.b
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        b bVar = this.i;
        bVar.getClass();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                r.h().r((e) bVar.f113b);
            }
        } else if (coordinatorLayout.o(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            r.h().q((e) bVar.f113b);
        }
        return super.f(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean r(View view) {
        this.i.getClass();
        return view instanceof g;
    }
}

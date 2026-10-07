package com.google.android.material.behavior;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.v4.media.session.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.namso_gen.spacehowen.R;
import b0.b;
import g6.m;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2330c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TimeInterpolator f2331d;
    public TimeInterpolator e;
    public ViewPropertyAnimator h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f2328a = new LinkedHashSet();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2332f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f2333g = 2;

    public HideBottomViewOnScrollBehavior() {
    }

    @Override // b0.b
    public boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
        this.f2332f = view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).bottomMargin;
        this.f2329b = a.v(view.getContext(), R.attr.motionDurationLong2, 225);
        this.f2330c = a.v(view.getContext(), R.attr.motionDurationMedium4, 175);
        this.f2331d = a.w(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, e8.a.f3494d);
        this.e = a.w(view.getContext(), R.attr.motionEasingEmphasizedInterpolator, e8.a.f3493c);
        return false;
    }

    @Override // b0.b
    public final void k(CoordinatorLayout coordinatorLayout, View view, int i, int i10, int i11, int[] iArr) {
        LinkedHashSet linkedHashSet = this.f2328a;
        if (i > 0) {
            if (this.f2333g == 1) {
                return;
            }
            ViewPropertyAnimator viewPropertyAnimator = this.h;
            if (viewPropertyAnimator != null) {
                viewPropertyAnimator.cancel();
                view.clearAnimation();
            }
            this.f2333g = 1;
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                throw q1.a.g(it);
            }
            this.h = view.animate().translationY(this.f2332f).setInterpolator(this.e).setDuration(this.f2330c).setListener(new m(this, 2));
            return;
        }
        if (i >= 0 || this.f2333g == 2) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator2 = this.h;
        if (viewPropertyAnimator2 != null) {
            viewPropertyAnimator2.cancel();
            view.clearAnimation();
        }
        this.f2333g = 2;
        Iterator it2 = linkedHashSet.iterator();
        if (it2.hasNext()) {
            throw q1.a.g(it2);
        }
        this.h = view.animate().translationY(0).setInterpolator(this.f2331d).setDuration(this.f2329b).setListener(new m(this, 2));
    }

    @Override // b0.b
    public boolean o(View view, int i, int i10) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
    }
}

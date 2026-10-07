package com.google.android.material.datepicker;

import android.view.View;
import q0.d2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements q0.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f2445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2447c;

    public o(View view) {
        this.f2445a = view;
    }

    @Override // q0.t
    public d2 k(View view, d2 d2Var) {
        int i = d2Var.f7892a.f(7).f4546b;
        int i10 = this.f2446b;
        View view2 = this.f2445a;
        if (i10 >= 0) {
            view2.getLayoutParams().height = i10 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f2447c + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return d2Var;
    }

    public o(View view, int i, int i10) {
        this.f2446b = i;
        this.f2445a = view;
        this.f2447c = i10;
    }
}

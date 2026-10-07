package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q<S> extends w {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f2453g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public b f2454h0;

    @Override // androidx.fragment.app.s
    public final void C(Bundle bundle) {
        super.C(bundle);
        if (bundle == null) {
            bundle = this.f977f;
        }
        this.f2453g0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2454h0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(r(), this.f2453g0));
        throw null;
    }

    @Override // androidx.fragment.app.s
    public final void J(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2453g0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2454h0);
    }
}

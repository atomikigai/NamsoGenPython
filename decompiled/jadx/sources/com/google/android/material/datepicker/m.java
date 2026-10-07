package com.google.android.material.datepicker;

import android.R;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m<S> extends w {

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f2433g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public b f2434h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public r f2435i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public int f2436j0;
    public c k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public RecyclerView f2437l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public RecyclerView f2438m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public View f2439n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public View f2440o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public View f2441p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public View f2442q0;

    @Override // androidx.fragment.app.s
    public final void C(Bundle bundle) {
        super.C(bundle);
        if (bundle == null) {
            bundle = this.f977f;
        }
        this.f2433g0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("GRID_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2434h0 = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f2435i0 = (r) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.s
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i10;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(r(), this.f2433g0);
        this.k0 = new c(contextThemeWrapper);
        LayoutInflater layoutInflaterCloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        r rVar = this.f2434h0.f2409a;
        if (p.h0(contextThemeWrapper, R.attr.windowFullscreen)) {
            i = app.namso_gen.spacehowen.R.layout.mtrl_calendar_vertical;
            i10 = 1;
        } else {
            i = app.namso_gen.spacehowen.R.layout.mtrl_calendar_horizontal;
            i10 = 0;
        }
        View viewInflate = layoutInflaterCloneInContext.inflate(i, viewGroup, false);
        Resources resources = U().getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(app.namso_gen.spacehowen.R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(app.namso_gen.spacehowen.R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.mtrl_calendar_navigation_height);
        int dimensionPixelSize = resources.getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.mtrl_calendar_days_of_week_height);
        int i11 = s.f2461d;
        viewInflate.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(app.namso_gen.spacehowen.R.dimen.mtrl_calendar_month_vertical_padding) * (i11 - 1)) + (resources.getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.mtrl_calendar_day_height) * i11) + resources.getDimensionPixelOffset(app.namso_gen.spacehowen.R.dimen.mtrl_calendar_bottom_padding));
        GridView gridView = (GridView) viewInflate.findViewById(app.namso_gen.spacehowen.R.id.mtrl_calendar_days_of_week);
        v0.l(gridView, new g(0));
        int i12 = this.f2434h0.e;
        gridView.setAdapter((ListAdapter) (i12 > 0 ? new e(i12) : new e()));
        gridView.setNumColumns(rVar.f2458d);
        gridView.setEnabled(false);
        this.f2438m0 = (RecyclerView) viewInflate.findViewById(app.namso_gen.spacehowen.R.id.mtrl_calendar_months);
        this.f2438m0.setLayoutManager(new h(this, i10, i10));
        this.f2438m0.setTag("MONTHS_VIEW_GROUP_TAG");
        v vVar = new v(contextThemeWrapper, this.f2434h0, new ib.c(this, 10));
        this.f2438m0.setAdapter(vVar);
        int integer = contextThemeWrapper.getResources().getInteger(app.namso_gen.spacehowen.R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(app.namso_gen.spacehowen.R.id.mtrl_calendar_year_selector_frame);
        this.f2437l0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f2437l0.setLayoutManager(new GridLayoutManager(integer));
            this.f2437l0.setAdapter(new b0(this));
            RecyclerView recyclerView2 = this.f2437l0;
            i iVar = new i();
            z.c(null);
            z.c(null);
            recyclerView2.i(iVar);
        }
        if (viewInflate.findViewById(app.namso_gen.spacehowen.R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) viewInflate.findViewById(app.namso_gen.spacehowen.R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            v0.l(materialButton, new j(this, 0));
            View viewFindViewById = viewInflate.findViewById(app.namso_gen.spacehowen.R.id.month_navigation_previous);
            this.f2439n0 = viewFindViewById;
            viewFindViewById.setTag("NAVIGATION_PREV_TAG");
            View viewFindViewById2 = viewInflate.findViewById(app.namso_gen.spacehowen.R.id.month_navigation_next);
            this.f2440o0 = viewFindViewById2;
            viewFindViewById2.setTag("NAVIGATION_NEXT_TAG");
            this.f2441p0 = viewInflate.findViewById(app.namso_gen.spacehowen.R.id.mtrl_calendar_year_selector_frame);
            this.f2442q0 = viewInflate.findViewById(app.namso_gen.spacehowen.R.id.mtrl_calendar_day_selector_frame);
            c0(1);
            materialButton.setText(this.f2435i0.c());
            this.f2438m0.j(new k(this, vVar, materialButton));
            materialButton.setOnClickListener(new l(this, 0));
            this.f2440o0.setOnClickListener(new f(this, vVar, 1));
            this.f2439n0.setOnClickListener(new f(this, vVar, 0));
        }
        if (!p.h0(contextThemeWrapper, R.attr.windowFullscreen)) {
            new x1.w().a(this.f2438m0);
        }
        this.f2438m0.g0(vVar.f2469d.f2409a.d(this.f2435i0));
        v0.l(this.f2438m0, new g(1));
        return viewInflate;
    }

    @Override // androidx.fragment.app.s
    public final void J(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f2433g0);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f2434h0);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f2435i0);
    }

    public final void b0(r rVar) {
        v vVar = (v) this.f2438m0.getAdapter();
        int iD = vVar.f2469d.f2409a.d(rVar);
        int iD2 = iD - vVar.f2469d.f2409a.d(this.f2435i0);
        boolean z4 = Math.abs(iD2) > 3;
        boolean z10 = iD2 > 0;
        this.f2435i0 = rVar;
        if (z4 && z10) {
            this.f2438m0.g0(iD - 3);
            this.f2438m0.post(new androidx.emoji2.text.j(this, iD, 3));
        } else if (!z4) {
            this.f2438m0.post(new androidx.emoji2.text.j(this, iD, 3));
        } else {
            this.f2438m0.g0(iD + 3);
            this.f2438m0.post(new androidx.emoji2.text.j(this, iD, 3));
        }
    }

    public final void c0(int i) {
        this.f2436j0 = i;
        if (i == 2) {
            this.f2437l0.getLayoutManager().p0(this.f2435i0.f2457c - ((b0) this.f2437l0.getAdapter()).f2415d.f2434h0.f2409a.f2457c);
            this.f2441p0.setVisibility(0);
            this.f2442q0.setVisibility(8);
            this.f2439n0.setVisibility(8);
            this.f2440o0.setVisibility(8);
            return;
        }
        if (i == 1) {
            this.f2441p0.setVisibility(8);
            this.f2442q0.setVisibility(0);
            this.f2439n0.setVisibility(0);
            this.f2440o0.setVisibility(0);
            b0(this.f2435i0);
        }
    }
}

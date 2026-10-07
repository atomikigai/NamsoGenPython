package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import app.namso_gen.spacehowen.R;
import java.util.Calendar;
import x1.i0;
import x1.w0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends x1.z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2469d;
    public final ib.c e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2470f;

    public v(ContextThemeWrapper contextThemeWrapper, b bVar, ib.c cVar) {
        r rVar = bVar.f2409a;
        r rVar2 = bVar.f2410b;
        r rVar3 = bVar.f2412d;
        if (rVar.f2455a.compareTo(rVar3.f2455a) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (rVar3.f2455a.compareTo(rVar2.f2455a) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f2470f = (contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * s.f2461d) + (p.h0(contextThemeWrapper, android.R.attr.windowFullscreen) ? contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) : 0);
        this.f2469d = bVar;
        this.e = cVar;
        if (this.f10251a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.f10252b = true;
    }

    @Override // x1.z
    public final int a() {
        return this.f2469d.f2414r;
    }

    @Override // x1.z
    public final long b(int i) {
        Calendar calendarA = z.a(this.f2469d.f2409a.f2455a);
        calendarA.add(2, i);
        calendarA.set(5, 1);
        Calendar calendarA2 = z.a(calendarA);
        calendarA2.get(2);
        calendarA2.get(1);
        calendarA2.getMaximum(7);
        calendarA2.getActualMaximum(5);
        calendarA2.getTimeInMillis();
        return calendarA2.getTimeInMillis();
    }

    @Override // x1.z
    public final void e(w0 w0Var, int i) {
        u uVar = (u) w0Var;
        b bVar = this.f2469d;
        Calendar calendarA = z.a(bVar.f2409a.f2455a);
        calendarA.add(2, i);
        r rVar = new r(calendarA);
        uVar.f2467u.setText(rVar.c());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) uVar.f2468v.findViewById(R.id.month_grid);
        if (materialCalendarGridView.a() == null || !rVar.equals(materialCalendarGridView.a().f2462a)) {
            new s(rVar, bVar);
            throw null;
        }
        materialCalendarGridView.invalidate();
        materialCalendarGridView.a().getClass();
        throw null;
    }

    @Override // x1.z
    public final w0 f(ViewGroup viewGroup) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!p.h0(viewGroup.getContext(), android.R.attr.windowFullscreen)) {
            return new u(linearLayout, false);
        }
        linearLayout.setLayoutParams(new i0(-1, this.f2470f));
        return new u(linearLayout, true);
    }
}

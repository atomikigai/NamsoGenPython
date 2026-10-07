package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendarGridView f2465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ v f2466b;

    public t(v vVar, MaterialCalendarGridView materialCalendarGridView) {
        this.f2466b = vVar;
        this.f2465a = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j4) {
        MaterialCalendarGridView materialCalendarGridView = this.f2465a;
        s sVarA = materialCalendarGridView.a();
        if (i < sVarA.a() || i > sVarA.c()) {
            return;
        }
        if (materialCalendarGridView.a().getItem(i).longValue() >= ((m) this.f2466b.e.f5256b).f2434h0.f2411c.f2418a) {
            throw null;
        }
    }
}

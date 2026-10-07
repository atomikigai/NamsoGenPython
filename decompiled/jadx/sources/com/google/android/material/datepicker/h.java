package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import x1.s0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ m F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, int i, int i10) {
        super(i);
        this.F = mVar;
        this.E = i10;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(s0 s0Var, int[] iArr) {
        int i = this.E;
        m mVar = this.F;
        if (i == 0) {
            iArr[0] = mVar.f2438m0.getWidth();
            iArr[1] = mVar.f2438m0.getWidth();
        } else {
            iArr[0] = mVar.f2438m0.getHeight();
            iArr[1] = mVar.f2438m0.getHeight();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final void z0(RecyclerView recyclerView, int i) {
        x xVar = new x(recyclerView.getContext());
        xVar.f10204a = i;
        A0(xVar);
    }
}

package s2;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import x1.h0;
import x1.n0;
import x1.s0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(ViewPager2 viewPager2) {
        super(1);
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void C0(s0 s0Var, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.C0(s0Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // x1.h0
    public final void T(n0 n0Var, s0 s0Var, r0.l lVar) {
        super.T(n0Var, s0Var, lVar);
        this.E.E.getClass();
    }

    @Override // x1.h0
    public final void V(n0 n0Var, s0 s0Var, View view, r0.l lVar) {
        int iF;
        int iF2;
        ViewPager2 viewPager2 = (ViewPager2) this.E.E.f110d;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.f1213r.getClass();
            iF = h0.F(view);
        } else {
            iF = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.f1213r.getClass();
            iF2 = h0.F(view);
        } else {
            iF2 = 0;
        }
        lVar.j(r0.k.a(iF, 1, iF2, 1, false));
    }

    @Override // x1.h0
    public final boolean g0(n0 n0Var, s0 s0Var, int i, Bundle bundle) {
        this.E.E.getClass();
        return super.g0(n0Var, s0Var, i, bundle);
    }

    @Override // x1.h0
    public final boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z10) {
        return false;
    }
}

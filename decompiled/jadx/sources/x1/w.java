package x1;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class w extends j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RecyclerView f10225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f10226b = new z0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f10227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u f10228d;

    public static int c(View view, androidx.emoji2.text.g gVar) {
        return ((gVar.e(view) / 2) + gVar.g(view)) - ((gVar.n() / 2) + gVar.m());
    }

    public static View d(h0 h0Var, androidx.emoji2.text.g gVar) {
        int iV = h0Var.v();
        View view = null;
        if (iV == 0) {
            return null;
        }
        int iN = (gVar.n() / 2) + gVar.m();
        int i = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = h0Var.u(i10);
            int iAbs = Math.abs(((gVar.e(viewU) / 2) + gVar.g(viewU)) - iN);
            if (iAbs < i) {
                view = viewU;
                i = iAbs;
            }
        }
        return view;
    }

    public final void a(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f10225a;
        if (recyclerView2 == recyclerView) {
            return;
        }
        z0 z0Var = this.f10226b;
        if (recyclerView2 != null) {
            ArrayList arrayList = recyclerView2.f1159u0;
            if (arrayList != null) {
                arrayList.remove(z0Var);
            }
            this.f10225a.setOnFlingListener(null);
        }
        this.f10225a = recyclerView;
        if (recyclerView != null) {
            if (recyclerView.getOnFlingListener() != null) {
                throw new IllegalStateException("An instance of OnFlingListener already set.");
            }
            this.f10225a.j(z0Var);
            this.f10225a.setOnFlingListener(this);
            new Scroller(this.f10225a.getContext(), new DecelerateInterpolator());
            h();
        }
    }

    public final int[] b(h0 h0Var, View view) {
        int[] iArr = new int[2];
        if (h0Var.d()) {
            iArr[0] = c(view, f(h0Var));
        } else {
            iArr[0] = 0;
        }
        if (h0Var.e()) {
            iArr[1] = c(view, g(h0Var));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public View e(h0 h0Var) {
        if (h0Var.e()) {
            return d(h0Var, g(h0Var));
        }
        if (h0Var.d()) {
            return d(h0Var, f(h0Var));
        }
        return null;
    }

    public final androidx.emoji2.text.g f(h0 h0Var) {
        u uVar = this.f10228d;
        if (uVar == null || ((h0) uVar.f766b) != h0Var) {
            this.f10228d = new u(h0Var, 0);
        }
        return this.f10228d;
    }

    public final androidx.emoji2.text.g g(h0 h0Var) {
        u uVar = this.f10227c;
        if (uVar == null || ((h0) uVar.f766b) != h0Var) {
            this.f10227c = new u(h0Var, 1);
        }
        return this.f10227c;
    }

    public final void h() {
        h0 layoutManager;
        View viewE;
        RecyclerView recyclerView = this.f10225a;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null || (viewE = e(layoutManager)) == null) {
            return;
        }
        int[] iArrB = b(layoutManager, viewE);
        int i = iArrB[0];
        if (i == 0 && iArrB[1] == 0) {
            return;
        }
        this.f10225a.i0(i, iArrB[1], false);
    }
}

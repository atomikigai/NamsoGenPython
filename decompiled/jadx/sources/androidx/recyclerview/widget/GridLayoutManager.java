package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.datastore.preferences.protobuf.h;
import da.v;
import java.util.Arrays;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;
import r0.k;
import r0.l;
import s5.j;
import u3.b;
import x1.h0;
import x1.i0;
import x1.n;
import x1.n0;
import x1.p;
import x1.q;
import x1.r;
import x1.s0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean E;
    public int F;
    public int[] G;
    public View[] H;
    public final SparseIntArray I;
    public final SparseIntArray J;
    public final j K;
    public final Rect L;

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        super(context, attributeSet, i, i10);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new j(11);
        this.L = new Rect();
        o1(h0.G(context, attributeSet, i, i10).f10071b);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final boolean B0() {
        return this.f1130z == null && !this.E;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void D0(s0 s0Var, r rVar, h hVar) {
        int i;
        int i10 = this.F;
        for (int i11 = 0; i11 < this.F && (i = rVar.f10184d) >= 0 && i < s0Var.b() && i10 > 0; i11++) {
            hVar.b(rVar.f10184d, Math.max(0, rVar.f10186g));
            this.K.getClass();
            i10--;
            rVar.f10184d += rVar.e;
        }
    }

    @Override // x1.h0
    public final int H(n0 n0Var, s0 s0Var) {
        if (this.f1120p == 0) {
            return this.F;
        }
        if (s0Var.b() < 1) {
            return 0;
        }
        return k1(s0Var.b() - 1, n0Var, s0Var) + 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View Q0(n0 n0Var, s0 s0Var, boolean z4, boolean z10) {
        int i;
        int iV;
        int iV2 = v();
        int i10 = 1;
        if (z10) {
            iV = v() - 1;
            i = -1;
            i10 = -1;
        } else {
            i = iV2;
            iV = 0;
        }
        int iB = s0Var.b();
        I0();
        int iM = this.f1122r.m();
        int i11 = this.f1122r.i();
        View view = null;
        View view2 = null;
        while (iV != i) {
            View viewU = u(iV);
            int iF = h0.F(viewU);
            if (iF >= 0 && iF < iB && l1(iF, n0Var, s0Var) == 0) {
                if (((i0) viewU.getLayoutParams()).f10105a.h()) {
                    if (view2 == null) {
                        view2 = viewU;
                    }
                } else {
                    if (this.f1122r.g(viewU) < i11 && this.f1122r.d(viewU) >= iM) {
                        return viewU;
                    }
                    if (view == null) {
                        view = viewU;
                    }
                }
            }
            iV += i10;
        }
        return view != null ? view : view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e0, code lost:
    
        if (r13 == (r2 > r15)) goto L57;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View R(android.view.View r23, int r24, x1.n0 r25, x1.s0 r26) {
        /*
            Method dump skipped, instruction units count: 324
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.R(android.view.View, int, x1.n0, x1.s0):android.view.View");
    }

    @Override // x1.h0
    public final void T(n0 n0Var, s0 s0Var, l lVar) {
        super.T(n0Var, s0Var, lVar);
        lVar.f8119a.setClassName(GridView.class.getName());
    }

    @Override // x1.h0
    public final void V(n0 n0Var, s0 s0Var, View view, l lVar) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof n)) {
            U(view, lVar);
            return;
        }
        n nVar = (n) layoutParams;
        int iK1 = k1(nVar.f10105a.b(), n0Var, s0Var);
        if (this.f1120p == 0) {
            lVar.j(k.a(nVar.e, nVar.f10153f, iK1, 1, false));
        } else {
            lVar.j(k.a(iK1, 1, nVar.e, nVar.f10153f, false));
        }
    }

    @Override // x1.h0
    public final void W(int i, int i10) {
        j jVar = this.K;
        jVar.o();
        ((SparseIntArray) jVar.f8446c).clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v26 */
    /* JADX WARN: Type inference failed for: r12v27 */
    /* JADX WARN: Type inference failed for: r12v34 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void W0(n0 n0Var, s0 s0Var, r rVar, q qVar) {
        int i;
        int i10;
        int i11;
        int iF;
        int iC;
        int iF2;
        int iW;
        int iW2;
        ?? r12;
        int i12;
        View viewB;
        int iL = this.f1122r.l();
        boolean z4 = iL != 1073741824;
        int i13 = v() > 0 ? this.G[this.F] : 0;
        if (z4) {
            p1();
        }
        boolean z10 = rVar.e == 1;
        int iL1 = this.F;
        if (!z10) {
            iL1 = l1(rVar.f10184d, n0Var, s0Var) + m1(rVar.f10184d, n0Var, s0Var);
        }
        int i14 = 0;
        while (i14 < this.F && (i12 = rVar.f10184d) >= 0 && i12 < s0Var.b() && iL1 > 0) {
            int i15 = rVar.f10184d;
            int iM1 = m1(i15, n0Var, s0Var);
            if (iM1 > this.F) {
                throw new IllegalArgumentException(b.c(b.d(i15, iM1, "Item at position ", " requires ", " spans but GridLayoutManager has only "), this.F, " spans."));
            }
            iL1 -= iM1;
            if (iL1 < 0 || (viewB = rVar.b(n0Var)) == null) {
                break;
            }
            this.H[i14] = viewB;
            i14++;
        }
        if (i14 == 0) {
            qVar.f10172b = true;
            return;
        }
        if (z10) {
            i11 = 1;
            i10 = i14;
            i = 0;
        } else {
            i = i14 - 1;
            i10 = -1;
            i11 = -1;
        }
        int i16 = 0;
        while (i != i10) {
            View view = this.H[i];
            n nVar = (n) view.getLayoutParams();
            int iM2 = m1(h0.F(view), n0Var, s0Var);
            nVar.f10153f = iM2;
            nVar.e = i16;
            i16 += iM2;
            i += i11;
        }
        float f10 = 0.0f;
        int i17 = 0;
        for (int i18 = 0; i18 < i14; i18++) {
            View view2 = this.H[i18];
            if (rVar.f10188k != null) {
                r12 = 0;
                r12 = 0;
                if (z10) {
                    b(view2, true, -1);
                } else {
                    b(view2, true, 0);
                }
            } else if (z10) {
                r12 = 0;
                b(view2, false, -1);
            } else {
                r12 = 0;
                b(view2, false, 0);
            }
            RecyclerView recyclerView = this.f10083b;
            Rect rect = this.L;
            if (recyclerView == null) {
                rect.set(r12, r12, r12, r12);
            } else {
                rect.set(recyclerView.N(view2));
            }
            n1(view2, r12, iL);
            int iE = this.f1122r.e(view2);
            if (iE > i17) {
                i17 = iE;
            }
            float f11 = (this.f1122r.f(view2) * 1.0f) / ((n) view2.getLayoutParams()).f10153f;
            if (f11 > f10) {
                f10 = f11;
            }
        }
        if (z4) {
            h1(Math.max(Math.round(f10 * this.F), i13));
            i17 = 0;
            for (int i19 = 0; i19 < i14; i19++) {
                View view3 = this.H[i19];
                n1(view3, true, 1073741824);
                int iE2 = this.f1122r.e(view3);
                if (iE2 > i17) {
                    i17 = iE2;
                }
            }
        }
        for (int i20 = 0; i20 < i14; i20++) {
            View view4 = this.H[i20];
            if (this.f1122r.e(view4) != i17) {
                n nVar2 = (n) view4.getLayoutParams();
                Rect rect2 = nVar2.f10106b;
                int i21 = rect2.top + rect2.bottom + ((ViewGroup.MarginLayoutParams) nVar2).topMargin + ((ViewGroup.MarginLayoutParams) nVar2).bottomMargin;
                int i22 = rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) nVar2).leftMargin + ((ViewGroup.MarginLayoutParams) nVar2).rightMargin;
                int iJ1 = j1(nVar2.e, nVar2.f10153f);
                if (this.f1120p == 1) {
                    iW2 = h0.w(iJ1, 1073741824, i22, ((ViewGroup.MarginLayoutParams) nVar2).width, false);
                    iW = View.MeasureSpec.makeMeasureSpec(i17 - i21, 1073741824);
                } else {
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - i22, 1073741824);
                    iW = h0.w(iJ1, 1073741824, i21, ((ViewGroup.MarginLayoutParams) nVar2).height, false);
                    iW2 = iMakeMeasureSpec;
                }
                if (y0(view4, iW2, iW, (i0) view4.getLayoutParams())) {
                    view4.measure(iW2, iW);
                }
            }
        }
        int iE3 = 0;
        qVar.f10171a = i17;
        if (this.f1120p != 1) {
            if (rVar.f10185f == -1) {
                int i23 = rVar.f10182b;
                iC = i23 - i17;
                iF = i23;
            } else {
                int i24 = rVar.f10182b;
                iF = i24 + i17;
                iC = i24;
            }
            iF2 = iE3;
        } else if (rVar.f10185f == -1) {
            iF2 = rVar.f10182b;
            iE3 = iF2 - i17;
            iC = 0;
            iF = 0;
        } else {
            int i25 = rVar.f10182b;
            iF = 0;
            iE3 = i25;
            iF2 = i25 + i17;
            iC = 0;
        }
        for (int i26 = 0; i26 < i14; i26++) {
            View view5 = this.H[i26];
            n nVar3 = (n) view5.getLayoutParams();
            if (this.f1120p != 1) {
                iE3 = E() + this.G[nVar3.e];
                iF2 = this.f1122r.f(view5) + iE3;
            } else if (V0()) {
                int iC2 = C() + this.G[this.F - nVar3.e];
                iF = iC2;
                iC = iC2 - this.f1122r.f(view5);
            } else {
                iC = C() + this.G[nVar3.e];
                iF = this.f1122r.f(view5) + iC;
            }
            h0.L(view5, iC, iE3, iF, iF2);
            if (nVar3.f10105a.h() || nVar3.f10105a.k()) {
                qVar.f10173c = true;
            }
            qVar.f10174d = view5.hasFocusable() | qVar.f10174d;
        }
        Arrays.fill(this.H, (Object) null);
    }

    @Override // x1.h0
    public final void X() {
        j jVar = this.K;
        jVar.o();
        ((SparseIntArray) jVar.f8446c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void X0(n0 n0Var, s0 s0Var, p pVar, int i) {
        p1();
        if (s0Var.b() > 0 && !s0Var.f10198g) {
            boolean z4 = i == 1;
            int iL1 = l1(pVar.f10167b, n0Var, s0Var);
            if (z4) {
                while (iL1 > 0) {
                    int i10 = pVar.f10167b;
                    if (i10 <= 0) {
                        break;
                    }
                    int i11 = i10 - 1;
                    pVar.f10167b = i11;
                    iL1 = l1(i11, n0Var, s0Var);
                }
            } else {
                int iB = s0Var.b() - 1;
                int i12 = pVar.f10167b;
                while (i12 < iB) {
                    int i13 = i12 + 1;
                    int iL2 = l1(i13, n0Var, s0Var);
                    if (iL2 <= iL1) {
                        break;
                    }
                    i12 = i13;
                    iL1 = iL2;
                }
                pVar.f10167b = i12;
            }
        }
        i1();
    }

    @Override // x1.h0
    public final void Y(int i, int i10) {
        j jVar = this.K;
        jVar.o();
        ((SparseIntArray) jVar.f8446c).clear();
    }

    @Override // x1.h0
    public final void Z(int i, int i10) {
        j jVar = this.K;
        jVar.o();
        ((SparseIntArray) jVar.f8446c).clear();
    }

    @Override // x1.h0
    public final void a0(int i, int i10) {
        j jVar = this.K;
        jVar.o();
        ((SparseIntArray) jVar.f8446c).clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final void b0(n0 n0Var, s0 s0Var) {
        boolean z4 = s0Var.f10198g;
        SparseIntArray sparseIntArray = this.J;
        SparseIntArray sparseIntArray2 = this.I;
        if (z4) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                n nVar = (n) u(i).getLayoutParams();
                int iB = nVar.f10105a.b();
                sparseIntArray2.put(iB, nVar.f10153f);
                sparseIntArray.put(iB, nVar.e);
            }
        }
        super.b0(n0Var, s0Var);
        sparseIntArray2.clear();
        sparseIntArray.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final void c0(s0 s0Var) {
        super.c0(s0Var);
        this.E = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void d1(boolean z4) {
        if (z4) {
            throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
        }
        super.d1(false);
    }

    @Override // x1.h0
    public final boolean f(i0 i0Var) {
        return i0Var instanceof n;
    }

    public final void h1(int i) {
        int i10;
        int[] iArr = this.G;
        int i11 = this.F;
        if (iArr == null || iArr.length != i11 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i11 + 1];
        }
        int i12 = 0;
        iArr[0] = 0;
        int i13 = i / i11;
        int i14 = i % i11;
        int i15 = 0;
        for (int i16 = 1; i16 <= i11; i16++) {
            i12 += i14;
            if (i12 <= 0 || i11 - i12 >= i14) {
                i10 = i13;
            } else {
                i10 = i13 + 1;
                i12 -= i11;
            }
            i15 += i10;
            iArr[i16] = i15;
        }
        this.G = iArr;
    }

    public final void i1() {
        View[] viewArr = this.H;
        if (viewArr == null || viewArr.length != this.F) {
            this.H = new View[this.F];
        }
    }

    public final int j1(int i, int i10) {
        if (this.f1120p != 1 || !V0()) {
            int[] iArr = this.G;
            return iArr[i10 + i] - iArr[i];
        }
        int[] iArr2 = this.G;
        int i11 = this.F;
        return iArr2[i11 - i] - iArr2[(i11 - i) - i10];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final int k(s0 s0Var) {
        return F0(s0Var);
    }

    public final int k1(int i, n0 n0Var, s0 s0Var) {
        boolean z4 = s0Var.f10198g;
        j jVar = this.K;
        if (!z4) {
            int i10 = this.F;
            jVar.getClass();
            return j.m(i, i10);
        }
        int iB = n0Var.b(i);
        if (iB != -1) {
            int i11 = this.F;
            jVar.getClass();
            return j.m(iB, i11);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final int l(s0 s0Var) {
        return G0(s0Var);
    }

    public final int l1(int i, n0 n0Var, s0 s0Var) {
        boolean z4 = s0Var.f10198g;
        j jVar = this.K;
        if (!z4) {
            int i10 = this.F;
            jVar.getClass();
            return i % i10;
        }
        int i11 = this.J.get(i, -1);
        if (i11 != -1) {
            return i11;
        }
        int iB = n0Var.b(i);
        if (iB != -1) {
            int i12 = this.F;
            jVar.getClass();
            return iB % i12;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    public final int m1(int i, n0 n0Var, s0 s0Var) {
        boolean z4 = s0Var.f10198g;
        j jVar = this.K;
        if (!z4) {
            jVar.getClass();
            return 1;
        }
        int i10 = this.I.get(i, -1);
        if (i10 != -1) {
            return i10;
        }
        if (n0Var.b(i) != -1) {
            jVar.getClass();
            return 1;
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final int n(s0 s0Var) {
        return F0(s0Var);
    }

    public final void n1(View view, boolean z4, int i) {
        int iW;
        int iW2;
        n nVar = (n) view.getLayoutParams();
        Rect rect = nVar.f10106b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) nVar).topMargin + ((ViewGroup.MarginLayoutParams) nVar).bottomMargin;
        int i11 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) nVar).leftMargin + ((ViewGroup.MarginLayoutParams) nVar).rightMargin;
        int iJ1 = j1(nVar.e, nVar.f10153f);
        if (this.f1120p == 1) {
            iW2 = h0.w(iJ1, i, i11, ((ViewGroup.MarginLayoutParams) nVar).width, false);
            iW = h0.w(this.f1122r.n(), this.f10091m, i10, ((ViewGroup.MarginLayoutParams) nVar).height, true);
        } else {
            int iW3 = h0.w(iJ1, i, i10, ((ViewGroup.MarginLayoutParams) nVar).height, false);
            int iW4 = h0.w(this.f1122r.n(), this.f10090l, i11, ((ViewGroup.MarginLayoutParams) nVar).width, true);
            iW = iW3;
            iW2 = iW4;
        }
        i0 i0Var = (i0) view.getLayoutParams();
        if (z4 ? y0(view, iW2, iW, i0Var) : w0(view, iW2, iW, i0Var)) {
            view.measure(iW2, iW);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final int o(s0 s0Var) {
        return G0(s0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final int o0(int i, n0 n0Var, s0 s0Var) {
        p1();
        i1();
        return super.o0(i, n0Var, s0Var);
    }

    public final void o1(int i) {
        if (i == this.F) {
            return;
        }
        this.E = true;
        if (i < 1) {
            throw new IllegalArgumentException(v.f(i, "Span count should be at least 1. Provided "));
        }
        this.F = i;
        this.K.o();
        n0();
    }

    public final void p1() {
        int iB;
        int iE;
        if (this.f1120p == 1) {
            iB = this.f10092n - D();
            iE = C();
        } else {
            iB = this.f10093o - B();
            iE = E();
        }
        h1(iB - iE);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final int q0(int i, n0 n0Var, s0 s0Var) {
        p1();
        i1();
        return super.q0(i, n0Var, s0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, x1.h0
    public final i0 r() {
        return this.f1120p == 0 ? new n(-2, -1) : new n(-1, -2);
    }

    @Override // x1.h0
    public final i0 s(Context context, AttributeSet attributeSet) {
        n nVar = new n(context, attributeSet);
        nVar.e = -1;
        nVar.f10153f = 0;
        return nVar;
    }

    @Override // x1.h0
    public final i0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            n nVar = new n((ViewGroup.MarginLayoutParams) layoutParams);
            nVar.e = -1;
            nVar.f10153f = 0;
            return nVar;
        }
        n nVar2 = new n(layoutParams);
        nVar2.e = -1;
        nVar2.f10153f = 0;
        return nVar2;
    }

    @Override // x1.h0
    public final void t0(Rect rect, int i, int i10) {
        int iG;
        int iG2;
        if (this.G == null) {
            super.t0(rect, i, i10);
        }
        int iD = D() + C();
        int iB = B() + E();
        if (this.f1120p == 1) {
            int iHeight = rect.height() + iB;
            RecyclerView recyclerView = this.f10083b;
            WeakHashMap weakHashMap = v0.f7946a;
            iG2 = h0.g(i10, iHeight, d0.d(recyclerView));
            int[] iArr = this.G;
            iG = h0.g(i, iArr[iArr.length - 1] + iD, d0.e(this.f10083b));
        } else {
            int iWidth = rect.width() + iD;
            RecyclerView recyclerView2 = this.f10083b;
            WeakHashMap weakHashMap2 = v0.f7946a;
            iG = h0.g(i, iWidth, d0.e(recyclerView2));
            int[] iArr2 = this.G;
            iG2 = h0.g(i10, iArr2[iArr2.length - 1] + iB, d0.d(this.f10083b));
        }
        this.f10083b.setMeasuredDimension(iG, iG2);
    }

    @Override // x1.h0
    public final int x(n0 n0Var, s0 s0Var) {
        if (this.f1120p == 1) {
            return this.F;
        }
        if (s0Var.b() < 1) {
            return 0;
        }
        return k1(s0Var.b() - 1, n0Var, s0Var) + 1;
    }

    public GridLayoutManager(int i) {
        super(1);
        this.E = false;
        this.F = -1;
        this.I = new SparseIntArray();
        this.J = new SparseIntArray();
        this.K = new j(11);
        this.L = new Rect();
        o1(i);
    }
}

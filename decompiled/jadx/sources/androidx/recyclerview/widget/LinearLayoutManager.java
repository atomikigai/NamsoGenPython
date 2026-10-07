package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.datastore.preferences.protobuf.h;
import androidx.emoji2.text.g;
import com.bumptech.glide.d;
import da.v;
import java.util.List;
import x1.g0;
import x1.h0;
import x1.i0;
import x1.n0;
import x1.p;
import x1.q;
import x1.r;
import x1.r0;
import x1.s;
import x1.s0;
import x1.t;
import x1.w0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends h0 implements r0 {
    public final p A;
    public final q B;
    public final int C;
    public final int[] D;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f1120p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r f1121q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f1122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f1124t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f1125u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f1126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final boolean f1127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f1128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f1129y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public s f1130z;

    public LinearLayoutManager(int i) {
        this.f1120p = 1;
        this.f1124t = false;
        this.f1125u = false;
        this.f1126v = false;
        this.f1127w = true;
        this.f1128x = -1;
        this.f1129y = Integer.MIN_VALUE;
        this.f1130z = null;
        this.A = new p();
        this.B = new q();
        this.C = 2;
        this.D = new int[2];
        c1(i);
        c(null);
        if (this.f1124t) {
            this.f1124t = false;
            n0();
        }
    }

    @Override // x1.h0
    public boolean B0() {
        return this.f1130z == null && this.f1123s == this.f1126v;
    }

    public void C0(s0 s0Var, int[] iArr) {
        int i;
        int iN = s0Var.f10193a != -1 ? this.f1122r.n() : 0;
        if (this.f1121q.f10185f == -1) {
            i = 0;
        } else {
            i = iN;
            iN = 0;
        }
        iArr[0] = iN;
        iArr[1] = i;
    }

    public void D0(s0 s0Var, r rVar, h hVar) {
        int i = rVar.f10184d;
        if (i < 0 || i >= s0Var.b()) {
            return;
        }
        hVar.b(i, Math.max(0, rVar.f10186g));
    }

    public final int E0(s0 s0Var) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1122r;
        boolean z4 = !this.f1127w;
        return d.c(s0Var, gVar, L0(z4), K0(z4), this, this.f1127w);
    }

    public final int F0(s0 s0Var) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1122r;
        boolean z4 = !this.f1127w;
        return d.d(s0Var, gVar, L0(z4), K0(z4), this, this.f1127w, this.f1125u);
    }

    public final int G0(s0 s0Var) {
        if (v() == 0) {
            return 0;
        }
        I0();
        g gVar = this.f1122r;
        boolean z4 = !this.f1127w;
        return d.e(s0Var, gVar, L0(z4), K0(z4), this, this.f1127w);
    }

    public final int H0(int i) {
        if (i == 1) {
            return (this.f1120p != 1 && V0()) ? 1 : -1;
        }
        if (i == 2) {
            return (this.f1120p != 1 && V0()) ? -1 : 1;
        }
        if (i == 17) {
            return this.f1120p == 0 ? -1 : Integer.MIN_VALUE;
        }
        if (i == 33) {
            return this.f1120p == 1 ? -1 : Integer.MIN_VALUE;
        }
        if (i != 66) {
            return (i == 130 && this.f1120p == 1) ? 1 : Integer.MIN_VALUE;
        }
        return this.f1120p == 0 ? 1 : Integer.MIN_VALUE;
    }

    public final void I0() {
        if (this.f1121q == null) {
            r rVar = new r();
            rVar.f10181a = true;
            rVar.h = 0;
            rVar.i = 0;
            rVar.f10188k = null;
            this.f1121q = rVar;
        }
    }

    @Override // x1.h0
    public final boolean J() {
        return true;
    }

    public final int J0(n0 n0Var, r rVar, s0 s0Var, boolean z4) {
        int i;
        int i10 = rVar.f10183c;
        int i11 = rVar.f10186g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                rVar.f10186g = i11 + i10;
            }
            Y0(n0Var, rVar);
        }
        int i12 = rVar.f10183c + rVar.h;
        while (true) {
            if ((!rVar.f10189l && i12 <= 0) || (i = rVar.f10184d) < 0 || i >= s0Var.b()) {
                break;
            }
            q qVar = this.B;
            qVar.f10171a = 0;
            qVar.f10172b = false;
            qVar.f10173c = false;
            qVar.f10174d = false;
            W0(n0Var, s0Var, rVar, qVar);
            if (!qVar.f10172b) {
                int i13 = rVar.f10182b;
                int i14 = qVar.f10171a;
                rVar.f10182b = (rVar.f10185f * i14) + i13;
                if (!qVar.f10173c || rVar.f10188k != null || !s0Var.f10198g) {
                    rVar.f10183c -= i14;
                    i12 -= i14;
                }
                int i15 = rVar.f10186g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + i14;
                    rVar.f10186g = i16;
                    int i17 = rVar.f10183c;
                    if (i17 < 0) {
                        rVar.f10186g = i16 + i17;
                    }
                    Y0(n0Var, rVar);
                }
                if (z4 && qVar.f10174d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - rVar.f10183c;
    }

    public final View K0(boolean z4) {
        return this.f1125u ? P0(0, v(), z4) : P0(v() - 1, -1, z4);
    }

    public final View L0(boolean z4) {
        return this.f1125u ? P0(v() - 1, -1, z4) : P0(0, v(), z4);
    }

    public final int M0() {
        View viewP0 = P0(0, v(), false);
        if (viewP0 == null) {
            return -1;
        }
        return h0.F(viewP0);
    }

    public final int N0() {
        View viewP0 = P0(v() - 1, -1, false);
        if (viewP0 == null) {
            return -1;
        }
        return h0.F(viewP0);
    }

    public final View O0(int i, int i10) {
        int i11;
        int i12;
        I0();
        if (i10 <= i && i10 >= i) {
            return u(i);
        }
        if (this.f1122r.g(u(i)) < this.f1122r.m()) {
            i11 = 16644;
            i12 = 16388;
        } else {
            i11 = 4161;
            i12 = 4097;
        }
        return this.f1120p == 0 ? this.f10084c.i(i, i10, i11, i12) : this.f10085d.i(i, i10, i11, i12);
    }

    public final View P0(int i, int i10, boolean z4) {
        I0();
        int i11 = z4 ? 24579 : 320;
        return this.f1120p == 0 ? this.f10084c.i(i, i10, i11, 320) : this.f10085d.i(i, i10, i11, 320);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0075  */
    /* JADX WARN: Code duplicated, block: B:35:0x0079  */
    public View Q0(n0 n0Var, s0 s0Var, boolean z4, boolean z10) {
        int i;
        int iV;
        int i10;
        I0();
        int iV2 = v();
        if (z10) {
            iV = v() - 1;
            i = -1;
            i10 = -1;
        } else {
            i = iV2;
            iV = 0;
            i10 = 1;
        }
        int iB = s0Var.b();
        int iM = this.f1122r.m();
        int i11 = this.f1122r.i();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iV != i) {
            View viewU = u(iV);
            int iF = h0.F(viewU);
            int iG = this.f1122r.g(viewU);
            int iD = this.f1122r.d(viewU);
            if (iF >= 0 && iF < iB) {
                if (!((i0) viewU.getLayoutParams()).f10105a.h()) {
                    boolean z11 = iD <= iM && iG < iM;
                    boolean z12 = iG >= i11 && iD > i11;
                    if (!z11 && !z12) {
                        return viewU;
                    }
                    if (z4) {
                        if (z12) {
                            view2 = viewU;
                        } else if (view == null) {
                            view = viewU;
                        }
                    } else if (z11) {
                        view2 = viewU;
                    } else if (view == null) {
                        view = viewU;
                    }
                } else if (view3 == null) {
                    view3 = viewU;
                }
            }
            iV += i10;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // x1.h0
    public View R(View view, int i, n0 n0Var, s0 s0Var) {
        int iH0;
        View viewO0;
        a1();
        if (v() != 0 && (iH0 = H0(i)) != Integer.MIN_VALUE) {
            I0();
            e1(iH0, (int) (this.f1122r.n() * 0.33333334f), false, s0Var);
            r rVar = this.f1121q;
            rVar.f10186g = Integer.MIN_VALUE;
            rVar.f10181a = false;
            J0(n0Var, rVar, s0Var, true);
            if (iH0 == -1) {
                viewO0 = this.f1125u ? O0(v() - 1, -1) : O0(0, v());
            } else {
                viewO0 = this.f1125u ? O0(0, v()) : O0(v() - 1, -1);
            }
            View viewU0 = iH0 == -1 ? U0() : T0();
            if (!viewU0.hasFocusable()) {
                return viewO0;
            }
            if (viewO0 != null) {
                return viewU0;
            }
        }
        return null;
    }

    public final int R0(int i, n0 n0Var, s0 s0Var, boolean z4) {
        int i10;
        int i11 = this.f1122r.i() - i;
        if (i11 <= 0) {
            return 0;
        }
        int i12 = -b1(-i11, n0Var, s0Var);
        int i13 = i + i12;
        if (!z4 || (i10 = this.f1122r.i() - i13) <= 0) {
            return i12;
        }
        this.f1122r.q(i10);
        return i10 + i12;
    }

    @Override // x1.h0
    public final void S(AccessibilityEvent accessibilityEvent) {
        super.S(accessibilityEvent);
        if (v() > 0) {
            accessibilityEvent.setFromIndex(M0());
            accessibilityEvent.setToIndex(N0());
        }
    }

    public final int S0(int i, n0 n0Var, s0 s0Var, boolean z4) {
        int iM;
        int iM2 = i - this.f1122r.m();
        if (iM2 <= 0) {
            return 0;
        }
        int i10 = -b1(iM2, n0Var, s0Var);
        int i11 = i + i10;
        if (!z4 || (iM = i11 - this.f1122r.m()) <= 0) {
            return i10;
        }
        this.f1122r.q(-iM);
        return i10 - iM;
    }

    public final View T0() {
        return u(this.f1125u ? 0 : v() - 1);
    }

    public final View U0() {
        return u(this.f1125u ? v() - 1 : 0);
    }

    public final boolean V0() {
        return A() == 1;
    }

    public void W0(n0 n0Var, s0 s0Var, r rVar, q qVar) {
        int iC;
        int i;
        int i10;
        int iF;
        View viewB = rVar.b(n0Var);
        if (viewB == null) {
            qVar.f10172b = true;
            return;
        }
        i0 i0Var = (i0) viewB.getLayoutParams();
        if (rVar.f10188k == null) {
            if (this.f1125u == (rVar.f10185f == -1)) {
                b(viewB, false, -1);
            } else {
                b(viewB, false, 0);
            }
        } else {
            if (this.f1125u == (rVar.f10185f == -1)) {
                b(viewB, true, -1);
            } else {
                b(viewB, true, 0);
            }
        }
        i0 i0Var2 = (i0) viewB.getLayoutParams();
        Rect rectN = this.f10083b.N(viewB);
        int i11 = rectN.left + rectN.right;
        int i12 = rectN.top + rectN.bottom;
        int iW = h0.w(this.f10092n, this.f10090l, D() + C() + ((ViewGroup.MarginLayoutParams) i0Var2).leftMargin + ((ViewGroup.MarginLayoutParams) i0Var2).rightMargin + i11, ((ViewGroup.MarginLayoutParams) i0Var2).width, d());
        int iW2 = h0.w(this.f10093o, this.f10091m, B() + E() + ((ViewGroup.MarginLayoutParams) i0Var2).topMargin + ((ViewGroup.MarginLayoutParams) i0Var2).bottomMargin + i12, ((ViewGroup.MarginLayoutParams) i0Var2).height, e());
        if (w0(viewB, iW, iW2, i0Var2)) {
            viewB.measure(iW, iW2);
        }
        qVar.f10171a = this.f1122r.e(viewB);
        if (this.f1120p == 1) {
            if (V0()) {
                iF = this.f10092n - D();
                iC = iF - this.f1122r.f(viewB);
            } else {
                iC = C();
                iF = this.f1122r.f(viewB) + iC;
            }
            if (rVar.f10185f == -1) {
                i = rVar.f10182b;
                i10 = i - qVar.f10171a;
            } else {
                i10 = rVar.f10182b;
                i = qVar.f10171a + i10;
            }
        } else {
            int iE = E();
            int iF2 = this.f1122r.f(viewB) + iE;
            if (rVar.f10185f == -1) {
                int i13 = rVar.f10182b;
                int i14 = i13 - qVar.f10171a;
                iF = i13;
                i = iF2;
                iC = i14;
                i10 = iE;
            } else {
                int i15 = rVar.f10182b;
                int i16 = qVar.f10171a + i15;
                iC = i15;
                i = iF2;
                i10 = iE;
                iF = i16;
            }
        }
        h0.L(viewB, iC, i10, iF, i);
        if (i0Var.f10105a.h() || i0Var.f10105a.k()) {
            qVar.f10173c = true;
        }
        qVar.f10174d = viewB.hasFocusable();
    }

    public final void Y0(n0 n0Var, r rVar) {
        if (!rVar.f10181a || rVar.f10189l) {
            return;
        }
        int i = rVar.f10186g;
        int i10 = rVar.i;
        if (rVar.f10185f == -1) {
            int iV = v();
            if (i < 0) {
                return;
            }
            int iH = (this.f1122r.h() - i) + i10;
            if (this.f1125u) {
                for (int i11 = 0; i11 < iV; i11++) {
                    View viewU = u(i11);
                    if (this.f1122r.g(viewU) < iH || this.f1122r.p(viewU) < iH) {
                        Z0(n0Var, 0, i11);
                        return;
                    }
                }
                return;
            }
            int i12 = iV - 1;
            for (int i13 = i12; i13 >= 0; i13--) {
                View viewU2 = u(i13);
                if (this.f1122r.g(viewU2) < iH || this.f1122r.p(viewU2) < iH) {
                    Z0(n0Var, i12, i13);
                    return;
                }
            }
            return;
        }
        if (i < 0) {
            return;
        }
        int i14 = i - i10;
        int iV2 = v();
        if (!this.f1125u) {
            for (int i15 = 0; i15 < iV2; i15++) {
                View viewU3 = u(i15);
                if (this.f1122r.d(viewU3) > i14 || this.f1122r.o(viewU3) > i14) {
                    Z0(n0Var, 0, i15);
                    return;
                }
            }
            return;
        }
        int i16 = iV2 - 1;
        for (int i17 = i16; i17 >= 0; i17--) {
            View viewU4 = u(i17);
            if (this.f1122r.d(viewU4) > i14 || this.f1122r.o(viewU4) > i14) {
                Z0(n0Var, i16, i17);
                return;
            }
        }
    }

    public final void Z0(n0 n0Var, int i, int i10) {
        if (i == i10) {
            return;
        }
        if (i10 <= i) {
            while (i > i10) {
                k0(i, n0Var);
                i--;
            }
        } else {
            for (int i11 = i10 - 1; i11 >= i; i11--) {
                k0(i11, n0Var);
            }
        }
    }

    @Override // x1.r0
    public final PointF a(int i) {
        if (v() == 0) {
            return null;
        }
        int i10 = (i < h0.F(u(0))) != this.f1125u ? -1 : 1;
        return this.f1120p == 0 ? new PointF(i10, 0.0f) : new PointF(0.0f, i10);
    }

    public final void a1() {
        if (this.f1120p == 1 || !V0()) {
            this.f1125u = this.f1124t;
        } else {
            this.f1125u = !this.f1124t;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:104:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:114:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:122:0x020f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:124:0x0213  */
    /* JADX WARN: Code duplicated, block: B:126:0x0216 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:128:0x021a  */
    /* JADX WARN: Code duplicated, block: B:130:0x021d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:131:0x021f  */
    /* JADX WARN: Code duplicated, block: B:133:0x0223  */
    /* JADX WARN: Code duplicated, block: B:135:0x0227  */
    /* JADX WARN: Code duplicated, block: B:137:0x022e  */
    /* JADX WARN: Code duplicated, block: B:138:0x0234  */
    /* JADX WARN: Code duplicated, block: B:95:0x0192  */
    @Override // x1.h0
    public void b0(n0 n0Var, s0 s0Var) {
        View focusedChild;
        int iB;
        RecyclerView recyclerView;
        View focusedChild2;
        boolean z4;
        boolean z10;
        View viewQ0;
        int iG;
        int iD;
        int iM;
        int i;
        boolean z11;
        boolean z12;
        i0 i0Var;
        int i10;
        int iG2;
        int i11;
        int i12;
        List list;
        int i13;
        int i14;
        int iR0;
        int i15;
        View viewQ;
        int iG3;
        int i16;
        int i17;
        int i18 = -1;
        if (!(this.f1130z == null && this.f1128x == -1) && s0Var.b() == 0) {
            h0(n0Var);
            return;
        }
        s sVar = this.f1130z;
        if (sVar != null && (i17 = sVar.f10190a) >= 0) {
            this.f1128x = i17;
        }
        I0();
        this.f1121q.f10181a = false;
        a1();
        RecyclerView recyclerView2 = this.f10083b;
        if (recyclerView2 == null || (focusedChild = recyclerView2.getFocusedChild()) == null || this.f10082a.f10023c.contains(focusedChild)) {
            focusedChild = null;
        }
        p pVar = this.A;
        if (!pVar.e || this.f1128x != -1 || this.f1130z != null) {
            pVar.d();
            pVar.f10169d = this.f1125u ^ this.f1126v;
            if (s0Var.f10198g || (i10 = this.f1128x) == -1) {
                if (v() != 0) {
                    recyclerView = this.f10083b;
                    if (recyclerView != null || (focusedChild2 = recyclerView.getFocusedChild()) == null || this.f10082a.f10023c.contains(focusedChild2)) {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        i0Var = (i0) focusedChild2.getLayoutParams();
                        if (!i0Var.f10105a.h() || i0Var.f10105a.b() < 0 || i0Var.f10105a.b() >= s0Var.b()) {
                            z4 = this.f1123s;
                            z10 = this.f1126v;
                            if (z4 == z10 || (viewQ0 = Q0(n0Var, s0Var, pVar.f10169d, z10)) == null) {
                                pVar.a();
                                if (this.f1126v) {
                                    iB = s0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                pVar.f10167b = iB;
                            } else {
                                pVar.b(viewQ0, h0.F(viewQ0));
                                if (!s0Var.f10198g && B0()) {
                                    iG = this.f1122r.g(viewQ0);
                                    iD = this.f1122r.d(viewQ0);
                                    iM = this.f1122r.m();
                                    i = this.f1122r.i();
                                    if (iD <= iM || iG >= iM) {
                                        z11 = false;
                                    } else {
                                        z11 = true;
                                    }
                                    if (iG >= i || iD <= i) {
                                        z12 = false;
                                    } else {
                                        z12 = true;
                                    }
                                    if (z11 || z12) {
                                        if (pVar.f10169d) {
                                            iM = i;
                                        }
                                        pVar.f10168c = iM;
                                    }
                                }
                            }
                        } else {
                            pVar.c(focusedChild2, h0.F(focusedChild2));
                        }
                    } else {
                        z4 = this.f1123s;
                        z10 = this.f1126v;
                        if (z4 == z10) {
                            pVar.a();
                            if (this.f1126v) {
                                iB = s0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            pVar.f10167b = iB;
                        } else {
                            pVar.b(viewQ0, h0.F(viewQ0));
                            if (!s0Var.f10198g) {
                                iG = this.f1122r.g(viewQ0);
                                iD = this.f1122r.d(viewQ0);
                                iM = this.f1122r.m();
                                i = this.f1122r.i();
                                if (iD <= iM) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (iG >= i) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z11) {
                                    if (pVar.f10169d) {
                                        iM = i;
                                    }
                                    pVar.f10168c = iM;
                                } else {
                                    if (pVar.f10169d) {
                                        iM = i;
                                    }
                                    pVar.f10168c = iM;
                                }
                            }
                        }
                    }
                } else {
                    pVar.a();
                    if (this.f1126v) {
                        iB = s0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    pVar.f10167b = iB;
                }
            } else if (i10 < 0 || i10 >= s0Var.b()) {
                this.f1128x = -1;
                this.f1129y = Integer.MIN_VALUE;
                if (v() != 0) {
                    recyclerView = this.f10083b;
                    if (recyclerView != null) {
                        focusedChild2 = null;
                    } else {
                        focusedChild2 = null;
                    }
                    if (focusedChild2 != null) {
                        i0Var = (i0) focusedChild2.getLayoutParams();
                        if (i0Var.f10105a.h()) {
                            z4 = this.f1123s;
                            z10 = this.f1126v;
                            if (z4 == z10) {
                                pVar.a();
                                if (this.f1126v) {
                                    iB = s0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                pVar.f10167b = iB;
                            } else {
                                pVar.b(viewQ0, h0.F(viewQ0));
                                if (!s0Var.f10198g) {
                                    iG = this.f1122r.g(viewQ0);
                                    iD = this.f1122r.d(viewQ0);
                                    iM = this.f1122r.m();
                                    i = this.f1122r.i();
                                    if (iD <= iM) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (iG >= i) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11) {
                                        if (pVar.f10169d) {
                                            iM = i;
                                        }
                                        pVar.f10168c = iM;
                                    } else {
                                        if (pVar.f10169d) {
                                            iM = i;
                                        }
                                        pVar.f10168c = iM;
                                    }
                                }
                            }
                        } else {
                            z4 = this.f1123s;
                            z10 = this.f1126v;
                            if (z4 == z10) {
                                pVar.a();
                                if (this.f1126v) {
                                    iB = s0Var.b() - 1;
                                } else {
                                    iB = 0;
                                }
                                pVar.f10167b = iB;
                            } else {
                                pVar.b(viewQ0, h0.F(viewQ0));
                                if (!s0Var.f10198g) {
                                    iG = this.f1122r.g(viewQ0);
                                    iD = this.f1122r.d(viewQ0);
                                    iM = this.f1122r.m();
                                    i = this.f1122r.i();
                                    if (iD <= iM) {
                                        z11 = false;
                                    } else {
                                        z11 = false;
                                    }
                                    if (iG >= i) {
                                        z12 = false;
                                    } else {
                                        z12 = false;
                                    }
                                    if (z11) {
                                        if (pVar.f10169d) {
                                            iM = i;
                                        }
                                        pVar.f10168c = iM;
                                    } else {
                                        if (pVar.f10169d) {
                                            iM = i;
                                        }
                                        pVar.f10168c = iM;
                                    }
                                }
                            }
                        }
                    } else {
                        z4 = this.f1123s;
                        z10 = this.f1126v;
                        if (z4 == z10) {
                            pVar.a();
                            if (this.f1126v) {
                                iB = s0Var.b() - 1;
                            } else {
                                iB = 0;
                            }
                            pVar.f10167b = iB;
                        } else {
                            pVar.b(viewQ0, h0.F(viewQ0));
                            if (!s0Var.f10198g) {
                                iG = this.f1122r.g(viewQ0);
                                iD = this.f1122r.d(viewQ0);
                                iM = this.f1122r.m();
                                i = this.f1122r.i();
                                if (iD <= iM) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (iG >= i) {
                                    z12 = false;
                                } else {
                                    z12 = false;
                                }
                                if (z11) {
                                    if (pVar.f10169d) {
                                        iM = i;
                                    }
                                    pVar.f10168c = iM;
                                } else {
                                    if (pVar.f10169d) {
                                        iM = i;
                                    }
                                    pVar.f10168c = iM;
                                }
                            }
                        }
                    }
                } else {
                    pVar.a();
                    if (this.f1126v) {
                        iB = s0Var.b() - 1;
                    } else {
                        iB = 0;
                    }
                    pVar.f10167b = iB;
                }
            } else {
                int i19 = this.f1128x;
                pVar.f10167b = i19;
                s sVar2 = this.f1130z;
                if (sVar2 != null && sVar2.f10190a >= 0) {
                    boolean z13 = sVar2.f10192c;
                    pVar.f10169d = z13;
                    if (z13) {
                        pVar.f10168c = this.f1122r.i() - this.f1130z.f10191b;
                    } else {
                        pVar.f10168c = this.f1122r.m() + this.f1130z.f10191b;
                    }
                } else if (this.f1129y == Integer.MIN_VALUE) {
                    View viewQ2 = q(i19);
                    if (viewQ2 == null) {
                        if (v() > 0) {
                            pVar.f10169d = (this.f1128x < h0.F(u(0))) == this.f1125u;
                        }
                        pVar.a();
                    } else if (this.f1122r.e(viewQ2) > this.f1122r.n()) {
                        pVar.a();
                    } else if (this.f1122r.g(viewQ2) - this.f1122r.m() < 0) {
                        pVar.f10168c = this.f1122r.m();
                        pVar.f10169d = false;
                    } else if (this.f1122r.i() - this.f1122r.d(viewQ2) < 0) {
                        pVar.f10168c = this.f1122r.i();
                        pVar.f10169d = true;
                    } else {
                        if (pVar.f10169d) {
                            int iD2 = this.f1122r.d(viewQ2);
                            g gVar = this.f1122r;
                            iG2 = (Integer.MIN_VALUE == gVar.f765a ? 0 : gVar.n() - gVar.f765a) + iD2;
                        } else {
                            iG2 = this.f1122r.g(viewQ2);
                        }
                        pVar.f10168c = iG2;
                    }
                } else {
                    boolean z14 = this.f1125u;
                    pVar.f10169d = z14;
                    if (z14) {
                        pVar.f10168c = this.f1122r.i() - this.f1129y;
                    } else {
                        pVar.f10168c = this.f1122r.m() + this.f1129y;
                    }
                }
            }
            pVar.e = true;
        } else if (focusedChild != null && (this.f1122r.g(focusedChild) >= this.f1122r.i() || this.f1122r.d(focusedChild) <= this.f1122r.m())) {
            pVar.c(focusedChild, h0.F(focusedChild));
        }
        r rVar = this.f1121q;
        rVar.f10185f = rVar.f10187j >= 0 ? 1 : -1;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(s0Var, iArr);
        int iM2 = this.f1122r.m() + Math.max(0, iArr[0]);
        int iJ = this.f1122r.j() + Math.max(0, iArr[1]);
        if (s0Var.f10198g && (i15 = this.f1128x) != -1 && this.f1129y != Integer.MIN_VALUE && (viewQ = q(i15)) != null) {
            if (this.f1125u) {
                i16 = this.f1122r.i() - this.f1122r.d(viewQ);
                iG3 = this.f1129y;
            } else {
                iG3 = this.f1122r.g(viewQ) - this.f1122r.m();
                i16 = this.f1129y;
            }
            int i20 = i16 - iG3;
            if (i20 > 0) {
                iM2 += i20;
            } else {
                iJ -= i20;
            }
        }
        if (!pVar.f10169d ? !this.f1125u : this.f1125u) {
            i18 = 1;
        }
        X0(n0Var, s0Var, pVar, i18);
        p(n0Var);
        this.f1121q.f10189l = this.f1122r.k() == 0 && this.f1122r.h() == 0;
        this.f1121q.getClass();
        this.f1121q.i = 0;
        if (pVar.f10169d) {
            g1(pVar.f10167b, pVar.f10168c);
            r rVar2 = this.f1121q;
            rVar2.h = iM2;
            J0(n0Var, rVar2, s0Var, false);
            r rVar3 = this.f1121q;
            i12 = rVar3.f10182b;
            int i21 = rVar3.f10184d;
            int i22 = rVar3.f10183c;
            if (i22 > 0) {
                iJ += i22;
            }
            f1(pVar.f10167b, pVar.f10168c);
            r rVar4 = this.f1121q;
            rVar4.h = iJ;
            rVar4.f10184d += rVar4.e;
            J0(n0Var, rVar4, s0Var, false);
            r rVar5 = this.f1121q;
            i11 = rVar5.f10182b;
            int i23 = rVar5.f10183c;
            if (i23 > 0) {
                g1(i21, i12);
                r rVar6 = this.f1121q;
                rVar6.h = i23;
                J0(n0Var, rVar6, s0Var, false);
                i12 = this.f1121q.f10182b;
            }
        } else {
            f1(pVar.f10167b, pVar.f10168c);
            r rVar7 = this.f1121q;
            rVar7.h = iJ;
            J0(n0Var, rVar7, s0Var, false);
            r rVar8 = this.f1121q;
            i11 = rVar8.f10182b;
            int i24 = rVar8.f10184d;
            int i25 = rVar8.f10183c;
            if (i25 > 0) {
                iM2 += i25;
            }
            g1(pVar.f10167b, pVar.f10168c);
            r rVar9 = this.f1121q;
            rVar9.h = iM2;
            rVar9.f10184d += rVar9.e;
            J0(n0Var, rVar9, s0Var, false);
            r rVar10 = this.f1121q;
            int i26 = rVar10.f10182b;
            int i27 = rVar10.f10183c;
            if (i27 > 0) {
                f1(i24, i11);
                r rVar11 = this.f1121q;
                rVar11.h = i27;
                J0(n0Var, rVar11, s0Var, false);
                i11 = this.f1121q.f10182b;
            }
            i12 = i26;
        }
        if (v() > 0) {
            if (this.f1125u ^ this.f1126v) {
                int iR1 = R0(i11, n0Var, s0Var, true);
                i13 = i12 + iR1;
                i14 = i11 + iR1;
                iR0 = S0(i13, n0Var, s0Var, false);
            } else {
                int iS0 = S0(i12, n0Var, s0Var, true);
                i13 = i12 + iS0;
                i14 = i11 + iS0;
                iR0 = R0(i14, n0Var, s0Var, false);
            }
            i12 = i13 + iR0;
            i11 = i14 + iR0;
        }
        if (s0Var.f10200k && v() != 0 && !s0Var.f10198g && B0()) {
            List list2 = n0Var.f10157d;
            int size = list2.size();
            int iF = h0.F(u(0));
            int iE = 0;
            int iE2 = 0;
            for (int i28 = 0; i28 < size; i28++) {
                w0 w0Var = (w0) list2.get(i28);
                boolean zH = w0Var.h();
                View view = w0Var.f10230a;
                if (!zH) {
                    if ((w0Var.b() < iF) != this.f1125u) {
                        iE += this.f1122r.e(view);
                    } else {
                        iE2 += this.f1122r.e(view);
                    }
                }
            }
            this.f1121q.f10188k = list2;
            if (iE > 0) {
                g1(h0.F(U0()), i12);
                r rVar12 = this.f1121q;
                rVar12.h = iE;
                rVar12.f10183c = 0;
                rVar12.a(null);
                J0(n0Var, this.f1121q, s0Var, false);
            }
            if (iE2 > 0) {
                f1(h0.F(T0()), i11);
                r rVar13 = this.f1121q;
                rVar13.h = iE2;
                rVar13.f10183c = 0;
                list = null;
                rVar13.a(null);
                J0(n0Var, this.f1121q, s0Var, false);
            } else {
                list = null;
            }
            this.f1121q.f10188k = list;
        }
        if (s0Var.f10198g) {
            pVar.d();
        } else {
            g gVar2 = this.f1122r;
            gVar2.f765a = gVar2.n();
        }
        this.f1123s = this.f1126v;
    }

    public final int b1(int i, n0 n0Var, s0 s0Var) {
        if (v() != 0 && i != 0) {
            I0();
            this.f1121q.f10181a = true;
            int i10 = i > 0 ? 1 : -1;
            int iAbs = Math.abs(i);
            e1(i10, iAbs, true, s0Var);
            r rVar = this.f1121q;
            int iJ0 = J0(n0Var, rVar, s0Var, false) + rVar.f10186g;
            if (iJ0 >= 0) {
                if (iAbs > iJ0) {
                    i = i10 * iJ0;
                }
                this.f1122r.q(-i);
                this.f1121q.f10187j = i;
                return i;
            }
        }
        return 0;
    }

    @Override // x1.h0
    public final void c(String str) {
        if (this.f1130z == null) {
            super.c(str);
        }
    }

    @Override // x1.h0
    public void c0(s0 s0Var) {
        this.f1130z = null;
        this.f1128x = -1;
        this.f1129y = Integer.MIN_VALUE;
        this.A.d();
    }

    public final void c1(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException(v.f(i, "invalid orientation:"));
        }
        c(null);
        if (i != this.f1120p || this.f1122r == null) {
            g gVarB = g.b(this, i);
            this.f1122r = gVarB;
            this.A.f10166a = gVarB;
            this.f1120p = i;
            n0();
        }
    }

    @Override // x1.h0
    public final boolean d() {
        return this.f1120p == 0;
    }

    @Override // x1.h0
    public final void d0(Parcelable parcelable) {
        if (parcelable instanceof s) {
            s sVar = (s) parcelable;
            this.f1130z = sVar;
            if (this.f1128x != -1) {
                sVar.f10190a = -1;
            }
            n0();
        }
    }

    public void d1(boolean z4) {
        c(null);
        if (this.f1126v == z4) {
            return;
        }
        this.f1126v = z4;
        n0();
    }

    @Override // x1.h0
    public final boolean e() {
        return this.f1120p == 1;
    }

    @Override // x1.h0
    public final Parcelable e0() {
        s sVar = this.f1130z;
        if (sVar != null) {
            s sVar2 = new s();
            sVar2.f10190a = sVar.f10190a;
            sVar2.f10191b = sVar.f10191b;
            sVar2.f10192c = sVar.f10192c;
            return sVar2;
        }
        s sVar3 = new s();
        if (v() <= 0) {
            sVar3.f10190a = -1;
            return sVar3;
        }
        I0();
        boolean z4 = this.f1123s ^ this.f1125u;
        sVar3.f10192c = z4;
        if (z4) {
            View viewT0 = T0();
            sVar3.f10191b = this.f1122r.i() - this.f1122r.d(viewT0);
            sVar3.f10190a = h0.F(viewT0);
            return sVar3;
        }
        View viewU0 = U0();
        sVar3.f10190a = h0.F(viewU0);
        sVar3.f10191b = this.f1122r.g(viewU0) - this.f1122r.m();
        return sVar3;
    }

    public final void e1(int i, int i10, boolean z4, s0 s0Var) {
        int iM;
        this.f1121q.f10189l = this.f1122r.k() == 0 && this.f1122r.h() == 0;
        this.f1121q.f10185f = i;
        int[] iArr = this.D;
        iArr[0] = 0;
        iArr[1] = 0;
        C0(s0Var, iArr);
        int iMax = Math.max(0, iArr[0]);
        int iMax2 = Math.max(0, iArr[1]);
        boolean z10 = i == 1;
        r rVar = this.f1121q;
        int i11 = z10 ? iMax2 : iMax;
        rVar.h = i11;
        if (!z10) {
            iMax = iMax2;
        }
        rVar.i = iMax;
        if (z10) {
            rVar.h = this.f1122r.j() + i11;
            View viewT0 = T0();
            r rVar2 = this.f1121q;
            rVar2.e = this.f1125u ? -1 : 1;
            int iF = h0.F(viewT0);
            r rVar3 = this.f1121q;
            rVar2.f10184d = iF + rVar3.e;
            rVar3.f10182b = this.f1122r.d(viewT0);
            iM = this.f1122r.d(viewT0) - this.f1122r.i();
        } else {
            View viewU0 = U0();
            r rVar4 = this.f1121q;
            rVar4.h = this.f1122r.m() + rVar4.h;
            r rVar5 = this.f1121q;
            rVar5.e = this.f1125u ? 1 : -1;
            int iF2 = h0.F(viewU0);
            r rVar6 = this.f1121q;
            rVar5.f10184d = iF2 + rVar6.e;
            rVar6.f10182b = this.f1122r.g(viewU0);
            iM = (-this.f1122r.g(viewU0)) + this.f1122r.m();
        }
        r rVar7 = this.f1121q;
        rVar7.f10183c = i10;
        if (z4) {
            rVar7.f10183c = i10 - iM;
        }
        rVar7.f10186g = iM;
    }

    public final void f1(int i, int i10) {
        this.f1121q.f10183c = this.f1122r.i() - i10;
        r rVar = this.f1121q;
        rVar.e = this.f1125u ? -1 : 1;
        rVar.f10184d = i;
        rVar.f10185f = 1;
        rVar.f10182b = i10;
        rVar.f10186g = Integer.MIN_VALUE;
    }

    public final void g1(int i, int i10) {
        this.f1121q.f10183c = i10 - this.f1122r.m();
        r rVar = this.f1121q;
        rVar.f10184d = i;
        rVar.e = this.f1125u ? 1 : -1;
        rVar.f10185f = -1;
        rVar.f10182b = i10;
        rVar.f10186g = Integer.MIN_VALUE;
    }

    @Override // x1.h0
    public final void h(int i, int i10, s0 s0Var, h hVar) {
        if (this.f1120p != 0) {
            i = i10;
        }
        if (v() == 0 || i == 0) {
            return;
        }
        I0();
        e1(i > 0 ? 1 : -1, Math.abs(i), true, s0Var);
        D0(s0Var, this.f1121q, hVar);
    }

    @Override // x1.h0
    public final void i(int i, h hVar) {
        boolean z4;
        int i10;
        s sVar = this.f1130z;
        if (sVar == null || (i10 = sVar.f10190a) < 0) {
            a1();
            z4 = this.f1125u;
            i10 = this.f1128x;
            if (i10 == -1) {
                i10 = z4 ? i - 1 : 0;
            }
        } else {
            z4 = sVar.f10192c;
        }
        int i11 = z4 ? -1 : 1;
        for (int i12 = 0; i12 < this.C && i10 >= 0 && i10 < i; i12++) {
            hVar.b(i10, 0);
            i10 += i11;
        }
    }

    @Override // x1.h0
    public final int j(s0 s0Var) {
        return E0(s0Var);
    }

    @Override // x1.h0
    public int k(s0 s0Var) {
        return F0(s0Var);
    }

    @Override // x1.h0
    public int l(s0 s0Var) {
        return G0(s0Var);
    }

    @Override // x1.h0
    public final int m(s0 s0Var) {
        return E0(s0Var);
    }

    @Override // x1.h0
    public int n(s0 s0Var) {
        return F0(s0Var);
    }

    @Override // x1.h0
    public int o(s0 s0Var) {
        return G0(s0Var);
    }

    @Override // x1.h0
    public int o0(int i, n0 n0Var, s0 s0Var) {
        if (this.f1120p == 1) {
            return 0;
        }
        return b1(i, n0Var, s0Var);
    }

    @Override // x1.h0
    public final void p0(int i) {
        this.f1128x = i;
        this.f1129y = Integer.MIN_VALUE;
        s sVar = this.f1130z;
        if (sVar != null) {
            sVar.f10190a = -1;
        }
        n0();
    }

    @Override // x1.h0
    public final View q(int i) {
        int iV = v();
        if (iV == 0) {
            return null;
        }
        int iF = i - h0.F(u(0));
        if (iF >= 0 && iF < iV) {
            View viewU = u(iF);
            if (h0.F(viewU) == i) {
                return viewU;
            }
        }
        return super.q(i);
    }

    @Override // x1.h0
    public int q0(int i, n0 n0Var, s0 s0Var) {
        if (this.f1120p == 0) {
            return 0;
        }
        return b1(i, n0Var, s0Var);
    }

    @Override // x1.h0
    public i0 r() {
        return new i0(-2, -2);
    }

    @Override // x1.h0
    public final boolean x0() {
        if (this.f10091m != 1073741824 && this.f10090l != 1073741824) {
            int iV = v();
            for (int i = 0; i < iV; i++) {
                ViewGroup.LayoutParams layoutParams = u(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // x1.h0
    public void z0(RecyclerView recyclerView, int i) {
        t tVar = new t(recyclerView.getContext());
        tVar.f10204a = i;
        A0(tVar);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i10) {
        this.f1120p = 1;
        this.f1124t = false;
        this.f1125u = false;
        this.f1126v = false;
        this.f1127w = true;
        this.f1128x = -1;
        this.f1129y = Integer.MIN_VALUE;
        this.f1130z = null;
        this.A = new p();
        this.B = new q();
        this.C = 2;
        this.D = new int[2];
        g0 g0VarG = h0.G(context, attributeSet, i, i10);
        c1(g0VarG.f10070a);
        boolean z4 = g0VarG.f10072c;
        c(null);
        if (z4 != this.f1124t) {
            this.f1124t = z4;
            n0();
        }
        d1(g0VarG.f10073d);
    }

    @Override // x1.h0
    public final void Q(RecyclerView recyclerView) {
    }

    public void X0(n0 n0Var, s0 s0Var, p pVar, int i) {
    }
}

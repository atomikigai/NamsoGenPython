package x1;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f10082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public RecyclerView f10083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s5.j f10084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s5.j f10085d;
    public t e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f10086f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10087g;
    public final boolean h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f10088j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f10089k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10090l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f10091m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f10092n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f10093o;

    public h0() {
        v1.d dVar = new v1.d(this);
        ta.c cVar = new ta.c(this);
        this.f10084c = new s5.j(dVar);
        this.f10085d = new s5.j(cVar);
        this.f10086f = false;
        this.f10087g = false;
        this.h = true;
        this.i = true;
    }

    public static int F(View view) {
        return ((i0) view.getLayoutParams()).f10105a.b();
    }

    public static g0 G(Context context, AttributeSet attributeSet, int i, int i10) {
        g0 g0Var = new g0();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w1.a.f9447a, i, i10);
        g0Var.f10070a = typedArrayObtainStyledAttributes.getInt(0, 1);
        g0Var.f10071b = typedArrayObtainStyledAttributes.getInt(10, 1);
        g0Var.f10072c = typedArrayObtainStyledAttributes.getBoolean(9, false);
        g0Var.f10073d = typedArrayObtainStyledAttributes.getBoolean(11, false);
        typedArrayObtainStyledAttributes.recycle();
        return g0Var;
    }

    public static boolean K(int i, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        if (i11 > 0 && i != i11) {
            return false;
        }
        if (mode == Integer.MIN_VALUE) {
            return size >= i;
        }
        if (mode != 0) {
            return mode == 1073741824 && size == i;
        }
        return true;
    }

    public static void L(View view, int i, int i10, int i11, int i12) {
        i0 i0Var = (i0) view.getLayoutParams();
        Rect rect = i0Var.f10106b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) i0Var).leftMargin, i10 + rect.top + ((ViewGroup.MarginLayoutParams) i0Var).topMargin, (i11 - rect.right) - ((ViewGroup.MarginLayoutParams) i0Var).rightMargin, (i12 - rect.bottom) - ((ViewGroup.MarginLayoutParams) i0Var).bottomMargin);
    }

    public static int g(int i, int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? Math.max(i10, i11) : size;
        }
        return Math.min(size, Math.max(i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    /* JADX WARN: Code duplicated, block: B:5:0x0010  */
    public static int w(int i, int i10, int i11, int i12, boolean z4) {
        int iMax = Math.max(0, i - i11);
        if (z4) {
            if (i12 >= 0) {
                i10 = 1073741824;
            } else if (i12 != -1 || (i10 != Integer.MIN_VALUE && (i10 == 0 || i10 != 1073741824))) {
                i10 = 0;
                i12 = 0;
            } else {
                i12 = iMax;
            }
        } else if (i12 >= 0) {
            i10 = 1073741824;
        } else if (i12 == -1) {
            i12 = iMax;
        } else if (i12 != -2) {
            i10 = 0;
            i12 = 0;
        } else if (i10 == Integer.MIN_VALUE || i10 == 1073741824) {
            i12 = iMax;
            i10 = Integer.MIN_VALUE;
        } else {
            i12 = iMax;
            i10 = 0;
        }
        return View.MeasureSpec.makeMeasureSpec(i12, i10);
    }

    public final int A() {
        RecyclerView recyclerView = this.f10083b;
        WeakHashMap weakHashMap = q0.v0.f7946a;
        return q0.e0.d(recyclerView);
    }

    public final void A0(t tVar) {
        t tVar2 = this.e;
        if (tVar2 != null && tVar != tVar2 && tVar2.e) {
            tVar2.i();
        }
        this.e = tVar;
        RecyclerView recyclerView = this.f10083b;
        v0 v0Var = recyclerView.f1150p0;
        v0Var.f10224r.removeCallbacks(v0Var);
        v0Var.f10221c.abortAnimation();
        if (tVar.h) {
            Log.w("RecyclerView", "An instance of " + tVar.getClass().getSimpleName() + " was started more than once. Each instance of" + tVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        tVar.f10205b = recyclerView;
        tVar.f10206c = this;
        int i = tVar.f10204a;
        if (i == -1) {
            throw new IllegalArgumentException("Invalid target position");
        }
        recyclerView.f1155s0.f10193a = i;
        tVar.e = true;
        tVar.f10207d = true;
        tVar.f10208f = recyclerView.f1166y.q(i);
        tVar.f10205b.f1150p0.b();
        tVar.h = true;
    }

    public final int B() {
        RecyclerView recyclerView = this.f10083b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public boolean B0() {
        return false;
    }

    public final int C() {
        RecyclerView recyclerView = this.f10083b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f10083b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f10083b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int H(n0 n0Var, s0 s0Var) {
        return -1;
    }

    public final void I(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((i0) view.getLayoutParams()).f10106b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f10083b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f10083b.f1162w;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean J() {
        return false;
    }

    public void M(int i) {
        RecyclerView recyclerView = this.f10083b;
        if (recyclerView != null) {
            int iE = recyclerView.f1140f.e();
            for (int i10 = 0; i10 < iE; i10++) {
                recyclerView.f1140f.d(i10).offsetLeftAndRight(i);
            }
        }
    }

    public void N(int i) {
        RecyclerView recyclerView = this.f10083b;
        if (recyclerView != null) {
            int iE = recyclerView.f1140f.e();
            for (int i10 = 0; i10 < iE; i10++) {
                recyclerView.f1140f.d(i10).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void Q(RecyclerView recyclerView);

    public abstract View R(View view, int i, n0 n0Var, s0 s0Var);

    public void S(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f10083b;
        n0 n0Var = recyclerView.f1135c;
        if (accessibilityEvent == null) {
            return;
        }
        boolean z4 = true;
        if (!recyclerView.canScrollVertically(1) && !this.f10083b.canScrollVertically(-1) && !this.f10083b.canScrollHorizontally(-1) && !this.f10083b.canScrollHorizontally(1)) {
            z4 = false;
        }
        accessibilityEvent.setScrollable(z4);
        z zVar = this.f10083b.f1164x;
        if (zVar != null) {
            accessibilityEvent.setItemCount(zVar.a());
        }
    }

    public void T(n0 n0Var, s0 s0Var, r0.l lVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = lVar.f8119a;
        if (this.f10083b.canScrollVertically(-1) || this.f10083b.canScrollHorizontally(-1)) {
            lVar.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f10083b.canScrollVertically(1) || this.f10083b.canScrollHorizontally(1)) {
            lVar.a(4096);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) n5.c.a(H(n0Var, s0Var), x(n0Var, s0Var), 0).f7282a);
    }

    public final void U(View view, r0.l lVar) {
        w0 w0VarM = RecyclerView.M(view);
        if (w0VarM == null || w0VarM.h()) {
            return;
        }
        b bVar = this.f10082a;
        if (bVar.f10023c.contains(w0VarM.f10230a)) {
            return;
        }
        RecyclerView recyclerView = this.f10083b;
        V(recyclerView.f1135c, recyclerView.f1155s0, view, lVar);
    }

    public final void b(View view, boolean z4, int i) {
        w0 w0VarM = RecyclerView.M(view);
        if (z4 || w0VarM.h()) {
            r.k kVar = (r.k) this.f10083b.f1152r.f8445b;
            i1 i1VarA = (i1) kVar.get(w0VarM);
            if (i1VarA == null) {
                i1VarA = i1.a();
                kVar.put(w0VarM, i1VarA);
            }
            i1VarA.f10110a |= 1;
        } else {
            this.f10083b.f1152r.z(w0VarM);
        }
        i0 i0Var = (i0) view.getLayoutParams();
        if (w0VarM.p() || w0VarM.i()) {
            if (w0VarM.i()) {
                w0VarM.f10240n.l(w0VarM);
            } else {
                w0VarM.f10236j &= -33;
            }
            this.f10082a.b(view, i, view.getLayoutParams(), false);
        } else {
            if (view.getParent() == this.f10083b) {
                b bVar = this.f10082a;
                d6.e eVar = bVar.f10022b;
                int iIndexOfChild = ((RecyclerView) bVar.f10021a.f8662a).indexOfChild(view);
                int iB = (iIndexOfChild == -1 || eVar.d(iIndexOfChild)) ? -1 : iIndexOfChild - eVar.b(iIndexOfChild);
                if (i == -1) {
                    i = this.f10082a.e();
                }
                if (iB == -1) {
                    StringBuilder sb2 = new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    sb2.append(this.f10083b.indexOfChild(view));
                    throw new IllegalStateException(u3.b.a(this.f10083b, sb2));
                }
                if (iB != i) {
                    h0 h0Var = this.f10083b.f1166y;
                    View viewU = h0Var.u(iB);
                    if (viewU == null) {
                        throw new IllegalArgumentException("Cannot move a child from non-existing index:" + iB + h0Var.f10083b.toString());
                    }
                    h0Var.u(iB);
                    h0Var.f10082a.c(iB);
                    i0 i0Var2 = (i0) viewU.getLayoutParams();
                    w0 w0VarM2 = RecyclerView.M(viewU);
                    if (w0VarM2.h()) {
                        r.k kVar2 = (r.k) h0Var.f10083b.f1152r.f8445b;
                        i1 i1VarA2 = (i1) kVar2.get(w0VarM2);
                        if (i1VarA2 == null) {
                            i1VarA2 = i1.a();
                            kVar2.put(w0VarM2, i1VarA2);
                        }
                        i1VarA2.f10110a = 1 | i1VarA2.f10110a;
                    } else {
                        h0Var.f10083b.f1152r.z(w0VarM2);
                    }
                    h0Var.f10082a.b(viewU, i, i0Var2, w0VarM2.h());
                }
            } else {
                this.f10082a.a(view, false, i);
                i0Var.f10107c = true;
                t tVar = this.e;
                if (tVar != null && tVar.e) {
                    tVar.f10205b.getClass();
                    w0 w0VarM3 = RecyclerView.M(view);
                    if ((w0VarM3 != null ? w0VarM3.b() : -1) == tVar.f10204a) {
                        tVar.f10208f = view;
                        if (RecyclerView.M0) {
                            Log.d("RecyclerView", "smooth scroll target view has been attached");
                        }
                    }
                }
            }
        }
        if (i0Var.f10108d) {
            if (RecyclerView.M0) {
                Log.d("RecyclerView", "consuming pending invalidate on child " + i0Var.f10105a);
            }
            w0VarM.f10230a.invalidate();
            i0Var.f10108d = false;
        }
    }

    public abstract void b0(n0 n0Var, s0 s0Var);

    public void c(String str) {
        RecyclerView recyclerView = this.f10083b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract void c0(s0 s0Var);

    public abstract boolean d();

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(i0 i0Var) {
        return i0Var != null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0062 A[PHI: r3
      0x0062: PHI (r3v8 int) = (r3v5 int), (r3v11 int) binds: [B:28:0x007e, B:20:0x0054] A[DONT_GENERATE, DONT_INLINE]] */
    public boolean g0(n0 n0Var, s0 s0Var, int i, Bundle bundle) {
        int iE;
        int iC;
        if (this.f10083b != null) {
            int iHeight = this.f10093o;
            int iWidth = this.f10092n;
            Rect rect = new Rect();
            if (this.f10083b.getMatrix().isIdentity() && this.f10083b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                iE = this.f10083b.canScrollVertically(1) ? (iHeight - E()) - B() : 0;
                if (this.f10083b.canScrollHorizontally(1)) {
                    iC = (iWidth - C()) - D();
                } else {
                    iC = 0;
                }
            } else if (i != 8192) {
                iE = 0;
                iC = 0;
            } else {
                iE = this.f10083b.canScrollVertically(-1) ? -((iHeight - E()) - B()) : 0;
                if (this.f10083b.canScrollHorizontally(-1)) {
                    iC = -((iWidth - C()) - D());
                } else {
                    iC = 0;
                }
            }
            if (iE != 0 || iC != 0) {
                this.f10083b.i0(iC, iE, true);
                return true;
            }
        }
        return false;
    }

    public final void h0(n0 n0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            if (!RecyclerView.M(u(iV)).o()) {
                k0(iV, n0Var);
            }
        }
    }

    public final void i0(n0 n0Var) {
        ArrayList arrayList = n0Var.f10154a;
        int size = arrayList.size();
        for (int i = size - 1; i >= 0; i--) {
            View view = ((w0) arrayList.get(i)).f10230a;
            w0 w0VarM = RecyclerView.M(view);
            if (!w0VarM.o()) {
                w0VarM.n(false);
                if (w0VarM.j()) {
                    this.f10083b.removeDetachedView(view, false);
                }
                e0 e0Var = this.f10083b.f1132a0;
                if (e0Var != null) {
                    e0Var.d(w0VarM);
                }
                w0VarM.n(true);
                w0 w0VarM2 = RecyclerView.M(view);
                w0VarM2.f10240n = null;
                w0VarM2.f10241o = false;
                w0VarM2.f10236j &= -33;
                n0Var.i(w0VarM2);
            }
        }
        arrayList.clear();
        ArrayList arrayList2 = n0Var.f10155b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f10083b.invalidate();
        }
    }

    public abstract int j(s0 s0Var);

    public final void j0(View view, n0 n0Var) {
        b bVar = this.f10082a;
        ta.c cVar = bVar.f10021a;
        int i = bVar.f10024d;
        if (i == 1) {
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
        if (i == 2) {
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        try {
            bVar.f10024d = 1;
            bVar.e = view;
            int iIndexOfChild = ((RecyclerView) cVar.f8662a).indexOfChild(view);
            if (iIndexOfChild >= 0) {
                if (bVar.f10022b.g(iIndexOfChild)) {
                    bVar.j(view);
                }
                cVar.i(iIndexOfChild);
            }
            bVar.f10024d = 0;
            bVar.e = null;
            n0Var.h(view);
        } catch (Throwable th) {
            bVar.f10024d = 0;
            bVar.e = null;
            throw th;
        }
    }

    public abstract int k(s0 s0Var);

    public final void k0(int i, n0 n0Var) {
        View viewU = u(i);
        l0(i);
        n0Var.h(viewU);
    }

    public abstract int l(s0 s0Var);

    public final void l0(int i) {
        if (u(i) != null) {
            b bVar = this.f10082a;
            ta.c cVar = bVar.f10021a;
            int i10 = bVar.f10024d;
            if (i10 == 1) {
                throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
            }
            if (i10 == 2) {
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            try {
                int iF = bVar.f(i);
                View childAt = ((RecyclerView) cVar.f8662a).getChildAt(iF);
                if (childAt != null) {
                    bVar.f10024d = 1;
                    bVar.e = childAt;
                    if (bVar.f10022b.g(iF)) {
                        bVar.j(childAt);
                    }
                    cVar.i(iF);
                }
            } finally {
                bVar.f10024d = 0;
                bVar.e = null;
            }
        }
    }

    public abstract int m(s0 s0Var);

    /* JADX WARN: Code duplicated, block: B:28:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
    public boolean m0(RecyclerView recyclerView, View view, Rect rect, boolean z4, boolean z10) {
        int iC = C();
        int iE = E();
        int iD = this.f10092n - D();
        int iB = this.f10093o - B();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int iWidth = rect.width() + left;
        int iHeight = rect.height() + top;
        int i = left - iC;
        int iMin = Math.min(0, i);
        int i10 = top - iE;
        int iMin2 = Math.min(0, i10);
        int i11 = iWidth - iD;
        int iMax = Math.max(0, i11);
        int iMax2 = Math.max(0, iHeight - iB);
        if (A() != 1) {
            if (iMin == 0) {
                iMin = Math.min(i, iMax);
            }
            iMax = iMin;
        } else if (iMax == 0) {
            iMax = Math.max(iMin, i11);
        }
        if (iMin2 == 0) {
            iMin2 = Math.min(i10, iMax2);
        }
        int[] iArr = {iMax, iMin2};
        int i12 = iArr[0];
        int i13 = iArr[1];
        if (z10) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int iC2 = C();
                int iE2 = E();
                int iD2 = this.f10092n - D();
                int iB2 = this.f10093o - B();
                Rect rect2 = this.f10083b.f1158u;
                y(focusedChild, rect2);
                if (rect2.left - i12 < iD2 && rect2.right - i12 > iC2 && rect2.top - i13 < iB2 && rect2.bottom - i13 > iE2) {
                    if (i12 == 0) {
                    }
                    if (z4) {
                        recyclerView.scrollBy(i12, i13);
                        return true;
                    }
                    recyclerView.i0(i12, i13, false);
                    return true;
                }
            }
        } else if (i12 == 0 || i13 != 0) {
            if (z4) {
                recyclerView.scrollBy(i12, i13);
                return true;
            }
            recyclerView.i0(i12, i13, false);
            return true;
        }
        return false;
    }

    public abstract int n(s0 s0Var);

    public final void n0() {
        RecyclerView recyclerView = this.f10083b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int o(s0 s0Var);

    public abstract int o0(int i, n0 n0Var, s0 s0Var);

    public final void p(n0 n0Var) {
        for (int iV = v() - 1; iV >= 0; iV--) {
            View viewU = u(iV);
            w0 w0VarM = RecyclerView.M(viewU);
            if (w0VarM.o()) {
                if (RecyclerView.M0) {
                    Log.d("RecyclerView", "ignoring view " + w0VarM);
                }
            } else if (!w0VarM.f() || w0VarM.h() || this.f10083b.f1164x.f10252b) {
                u(iV);
                this.f10082a.c(iV);
                n0Var.j(viewU);
                this.f10083b.f1152r.z(w0VarM);
            } else {
                l0(iV);
                n0Var.i(w0VarM);
            }
        }
    }

    public abstract void p0(int i);

    public View q(int i) {
        int iV = v();
        for (int i10 = 0; i10 < iV; i10++) {
            View viewU = u(i10);
            w0 w0VarM = RecyclerView.M(viewU);
            if (w0VarM != null && w0VarM.b() == i && !w0VarM.o() && (this.f10083b.f1155s0.f10198g || !w0VarM.h())) {
                return viewU;
            }
        }
        return null;
    }

    public abstract int q0(int i, n0 n0Var, s0 s0Var);

    public abstract i0 r();

    public final void r0(RecyclerView recyclerView) {
        s0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public i0 s(Context context, AttributeSet attributeSet) {
        return new i0(context, attributeSet);
    }

    public final void s0(int i, int i10) {
        this.f10092n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.f10090l = mode;
        if (mode == 0 && !RecyclerView.P0) {
            this.f10092n = 0;
        }
        this.f10093o = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i10);
        this.f10091m = mode2;
        if (mode2 != 0 || RecyclerView.P0) {
            return;
        }
        this.f10093o = 0;
    }

    public i0 t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof i0) {
            return new i0((i0) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new i0((ViewGroup.MarginLayoutParams) layoutParams) : new i0(layoutParams);
    }

    public void t0(Rect rect, int i, int i10) {
        int iD = D() + C() + rect.width();
        int iB = B() + E() + rect.height();
        RecyclerView recyclerView = this.f10083b;
        WeakHashMap weakHashMap = q0.v0.f7946a;
        this.f10083b.setMeasuredDimension(g(i, iD, q0.d0.e(recyclerView)), g(i10, iB, q0.d0.d(this.f10083b)));
    }

    public final View u(int i) {
        b bVar = this.f10082a;
        if (bVar != null) {
            return bVar.d(i);
        }
        return null;
    }

    public final void u0(int i, int i10) {
        int iV = v();
        if (iV == 0) {
            this.f10083b.q(i, i10);
            return;
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        int i13 = Integer.MIN_VALUE;
        int i14 = Integer.MAX_VALUE;
        for (int i15 = 0; i15 < iV; i15++) {
            View viewU = u(i15);
            Rect rect = this.f10083b.f1158u;
            y(viewU, rect);
            int i16 = rect.left;
            if (i16 < i14) {
                i14 = i16;
            }
            int i17 = rect.right;
            if (i17 > i11) {
                i11 = i17;
            }
            int i18 = rect.top;
            if (i18 < i12) {
                i12 = i18;
            }
            int i19 = rect.bottom;
            if (i19 > i13) {
                i13 = i19;
            }
        }
        this.f10083b.f1158u.set(i14, i12, i11, i13);
        t0(this.f10083b.f1158u, i, i10);
    }

    public final int v() {
        b bVar = this.f10082a;
        if (bVar != null) {
            return bVar.e();
        }
        return 0;
    }

    public final void v0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f10083b = null;
            this.f10082a = null;
            this.f10092n = 0;
            this.f10093o = 0;
        } else {
            this.f10083b = recyclerView;
            this.f10082a = recyclerView.f1140f;
            this.f10092n = recyclerView.getWidth();
            this.f10093o = recyclerView.getHeight();
        }
        this.f10090l = 1073741824;
        this.f10091m = 1073741824;
    }

    public final boolean w0(View view, int i, int i10, i0 i0Var) {
        return (!view.isLayoutRequested() && this.h && K(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) i0Var).width) && K(view.getHeight(), i10, ((ViewGroup.MarginLayoutParams) i0Var).height)) ? false : true;
    }

    public int x(n0 n0Var, s0 s0Var) {
        return -1;
    }

    public boolean x0() {
        return false;
    }

    public void y(View view, Rect rect) {
        boolean z4 = RecyclerView.L0;
        i0 i0Var = (i0) view.getLayoutParams();
        Rect rect2 = i0Var.f10106b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) i0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) i0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) i0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) i0Var).bottomMargin);
    }

    public final boolean y0(View view, int i, int i10, i0 i0Var) {
        return (this.h && K(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) i0Var).width) && K(view.getMeasuredHeight(), i10, ((ViewGroup.MarginLayoutParams) i0Var).height)) ? false : true;
    }

    public final int z() {
        RecyclerView recyclerView = this.f10083b;
        z adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (adapter != null) {
            return adapter.a();
        }
        return 0;
    }

    public abstract void z0(RecyclerView recyclerView, int i);

    public void O() {
    }

    public void X() {
    }

    public void P(RecyclerView recyclerView) {
    }

    public void d0(Parcelable parcelable) {
    }

    public void f0(int i) {
    }

    public void W(int i, int i10) {
    }

    public void Y(int i, int i10) {
    }

    public void Z(int i, int i10) {
    }

    public void a0(int i, int i10) {
    }

    public void i(int i, androidx.datastore.preferences.protobuf.h hVar) {
    }

    public void V(n0 n0Var, s0 s0Var, View view, r0.l lVar) {
    }

    public void h(int i, int i10, s0 s0Var, androidx.datastore.preferences.protobuf.h hVar) {
    }
}

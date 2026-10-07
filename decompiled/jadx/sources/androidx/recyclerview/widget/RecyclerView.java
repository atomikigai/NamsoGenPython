package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.datastore.preferences.protobuf.h;
import androidx.viewpager2.adapter.b;
import com.google.android.gms.common.api.f;
import da.v;
import fa.c1;
import fd.n;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.p;
import q0.s;
import q3.e;
import s2.g;
import s5.j;
import ta.c;
import v1.d;
import x1.a;
import x1.c0;
import x1.d0;
import x1.e0;
import x1.f0;
import x1.h0;
import x1.i;
import x1.i0;
import x1.i1;
import x1.j0;
import x1.k;
import x1.k0;
import x1.l0;
import x1.m;
import x1.m0;
import x1.n0;
import x1.o0;
import x1.p0;
import x1.s0;
import x1.t;
import x1.t0;
import x1.u0;
import x1.v0;
import x1.w0;
import x1.x;
import x1.y;
import x1.y0;
import x1.z;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class RecyclerView extends ViewGroup {
    public static boolean L0 = false;
    public static boolean M0 = false;
    public static final int[] N0 = {R.attr.nestedScrollingEnabled};
    public static final float O0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean P0 = true;
    public static final boolean Q0 = true;
    public static final boolean R0 = true;
    public static final Class[] S0;
    public static final y T0;
    public static final t0 U0;
    public final ArrayList A;
    public final int[] A0;
    public final ArrayList B;
    public p B0;
    public k C;
    public final int[] C0;
    public boolean D;
    public final int[] D0;
    public boolean E;
    public final int[] E0;
    public boolean F;
    public final ArrayList F0;
    public int G;
    public final x G0;
    public boolean H;
    public boolean H0;
    public boolean I;
    public int I0;
    public boolean J;
    public int J0;
    public int K;
    public final d K0;
    public boolean L;
    public final AccessibilityManager M;
    public ArrayList N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public d0 S;
    public EdgeEffect T;
    public EdgeEffect U;
    public EdgeEffect V;
    public EdgeEffect W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1131a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public e0 f1132a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f1133b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f1134b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n0 f1135c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f1136c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p0 f1137d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public VelocityTracker f1138d0;
    public final n e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f1139e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x1.b f1140f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f1141f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f1142g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f1143h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f1144i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public j0 f1145j0;
    public final int k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final int f1146l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final float f1147m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final float f1148n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f1149o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final v0 f1150p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public m f1151q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f1152r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final h f1153r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f1154s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final s0 f1155s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final x f1156t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public k0 f1157t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Rect f1158u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ArrayList f1159u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Rect f1160v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public boolean f1161v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final RectF f1162w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f1163w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public z f1164x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final e f1165x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h0 f1166y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f1167y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final ArrayList f1168z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public y0 f1169z0;

    static {
        Class cls = Integer.TYPE;
        S0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        T0 = new y(0);
        U0 = new t0();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, app.namso_gen.spacehowen.R.attr.recyclerViewStyle);
    }

    public static RecyclerView H(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView recyclerViewH = H(viewGroup.getChildAt(i));
            if (recyclerViewH != null) {
                return recyclerViewH;
            }
        }
        return null;
    }

    public static w0 M(View view) {
        if (view == null) {
            return null;
        }
        return ((i0) view.getLayoutParams()).f10105a;
    }

    private p getScrollingChildHelper() {
        if (this.B0 == null) {
            this.B0 = new p(this);
        }
        return this.B0;
    }

    public static void l(w0 w0Var) {
        WeakReference weakReference = w0Var.f10231b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == w0Var.f10230a) {
                    return;
                }
                Object parent = view.getParent();
                view = parent instanceof View ? (View) parent : null;
            }
            w0Var.f10231b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i > 0 && edgeEffect != null && c1.t(edgeEffect) != 0.0f) {
            int iRound = Math.round(c1.z(edgeEffect, ((-i) * 4.0f) / i10, 0.5f) * ((-i10) / 4.0f));
            if (iRound != i) {
                edgeEffect.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || edgeEffect2 == null || c1.t(edgeEffect2) == 0.0f) {
            return i;
        }
        float f10 = i10;
        int iRound2 = Math.round(c1.z(edgeEffect2, (i * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
        if (iRound2 != i) {
            edgeEffect2.finish();
        }
        return i - iRound2;
    }

    public static void setDebugAssertionsEnabled(boolean z4) {
        L0 = z4;
    }

    public static void setVerboseLoggingEnabled(boolean z4) {
        M0 = z4;
    }

    public final void A() {
        if (this.V != null) {
            return;
        }
        ((t0) this.S).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.V = edgeEffect;
        if (this.f1154s) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void B() {
        if (this.U != null) {
            return;
        }
        ((t0) this.S).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.U = edgeEffect;
        if (this.f1154s) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String C() {
        return " " + super.toString() + ", adapter:" + this.f1164x + ", layout:" + this.f1166y + ", context:" + getContext();
    }

    public final void D(s0 s0Var) {
        if (getScrollState() != 2) {
            s0Var.getClass();
            return;
        }
        OverScroller overScroller = this.f1150p0.f10221c;
        overScroller.getFinalX();
        overScroller.getCurrX();
        s0Var.getClass();
        overScroller.getFinalY();
        overScroller.getCurrY();
    }

    public final View E(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0061 A[SYNTHETIC] */
    public final boolean F(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            k kVar = (k) arrayList.get(i);
            int i10 = kVar.f10132v;
            if (i10 == 1) {
                boolean zD = kVar.d(motionEvent.getX(), motionEvent.getY());
                boolean zC = kVar.c(motionEvent.getX(), motionEvent.getY());
                if (motionEvent.getAction() == 0 && (zD || zC)) {
                    if (zC) {
                        kVar.f10133w = 1;
                        kVar.f10126p = (int) motionEvent.getX();
                    } else if (zD) {
                        kVar.f10133w = 2;
                        kVar.f10123m = (int) motionEvent.getY();
                    }
                    kVar.f(2);
                    if (action != 3) {
                        this.C = kVar;
                        return true;
                    }
                }
            } else if (i10 != 2) {
                continue;
            } else if (action != 3) {
                this.C = kVar;
                return true;
            }
        }
        return false;
    }

    public final void G(int[] iArr) {
        int iE = this.f1140f.e();
        if (iE == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = f.API_PRIORITY_OTHER;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < iE; i11++) {
            w0 w0VarM = M(this.f1140f.d(i11));
            if (!w0VarM.o()) {
                int iB = w0VarM.b();
                if (iB < i) {
                    i = iB;
                }
                if (iB > i10) {
                    i10 = iB;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i10;
    }

    public final w0 I(int i) {
        w0 w0Var = null;
        if (this.O) {
            return null;
        }
        int iH = this.f1140f.h();
        for (int i10 = 0; i10 < iH; i10++) {
            w0 w0VarM = M(this.f1140f.g(i10));
            if (w0VarM != null && !w0VarM.h() && J(w0VarM) == i) {
                if (!this.f1140f.f10023c.contains(w0VarM.f10230a)) {
                    return w0VarM;
                }
                w0Var = w0VarM;
            }
        }
        return w0Var;
    }

    public final int J(w0 w0Var) {
        if ((w0Var.f10236j & 524) == 0 && w0Var.e()) {
            int i = w0Var.f10232c;
            ArrayList arrayList = (ArrayList) this.e.f3961f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar = (a) arrayList.get(i10);
                int i11 = aVar.f10012a;
                if (i11 != 1) {
                    if (i11 == 2) {
                        int i12 = aVar.f10013b;
                        if (i12 <= i) {
                            int i13 = aVar.f10014c;
                            if (i12 + i13 <= i) {
                                i -= i13;
                            }
                        } else {
                            continue;
                        }
                    } else if (i11 == 8) {
                        int i14 = aVar.f10013b;
                        if (i14 == i) {
                            i = aVar.f10014c;
                        } else {
                            if (i14 < i) {
                                i--;
                            }
                            if (aVar.f10014c <= i) {
                                i++;
                            }
                        }
                    }
                } else if (aVar.f10013b <= i) {
                    i += aVar.f10014c;
                }
            }
            return i;
        }
        return -1;
    }

    public final long K(w0 w0Var) {
        return this.f1164x.f10252b ? w0Var.e : w0Var.f10232c;
    }

    public final w0 L(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return M(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public final Rect N(View view) {
        i0 i0Var = (i0) view.getLayoutParams();
        boolean z4 = i0Var.f10107c;
        Rect rect = i0Var.f10106b;
        if (!z4 || (this.f1155s0.f10198g && (i0Var.f10105a.k() || i0Var.f10105a.f()))) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.f1158u;
            rect2.set(0, 0, 0, 0);
            ((f0) arrayList.get(i)).getClass();
            ((i0) view.getLayoutParams()).f10105a.getClass();
            rect2.set(0, 0, 0, 0);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        i0Var.f10107c = false;
        return rect;
    }

    public final boolean O() {
        return !this.F || this.O || this.e.k();
    }

    public final boolean P() {
        return this.Q > 0;
    }

    public final void Q(int i) {
        if (this.f1166y == null) {
            return;
        }
        setScrollState(2);
        this.f1166y.p0(i);
        awakenScrollBars();
    }

    public final void R() {
        int iH = this.f1140f.h();
        for (int i = 0; i < iH; i++) {
            ((i0) this.f1140f.g(i).getLayoutParams()).f10107c = true;
        }
        ArrayList arrayList = this.f1135c.f10156c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            i0 i0Var = (i0) ((w0) arrayList.get(i10)).f10230a.getLayoutParams();
            if (i0Var != null) {
                i0Var.f10107c = true;
            }
        }
    }

    public final void S(int i, int i10, boolean z4) {
        int i11 = i + i10;
        int iH = this.f1140f.h();
        for (int i12 = 0; i12 < iH; i12++) {
            w0 w0VarM = M(this.f1140f.g(i12));
            if (w0VarM != null && !w0VarM.o()) {
                int i13 = w0VarM.f10232c;
                s0 s0Var = this.f1155s0;
                if (i13 >= i11) {
                    if (M0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + w0VarM + " now at position " + (w0VarM.f10232c - i10));
                    }
                    w0VarM.l(-i10, z4);
                    s0Var.f10197f = true;
                } else if (i13 >= i) {
                    if (M0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove attached child " + i12 + " holder " + w0VarM + " now REMOVED");
                    }
                    w0VarM.a(8);
                    w0VarM.l(-i10, z4);
                    w0VarM.f10232c = i - 1;
                    s0Var.f10197f = true;
                }
            }
        }
        n0 n0Var = this.f1135c;
        ArrayList arrayList = n0Var.f10156c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w0 w0Var = (w0) arrayList.get(size);
            if (w0Var != null) {
                int i14 = w0Var.f10232c;
                if (i14 >= i11) {
                    if (M0) {
                        Log.d("RecyclerView", "offsetPositionRecordsForRemove cached " + size + " holder " + w0Var + " now at position " + (w0Var.f10232c - i10));
                    }
                    w0Var.l(-i10, z4);
                } else if (i14 >= i) {
                    w0Var.a(8);
                    n0Var.g(size);
                }
            }
        }
        requestLayout();
    }

    public final void T() {
        this.Q++;
    }

    public final void U(boolean z4) {
        int i;
        AccessibilityManager accessibilityManager;
        int i10 = this.Q - 1;
        this.Q = i10;
        if (i10 < 1) {
            if (L0 && i10 < 0) {
                throw new IllegalStateException(u3.b.a(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.Q = 0;
            if (z4) {
                int i11 = this.K;
                this.K = 0;
                if (i11 != 0 && (accessibilityManager = this.M) != null && accessibilityManager.isEnabled()) {
                    AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                    accessibilityEventObtain.setEventType(2048);
                    r0.b.b(accessibilityEventObtain, i11);
                    sendAccessibilityEventUnchecked(accessibilityEventObtain);
                }
                ArrayList arrayList = this.F0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    w0 w0Var = (w0) arrayList.get(size);
                    if (w0Var.f10230a.getParent() == this && !w0Var.o() && (i = w0Var.f10243q) != -1) {
                        View view = w0Var.f10230a;
                        WeakHashMap weakHashMap = q0.v0.f7946a;
                        q0.d0.s(view, i);
                        w0Var.f10243q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void V(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f1136c0) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f1136c0 = motionEvent.getPointerId(i);
            int x4 = (int) (motionEvent.getX(i) + 0.5f);
            this.f1142g0 = x4;
            this.f1139e0 = x4;
            int y10 = (int) (motionEvent.getY(i) + 0.5f);
            this.f1143h0 = y10;
            this.f1141f0 = y10;
        }
    }

    public final void W() {
        if (this.f1167y0 || !this.D) {
            return;
        }
        WeakHashMap weakHashMap = q0.v0.f7946a;
        q0.d0.m(this, this.G0);
        this.f1167y0 = true;
    }

    public final void X() {
        boolean z4;
        boolean z10 = false;
        if (this.O) {
            n nVar = this.e;
            nVar.r((ArrayList) nVar.f3961f);
            nVar.r((ArrayList) nVar.f3959c);
            nVar.f3957a = 0;
            if (this.P) {
                this.f1166y.X();
            }
        }
        if (this.f1132a0 == null || !this.f1166y.B0()) {
            this.e.d();
        } else {
            this.e.q();
        }
        boolean z11 = this.f1161v0 || this.f1163w0;
        boolean z12 = this.F && this.f1132a0 != null && ((z4 = this.O) || z11 || this.f1166y.f10086f) && (!z4 || this.f1164x.f10252b);
        s0 s0Var = this.f1155s0;
        s0Var.f10199j = z12;
        if (z12 && z11 && !this.O && this.f1132a0 != null && this.f1166y.B0()) {
            z10 = true;
        }
        s0Var.f10200k = z10;
    }

    public final void Y(boolean z4) {
        this.P = z4 | this.P;
        this.O = true;
        int iH = this.f1140f.h();
        for (int i = 0; i < iH; i++) {
            w0 w0VarM = M(this.f1140f.g(i));
            if (w0VarM != null && !w0VarM.o()) {
                w0VarM.a(6);
            }
        }
        R();
        n0 n0Var = this.f1135c;
        ArrayList arrayList = n0Var.f10156c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            w0 w0Var = (w0) arrayList.get(i10);
            if (w0Var != null) {
                w0Var.a(6);
                w0Var.a(1024);
            }
        }
        z zVar = n0Var.h.f1164x;
        if (zVar == null || !zVar.f10252b) {
            n0Var.f();
        }
    }

    public final void Z(w0 w0Var, s sVar) {
        w0Var.f10236j &= -8193;
        boolean z4 = this.f1155s0.h;
        j jVar = this.f1152r;
        if (z4 && w0Var.k() && !w0Var.h() && !w0Var.o()) {
            ((r.h) jVar.f8446c).e(K(w0Var), w0Var);
        }
        r.k kVar = (r.k) jVar.f8445b;
        i1 i1VarA = (i1) kVar.get(w0Var);
        if (i1VarA == null) {
            i1VarA = i1.a();
            kVar.put(w0Var, i1VarA);
        }
        i1VarA.f10111b = sVar;
        i1VarA.f10110a |= 4;
    }

    public final int a0(int i, float f10) {
        float height = f10 / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.T;
        float f11 = 0.0f;
        if (edgeEffect == null || c1.t(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.V;
            if (edgeEffect2 != null && c1.t(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.V.onRelease();
                } else {
                    float fZ = c1.z(this.V, width, height);
                    if (c1.t(this.V) == 0.0f) {
                        this.V.onRelease();
                    }
                    f11 = fZ;
                }
                invalidate();
            }
        } else {
            if (canScrollHorizontally(-1)) {
                this.T.onRelease();
            } else {
                float f12 = -c1.z(this.T, -width, 1.0f - height);
                if (c1.t(this.T) == 0.0f) {
                    this.T.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i10) {
        h0 h0Var = this.f1166y;
        if (h0Var != null) {
            h0Var.getClass();
        }
        super.addFocusables(arrayList, i, i10);
    }

    public final int b0(int i, float f10) {
        float width = f10 / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.U;
        float f11 = 0.0f;
        if (edgeEffect == null || c1.t(edgeEffect) == 0.0f) {
            EdgeEffect edgeEffect2 = this.W;
            if (edgeEffect2 != null && c1.t(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.W.onRelease();
                } else {
                    float fZ = c1.z(this.W, height, 1.0f - width);
                    if (c1.t(this.W) == 0.0f) {
                        this.W.onRelease();
                    }
                    f11 = fZ;
                }
                invalidate();
            }
        } else {
            if (canScrollVertically(-1)) {
                this.U.onRelease();
            } else {
                float f12 = -c1.z(this.U, -height, width);
                if (c1.t(this.U) == 0.0f) {
                    this.U.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        }
        return Math.round(f11 * getHeight());
    }

    public final void c0(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.f1158u;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof i0) {
            i0 i0Var = (i0) layoutParams;
            if (!i0Var.f10107c) {
                Rect rect2 = i0Var.f10106b;
                rect.left -= rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        this.f1166y.m0(this, view, this.f1158u, !this.F, view2 == null);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof i0) && this.f1166y.f((i0) layoutParams);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        h0 h0Var = this.f1166y;
        if (h0Var != null && h0Var.d()) {
            return this.f1166y.j(this.f1155s0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        h0 h0Var = this.f1166y;
        if (h0Var != null && h0Var.d()) {
            return this.f1166y.k(this.f1155s0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        h0 h0Var = this.f1166y;
        if (h0Var != null && h0Var.d()) {
            return this.f1166y.l(this.f1155s0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        h0 h0Var = this.f1166y;
        if (h0Var != null && h0Var.e()) {
            return this.f1166y.m(this.f1155s0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        h0 h0Var = this.f1166y;
        if (h0Var != null && h0Var.e()) {
            return this.f1166y.n(this.f1155s0);
        }
        return 0;
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        h0 h0Var = this.f1166y;
        if (h0Var != null && h0Var.e()) {
            return this.f1166y.o(this.f1155s0);
        }
        return 0;
    }

    public final void d0() {
        VelocityTracker velocityTracker = this.f1138d0;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean zIsFinished = false;
        m0(0);
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            zIsFinished = this.T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.U;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            zIsFinished |= this.U.isFinished();
        }
        EdgeEffect edgeEffect3 = this.V;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect4 = this.W;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = q0.v0.f7946a;
            q0.d0.k(this);
        }
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z4) {
        return getScrollingChildHelper().a(f10, f11, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().d(i, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        super.draw(canvas);
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        boolean z10 = false;
        for (int i = 0; i < size; i++) {
            ((f0) arrayList.get(i)).b(canvas, this);
        }
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z4 = false;
        } else {
            int iSave = canvas.save();
            int paddingBottom = this.f1154s ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + paddingBottom, 0.0f);
            EdgeEffect edgeEffect2 = this.T;
            z4 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int iSave2 = canvas.save();
            if (this.f1154s) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.U;
            z4 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(iSave2);
        }
        EdgeEffect edgeEffect5 = this.V;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int iSave3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.f1154s ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate(paddingTop, -width);
            EdgeEffect edgeEffect6 = this.V;
            z4 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(iSave3);
        }
        EdgeEffect edgeEffect7 = this.W;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int iSave4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.f1154s) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.W;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z10 = true;
            }
            z4 |= z10;
            canvas.restoreToCount(iSave4);
        }
        if ((z4 || this.f1132a0 == null || arrayList.size() <= 0 || !this.f1132a0.f()) ? z4 : true) {
            WeakHashMap weakHashMap = q0.v0.f7946a;
            q0.d0.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j4) {
        return super.drawChild(canvas, view, j4);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00fc A[DONT_INVERT, PHI: r7
      0x00fc: PHI (r7v10 boolean) = (r7v8 boolean), (r7v11 boolean) binds: [B:34:0x00e3, B:32:0x00de] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    public final boolean e0(int i, int i10, MotionEvent motionEvent, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z4;
        boolean z10;
        p();
        z zVar = this.f1164x;
        int[] iArr = this.E0;
        if (zVar != null) {
            iArr[0] = 0;
            iArr[1] = 0;
            f0(iArr, i, i10);
            i12 = iArr[0];
            i13 = iArr[1];
            i14 = i - i12;
            i15 = i10 - i13;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.A.isEmpty()) {
            invalidate();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        w(i12, i13, i14, i15, this.C0, i11, iArr);
        int i16 = iArr[0];
        int i17 = i14 - i16;
        int i18 = iArr[1];
        int i19 = i15 - i18;
        boolean z11 = (i16 == 0 && i18 == 0) ? false : true;
        int i20 = this.f1142g0;
        int[] iArr2 = this.C0;
        int i21 = iArr2[0];
        this.f1142g0 = i20 - i21;
        int i22 = this.f1143h0;
        int i23 = iArr2[1];
        this.f1143h0 = i22 - i23;
        int[] iArr3 = this.D0;
        iArr3[0] = iArr3[0] + i21;
        iArr3[1] = iArr3[1] + i23;
        if (getOverScrollMode() != 2) {
            if (motionEvent == null || (motionEvent.getSource() & 8194) == 8194) {
                z4 = true;
            } else {
                float x4 = motionEvent.getX();
                float f10 = i17;
                float y10 = motionEvent.getY();
                float f11 = i19;
                if (f10 < 0.0f) {
                    z();
                    z4 = true;
                    c1.z(this.T, (-f10) / getWidth(), 1.0f - (y10 / getHeight()));
                } else {
                    z4 = true;
                    if (f10 > 0.0f) {
                        A();
                        c1.z(this.V, f10 / getWidth(), y10 / getHeight());
                    } else {
                        z10 = false;
                    }
                    if (f11 < 0.0f) {
                        B();
                        c1.z(this.U, (-f11) / getHeight(), x4 / getWidth());
                    } else if (f11 > 0.0f) {
                        y();
                        c1.z(this.W, f11 / getHeight(), 1.0f - (x4 / getWidth()));
                    } else if (z10 || f10 != 0.0f || f11 != 0.0f) {
                        WeakHashMap weakHashMap = q0.v0.f7946a;
                        q0.d0.k(this);
                    }
                    z10 = z4;
                    if (z10) {
                        WeakHashMap weakHashMap2 = q0.v0.f7946a;
                        q0.d0.k(this);
                    } else {
                        WeakHashMap weakHashMap3 = q0.v0.f7946a;
                        q0.d0.k(this);
                    }
                }
                z10 = z4;
                if (f11 < 0.0f) {
                    B();
                    c1.z(this.U, (-f11) / getHeight(), x4 / getWidth());
                } else if (f11 > 0.0f) {
                    y();
                    c1.z(this.W, f11 / getHeight(), 1.0f - (x4 / getWidth()));
                } else if (z10) {
                    WeakHashMap weakHashMap4 = q0.v0.f7946a;
                    q0.d0.k(this);
                } else {
                    WeakHashMap weakHashMap5 = q0.v0.f7946a;
                    q0.d0.k(this);
                }
                z10 = z4;
                if (z10) {
                    WeakHashMap weakHashMap6 = q0.v0.f7946a;
                    q0.d0.k(this);
                } else {
                    WeakHashMap weakHashMap7 = q0.v0.f7946a;
                    q0.d0.k(this);
                }
            }
            n(i, i10);
        } else {
            z4 = true;
        }
        if (i12 != 0 || i13 != 0) {
            x(i12, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z11 && i12 == 0 && i13 == 0) {
            return false;
        }
        return z4;
    }

    public final void f0(int[] iArr, int i, int i10) {
        w0 w0Var;
        k0();
        T();
        int i11 = m0.n.f6974a;
        m0.m.a("RV Scroll");
        s0 s0Var = this.f1155s0;
        D(s0Var);
        n0 n0Var = this.f1135c;
        int iO0 = i != 0 ? this.f1166y.o0(i, n0Var, s0Var) : 0;
        int iQ0 = i10 != 0 ? this.f1166y.q0(i10, n0Var, s0Var) : 0;
        m0.m.b();
        x1.b bVar = this.f1140f;
        int iE = bVar.e();
        for (int i12 = 0; i12 < iE; i12++) {
            View viewD = bVar.d(i12);
            w0 w0VarL = L(viewD);
            if (w0VarL != null && (w0Var = w0VarL.i) != null) {
                View view = w0Var.f10230a;
                int left = viewD.getLeft();
                int top = viewD.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        U(true);
        l0(false);
        if (iArr != null) {
            iArr[0] = iO0;
            iArr[1] = iQ0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:137:0x0193 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:138:0x0194  */
    /* JADX WARN: Code duplicated, block: B:24:0x004c  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i) {
        View viewR;
        int i10;
        byte b10;
        boolean z4;
        this.f1166y.getClass();
        boolean z10 = true;
        boolean z11 = (this.f1164x == null || this.f1166y == null || P() || this.I) ? false : true;
        FocusFinder focusFinder = FocusFinder.getInstance();
        s0 s0Var = this.f1155s0;
        n0 n0Var = this.f1135c;
        if (z11 && (i == 2 || i == 1)) {
            if (this.f1166y.e()) {
                if (focusFinder.findNextFocus(this, view, i == 2 ? 130 : 33) == null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else {
                z4 = false;
            }
            if (!z4 && this.f1166y.d()) {
                z4 = focusFinder.findNextFocus(this, view, (this.f1166y.A() == 1) ^ (i == 2) ? 66 : 17) == null;
            }
            if (z4) {
                p();
                if (E(view) != null) {
                    k0();
                    this.f1166y.R(view, i, n0Var, s0Var);
                    l0(false);
                }
                return null;
            }
            viewR = focusFinder.findNextFocus(this, view, i);
            if (viewR == null) {
            }
            if (viewR != null) {
                z10 = false;
            } else {
                z10 = false;
            }
            if (z10) {
                return viewR;
            }
            return super.focusSearch(view, i);
        }
        View viewFindNextFocus = focusFinder.findNextFocus(this, view, i);
        if (viewFindNextFocus == null && z11) {
            p();
            if (E(view) != null) {
                k0();
                viewR = this.f1166y.R(view, i, n0Var, s0Var);
                l0(false);
            }
            return null;
        }
        viewR = viewFindNextFocus;
        if (viewR == null && !viewR.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i);
            }
            c0(viewR, null);
            return view;
        }
        if (viewR != null || viewR == this || viewR == view) {
            z10 = false;
        } else if (E(viewR) == null) {
            z10 = false;
        } else if (view != null && E(view) != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            Rect rect = this.f1158u;
            rect.set(0, 0, width, height);
            int width2 = viewR.getWidth();
            int height2 = viewR.getHeight();
            Rect rect2 = this.f1160v;
            rect2.set(0, 0, width2, height2);
            offsetDescendantRectToMyCoords(view, rect);
            offsetDescendantRectToMyCoords(viewR, rect2);
            int i11 = this.f1166y.A() == 1 ? -1 : 1;
            int i12 = rect.left;
            int i13 = rect2.left;
            if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
                i10 = 1;
            } else {
                int i14 = rect.right;
                int i15 = rect2.right;
                i10 = ((i14 > i15 || i12 >= i15) && i12 > i13) ? -1 : 0;
            }
            int i16 = rect.top;
            int i17 = rect2.top;
            if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
                b10 = 1;
            } else {
                int i18 = rect.bottom;
                int i19 = rect2.bottom;
                b10 = ((i18 > i19 || i16 >= i19) && i16 > i17) ? (byte) -1 : (byte) 0;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 17) {
                        if (i != 33) {
                            if (i != 66) {
                                if (i != 130) {
                                    StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                                    sb2.append(i);
                                    throw new IllegalArgumentException(u3.b.a(this, sb2));
                                }
                                if (b10 <= 0) {
                                    z10 = false;
                                }
                            } else if (i10 <= 0) {
                                z10 = false;
                            }
                        } else if (b10 >= 0) {
                            z10 = false;
                        }
                    } else if (i10 >= 0) {
                        z10 = false;
                    }
                } else if (b10 <= 0 && (b10 != 0 || i10 * i11 <= 0)) {
                    z10 = false;
                }
            } else if (b10 >= 0 && (b10 != 0 || i10 * i11 >= 0)) {
                z10 = false;
            }
        }
        if (z10) {
            return viewR;
        }
        return super.focusSearch(view, i);
    }

    public final void g0(int i) {
        t tVar;
        if (this.I) {
            return;
        }
        setScrollState(0);
        v0 v0Var = this.f1150p0;
        v0Var.f10224r.removeCallbacks(v0Var);
        v0Var.f10221c.abortAnimation();
        h0 h0Var = this.f1166y;
        if (h0Var != null && (tVar = h0Var.e) != null) {
            tVar.i();
        }
        h0 h0Var2 = this.f1166y;
        if (h0Var2 == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            h0Var2.p0(i);
            awakenScrollBars();
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        h0 h0Var = this.f1166y;
        if (h0Var != null) {
            return h0Var.r();
        }
        throw new IllegalStateException(u3.b.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        h0 h0Var = this.f1166y;
        if (h0Var != null) {
            return h0Var.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(u3.b.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public z getAdapter() {
        return this.f1164x;
    }

    @Override // android.view.View
    public int getBaseline() {
        h0 h0Var = this.f1166y;
        if (h0Var == null) {
            return super.getBaseline();
        }
        h0Var.getClass();
        return -1;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i10) {
        return super.getChildDrawingOrder(i, i10);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.f1154s;
    }

    public y0 getCompatAccessibilityDelegate() {
        return this.f1169z0;
    }

    public d0 getEdgeEffectFactory() {
        return this.S;
    }

    public e0 getItemAnimator() {
        return this.f1132a0;
    }

    public int getItemDecorationCount() {
        return this.A.size();
    }

    public h0 getLayoutManager() {
        return this.f1166y;
    }

    public int getMaxFlingVelocity() {
        return this.f1146l0;
    }

    public int getMinFlingVelocity() {
        return this.k0;
    }

    public long getNanoTime() {
        if (R0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public j0 getOnFlingListener() {
        return this.f1145j0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.f1149o0;
    }

    public m0 getRecycledViewPool() {
        return this.f1135c.c();
    }

    public int getScrollState() {
        return this.f1134b0;
    }

    public final void h(w0 w0Var) {
        View view = w0Var.f10230a;
        boolean z4 = view.getParent() == this;
        this.f1135c.l(L(view));
        if (w0Var.j()) {
            this.f1140f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z4) {
            this.f1140f.a(view, true, -1);
            return;
        }
        x1.b bVar = this.f1140f;
        int iIndexOfChild = ((RecyclerView) bVar.f10021a.f8662a).indexOfChild(view);
        if (iIndexOfChild >= 0) {
            bVar.f10022b.i(iIndexOfChild);
            bVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final boolean h0(EdgeEffect edgeEffect, int i, int i10) {
        if (i > 0) {
            return true;
        }
        float fT = c1.t(edgeEffect) * i10;
        float fAbs = Math.abs(-i) * 0.35f;
        float f10 = this.f1131a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = O0;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fT;
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0);
    }

    public final void i(f0 f0Var) {
        h0 h0Var = this.f1166y;
        if (h0Var != null) {
            h0Var.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.A;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(f0Var);
        R();
        requestLayout();
    }

    public final void i0(int i, int i10, boolean z4) {
        h0 h0Var = this.f1166y;
        if (h0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        if (!h0Var.d()) {
            i = 0;
        }
        if (!this.f1166y.e()) {
            i10 = 0;
        }
        if (i == 0 && i10 == 0) {
            return;
        }
        if (z4) {
            int i11 = i != 0 ? 1 : 0;
            if (i10 != 0) {
                i11 |= 2;
            }
            getScrollingChildHelper().g(i11, 1);
        }
        this.f1150p0.c(i, i10, Integer.MIN_VALUE, null);
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.D;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.I;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f7928d;
    }

    public final void j(k0 k0Var) {
        if (this.f1159u0 == null) {
            this.f1159u0 = new ArrayList();
        }
        this.f1159u0.add(k0Var);
    }

    public final void j0(int i) {
        if (this.I) {
            return;
        }
        h0 h0Var = this.f1166y;
        if (h0Var == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            h0Var.z0(this, i);
        }
    }

    public final void k(String str) {
        if (P()) {
            if (str != null) {
                throw new IllegalStateException(str);
            }
            throw new IllegalStateException(u3.b.a(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
        }
        if (this.R > 0) {
            Log.w("RecyclerView", "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(u3.b.a(this, new StringBuilder(""))));
        }
    }

    public final void k0() {
        int i = this.G + 1;
        this.G = i;
        if (i != 1 || this.I) {
            return;
        }
        this.H = false;
    }

    public final void l0(boolean z4) {
        if (this.G < 1) {
            if (L0) {
                throw new IllegalStateException(u3.b.a(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
            this.G = 1;
        }
        if (!z4 && !this.I) {
            this.H = false;
        }
        if (this.G == 1) {
            if (z4 && this.H && !this.I && this.f1166y != null && this.f1164x != null) {
                s();
            }
            if (!this.I) {
                this.H = false;
            }
        }
        this.G--;
    }

    public final void m() {
        int iH = this.f1140f.h();
        for (int i = 0; i < iH; i++) {
            w0 w0VarM = M(this.f1140f.g(i));
            if (!w0VarM.o()) {
                w0VarM.f10233d = -1;
                w0VarM.f10235g = -1;
            }
        }
        n0 n0Var = this.f1135c;
        ArrayList arrayList = n0Var.f10154a;
        ArrayList arrayList2 = n0Var.f10156c;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            w0 w0Var = (w0) arrayList2.get(i10);
            w0Var.f10233d = -1;
            w0Var.f10235g = -1;
        }
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            w0 w0Var2 = (w0) arrayList.get(i11);
            w0Var2.f10233d = -1;
            w0Var2.f10235g = -1;
        }
        ArrayList arrayList3 = n0Var.f10155b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                w0 w0Var3 = (w0) n0Var.f10155b.get(i12);
                w0Var3.f10233d = -1;
                w0Var3.f10235g = -1;
            }
        }
    }

    public final void m0(int i) {
        getScrollingChildHelper().h(i);
    }

    public final void n(int i, int i10) {
        boolean zIsFinished;
        EdgeEffect edgeEffect = this.T;
        if (edgeEffect == null || edgeEffect.isFinished() || i <= 0) {
            zIsFinished = false;
        } else {
            this.T.onRelease();
            zIsFinished = this.T.isFinished();
        }
        EdgeEffect edgeEffect2 = this.V;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.V.onRelease();
            zIsFinished |= this.V.isFinished();
        }
        EdgeEffect edgeEffect3 = this.U;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.U.onRelease();
            zIsFinished |= this.U.isFinished();
        }
        EdgeEffect edgeEffect4 = this.W;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.W.onRelease();
            zIsFinished |= this.W.isFinished();
        }
        if (zIsFinished) {
            WeakHashMap weakHashMap = q0.v0.f7946a;
            q0.d0.k(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        float refreshRate;
        super.onAttachedToWindow();
        this.Q = 0;
        this.D = true;
        this.F = this.F && !isLayoutRequested();
        this.f1135c.d();
        h0 h0Var = this.f1166y;
        if (h0Var != null) {
            h0Var.f10087g = true;
            h0Var.P(this);
        }
        this.f1167y0 = false;
        if (R0) {
            ThreadLocal threadLocal = m.e;
            m mVar = (m) threadLocal.get();
            this.f1151q0 = mVar;
            if (mVar == null) {
                m mVar2 = new m();
                mVar2.f10146a = new ArrayList();
                mVar2.f10149d = new ArrayList();
                this.f1151q0 = mVar2;
                WeakHashMap weakHashMap = q0.v0.f7946a;
                Display displayB = q0.e0.b(this);
                if (isInEditMode() || displayB == null) {
                    refreshRate = 60.0f;
                } else {
                    refreshRate = displayB.getRefreshRate();
                    if (refreshRate < 30.0f) {
                        refreshRate = 60.0f;
                    }
                }
                m mVar3 = this.f1151q0;
                mVar3.f10148c = (long) (1.0E9f / refreshRate);
                threadLocal.set(mVar3);
            }
            ArrayList arrayList = this.f1151q0.f10146a;
            if (L0 && arrayList.contains(this)) {
                throw new IllegalStateException("RecyclerView already present in worker list!");
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        m mVar;
        t tVar;
        super.onDetachedFromWindow();
        e0 e0Var = this.f1132a0;
        if (e0Var != null) {
            e0Var.e();
        }
        int i = 0;
        setScrollState(0);
        v0 v0Var = this.f1150p0;
        v0Var.f10224r.removeCallbacks(v0Var);
        v0Var.f10221c.abortAnimation();
        h0 h0Var = this.f1166y;
        if (h0Var != null && (tVar = h0Var.e) != null) {
            tVar.i();
        }
        this.D = false;
        h0 h0Var2 = this.f1166y;
        if (h0Var2 != null) {
            h0Var2.f10087g = false;
            h0Var2.Q(this);
        }
        this.F0.clear();
        removeCallbacks(this.G0);
        this.f1152r.getClass();
        while (i1.f10109d.c() != null) {
        }
        n0 n0Var = this.f1135c;
        ArrayList arrayList = n0Var.f10156c;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            p3.a.f(((w0) arrayList.get(i10)).f10230a);
        }
        n0Var.e(n0Var.h.f1164x, false);
        while (i < getChildCount()) {
            int i11 = i + 1;
            View childAt = getChildAt(i);
            if (childAt == null) {
                throw new IndexOutOfBoundsException();
            }
            w0.a aVar = (w0.a) childAt.getTag(app.namso_gen.spacehowen.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new w0.a();
                childAt.setTag(app.namso_gen.spacehowen.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.f9446a;
            int iR = vb.j.R(arrayList2);
            if (-1 < iR) {
                throw v.e(arrayList2, iR);
            }
            i = i11;
        }
        if (!R0 || (mVar = this.f1151q0) == null) {
            return;
        }
        boolean zRemove = mVar.f10146a.remove(this);
        if (L0 && !zRemove) {
            throw new IllegalStateException("RecyclerView removal failed!");
        }
        this.f1151q0 = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.A;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((f0) arrayList.get(i)).a(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f10;
        float axisValue;
        if (this.f1166y != null && !this.I && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f10 = this.f1166y.e() ? -motionEvent.getAxisValue(9) : 0.0f;
                axisValue = this.f1166y.d() ? motionEvent.getAxisValue(10) : 0.0f;
            } else if ((motionEvent.getSource() & 4194304) != 0) {
                float axisValue2 = motionEvent.getAxisValue(26);
                if (this.f1166y.e()) {
                    f10 = -axisValue2;
                } else if (this.f1166y.d()) {
                    axisValue = axisValue2;
                    f10 = 0.0f;
                } else {
                    f10 = 0.0f;
                    axisValue = 0.0f;
                }
            } else {
                f10 = 0.0f;
                axisValue = 0.0f;
            }
            if (f10 != 0.0f || axisValue != 0.0f) {
                int i = (int) (axisValue * this.f1147m0);
                int i10 = (int) (f10 * this.f1148n0);
                h0 h0Var = this.f1166y;
                if (h0Var == null) {
                    Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
                    return false;
                }
                if (!this.I) {
                    int[] iArr = this.E0;
                    iArr[0] = 0;
                    iArr[1] = 0;
                    boolean zD = h0Var.d();
                    boolean zE = this.f1166y.e();
                    int i11 = zE ? (zD ? 1 : 0) | 2 : zD ? 1 : 0;
                    float y10 = motionEvent.getY();
                    float x4 = motionEvent.getX();
                    int iA0 = i - a0(i, y10);
                    int iB0 = i10 - b0(i10, x4);
                    getScrollingChildHelper().g(i11, 1);
                    if (v(zD ? iA0 : 0, zE ? iB0 : 0, 1, this.E0, this.C0)) {
                        iA0 -= iArr[0];
                        iB0 -= iArr[1];
                    }
                    e0(zD ? iA0 : 0, zE ? iB0 : 0, motionEvent, 1);
                    m mVar = this.f1151q0;
                    if (mVar != null && (iA0 != 0 || iB0 != 0)) {
                        mVar.a(this, iA0, iB0);
                    }
                    m0(1);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        boolean z10;
        if (!this.I) {
            this.C = null;
            if (F(motionEvent)) {
                d0();
                setScrollState(0);
                return true;
            }
            h0 h0Var = this.f1166y;
            if (h0Var != null) {
                boolean zD = h0Var.d();
                boolean zE = this.f1166y.e();
                if (this.f1138d0 == null) {
                    this.f1138d0 = VelocityTracker.obtain();
                }
                this.f1138d0.addMovement(motionEvent);
                int actionMasked = motionEvent.getActionMasked();
                int actionIndex = motionEvent.getActionIndex();
                if (actionMasked == 0) {
                    if (this.J) {
                        this.J = false;
                    }
                    this.f1136c0 = motionEvent.getPointerId(0);
                    int x4 = (int) (motionEvent.getX() + 0.5f);
                    this.f1142g0 = x4;
                    this.f1139e0 = x4;
                    int y10 = (int) (motionEvent.getY() + 0.5f);
                    this.f1143h0 = y10;
                    this.f1141f0 = y10;
                    EdgeEffect edgeEffect = this.T;
                    if (edgeEffect == null || c1.t(edgeEffect) == 0.0f || canScrollHorizontally(-1)) {
                        z4 = false;
                    } else {
                        c1.z(this.T, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                        z4 = true;
                    }
                    EdgeEffect edgeEffect2 = this.V;
                    boolean z11 = z4;
                    if (edgeEffect2 != null && c1.t(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                        z11 = z4;
                        z11 = z4;
                        c1.z(this.V, 0.0f, motionEvent.getY() / getHeight());
                        z11 = true;
                    }
                    z11 = z4;
                    z11 = z4;
                    z11 = z4;
                    EdgeEffect edgeEffect3 = this.U;
                    boolean z12 = z11;
                    if (edgeEffect3 != null && c1.t(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                        z12 = z11;
                        z12 = z11;
                        c1.z(this.U, 0.0f, motionEvent.getX() / getWidth());
                        z12 = true;
                    }
                    z12 = z11;
                    z12 = z11;
                    z12 = z11;
                    EdgeEffect edgeEffect4 = this.W;
                    boolean z13 = z12;
                    if (edgeEffect4 != null && c1.t(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                        z13 = z12;
                        z13 = z12;
                        c1.z(this.W, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                        z13 = true;
                    }
                    if (z13 || this.f1134b0 == 2) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                        setScrollState(1);
                        m0(1);
                    }
                    int[] iArr = this.D0;
                    iArr[1] = 0;
                    iArr[0] = 0;
                    int i = zD;
                    if (zE) {
                        i = (zD ? 1 : 0) | 2;
                    }
                    getScrollingChildHelper().g(i, 0);
                } else if (actionMasked == 1) {
                    this.f1138d0.clear();
                    m0(0);
                } else if (actionMasked == 2) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.f1136c0);
                    if (iFindPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.f1136c0 + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x10 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
                    int y11 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
                    if (this.f1134b0 != 1) {
                        int i10 = x10 - this.f1139e0;
                        int i11 = y11 - this.f1141f0;
                        if (!zD || Math.abs(i10) <= this.f1144i0) {
                            z10 = false;
                        } else {
                            this.f1142g0 = x10;
                            z10 = true;
                        }
                        if (zE && Math.abs(i11) > this.f1144i0) {
                            this.f1143h0 = y11;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                } else if (actionMasked == 3) {
                    d0();
                    setScrollState(0);
                } else if (actionMasked == 5) {
                    this.f1136c0 = motionEvent.getPointerId(actionIndex);
                    int x11 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                    this.f1142g0 = x11;
                    this.f1139e0 = x11;
                    int y12 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                    this.f1143h0 = y12;
                    this.f1141f0 = y12;
                } else if (actionMasked == 6) {
                    V(motionEvent);
                }
                if (this.f1134b0 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        int i13 = m0.n.f6974a;
        m0.m.a("RV OnLayout");
        s();
        m0.m.b();
        this.F = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        h0 h0Var = this.f1166y;
        if (h0Var == null) {
            q(i, i10);
            return;
        }
        boolean zJ = h0Var.J();
        boolean z4 = false;
        s0 s0Var = this.f1155s0;
        if (zJ) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.f1166y.f10083b.q(i, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z4 = true;
            }
            this.H0 = z4;
            if (z4 || this.f1164x == null) {
                return;
            }
            if (s0Var.f10196d == 1) {
                t();
            }
            this.f1166y.s0(i, i10);
            s0Var.i = true;
            u();
            this.f1166y.u0(i, i10);
            if (this.f1166y.x0()) {
                this.f1166y.s0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                s0Var.i = true;
                u();
                this.f1166y.u0(i, i10);
            }
            this.I0 = getMeasuredWidth();
            this.J0 = getMeasuredHeight();
            return;
        }
        if (this.E) {
            this.f1166y.f10083b.q(i, i10);
            return;
        }
        if (this.L) {
            k0();
            T();
            X();
            U(true);
            if (s0Var.f10200k) {
                s0Var.f10198g = true;
            } else {
                this.e.d();
                s0Var.f10198g = false;
            }
            this.L = false;
            l0(false);
        } else if (s0Var.f10200k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        z zVar = this.f1164x;
        if (zVar != null) {
            s0Var.e = zVar.a();
        } else {
            s0Var.e = 0;
        }
        k0();
        this.f1166y.f10083b.q(i, i10);
        l0(false);
        s0Var.f10198g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (P()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof p0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        p0 p0Var = (p0) parcelable;
        this.f1137d = p0Var;
        super.onRestoreInstanceState(p0Var.f10011a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        p0 p0Var = new p0(super.onSaveInstanceState());
        p0 p0Var2 = this.f1137d;
        if (p0Var2 != null) {
            p0Var.f10170c = p0Var2.f10170c;
            return p0Var;
        }
        h0 h0Var = this.f1166y;
        if (h0Var != null) {
            p0Var.f10170c = h0Var.e0();
            return p0Var;
        }
        p0Var.f10170c = null;
        return p0Var;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        if (i == i11 && i10 == i12) {
            return;
        }
        this.W = null;
        this.U = null;
        this.V = null;
        this.T = null;
    }

    /* JADX WARN: Code duplicated, block: B:180:0x0348  */
    /* JADX WARN: Code duplicated, block: B:198:0x038a  */
    /* JADX WARN: Code duplicated, block: B:237:0x0412  */
    /* JADX WARN: Code duplicated, block: B:300:0x04d8  */
    /* JADX WARN: Code duplicated, block: B:302:0x04de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:303:0x04e0  */
    /* JADX WARN: Code duplicated, block: B:304:0x04e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f8 A[PHI: r1
      0x01f8: PHI (r1v61 int) = (r1v45 int), (r1v65 int) binds: [B:90:0x01e1, B:94:0x01f4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x03ac, code lost:
    
        if (r3 == 0) goto L306;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v34, types: [x1.h0] */
    /* JADX WARN: Type inference failed for: r1v17, types: [q0.p] */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r2v4, types: [q0.p] */
    /* JADX WARN: Type inference failed for: r3v16, types: [x1.w] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [int] */
    /* JADX WARN: Type inference failed for: r9v20, types: [int] */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instruction units count: 1342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        if (!this.F || this.O) {
            int i = m0.n.f6974a;
            m0.m.a("RV FullInvalidate");
            s();
            m0.m.b();
            return;
        }
        n nVar = this.e;
        if (nVar.k()) {
            int i10 = nVar.f3957a;
            if ((i10 & 4) == 0 || (i10 & 11) != 0) {
                if (nVar.k()) {
                    int i11 = m0.n.f6974a;
                    m0.m.a("RV FullInvalidate");
                    s();
                    m0.m.b();
                    return;
                }
                return;
            }
            int i12 = m0.n.f6974a;
            m0.m.a("RV PartialInvalidate");
            k0();
            T();
            nVar.q();
            if (!this.H) {
                x1.b bVar = this.f1140f;
                int iE = bVar.e();
                for (int i13 = 0; i13 < iE; i13++) {
                    w0 w0VarM = M(bVar.d(i13));
                    if (w0VarM != null && !w0VarM.o() && w0VarM.k()) {
                        s();
                    }
                }
                nVar.c();
            }
            l0(true);
            U(true);
            m0.m.b();
        }
    }

    public final void q(int i, int i10) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = q0.v0.f7946a;
        setMeasuredDimension(h0.g(i, paddingRight, q0.d0.e(this)), h0.g(i10, getPaddingBottom() + getPaddingTop(), q0.d0.d(this)));
    }

    public final void r(View view) {
        M(view);
        ArrayList arrayList = this.N;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((g) this.N.get(size)).getClass();
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z4) {
        w0 w0VarM = M(view);
        if (w0VarM != null) {
            if (w0VarM.j()) {
                w0VarM.f10236j &= -257;
            } else if (!w0VarM.o()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(w0VarM);
                throw new IllegalArgumentException(u3.b.a(this, sb2));
            }
        } else if (L0) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(u3.b.a(this, sb3));
        }
        view.clearAnimation();
        r(view);
        super.removeDetachedView(view, z4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        t tVar = this.f1166y.e;
        if ((tVar == null || !tVar.e) && !P() && view2 != null) {
            c0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        return this.f1166y.m0(this, view, rect, z4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        ArrayList arrayList = this.B;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((k) arrayList.get(i)).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.G != 0 || this.I) {
            this.H = true;
        } else {
            super.requestLayout();
        }
    }

    /* JADX WARN: Code duplicated, block: B:166:0x034f  */
    /* JADX WARN: Code duplicated, block: B:185:0x0393  */
    /* JADX WARN: Code duplicated, block: B:187:0x0396  */
    /* JADX WARN: Code duplicated, block: B:193:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:195:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:197:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:200:0x03bf  */
    /* JADX WARN: Code duplicated, block: B:203:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:206:0x03d0 A[LOOP:4: B:199:0x03bd->B:206:0x03d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:209:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:212:0x03e4  */
    /* JADX WARN: Code duplicated, block: B:215:0x03ee A[LOOP:5: B:208:0x03db->B:215:0x03ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:217:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:247:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:248:0x03d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x03ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:251:0x03f1 A[EDGE_INSN: B:251:0x03f1->B:216:0x03f1 BREAK  A[LOOP:5: B:208:0x03db->B:215:0x03ee], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x03ec A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void s() {
        boolean z4;
        long j4;
        w0 w0Var;
        int i;
        int iB;
        int i10;
        int iMin;
        w0 w0VarI;
        View view;
        w0 w0VarI2;
        View view2;
        int i11;
        View viewFindViewById;
        View view3;
        boolean z10;
        s sVar;
        ?? r10;
        boolean zG;
        boolean z11;
        if (this.f1164x == null) {
            Log.w("RecyclerView", "No adapter attached; skipping layout");
            return;
        }
        if (this.f1166y == null) {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        s0 s0Var = this.f1155s0;
        boolean z12 = false;
        s0Var.i = false;
        boolean z13 = true;
        boolean z14 = this.H0 && !(this.I0 == getWidth() && this.J0 == getHeight());
        this.I0 = 0;
        this.J0 = 0;
        this.H0 = false;
        if (s0Var.f10196d == 1) {
            t();
            this.f1166y.r0(this);
            u();
        } else {
            n nVar = this.e;
            if ((((ArrayList) nVar.f3959c).isEmpty() || ((ArrayList) nVar.f3961f).isEmpty()) && !z14 && this.f1166y.f10092n == getWidth() && this.f1166y.f10093o == getHeight()) {
                this.f1166y.r0(this);
            } else {
                this.f1166y.r0(this);
                u();
            }
        }
        s0Var.a(4);
        k0();
        T();
        s0Var.f10196d = 1;
        boolean z15 = s0Var.f10199j;
        n0 n0Var = this.f1135c;
        j jVar = this.f1152r;
        if (z15) {
            int iE = this.f1140f.e() - 1;
            while (iE >= 0) {
                w0 w0VarM = M(this.f1140f.d(iE));
                if (w0VarM.o()) {
                    z11 = z13;
                } else {
                    long jK = K(w0VarM);
                    this.f1132a0.getClass();
                    s sVar2 = new s();
                    sVar2.a(w0VarM);
                    r.h hVar = (r.h) jVar.f8446c;
                    r.k kVar = (r.k) jVar.f8445b;
                    w0 w0Var2 = (w0) hVar.b(jK);
                    if (w0Var2 == null || w0Var2.o()) {
                        z11 = z13;
                        jVar.c(w0VarM, sVar2);
                    } else {
                        z11 = z13;
                        i1 i1Var = (i1) kVar.get(w0Var2);
                        boolean z16 = (i1Var == null || (i1Var.f10110a & 1) == 0) ? false : z11;
                        i1 i1Var2 = (i1) kVar.get(w0VarM);
                        boolean z17 = (i1Var2 == null || (i1Var2.f10110a & 1) == 0) ? false : z11;
                        if (z16 && w0Var2 == w0VarM) {
                            jVar.c(w0VarM, sVar2);
                        } else {
                            s sVarV = jVar.v(w0Var2, 4);
                            jVar.c(w0VarM, sVar2);
                            s sVarV2 = jVar.v(w0VarM, 8);
                            if (sVarV == null) {
                                int iE2 = this.f1140f.e();
                                for (int i12 = 0; i12 < iE2; i12++) {
                                    w0 w0VarM2 = M(this.f1140f.d(i12));
                                    if (w0VarM2 != w0VarM && K(w0VarM2) == jK) {
                                        z zVar = this.f1164x;
                                        if (zVar == null || !zVar.f10252b) {
                                            StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                                            sb2.append(w0VarM2);
                                            sb2.append(" \n View Holder 2:");
                                            sb2.append(w0VarM);
                                            throw new IllegalStateException(u3.b.a(this, sb2));
                                        }
                                        StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                                        sb3.append(w0VarM2);
                                        sb3.append(" \n View Holder 2:");
                                        sb3.append(w0VarM);
                                        throw new IllegalStateException(u3.b.a(this, sb3));
                                    }
                                }
                                Log.e("RecyclerView", "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + w0Var2 + " cannot be found but it is necessary for " + w0VarM + C());
                            } else {
                                w0Var2.n(false);
                                if (z16) {
                                    h(w0Var2);
                                }
                                if (w0Var2 != w0VarM) {
                                    if (z17) {
                                        h(w0VarM);
                                    }
                                    w0Var2.h = w0VarM;
                                    h(w0Var2);
                                    n0Var.l(w0Var2);
                                    w0VarM.n(false);
                                    w0VarM.i = w0Var2;
                                }
                                if (this.f1132a0.a(w0Var2, w0VarM, sVarV, sVarV2)) {
                                    W();
                                }
                            }
                        }
                    }
                }
                iE--;
                z13 = z11;
            }
            z4 = z13;
            r.k kVar2 = (r.k) jVar.f8445b;
            int i13 = kVar2.f8100c - 1;
            while (i13 >= 0) {
                w0 w0Var3 = (w0) kVar2.f(i13);
                i1 i1Var3 = (i1) kVar2.h(i13);
                int i14 = i1Var3.f10110a;
                int i15 = i14 & 3;
                d dVar = this.K0;
                if (i15 == 3) {
                    RecyclerView recyclerView = (RecyclerView) dVar.f9128a;
                    recyclerView.f1166y.j0(w0Var3.f10230a, recyclerView.f1135c);
                    r10 = z12;
                } else if ((i14 & 1) != 0) {
                    s sVar3 = i1Var3.f10111b;
                    if (sVar3 == null) {
                        RecyclerView recyclerView2 = (RecyclerView) dVar.f9128a;
                        recyclerView2.f1166y.j0(w0Var3.f10230a, recyclerView2.f1135c);
                        r10 = z12;
                    } else {
                        dVar.i(w0Var3, sVar3, i1Var3.f10112c);
                        r10 = z12;
                    }
                } else if ((i14 & 14) == 14) {
                    dVar.h(w0Var3, i1Var3.f10111b, i1Var3.f10112c);
                    r10 = z12;
                } else {
                    if ((i14 & 12) == 12) {
                        s sVar4 = i1Var3.f10111b;
                        s sVar5 = i1Var3.f10112c;
                        dVar.getClass();
                        w0Var3.n(z12);
                        RecyclerView recyclerView3 = (RecyclerView) dVar.f9128a;
                        if (!recyclerView3.O) {
                            i iVar = (i) recyclerView3.f1132a0;
                            iVar.getClass();
                            int i16 = sVar4.f7938a;
                            int i17 = sVar5.f7938a;
                            if (i16 == i17 && sVar4.f7939b == sVar5.f7939b) {
                                iVar.c(w0Var3);
                                zG = false;
                            } else {
                                zG = iVar.g(w0Var3, i16, sVar4.f7939b, i17, sVar5.f7939b);
                            }
                            if (zG) {
                                recyclerView3.W();
                            }
                        } else if (recyclerView3.f1132a0.a(w0Var3, w0Var3, sVar4, sVar5)) {
                            recyclerView3.W();
                        }
                        r10 = 0;
                    } else {
                        if ((i14 & 4) != 0) {
                            sVar = null;
                            dVar.i(w0Var3, i1Var3.f10111b, null);
                        } else {
                            sVar = null;
                            if ((i14 & 8) != 0) {
                                dVar.h(w0Var3, i1Var3.f10111b, i1Var3.f10112c);
                            }
                        }
                        r10 = 0;
                    }
                    i1Var3.f10110a = r10;
                    i1Var3.f10111b = sVar;
                    i1Var3.f10112c = sVar;
                    i1.f10109d.b(i1Var3);
                    i13--;
                    z12 = false;
                }
                sVar = null;
                i1Var3.f10110a = r10;
                i1Var3.f10111b = sVar;
                i1Var3.f10112c = sVar;
                i1.f10109d.b(i1Var3);
                i13--;
                z12 = false;
            }
        } else {
            z4 = true;
        }
        View view4 = null;
        this.f1166y.i0(n0Var);
        s0Var.f10194b = s0Var.e;
        this.O = false;
        this.P = false;
        s0Var.f10199j = false;
        s0Var.f10200k = false;
        this.f1166y.f10086f = false;
        ArrayList arrayList = n0Var.f10155b;
        if (arrayList != null) {
            arrayList.clear();
        }
        h0 h0Var = this.f1166y;
        if (h0Var.f10089k) {
            h0Var.f10088j = 0;
            h0Var.f10089k = false;
            n0Var.m();
        }
        this.f1166y.c0(s0Var);
        boolean z18 = z4;
        U(z18);
        l0(false);
        ((r.k) jVar.f8445b).clear();
        ((r.h) jVar.f8446c).a();
        int[] iArr = this.A0;
        int i18 = iArr[0];
        int i19 = iArr[z18 ? 1 : 0];
        G(iArr);
        if ((iArr[0] == i18 && iArr[z18 ? 1 : 0] == i19) ? false : true) {
            x(0, 0);
        }
        if (this.f1149o0 && this.f1164x != null && hasFocus() && getDescendantFocusability() != 393216 && (getDescendantFocusability() != 131072 || !isFocused())) {
            if (isFocused()) {
                j4 = s0Var.f10202m;
                if (j4 == -1) {
                    w0Var = null;
                } else {
                    w0Var = null;
                }
                if (w0Var != null) {
                    view3 = w0Var.f10230a;
                    if (!this.f1140f.f10023c.contains(view3)) {
                        if (this.f1140f.e() > 0) {
                            int i20 = s0Var.f10201l;
                            if (i20 != -1) {
                            }
                            iB = s0Var.b();
                            i10 = i;
                            while (true) {
                                if (i10 < iB) {
                                    w0VarI2 = I(i10);
                                    if (w0VarI2 != null) {
                                        view2 = w0VarI2.f10230a;
                                        if (view2.hasFocusable()) {
                                            view4 = view2;
                                        } else {
                                            i10++;
                                        }
                                    }
                                }
                                for (iMin = Math.min(iB, i) - 1; iMin >= 0; iMin--) {
                                    w0VarI = I(iMin);
                                    if (w0VarI == null) {
                                        break;
                                        break;
                                    }
                                    view = w0VarI.f10230a;
                                    if (view.hasFocusable()) {
                                        view4 = view;
                                        break;
                                    }
                                }
                            }
                        }
                    } else if (this.f1140f.e() > 0) {
                        int i21 = s0Var.f10201l;
                        if (i21 != -1) {
                        }
                        iB = s0Var.b();
                        i10 = i;
                        while (true) {
                            if (i10 < iB) {
                                w0VarI2 = I(i10);
                                if (w0VarI2 != null) {
                                    view2 = w0VarI2.f10230a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                w0VarI = I(iMin);
                                if (w0VarI == null) {
                                    break;
                                    break;
                                }
                                view = w0VarI.f10230a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f1140f.e() > 0) {
                    int i22 = s0Var.f10201l;
                    if (i22 != -1) {
                    }
                    iB = s0Var.b();
                    i10 = i;
                    while (true) {
                        if (i10 < iB) {
                            w0VarI2 = I(i10);
                            if (w0VarI2 != null) {
                                view2 = w0VarI2.f10230a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            w0VarI = I(iMin);
                            if (w0VarI == null) {
                                break;
                                break;
                            }
                            view = w0VarI.f10230a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i11 = s0Var.f10203n;
                    if (i11 != -1) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            } else if (this.f1140f.f10023c.contains(getFocusedChild())) {
                j4 = s0Var.f10202m;
                if (j4 == -1 && (z10 = this.f1164x.f10252b) && z10) {
                    int iH = this.f1140f.h();
                    w0Var = null;
                    for (int i23 = 0; i23 < iH; i23++) {
                        w0 w0VarM3 = M(this.f1140f.g(i23));
                        if (w0VarM3 != null && !w0VarM3.h() && w0VarM3.e == j4) {
                            if (!this.f1140f.f10023c.contains(w0VarM3.f10230a)) {
                                w0Var = w0VarM3;
                                break;
                            }
                            w0Var = w0VarM3;
                        }
                    }
                } else {
                    w0Var = null;
                }
                if (w0Var != null) {
                    view3 = w0Var.f10230a;
                    if (!this.f1140f.f10023c.contains(view3) && view3.hasFocusable()) {
                        view4 = view3;
                    } else if (this.f1140f.e() > 0) {
                        int i24 = s0Var.f10201l;
                        i = i24 != -1 ? i24 : 0;
                        iB = s0Var.b();
                        i10 = i;
                        while (true) {
                            if (i10 < iB) {
                                w0VarI2 = I(i10);
                                if (w0VarI2 != null) {
                                    view2 = w0VarI2.f10230a;
                                    if (view2.hasFocusable()) {
                                        view4 = view2;
                                    } else {
                                        i10++;
                                    }
                                }
                            }
                            while (iMin >= 0) {
                                w0VarI = I(iMin);
                                if (w0VarI == null) {
                                    break;
                                }
                                view = w0VarI.f10230a;
                                if (view.hasFocusable()) {
                                    view4 = view;
                                    break;
                                }
                            }
                        }
                    }
                } else if (this.f1140f.e() > 0) {
                    int i25 = s0Var.f10201l;
                    if (i25 != -1) {
                    }
                    iB = s0Var.b();
                    i10 = i;
                    while (true) {
                        if (i10 < iB) {
                            w0VarI2 = I(i10);
                            if (w0VarI2 != null) {
                                view2 = w0VarI2.f10230a;
                                if (view2.hasFocusable()) {
                                    view4 = view2;
                                } else {
                                    i10++;
                                }
                            }
                        }
                        while (iMin >= 0) {
                            w0VarI = I(iMin);
                            if (w0VarI == null) {
                                break;
                                break;
                            }
                            view = w0VarI.f10230a;
                            if (view.hasFocusable()) {
                                view4 = view;
                                break;
                            }
                        }
                    }
                }
                if (view4 != null) {
                    i11 = s0Var.f10203n;
                    if (i11 != -1 && (viewFindViewById = view4.findViewById(i11)) != null && viewFindViewById.isFocusable()) {
                        view4 = viewFindViewById;
                    }
                    view4.requestFocus();
                }
            }
        }
        s0Var.f10202m = -1L;
        s0Var.f10201l = -1;
        s0Var.f10203n = -1;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i10) {
        h0 h0Var = this.f1166y;
        if (h0Var == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.I) {
            return;
        }
        boolean zD = h0Var.d();
        boolean zE = this.f1166y.e();
        if (zD || zE) {
            if (!zD) {
                i = 0;
            }
            if (!zE) {
                i10 = 0;
            }
            e0(i, i10, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i10) {
        Log.w("RecyclerView", "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!P()) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        } else {
            int iA = accessibilityEvent != null ? r0.b.a(accessibilityEvent) : 0;
            this.K |= iA != 0 ? iA : 0;
        }
    }

    public void setAccessibilityDelegateCompat(y0 y0Var) {
        this.f1169z0 = y0Var;
        q0.v0.l(this, y0Var);
    }

    public void setAdapter(z zVar) {
        setLayoutFrozen(false);
        z zVar2 = this.f1164x;
        b bVar = this.f1133b;
        if (zVar2 != null) {
            zVar2.f10251a.unregisterObserver(bVar);
            this.f1164x.g(this);
        }
        e0 e0Var = this.f1132a0;
        if (e0Var != null) {
            e0Var.e();
        }
        h0 h0Var = this.f1166y;
        n0 n0Var = this.f1135c;
        if (h0Var != null) {
            h0Var.h0(n0Var);
            this.f1166y.i0(n0Var);
        }
        n0Var.f10154a.clear();
        n0Var.f();
        n nVar = this.e;
        nVar.r((ArrayList) nVar.f3961f);
        nVar.r((ArrayList) nVar.f3959c);
        nVar.f3957a = 0;
        z zVar3 = this.f1164x;
        this.f1164x = zVar;
        if (zVar != null) {
            zVar.f10251a.registerObserver(bVar);
            zVar.d(this);
        }
        h0 h0Var2 = this.f1166y;
        if (h0Var2 != null) {
            h0Var2.O();
        }
        z zVar4 = this.f1164x;
        n0Var.f10154a.clear();
        n0Var.f();
        n0Var.e(zVar3, true);
        m0 m0VarC = n0Var.c();
        if (zVar3 != null) {
            m0VarC.f10151b--;
        }
        if (m0VarC.f10151b == 0) {
            SparseArray sparseArray = m0VarC.f10150a;
            for (int i = 0; i < sparseArray.size(); i++) {
                l0 l0Var = (l0) sparseArray.valueAt(i);
                ArrayList arrayList = l0Var.f10141a;
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    p3.a.f(((w0) obj).f10230a);
                }
                l0Var.f10141a.clear();
            }
        }
        if (zVar4 != null) {
            m0VarC.f10151b++;
        }
        n0Var.d();
        this.f1155s0.f10197f = true;
        Y(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(c0 c0Var) {
        if (c0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z4) {
        if (z4 != this.f1154s) {
            this.W = null;
            this.U = null;
            this.V = null;
            this.T = null;
        }
        this.f1154s = z4;
        super.setClipToPadding(z4);
        if (this.F) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(d0 d0Var) {
        d0Var.getClass();
        this.S = d0Var;
        this.W = null;
        this.U = null;
        this.V = null;
        this.T = null;
    }

    public void setHasFixedSize(boolean z4) {
        this.E = z4;
    }

    public void setItemAnimator(e0 e0Var) {
        e0 e0Var2 = this.f1132a0;
        if (e0Var2 != null) {
            e0Var2.e();
            this.f1132a0.f10042a = null;
        }
        this.f1132a0 = e0Var;
        if (e0Var != null) {
            e0Var.f10042a = this.f1165x0;
        }
    }

    public void setItemViewCacheSize(int i) {
        n0 n0Var = this.f1135c;
        n0Var.e = i;
        n0Var.m();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z4) {
        suppressLayout(z4);
    }

    public void setLayoutManager(h0 h0Var) {
        t tVar;
        if (h0Var == this.f1166y) {
            return;
        }
        setScrollState(0);
        v0 v0Var = this.f1150p0;
        v0Var.f10224r.removeCallbacks(v0Var);
        v0Var.f10221c.abortAnimation();
        h0 h0Var2 = this.f1166y;
        if (h0Var2 != null && (tVar = h0Var2.e) != null) {
            tVar.i();
        }
        h0 h0Var3 = this.f1166y;
        n0 n0Var = this.f1135c;
        if (h0Var3 != null) {
            e0 e0Var = this.f1132a0;
            if (e0Var != null) {
                e0Var.e();
            }
            this.f1166y.h0(n0Var);
            this.f1166y.i0(n0Var);
            n0Var.f10154a.clear();
            n0Var.f();
            if (this.D) {
                h0 h0Var4 = this.f1166y;
                h0Var4.f10087g = false;
                h0Var4.Q(this);
            }
            this.f1166y.v0(null);
            this.f1166y = null;
        } else {
            n0Var.f10154a.clear();
            n0Var.f();
        }
        x1.b bVar = this.f1140f;
        RecyclerView recyclerView = (RecyclerView) bVar.f10021a.f8662a;
        bVar.f10022b.h();
        ArrayList arrayList = bVar.f10023c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            w0 w0VarM = M((View) arrayList.get(size));
            if (w0VarM != null) {
                int i = w0VarM.f10242p;
                if (recyclerView.P()) {
                    w0VarM.f10243q = i;
                    recyclerView.F0.add(w0VarM);
                } else {
                    View view = w0VarM.f10230a;
                    WeakHashMap weakHashMap = q0.v0.f7946a;
                    q0.d0.s(view, i);
                }
                w0VarM.f10242p = 0;
            }
            arrayList.remove(size);
        }
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.r(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.f1166y = h0Var;
        if (h0Var != null) {
            if (h0Var.f10083b != null) {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(h0Var);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(u3.b.a(h0Var.f10083b, sb2));
            }
            h0Var.v0(this);
            if (this.D) {
                h0 h0Var5 = this.f1166y;
                h0Var5.f10087g = true;
                h0Var5.P(this);
            }
        }
        n0Var.m();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition != null) {
            throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
        }
        super.setLayoutTransition(null);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        p scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f7928d) {
            ViewGroup viewGroup = scrollingChildHelper.f7927c;
            WeakHashMap weakHashMap = q0.v0.f7946a;
            q0.j0.z(viewGroup);
        }
        scrollingChildHelper.f7928d = z4;
    }

    public void setOnFlingListener(j0 j0Var) {
        this.f1145j0 = j0Var;
    }

    @Deprecated
    public void setOnScrollListener(k0 k0Var) {
        this.f1157t0 = k0Var;
    }

    public void setPreserveFocusAfterLayout(boolean z4) {
        this.f1149o0 = z4;
    }

    public void setRecycledViewPool(m0 m0Var) {
        n0 n0Var = this.f1135c;
        RecyclerView recyclerView = n0Var.h;
        n0Var.e(recyclerView.f1164x, false);
        m0 m0Var2 = n0Var.f10159g;
        if (m0Var2 != null) {
            m0Var2.f10151b--;
        }
        n0Var.f10159g = m0Var;
        if (m0Var != null && recyclerView.getAdapter() != null) {
            n0Var.f10159g.f10151b++;
        }
        n0Var.d();
    }

    public void setScrollState(int i) {
        t tVar;
        if (i == this.f1134b0) {
            return;
        }
        if (M0) {
            Log.d("RecyclerView", "setting scroll state to " + i + " from " + this.f1134b0, new Exception());
        }
        this.f1134b0 = i;
        if (i != 2) {
            v0 v0Var = this.f1150p0;
            v0Var.f10224r.removeCallbacks(v0Var);
            v0Var.f10221c.abortAnimation();
            h0 h0Var = this.f1166y;
            if (h0Var != null && (tVar = h0Var.e) != null) {
                tVar.i();
            }
        }
        h0 h0Var2 = this.f1166y;
        if (h0Var2 != null) {
            h0Var2.f0(i);
        }
        k0 k0Var = this.f1157t0;
        if (k0Var != null) {
            k0Var.a(this, i);
        }
        ArrayList arrayList = this.f1159u0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((k0) this.f1159u0.get(size)).a(this, i);
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 0) {
            if (i == 1) {
                this.f1144i0 = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
            Log.w("RecyclerView", "setScrollingTouchSlop(): bad argument constant " + i + "; using default value");
        }
        this.f1144i0 = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(u0 u0Var) {
        this.f1135c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z4) {
        t tVar;
        if (z4 != this.I) {
            k("Do not suppressLayout in layout or scroll");
            if (!z4) {
                this.I = false;
                if (this.H && this.f1166y != null && this.f1164x != null) {
                    requestLayout();
                }
                this.H = false;
                return;
            }
            long jUptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0));
            this.I = true;
            this.J = true;
            setScrollState(0);
            v0 v0Var = this.f1150p0;
            v0Var.f10224r.removeCallbacks(v0Var);
            v0Var.f10221c.abortAnimation();
            h0 h0Var = this.f1166y;
            if (h0Var == null || (tVar = h0Var.e) == null) {
                return;
            }
            tVar.i();
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    public final void t() {
        int iJ;
        i1 i1Var;
        View viewE;
        s0 s0Var = this.f1155s0;
        s0Var.a(1);
        D(s0Var);
        s0Var.i = false;
        k0();
        j jVar = this.f1152r;
        r.k kVar = (r.k) jVar.f8445b;
        r.k kVar2 = (r.k) jVar.f8445b;
        kVar.clear();
        r.h hVar = (r.h) jVar.f8446c;
        hVar.a();
        T();
        X();
        w0 w0VarL = null;
        View focusedChild = (this.f1149o0 && hasFocus() && this.f1164x != null) ? getFocusedChild() : null;
        if (focusedChild != null && (viewE = E(focusedChild)) != null) {
            w0VarL = L(viewE);
        }
        if (w0VarL == null) {
            s0Var.f10202m = -1L;
            s0Var.f10201l = -1;
            s0Var.f10203n = -1;
        } else {
            s0Var.f10202m = this.f1164x.f10252b ? w0VarL.e : -1L;
            if (this.O) {
                iJ = -1;
            } else if (w0VarL.h()) {
                iJ = w0VarL.f10233d;
            } else {
                RecyclerView recyclerView = w0VarL.f10244r;
                if (recyclerView == null) {
                    iJ = -1;
                } else {
                    iJ = recyclerView.J(w0VarL);
                }
            }
            s0Var.f10201l = iJ;
            View focusedChild2 = w0VarL.f10230a;
            int id2 = focusedChild2.getId();
            while (!focusedChild2.isFocused() && (focusedChild2 instanceof ViewGroup) && focusedChild2.hasFocus()) {
                focusedChild2 = ((ViewGroup) focusedChild2).getFocusedChild();
                if (focusedChild2.getId() != -1) {
                    id2 = focusedChild2.getId();
                }
            }
            s0Var.f10203n = id2;
        }
        s0Var.h = s0Var.f10199j && this.f1163w0;
        this.f1163w0 = false;
        this.f1161v0 = false;
        s0Var.f10198g = s0Var.f10200k;
        s0Var.e = this.f1164x.a();
        G(this.A0);
        if (s0Var.f10199j) {
            int iE = this.f1140f.e();
            for (int i = 0; i < iE; i++) {
                w0 w0VarM = M(this.f1140f.d(i));
                if (!w0VarM.o() && (!w0VarM.f() || this.f1164x.f10252b)) {
                    e0 e0Var = this.f1132a0;
                    e0.b(w0VarM);
                    w0VarM.c();
                    e0Var.getClass();
                    s sVar = new s();
                    sVar.a(w0VarM);
                    i1 i1VarA = (i1) kVar2.get(w0VarM);
                    if (i1VarA == null) {
                        i1VarA = i1.a();
                        kVar2.put(w0VarM, i1VarA);
                    }
                    i1VarA.f10111b = sVar;
                    i1VarA.f10110a |= 4;
                    if (s0Var.h && w0VarM.k() && !w0VarM.h() && !w0VarM.o() && !w0VarM.f()) {
                        hVar.e(K(w0VarM), w0VarM);
                    }
                }
            }
        }
        if (s0Var.f10200k) {
            int iH = this.f1140f.h();
            for (int i10 = 0; i10 < iH; i10++) {
                w0 w0VarM2 = M(this.f1140f.g(i10));
                if (L0 && w0VarM2.f10232c == -1 && !w0VarM2.h()) {
                    throw new IllegalStateException(u3.b.a(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!w0VarM2.o() && w0VarM2.f10233d == -1) {
                    w0VarM2.f10233d = w0VarM2.f10232c;
                }
            }
            boolean z4 = s0Var.f10197f;
            s0Var.f10197f = false;
            this.f1166y.b0(this.f1135c, s0Var);
            s0Var.f10197f = z4;
            for (int i11 = 0; i11 < this.f1140f.e(); i11++) {
                w0 w0VarM3 = M(this.f1140f.d(i11));
                if (!w0VarM3.o() && ((i1Var = (i1) kVar2.get(w0VarM3)) == null || (i1Var.f10110a & 4) == 0)) {
                    e0.b(w0VarM3);
                    boolean z10 = (w0VarM3.f10236j & 8192) != 0;
                    e0 e0Var2 = this.f1132a0;
                    w0VarM3.c();
                    e0Var2.getClass();
                    s sVar2 = new s();
                    sVar2.a(w0VarM3);
                    if (z10) {
                        Z(w0VarM3, sVar2);
                    } else {
                        i1 i1VarA2 = (i1) kVar2.get(w0VarM3);
                        if (i1VarA2 == null) {
                            i1VarA2 = i1.a();
                            kVar2.put(w0VarM3, i1VarA2);
                        }
                        i1VarA2.f10110a |= 2;
                        i1VarA2.f10111b = sVar2;
                    }
                }
            }
            m();
        } else {
            m();
        }
        U(true);
        l0(false);
        s0Var.f10196d = 2;
    }

    public final void u() {
        k0();
        T();
        s0 s0Var = this.f1155s0;
        s0Var.a(6);
        this.e.d();
        s0Var.e = this.f1164x.a();
        s0Var.f10195c = 0;
        if (this.f1137d != null) {
            z zVar = this.f1164x;
            int iD = u.e.d(zVar.f10253c);
            if (iD == 1 ? zVar.a() > 0 : iD != 2) {
                Parcelable parcelable = this.f1137d.f10170c;
                if (parcelable != null) {
                    this.f1166y.d0(parcelable);
                }
                this.f1137d = null;
            }
        }
        s0Var.f10198g = false;
        this.f1166y.b0(this.f1135c, s0Var);
        s0Var.f10197f = false;
        s0Var.f10199j = s0Var.f10199j && this.f1132a0 != null;
        s0Var.f10196d = 4;
        U(true);
        l0(false);
    }

    public final boolean v(int i, int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i10, i11, iArr, iArr2);
    }

    public final void w(int i, int i10, int i11, int i12, int[] iArr, int i13, int[] iArr2) {
        getScrollingChildHelper().d(i, i10, i11, i12, iArr, i13, iArr2);
    }

    public final void x(int i, int i10) {
        this.R++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i10);
        k0 k0Var = this.f1157t0;
        if (k0Var != null) {
            k0Var.b(this, i, i10);
        }
        ArrayList arrayList = this.f1159u0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((k0) this.f1159u0.get(size)).b(this, i, i10);
            }
        }
        this.R--;
    }

    public final void y() {
        if (this.W != null) {
            return;
        }
        ((t0) this.S).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.W = edgeEffect;
        if (this.f1154s) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void z() {
        if (this.T != null) {
            return;
        }
        ((t0) this.S).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.T = edgeEffect;
        if (this.f1154s) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        float fA;
        char c10;
        int i10;
        Constructor constructor;
        Object[] objArr;
        super(context, attributeSet, i);
        int i11 = 1;
        this.f1133b = new b(this, i11);
        this.f1135c = new n0(this);
        this.f1152r = new j(14);
        this.f1156t = new x(this, 0);
        this.f1158u = new Rect();
        this.f1160v = new Rect();
        this.f1162w = new RectF();
        this.f1168z = new ArrayList();
        this.A = new ArrayList();
        this.B = new ArrayList();
        this.G = 0;
        this.O = false;
        this.P = false;
        this.Q = 0;
        this.R = 0;
        this.S = U0;
        i iVar = new i();
        iVar.f10042a = null;
        iVar.f10043b = new ArrayList();
        iVar.f10044c = 120L;
        iVar.f10045d = 120L;
        iVar.e = 250L;
        iVar.f10046f = 250L;
        iVar.f10095g = true;
        iVar.h = new ArrayList();
        iVar.i = new ArrayList();
        iVar.f10096j = new ArrayList();
        iVar.f10097k = new ArrayList();
        iVar.f10098l = new ArrayList();
        iVar.f10099m = new ArrayList();
        iVar.f10100n = new ArrayList();
        iVar.f10101o = new ArrayList();
        iVar.f10102p = new ArrayList();
        iVar.f10103q = new ArrayList();
        iVar.f10104r = new ArrayList();
        this.f1132a0 = iVar;
        this.f1134b0 = 0;
        this.f1136c0 = -1;
        this.f1147m0 = Float.MIN_VALUE;
        this.f1148n0 = Float.MIN_VALUE;
        this.f1149o0 = true;
        this.f1150p0 = new v0(this);
        this.f1153r0 = R0 ? new h() : null;
        s0 s0Var = new s0();
        s0Var.f10193a = -1;
        s0Var.f10194b = 0;
        s0Var.f10195c = 0;
        s0Var.f10196d = 1;
        s0Var.e = 0;
        s0Var.f10197f = false;
        s0Var.f10198g = false;
        s0Var.h = false;
        s0Var.i = false;
        s0Var.f10199j = false;
        s0Var.f10200k = false;
        this.f1155s0 = s0Var;
        this.f1161v0 = false;
        this.f1163w0 = false;
        e eVar = new e(this);
        this.f1165x0 = eVar;
        this.f1167y0 = false;
        this.A0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new ArrayList();
        this.G0 = new x(this, i11);
        this.I0 = 0;
        this.J0 = 0;
        this.K0 = new d(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f1144i0 = viewConfiguration.getScaledTouchSlop();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 26) {
            Method method = q0.y0.f7965a;
            fA = q0.w0.a(viewConfiguration);
        } else {
            fA = q0.y0.a(viewConfiguration, context);
        }
        this.f1147m0 = fA;
        this.f1148n0 = i12 >= 26 ? q0.w0.b(viewConfiguration) : q0.y0.a(viewConfiguration, context);
        this.k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f1146l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f1131a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.f1132a0.f10042a = eVar;
        this.e = new n(new o6.h0(this));
        this.f1140f = new x1.b(new c(this));
        WeakHashMap weakHashMap = q0.v0.f7946a;
        if ((i12 >= 26 ? q0.m0.c(this) : 0) == 0 && i12 >= 26) {
            q0.m0.m(this, 8);
        }
        if (q0.d0.c(this) == 0) {
            q0.d0.s(this, 1);
        }
        this.M = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new y0(this));
        int[] iArr = w1.a.f9447a;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        q0.v0.k(this, context, iArr, attributeSet, typedArrayObtainStyledAttributes, i);
        String string = typedArrayObtainStyledAttributes.getString(8);
        if (typedArrayObtainStyledAttributes.getInt(2, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.f1154s = typedArrayObtainStyledAttributes.getBoolean(1, true);
        if (typedArrayObtainStyledAttributes.getBoolean(3, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(6);
            Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(7);
            StateListDrawable stateListDrawable2 = (StateListDrawable) typedArrayObtainStyledAttributes.getDrawable(4);
            Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(5);
            if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
                throw new IllegalArgumentException(u3.b.a(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
            Resources resources = getContext().getResources();
            c10 = 3;
            i10 = 4;
            new k(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(app.namso_gen.spacehowen.R.dimen.fastscroll_margin));
        } else {
            c10 = 3;
            i10 = 4;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (string != null) {
            String strTrim = string.trim();
            if (!strTrim.isEmpty()) {
                if (strTrim.charAt(0) == '.') {
                    strTrim = context.getPackageName() + strTrim;
                } else if (!strTrim.contains(".")) {
                    strTrim = RecyclerView.class.getPackage().getName() + '.' + strTrim;
                }
                String str = strTrim;
                try {
                    Class<? extends U> clsAsSubclass = Class.forName(str, false, isInEditMode() ? getClass().getClassLoader() : context.getClassLoader()).asSubclass(h0.class);
                    try {
                        constructor = clsAsSubclass.getConstructor(S0);
                        Object[] objArr2 = new Object[i10];
                        objArr2[0] = context;
                        objArr2[i11] = attributeSet;
                        objArr2[2] = Integer.valueOf(i);
                        objArr2[c10] = 0;
                        objArr = objArr2;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = clsAsSubclass.getConstructor(null);
                            objArr = null;
                        } catch (NoSuchMethodException e4) {
                            e4.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e4);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((h0) constructor.newInstance(objArr));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e10);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e12);
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e14);
                }
            }
        }
        int[] iArr2 = N0;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        q0.v0.k(this, context, iArr2, attributeSet, typedArrayObtainStyledAttributes2, i);
        boolean z4 = typedArrayObtainStyledAttributes2.getBoolean(0, true);
        typedArrayObtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z4);
        setTag(app.namso_gen.spacehowen.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        h0 h0Var = this.f1166y;
        if (h0Var != null) {
            return h0Var.t(layoutParams);
        }
        throw new IllegalStateException(u3.b.a(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Deprecated
    public void setRecyclerListener(o0 o0Var) {
    }
}

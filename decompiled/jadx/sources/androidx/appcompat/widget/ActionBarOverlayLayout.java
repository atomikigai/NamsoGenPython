package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.common.api.f;
import g6.m;
import j.k;
import java.util.WeakHashMap;
import k.l;
import k.x;
import l.d3;
import l.e;
import l.i3;
import l.j;
import l.j1;
import l.k1;
import q0.b2;
import q0.d0;
import q0.d2;
import q0.h0;
import q0.j0;
import q0.q;
import q0.r;
import q0.r1;
import q0.s;
import q0.t1;
import q0.u1;
import q0.v0;
import q0.v1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements j1, q, r {
    public static final int[] M = {R.attr.actionBarSize, android.R.attr.windowContentOverlay};
    public final Rect A;
    public d2 B;
    public d2 C;
    public d2 D;
    public d2 E;
    public l.d F;
    public OverScroller G;
    public ViewPropertyAnimator H;
    public final m I;
    public final l.c J;
    public final l.c K;
    public final s L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f469b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f470c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f471d;
    public k1 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f472f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f473r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f474s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f475t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f476u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f477v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f478w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f479x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Rect f480y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f481z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f469b = 0;
        this.f480y = new Rect();
        this.f481z = new Rect();
        this.A = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        d2 d2Var = d2.f7891b;
        this.B = d2Var;
        this.C = d2Var;
        this.D = d2Var;
        this.E = d2Var;
        this.I = new m(this, 4);
        this.J = new l.c(this, 0);
        this.K = new l.c(this, 1);
        i(context);
        this.L = new s();
    }

    public static boolean g(View view, Rect rect, boolean z4) {
        boolean z10;
        e eVar = (e) view.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
        int i10 = rect.left;
        if (i != i10) {
            ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
        int i12 = rect.top;
        if (i11 != i12) {
            ((ViewGroup.MarginLayoutParams) eVar).topMargin = i12;
            z10 = true;
        }
        int i13 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
        int i14 = rect.right;
        if (i13 != i14) {
            ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i14;
            z10 = true;
        }
        if (z4) {
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i16 = rect.bottom;
            if (i15 != i16) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i16;
                return true;
            }
        }
        return z10;
    }

    @Override // q0.r
    public final void a(View view, int i, int i10, int i11, int i12, int i13, int[] iArr) {
        b(view, i, i10, i11, i12, i13);
    }

    @Override // q0.q
    public final void b(View view, int i, int i10, int i11, int i12, int i13) {
        if (i13 == 0) {
            onNestedScroll(view, i, i10, i11, i12);
        }
    }

    @Override // q0.q
    public final boolean c(View view, View view2, int i, int i10) {
        return i10 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // q0.q
    public final void d(View view, View view2, int i, int i10) {
        if (i10 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int translationY;
        super.draw(canvas);
        if (this.f472f == null || this.f473r) {
            return;
        }
        if (this.f471d.getVisibility() == 0) {
            translationY = (int) (this.f471d.getTranslationY() + this.f471d.getBottom() + 0.5f);
        } else {
            translationY = 0;
        }
        this.f472f.setBounds(0, translationY, getWidth(), this.f472f.getIntrinsicHeight() + translationY);
        this.f472f.draw(canvas);
    }

    @Override // q0.q
    public final void e(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f471d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.L;
        return sVar.f7939b | sVar.f7938a;
    }

    public CharSequence getTitle() {
        k();
        return ((i3) this.e).f6293a.getTitle();
    }

    public final void h() {
        removeCallbacks(this.J);
        removeCallbacks(this.K);
        ViewPropertyAnimator viewPropertyAnimator = this.H;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void i(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(M);
        this.f468a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f472f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f473r = context.getApplicationInfo().targetSdkVersion < 19;
        this.G = new OverScroller(context);
    }

    public final void j(int i) {
        k();
        if (i == 2) {
            ((i3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else if (i == 5) {
            ((i3) this.e).getClass();
            Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
        } else {
            if (i != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    public final void k() {
        k1 wrapper;
        if (this.f470c == null) {
            this.f470c = (ContentFrameLayout) findViewById(R.id.action_bar_activity_content);
            this.f471d = (ActionBarContainer) findViewById(R.id.action_bar_container);
            KeyEvent.Callback callbackFindViewById = findViewById(R.id.action_bar);
            if (callbackFindViewById instanceof k1) {
                wrapper = (k1) callbackFindViewById;
            } else {
                if (!(callbackFindViewById instanceof Toolbar)) {
                    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(callbackFindViewById.getClass().getSimpleName()));
                }
                wrapper = ((Toolbar) callbackFindViewById).getWrapper();
            }
            this.e = wrapper;
        }
    }

    public final void l(Menu menu, x xVar) {
        k();
        i3 i3Var = (i3) this.e;
        Toolbar toolbar = i3Var.f6293a;
        if (i3Var.f6302m == null) {
            i3Var.f6302m = new j(toolbar.getContext());
        }
        j jVar = i3Var.f6302m;
        jVar.e = xVar;
        l lVar = (l) menu;
        if (lVar == null && toolbar.f513a == null) {
            return;
        }
        toolbar.f();
        l lVar2 = toolbar.f513a.A;
        if (lVar2 == lVar) {
            return;
        }
        if (lVar2 != null) {
            lVar2.r(toolbar.V);
            lVar2.r(toolbar.W);
        }
        if (toolbar.W == null) {
            toolbar.W = new d3(toolbar);
        }
        jVar.B = true;
        if (lVar != null) {
            lVar.b(jVar, toolbar.f526u);
            lVar.b(toolbar.W, toolbar.f526u);
        } else {
            jVar.k(toolbar.f526u, null);
            toolbar.W.k(toolbar.f526u, null);
            jVar.i();
            toolbar.W.i();
        }
        toolbar.f513a.setPopupTheme(toolbar.f527v);
        toolbar.f513a.setPresenter(jVar);
        toolbar.V = jVar;
        toolbar.u();
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        k();
        d2 d2VarG = d2.g(this, windowInsets);
        boolean zG = g(this.f471d, new Rect(d2VarG.b(), d2VarG.d(), d2VarG.c(), d2VarG.a()), false);
        WeakHashMap weakHashMap = v0.f7946a;
        Rect rect = this.f480y;
        j0.b(this, d2VarG, rect);
        int i = rect.left;
        int i10 = rect.top;
        int i11 = rect.right;
        int i12 = rect.bottom;
        b2 b2Var = d2VarG.f7892a;
        d2 d2VarL = b2Var.l(i, i10, i11, i12);
        this.B = d2VarL;
        boolean z4 = true;
        if (!this.C.equals(d2VarL)) {
            this.C = this.B;
            zG = true;
        }
        Rect rect2 = this.f481z;
        if (rect2.equals(rect)) {
            z4 = zG;
        } else {
            rect2.set(rect);
        }
        if (z4) {
            requestLayout();
        }
        return b2Var.a().f7892a.c().f7892a.b().f();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        i(getContext());
        WeakHashMap weakHashMap = v0.f7946a;
        h0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i14, i15, measuredWidth + i14, measuredHeight + i15);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int measuredHeight;
        v1 t1Var;
        k();
        measureChildWithMargins(this.f471d, i, 0, i10, 0);
        e eVar = (e) this.f471d.getLayoutParams();
        int iMax = Math.max(0, this.f471d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f471d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f471d.getMeasuredState());
        WeakHashMap weakHashMap = v0.f7946a;
        boolean z4 = (d0.g(this) & 256) != 0;
        if (z4) {
            measuredHeight = this.f468a;
            if (this.f475t && this.f471d.getTabContainer() != null) {
                measuredHeight += this.f468a;
            }
        } else {
            measuredHeight = this.f471d.getVisibility() != 8 ? this.f471d.getMeasuredHeight() : 0;
        }
        Rect rect = this.f480y;
        Rect rect2 = this.A;
        rect2.set(rect);
        d2 d2Var = this.B;
        this.D = d2Var;
        if (this.f474s || z4) {
            h0.c cVarB = h0.c.b(d2Var.b(), this.D.d() + measuredHeight, this.D.c(), this.D.a());
            d2 d2Var2 = this.D;
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 30) {
                t1Var = new u1(d2Var2);
            } else {
                t1Var = i11 >= 29 ? new t1(d2Var2) : new r1(d2Var2);
            }
            t1Var.g(cVarB);
            this.D = t1Var.b();
        } else {
            rect2.top += measuredHeight;
            rect2.bottom = rect2.bottom;
            this.D = d2Var.f7892a.l(0, measuredHeight, 0, 0);
        }
        g(this.f470c, rect2, true);
        if (!this.E.equals(this.D)) {
            d2 d2Var3 = this.D;
            this.E = d2Var3;
            ContentFrameLayout contentFrameLayout = this.f470c;
            WindowInsets windowInsetsF = d2Var3.f();
            if (windowInsetsF != null) {
                WindowInsets windowInsetsA = h0.a(contentFrameLayout, windowInsetsF);
                if (!windowInsetsA.equals(windowInsetsF)) {
                    d2.g(contentFrameLayout, windowInsetsA);
                }
            }
        }
        measureChildWithMargins(this.f470c, i, 0, i10, 0);
        e eVar2 = (e) this.f470c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f470c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f470c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f470c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax3, getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax4, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        if (!this.f476u || !z4) {
            return false;
        }
        this.G.fling(0, 0, 0, (int) f11, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER);
        if (this.G.getFinalY() > this.f471d.getHeight()) {
            h();
            this.K.run();
        } else {
            h();
            this.J.run();
        }
        this.f477v = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i10, int i11, int i12) {
        int i13 = this.f478w + i10;
        this.f478w = i13;
        setActionBarHideOffset(i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        g.h0 h0Var;
        k kVar;
        this.L.f7938a = i;
        this.f478w = getActionBarHideOffset();
        h();
        l.d dVar = this.F;
        if (dVar == null || (kVar = (h0Var = (g.h0) dVar).f4043s) == null) {
            return;
        }
        kVar.a();
        h0Var.f4043s = null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.f471d.getVisibility() != 0) {
            return false;
        }
        return this.f476u;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (!this.f476u || this.f477v) {
            return;
        }
        if (this.f478w <= this.f471d.getHeight()) {
            h();
            postDelayed(this.J, 600L);
        } else {
            h();
            postDelayed(this.K, 600L);
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        k();
        int i10 = this.f479x ^ i;
        this.f479x = i;
        boolean z4 = (i & 4) == 0;
        boolean z10 = (i & 256) != 0;
        l.d dVar = this.F;
        if (dVar != null) {
            g.h0 h0Var = (g.h0) dVar;
            h0Var.f4039o = !z10;
            if (z4 || !z10) {
                if (h0Var.f4040p) {
                    h0Var.f4040p = false;
                    h0Var.y(true);
                }
            } else if (!h0Var.f4040p) {
                h0Var.f4040p = true;
                h0Var.y(true);
            }
        }
        if ((i10 & 256) == 0 || this.F == null) {
            return;
        }
        WeakHashMap weakHashMap = v0.f7946a;
        h0.c(this);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f469b = i;
        l.d dVar = this.F;
        if (dVar != null) {
            ((g.h0) dVar).f4038n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        h();
        this.f471d.setTranslationY(-Math.max(0, Math.min(i, this.f471d.getHeight())));
    }

    public void setActionBarVisibilityCallback(l.d dVar) {
        this.F = dVar;
        if (getWindowToken() != null) {
            ((g.h0) this.F).f4038n = this.f469b;
            int i = this.f479x;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = v0.f7946a;
                h0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z4) {
        this.f475t = z4;
    }

    public void setHideOnContentScrollEnabled(boolean z4) {
        if (z4 != this.f476u) {
            this.f476u = z4;
            if (z4) {
                return;
            }
            h();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i) {
        k();
        i3 i3Var = (i3) this.e;
        i3Var.f6296d = i != 0 ? com.bumptech.glide.d.r(i3Var.f6293a.getContext(), i) : null;
        i3Var.c();
    }

    public void setLogo(int i) {
        k();
        i3 i3Var = (i3) this.e;
        i3Var.e = i != 0 ? com.bumptech.glide.d.r(i3Var.f6293a.getContext(), i) : null;
        i3Var.c();
    }

    public void setOverlayMode(boolean z4) {
        this.f474s = z4;
        this.f473r = z4 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    @Override // l.j1
    public void setWindowCallback(Window.Callback callback) {
        k();
        ((i3) this.e).f6300k = callback;
    }

    @Override // l.j1
    public void setWindowTitle(CharSequence charSequence) {
        k();
        i3 i3Var = (i3) this.e;
        if (i3Var.f6298g) {
            return;
        }
        Toolbar toolbar = i3Var.f6293a;
        i3Var.h = charSequence;
        if ((i3Var.f6294b & 8) != 0) {
            toolbar.setTitle(charSequence);
            if (i3Var.f6298g) {
                v0.m(toolbar.getRootView(), charSequence);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        k();
        i3 i3Var = (i3) this.e;
        i3Var.f6296d = drawable;
        i3Var.c();
    }

    public void setShowingForActionMode(boolean z4) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i10, int[] iArr) {
    }

    @Override // q0.q
    public final void f(View view, int i, int i10, int[] iArr, int i11) {
    }
}

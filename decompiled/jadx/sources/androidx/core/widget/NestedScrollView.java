package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.gms.common.api.f;
import com.google.android.gms.internal.ads.zzbbs;
import com.google.android.material.datepicker.g;
import fa.c1;
import java.util.ArrayList;
import java.util.WeakHashMap;
import q0.d0;
import q0.j0;
import q0.p;
import q0.r;
import q0.s;
import q0.v0;
import u0.e;
import u0.i;
import u0.j;
import u0.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements r {
    public static final float L = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final g M = new g(3);
    public static final int[] N = {R.attr.fillViewport};
    public final int A;
    public final int B;
    public int C;
    public final int[] D;
    public final int[] E;
    public int F;
    public int G;
    public k H;
    public final s I;
    public final p J;
    public float K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final OverScroller f595d;
    public final EdgeEffect e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f596f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f597r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f598s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f599t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f600u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f601v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public VelocityTracker f602w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f603x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f604y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f605z;

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, app.namso_gen.spacehowen.R.attr.nestedScrollViewStyle);
        this.f594c = new Rect();
        this.f598s = true;
        this.f599t = false;
        this.f600u = null;
        this.f601v = false;
        this.f604y = true;
        this.C = -1;
        this.D = new int[2];
        this.E = new int[2];
        int i = Build.VERSION.SDK_INT;
        this.e = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f596f = i >= 31 ? e.a(context, attributeSet) : new EdgeEffect(context);
        this.f592a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f595d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f605z = viewConfiguration.getScaledTouchSlop();
        this.A = viewConfiguration.getScaledMinimumFlingVelocity();
        this.B = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N, app.namso_gen.spacehowen.R.attr.nestedScrollViewStyle, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.I = new s();
        this.J = new p(this);
        setNestedScrollingEnabled(true);
        v0.l(this, M);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.K == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.K = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.K;
    }

    public static boolean l(View view, NestedScrollView nestedScrollView) {
        if (view == nestedScrollView) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && l((View) parent, nestedScrollView);
    }

    @Override // q0.r
    public final void a(View view, int i, int i10, int i11, int i12, int i13, int[] iArr) {
        n(iArr, i12, i13);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // q0.q
    public final void b(View view, int i, int i10, int i11, int i12, int i13) {
        n(null, i12, i13);
    }

    @Override // q0.q
    public final boolean c(View view, View view2, int i, int i10) {
        return (i & 2) != 0;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x007f  */
    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00da  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e0  */
    @Override // android.view.View
    public final void computeScroll() {
        int iRound;
        int[] iArr;
        int i;
        int scrollRange;
        int overScrollMode;
        OverScroller overScroller = this.f595d;
        if (overScroller.isFinished()) {
            return;
        }
        overScroller.computeScrollOffset();
        int currY = overScroller.getCurrY();
        int i10 = currY - this.G;
        int height = getHeight();
        EdgeEffect edgeEffect = this.e;
        EdgeEffect edgeEffect2 = this.f596f;
        if (i10 <= 0 || c1.t(edgeEffect) == 0.0f) {
            if (i10 < 0 && c1.t(edgeEffect2) != 0.0f) {
                float f10 = height;
                iRound = Math.round(c1.z(edgeEffect2, (i10 * 4.0f) / f10, 0.5f) * (f10 / 4.0f));
                if (iRound != i10) {
                    edgeEffect2.finish();
                }
            }
            int i11 = i10;
            this.G = currY;
            iArr = this.E;
            iArr[1] = 0;
            this.J.c(0, i11, 1, iArr, null);
            i = i11 - iArr[1];
            scrollRange = getScrollRange();
            if (i != 0) {
                int scrollY = getScrollY();
                p(i, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i - scrollY2;
                iArr[1] = 0;
                this.J.d(0, scrollY2, 0, i12, this.D, 1, iArr);
                i = i12 - iArr[1];
            }
            if (i != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i < 0) {
                        if (edgeEffect.isFinished()) {
                            edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                        }
                    } else if (edgeEffect2.isFinished()) {
                        edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                }
                overScroller.abortAnimation();
                x(1);
            }
            if (!overScroller.isFinished()) {
                x(1);
            } else {
                WeakHashMap weakHashMap = v0.f7946a;
                d0.k(this);
            }
        }
        iRound = Math.round(c1.z(edgeEffect, ((-i10) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i10) {
            edgeEffect.finish();
        }
        i10 -= iRound;
        int i13 = i10;
        this.G = currY;
        iArr = this.E;
        iArr[1] = 0;
        this.J.c(0, i13, 1, iArr, null);
        i = i13 - iArr[1];
        scrollRange = getScrollRange();
        if (i != 0) {
            int scrollY3 = getScrollY();
            p(i, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i14 = i - scrollY4;
            iArr[1] = 0;
            this.J.d(0, scrollY4, 0, i14, this.D, 1, iArr);
            i = i14 - iArr[1];
        }
        if (i != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i < 0) {
                    if (edgeEffect.isFinished()) {
                        edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                    }
                } else if (edgeEffect2.isFinished()) {
                    edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (i < 0) {
                if (edgeEffect.isFinished()) {
                    edgeEffect.onAbsorb((int) overScroller.getCurrVelocity());
                }
            } else if (edgeEffect2.isFinished()) {
                edgeEffect2.onAbsorb((int) overScroller.getCurrVelocity());
            }
            overScroller.abortAnimation();
            x(1);
        }
        if (!overScroller.isFinished()) {
            x(1);
        } else {
            WeakHashMap weakHashMap2 = v0.f7946a;
            d0.k(this);
        }
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? (scrollY - iMax) + bottom : bottom;
    }

    @Override // q0.q
    public final void d(View view, View view2, int i, int i10) {
        s sVar = this.I;
        if (i10 == 1) {
            sVar.f7939b = i;
        } else {
            sVar.f7938a = i;
        }
        v(2, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || i(keyEvent);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f10, float f11, boolean z4) {
        return this.J.a(f10, f11, z4);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f10, float f11) {
        return this.J.b(f10, f11);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i10, int[] iArr, int[] iArr2) {
        return this.J.c(i, i10, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i10, int i11, int i12, int[] iArr) {
        return this.J.d(i, i10, i11, i12, iArr, 0, null);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        EdgeEffect edgeEffect = this.e;
        int paddingLeft2 = 0;
        if (!edgeEffect.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (i.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (i.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            edgeEffect.setSize(width, height);
            if (edgeEffect.draw(canvas)) {
                WeakHashMap weakHashMap = v0.f7946a;
                d0.k(this);
            }
            canvas.restoreToCount(iSave);
        }
        EdgeEffect edgeEffect2 = this.f596f;
        if (edgeEffect2.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (i.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (i.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        edgeEffect2.setSize(width2, height2);
        if (edgeEffect2.draw(canvas)) {
            WeakHashMap weakHashMap2 = v0.f7946a;
            d0.k(this);
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // q0.q
    public final void e(View view, int i) {
        s sVar = this.I;
        if (i == 1) {
            sVar.f7939b = 0;
        } else {
            sVar.f7938a = 0;
        }
        x(i);
    }

    @Override // q0.q
    public final void f(View view, int i, int i10, int[] iArr, int i11) {
        this.J.c(i, i10, i11, iArr, null);
    }

    public final boolean g(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            s(true, maxScrollAmount, 0, 1);
        } else {
            Rect rect = this.f594c;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            s(true, h(rect), 0, 1);
            viewFindNextFocus.requestFocus(i);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && !m(viewFindFocus, 0, getHeight())) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        s sVar = this.I;
        return sVar.f7939b | sVar.f7938a;
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final int h(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i10 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i - verticalFadingEdgeLength : i;
        int i11 = rect.bottom;
        if (i11 > i10 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i10, (childAt.getBottom() + layoutParams.bottomMargin) - i);
        }
        if (rect.top >= scrollY || i11 >= i10) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i10 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.J.f(0);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0098  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ab  */
    public final boolean i(KeyEvent keyEvent) {
        View viewFindFocus;
        View viewFindNextFocus;
        this.f594c.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() == 0) {
                    int keyCode = keyEvent.getKeyCode();
                    if (keyCode == 19) {
                        return keyEvent.isAltPressed() ? k(33) : g(33);
                    }
                    if (keyCode == 20) {
                        return keyEvent.isAltPressed() ? k(130) : g(130);
                    }
                    if (keyCode == 62) {
                        q(keyEvent.isShiftPressed() ? 33 : 130);
                        return false;
                    }
                    if (keyCode == 92) {
                        return k(33);
                    }
                    if (keyCode == 93) {
                        return k(130);
                    }
                    if (keyCode == 122) {
                        q(33);
                        return false;
                    }
                    if (keyCode == 123) {
                        q(130);
                        return false;
                    }
                }
            } else if (isFocused() && keyEvent.getKeyCode() != 4) {
                viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus == null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
        } else if (isFocused()) {
            viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            if (viewFindNextFocus == null) {
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.J.f7928d;
    }

    public final void j(int i) {
        if (getChildCount() > 0) {
            this.f595d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, f.API_PRIORITY_OTHER, 0, 0);
            v(2, 1);
            this.G = getScrollY();
            WeakHashMap weakHashMap = v0.f7946a;
            d0.k(this);
        }
    }

    public final boolean k(int i) {
        int childCount;
        boolean z4 = i == 130;
        int height = getHeight();
        Rect rect = this.f594c;
        rect.top = 0;
        rect.bottom = height;
        if (z4 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.bottom = paddingBottom;
            rect.top = paddingBottom - height;
        }
        return r(i, rect.top, rect.bottom);
    }

    public final boolean m(View view, int i, int i10) {
        Rect rect = this.f594c;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i >= getScrollY() && rect.top - i <= getScrollY() + i10;
    }

    @Override // android.view.ViewGroup
    public final void measureChild(View view, int i, int i10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    public final void n(int[] iArr, int i, int i10) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.J.d(0, scrollY2, 0, i - scrollY2, null, i10, iArr);
    }

    public final void o(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.C) {
            int i = actionIndex == 0 ? 1 : 0;
            this.f597r = (int) motionEvent.getY(i);
            this.C = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.f602w;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f599t = false;
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f601v) {
            if ((motionEvent.getSource() & 2) == 2) {
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if ((motionEvent.getSource() & 4194304) == 4194304) {
                axisValue = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
            } else {
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                s((motionEvent.getSource() & 8194) == 8194, -((int) (axisValue * getVerticalScrollFactorCompat())), width, 1);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0083  */
    /* JADX WARN: Code duplicated, block: B:36:0x008b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:62:0x0117  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int action = motionEvent.getAction();
        boolean z4 = true;
        if (action == 2 && this.f601v) {
            return true;
        }
        int i = action & 255;
        if (i == 0) {
            int y10 = (int) motionEvent.getY();
            int x4 = (int) motionEvent.getX();
            int childCount = getChildCount();
            OverScroller overScroller = this.f595d;
            if (childCount > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y10 < childAt.getTop() - scrollY || y10 >= childAt.getBottom() - scrollY || x4 < childAt.getLeft() || x4 >= childAt.getRight()) {
                    if (!w(motionEvent) && overScroller.isFinished()) {
                        z4 = false;
                    }
                    this.f601v = z4;
                    velocityTracker = this.f602w;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f602w = null;
                    }
                } else {
                    this.f597r = y10;
                    this.C = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f602w;
                    if (velocityTracker3 == null) {
                        this.f602w = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f602w.addMovement(motionEvent);
                    overScroller.computeScrollOffset();
                    if (!w(motionEvent) && overScroller.isFinished()) {
                        z4 = false;
                    }
                    this.f601v = z4;
                    v(2, 0);
                }
            } else {
                if (!w(motionEvent)) {
                    z4 = false;
                }
                this.f601v = z4;
                velocityTracker = this.f602w;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f602w = null;
                }
            }
        } else if (i == 1) {
            this.f601v = false;
            this.C = -1;
            velocityTracker2 = this.f602w;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f602w = null;
            }
            if (this.f595d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap = v0.f7946a;
                d0.k(this);
            }
            x(0);
        } else if (i == 2) {
            int i10 = this.C;
            if (i10 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i10);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i10 + " in onInterceptTouchEvent");
                } else {
                    int y11 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y11 - this.f597r) > this.f605z && (2 & getNestedScrollAxes()) == 0) {
                        this.f601v = true;
                        this.f597r = y11;
                        if (this.f602w == null) {
                            this.f602w = VelocityTracker.obtain();
                        }
                        this.f602w.addMovement(motionEvent);
                        this.F = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i == 3) {
            this.f601v = false;
            this.C = -1;
            velocityTracker2 = this.f602w;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f602w = null;
            }
            if (this.f595d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                WeakHashMap weakHashMap2 = v0.f7946a;
                d0.k(this);
            }
            x(0);
        } else if (i == 6) {
            o(motionEvent);
        }
        return this.f601v;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        int measuredHeight;
        super.onLayout(z4, i, i10, i11, i12);
        int i13 = 0;
        this.f598s = false;
        View view = this.f600u;
        if (view != null && l(view, this)) {
            View view2 = this.f600u;
            Rect rect = this.f594c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        this.f600u = null;
        if (!this.f599t) {
            if (this.H != null) {
                scrollTo(getScrollX(), this.H.f8772a);
                this.H = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i13 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i13 != scrollY) {
                scrollTo(getScrollX(), i13);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f599t = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (this.f603x && View.MeasureSpec.getMode(i10) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f10, float f11, boolean z4) {
        if (z4) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        j((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f10, float f11) {
        return this.J.b(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i10, int[] iArr) {
        this.J.c(i, i10, 0, iArr, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i10, int i11, int i12) {
        n(null, i12, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        d(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onOverScrolled(int i, int i10, boolean z4, boolean z10) {
        super.scrollTo(i, i10);
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (i == 2) {
            i = 130;
        } else if (i == 1) {
            i = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        if (viewFindNextFocus != null && m(viewFindNextFocus, 0, getHeight())) {
            return viewFindNextFocus.requestFocus(i, rect);
        }
        return false;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k kVar = (k) parcelable;
        super.onRestoreInstanceState(kVar.getSuperState());
        this.H = kVar;
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        k kVar = new k(super.onSaveInstanceState());
        kVar.f8772a = getScrollY();
        return kVar;
    }

    @Override // android.view.View
    public final void onScrollChanged(int i, int i10, int i11, int i12) {
        super.onScrollChanged(i, i10, i11, i12);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i10, int i11, int i12) {
        super.onSizeChanged(i, i10, i11, i12);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m(viewFindFocus, 0, i12)) {
            return;
        }
        Rect rect = this.f594c;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iH = h(rect);
        if (iH != 0) {
            if (this.f604y) {
                u(0, iH, false);
            } else {
                scrollBy(0, iH);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return c(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        e(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x011f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0127  */
    /* JADX WARN: Code duplicated, block: B:54:0x012f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0135  */
    /* JADX WARN: Code duplicated, block: B:59:0x013c  */
    /* JADX WARN: Code duplicated, block: B:60:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0143  */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        float fZ;
        int iRound;
        int i;
        int iAbs;
        int i10;
        ViewParent parent2;
        if (this.f602w == null) {
            this.f602w = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.F = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f10 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.F);
        if (actionMasked != 0) {
            EdgeEffect edgeEffect = this.e;
            EdgeEffect edgeEffect2 = this.f596f;
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f602w;
                velocityTracker.computeCurrentVelocity(zzbbs.zzq.zzf, this.B);
                int yVelocity = (int) velocityTracker.getYVelocity(this.C);
                if (Math.abs(yVelocity) >= this.A) {
                    if (c1.t(edgeEffect) != 0.0f) {
                        if (t(edgeEffect, yVelocity)) {
                            edgeEffect.onAbsorb(yVelocity);
                        } else {
                            j(-yVelocity);
                        }
                    } else if (c1.t(edgeEffect2) != 0.0f) {
                        int i11 = -yVelocity;
                        if (t(edgeEffect2, i11)) {
                            edgeEffect2.onAbsorb(i11);
                        } else {
                            j(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f11 = i12;
                        if (!this.J.b(0.0f, f11)) {
                            dispatchNestedFling(0.0f, f11, true);
                            j(i12);
                        }
                    }
                } else if (this.f595d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    WeakHashMap weakHashMap = v0.f7946a;
                    d0.k(this);
                }
                this.C = -1;
                this.f601v = false;
                VelocityTracker velocityTracker2 = this.f602w;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f602w = null;
                }
                x(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.C);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.C + " in onTouchEvent");
                } else {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i13 = this.f597r - y10;
                    float x4 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (c1.t(edgeEffect) != 0.0f) {
                        fZ = -c1.z(edgeEffect, -height, x4);
                        if (c1.t(edgeEffect) == 0.0f) {
                            edgeEffect.onRelease();
                        }
                    } else if (c1.t(edgeEffect2) != 0.0f) {
                        fZ = c1.z(edgeEffect2, height, 1.0f - x4);
                        if (c1.t(edgeEffect2) == 0.0f) {
                            edgeEffect2.onRelease();
                        }
                    } else {
                        iRound = Math.round(f10 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i = i13 - iRound;
                        if (!this.f601v) {
                            iAbs = Math.abs(i);
                            i10 = this.f605z;
                            if (iAbs > i10) {
                                parent2 = getParent();
                                if (parent2 != null) {
                                    parent2.requestDisallowInterceptTouchEvent(true);
                                }
                                this.f601v = true;
                                if (i > 0) {
                                    i -= i10;
                                } else {
                                    i += i10;
                                }
                            }
                        }
                        if (this.f601v) {
                            int iS = s(false, i, (int) motionEvent.getX(iFindPointerIndex), 0);
                            this.f597r = y10 - iS;
                            this.F += iS;
                        }
                    }
                    f10 = fZ;
                    iRound = Math.round(f10 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i = i13 - iRound;
                    if (!this.f601v) {
                        iAbs = Math.abs(i);
                        i10 = this.f605z;
                        if (iAbs > i10) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f601v = true;
                            if (i > 0) {
                                i -= i10;
                            } else {
                                i += i10;
                            }
                        }
                    }
                    if (this.f601v) {
                        int iS2 = s(false, i, (int) motionEvent.getX(iFindPointerIndex), 0);
                        this.f597r = y10 - iS2;
                        this.F += iS2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f601v && getChildCount() > 0) {
                    if (this.f595d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        WeakHashMap weakHashMap2 = v0.f7946a;
                        d0.k(this);
                    }
                }
                this.C = -1;
                this.f601v = false;
                VelocityTracker velocityTracker3 = this.f602w;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f602w = null;
                }
                x(0);
                edgeEffect.onRelease();
                edgeEffect2.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f597r = (int) motionEvent.getY(actionIndex);
                this.C = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                o(motionEvent);
                this.f597r = (int) motionEvent.getY(motionEvent.findPointerIndex(this.C));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f601v && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            OverScroller overScroller = this.f595d;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                x(1);
            }
            int y11 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f597r = y11;
            this.C = pointerId;
            v(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f602w;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public final boolean p(int i, int i10, int i11, int i12) {
        int i13;
        boolean z4;
        int i14;
        boolean z10;
        getOverScrollMode();
        super.computeHorizontalScrollRange();
        super.computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        super.computeVerticalScrollExtent();
        int i15 = i11 + i;
        if (i10 <= 0 && i10 >= 0) {
            i13 = i10;
            z4 = false;
        } else {
            i13 = 0;
            z4 = true;
        }
        if (i15 <= i12) {
            if (i15 < 0) {
                i14 = 0;
            } else {
                i14 = i15;
                z10 = false;
            }
            if (z10 && !this.J.f(1)) {
                this.f595d.springBack(i13, i14, 0, 0, 0, getScrollRange());
            }
            super.scrollTo(i13, i14);
            return !z4 || z10;
        }
        i14 = i12;
        z10 = true;
        if (z10) {
            this.f595d.springBack(i13, i14, 0, 0, 0, getScrollRange());
        }
        super.scrollTo(i13, i14);
        if (z4) {
        }
    }

    public final void q(int i) {
        boolean z4 = i == 130;
        int height = getHeight();
        Rect rect = this.f594c;
        if (z4) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            int scrollY = getScrollY() - height;
            rect.top = scrollY;
            if (scrollY < 0) {
                rect.top = 0;
            }
        }
        int i10 = rect.top;
        int i11 = height + i10;
        rect.bottom = i11;
        r(i, i10, i11);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean r(int i, int i10, int i11) {
        boolean z4;
        int height = getHeight();
        int scrollY = getScrollY();
        int i12 = height + scrollY;
        boolean z10 = i == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i13 = 0; i13 < size; i13++) {
            View view2 = focusables.get(i13);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12 && z13) {
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (z13) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i10 < scrollY || i11 > i12) {
            s(true, z10 ? i10 - scrollY : i11 - i12, 0, 1);
            z4 = true;
        } else {
            z4 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i);
        }
        return z4;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (this.f598s) {
            this.f600u = view2;
        } else {
            Rect rect = this.f594c;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iH = h(rect);
            if (iH != 0) {
                scrollBy(0, iH);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z4) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iH = h(rect);
        boolean z10 = iH != 0;
        if (z10) {
            if (z4) {
                scrollBy(0, iH);
                return z10;
            }
            u(0, iH, false);
        }
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z4) {
        VelocityTracker velocityTracker;
        if (z4 && (velocityTracker = this.f602w) != null) {
            velocityTracker.recycle();
            this.f602w = null;
        }
        super.requestDisallowInterceptTouchEvent(z4);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f598s = true;
        super.requestLayout();
    }

    public final int s(boolean z4, int i, int i10, int i11) {
        int i12;
        int i13;
        boolean z10;
        if (i11 == 1) {
            v(2, i11);
        }
        boolean zC = this.J.c(0, i, i11, this.E, this.D);
        int[] iArr = this.D;
        int[] iArr2 = this.E;
        if (zC) {
            i12 = i - iArr2[1];
            i13 = iArr[1];
        } else {
            i12 = i;
            i13 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z11 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z4;
        boolean z12 = p(i12, 0, scrollY, scrollRange) && !this.J.f(i11);
        int scrollY2 = getScrollY() - scrollY;
        iArr2[1] = 0;
        this.J.d(0, scrollY2, 0, i12 - scrollY2, this.D, i11, iArr2);
        int i14 = i13 + iArr[1];
        int i15 = i12 - iArr2[1];
        int i16 = scrollY + i15;
        EdgeEffect edgeEffect = this.f596f;
        EdgeEffect edgeEffect2 = this.e;
        if (i16 < 0) {
            if (z11) {
                c1.z(edgeEffect2, (-i15) / getHeight(), i10 / getWidth());
                if (!edgeEffect.isFinished()) {
                    edgeEffect.onRelease();
                }
            }
        } else if (i16 > scrollRange && z11) {
            c1.z(edgeEffect, i15 / getHeight(), 1.0f - (i10 / getWidth()));
            if (!edgeEffect2.isFinished()) {
                edgeEffect2.onRelease();
            }
        }
        if (edgeEffect2.isFinished() && edgeEffect.isFinished()) {
            z10 = z12;
        } else {
            WeakHashMap weakHashMap = v0.f7946a;
            d0.k(this);
            z10 = false;
        }
        if (z10 && i11 == 0) {
            this.f602w.clear();
        }
        if (i11 == 1) {
            x(i11);
            edgeEffect2.onRelease();
            edgeEffect.onRelease();
        }
        return i14;
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i10) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i < 0) {
                i = 0;
            } else if (width + i > width2) {
                i = width2 - width;
            }
            if (height >= height2 || i10 < 0) {
                i10 = 0;
            } else if (height + i10 > height2) {
                i10 = height2 - height;
            }
            if (i == getScrollX() && i10 == getScrollY()) {
                return;
            }
            super.scrollTo(i, i10);
        }
    }

    public void setFillViewport(boolean z4) {
        if (z4 != this.f603x) {
            this.f603x = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z4) {
        p pVar = this.J;
        if (pVar.f7928d) {
            ViewGroup viewGroup = pVar.f7927c;
            WeakHashMap weakHashMap = v0.f7946a;
            j0.z(viewGroup);
        }
        pVar.f7928d = z4;
    }

    public void setSmoothScrollingEnabled(boolean z4) {
        this.f604y = z4;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.J.g(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        x(0);
    }

    public final boolean t(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        float fT = c1.t(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i) * 0.35f;
        float f10 = this.f592a * 0.015f;
        double dLog = Math.log(fAbs / f10);
        double d10 = L;
        return ((float) (Math.exp((d10 / (d10 - 1.0d)) * dLog) * ((double) f10))) < fT;
    }

    public final void u(int i, int i10, boolean z4) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f593b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iMax = Math.max(0, Math.min(i10 + scrollY, Math.max(0, height - height2))) - scrollY;
            this.f595d.startScroll(getScrollX(), scrollY, 0, iMax, 250);
            if (z4) {
                v(2, 1);
            } else {
                x(1);
            }
            this.G = getScrollY();
            WeakHashMap weakHashMap = v0.f7946a;
            d0.k(this);
        } else {
            OverScroller overScroller = this.f595d;
            if (!overScroller.isFinished()) {
                overScroller.abortAnimation();
                x(1);
            }
            scrollBy(i, i10);
        }
        this.f593b = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void v(int i, int i10) {
        this.J.g(2, i10);
    }

    public final boolean w(MotionEvent motionEvent) {
        boolean z4;
        EdgeEffect edgeEffect = this.e;
        if (c1.t(edgeEffect) != 0.0f) {
            c1.z(edgeEffect, 0.0f, motionEvent.getX() / getWidth());
            z4 = true;
        } else {
            z4 = false;
        }
        EdgeEffect edgeEffect2 = this.f596f;
        if (c1.t(edgeEffect2) == 0.0f) {
            return z4;
        }
        c1.z(edgeEffect2, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public final void x(int i) {
        this.J.h(i);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i) {
        if (getChildCount() <= 0) {
            super.addView(view, i);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    public void setOnScrollChangeListener(j jVar) {
    }
}

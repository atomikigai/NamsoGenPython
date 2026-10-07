package com.google.android.material.tabs;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.CheckerHistoryActivity;
import app.namso_gen.spacehowen.R;
import b9.e;
import com.bumptech.glide.d;
import e0.k;
import f9.b;
import f9.c;
import f9.g;
import f9.i;
import i9.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import p0.f;
import q0.d0;
import q0.e0;
import q0.g0;
import q0.j0;
import q0.v0;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class TabLayout extends HorizontalScrollView {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final f f2519c0 = new f(16);
    public int A;
    public final PorterDuff.Mode B;
    public final float C;
    public final float D;
    public final int E;
    public int F;
    public final int G;
    public final int H;
    public final int I;
    public final int J;
    public int K;
    public final int L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public int Q;
    public int R;
    public boolean S;
    public e T;
    public final TimeInterpolator U;
    public c V;
    public final ArrayList W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2520a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public ValueAnimator f2521a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f2522b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final p0.e f2523b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f2524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f9.f f2525d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2526f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f2527r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f2528s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f2529t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f2530u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f2531v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f2532w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ColorStateList f2533x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ColorStateList f2534y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Drawable f2535z;

    public TabLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.tabStyle, R.style.Widget_Design_TabLayout), attributeSet, R.attr.tabStyle);
        this.f2520a = -1;
        this.f2522b = new ArrayList();
        this.f2531v = -1;
        this.A = 0;
        this.F = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
        this.Q = -1;
        this.W = new ArrayList();
        this.f2523b0 = new p0.e(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        f9.f fVar = new f9.f(this, context2);
        this.f2525d = fVar;
        super.addView(fVar, 0, new FrameLayout.LayoutParams(-2, -1));
        TypedArray typedArrayG = n.g(context2, attributeSet, d8.a.H, R.attr.tabStyle, R.style.Widget_Design_TabLayout, 24);
        ColorStateList colorStateListA = q8.a.a(getBackground());
        if (colorStateListA != null) {
            b9.g gVar = new b9.g();
            gVar.k(colorStateListA);
            gVar.i(context2);
            WeakHashMap weakHashMap = v0.f7946a;
            gVar.j(j0.i(this));
            d0.q(this, gVar);
        }
        setSelectedTabIndicator(android.support.v4.media.session.a.j(context2, typedArrayG, 5));
        setSelectedTabIndicatorColor(typedArrayG.getColor(8, 0));
        fVar.b(typedArrayG.getDimensionPixelSize(11, -1));
        setSelectedTabIndicatorGravity(typedArrayG.getInt(10, 0));
        setTabIndicatorAnimationMode(typedArrayG.getInt(7, 0));
        setTabIndicatorFullWidth(typedArrayG.getBoolean(9, true));
        int dimensionPixelSize = typedArrayG.getDimensionPixelSize(16, 0);
        this.f2528s = dimensionPixelSize;
        this.f2527r = dimensionPixelSize;
        this.f2526f = dimensionPixelSize;
        this.e = dimensionPixelSize;
        this.e = typedArrayG.getDimensionPixelSize(19, dimensionPixelSize);
        this.f2526f = typedArrayG.getDimensionPixelSize(20, dimensionPixelSize);
        this.f2527r = typedArrayG.getDimensionPixelSize(18, dimensionPixelSize);
        this.f2528s = typedArrayG.getDimensionPixelSize(17, dimensionPixelSize);
        if (a.a.m(context2, R.attr.isMaterial3Theme, false)) {
            this.f2529t = R.attr.textAppearanceTitleSmall;
        } else {
            this.f2529t = R.attr.textAppearanceButton;
        }
        int resourceId = typedArrayG.getResourceId(24, R.style.TextAppearance_Design_Tab);
        this.f2530u = resourceId;
        int[] iArr = f.a.f3571w;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, iArr);
        try {
            float dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
            this.C = dimensionPixelSize2;
            this.f2532w = android.support.v4.media.session.a.h(context2, typedArrayObtainStyledAttributes, 3);
            typedArrayObtainStyledAttributes.recycle();
            if (typedArrayG.hasValue(22)) {
                this.f2531v = typedArrayG.getResourceId(22, resourceId);
            }
            int i = this.f2531v;
            int[] iArr2 = HorizontalScrollView.EMPTY_STATE_SET;
            int[] iArr3 = HorizontalScrollView.SELECTED_STATE_SET;
            if (i != -1) {
                TypedArray typedArrayObtainStyledAttributes2 = context2.obtainStyledAttributes(i, iArr);
                try {
                    typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, (int) dimensionPixelSize2);
                    ColorStateList colorStateListH = android.support.v4.media.session.a.h(context2, typedArrayObtainStyledAttributes2, 3);
                    if (colorStateListH != null) {
                        this.f2532w = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{colorStateListH.getColorForState(new int[]{android.R.attr.state_selected}, colorStateListH.getDefaultColor()), this.f2532w.getDefaultColor()});
                    }
                    typedArrayObtainStyledAttributes2.recycle();
                } catch (Throwable th) {
                    typedArrayObtainStyledAttributes2.recycle();
                    throw th;
                }
            }
            if (typedArrayG.hasValue(25)) {
                this.f2532w = android.support.v4.media.session.a.h(context2, typedArrayG, 25);
            }
            if (typedArrayG.hasValue(23)) {
                this.f2532w = new ColorStateList(new int[][]{iArr3, iArr2}, new int[]{typedArrayG.getColor(23, 0), this.f2532w.getDefaultColor()});
            }
            this.f2533x = android.support.v4.media.session.a.h(context2, typedArrayG, 3);
            this.B = n.h(typedArrayG.getInt(4, -1), null);
            this.f2534y = android.support.v4.media.session.a.h(context2, typedArrayG, 21);
            this.L = typedArrayG.getInt(6, 300);
            this.U = android.support.v4.media.session.a.w(context2, R.attr.motionEasingEmphasizedInterpolator, e8.a.f3492b);
            this.G = typedArrayG.getDimensionPixelSize(14, -1);
            this.H = typedArrayG.getDimensionPixelSize(13, -1);
            this.E = typedArrayG.getResourceId(0, 0);
            this.J = typedArrayG.getDimensionPixelSize(1, 0);
            this.N = typedArrayG.getInt(15, 1);
            this.K = typedArrayG.getInt(2, 0);
            this.O = typedArrayG.getBoolean(12, false);
            this.S = typedArrayG.getBoolean(26, false);
            typedArrayG.recycle();
            Resources resources = getResources();
            this.D = resources.getDimensionPixelSize(R.dimen.design_tab_text_size_2line);
            this.I = resources.getDimensionPixelSize(R.dimen.design_tab_scrollable_min_width);
            c();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private int getDefaultHeight() {
        ArrayList arrayList = this.f2522b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            g gVar = (g) arrayList.get(i);
            if (gVar != null && gVar.f3658a != null && !TextUtils.isEmpty(gVar.f3659b)) {
                return !this.O ? 72 : 48;
            }
        }
        return 48;
    }

    private int getTabMinWidth() {
        int i = this.G;
        if (i != -1) {
            return i;
        }
        int i10 = this.N;
        if (i10 == 0 || i10 == 2) {
            return this.I;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f2525d.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    private void setSelectedTabView(int i) {
        f9.f fVar = this.f2525d;
        int childCount = fVar.getChildCount();
        if (i < childCount) {
            int i10 = 0;
            while (i10 < childCount) {
                View childAt = fVar.getChildAt(i10);
                if ((i10 != i || childAt.isSelected()) && (i10 == i || !childAt.isSelected())) {
                    childAt.setSelected(i10 == i);
                    childAt.setActivated(i10 == i);
                } else {
                    childAt.setSelected(i10 == i);
                    childAt.setActivated(i10 == i);
                    if (childAt instanceof i) {
                        ((i) childAt).g();
                    }
                }
                i10++;
            }
        }
    }

    public final void a(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        TabItem tabItem = (TabItem) view;
        g gVar = (g) f2519c0.c();
        if (gVar == null) {
            gVar = new g();
            gVar.f3661d = -1;
        }
        gVar.f3662f = this;
        p0.e eVar = this.f2523b0;
        i iVar = eVar != null ? (i) eVar.c() : null;
        if (iVar == null) {
            iVar = new i(this, getContext());
        }
        iVar.setTab(gVar);
        iVar.setFocusable(true);
        iVar.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(gVar.f3660c)) {
            iVar.setContentDescription(gVar.f3659b);
        } else {
            iVar.setContentDescription(gVar.f3660c);
        }
        gVar.f3663g = iVar;
        CharSequence charSequence = tabItem.f2516a;
        if (charSequence != null) {
            if (TextUtils.isEmpty(gVar.f3660c) && !TextUtils.isEmpty(charSequence)) {
                gVar.f3663g.setContentDescription(charSequence);
            }
            gVar.f3659b = charSequence;
            i iVar2 = gVar.f3663g;
            if (iVar2 != null) {
                iVar2.e();
            }
        }
        Drawable drawable = tabItem.f2517b;
        if (drawable != null) {
            gVar.f3658a = drawable;
            TabLayout tabLayout = gVar.f3662f;
            if (tabLayout.K == 1 || tabLayout.N == 2) {
                tabLayout.i(true);
            }
            i iVar3 = gVar.f3663g;
            if (iVar3 != null) {
                iVar3.e();
            }
        }
        int i = tabItem.f2518c;
        if (i != 0) {
            gVar.e = LayoutInflater.from(gVar.f3663g.getContext()).inflate(i, (ViewGroup) gVar.f3663g, false);
            i iVar4 = gVar.f3663g;
            if (iVar4 != null) {
                iVar4.e();
            }
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            gVar.f3660c = tabItem.getContentDescription();
            i iVar5 = gVar.f3663g;
            if (iVar5 != null) {
                iVar5.e();
            }
        }
        ArrayList arrayList = this.f2522b;
        boolean zIsEmpty = arrayList.isEmpty();
        int size = arrayList.size();
        if (gVar.f3662f != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        gVar.f3661d = size;
        arrayList.add(size, gVar);
        int size2 = arrayList.size();
        int i10 = -1;
        for (int i11 = size + 1; i11 < size2; i11++) {
            if (((g) arrayList.get(i11)).f3661d == this.f2520a) {
                i10 = i11;
            }
            ((g) arrayList.get(i11)).f3661d = i11;
        }
        this.f2520a = i10;
        i iVar6 = gVar.f3663g;
        iVar6.setSelected(false);
        iVar6.setActivated(false);
        int i12 = gVar.f3661d;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        if (this.N == 1 && this.K == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
        this.f2525d.addView(iVar6, i12, layoutParams);
        if (zIsEmpty) {
            TabLayout tabLayout2 = gVar.f3662f;
            if (tabLayout2 == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout2.g(gVar);
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view) {
        a(view);
    }

    public final void b(int i) {
        if (i == -1) {
            return;
        }
        if (getWindowToken() != null) {
            WeakHashMap weakHashMap = v0.f7946a;
            if (g0.c(this)) {
                f9.f fVar = this.f2525d;
                int childCount = fVar.getChildCount();
                for (int i10 = 0; i10 < childCount; i10++) {
                    if (fVar.getChildAt(i10).getWidth() > 0) {
                    }
                }
                int scrollX = getScrollX();
                int iD = d(i);
                if (scrollX != iD) {
                    e();
                    this.f2521a0.setIntValues(scrollX, iD);
                    this.f2521a0.start();
                }
                ValueAnimator valueAnimator = fVar.f3656a;
                if (valueAnimator != null && valueAnimator.isRunning() && fVar.f3657b.f2520a != i) {
                    fVar.f3656a.cancel();
                }
                fVar.d(i, this.L, true);
                return;
            }
        }
        h(i);
    }

    public final void c() {
        int i = this.N;
        int iMax = (i == 0 || i == 2) ? Math.max(0, this.J - this.e) : 0;
        WeakHashMap weakHashMap = v0.f7946a;
        f9.f fVar = this.f2525d;
        e0.k(fVar, iMax, 0, 0, 0);
        int i10 = this.N;
        if (i10 == 0) {
            int i11 = this.K;
            if (i11 == 0) {
                Log.w("TabLayout", "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
            } else if (i11 == 1) {
                fVar.setGravity(1);
            } else if (i11 == 2) {
            }
            fVar.setGravity(8388611);
        } else if (i10 == 1 || i10 == 2) {
            if (this.K == 2) {
                Log.w("TabLayout", "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            fVar.setGravity(1);
        }
        i(true);
    }

    public final int d(int i) {
        f9.f fVar;
        View childAt;
        int i10 = this.N;
        if ((i10 != 0 && i10 != 2) || (childAt = (fVar = this.f2525d).getChildAt(i)) == null) {
            return 0;
        }
        int i11 = i + 1;
        View childAt2 = i11 < fVar.getChildCount() ? fVar.getChildAt(i11) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = ((width / 2) + childAt.getLeft()) - (getWidth() / 2);
        int i12 = (int) ((width + width2) * 0.5f * 0.0f);
        WeakHashMap weakHashMap = v0.f7946a;
        return e0.d(this) == 0 ? left + i12 : left - i12;
    }

    public final void e() {
        if (this.f2521a0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2521a0 = valueAnimator;
            valueAnimator.setInterpolator(this.U);
            this.f2521a0.setDuration(this.L);
            this.f2521a0.addUpdateListener(new b(this, 0));
        }
    }

    public final void f() {
        f9.f fVar = this.f2525d;
        int childCount = fVar.getChildCount();
        while (true) {
            childCount--;
            if (childCount < 0) {
                break;
            }
            i iVar = (i) fVar.getChildAt(childCount);
            fVar.removeViewAt(childCount);
            if (iVar != null) {
                iVar.setTab(null);
                iVar.setSelected(false);
                this.f2523b0.b(iVar);
            }
            requestLayout();
        }
        Iterator it = this.f2522b.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            it.remove();
            gVar.f3662f = null;
            gVar.f3663g = null;
            gVar.f3658a = null;
            gVar.f3659b = null;
            gVar.f3660c = null;
            gVar.f3661d = -1;
            gVar.e = null;
            f2519c0.b(gVar);
        }
        this.f2524c = null;
    }

    public final void g(g gVar) {
        g gVar2 = this.f2524c;
        ArrayList arrayList = this.W;
        if (gVar2 == gVar) {
            if (gVar2 != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    ((c) arrayList.get(size)).getClass();
                }
                b(gVar.f3661d);
                return;
            }
            return;
        }
        int i = gVar.f3661d;
        if ((gVar2 == null || gVar2.f3661d == -1) && i != -1) {
            h(i);
        } else {
            b(i);
        }
        if (i != -1) {
            setSelectedTabView(i);
        }
        this.f2524c = gVar;
        if (gVar2 != null && gVar2.f3662f != null) {
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ((h3.i) ((c) arrayList.get(size2))).getClass();
            }
        }
        for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
            CheckerHistoryActivity checkerHistoryActivity = ((h3.i) ((c) arrayList.get(size3))).f4720a;
            int i10 = gVar.f3661d;
            int i11 = CheckerHistoryActivity.Q;
            checkerHistoryActivity.u(i10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    public int getSelectedTabPosition() {
        g gVar = this.f2524c;
        if (gVar != null) {
            return gVar.f3661d;
        }
        return -1;
    }

    public int getTabCount() {
        return this.f2522b.size();
    }

    public int getTabGravity() {
        return this.K;
    }

    public ColorStateList getTabIconTint() {
        return this.f2533x;
    }

    public int getTabIndicatorAnimationMode() {
        return this.R;
    }

    public int getTabIndicatorGravity() {
        return this.M;
    }

    public int getTabMaxWidth() {
        return this.F;
    }

    public int getTabMode() {
        return this.N;
    }

    public ColorStateList getTabRippleColor() {
        return this.f2534y;
    }

    public Drawable getTabSelectedIndicator() {
        return this.f2535z;
    }

    public ColorStateList getTabTextColors() {
        return this.f2532w;
    }

    public final void h(int i) {
        float f10 = i + 0.0f;
        int iRound = Math.round(f10);
        if (iRound >= 0) {
            f9.f fVar = this.f2525d;
            if (iRound >= fVar.getChildCount()) {
                return;
            }
            fVar.f3657b.f2520a = Math.round(f10);
            ValueAnimator valueAnimator = fVar.f3656a;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                fVar.f3656a.cancel();
            }
            fVar.c(fVar.getChildAt(i), fVar.getChildAt(i + 1), 0.0f);
            ValueAnimator valueAnimator2 = this.f2521a0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2521a0.cancel();
            }
            int iD = d(i);
            int scrollX = getScrollX();
            if ((i >= getSelectedTabPosition() || iD < scrollX) && (i <= getSelectedTabPosition() || iD > scrollX)) {
                getSelectedTabPosition();
            }
            WeakHashMap weakHashMap = v0.f7946a;
            if (e0.d(this) == 1 && ((i >= getSelectedTabPosition() || iD > scrollX) && (i <= getSelectedTabPosition() || iD < scrollX))) {
                getSelectedTabPosition();
            }
            if (i < 0) {
                iD = 0;
            }
            scrollTo(iD, 0);
            setSelectedTabView(iRound);
        }
    }

    public final void i(boolean z4) {
        int i = 0;
        while (true) {
            f9.f fVar = this.f2525d;
            if (i >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i);
            childAt.setMinimumWidth(getTabMinWidth());
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            if (this.N == 1 && this.K == 0) {
                layoutParams.width = 0;
                layoutParams.weight = 1.0f;
            } else {
                layoutParams.width = -2;
                layoutParams.weight = 0.0f;
            }
            if (z4) {
                childAt.requestLayout();
            }
            i++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof b9.g) {
            d.A(this, (b9.g) background);
        }
        getParent();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        i iVar;
        Drawable drawable;
        int i = 0;
        while (true) {
            f9.f fVar = this.f2525d;
            if (i >= fVar.getChildCount()) {
                super.onDraw(canvas);
                return;
            }
            View childAt = fVar.getChildAt(i);
            if ((childAt instanceof i) && (drawable = (iVar = (i) childAt).f3674t) != null) {
                drawable.setBounds(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
                iVar.f3674t.draw(canvas);
            }
            i++;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) n5.c.a(1, getTabCount(), 1).f7282a);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return (getTabMode() == 0 || getTabMode() == 2) && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        int iRound = Math.round(n.d(getContext(), getDefaultHeight()));
        int mode = View.MeasureSpec.getMode(i10);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i10 = View.MeasureSpec.makeMeasureSpec(getPaddingBottom() + getPaddingTop() + iRound, 1073741824);
            }
        } else if (getChildCount() == 1 && View.MeasureSpec.getSize(i10) >= iRound) {
            getChildAt(0).setMinimumHeight(iRound);
        }
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i) != 0) {
            int iD = this.H;
            if (iD <= 0) {
                iD = (int) (size - n.d(getContext(), 56));
            }
            this.F = iD;
        }
        super.onMeasure(i, i10);
        if (getChildCount() == 1) {
            View childAt = getChildAt(0);
            int i11 = this.N;
            if (i11 == 0) {
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (i11 != 1) {
                if (i11 != 2) {
                    return;
                }
                if (childAt.getMeasuredWidth() >= getMeasuredWidth()) {
                    return;
                }
            } else if (childAt.getMeasuredWidth() == getMeasuredWidth()) {
                return;
            }
            childAt.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), ViewGroup.getChildMeasureSpec(i10, getPaddingBottom() + getPaddingTop(), childAt.getLayoutParams().height));
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || getTabMode() == 0 || getTabMode() == 2) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        Drawable background = getBackground();
        if (background instanceof b9.g) {
            ((b9.g) background).j(f10);
        }
    }

    public void setInlineLabel(boolean z4) {
        if (this.O == z4) {
            return;
        }
        this.O = z4;
        int i = 0;
        while (true) {
            f9.f fVar = this.f2525d;
            if (i >= fVar.getChildCount()) {
                c();
                return;
            }
            View childAt = fVar.getChildAt(i);
            if (childAt instanceof i) {
                i iVar = (i) childAt;
                iVar.setOrientation(!iVar.f3676v.O ? 1 : 0);
                TextView textView = iVar.f3672r;
                if (textView == null && iVar.f3673s == null) {
                    iVar.h(iVar.f3668b, iVar.f3669c, true);
                } else {
                    iVar.h(textView, iVar.f3673s, false);
                }
            }
            i++;
        }
    }

    public void setInlineLabelResource(int i) {
        setInlineLabel(getResources().getBoolean(i));
    }

    @Deprecated
    public void setOnTabSelectedListener(f9.d dVar) {
        setOnTabSelectedListener((c) dVar);
    }

    public void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        e();
        this.f2521a0.addListener(animatorListener);
    }

    public void setSelectedTabIndicator(Drawable drawable) {
        if (drawable == null) {
            drawable = new GradientDrawable();
        }
        Drawable drawableMutate = drawable.mutate();
        this.f2535z = drawableMutate;
        int i = this.A;
        if (i != 0) {
            i0.b.g(drawableMutate, i);
        } else {
            i0.b.h(drawableMutate, null);
        }
        int intrinsicHeight = this.Q;
        if (intrinsicHeight == -1) {
            intrinsicHeight = this.f2535z.getIntrinsicHeight();
        }
        this.f2525d.b(intrinsicHeight);
    }

    public void setSelectedTabIndicatorColor(int i) {
        this.A = i;
        Drawable drawable = this.f2535z;
        if (i != 0) {
            i0.b.g(drawable, i);
        } else {
            i0.b.h(drawable, null);
        }
        i(false);
    }

    public void setSelectedTabIndicatorGravity(int i) {
        if (this.M != i) {
            this.M = i;
            WeakHashMap weakHashMap = v0.f7946a;
            d0.k(this.f2525d);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i) {
        this.Q = i;
        this.f2525d.b(i);
    }

    public void setTabGravity(int i) {
        if (this.K != i) {
            this.K = i;
            c();
        }
    }

    public void setTabIconTint(ColorStateList colorStateList) {
        if (this.f2533x != colorStateList) {
            this.f2533x = colorStateList;
            ArrayList arrayList = this.f2522b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                i iVar = ((g) arrayList.get(i)).f3663g;
                if (iVar != null) {
                    iVar.e();
                }
            }
        }
    }

    public void setTabIconTintResource(int i) {
        setTabIconTint(k.getColorStateList(getContext(), i));
    }

    public void setTabIndicatorAnimationMode(int i) {
        this.R = i;
        if (i == 0) {
            this.T = new e(14);
            return;
        }
        if (i == 1) {
            this.T = new f9.a(0);
        } else {
            if (i == 2) {
                this.T = new f9.a(1);
                return;
            }
            throw new IllegalArgumentException(i + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z4) {
        this.P = z4;
        int i = f9.f.f3655c;
        f9.f fVar = this.f2525d;
        fVar.a(fVar.f3657b.getSelectedTabPosition());
        WeakHashMap weakHashMap = v0.f7946a;
        d0.k(fVar);
    }

    public void setTabMode(int i) {
        if (i != this.N) {
            this.N = i;
            c();
        }
    }

    public void setTabRippleColor(ColorStateList colorStateList) {
        if (this.f2534y == colorStateList) {
            return;
        }
        this.f2534y = colorStateList;
        int i = 0;
        while (true) {
            f9.f fVar = this.f2525d;
            if (i >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i);
            if (childAt instanceof i) {
                Context context = getContext();
                int i10 = i.f3666w;
                ((i) childAt).f(context);
            }
            i++;
        }
    }

    public void setTabRippleColorResource(int i) {
        setTabRippleColor(k.getColorStateList(getContext(), i));
    }

    public void setTabTextColors(ColorStateList colorStateList) {
        if (this.f2532w != colorStateList) {
            this.f2532w = colorStateList;
            ArrayList arrayList = this.f2522b;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                i iVar = ((g) arrayList.get(i)).f3663g;
                if (iVar != null) {
                    iVar.e();
                }
            }
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(q2.a aVar) {
        f();
    }

    public void setUnboundedRipple(boolean z4) {
        if (this.S == z4) {
            return;
        }
        this.S = z4;
        int i = 0;
        while (true) {
            f9.f fVar = this.f2525d;
            if (i >= fVar.getChildCount()) {
                return;
            }
            View childAt = fVar.getChildAt(i);
            if (childAt instanceof i) {
                Context context = getContext();
                int i10 = i.f3666w;
                ((i) childAt).f(context);
            }
            i++;
        }
    }

    public void setUnboundedRippleResource(int i) {
        setUnboundedRipple(getResources().getBoolean(i));
    }

    public void setupWithViewPager(q2.b bVar) {
        f();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i) {
        a(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public final FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(c cVar) {
        c cVar2 = this.V;
        ArrayList arrayList = this.W;
        if (cVar2 != null) {
            arrayList.remove(cVar2);
        }
        this.V = cVar;
        if (cVar == null || arrayList.contains(cVar)) {
            return;
        }
        arrayList.add(cVar);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        a(view);
    }

    public void setSelectedTabIndicator(int i) {
        if (i != 0) {
            setSelectedTabIndicator(d.r(getContext(), i));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}

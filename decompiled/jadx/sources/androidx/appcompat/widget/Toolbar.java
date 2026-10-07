package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.i;
import app.namso_gen.spacehowen.R;
import com.google.android.material.datepicker.l;
import h6.o0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import l.b3;
import l.c3;
import l.d3;
import l.e3;
import l.f3;
import l.g3;
import l.h3;
import l.i3;
import l.j;
import l.k1;
import l.m2;
import l.p3;
import l.v;
import l.w;
import l.z0;
import q0.d0;
import q0.e0;
import q0.g0;
import q0.n;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup {
    public int A;
    public int B;
    public int C;
    public int D;
    public m2 E;
    public int F;
    public int G;
    public final int H;
    public CharSequence I;
    public CharSequence J;
    public ColorStateList K;
    public ColorStateList L;
    public boolean M;
    public boolean N;
    public final ArrayList O;
    public final ArrayList P;
    public final int[] Q;
    public final o0 R;
    public ArrayList S;
    public final ib.c T;
    public i3 U;
    public j V;
    public d3 W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f513a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f514a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z0 f515b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public OnBackInvokedCallback f516b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z0 f517c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public OnBackInvokedDispatcher f518c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public v f519d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f520d0;
    public w e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final i f521e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Drawable f522f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f523r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public v f524s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f525t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Context f526u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f527v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f528w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f529x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f530y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final int f531z;

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new j.i(getContext());
    }

    public static e3 h() {
        e3 e3Var = new e3(-2, -2);
        e3Var.f6264b = 0;
        e3Var.f6263a = 8388627;
        return e3Var;
    }

    public static e3 i(ViewGroup.LayoutParams layoutParams) {
        boolean z4 = layoutParams instanceof e3;
        if (z4) {
            e3 e3Var = (e3) layoutParams;
            e3 e3Var2 = new e3(e3Var);
            e3Var2.f6264b = 0;
            e3Var2.f6264b = e3Var.f6264b;
            return e3Var2;
        }
        if (z4) {
            e3 e3Var3 = new e3((e3) layoutParams);
            e3Var3.f6264b = 0;
            return e3Var3;
        }
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            e3 e3Var4 = new e3(layoutParams);
            e3Var4.f6264b = 0;
            return e3Var4;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        e3 e3Var5 = new e3(marginLayoutParams);
        e3Var5.f6264b = 0;
        ((ViewGroup.MarginLayoutParams) e3Var5).leftMargin = marginLayoutParams.leftMargin;
        ((ViewGroup.MarginLayoutParams) e3Var5).topMargin = marginLayoutParams.topMargin;
        ((ViewGroup.MarginLayoutParams) e3Var5).rightMargin = marginLayoutParams.rightMargin;
        ((ViewGroup.MarginLayoutParams) e3Var5).bottomMargin = marginLayoutParams.bottomMargin;
        return e3Var5;
    }

    public static int k(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return n.b(marginLayoutParams) + n.c(marginLayoutParams);
    }

    public static int l(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final void a(ArrayList arrayList, int i) {
        WeakHashMap weakHashMap = v0.f7946a;
        boolean z4 = e0.d(this) == 1;
        int childCount = getChildCount();
        int absoluteGravity = Gravity.getAbsoluteGravity(i, e0.d(this));
        arrayList.clear();
        if (!z4) {
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                e3 e3Var = (e3) childAt.getLayoutParams();
                if (e3Var.f6264b == 0 && t(childAt)) {
                    int i11 = e3Var.f6263a;
                    WeakHashMap weakHashMap2 = v0.f7946a;
                    int iD = e0.d(this);
                    int absoluteGravity2 = Gravity.getAbsoluteGravity(i11, iD) & 7;
                    if (absoluteGravity2 != 1 && absoluteGravity2 != 3 && absoluteGravity2 != 5) {
                        absoluteGravity2 = iD == 1 ? 5 : 3;
                    }
                    if (absoluteGravity2 == absoluteGravity) {
                        arrayList.add(childAt);
                    }
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            e3 e3Var2 = (e3) childAt2.getLayoutParams();
            if (e3Var2.f6264b == 0 && t(childAt2)) {
                int i13 = e3Var2.f6263a;
                WeakHashMap weakHashMap3 = v0.f7946a;
                int iD2 = e0.d(this);
                int absoluteGravity3 = Gravity.getAbsoluteGravity(i13, iD2) & 7;
                if (absoluteGravity3 != 1 && absoluteGravity3 != 3 && absoluteGravity3 != 5) {
                    absoluteGravity3 = iD2 == 1 ? 5 : 3;
                }
                if (absoluteGravity3 == absoluteGravity) {
                    arrayList.add(childAt2);
                }
            }
        }
    }

    public final void b(View view, boolean z4) {
        e3 e3VarI;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            e3VarI = h();
        } else {
            e3VarI = !checkLayoutParams(layoutParams) ? i(layoutParams) : (e3) layoutParams;
        }
        e3VarI.f6264b = 1;
        if (!z4 || this.f525t == null) {
            addView(view, e3VarI);
        } else {
            view.setLayoutParams(e3VarI);
            this.P.add(view);
        }
    }

    public final void c() {
        if (this.f524s == null) {
            v vVar = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            this.f524s = vVar;
            vVar.setImageDrawable(this.f522f);
            this.f524s.setContentDescription(this.f523r);
            e3 e3VarH = h();
            e3VarH.f6263a = (this.f530y & 112) | 8388611;
            e3VarH.f6264b = 2;
            this.f524s.setLayoutParams(e3VarH);
            this.f524s.setOnClickListener(new l(this, 4));
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e3);
    }

    public final void d() {
        if (this.E == null) {
            m2 m2Var = new m2();
            m2Var.f6353a = 0;
            m2Var.f6354b = 0;
            m2Var.f6355c = Integer.MIN_VALUE;
            m2Var.f6356d = Integer.MIN_VALUE;
            m2Var.e = 0;
            m2Var.f6357f = 0;
            m2Var.f6358g = false;
            m2Var.h = false;
            this.E = m2Var;
        }
    }

    public final void e() {
        f();
        ActionMenuView actionMenuView = this.f513a;
        if (actionMenuView.A == null) {
            k.l lVar = (k.l) actionMenuView.getMenu();
            if (this.W == null) {
                this.W = new d3(this);
            }
            this.f513a.setExpandedActionViewsExclusive(true);
            lVar.b(this.W, this.f526u);
            u();
        }
    }

    public final void f() {
        if (this.f513a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), null);
            this.f513a = actionMenuView;
            actionMenuView.setPopupTheme(this.f527v);
            this.f513a.setOnMenuItemClickListener(this.T);
            ActionMenuView actionMenuView2 = this.f513a;
            a5.b bVar = new a5.b(this, 19);
            actionMenuView2.getClass();
            actionMenuView2.F = bVar;
            e3 e3VarH = h();
            e3VarH.f6263a = (this.f530y & 112) | 8388613;
            this.f513a.setLayoutParams(e3VarH);
            b(this.f513a, false);
        }
    }

    public final void g() {
        if (this.f519d == null) {
            this.f519d = new v(getContext(), null, R.attr.toolbarNavigationButtonStyle);
            e3 e3VarH = h();
            e3VarH.f6263a = (this.f530y & 112) | 8388611;
            this.f519d.setLayoutParams(e3VarH);
        }
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return h();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return i(layoutParams);
    }

    public CharSequence getCollapseContentDescription() {
        v vVar = this.f524s;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        v vVar = this.f524s;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        m2 m2Var = this.E;
        if (m2Var != null) {
            return m2Var.f6358g ? m2Var.f6353a : m2Var.f6354b;
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i = this.G;
        return i != Integer.MIN_VALUE ? i : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        m2 m2Var = this.E;
        if (m2Var != null) {
            return m2Var.f6353a;
        }
        return 0;
    }

    public int getContentInsetRight() {
        m2 m2Var = this.E;
        if (m2Var != null) {
            return m2Var.f6354b;
        }
        return 0;
    }

    public int getContentInsetStart() {
        m2 m2Var = this.E;
        if (m2Var != null) {
            return m2Var.f6358g ? m2Var.f6354b : m2Var.f6353a;
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.F;
        return i != Integer.MIN_VALUE ? i : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        k.l lVar;
        ActionMenuView actionMenuView = this.f513a;
        return (actionMenuView == null || (lVar = actionMenuView.A) == null || !lVar.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.G, 0));
    }

    public int getCurrentContentInsetLeft() {
        WeakHashMap weakHashMap = v0.f7946a;
        return e0.d(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        WeakHashMap weakHashMap = v0.f7946a;
        return e0.d(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.F, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        w wVar = this.e;
        if (wVar != null) {
            return wVar.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        w wVar = this.e;
        if (wVar != null) {
            return wVar.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        e();
        return this.f513a.getMenu();
    }

    public View getNavButtonView() {
        return this.f519d;
    }

    public CharSequence getNavigationContentDescription() {
        v vVar = this.f519d;
        if (vVar != null) {
            return vVar.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        v vVar = this.f519d;
        if (vVar != null) {
            return vVar.getDrawable();
        }
        return null;
    }

    public j getOuterActionMenuPresenter() {
        return this.V;
    }

    public Drawable getOverflowIcon() {
        e();
        return this.f513a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f526u;
    }

    public int getPopupTheme() {
        return this.f527v;
    }

    public CharSequence getSubtitle() {
        return this.J;
    }

    public final TextView getSubtitleTextView() {
        return this.f517c;
    }

    public CharSequence getTitle() {
        return this.I;
    }

    public int getTitleMarginBottom() {
        return this.D;
    }

    public int getTitleMarginEnd() {
        return this.B;
    }

    public int getTitleMarginStart() {
        return this.A;
    }

    public int getTitleMarginTop() {
        return this.C;
    }

    public final TextView getTitleTextView() {
        return this.f515b;
    }

    public k1 getWrapper() {
        Drawable drawable;
        if (this.U == null) {
            i3 i3Var = new i3();
            i3Var.f6303n = 0;
            i3Var.f6293a = this;
            i3Var.h = getTitle();
            i3Var.i = getSubtitle();
            i3Var.f6298g = i3Var.h != null;
            i3Var.f6297f = getNavigationIcon();
            a2.l lVarG = a2.l.G(getContext(), null, f.a.f3552a, R.attr.actionBarStyle);
            TypedArray typedArray = (TypedArray) lVarG.f44c;
            i3Var.f6304o = lVarG.u(15);
            CharSequence text = typedArray.getText(27);
            if (!TextUtils.isEmpty(text)) {
                i3Var.f6298g = true;
                i3Var.h = text;
                if ((i3Var.f6294b & 8) != 0) {
                    setTitle(text);
                    if (i3Var.f6298g) {
                        v0.m(getRootView(), text);
                    }
                }
            }
            CharSequence text2 = typedArray.getText(25);
            if (!TextUtils.isEmpty(text2)) {
                i3Var.i = text2;
                if ((i3Var.f6294b & 8) != 0) {
                    setSubtitle(text2);
                }
            }
            Drawable drawableU = lVarG.u(20);
            if (drawableU != null) {
                i3Var.e = drawableU;
                i3Var.c();
            }
            Drawable drawableU2 = lVarG.u(17);
            if (drawableU2 != null) {
                i3Var.f6296d = drawableU2;
                i3Var.c();
            }
            if (i3Var.f6297f == null && (drawable = i3Var.f6304o) != null) {
                i3Var.f6297f = drawable;
                if ((i3Var.f6294b & 4) != 0) {
                    setNavigationIcon(drawable);
                } else {
                    setNavigationIcon((Drawable) null);
                }
            }
            i3Var.a(typedArray.getInt(10, 0));
            int resourceId = typedArray.getResourceId(9, 0);
            if (resourceId != 0) {
                View viewInflate = LayoutInflater.from(getContext()).inflate(resourceId, (ViewGroup) this, false);
                View view = i3Var.f6295c;
                if (view != null && (i3Var.f6294b & 16) != 0) {
                    removeView(view);
                }
                i3Var.f6295c = viewInflate;
                if (viewInflate != null && (i3Var.f6294b & 16) != 0) {
                    addView(viewInflate);
                }
                i3Var.a(i3Var.f6294b | 16);
            }
            int layoutDimension = typedArray.getLayoutDimension(13, 0);
            if (layoutDimension > 0) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                layoutParams.height = layoutDimension;
                setLayoutParams(layoutParams);
            }
            int dimensionPixelOffset = typedArray.getDimensionPixelOffset(7, -1);
            int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(3, -1);
            if (dimensionPixelOffset >= 0 || dimensionPixelOffset2 >= 0) {
                int iMax = Math.max(dimensionPixelOffset, 0);
                int iMax2 = Math.max(dimensionPixelOffset2, 0);
                d();
                this.E.a(iMax, iMax2);
            }
            int resourceId2 = typedArray.getResourceId(28, 0);
            if (resourceId2 != 0) {
                Context context = getContext();
                this.f528w = resourceId2;
                z0 z0Var = this.f515b;
                if (z0Var != null) {
                    z0Var.setTextAppearance(context, resourceId2);
                }
            }
            int resourceId3 = typedArray.getResourceId(26, 0);
            if (resourceId3 != 0) {
                Context context2 = getContext();
                this.f529x = resourceId3;
                z0 z0Var2 = this.f517c;
                if (z0Var2 != null) {
                    z0Var2.setTextAppearance(context2, resourceId3);
                }
            }
            int resourceId4 = typedArray.getResourceId(22, 0);
            if (resourceId4 != 0) {
                setPopupTheme(resourceId4);
            }
            lVarG.I();
            if (R.string.abc_action_bar_up_description != i3Var.f6303n) {
                i3Var.f6303n = R.string.abc_action_bar_up_description;
                if (TextUtils.isEmpty(getNavigationContentDescription())) {
                    int i = i3Var.f6303n;
                    i3Var.f6299j = i != 0 ? getContext().getString(i) : null;
                    i3Var.b();
                }
            }
            i3Var.f6299j = getNavigationContentDescription();
            setNavigationOnClickListener(new h3(i3Var));
            this.U = i3Var;
        }
        return this.U;
    }

    public final int j(View view, int i) {
        e3 e3Var = (e3) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i10 = i > 0 ? (measuredHeight - i) / 2 : 0;
        int i11 = e3Var.f6263a & 112;
        if (i11 != 16 && i11 != 48 && i11 != 80) {
            i11 = this.H & 112;
        }
        if (i11 == 48) {
            return getPaddingTop() - i10;
        }
        if (i11 == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) e3Var).bottomMargin) - i10;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i12 = ((ViewGroup.MarginLayoutParams) e3Var).topMargin;
        if (iMax < i12) {
            iMax = i12;
        } else {
            int i13 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i14 = ((ViewGroup.MarginLayoutParams) e3Var).bottomMargin;
            if (i13 < i14) {
                iMax = Math.max(0, iMax - (i14 - i13));
            }
        }
        return paddingTop + iMax;
    }

    public void m(int i) {
        getMenuInflater().inflate(i, getMenu());
    }

    public final void n() {
        ArrayList arrayList = this.S;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            getMenu().removeItem(((MenuItem) obj).getItemId());
        }
        getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        getMenuInflater();
        Iterator it = ((CopyOnWriteArrayList) this.R.f5062c).iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.S = currentMenuItems2;
    }

    public final boolean o(View view) {
        return view.getParent() == this || this.P.contains(view);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f521e0);
        u();
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.N = false;
        }
        if (!this.N) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.N = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.N = false;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027d  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f A[LOOP:0: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x02a7 A[LOOP:1: B:105:0x02a5->B:106:0x02a7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:109:0x02c7 A[LOOP:2: B:108:0x02c5->B:109:0x02c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:113:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:114:0x030f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0313  */
    /* JADX WARN: Code duplicated, block: B:118:0x031a A[LOOP:3: B:117:0x0318->B:118:0x031a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0064  */
    /* JADX WARN: Code duplicated, block: B:21:0x006b  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0082  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:40:0x0101  */
    /* JADX WARN: Code duplicated, block: B:42:0x0106  */
    /* JADX WARN: Code duplicated, block: B:43:0x011f  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0127  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:50:0x012e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0131  */
    /* JADX WARN: Code duplicated, block: B:54:0x0143  */
    /* JADX WARN: Code duplicated, block: B:56:0x014b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX WARN: Code duplicated, block: B:65:0x0168  */
    /* JADX WARN: Code duplicated, block: B:67:0x0179  */
    /* JADX WARN: Code duplicated, block: B:68:0x017b  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0193  */
    /* JADX WARN: Code duplicated, block: B:73:0x019d  */
    /* JADX WARN: Code duplicated, block: B:75:0x01aa A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af  */
    /* JADX WARN: Code duplicated, block: B:80:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x020d  */
    /* JADX WARN: Code duplicated, block: B:86:0x0210  */
    /* JADX WARN: Code duplicated, block: B:88:0x0218 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x021a  */
    /* JADX WARN: Code duplicated, block: B:91:0x021e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0255  */
    /* JADX WARN: Code duplicated, block: B:97:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x027a  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        int iP;
        int iQ;
        int iMax;
        int iMin;
        boolean zT;
        boolean zT2;
        int measuredHeight;
        z0 z0Var;
        z0 z0Var2;
        e3 e3Var;
        e3 e3Var2;
        int i13;
        boolean z10;
        int i14;
        int i15;
        int paddingTop;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        ArrayList arrayList;
        int size;
        int iP2;
        int i26;
        int size2;
        int i27;
        int i28;
        int size3;
        int i29;
        int i30;
        int measuredWidth;
        int i31;
        int i32;
        int i33;
        int size4;
        WeakHashMap weakHashMap = v0.f7946a;
        boolean z11 = e0.d(this) == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i34 = width - paddingRight;
        int[] iArr = this.Q;
        iArr[1] = 0;
        iArr[0] = 0;
        int iD = d0.d(this);
        int iMin2 = iD >= 0 ? Math.min(iD, i12 - i10) : 0;
        if (t(this.f519d)) {
            if (z11) {
                iQ = q(this.f519d, i34, iMin2, iArr);
                iP = paddingLeft;
            } else {
                iP = p(this.f519d, paddingLeft, iMin2, iArr);
            }
            if (t(this.f524s)) {
                if (z11) {
                    iQ = q(this.f524s, iQ, iMin2, iArr);
                } else {
                    iP = p(this.f524s, iP, iMin2, iArr);
                }
            }
            if (t(this.f513a)) {
                if (z11) {
                    iP = p(this.f513a, iP, iMin2, iArr);
                } else {
                    iQ = q(this.f513a, iQ, iMin2, iArr);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iP);
            iArr[1] = Math.max(0, currentContentInsetRight - (i34 - iQ));
            iMax = Math.max(iP, currentContentInsetLeft);
            iMin = Math.min(iQ, i34 - currentContentInsetRight);
            if (t(this.f525t)) {
                if (z11) {
                    iMin = q(this.f525t, iMin, iMin2, iArr);
                } else {
                    iMax = p(this.f525t, iMax, iMin2, iArr);
                }
            }
            if (t(this.e)) {
                if (z11) {
                    iMin = q(this.e, iMin, iMin2, iArr);
                } else {
                    iMax = p(this.e, iMax, iMin2, iArr);
                }
            }
            zT = t(this.f515b);
            zT2 = t(this.f517c);
            if (zT) {
                e3 e3Var3 = (e3) this.f515b.getLayoutParams();
                measuredHeight = this.f515b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e3Var3).topMargin + ((ViewGroup.MarginLayoutParams) e3Var3).bottomMargin;
            } else {
                measuredHeight = 0;
            }
            if (zT2) {
                e3 e3Var4 = (e3) this.f517c.getLayoutParams();
                measuredHeight = this.f517c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e3Var4).topMargin + ((ViewGroup.MarginLayoutParams) e3Var4).bottomMargin + measuredHeight;
            }
            if (zT || zT2) {
                if (zT) {
                    z0Var = this.f515b;
                } else {
                    z0Var = this.f517c;
                }
                if (zT2) {
                    z0Var2 = this.f517c;
                } else {
                    z0Var2 = this.f515b;
                }
                e3Var = (e3) z0Var.getLayoutParams();
                e3Var2 = (e3) z0Var2.getLayoutParams();
                i13 = measuredHeight;
                z10 = (!zT && this.f515b.getMeasuredWidth() > 0) || (zT2 && this.f517c.getMeasuredWidth() > 0);
                i14 = this.H & 112;
                i15 = iMax;
                if (i14 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e3Var).topMargin + this.C;
                } else if (i14 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                    i22 = ((ViewGroup.MarginLayoutParams) e3Var).topMargin + this.C;
                    if (iMax2 < i22) {
                        iMax2 = i22;
                    } else {
                        i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                        i24 = ((ViewGroup.MarginLayoutParams) e3Var).bottomMargin;
                        i25 = this.D;
                        if (i23 < i24 + i25) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) e3Var2).bottomMargin + i25) - i23));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e3Var2).bottomMargin) - this.D) - i13;
                }
                if (z11) {
                    if (z10) {
                        i19 = this.A;
                    } else {
                        i19 = 0;
                    }
                    int i35 = i19 - iArr[1];
                    iMin -= Math.max(0, i35);
                    iArr[1] = Math.max(0, -i35);
                    if (zT) {
                        e3 e3Var5 = (e3) this.f515b.getLayoutParams();
                        int measuredWidth2 = iMin - this.f515b.getMeasuredWidth();
                        int measuredHeight2 = this.f515b.getMeasuredHeight() + paddingTop;
                        this.f515b.layout(measuredWidth2, paddingTop, iMin, measuredHeight2);
                        i20 = measuredWidth2 - this.B;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) e3Var5).bottomMargin;
                    } else {
                        i20 = iMin;
                    }
                    if (zT2) {
                        int i36 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e3) this.f517c.getLayoutParams())).topMargin;
                        this.f517c.layout(iMin - this.f517c.getMeasuredWidth(), i36, iMin, this.f517c.getMeasuredHeight() + i36);
                        i21 = iMin - this.B;
                    } else {
                        i21 = iMin;
                    }
                    if (z10) {
                        iMin = Math.min(i20, i21);
                    }
                    iMax = i15;
                } else {
                    if (z10) {
                        i16 = this.A;
                    } else {
                        i16 = 0;
                    }
                    int i37 = i16 - iArr[0];
                    iMax = Math.max(0, i37) + i15;
                    iArr[0] = Math.max(0, -i37);
                    if (zT) {
                        e3 e3Var6 = (e3) this.f515b.getLayoutParams();
                        int measuredWidth3 = this.f515b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f515b.getMeasuredHeight() + paddingTop;
                        this.f515b.layout(iMax, paddingTop, measuredWidth3, measuredHeight3);
                        i17 = measuredWidth3 + this.B;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) e3Var6).bottomMargin;
                    } else {
                        i17 = iMax;
                    }
                    if (zT2) {
                        int i38 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e3) this.f517c.getLayoutParams())).topMargin;
                        int measuredWidth4 = this.f517c.getMeasuredWidth() + iMax;
                        this.f517c.layout(iMax, i38, measuredWidth4, this.f517c.getMeasuredHeight() + i38);
                        i18 = measuredWidth4 + this.B;
                    } else {
                        i18 = iMax;
                    }
                    if (z10) {
                        iMax = Math.max(i17, i18);
                    }
                }
            }
            arrayList = this.O;
            a(arrayList, 3);
            size = arrayList.size();
            iP2 = iMax;
            for (i26 = 0; i26 < size; i26++) {
                iP2 = p((View) arrayList.get(i26), iP2, iMin2, iArr);
            }
            a(arrayList, 5);
            size2 = arrayList.size();
            for (i27 = 0; i27 < size2; i27++) {
                iMin = q((View) arrayList.get(i27), iMin, iMin2, iArr);
            }
            a(arrayList, 1);
            int i39 = iArr[0];
            i28 = iArr[1];
            size3 = arrayList.size();
            i29 = i39;
            i30 = 0;
            measuredWidth = 0;
            while (i30 < size3) {
                View view = (View) arrayList.get(i30);
                e3 e3Var7 = (e3) view.getLayoutParams();
                int i40 = i28;
                int i41 = ((ViewGroup.MarginLayoutParams) e3Var7).leftMargin - i29;
                int i42 = ((ViewGroup.MarginLayoutParams) e3Var7).rightMargin - i40;
                int iMax3 = Math.max(0, i41);
                int iMax4 = Math.max(0, i42);
                int iMax5 = Math.max(0, -i41);
                int iMax6 = Math.max(0, -i42);
                measuredWidth += view.getMeasuredWidth() + iMax3 + iMax4;
                i30++;
                i29 = iMax5;
                i28 = iMax6;
            }
            i32 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
            i33 = measuredWidth + i32;
            if (i32 >= iP2) {
                if (i33 > iMin) {
                    iP2 = i32 - (i33 - iMin);
                } else {
                    iP2 = i32;
                }
            }
            size4 = arrayList.size();
            for (i31 = 0; i31 < size4; i31++) {
                iP2 = p((View) arrayList.get(i31), iP2, iMin2, iArr);
            }
            arrayList.clear();
        }
        iP = paddingLeft;
        iQ = i34;
        if (t(this.f524s)) {
            if (z11) {
                iQ = q(this.f524s, iQ, iMin2, iArr);
            } else {
                iP = p(this.f524s, iP, iMin2, iArr);
            }
        }
        if (t(this.f513a)) {
            if (z11) {
                iP = p(this.f513a, iP, iMin2, iArr);
            } else {
                iQ = q(this.f513a, iQ, iMin2, iArr);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iP);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i34 - iQ));
        iMax = Math.max(iP, currentContentInsetLeft2);
        iMin = Math.min(iQ, i34 - currentContentInsetRight2);
        if (t(this.f525t)) {
            if (z11) {
                iMin = q(this.f525t, iMin, iMin2, iArr);
            } else {
                iMax = p(this.f525t, iMax, iMin2, iArr);
            }
        }
        if (t(this.e)) {
            if (z11) {
                iMin = q(this.e, iMin, iMin2, iArr);
            } else {
                iMax = p(this.e, iMax, iMin2, iArr);
            }
        }
        zT = t(this.f515b);
        zT2 = t(this.f517c);
        if (zT) {
            e3 e3Var8 = (e3) this.f515b.getLayoutParams();
            measuredHeight = this.f515b.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e3Var8).topMargin + ((ViewGroup.MarginLayoutParams) e3Var8).bottomMargin;
        } else {
            measuredHeight = 0;
        }
        if (zT2) {
            e3 e3Var9 = (e3) this.f517c.getLayoutParams();
            measuredHeight = this.f517c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) e3Var9).topMargin + ((ViewGroup.MarginLayoutParams) e3Var9).bottomMargin + measuredHeight;
        }
        if (zT) {
            if (zT) {
                z0Var = this.f515b;
            } else {
                z0Var = this.f517c;
            }
            if (zT2) {
                z0Var2 = this.f517c;
            } else {
                z0Var2 = this.f515b;
            }
            e3Var = (e3) z0Var.getLayoutParams();
            e3Var2 = (e3) z0Var2.getLayoutParams();
            i13 = measuredHeight;
            if (zT) {
            }
            i14 = this.H & 112;
            i15 = iMax;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e3Var).topMargin + this.C;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) e3Var).topMargin + this.C;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) e3Var).bottomMargin;
                    i25 = this.D;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) e3Var2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e3Var2).bottomMargin) - this.D) - i13;
            }
            if (z11) {
                if (z10) {
                    i19 = this.A;
                } else {
                    i19 = 0;
                }
                int i310 = i19 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zT) {
                    e3 e3Var10 = (e3) this.f515b.getLayoutParams();
                    int measuredWidth5 = iMin - this.f515b.getMeasuredWidth();
                    int measuredHeight4 = this.f515b.getMeasuredHeight() + paddingTop;
                    this.f515b.layout(measuredWidth5, paddingTop, iMin, measuredHeight4);
                    i20 = measuredWidth5 - this.B;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) e3Var10).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zT2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e3) this.f517c.getLayoutParams())).topMargin;
                    this.f517c.layout(iMin - this.f517c.getMeasuredWidth(), i311, iMin, this.f517c.getMeasuredHeight() + i311);
                    i21 = iMin - this.B;
                } else {
                    i21 = iMin;
                }
                if (z10) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i15;
            } else {
                if (z10) {
                    i16 = this.A;
                } else {
                    i16 = 0;
                }
                int i312 = i16 - iArr[0];
                iMax = Math.max(0, i312) + i15;
                iArr[0] = Math.max(0, -i312);
                if (zT) {
                    e3 e3Var11 = (e3) this.f515b.getLayoutParams();
                    int measuredWidth6 = this.f515b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f515b.getMeasuredHeight() + paddingTop;
                    this.f515b.layout(iMax, paddingTop, measuredWidth6, measuredHeight5);
                    i17 = measuredWidth6 + this.B;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) e3Var11).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zT2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e3) this.f517c.getLayoutParams())).topMargin;
                    int measuredWidth7 = this.f517c.getMeasuredWidth() + iMax;
                    this.f517c.layout(iMax, i313, measuredWidth7, this.f517c.getMeasuredHeight() + i313);
                    i18 = measuredWidth7 + this.B;
                } else {
                    i18 = iMax;
                }
                if (z10) {
                    iMax = Math.max(i17, i18);
                }
            }
        } else {
            if (zT) {
                z0Var = this.f515b;
            } else {
                z0Var = this.f517c;
            }
            if (zT2) {
                z0Var2 = this.f517c;
            } else {
                z0Var2 = this.f515b;
            }
            e3Var = (e3) z0Var.getLayoutParams();
            e3Var2 = (e3) z0Var2.getLayoutParams();
            i13 = measuredHeight;
            if (zT) {
            }
            i14 = this.H & 112;
            i15 = iMax;
            if (i14 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) e3Var).topMargin + this.C;
            } else if (i14 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i13) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) e3Var).topMargin + this.C;
                if (iMax2 < i22) {
                    iMax2 = i22;
                } else {
                    i23 = (((height - paddingBottom) - i13) - iMax2) - paddingTop2;
                    i24 = ((ViewGroup.MarginLayoutParams) e3Var).bottomMargin;
                    i25 = this.D;
                    if (i23 < i24 + i25) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) e3Var2).bottomMargin + i25) - i23));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) e3Var2).bottomMargin) - this.D) - i13;
            }
            if (z11) {
                if (z10) {
                    i19 = this.A;
                } else {
                    i19 = 0;
                }
                int i314 = i19 - iArr[1];
                iMin -= Math.max(0, i314);
                iArr[1] = Math.max(0, -i314);
                if (zT) {
                    e3 e3Var12 = (e3) this.f515b.getLayoutParams();
                    int measuredWidth8 = iMin - this.f515b.getMeasuredWidth();
                    int measuredHeight6 = this.f515b.getMeasuredHeight() + paddingTop;
                    this.f515b.layout(measuredWidth8, paddingTop, iMin, measuredHeight6);
                    i20 = measuredWidth8 - this.B;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) e3Var12).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zT2) {
                    int i315 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e3) this.f517c.getLayoutParams())).topMargin;
                    this.f517c.layout(iMin - this.f517c.getMeasuredWidth(), i315, iMin, this.f517c.getMeasuredHeight() + i315);
                    i21 = iMin - this.B;
                } else {
                    i21 = iMin;
                }
                if (z10) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i15;
            } else {
                if (z10) {
                    i16 = this.A;
                } else {
                    i16 = 0;
                }
                int i316 = i16 - iArr[0];
                iMax = Math.max(0, i316) + i15;
                iArr[0] = Math.max(0, -i316);
                if (zT) {
                    e3 e3Var13 = (e3) this.f515b.getLayoutParams();
                    int measuredWidth9 = this.f515b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f515b.getMeasuredHeight() + paddingTop;
                    this.f515b.layout(iMax, paddingTop, measuredWidth9, measuredHeight7);
                    i17 = measuredWidth9 + this.B;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) e3Var13).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zT2) {
                    int i317 = paddingTop + ((ViewGroup.MarginLayoutParams) ((e3) this.f517c.getLayoutParams())).topMargin;
                    int measuredWidth10 = this.f517c.getMeasuredWidth() + iMax;
                    this.f517c.layout(iMax, i317, measuredWidth10, this.f517c.getMeasuredHeight() + i317);
                    i18 = measuredWidth10 + this.B;
                } else {
                    i18 = iMax;
                }
                if (z10) {
                    iMax = Math.max(i17, i18);
                }
            }
        }
        arrayList = this.O;
        a(arrayList, 3);
        size = arrayList.size();
        iP2 = iMax;
        while (i26 < size) {
            iP2 = p((View) arrayList.get(i26), iP2, iMin2, iArr);
        }
        a(arrayList, 5);
        size2 = arrayList.size();
        while (i27 < size2) {
            iMin = q((View) arrayList.get(i27), iMin, iMin2, iArr);
        }
        a(arrayList, 1);
        int i318 = iArr[0];
        i28 = iArr[1];
        size3 = arrayList.size();
        i29 = i318;
        i30 = 0;
        measuredWidth = 0;
        while (i30 < size3) {
            View view2 = (View) arrayList.get(i30);
            e3 e3Var14 = (e3) view2.getLayoutParams();
            int i43 = i28;
            int i44 = ((ViewGroup.MarginLayoutParams) e3Var14).leftMargin - i29;
            int i45 = ((ViewGroup.MarginLayoutParams) e3Var14).rightMargin - i43;
            int iMax7 = Math.max(0, i44);
            int iMax8 = Math.max(0, i45);
            int iMax9 = Math.max(0, -i44);
            int iMax10 = Math.max(0, -i45);
            measuredWidth += view2.getMeasuredWidth() + iMax7 + iMax8;
            i30++;
            i29 = iMax9;
            i28 = iMax10;
        }
        i32 = ((((width - paddingLeft) - paddingRight) / 2) + paddingLeft) - (measuredWidth / 2);
        i33 = measuredWidth + i32;
        if (i32 >= iP2) {
            if (i33 > iMin) {
                iP2 = i32 - (i33 - iMin);
            } else {
                iP2 = i32;
            }
        }
        size4 = arrayList.size();
        while (i31 < size4) {
            iP2 = p((View) arrayList.get(i31), iP2, iMin2, iArr);
        }
        arrayList.clear();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        int iK;
        int iMax;
        int iCombineMeasuredStates;
        int iK2;
        int iL;
        int iCombineMeasuredStates2;
        int iMax2;
        boolean zA = p3.a(this);
        int i11 = !zA ? 1 : 0;
        int i12 = 0;
        if (t(this.f519d)) {
            s(this.f519d, i, 0, i10, this.f531z);
            iK = k(this.f519d) + this.f519d.getMeasuredWidth();
            iMax = Math.max(0, l(this.f519d) + this.f519d.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f519d.getMeasuredState());
        } else {
            iK = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (t(this.f524s)) {
            s(this.f524s, i, 0, i10, this.f531z);
            iK = k(this.f524s) + this.f524s.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f524s) + this.f524s.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f524s.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, iK);
        int iMax4 = Math.max(0, currentContentInsetStart - iK);
        int[] iArr = this.Q;
        iArr[zA ? 1 : 0] = iMax4;
        if (t(this.f513a)) {
            s(this.f513a, i, iMax3, i10, this.f531z);
            iK2 = k(this.f513a) + this.f513a.getMeasuredWidth();
            iMax = Math.max(iMax, l(this.f513a) + this.f513a.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f513a.getMeasuredState());
        } else {
            iK2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax5 = iMax3 + Math.max(currentContentInsetEnd, iK2);
        iArr[i11] = Math.max(0, currentContentInsetEnd - iK2);
        if (t(this.f525t)) {
            iMax5 += r(this.f525t, i, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, l(this.f525t) + this.f525t.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f525t.getMeasuredState());
        }
        if (t(this.e)) {
            iMax5 += r(this.e, i, iMax5, i10, 0, iArr);
            iMax = Math.max(iMax, l(this.e) + this.e.getMeasuredHeight());
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (((e3) childAt.getLayoutParams()).f6264b == 0 && t(childAt)) {
                iMax5 += r(childAt, i, iMax5, i10, 0, iArr);
                int iMax6 = Math.max(iMax, l(childAt) + childAt.getMeasuredHeight());
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax6;
            } else {
                iMax5 = iMax5;
            }
        }
        int i14 = iMax5;
        int i15 = this.C + this.D;
        int i16 = this.A + this.B;
        if (t(this.f515b)) {
            r(this.f515b, i, i14 + i16, i10, i15, iArr);
            int iK3 = k(this.f515b) + this.f515b.getMeasuredWidth();
            iL = l(this.f515b) + this.f515b.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f515b.getMeasuredState());
            iMax2 = iK3;
        } else {
            iL = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            iMax2 = 0;
        }
        if (t(this.f517c)) {
            iMax2 = Math.max(iMax2, r(this.f517c, i, i14 + i16, i10, i15 + iL, iArr));
            iL += l(this.f517c) + this.f517c.getMeasuredHeight();
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f517c.getMeasuredState());
        }
        int iMax7 = Math.max(iMax, iL);
        int paddingRight = getPaddingRight() + getPaddingLeft() + i14 + iMax2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + iMax7;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, (-16777216) & iCombineMeasuredStates2);
        int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i10, iCombineMeasuredStates2 << 16);
        if (!this.f514a0) {
            i12 = iResolveSizeAndState2;
            break;
        }
        int childCount2 = getChildCount();
        for (int i17 = 0; i17 < childCount2; i17++) {
            View childAt2 = getChildAt(i17);
            if (t(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                i12 = iResolveSizeAndState2;
                break;
            }
        }
        setMeasuredDimension(iResolveSizeAndState, i12);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof g3)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g3 g3Var = (g3) parcelable;
        super.onRestoreInstanceState(g3Var.f10011a);
        ActionMenuView actionMenuView = this.f513a;
        k.l lVar = actionMenuView != null ? actionMenuView.A : null;
        int i = g3Var.f6280c;
        if (i != 0 && this.W != null && lVar != null && (menuItemFindItem = lVar.findItem(i)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (g3Var.f6281d) {
            i iVar = this.f521e0;
            removeCallbacks(iVar);
            post(iVar);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        d();
        m2 m2Var = this.E;
        boolean z4 = i == 1;
        if (z4 == m2Var.f6358g) {
            return;
        }
        m2Var.f6358g = z4;
        if (!m2Var.h) {
            m2Var.f6353a = m2Var.e;
            m2Var.f6354b = m2Var.f6357f;
            return;
        }
        if (z4) {
            int i10 = m2Var.f6356d;
            if (i10 == Integer.MIN_VALUE) {
                i10 = m2Var.e;
            }
            m2Var.f6353a = i10;
            int i11 = m2Var.f6355c;
            if (i11 == Integer.MIN_VALUE) {
                i11 = m2Var.f6357f;
            }
            m2Var.f6354b = i11;
            return;
        }
        int i12 = m2Var.f6355c;
        if (i12 == Integer.MIN_VALUE) {
            i12 = m2Var.e;
        }
        m2Var.f6353a = i12;
        int i13 = m2Var.f6356d;
        if (i13 == Integer.MIN_VALUE) {
            i13 = m2Var.f6357f;
        }
        m2Var.f6354b = i13;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        j jVar;
        k.n nVar;
        g3 g3Var = new g3(super.onSaveInstanceState());
        d3 d3Var = this.W;
        if (d3Var != null && (nVar = d3Var.f6258b) != null) {
            g3Var.f6280c = nVar.f5878a;
        }
        ActionMenuView actionMenuView = this.f513a;
        g3Var.f6281d = (actionMenuView == null || (jVar = actionMenuView.E) == null || !jVar.j()) ? false : true;
        return g3Var;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.M = false;
        }
        if (!this.M) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.M = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.M = false;
        return true;
    }

    public final int p(View view, int i, int i10, int[] iArr) {
        e3 e3Var = (e3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) e3Var).leftMargin - iArr[0];
        int iMax = Math.max(0, i11) + i;
        iArr[0] = Math.max(0, -i11);
        int iJ = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iJ, iMax + measuredWidth, view.getMeasuredHeight() + iJ);
        return measuredWidth + ((ViewGroup.MarginLayoutParams) e3Var).rightMargin + iMax;
    }

    public final int q(View view, int i, int i10, int[] iArr) {
        e3 e3Var = (e3) view.getLayoutParams();
        int i11 = ((ViewGroup.MarginLayoutParams) e3Var).rightMargin - iArr[1];
        int iMax = i - Math.max(0, i11);
        iArr[1] = Math.max(0, -i11);
        int iJ = j(view, i10);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iJ, iMax, view.getMeasuredHeight() + iJ);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) e3Var).leftMargin);
    }

    public final int r(View view, int i, int i10, int i11, int i12, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i13 = marginLayoutParams.leftMargin - iArr[0];
        int i14 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i14) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i13);
        iArr[1] = Math.max(0, -i14);
        view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + iMax + i10, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i12, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void s(View view, int i, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i10, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public void setBackInvokedCallbackEnabled(boolean z4) {
        if (this.f520d0 != z4) {
            this.f520d0 = z4;
            u();
        }
    }

    public void setCollapseContentDescription(int i) {
        setCollapseContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(com.bumptech.glide.d.r(getContext(), i));
    }

    public void setCollapsible(boolean z4) {
        this.f514a0 = z4;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.G) {
            this.G = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = Integer.MIN_VALUE;
        }
        if (i != this.F) {
            this.F = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i) {
        setLogo(com.bumptech.glide.d.r(getContext(), i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        setNavigationContentDescription(i != 0 ? getContext().getText(i) : null);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(com.bumptech.glide.d.r(getContext(), i));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        g();
        this.f519d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        e();
        this.f513a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i) {
        if (this.f527v != i) {
            this.f527v = i;
            if (i == 0) {
                this.f526u = getContext();
            } else {
                this.f526u = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleMarginBottom(int i) {
        this.D = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.B = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.A = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.C = i;
        requestLayout();
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public final boolean t(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    public final void u() {
        boolean z4;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = c3.a(this);
            d3 d3Var = this.W;
            int i = 0;
            if (d3Var == null || d3Var.f6258b == null || onBackInvokedDispatcherA == null) {
                z4 = false;
            } else {
                WeakHashMap weakHashMap = v0.f7946a;
                if (g0.b(this) && this.f520d0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
            }
            if (z4 && this.f518c0 == null) {
                if (this.f516b0 == null) {
                    this.f516b0 = c3.b(new b3(this, i));
                }
                c3.c(onBackInvokedDispatcherA, this.f516b0);
                this.f518c0 = onBackInvokedDispatcherA;
                return;
            }
            if (z4 || (onBackInvokedDispatcher = this.f518c0) == null) {
                return;
            }
            c3.d(onBackInvokedDispatcher, this.f516b0);
            this.f518c0 = null;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.toolbarStyle);
        this.H = 8388627;
        this.O = new ArrayList();
        this.P = new ArrayList();
        this.Q = new int[2];
        this.R = new o0(new b3(this, 1));
        this.S = new ArrayList();
        this.T = new ib.c(this, 24);
        this.f521e0 = new i(this, 26);
        Context context2 = getContext();
        int[] iArr = f.a.f3572x;
        a2.l lVarG = a2.l.G(context2, attributeSet, iArr, R.attr.toolbarStyle);
        v0.k(this, context, iArr, attributeSet, (TypedArray) lVarG.f44c, R.attr.toolbarStyle);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        this.f528w = typedArray.getResourceId(28, 0);
        this.f529x = typedArray.getResourceId(19, 0);
        this.H = typedArray.getInteger(0, 8388627);
        this.f530y = typedArray.getInteger(2, 48);
        int dimensionPixelOffset = typedArray.getDimensionPixelOffset(22, 0);
        dimensionPixelOffset = typedArray.hasValue(27) ? typedArray.getDimensionPixelOffset(27, dimensionPixelOffset) : dimensionPixelOffset;
        this.D = dimensionPixelOffset;
        this.C = dimensionPixelOffset;
        this.B = dimensionPixelOffset;
        this.A = dimensionPixelOffset;
        int dimensionPixelOffset2 = typedArray.getDimensionPixelOffset(25, -1);
        if (dimensionPixelOffset2 >= 0) {
            this.A = dimensionPixelOffset2;
        }
        int dimensionPixelOffset3 = typedArray.getDimensionPixelOffset(24, -1);
        if (dimensionPixelOffset3 >= 0) {
            this.B = dimensionPixelOffset3;
        }
        int dimensionPixelOffset4 = typedArray.getDimensionPixelOffset(26, -1);
        if (dimensionPixelOffset4 >= 0) {
            this.C = dimensionPixelOffset4;
        }
        int dimensionPixelOffset5 = typedArray.getDimensionPixelOffset(23, -1);
        if (dimensionPixelOffset5 >= 0) {
            this.D = dimensionPixelOffset5;
        }
        this.f531z = typedArray.getDimensionPixelSize(13, -1);
        int dimensionPixelOffset6 = typedArray.getDimensionPixelOffset(9, Integer.MIN_VALUE);
        int dimensionPixelOffset7 = typedArray.getDimensionPixelOffset(5, Integer.MIN_VALUE);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(7, 0);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(8, 0);
        d();
        m2 m2Var = this.E;
        m2Var.h = false;
        if (dimensionPixelSize != Integer.MIN_VALUE) {
            m2Var.e = dimensionPixelSize;
            m2Var.f6353a = dimensionPixelSize;
        }
        if (dimensionPixelSize2 != Integer.MIN_VALUE) {
            m2Var.f6357f = dimensionPixelSize2;
            m2Var.f6354b = dimensionPixelSize2;
        }
        if (dimensionPixelOffset6 != Integer.MIN_VALUE || dimensionPixelOffset7 != Integer.MIN_VALUE) {
            m2Var.a(dimensionPixelOffset6, dimensionPixelOffset7);
        }
        this.F = typedArray.getDimensionPixelOffset(10, Integer.MIN_VALUE);
        this.G = typedArray.getDimensionPixelOffset(6, Integer.MIN_VALUE);
        this.f522f = lVarG.u(4);
        this.f523r = typedArray.getText(3);
        CharSequence text = typedArray.getText(21);
        if (!TextUtils.isEmpty(text)) {
            setTitle(text);
        }
        CharSequence text2 = typedArray.getText(18);
        if (!TextUtils.isEmpty(text2)) {
            setSubtitle(text2);
        }
        this.f526u = getContext();
        setPopupTheme(typedArray.getResourceId(17, 0));
        Drawable drawableU = lVarG.u(16);
        if (drawableU != null) {
            setNavigationIcon(drawableU);
        }
        CharSequence text3 = typedArray.getText(15);
        if (!TextUtils.isEmpty(text3)) {
            setNavigationContentDescription(text3);
        }
        Drawable drawableU2 = lVarG.u(11);
        if (drawableU2 != null) {
            setLogo(drawableU2);
        }
        CharSequence text4 = typedArray.getText(12);
        if (!TextUtils.isEmpty(text4)) {
            setLogoDescription(text4);
        }
        if (typedArray.hasValue(29)) {
            setTitleTextColor(lVarG.t(29));
        }
        if (typedArray.hasValue(20)) {
            setSubtitleTextColor(lVarG.t(20));
        }
        if (typedArray.hasValue(14)) {
            m(typedArray.getResourceId(14, 0));
        }
        lVarG.I();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        e3 e3Var = new e3(context, attributeSet);
        e3Var.f6263a = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f3553b);
        e3Var.f6263a = typedArrayObtainStyledAttributes.getInt(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        e3Var.f6264b = 0;
        return e3Var;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            c();
        }
        v vVar = this.f524s;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            c();
            this.f524s.setImageDrawable(drawable);
        } else {
            v vVar = this.f524s;
            if (vVar != null) {
                vVar.setImageDrawable(this.f522f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            if (this.e == null) {
                this.e = new w(getContext(), null, 0);
            }
            if (!o(this.e)) {
                b(this.e, true);
            }
        } else {
            w wVar = this.e;
            if (wVar != null && o(wVar)) {
                removeView(this.e);
                this.P.remove(this.e);
            }
        }
        w wVar2 = this.e;
        if (wVar2 != null) {
            wVar2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.e == null) {
            this.e = new w(getContext(), null, 0);
        }
        w wVar = this.e;
        if (wVar != null) {
            wVar.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        v vVar = this.f519d;
        if (vVar != null) {
            vVar.setContentDescription(charSequence);
            p3.a.s(this.f519d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            if (!o(this.f519d)) {
                b(this.f519d, true);
            }
        } else {
            v vVar = this.f519d;
            if (vVar != null && o(vVar)) {
                removeView(this.f519d);
                this.P.remove(this.f519d);
            }
        }
        v vVar2 = this.f519d;
        if (vVar2 != null) {
            vVar2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var = this.f517c;
            if (z0Var != null && o(z0Var)) {
                removeView(this.f517c);
                this.P.remove(this.f517c);
            }
        } else {
            if (this.f517c == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.f517c = z0Var2;
                z0Var2.setSingleLine();
                this.f517c.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f529x;
                if (i != 0) {
                    this.f517c.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.L;
                if (colorStateList != null) {
                    this.f517c.setTextColor(colorStateList);
                }
            }
            if (!o(this.f517c)) {
                b(this.f517c, true);
            }
        }
        z0 z0Var3 = this.f517c;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.J = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.L = colorStateList;
        z0 z0Var = this.f517c;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            z0 z0Var = this.f515b;
            if (z0Var != null && o(z0Var)) {
                removeView(this.f515b);
                this.P.remove(this.f515b);
            }
        } else {
            if (this.f515b == null) {
                Context context = getContext();
                z0 z0Var2 = new z0(context, null);
                this.f515b = z0Var2;
                z0Var2.setSingleLine();
                this.f515b.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.f528w;
                if (i != 0) {
                    this.f515b.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.K;
                if (colorStateList != null) {
                    this.f515b.setTextColor(colorStateList);
                }
            }
            if (!o(this.f515b)) {
                b(this.f515b, true);
            }
        }
        z0 z0Var3 = this.f515b;
        if (z0Var3 != null) {
            z0Var3.setText(charSequence);
        }
        this.I = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.K = colorStateList;
        z0 z0Var = this.f515b;
        if (z0Var != null) {
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setOnMenuItemClickListener(f3 f3Var) {
    }
}

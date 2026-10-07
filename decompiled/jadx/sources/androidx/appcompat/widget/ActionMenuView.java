package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import b9.e;
import k.a0;
import k.k;
import k.l;
import k.n;
import l.f;
import l.i;
import l.j;
import l.m;
import l.p3;
import l.v1;
import l.w1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends w1 implements k, a0 {
    public l A;
    public Context B;
    public int C;
    public boolean D;
    public j E;
    public a5.b F;
    public boolean G;
    public int H;
    public final int I;
    public final int J;
    public m K;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setBaselineAligned(false);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.I = (int) (56.0f * f10);
        this.J = (int) (f10 * 4.0f);
        this.B = context;
        this.C = 0;
    }

    public static l.l j() {
        l.l lVar = new l.l(-2, -2);
        lVar.f6333a = false;
        ((LinearLayout.LayoutParams) lVar).gravity = 16;
        return lVar;
    }

    public static l.l k(ViewGroup.LayoutParams layoutParams) {
        l.l lVar;
        if (layoutParams == null) {
            return j();
        }
        if (layoutParams instanceof l.l) {
            l.l lVar2 = (l.l) layoutParams;
            lVar = new l.l(lVar2);
            lVar.f6333a = lVar2.f6333a;
        } else {
            lVar = new l.l(layoutParams);
        }
        if (((LinearLayout.LayoutParams) lVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) lVar).gravity = 16;
        }
        return lVar;
    }

    @Override // k.k
    public final boolean a(n nVar) {
        return this.A.q(nVar, null, 0);
    }

    @Override // k.a0
    public final void b(l lVar) {
        this.A = lVar;
    }

    @Override // l.w1, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof l.l;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // l.w1
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ v1 generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.w1
    /* JADX INFO: renamed from: g */
    public final v1 generateLayoutParams(AttributeSet attributeSet) {
        return new l.l(getContext(), attributeSet);
    }

    @Override // l.w1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // l.w1, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public Menu getMenu() {
        if (this.A == null) {
            Context context = getContext();
            l lVar = new l(context);
            this.A = lVar;
            lVar.e = new a4.b(this, 20);
            j jVar = new j(context);
            this.E = jVar;
            jVar.f6315w = true;
            jVar.f6316x = true;
            jVar.e = new e(20);
            this.A.b(jVar, this.B);
            j jVar2 = this.E;
            jVar2.f6311s = this;
            this.A = jVar2.f6307c;
        }
        return this.A;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        j jVar = this.E;
        i iVar = jVar.f6312t;
        if (iVar != null) {
            return iVar.getDrawable();
        }
        if (jVar.f6314v) {
            return jVar.f6313u;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.C;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // l.w1
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ v1 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    public final boolean l(int i) {
        boolean zA = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof l.k)) {
            zA = ((l.k) childAt).a();
        }
        return (i <= 0 || !(childAt2 instanceof l.k)) ? zA : ((l.k) childAt2).b() | zA;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j jVar = this.E;
        if (jVar != null) {
            jVar.i();
            if (this.E.j()) {
                this.E.h();
                this.E.l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.E;
        if (jVar != null) {
            jVar.h();
            f fVar = jVar.E;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.i.dismiss();
        }
    }

    @Override // l.w1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        int width;
        int paddingLeft;
        if (!this.G) {
            super.onLayout(z4, i, i10, i11, i12);
            return;
        }
        int childCount = getChildCount();
        int i13 = (i12 - i10) / 2;
        int dividerWidth = getDividerWidth();
        int i14 = i11 - i;
        int paddingRight = (i14 - getPaddingRight()) - getPaddingLeft();
        boolean zA = p3.a(this);
        int i15 = 0;
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                l.l lVar = (l.l) childAt.getLayoutParams();
                if (lVar.f6333a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (l(i17)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zA) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) lVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) lVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i18 = i13 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i18, width, measuredHeight + i18);
                    paddingRight -= measuredWidth;
                    i15 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) lVar).leftMargin) + ((LinearLayout.LayoutParams) lVar).rightMargin;
                    l(i17);
                    i16++;
                }
            }
        }
        if (childCount == 1 && i15 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i19 = (i14 / 2) - (measuredWidth2 / 2);
            int i20 = i13 - (measuredHeight2 / 2);
            childAt2.layout(i19, i20, measuredWidth2 + i19, measuredHeight2 + i20);
            return;
        }
        int i21 = i16 - (i15 ^ 1);
        int iMax = Math.max(0, i21 > 0 ? paddingRight / i21 : 0);
        if (zA) {
            int width2 = getWidth() - getPaddingRight();
            for (int i22 = 0; i22 < childCount; i22++) {
                View childAt3 = getChildAt(i22);
                l.l lVar2 = (l.l) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !lVar2.f6333a) {
                    int i23 = width2 - ((LinearLayout.LayoutParams) lVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i24 = i13 - (measuredHeight3 / 2);
                    childAt3.layout(i23 - measuredWidth3, i24, i23, measuredHeight3 + i24);
                    width2 = i23 - ((measuredWidth3 + ((LinearLayout.LayoutParams) lVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i25 = 0; i25 < childCount; i25++) {
            View childAt4 = getChildAt(i25);
            l.l lVar3 = (l.l) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !lVar3.f6333a) {
                int i26 = paddingLeft2 + ((LinearLayout.LayoutParams) lVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i27 = i13 - (measuredHeight4 / 2);
                childAt4.layout(i26, i27, i26 + measuredWidth4, measuredHeight4 + i27);
                paddingLeft2 = measuredWidth4 + ((LinearLayout.LayoutParams) lVar3).rightMargin + iMax + i26;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v41 */
    @Override // l.w1, android.view.View
    public final void onMeasure(int i, int i10) {
        int i11;
        int i12;
        ?? r11;
        int i13;
        int i14;
        l lVar;
        boolean z4 = this.G;
        boolean z10 = View.MeasureSpec.getMode(i) == 1073741824;
        this.G = z10;
        if (z4 != z10) {
            this.H = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.G && (lVar = this.A) != null && size != this.H) {
            this.H = size;
            lVar.p(true);
        }
        int childCount = getChildCount();
        if (!this.G || childCount <= 0) {
            for (int i15 = 0; i15 < childCount; i15++) {
                l.l lVar2 = (l.l) getChildAt(i15).getLayoutParams();
                ((LinearLayout.LayoutParams) lVar2).rightMargin = 0;
                ((LinearLayout.LayoutParams) lVar2).leftMargin = 0;
            }
            super.onMeasure(i, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i10);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, paddingBottom, -2);
        int i16 = size2 - paddingRight;
        int i17 = this.I;
        int i18 = i16 / i17;
        int i19 = i16 % i17;
        if (i18 == 0) {
            setMeasuredDimension(i16, 0);
            return;
        }
        int i20 = (i19 / i18) + i17;
        int childCount2 = getChildCount();
        int iMax = 0;
        int i21 = 0;
        int iMax2 = 0;
        int i22 = 0;
        boolean z11 = false;
        int i23 = 0;
        long j4 = 0;
        while (true) {
            i11 = this.J;
            if (i22 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i22);
            int i24 = size3;
            int i25 = paddingBottom;
            if (childAt.getVisibility() == 8) {
                i13 = i20;
            } else {
                boolean z12 = childAt instanceof ActionMenuItemView;
                i21++;
                if (z12) {
                    childAt.setPadding(i11, 0, i11, 0);
                }
                l.l lVar3 = (l.l) childAt.getLayoutParams();
                lVar3.f6337f = false;
                lVar3.f6335c = 0;
                lVar3.f6334b = 0;
                lVar3.f6336d = false;
                ((LinearLayout.LayoutParams) lVar3).leftMargin = 0;
                ((LinearLayout.LayoutParams) lVar3).rightMargin = 0;
                lVar3.e = z12 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i26 = lVar3.f6333a ? 1 : i18;
                l.l lVar4 = (l.l) childAt.getLayoutParams();
                int i27 = i18;
                i13 = i20;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - i25, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z12 ? (ActionMenuItemView) childAt : null;
                boolean z13 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                boolean z14 = z13;
                if (i26 <= 0 || (z13 && i26 < 2)) {
                    i14 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i13 * i26, Integer.MIN_VALUE), iMakeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i14 = measuredWidth / i13;
                    if (measuredWidth % i13 != 0) {
                        i14++;
                    }
                    if (z14 && i14 < 2) {
                        i14 = 2;
                    }
                }
                lVar4.f6336d = !lVar4.f6333a && z14;
                lVar4.f6334b = i14;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i14 * i13, 1073741824), iMakeMeasureSpec);
                iMax2 = Math.max(iMax2, i14);
                if (lVar3.f6336d) {
                    i23++;
                }
                if (lVar3.f6333a) {
                    z11 = true;
                }
                i18 = i27 - i14;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (i14 == 1) {
                    j4 |= (long) (1 << i22);
                }
            }
            i22++;
            size3 = i24;
            paddingBottom = i25;
            i20 = i13;
        }
        int i28 = size3;
        int i29 = i18;
        int i30 = i20;
        boolean z15 = z11 && i21 == 2;
        int i31 = i29;
        boolean z16 = false;
        while (true) {
            if (i23 <= 0 || i31 <= 0) {
                i12 = iMax;
                break;
            }
            int i32 = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
            long j10 = 0;
            int i33 = 0;
            int i34 = 0;
            while (i34 < childCount2) {
                int i35 = iMax;
                l.l lVar5 = (l.l) getChildAt(i34).getLayoutParams();
                boolean z17 = z15;
                if (lVar5.f6336d) {
                    int i36 = lVar5.f6334b;
                    if (i36 < i32) {
                        j10 = 1 << i34;
                        i32 = i36;
                        i33 = 1;
                    } else if (i36 == i32) {
                        j10 |= 1 << i34;
                        i33++;
                    }
                }
                i34++;
                z15 = z17;
                iMax = i35;
            }
            i12 = iMax;
            boolean z18 = z15;
            j4 |= j10;
            if (i33 > i31) {
                break;
            }
            int i37 = i32 + 1;
            int i38 = 0;
            while (i38 < childCount2) {
                View childAt2 = getChildAt(i38);
                l.l lVar6 = (l.l) childAt2.getLayoutParams();
                boolean z19 = z11;
                long j11 = 1 << i38;
                if ((j10 & j11) != 0) {
                    if (z18 && lVar6.e) {
                        r11 = 1;
                        r11 = 1;
                        if (i31 == 1) {
                            childAt2.setPadding(i11 + i30, 0, i11, 0);
                        }
                    } else {
                        r11 = 1;
                    }
                    lVar6.f6334b += r11;
                    lVar6.f6337f = r11;
                    i31--;
                } else if (lVar6.f6334b == i37) {
                    j4 |= j11;
                }
                i38++;
                z11 = z19;
            }
            z15 = z18;
            iMax = i12;
            z16 = true;
        }
        boolean z20 = !z11 && i21 == 1;
        if (i31 > 0 && j4 != 0 && (i31 < i21 - 1 || z20 || iMax2 > 1)) {
            float fBitCount = Long.bitCount(j4);
            if (!z20) {
                if ((j4 & 1) != 0 && !((l.l) getChildAt(0).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
                int i39 = childCount2 - 1;
                if ((j4 & ((long) (1 << i39))) != 0 && !((l.l) getChildAt(i39).getLayoutParams()).e) {
                    fBitCount -= 0.5f;
                }
            }
            int i40 = fBitCount > 0.0f ? (int) ((i31 * i30) / fBitCount) : 0;
            boolean z21 = z16;
            for (int i41 = 0; i41 < childCount2; i41++) {
                if ((j4 & ((long) (1 << i41))) != 0) {
                    View childAt3 = getChildAt(i41);
                    l.l lVar7 = (l.l) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        lVar7.f6335c = i40;
                        lVar7.f6337f = true;
                        if (i41 == 0 && !lVar7.e) {
                            ((LinearLayout.LayoutParams) lVar7).leftMargin = (-i40) / 2;
                        }
                        z21 = true;
                    } else if (lVar7.f6333a) {
                        lVar7.f6335c = i40;
                        lVar7.f6337f = true;
                        ((LinearLayout.LayoutParams) lVar7).rightMargin = (-i40) / 2;
                        z21 = true;
                    } else {
                        if (i41 != 0) {
                            ((LinearLayout.LayoutParams) lVar7).leftMargin = i40 / 2;
                        }
                        if (i41 != childCount2 - 1) {
                            ((LinearLayout.LayoutParams) lVar7).rightMargin = i40 / 2;
                        }
                    }
                }
            }
            z16 = z21;
        }
        if (z16) {
            for (int i42 = 0; i42 < childCount2; i42++) {
                View childAt4 = getChildAt(i42);
                l.l lVar8 = (l.l) childAt4.getLayoutParams();
                if (lVar8.f6337f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((lVar8.f6334b * i30) + lVar8.f6335c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i16, mode != 1073741824 ? i12 : i28);
    }

    public void setExpandedActionViewsExclusive(boolean z4) {
        this.E.B = z4;
    }

    public void setOnMenuItemClickListener(m mVar) {
        this.K = mVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        j jVar = this.E;
        i iVar = jVar.f6312t;
        if (iVar != null) {
            iVar.setImageDrawable(drawable);
        } else {
            jVar.f6314v = true;
            jVar.f6313u = drawable;
        }
    }

    public void setOverflowReserved(boolean z4) {
        this.D = z4;
    }

    public void setPopupTheme(int i) {
        if (this.C != i) {
            this.C = i;
            if (i == 0) {
                this.B = getContext();
            } else {
                this.B = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(j jVar) {
        this.E = jVar;
        jVar.f6311s = this;
        this.A = jVar.f6307c;
    }

    @Override // l.w1, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new l.l(getContext(), attributeSet);
    }
}

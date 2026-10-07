package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.material.datepicker.l;
import java.util.WeakHashMap;
import k.a0;
import l.f;
import l.j;
import l.p3;
import q0.d0;
import q0.e1;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {
    public TextView A;
    public final int B;
    public final int C;
    public boolean D;
    public final int E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l.a f454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ActionMenuView f456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f457d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e1 f458f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f459r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CharSequence f461t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f462u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public View f463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public View f464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public View f465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public LinearLayout f466y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public TextView f467z;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        this.f454a = new l.a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f455b = context;
        } else {
            this.f455b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f.a.f3555d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : com.bumptech.glide.d.r(context, resourceId);
        WeakHashMap weakHashMap = v0.f7946a;
        d0.q(this, drawable);
        this.B = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.e = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.E = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static int f(View view, int i, int i10) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i10);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static int g(View view, int i, int i10, int i11, boolean z4) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i12 = ((i11 - measuredHeight) / 2) + i10;
        if (z4) {
            view.layout(i - measuredWidth, i12, i, measuredHeight + i12);
        } else {
            view.layout(i, i12, i + measuredWidth, measuredHeight + i12);
        }
        return z4 ? -measuredWidth : measuredWidth;
    }

    public final void c(j.a aVar) {
        View view = this.f463v;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.E, (ViewGroup) this, false);
            this.f463v = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f463v);
        }
        View viewFindViewById = this.f463v.findViewById(R.id.action_mode_close_button);
        this.f464w = viewFindViewById;
        viewFindViewById.setOnClickListener(new l(aVar, 3));
        k.l lVarC = aVar.c();
        j jVar = this.f457d;
        if (jVar != null) {
            jVar.h();
            f fVar = jVar.E;
            if (fVar != null && fVar.b()) {
                fVar.i.dismiss();
            }
        }
        j jVar2 = new j(getContext());
        this.f457d = jVar2;
        jVar2.f6315w = true;
        jVar2.f6316x = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        lVarC.b(this.f457d, this.f455b);
        j jVar3 = this.f457d;
        a0 a0Var = jVar3.f6311s;
        if (a0Var == null) {
            a0 a0Var2 = (a0) jVar3.f6308d.inflate(jVar3.f6309f, (ViewGroup) this, false);
            jVar3.f6311s = a0Var2;
            a0Var2.b(jVar3.f6307c);
            jVar3.i();
        }
        a0 a0Var3 = jVar3.f6311s;
        if (a0Var != a0Var3) {
            ((ActionMenuView) a0Var3).setPresenter(jVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) a0Var3;
        this.f456c = actionMenuView;
        WeakHashMap weakHashMap = v0.f7946a;
        d0.q(actionMenuView, null);
        addView(this.f456c, layoutParams);
    }

    public final void d() {
        if (this.f466y == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f466y = linearLayout;
            this.f467z = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.A = (TextView) this.f466y.findViewById(R.id.action_bar_subtitle);
            int i = this.B;
            if (i != 0) {
                this.f467z.setTextAppearance(getContext(), i);
            }
            int i10 = this.C;
            if (i10 != 0) {
                this.A.setTextAppearance(getContext(), i10);
            }
        }
        this.f467z.setText(this.f461t);
        this.A.setText(this.f462u);
        boolean zIsEmpty = TextUtils.isEmpty(this.f461t);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f462u);
        this.A.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f466y.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f466y.getParent() == null) {
            addView(this.f466y);
        }
    }

    public final void e() {
        removeAllViews();
        this.f465x = null;
        this.f456c = null;
        this.f457d = null;
        View view = this.f464w;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f458f != null ? this.f454a.f6227b : getVisibility();
    }

    public int getContentHeight() {
        return this.e;
    }

    public CharSequence getSubtitle() {
        return this.f462u;
    }

    public CharSequence getTitle() {
        return this.f461t;
    }

    @Override // android.view.View
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            e1 e1Var = this.f458f;
            if (e1Var != null) {
                e1Var.b();
            }
            super.setVisibility(i);
        }
    }

    public final e1 i(int i, long j4) {
        e1 e1Var = this.f458f;
        if (e1Var != null) {
            e1Var.b();
        }
        l.a aVar = this.f454a;
        if (i != 0) {
            e1 e1VarA = v0.a(this);
            e1VarA.a(0.0f);
            e1VarA.c(j4);
            ((ActionBarContextView) aVar.f6228c).f458f = e1VarA;
            aVar.f6227b = i;
            e1VarA.d(aVar);
            return e1VarA;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        e1 e1VarA2 = v0.a(this);
        e1VarA2.a(1.0f);
        e1VarA2.c(j4);
        ((ActionBarContextView) aVar.f6228c).f458f = e1VarA2;
        aVar.f6227b = i;
        e1VarA2.d(aVar);
        return e1VarA2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i;
        super.onConfigurationChanged(configuration);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(null, f.a.f3552a, R.attr.actionBarStyle, 0);
        setContentHeight(typedArrayObtainStyledAttributes.getLayoutDimension(13, 0));
        typedArrayObtainStyledAttributes.recycle();
        j jVar = this.f457d;
        if (jVar != null) {
            Configuration configuration2 = jVar.f6306b.getResources().getConfiguration();
            int i10 = configuration2.screenWidthDp;
            int i11 = configuration2.screenHeightDp;
            if (configuration2.smallestScreenWidthDp > 600 || i10 > 600 || ((i10 > 960 && i11 > 720) || (i10 > 720 && i11 > 960))) {
                i = 5;
            } else if (i10 >= 500 || ((i10 > 640 && i11 > 480) || (i10 > 480 && i11 > 640))) {
                i = 4;
            } else {
                i = i10 >= 360 ? 3 : 2;
            }
            jVar.A = i;
            k.l lVar = jVar.f6307c;
            if (lVar != null) {
                lVar.p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j jVar = this.f457d;
        if (jVar != null) {
            jVar.h();
            f fVar = this.f457d.E;
            if (fVar == null || !fVar.b()) {
                return;
            }
            fVar.i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f460s = false;
        }
        if (!this.f460s) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f460s = true;
            }
        }
        if (actionMasked != 10 && actionMasked != 3) {
            return true;
        }
        this.f460s = false;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        boolean zA = p3.a(this);
        int paddingRight = zA ? (i11 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i12 - i10) - getPaddingTop()) - getPaddingBottom();
        View view = this.f463v;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f463v.getLayoutParams();
            int i13 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i14 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i15 = zA ? paddingRight - i13 : paddingRight + i13;
            int iG = g(this.f463v, i15, paddingTop, paddingTop2, zA) + i15;
            paddingRight = zA ? iG - i14 : iG + i14;
        }
        LinearLayout linearLayout = this.f466y;
        if (linearLayout != null && this.f465x == null && linearLayout.getVisibility() != 8) {
            paddingRight += g(this.f466y, paddingRight, paddingTop, paddingTop2, zA);
        }
        View view2 = this.f465x;
        if (view2 != null) {
            g(view2, paddingRight, paddingTop, paddingTop2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i11 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f456c;
        if (actionMenuView != null) {
            g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zA);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i10) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i10) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i10);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f463v;
        if (view != null) {
            int iF = f(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f463v.getLayoutParams();
            paddingLeft = iF - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f456c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = f(this.f456c, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.f466y;
        if (linearLayout != null && this.f465x == null) {
            if (this.D) {
                this.f466y.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f466y.getMeasuredWidth();
                boolean z4 = measuredWidth <= paddingLeft;
                if (z4) {
                    paddingLeft -= measuredWidth;
                }
                this.f466y.setVisibility(z4 ? 0 : 8);
            } else {
                paddingLeft = f(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.f465x;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i11 = layoutParams.width;
            int i12 = i11 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i11 >= 0) {
                paddingLeft = Math.min(i11, paddingLeft);
            }
            int i13 = layoutParams.height;
            int i14 = i13 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i13 >= 0) {
                iMin = Math.min(i13, iMin);
            }
            this.f465x.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i12), View.MeasureSpec.makeMeasureSpec(iMin, i14));
        }
        if (this.e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            int measuredHeight = getChildAt(i16).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i15) {
                i15 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i15);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f459r = false;
        }
        if (!this.f459r) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f459r = true;
            }
        }
        if (actionMasked != 1 && actionMasked != 3) {
            return true;
        }
        this.f459r = false;
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f465x;
        if (view2 != null) {
            removeView(view2);
        }
        this.f465x = view;
        if (view != null && (linearLayout = this.f466y) != null) {
            removeView(linearLayout);
            this.f466y = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f462u = charSequence;
        d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f461t = charSequence;
        d();
        v0.m(this, charSequence);
    }

    public void setTitleOptional(boolean z4) {
        if (z4 != this.D) {
            requestLayout();
        }
        this.D = z4;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}

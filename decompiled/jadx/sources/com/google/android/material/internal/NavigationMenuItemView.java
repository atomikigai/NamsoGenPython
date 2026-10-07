package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.material.datepicker.j;
import g0.i;
import i0.b;
import java.util.WeakHashMap;
import k.n;
import k.z;
import l.v1;
import p3.a;
import q0.d0;
import q0.v0;
import u0.o;
import u8.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class NavigationMenuItemView extends f implements z {
    public static final int[] R = {R.attr.state_checked};
    public int G;
    public boolean H;
    public boolean I;
    public final boolean J;
    public final CheckedTextView K;
    public FrameLayout L;
    public n M;
    public ColorStateList N;
    public boolean O;
    public Drawable P;
    public final j Q;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.J = true;
        j jVar = new j(this, 4);
        this.Q = jVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(app.namso_gen.spacehowen.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(app.namso_gen.spacehowen.R.id.design_menu_item_text);
        this.K = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        v0.l(checkedTextView, jVar);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.L == null) {
                this.L = (FrameLayout) ((ViewStub) findViewById(app.namso_gen.spacehowen.R.id.design_menu_item_action_area_stub)).inflate();
            }
            this.L.removeAllViews();
            this.L.addView(view);
        }
    }

    @Override // k.z
    public final void c(n nVar) {
        StateListDrawable stateListDrawable;
        this.M = nVar;
        int i = nVar.f5878a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(nVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(app.namso_gen.spacehowen.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(R, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = v0.f7946a;
            d0.q(this, stateListDrawable);
        }
        setCheckable(nVar.isCheckable());
        setChecked(nVar.isChecked());
        setEnabled(nVar.isEnabled());
        setTitle(nVar.e);
        setIcon(nVar.getIcon());
        setActionView(nVar.getActionView());
        setContentDescription(nVar.B);
        a.s(this, nVar.C);
        n nVar2 = this.M;
        CharSequence charSequence = nVar2.e;
        CheckedTextView checkedTextView = this.K;
        if (charSequence == null && nVar2.getIcon() == null && this.M.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.L;
            if (frameLayout != null) {
                v1 v1Var = (v1) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) v1Var).width = -1;
                this.L.setLayoutParams(v1Var);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.L;
        if (frameLayout2 != null) {
            v1 v1Var2 = (v1) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) v1Var2).width = -2;
            this.L.setLayoutParams(v1Var2);
        }
    }

    @Override // k.z
    public n getItemData() {
        return this.M;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        n nVar = this.M;
        if (nVar != null && nVar.isCheckable() && this.M.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, R);
        }
        return iArrOnCreateDrawableState;
    }

    public void setCheckable(boolean z4) {
        refreshDrawableState();
        if (this.I != z4) {
            this.I = z4;
            this.Q.h(this.K, 2048);
        }
    }

    public void setChecked(boolean z4) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.K;
        checkedTextView.setChecked(z4);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z4 && this.J) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.O) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                b.h(drawable, this.N);
            }
            int i = this.G;
            drawable.setBounds(0, 0, i, i);
        } else if (this.H) {
            if (this.P == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = g0.n.f4149a;
                Drawable drawableA = i.a(resources, app.namso_gen.spacehowen.R.drawable.navigation_empty_icon, theme);
                this.P = drawableA;
                if (drawableA != null) {
                    int i10 = this.G;
                    drawableA.setBounds(0, 0, i10, i10);
                }
            }
            drawable = this.P;
        }
        o.e(this.K, drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.K.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.G = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.N = colorStateList;
        this.O = colorStateList != null;
        n nVar = this.M;
        if (nVar != null) {
            setIcon(nVar.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.K.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z4) {
        this.H = z4;
    }

    public void setTextAppearance(int i) {
        this.K.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.K.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.K.setText(charSequence);
    }
}

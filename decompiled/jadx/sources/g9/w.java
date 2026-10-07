package g9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import app.namso_gen.spacehowen.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import l.c2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends l.n {
    public final c2 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f4406f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f4407r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f4408s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final float f4409t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ColorStateList f4410u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f4411v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ColorStateList f4412w;

    public w(Context context, AttributeSet attributeSet) {
        super(i9.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f4407r = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayG = u8.n.g(context2, attributeSet, d8.a.f3025q, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayG.hasValue(0) && typedArrayG.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f4408s = typedArrayG.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f4409t = typedArrayG.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (typedArrayG.hasValue(2)) {
            this.f4410u = ColorStateList.valueOf(typedArrayG.getColor(2, 0));
        }
        this.f4411v = typedArrayG.getColor(4, 0);
        this.f4412w = android.support.v4.media.session.a.h(context2, typedArrayG, 5);
        this.f4406f = (AccessibilityManager) context2.getSystemService("accessibility");
        c2 c2Var = new c2(context2, null, R.attr.listPopupWindowStyle, 0);
        this.e = c2Var;
        c2Var.J = true;
        c2Var.K.setFocusable(true);
        c2Var.f6255z = this;
        c2Var.K.setInputMethodMode(2);
        c2Var.p(getAdapter());
        c2Var.A = new u(this, 0);
        if (typedArrayG.hasValue(6)) {
            setSimpleItems(typedArrayG.getResourceId(6, 0));
        }
        typedArrayG.recycle();
    }

    public static void a(w wVar, Object obj) {
        wVar.setText(wVar.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.f4406f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.e.dismiss();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f4410u;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.P) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f4409t;
    }

    public int getSimpleItemSelectedColor() {
        return this.f4411v;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f4412w;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.P && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.e.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                c2 c2Var = this.e;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !c2Var.K.isShowing() ? -1 : c2Var.f6244c.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = c2Var.K.getBackground();
                if (background != null) {
                    Rect rect = this.f4407r;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z4) {
        AccessibilityManager accessibilityManager = this.f4406f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z4);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.e.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        c2 c2Var = this.e;
        if (c2Var != null) {
            c2Var.g(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f4410u = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof b9.g) {
            ((b9.g) dropDownBackground).k(this.f4410u);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.e.B = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f4411v = i;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f4412w = colorStateList;
        if (getAdapter() instanceof v) {
            ((v) getAdapter()).a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.f4406f;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.e.h();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new v(this, getContext(), this.f4408s, strArr));
    }
}

package l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends Spinner {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f6384t = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fd.n f6385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f6387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SpinnerAdapter f6388d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final o0 f6389f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f6390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f6391s;

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:32:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    public p0(Context context, AttributeSet attributeSet) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, app.namso_gen.spacehowen.R.attr.spinnerStyle);
        this.f6391s = new Rect();
        y2.a(getContext(), this);
        int[] iArr = f.a.f3570v;
        a2.l lVarG = a2.l.G(context, attributeSet, iArr, app.namso_gen.spacehowen.R.attr.spinnerStyle);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        this.f6385a = new fd.n(this);
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f6386b = new j.d(context, resourceId);
        } else {
            this.f6386b = context;
        }
        int i = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f6384t, app.namso_gen.spacehowen.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception e) {
                    e = e;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i != 0) {
                        j0 j0Var = new j0(this);
                        this.f6389f = j0Var;
                        j0Var.f6321c = typedArray.getString(2);
                    } else if (i == 1) {
                        m0 m0Var = new m0(this, this.f6386b, attributeSet);
                        a2.l lVarG2 = a2.l.G(this.f6386b, attributeSet, iArr, app.namso_gen.spacehowen.R.attr.spinnerStyle);
                        this.f6390r = ((TypedArray) lVarG2.f44c).getLayoutDimension(3, -2);
                        m0Var.g(lVarG2.u(1));
                        m0Var.N = typedArray.getString(2);
                        lVarG2.I();
                        this.f6389f = m0Var;
                        this.f6387c = new f0(this, this, m0Var);
                    }
                    textArray = typedArray.getTextArray(0);
                    if (textArray != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                        arrayAdapter.setDropDownViewResource(app.namso_gen.spacehowen.R.layout.support_simple_spinner_dropdown_item);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    lVarG.I();
                    this.e = true;
                    spinnerAdapter = this.f6388d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f6388d = null;
                    }
                    this.f6385a.l(attributeSet, app.namso_gen.spacehowen.R.attr.spinnerStyle);
                }
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray2 != null) {
                typedArray2.recycle();
            }
            throw th;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i != 0) {
            j0 j0Var2 = new j0(this);
            this.f6389f = j0Var2;
            j0Var2.f6321c = typedArray.getString(2);
        } else if (i == 1) {
            m0 m0Var2 = new m0(this, this.f6386b, attributeSet);
            a2.l lVarG3 = a2.l.G(this.f6386b, attributeSet, iArr, app.namso_gen.spacehowen.R.attr.spinnerStyle);
            this.f6390r = ((TypedArray) lVarG3.f44c).getLayoutDimension(3, -2);
            m0Var2.g(lVarG3.u(1));
            m0Var2.N = typedArray.getString(2);
            lVarG3.I();
            this.f6389f = m0Var2;
            this.f6387c = new f0(this, this, m0Var2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(app.namso_gen.spacehowen.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        lVarG.I();
        this.e = true;
        spinnerAdapter = this.f6388d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f6388d = null;
        }
        this.f6385a.l(attributeSet, app.namso_gen.spacehowen.R.attr.spinnerStyle);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.f6391s;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        fd.n nVar = this.f6385a;
        if (nVar != null) {
            nVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        o0 o0Var = this.f6389f;
        return o0Var != null ? o0Var.b() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        o0 o0Var = this.f6389f;
        return o0Var != null ? o0Var.o() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f6389f != null ? this.f6390r : super.getDropDownWidth();
    }

    public final o0 getInternalPopup() {
        return this.f6389f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        o0 o0Var = this.f6389f;
        return o0Var != null ? o0Var.e() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f6386b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        o0 o0Var = this.f6389f;
        return o0Var != null ? o0Var.d() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        fd.n nVar = this.f6385a;
        if (nVar != null) {
            return nVar.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        fd.n nVar = this.f6385a;
        if (nVar != null) {
            return nVar.i();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        o0 o0Var = this.f6389f;
        if (o0Var == null || !o0Var.a()) {
            return;
        }
        o0Var.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        if (this.f6389f == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        n0 n0Var = (n0) parcelable;
        super.onRestoreInstanceState(n0Var.getSuperState());
        if (!n0Var.f6369a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new k.d(this, 2));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        n0 n0Var = new n0(super.onSaveInstanceState());
        o0 o0Var = this.f6389f;
        n0Var.f6369a = o0Var != null && o0Var.a();
        return n0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        f0 f0Var = this.f6387c;
        if (f0Var == null || !f0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        o0 o0Var = this.f6389f;
        if (o0Var == null) {
            return super.performClick();
        }
        if (o0Var.a()) {
            return true;
        }
        o0Var.n(h0.b(this), h0.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        fd.n nVar = this.f6385a;
        if (nVar != null) {
            nVar.n();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        fd.n nVar = this.f6385a;
        if (nVar != null) {
            nVar.o(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        o0 o0Var = this.f6389f;
        if (o0Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            o0Var.k(i);
            o0Var.c(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        o0 o0Var = this.f6389f;
        if (o0Var != null) {
            o0Var.i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f6389f != null) {
            this.f6390r = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        o0 o0Var = this.f6389f;
        if (o0Var != null) {
            o0Var.g(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(com.bumptech.glide.d.r(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        o0 o0Var = this.f6389f;
        if (o0Var != null) {
            o0Var.f(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        fd.n nVar = this.f6385a;
        if (nVar != null) {
            nVar.t(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        fd.n nVar = this.f6385a;
        if (nVar != null) {
            nVar.u(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.e) {
            this.f6388d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        o0 o0Var = this.f6389f;
        if (o0Var != null) {
            Context context = this.f6386b;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            k0 k0Var = new k0();
            k0Var.f6323a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                k0Var.f6324b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                i0.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            o0Var.p(k0Var);
        }
    }
}

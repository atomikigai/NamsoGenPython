package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import b9.j;
import b9.k;
import b9.v;
import com.bumptech.glide.d;
import i0.b;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k8.a;
import k8.c;
import l.o;
import q0.e0;
import q0.v0;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialButton extends o implements Checkable, v {
    public static final int[] C = {R.attr.state_checkable};
    public static final int[] D = {R.attr.state_checked};
    public boolean A;
    public int B;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f2367d;
    public final LinkedHashSet e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f2368f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public PorterDuff.Mode f2369r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f2370s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f2371t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f2372u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f2373v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2374w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f2375x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f2376y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2377z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(i9.a.a(context, attributeSet, app.namso_gen.spacehowen.R.attr.materialButtonStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Button), attributeSet, app.namso_gen.spacehowen.R.attr.materialButtonStyle);
        this.e = new LinkedHashSet();
        this.f2377z = false;
        this.A = false;
        Context context2 = getContext();
        TypedArray typedArrayG = n.g(context2, attributeSet, d8.a.f3026r, app.namso_gen.spacehowen.R.attr.materialButtonStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f2376y = typedArrayG.getDimensionPixelSize(12, 0);
        int i = typedArrayG.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2369r = n.h(i, mode);
        this.f2370s = android.support.v4.media.session.a.h(getContext(), typedArrayG, 14);
        this.f2371t = android.support.v4.media.session.a.j(getContext(), typedArrayG, 10);
        this.B = typedArrayG.getInteger(11, 1);
        this.f2373v = typedArrayG.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, app.namso_gen.spacehowen.R.attr.materialButtonStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Button).a());
        this.f2367d = cVar;
        cVar.f6071c = typedArrayG.getDimensionPixelOffset(1, 0);
        cVar.f6072d = typedArrayG.getDimensionPixelOffset(2, 0);
        cVar.e = typedArrayG.getDimensionPixelOffset(3, 0);
        cVar.f6073f = typedArrayG.getDimensionPixelOffset(4, 0);
        if (typedArrayG.hasValue(8)) {
            int dimensionPixelSize = typedArrayG.getDimensionPixelSize(8, -1);
            cVar.f6074g = dimensionPixelSize;
            float f10 = dimensionPixelSize;
            j jVarE = cVar.f6070b.e();
            jVarE.e = new b9.a(f10);
            jVarE.f1473f = new b9.a(f10);
            jVarE.f1474g = new b9.a(f10);
            jVarE.h = new b9.a(f10);
            cVar.c(jVarE.a());
            cVar.f6081p = true;
        }
        cVar.h = typedArrayG.getDimensionPixelSize(20, 0);
        cVar.i = n.h(typedArrayG.getInt(7, -1), mode);
        cVar.f6075j = android.support.v4.media.session.a.h(getContext(), typedArrayG, 6);
        cVar.f6076k = android.support.v4.media.session.a.h(getContext(), typedArrayG, 19);
        cVar.f6077l = android.support.v4.media.session.a.h(getContext(), typedArrayG, 16);
        cVar.f6082q = typedArrayG.getBoolean(5, false);
        cVar.f6085t = typedArrayG.getDimensionPixelSize(9, 0);
        cVar.f6083r = typedArrayG.getBoolean(21, true);
        WeakHashMap weakHashMap = v0.f7946a;
        int iF = e0.f(this);
        int paddingTop = getPaddingTop();
        int iE = e0.e(this);
        int paddingBottom = getPaddingBottom();
        if (typedArrayG.hasValue(0)) {
            cVar.f6080o = true;
            setSupportBackgroundTintList(cVar.f6075j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        e0.k(this, iF + cVar.f6071c, paddingTop + cVar.e, iE + cVar.f6072d, paddingBottom + cVar.f6073f);
        typedArrayG.recycle();
        setCompoundDrawablePadding(this.f2376y);
        c(this.f2371t != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return getGravityTextAlignment();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            return (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    public final boolean a() {
        c cVar = this.f2367d;
        return (cVar == null || cVar.f6080o) ? false : true;
    }

    public final void b() {
        int i = this.B;
        if (i == 1 || i == 2) {
            u0.o.e(this, this.f2371t, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            u0.o.e(this, null, null, this.f2371t, null);
        } else if (i == 16 || i == 32) {
            u0.o.e(this, null, this.f2371t, null, null);
        }
    }

    public final void c(boolean z4) {
        Drawable drawable = this.f2371t;
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.f2371t = drawableMutate;
            b.h(drawableMutate, this.f2370s);
            PorterDuff.Mode mode = this.f2369r;
            if (mode != null) {
                b.i(this.f2371t, mode);
            }
            int intrinsicWidth = this.f2373v;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f2371t.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f2373v;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f2371t.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f2371t;
            int i = this.f2374w;
            int i10 = this.f2375x;
            drawable2.setBounds(i, i10, intrinsicWidth + i, intrinsicHeight + i10);
            this.f2371t.setVisible(true, z4);
        }
        if (z4) {
            b();
            return;
        }
        Drawable[] drawableArrA = u0.o.a(this);
        Drawable drawable3 = drawableArrA[0];
        Drawable drawable4 = drawableArrA[1];
        Drawable drawable5 = drawableArrA[2];
        int i11 = this.B;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.f2371t) || (((i11 == 3 || i11 == 4) && drawable5 != this.f2371t) || ((i11 == 16 || i11 == 32) && drawable4 != this.f2371t))) {
            b();
        }
    }

    public final void d(int i, int i10) {
        if (this.f2371t == null || getLayout() == null) {
            return;
        }
        int i11 = this.B;
        if (i11 != 1 && i11 != 2 && i11 != 3 && i11 != 4) {
            if (i11 == 16 || i11 == 32) {
                this.f2374w = 0;
                if (i11 == 16) {
                    this.f2375x = 0;
                    c(false);
                    return;
                }
                int intrinsicHeight = this.f2373v;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f2371t.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i10 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f2376y) - getPaddingBottom()) / 2);
                if (this.f2375x != iMax) {
                    this.f2375x = iMax;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2375x = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.B;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f2374w = 0;
            c(false);
            return;
        }
        int intrinsicWidth = this.f2373v;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f2371t.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = v0.f7946a;
        int iE = (((textLayoutWidth - e0.e(this)) - intrinsicWidth) - this.f2376y) - e0.f(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            iE /= 2;
        }
        if ((e0.d(this) == 1) != (this.B == 4)) {
            iE = -iE;
        }
        if (this.f2374w != iE) {
            this.f2374w = iE;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f2372u)) {
            return this.f2372u;
        }
        c cVar = this.f2367d;
        return ((cVar == null || !cVar.f6082q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f2367d.f6074g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f2371t;
    }

    public int getIconGravity() {
        return this.B;
    }

    public int getIconPadding() {
        return this.f2376y;
    }

    public int getIconSize() {
        return this.f2373v;
    }

    public ColorStateList getIconTint() {
        return this.f2370s;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2369r;
    }

    public int getInsetBottom() {
        return this.f2367d.f6073f;
    }

    public int getInsetTop() {
        return this.f2367d.e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f2367d.f6077l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f2367d.f6070b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f2367d.f6076k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f2367d.h;
        }
        return 0;
    }

    @Override // l.o
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f2367d.f6075j : super.getSupportBackgroundTintList();
    }

    @Override // l.o
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f2367d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2377z;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            d.A(this, this.f2367d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        c cVar = this.f2367d;
        if (cVar != null && cVar.f6082q) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, C);
        }
        if (this.f2377z) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, D);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // l.o, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2377z);
    }

    @Override // l.o, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        c cVar = this.f2367d;
        accessibilityNodeInfo.setCheckable(cVar != null && cVar.f6082q);
        accessibilityNodeInfo.setChecked(this.f2377z);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // l.o, android.widget.TextView, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        super.onLayout(z4, i, i10, i11, i12);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof k8.b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        k8.b bVar = (k8.b) parcelable;
        super.onRestoreInstanceState(bVar.f10011a);
        setChecked(bVar.f6068c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        k8.b bVar = new k8.b(super.onSaveInstanceState());
        bVar.f6068c = this.f2377z;
        return bVar;
    }

    @Override // l.o, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i10, int i11) {
        super.onTextChanged(charSequence, i, i10, i11);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2367d.f6083r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f2371t != null) {
            if (this.f2371t.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f2372u = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        c cVar = this.f2367d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // l.o, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f2367d;
        cVar.f6080o = true;
        MaterialButton materialButton = cVar.f6069a;
        materialButton.setSupportBackgroundTintList(cVar.f6075j);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // l.o, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? d.r(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z4) {
        if (a()) {
            this.f2367d.f6082q = z4;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z4) {
        c cVar = this.f2367d;
        if (cVar == null || !cVar.f6082q || !isEnabled() || this.f2377z == z4) {
            return;
        }
        this.f2377z = z4;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z10 = this.f2377z;
            if (!materialButtonToggleGroup.f2383f) {
                materialButtonToggleGroup.b(getId(), z10);
            }
        }
        if (this.A) {
            return;
        }
        this.A = true;
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        this.A = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            c cVar = this.f2367d;
            if (cVar.f6081p && cVar.f6074g == i) {
                return;
            }
            cVar.f6074g = i;
            cVar.f6081p = true;
            float f10 = i;
            j jVarE = cVar.f6070b.e();
            jVarE.e = new b9.a(f10);
            jVarE.f1473f = new b9.a(f10);
            jVarE.f1474g = new b9.a(f10);
            jVarE.h = new b9.a(f10);
            cVar.c(jVarE.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (a()) {
            this.f2367d.b(false).j(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f2371t != drawable) {
            this.f2371t = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.B != i) {
            this.B = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f2376y != i) {
            this.f2376y = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? d.r(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2373v != i) {
            this.f2373v = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2370s != colorStateList) {
            this.f2370s = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2369r != mode) {
            this.f2369r = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(e0.k.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.f2367d;
        cVar.d(cVar.e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.f2367d;
        cVar.d(i, cVar.f6073f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f2368f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z4) {
        a aVar = this.f2368f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((a4.b) aVar).f113b).invalidate();
        }
        super.setPressed(z4);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f2367d;
            MaterialButton materialButton = cVar.f6069a;
            if (cVar.f6077l != colorStateList) {
                cVar.f6077l = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(z8.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(e0.k.getColorStateList(getContext(), i));
        }
    }

    @Override // b9.v
    public void setShapeAppearanceModel(k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2367d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z4) {
        if (a()) {
            c cVar = this.f2367d;
            cVar.f6079n = z4;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            c cVar = this.f2367d;
            if (cVar.f6076k != colorStateList) {
                cVar.f6076k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(e0.k.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            c cVar = this.f2367d;
            if (cVar.h != i) {
                cVar.h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // l.o
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f2367d;
        if (cVar.f6075j != colorStateList) {
            cVar.f6075j = colorStateList;
            if (cVar.b(false) != null) {
                b.h(cVar.b(false), cVar.f6075j);
            }
        }
    }

    @Override // l.o
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f2367d;
        if (cVar.i != mode) {
            cVar.i = mode;
            if (cVar.b(false) == null || cVar.i == null) {
                return;
            }
            b.i(cVar.b(false), cVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z4) {
        this.f2367d.f6083r = z4;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2377z);
    }
}

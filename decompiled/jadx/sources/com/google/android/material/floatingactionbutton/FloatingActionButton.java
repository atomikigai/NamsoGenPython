package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import app.namso_gen.spacehowen.R;
import b0.f;
import b9.g;
import b9.k;
import b9.v;
import bb.b;
import com.bumptech.glide.d;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import e8.e;
import g6.m;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import l.r;
import q0.g0;
import q0.v0;
import s8.a;
import t8.c;
import t8.j;
import t8.l;
import u8.n;
import u8.p;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class FloatingActionButton extends p implements a, v, b0.a {
    public l A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f2474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f2475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f2476d;
    public PorterDuff.Mode e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f2477f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2480t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f2481u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2482v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f2483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Rect f2484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final b f2485y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final l.a f2486z;

    /* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        super(i9.a.a(context, attributeSet, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton), attributeSet, R.attr.floatingActionButtonStyle);
        this.f9046a = getVisibility();
        this.f2483w = new Rect();
        this.f2484x = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayG = n.g(context2, attributeSet, d8.a.f3019k, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton, new int[0]);
        this.f2474b = android.support.v4.media.session.a.h(context2, typedArrayG, 1);
        this.f2475c = n.h(typedArrayG.getInt(2, -1), null);
        this.f2477f = android.support.v4.media.session.a.h(context2, typedArrayG, 12);
        this.f2478r = typedArrayG.getInt(7, -1);
        this.f2479s = typedArrayG.getDimensionPixelSize(6, 0);
        int dimensionPixelSize = typedArrayG.getDimensionPixelSize(3, 0);
        float dimension = typedArrayG.getDimension(4, 0.0f);
        float dimension2 = typedArrayG.getDimension(9, 0.0f);
        float dimension3 = typedArrayG.getDimension(11, 0.0f);
        this.f2482v = typedArrayG.getBoolean(16, false);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayG.getDimensionPixelSize(10, 0));
        e eVarA = e.a(context2, typedArrayG, 15);
        e eVarA2 = e.a(context2, typedArrayG, 8);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, d8.a.f3032x, R.attr.floatingActionButtonStyle, R.style.Widget_Design_FloatingActionButton);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        k kVarA = k.a(context2, resourceId, resourceId2, k.f1478m).a();
        boolean z4 = typedArrayG.getBoolean(5, false);
        setEnabled(typedArrayG.getBoolean(0, true));
        typedArrayG.recycle();
        b bVar = new b(this);
        this.f2485y = bVar;
        bVar.e(attributeSet, R.attr.floatingActionButtonStyle);
        this.f2486z = new l.a(this);
        getImpl().n(kVarA);
        getImpl().g(this.f2474b, this.f2475c, this.f2477f, dimensionPixelSize);
        getImpl().f8645k = dimensionPixelSize2;
        j impl = getImpl();
        if (impl.h != dimension) {
            impl.h = dimension;
            impl.k(dimension, impl.i, impl.f8644j);
        }
        j impl2 = getImpl();
        if (impl2.i != dimension2) {
            impl2.i = dimension2;
            impl2.k(impl2.h, dimension2, impl2.f8644j);
        }
        j impl3 = getImpl();
        if (impl3.f8644j != dimension3) {
            impl3.f8644j = dimension3;
            impl3.k(impl3.h, impl3.i, dimension3);
        }
        getImpl().f8647m = eVarA;
        getImpl().f8648n = eVarA2;
        getImpl().f8642f = z4;
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    private j getImpl() {
        if (this.A == null) {
            this.A = new l(this, new a5.b(this, 28));
        }
        return this.A;
    }

    public final int c(int i) {
        int i10 = this.f2479s;
        if (i10 != 0) {
            return i10;
        }
        Resources resources = getResources();
        if (i != -1) {
            return i != 1 ? resources.getDimensionPixelSize(R.dimen.design_fab_size_normal) : resources.getDimensionPixelSize(R.dimen.design_fab_size_mini);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? c(1) : c(0);
    }

    public final void d() {
        j impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f8653s;
        if (floatingActionButton.getVisibility() == 0) {
            if (impl.f8652r == 1) {
                return;
            }
        } else if (impl.f8652r != 2) {
            return;
        }
        Animator animator = impl.f8646l;
        if (animator != null) {
            animator.cancel();
        }
        FloatingActionButton floatingActionButton2 = impl.f8653s;
        WeakHashMap weakHashMap = v0.f7946a;
        if (!g0.c(floatingActionButton2) || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(4, false);
            return;
        }
        e eVar = impl.f8648n;
        AnimatorSet animatorSetB = eVar != null ? impl.b(eVar, 0.0f, 0.0f, 0.0f) : impl.c(0.0f, 0.4f, 0.4f, j.C, j.D);
        animatorSetB.addListener(new c(impl));
        animatorSetB.start();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().j(getDrawableState());
    }

    public final void e() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f2476d;
        if (colorStateList == null) {
            drawable.clearColorFilter();
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(r.c(colorForState, mode));
    }

    public final void f() {
        j impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f8653s;
        Matrix matrix = impl.f8658x;
        FloatingActionButton floatingActionButton2 = impl.f8653s;
        if (floatingActionButton.getVisibility() != 0) {
            if (impl.f8652r == 2) {
                return;
            }
        } else if (impl.f8652r != 1) {
            return;
        }
        Animator animator = impl.f8646l;
        if (animator != null) {
            animator.cancel();
        }
        boolean z4 = impl.f8647m == null;
        WeakHashMap weakHashMap = v0.f7946a;
        if (!g0.c(floatingActionButton2) || floatingActionButton2.isInEditMode()) {
            floatingActionButton.a(0, false);
            floatingActionButton.setAlpha(1.0f);
            floatingActionButton.setScaleY(1.0f);
            floatingActionButton.setScaleX(1.0f);
            impl.f8650p = 1.0f;
            impl.a(1.0f, matrix);
            floatingActionButton2.setImageMatrix(matrix);
            return;
        }
        if (floatingActionButton.getVisibility() != 0) {
            floatingActionButton.setAlpha(0.0f);
            floatingActionButton.setScaleY(z4 ? 0.4f : 0.0f);
            floatingActionButton.setScaleX(z4 ? 0.4f : 0.0f);
            float f10 = z4 ? 0.4f : 0.0f;
            impl.f8650p = f10;
            impl.a(f10, matrix);
            floatingActionButton2.setImageMatrix(matrix);
        }
        e eVar = impl.f8647m;
        AnimatorSet animatorSetB = eVar != null ? impl.b(eVar, 1.0f, 1.0f, 1.0f) : impl.c(1.0f, 1.0f, 1.0f, j.A, j.B);
        animatorSetB.addListener(new m(impl, 7));
        animatorSetB.start();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f2474b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f2475c;
    }

    @Override // b0.a
    public b0.b getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().e();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().i;
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().f8644j;
    }

    public Drawable getContentBackground() {
        return getImpl().e;
    }

    public int getCustomSize() {
        return this.f2479s;
    }

    public int getExpandedComponentIdHint() {
        return this.f2486z.f6227b;
    }

    public e getHideMotionSpec() {
        return getImpl().f8648n;
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f2477f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f2477f;
    }

    public k getShapeAppearanceModel() {
        k kVar = getImpl().f8638a;
        kVar.getClass();
        return kVar;
    }

    public e getShowMotionSpec() {
        return getImpl().f8647m;
    }

    public int getSize() {
        return this.f2478r;
    }

    public int getSizeDimension() {
        return c(this.f2478r);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f2476d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.e;
    }

    public boolean getUseCompatPadding() {
        return this.f2482v;
    }

    @Override // android.widget.ImageView, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().h();
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        j impl = getImpl();
        FloatingActionButton floatingActionButton = impl.f8653s;
        g gVar = impl.f8639b;
        if (gVar != null) {
            d.A(floatingActionButton, gVar);
        }
        if (impl instanceof l) {
            return;
        }
        ViewTreeObserver viewTreeObserver = floatingActionButton.getViewTreeObserver();
        if (impl.f8659y == null) {
            impl.f8659y = new f(impl, 2);
        }
        viewTreeObserver.addOnPreDrawListener(impl.f8659y);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        j impl = getImpl();
        ViewTreeObserver viewTreeObserver = impl.f8653s.getViewTreeObserver();
        f fVar = impl.f8659y;
        if (fVar != null) {
            viewTreeObserver.removeOnPreDrawListener(fVar);
            impl.f8659y = null;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i10) {
        int sizeDimension = getSizeDimension();
        this.f2480t = (sizeDimension - this.f2481u) / 2;
        getImpl().q();
        int iMin = Math.min(View.resolveSize(sizeDimension, i), View.resolveSize(sizeDimension, i10));
        Rect rect = this.f2483w;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e9.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e9.a aVar = (e9.a) parcelable;
        super.onRestoreInstanceState(aVar.f10011a);
        Bundle bundle = (Bundle) aVar.f3504c.get("expandableWidgetHelper");
        bundle.getClass();
        l.a aVar2 = this.f2486z;
        aVar2.getClass();
        aVar2.f6226a = bundle.getBoolean("expanded", false);
        aVar2.f6227b = bundle.getInt("expandedComponentIdHint", 0);
        if (aVar2.f6226a) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) aVar2.f6228c;
            ViewParent parent = floatingActionButton.getParent();
            if (parent instanceof CoordinatorLayout) {
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
                List list = (List) ((r.k) coordinatorLayout.f566b.f4494b).get(floatingActionButton);
                if (list == null || list.isEmpty()) {
                    return;
                }
                for (int i = 0; i < list.size(); i++) {
                    View view = (View) list.get(i);
                    b0.b bVar = ((b0.e) view.getLayoutParams()).f1319a;
                    if (bVar != null) {
                        bVar.d(coordinatorLayout, view, floatingActionButton);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        e9.a aVar = new e9.a(parcelableOnSaveInstanceState);
        l.a aVar2 = this.f2486z;
        aVar2.getClass();
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", aVar2.f6226a);
        bundle.putInt("expandedComponentIdHint", aVar2.f6227b);
        aVar.f3504c.put("expandableWidgetHelper", bundle);
        return aVar;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            Rect rect = this.f2484x;
            rect.set(0, 0, measuredWidth, measuredHeight);
            int i = rect.left;
            Rect rect2 = this.f2483w;
            rect.left = i + rect2.left;
            rect.top += rect2.top;
            rect.right -= rect2.right;
            rect.bottom -= rect2.bottom;
            l lVar = this.A;
            int i10 = -(lVar.f8642f ? Math.max((lVar.f8645k - lVar.f8653s.getSizeDimension()) / 2, 0) : 0);
            rect.inset(i10, i10);
            if (!rect.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f2474b != colorStateList) {
            this.f2474b = colorStateList;
            j impl = getImpl();
            g gVar = impl.f8639b;
            if (gVar != null) {
                gVar.setTintList(colorStateList);
            }
            t8.a aVar = impl.f8641d;
            if (aVar != null) {
                if (colorStateList != null) {
                    aVar.f8614m = colorStateList.getColorForState(aVar.getState(), aVar.f8614m);
                }
                aVar.f8617p = colorStateList;
                aVar.f8615n = true;
                aVar.invalidateSelf();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f2475c != mode) {
            this.f2475c = mode;
            g gVar = getImpl().f8639b;
            if (gVar != null) {
                gVar.setTintMode(mode);
            }
        }
    }

    public void setCompatElevation(float f10) {
        j impl = getImpl();
        if (impl.h != f10) {
            impl.h = f10;
            impl.k(f10, impl.i, impl.f8644j);
        }
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        j impl = getImpl();
        if (impl.i != f10) {
            impl.i = f10;
            impl.k(impl.h, f10, impl.f8644j);
        }
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f10) {
        j impl = getImpl();
        if (impl.f8644j != f10) {
            impl.f8644j = f10;
            impl.k(impl.h, impl.i, f10);
        }
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.f2479s) {
            this.f2479s = i;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        g gVar = getImpl().f8639b;
        if (gVar != null) {
            gVar.j(f10);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z4) {
        if (z4 != getImpl().f8642f) {
            getImpl().f8642f = z4;
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i) {
        this.f2486z.f6227b = i;
    }

    public void setHideMotionSpec(e eVar) {
        getImpl().f8648n = eVar;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(e.b(getContext(), i));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            j impl = getImpl();
            float f10 = impl.f8650p;
            impl.f8650p = f10;
            Matrix matrix = impl.f8658x;
            impl.a(f10, matrix);
            impl.f8653s.setImageMatrix(matrix);
            if (this.f2476d != null) {
                e();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f2485y.f(i);
        e();
    }

    public void setMaxImageSize(int i) {
        this.f2481u = i;
        j impl = getImpl();
        if (impl.f8651q != i) {
            impl.f8651q = i;
            float f10 = impl.f8650p;
            impl.f8650p = f10;
            Matrix matrix = impl.f8658x;
            impl.a(f10, matrix);
            impl.f8653s.setImageMatrix(matrix);
        }
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().getClass();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().getClass();
    }

    public void setShadowPaddingEnabled(boolean z4) {
        j impl = getImpl();
        impl.f8643g = z4;
        impl.q();
    }

    @Override // b9.v
    public void setShapeAppearanceModel(k kVar) {
        getImpl().n(kVar);
    }

    public void setShowMotionSpec(e eVar) {
        getImpl().f8647m = eVar;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(e.b(getContext(), i));
    }

    public void setSize(int i) {
        this.f2479s = 0;
        if (i != this.f2478r) {
            this.f2478r = i;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f2476d != colorStateList) {
            this.f2476d = colorStateList;
            e();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.e != mode) {
            this.e = mode;
            e();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().l();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().l();
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.f2482v != z4) {
            this.f2482v = z4;
            getImpl().i();
        }
    }

    @Override // u8.p, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    /* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
    public static class BaseBehavior<T extends FloatingActionButton> extends b0.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f2487a;

        public BaseBehavior() {
            this.f2487a = true;
        }

        @Override // b0.b
        public final boolean a(View view, Rect rect) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            Rect rect2 = floatingActionButton.f2483w;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // b0.b
        public final void c(b0.e eVar) {
            if (eVar.h == 0) {
                eVar.h = 80;
            }
        }

        @Override // b0.b
        public final boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams instanceof b0.e ? ((b0.e) layoutParams).f1319a instanceof BottomSheetBehavior : false) {
                r(view2, floatingActionButton);
            }
            return false;
        }

        @Override // b0.b
        public final boolean g(CoordinatorLayout coordinatorLayout, View view, int i) {
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            ArrayList arrayListJ = coordinatorLayout.j(floatingActionButton);
            int size = arrayListJ.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                View view2 = (View) arrayListJ.get(i11);
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if ((layoutParams instanceof b0.e ? ((b0.e) layoutParams).f1319a instanceof BottomSheetBehavior : false) && r(view2, floatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.q(floatingActionButton, i);
            Rect rect = floatingActionButton.f2483w;
            if (rect != null && rect.centerX() > 0 && rect.centerY() > 0) {
                b0.e eVar = (b0.e) floatingActionButton.getLayoutParams();
                int i12 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) eVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) eVar).leftMargin ? -rect.left : 0;
                if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) {
                    i10 = rect.bottom;
                } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) eVar).topMargin) {
                    i10 = -rect.top;
                }
                if (i10 != 0) {
                    WeakHashMap weakHashMap = v0.f7946a;
                    floatingActionButton.offsetTopAndBottom(i10);
                }
                if (i12 != 0) {
                    WeakHashMap weakHashMap2 = v0.f7946a;
                    floatingActionButton.offsetLeftAndRight(i12);
                }
            }
            return true;
        }

        public final boolean r(View view, FloatingActionButton floatingActionButton) {
            b0.e eVar = (b0.e) floatingActionButton.getLayoutParams();
            if (!this.f2487a || eVar.f1323f != view.getId() || floatingActionButton.getUserSetVisibility() != 0) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((b0.e) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.d();
                return true;
            }
            floatingActionButton.f();
            return true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d8.a.f3020l);
            this.f2487a = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f2477f != colorStateList) {
            this.f2477f = colorStateList;
            getImpl().m(this.f2477f);
        }
    }
}

package d9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import app.namso_gen.spacehowen.R;
import gb.r;
import java.util.WeakHashMap;
import q0.d0;
import q0.h0;
import q0.j0;
import q0.v0;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g extends FrameLayout {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final f f3043w = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f3044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b9.k f3045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f3047d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3048f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f3049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ColorStateList f3050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f3051t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Rect f3052u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3053v;

    public g(Context context, AttributeSet attributeSet) {
        Drawable drawable;
        super(i9.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, d8.a.F);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = v0.f7946a;
            j0.s(this, dimensionPixelSize);
        }
        this.f3046c = typedArrayObtainStyledAttributes.getInt(2, 0);
        if (typedArrayObtainStyledAttributes.hasValue(8) || typedArrayObtainStyledAttributes.hasValue(9)) {
            this.f3045b = b9.k.b(context2, attributeSet, 0, 0).a();
        }
        this.f3047d = typedArrayObtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(android.support.v4.media.session.a.h(context2, typedArrayObtainStyledAttributes, 4));
        setBackgroundTintMode(n.h(typedArrayObtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.e = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        this.f3048f = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f3049r = typedArrayObtainStyledAttributes.getDimensionPixelSize(7, -1);
        typedArrayObtainStyledAttributes.recycle();
        setOnTouchListener(f3043w);
        setFocusable(true);
        if (getBackground() == null) {
            int iX = com.bumptech.glide.c.x(getBackgroundOverlayColorAlpha(), com.bumptech.glide.c.q(this, R.attr.colorSurface), com.bumptech.glide.c.q(this, R.attr.colorOnSurface));
            b9.k kVar = this.f3045b;
            if (kVar != null) {
                j1.a aVar = h.f3054u;
                b9.g gVar = new b9.g(kVar);
                gVar.k(ColorStateList.valueOf(iX));
                drawable = gVar;
            } else {
                Resources resources = getResources();
                j1.a aVar2 = h.f3054u;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(0);
                gradientDrawable.setCornerRadius(dimension);
                gradientDrawable.setColor(iX);
                drawable = gradientDrawable;
            }
            ColorStateList colorStateList = this.f3050s;
            if (colorStateList != null) {
                i0.b.h(drawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = v0.f7946a;
            d0.q(this, drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBaseTransientBottomBar(h hVar) {
        this.f3044a = hVar;
    }

    public float getActionTextColorAlpha() {
        return this.e;
    }

    public int getAnimationMode() {
        return this.f3046c;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f3047d;
    }

    public int getMaxInlineActionWidth() {
        return this.f3049r;
    }

    public int getMaxWidth() {
        return this.f3048f;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        h hVar = this.f3044a;
        if (hVar != null) {
            hVar.b();
        }
        WeakHashMap weakHashMap = v0.f7946a;
        h0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        boolean z4;
        super.onDetachedFromWindow();
        h hVar = this.f3044a;
        if (hVar != null) {
            r rVarH = r.h();
            e eVar = hVar.f3076t;
            synchronized (rVarH.f4493a) {
                z4 = true;
                if (!rVarH.k(eVar)) {
                    l lVar = (l) rVarH.f4496d;
                    if (!(lVar != null && lVar.f3079a.get() == eVar)) {
                        z4 = false;
                    }
                }
            }
            if (z4) {
                h.f3057x.post(new d(hVar, 1));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        super.onLayout(z4, i, i10, i11, i12);
        h hVar = this.f3044a;
        if (hVar == null || !hVar.f3074r) {
            return;
        }
        hVar.e();
        hVar.f3074r = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        int i11 = this.f3048f;
        if (i11 <= 0 || getMeasuredWidth() <= i11) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), i10);
    }

    public void setAnimationMode(int i) {
        this.f3046c = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f3050s != null) {
            drawable = drawable.mutate();
            i0.b.h(drawable, this.f3050s);
            i0.b.i(drawable, this.f3051t);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f3050s = colorStateList;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            i0.b.h(drawableMutate, colorStateList);
            i0.b.i(drawableMutate, this.f3051t);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f3051t = mode;
        if (getBackground() != null) {
            Drawable drawableMutate = getBackground().mutate();
            i0.b.i(drawableMutate, mode);
            if (drawableMutate != getBackground()) {
                super.setBackgroundDrawable(drawableMutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (this.f3053v || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        this.f3052u = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        h hVar = this.f3044a;
        if (hVar != null) {
            j1.a aVar = h.f3054u;
            hVar.f();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f3043w);
        super.setOnClickListener(onClickListener);
    }
}

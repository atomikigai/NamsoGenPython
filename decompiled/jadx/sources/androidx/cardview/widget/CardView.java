package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b9.e;
import h6.o0;
import p.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f541f = {R.attr.colorBackground};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final e f542r = new e(27);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f545c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f546d;
    public final o0 e;

    public CardView(Context context, AttributeSet attributeSet) {
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, app.namso_gen.spacehowen.R.attr.cardViewStyle);
        Rect rect = new Rect();
        this.f545c = rect;
        this.f546d = new Rect();
        o0 o0Var = new o0(this);
        this.e = o0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f7780a, app.namso_gen.spacehowen.R.attr.cardViewStyle, app.namso_gen.spacehowen.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f541f);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            colorStateListValueOf = ColorStateList.valueOf(fArr[2] > 0.5f ? getResources().getColor(app.namso_gen.spacehowen.R.color.cardview_light_background) : getResources().getColor(app.namso_gen.spacehowen.R.color.cardview_dark_background));
        }
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(5, 0.0f);
        this.f543a = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.f544b = typedArrayObtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        q.a aVar = new q.a(colorStateListValueOf, dimension);
        o0Var.f5061b = aVar;
        setBackgroundDrawable(aVar);
        setClipToOutline(true);
        setElevation(dimension2);
        f542r.w(o0Var, dimension3);
    }

    public ColorStateList getCardBackgroundColor() {
        return ((q.a) ((Drawable) this.e.f5061b)).h;
    }

    public float getCardElevation() {
        return ((CardView) this.e.f5062c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f545c.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f545c.left;
    }

    public int getContentPaddingRight() {
        return this.f545c.right;
    }

    public int getContentPaddingTop() {
        return this.f545c.top;
    }

    public float getMaxCardElevation() {
        return ((q.a) ((Drawable) this.e.f5061b)).e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f544b;
    }

    public float getRadius() {
        return ((q.a) ((Drawable) this.e.f5061b)).f7868a;
    }

    public boolean getUseCompatPadding() {
        return this.f543a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
    }

    public void setCardBackgroundColor(int i) {
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i);
        q.a aVar = (q.a) ((Drawable) this.e.f5061b);
        if (colorStateListValueOf == null) {
            aVar.getClass();
            colorStateListValueOf = ColorStateList.valueOf(0);
        }
        aVar.h = colorStateListValueOf;
        aVar.f7869b.setColor(colorStateListValueOf.getColorForState(aVar.getState(), aVar.h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((CardView) this.e.f5062c).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f542r.w(this.e, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        super.setMinimumHeight(i);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        super.setMinimumWidth(i);
    }

    public void setPreventCornerOverlap(boolean z4) {
        if (z4 != this.f544b) {
            this.f544b = z4;
            o0 o0Var = this.e;
            f542r.w(o0Var, ((q.a) ((Drawable) o0Var.f5061b)).e);
        }
    }

    public void setRadius(float f10) {
        q.a aVar = (q.a) ((Drawable) this.e.f5061b);
        if (f10 == aVar.f7868a) {
            return;
        }
        aVar.f7868a = f10;
        aVar.b(null);
        aVar.invalidateSelf();
    }

    public void setUseCompatPadding(boolean z4) {
        if (this.f543a != z4) {
            this.f543a = z4;
            o0 o0Var = this.e;
            f542r.w(o0Var, ((q.a) ((Drawable) o0Var.f5061b)).e);
        }
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        q.a aVar = (q.a) ((Drawable) this.e.f5061b);
        if (colorStateList == null) {
            aVar.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.h = colorStateList;
        aVar.f7869b.setColor(colorStateList.getColorForState(aVar.getState(), aVar.h.getDefaultColor()));
        aVar.invalidateSelf();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i10, int i11, int i12) {
    }
}

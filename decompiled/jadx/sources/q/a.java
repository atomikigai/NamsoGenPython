package q;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f7868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f7869b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RectF f7870c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f7871d;
    public float e;
    public ColorStateList h;
    public PorterDuffColorFilter i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f7874j;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7872f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f7873g = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PorterDuff.Mode f7875k = PorterDuff.Mode.SRC_IN;

    public a(ColorStateList colorStateList, float f10) {
        this.f7868a = f10;
        Paint paint = new Paint(5);
        this.f7869b = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.h = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.h.getDefaultColor()));
        this.f7870c = new RectF();
        this.f7871d = new Rect();
    }

    public final PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    public final void b(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        float f10 = rect.left;
        float f11 = rect.top;
        float f12 = rect.right;
        float f13 = rect.bottom;
        RectF rectF = this.f7870c;
        rectF.set(f10, f11, f12, f13);
        Rect rect2 = this.f7871d;
        rect2.set(rect);
        if (this.f7872f) {
            rect2.inset((int) Math.ceil(b.a(this.e, this.f7868a, this.f7873g)), (int) Math.ceil(b.b(this.e, this.f7868a, this.f7873g)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4;
        PorterDuffColorFilter porterDuffColorFilter = this.i;
        Paint paint = this.f7869b;
        if (porterDuffColorFilter == null || paint.getColorFilter() != null) {
            z4 = false;
        } else {
            paint.setColorFilter(this.i);
            z4 = true;
        }
        RectF rectF = this.f7870c;
        float f10 = this.f7868a;
        canvas.drawRoundRect(rectF, f10, f10, paint);
        if (z4) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.f7871d, this.f7868a);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f7874j;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.h;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        b(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.f7869b;
        boolean z4 = colorForState != paint.getColor();
        if (z4) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f7874j;
        if (colorStateList2 == null || (mode = this.f7875k) == null) {
            return z4;
        }
        this.i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f7869b.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f7869b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.f7874j = colorStateList;
        this.i = a(colorStateList, this.f7875k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.f7875k = mode;
        this.i = a(this.f7874j, mode);
        invalidateSelf();
    }
}

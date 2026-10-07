package t8;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import b9.m;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends Drawable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f8606b;
    public float h;
    public int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f8611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f8612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f8613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f8614m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b9.k f8616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f8617p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f8605a = b9.l.f1488a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Path f8607c = new Path();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f8608d = new Rect();
    public final RectF e = new RectF();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final RectF f8609f = new RectF();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h4.b f8610g = new h4.b(this);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f8615n = true;

    public a(b9.k kVar) {
        this.f8616o = kVar;
        Paint paint = new Paint(1);
        this.f8606b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z4 = this.f8615n;
        Rect rect = this.f8608d;
        Paint paint = this.f8606b;
        if (z4) {
            copyBounds(rect);
            float fHeight = this.h / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{h0.a.b(this.i, this.f8614m), h0.a.b(this.f8611j, this.f8614m), h0.a.b(h0.a.d(this.f8611j, 0), this.f8614m), h0.a.b(h0.a.d(this.f8613l, 0), this.f8614m), h0.a.b(this.f8613l, this.f8614m), h0.a.b(this.f8612k, this.f8614m)}, new float[]{0.0f, fHeight, 0.5f, 0.5f, 1.0f - fHeight, 1.0f}, Shader.TileMode.CLAMP));
            this.f8615n = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.e;
        rectF.set(rect);
        b9.c cVar = this.f8616o.e;
        Rect bounds = getBounds();
        RectF rectF2 = this.f8609f;
        rectF2.set(bounds);
        float fMin = Math.min(cVar.a(rectF2), rectF.width() / 2.0f);
        b9.k kVar = this.f8616o;
        rectF2.set(getBounds());
        if (kVar.d(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, fMin, fMin, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f8610g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return this.h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        b9.k kVar = this.f8616o;
        Rect bounds = getBounds();
        RectF rectF = this.f8609f;
        rectF.set(bounds);
        if (kVar.d(rectF)) {
            b9.c cVar = this.f8616o.e;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), cVar.a(rectF));
            return;
        }
        Rect rect = this.f8608d;
        copyBounds(rect);
        RectF rectF2 = this.e;
        rectF2.set(rect);
        b9.k kVar2 = this.f8616o;
        m mVar = this.f8605a;
        Path path = this.f8607c;
        mVar.a(kVar2, 1.0f, rectF2, null, path);
        q8.a.b(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        b9.k kVar = this.f8616o;
        Rect bounds = getBounds();
        RectF rectF = this.f8609f;
        rectF.set(bounds);
        if (!kVar.d(rectF)) {
            return true;
        }
        int iRound = Math.round(this.h);
        rect.set(iRound, iRound, iRound, iRound);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.f8617p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f8615n = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f8617p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f8614m)) != this.f8614m) {
            this.f8615n = true;
            this.f8614m = colorForState;
        }
        if (this.f8615n) {
            invalidateSelf();
        }
        return this.f8615n;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f8606b.setAlpha(i);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f8606b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}

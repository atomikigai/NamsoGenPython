package b9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import java.util.BitSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class g extends Drawable implements v {
    public static final Paint H;
    public final a9.a A;
    public final e7.i B;
    public final m C;
    public PorterDuffColorFilter D;
    public PorterDuffColorFilter E;
    public final RectF F;
    public final boolean G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f1454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t[] f1455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t[] f1456c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BitSet f1457d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Matrix f1458f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Path f1459r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Path f1460s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RectF f1461t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final RectF f1462u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Region f1463v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Region f1464w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public k f1465x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Paint f1466y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Paint f1467z;

    static {
        Paint paint = new Paint(1);
        H = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public g() {
        this(new k());
    }

    public final void b(RectF rectF, Path path) {
        f fVar = this.f1454a;
        this.C.a(fVar.f1440a, fVar.i, rectF, this.B, path);
        if (this.f1454a.h != 1.0f) {
            Matrix matrix = this.f1458f;
            matrix.reset();
            float f10 = this.f1454a.h;
            matrix.setScale(f10, f10, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.F, true);
    }

    public final int c(int i) {
        int i10;
        f fVar = this.f1454a;
        float f10 = fVar.f1449m + 0.0f + fVar.f1448l;
        r8.a aVar = fVar.f1441b;
        if (aVar == null || !aVar.f8215a || h0.a.d(i, 255) != aVar.f8218d) {
            return i;
        }
        float f11 = aVar.e;
        float fMin = (f11 <= 0.0f || f10 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f10 / f11)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iX = com.bumptech.glide.c.x(fMin, h0.a.d(i, 255), aVar.f8216b);
        if (fMin > 0.0f && (i10 = aVar.f8217c) != 0) {
            iX = h0.a.b(h0.a.d(i10, r8.a.f8214f), iX);
        }
        return h0.a.d(iX, iAlpha);
    }

    public final void d(Canvas canvas) {
        if (this.f1457d.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f1454a.f1451o;
        Path path = this.f1459r;
        a9.a aVar = this.A;
        if (i != 0) {
            canvas.drawPath(path, aVar.f250a);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            t tVar = this.f1455b[i10];
            int i11 = this.f1454a.f1450n;
            Matrix matrix = t.f1511b;
            tVar.a(matrix, aVar, i11, canvas);
            this.f1456c[i10].a(matrix, aVar, this.f1454a.f1450n, canvas);
        }
        if (this.G) {
            f fVar = this.f1454a;
            int iSin = (int) (Math.sin(Math.toRadians(fVar.f1452p)) * ((double) fVar.f1451o));
            f fVar2 = this.f1454a;
            int iCos = (int) (Math.cos(Math.toRadians(fVar2.f1452p)) * ((double) fVar2.f1451o));
            canvas.translate(-iSin, -iCos);
            canvas.drawPath(path, H);
            canvas.translate(iSin, iCos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        PorterDuffColorFilter porterDuffColorFilter = this.D;
        Paint paint = this.f1466y;
        paint.setColorFilter(porterDuffColorFilter);
        int alpha = paint.getAlpha();
        int i = this.f1454a.f1447k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        PorterDuffColorFilter porterDuffColorFilter2 = this.E;
        Paint paint2 = this.f1467z;
        paint2.setColorFilter(porterDuffColorFilter2);
        paint2.setStrokeWidth(this.f1454a.f1446j);
        int alpha2 = paint2.getAlpha();
        int i10 = this.f1454a.f1447k;
        paint2.setAlpha(((i10 + (i10 >>> 7)) * alpha2) >>> 8);
        boolean z4 = this.e;
        Path path = this.f1459r;
        if (z4) {
            float f10 = -(h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            k kVar = this.f1454a.f1440a;
            j jVarE = kVar.e();
            c bVar = kVar.e;
            if (!(bVar instanceof h)) {
                bVar = new b(f10, bVar);
            }
            jVarE.e = bVar;
            c bVar2 = kVar.f1483f;
            if (!(bVar2 instanceof h)) {
                bVar2 = new b(f10, bVar2);
            }
            jVarE.f1473f = bVar2;
            c bVar3 = kVar.h;
            if (!(bVar3 instanceof h)) {
                bVar3 = new b(f10, bVar3);
            }
            jVarE.h = bVar3;
            c bVar4 = kVar.f1484g;
            if (!(bVar4 instanceof h)) {
                bVar4 = new b(f10, bVar4);
            }
            jVarE.f1474g = bVar4;
            k kVarA = jVarE.a();
            this.f1465x = kVarA;
            float f11 = this.f1454a.i;
            RectF rectFG = g();
            RectF rectF = this.f1462u;
            rectF.set(rectFG);
            float strokeWidth = h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.C.a(kVarA, f11, rectF, null, this.f1460s);
            b(g(), path);
            this.e = false;
        }
        f fVar = this.f1454a;
        fVar.getClass();
        if (fVar.f1450n > 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (!this.f1454a.f1440a.d(g()) && !path.isConvex() && i11 < 29) {
                canvas.save();
                f fVar2 = this.f1454a;
                int iSin = (int) (Math.sin(Math.toRadians(fVar2.f1452p)) * ((double) fVar2.f1451o));
                f fVar3 = this.f1454a;
                canvas.translate(iSin, (int) (Math.cos(Math.toRadians(fVar3.f1452p)) * ((double) fVar3.f1451o)));
                if (this.G) {
                    RectF rectF2 = this.F;
                    int iWidth = (int) (rectF2.width() - getBounds().width());
                    int iHeight = (int) (rectF2.height() - getBounds().height());
                    if (iWidth < 0 || iHeight < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap((this.f1454a.f1450n * 2) + ((int) rectF2.width()) + iWidth, (this.f1454a.f1450n * 2) + ((int) rectF2.height()) + iHeight, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(bitmapCreateBitmap);
                    float f12 = (getBounds().left - this.f1454a.f1450n) - iWidth;
                    float f13 = (getBounds().top - this.f1454a.f1450n) - iHeight;
                    canvas2.translate(-f12, -f13);
                    d(canvas2);
                    canvas.drawBitmap(bitmapCreateBitmap, f12, f13, (Paint) null);
                    bitmapCreateBitmap.recycle();
                    canvas.restore();
                } else {
                    d(canvas);
                    canvas.restore();
                }
            }
        }
        f fVar4 = this.f1454a;
        Paint.Style style = fVar4.f1453q;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            e(canvas, paint, path, fVar4.f1440a, g());
        }
        if (h()) {
            f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    public final void e(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float fA = kVar.f1483f.a(rectF) * this.f1454a.i;
            canvas.drawRoundRect(rectF, fA, fA, paint);
        }
    }

    public void f(Canvas canvas) {
        k kVar = this.f1465x;
        RectF rectFG = g();
        RectF rectF = this.f1462u;
        rectF.set(rectFG);
        boolean zH = h();
        Paint paint = this.f1467z;
        float strokeWidth = zH ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        e(canvas, paint, this.f1460s, kVar, rectF);
    }

    public final RectF g() {
        Rect bounds = getBounds();
        RectF rectF = this.f1461t;
        rectF.set(bounds);
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1454a.f1447k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1454a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f1454a.getClass();
        if (this.f1454a.f1440a.d(g())) {
            outline.setRoundRect(getBounds(), this.f1454a.f1440a.e.a(g()) * this.f1454a.i);
        } else {
            RectF rectFG = g();
            Path path = this.f1459r;
            b(rectFG, path);
            q8.a.b(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1454a.f1445g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1463v;
        region.set(bounds);
        RectF rectFG = g();
        Path path = this.f1459r;
        b(rectFG, path);
        Region region2 = this.f1464w;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    public final boolean h() {
        Paint.Style style = this.f1454a.f1453q;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1467z.getStrokeWidth() > 0.0f;
    }

    public final void i(Context context) {
        this.f1454a.f1441b = new r8.a(context);
        n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f1454a.e;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        this.f1454a.getClass();
        ColorStateList colorStateList2 = this.f1454a.f1443d;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f1454a.f1442c;
        return colorStateList3 != null && colorStateList3.isStateful();
    }

    public final void j(float f10) {
        f fVar = this.f1454a;
        if (fVar.f1449m != f10) {
            fVar.f1449m = f10;
            n();
        }
    }

    public final void k(ColorStateList colorStateList) {
        f fVar = this.f1454a;
        if (fVar.f1442c != colorStateList) {
            fVar.f1442c = colorStateList;
            onStateChange(getState());
        }
    }

    public final boolean l(int[] iArr) {
        boolean z4;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1454a.f1442c == null || color2 == (colorForState2 = this.f1454a.f1442c.getColorForState(iArr, (color2 = (paint2 = this.f1466y).getColor())))) {
            z4 = false;
        } else {
            paint2.setColor(colorForState2);
            z4 = true;
        }
        if (this.f1454a.f1443d == null || color == (colorForState = this.f1454a.f1443d.getColorForState(iArr, (color = (paint = this.f1467z).getColor())))) {
            return z4;
        }
        paint.setColor(colorForState);
        return true;
    }

    public final boolean m() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.D;
        PorterDuffColorFilter porterDuffColorFilter3 = this.E;
        f fVar = this.f1454a;
        ColorStateList colorStateList = fVar.e;
        PorterDuff.Mode mode = fVar.f1444f;
        if (colorStateList == null || mode == null) {
            int color = this.f1466y.getColor();
            int iC = c(color);
            porterDuffColorFilter = iC != color ? new PorterDuffColorFilter(iC, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.D = porterDuffColorFilter;
        this.f1454a.getClass();
        this.E = null;
        this.f1454a.getClass();
        return (p0.b.a(porterDuffColorFilter2, this.D) && p0.b.a(porterDuffColorFilter3, this.E)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1454a = new f(this.f1454a);
        return this;
    }

    public final void n() {
        f fVar = this.f1454a;
        float f10 = fVar.f1449m + 0.0f;
        fVar.f1450n = (int) Math.ceil(0.75f * f10);
        this.f1454a.f1451o = (int) Math.ceil(f10 * 0.25f);
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z4 = l(iArr) || m();
        if (z4) {
            invalidateSelf();
        }
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        f fVar = this.f1454a;
        if (fVar.f1447k != i) {
            fVar.f1447k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1454a.getClass();
        super.invalidateSelf();
    }

    @Override // b9.v
    public final void setShapeAppearanceModel(k kVar) {
        this.f1454a.f1440a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1454a.e = colorStateList;
        m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        f fVar = this.f1454a;
        if (fVar.f1444f != mode) {
            fVar.f1444f = mode;
            m();
            super.invalidateSelf();
        }
    }

    public g(Context context, AttributeSet attributeSet, int i, int i10) {
        this(k.b(context, attributeSet, i, i10).a());
    }

    public g(k kVar) {
        this(new f(kVar));
    }

    public g(f fVar) {
        m mVar;
        this.f1455b = new t[4];
        this.f1456c = new t[4];
        this.f1457d = new BitSet(8);
        this.f1458f = new Matrix();
        this.f1459r = new Path();
        this.f1460s = new Path();
        this.f1461t = new RectF();
        this.f1462u = new RectF();
        this.f1463v = new Region();
        this.f1464w = new Region();
        Paint paint = new Paint(1);
        this.f1466y = paint;
        Paint paint2 = new Paint(1);
        this.f1467z = paint2;
        this.A = new a9.a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            mVar = l.f1488a;
        } else {
            mVar = new m();
        }
        this.C = mVar;
        this.F = new RectF();
        this.G = true;
        this.f1454a = fVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m();
        l(getState());
        this.B = new e7.i(this, 10);
    }
}

package n8;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import b9.j;
import b9.m;
import com.google.android.material.chip.Chip;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import u8.k;
import u8.l;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends b9.g implements Drawable.Callback, k {
    public static final int[] Q0 = {R.attr.state_enabled};
    public static final ShapeDrawable R0 = new ShapeDrawable(new OvalShape());
    public int A0;
    public int B0;
    public boolean C0;
    public int D0;
    public int E0;
    public ColorFilter F0;
    public PorterDuffColorFilter G0;
    public ColorStateList H0;
    public ColorStateList I;
    public PorterDuff.Mode I0;
    public ColorStateList J;
    public int[] J0;
    public float K;
    public ColorStateList K0;
    public float L;
    public WeakReference L0;
    public ColorStateList M;
    public TextUtils.TruncateAt M0;
    public float N;
    public boolean N0;
    public ColorStateList O;
    public int O0;
    public CharSequence P;
    public boolean P0;
    public boolean Q;
    public Drawable R;
    public ColorStateList S;
    public float T;
    public boolean U;
    public boolean V;
    public Drawable W;
    public RippleDrawable X;
    public ColorStateList Y;
    public float Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public SpannableStringBuilder f7320a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f7321b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f7322c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public Drawable f7323d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public ColorStateList f7324e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public e8.e f7325f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public e8.e f7326g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public float f7327h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public float f7328i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public float f7329j0;
    public float k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public float f7330l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public float f7331m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public float f7332n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f7333o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f7334p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final Paint f7335q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Paint.FontMetrics f7336r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final RectF f7337s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final PointF f7338t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Path f7339u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final l f7340v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f7341w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f7342x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f7343y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f7344z0;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, app.namso_gen.spacehowen.R.attr.chipStyle, app.namso_gen.spacehowen.R.style.Widget_MaterialComponents_Chip_Action);
        this.L = -1.0f;
        this.f7335q0 = new Paint(1);
        this.f7336r0 = new Paint.FontMetrics();
        this.f7337s0 = new RectF();
        this.f7338t0 = new PointF();
        this.f7339u0 = new Path();
        this.E0 = 255;
        this.I0 = PorterDuff.Mode.SRC_IN;
        this.L0 = new WeakReference(null);
        i(context);
        this.f7334p0 = context;
        l lVar = new l(this);
        this.f7340v0 = lVar;
        this.P = "";
        lVar.f9034a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = Q0;
        setState(iArr);
        if (!Arrays.equals(this.J0, iArr)) {
            this.J0 = iArr;
            if (T()) {
                w(getState(), iArr);
            }
        }
        this.N0 = true;
        int[] iArr2 = z8.a.f11521a;
        R0.setTint(-1);
    }

    public static void U(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean t(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean u(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(boolean z4) {
        if (this.f7322c0 != z4) {
            boolean zR = R();
            this.f7322c0 = z4;
            boolean zR2 = R();
            if (zR != zR2) {
                if (zR2) {
                    o(this.f7323d0);
                } else {
                    U(this.f7323d0);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void B(float f10) {
        if (this.L != f10) {
            this.L = f10;
            j jVarE = this.f1454a.f1440a.e();
            jVarE.e = new b9.a(f10);
            jVarE.f1473f = new b9.a(f10);
            jVarE.f1474g = new b9.a(f10);
            jVarE.h = new b9.a(f10);
            setShapeAppearanceModel(jVarE.a());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    public final void C(Drawable drawable) {
        ?? r10;
        Object obj = this.R;
        if (obj == null) {
            r10 = 0;
        } else if (obj instanceof i0.h) {
            r10 = obj;
            r10 = 0;
        }
        if (r10 != drawable) {
            float fQ = q();
            this.R = drawable != null ? drawable.mutate() : null;
            float fQ2 = q();
            U(r10);
            if (S()) {
                o(this.R);
            }
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void D(float f10) {
        if (this.T != f10) {
            float fQ = q();
            this.T = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void E(ColorStateList colorStateList) {
        this.U = true;
        if (this.S != colorStateList) {
            this.S = colorStateList;
            if (S()) {
                i0.b.h(this.R, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void F(boolean z4) {
        if (this.Q != z4) {
            boolean zS = S();
            this.Q = z4;
            boolean zS2 = S();
            if (zS != zS2) {
                if (zS2) {
                    o(this.R);
                } else {
                    U(this.R);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void G(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (this.P0) {
                b9.f fVar = this.f1454a;
                if (fVar.f1443d != colorStateList) {
                    fVar.f1443d = colorStateList;
                    onStateChange(getState());
                }
            }
            onStateChange(getState());
        }
    }

    public final void H(float f10) {
        if (this.N != f10) {
            this.N = f10;
            this.f7335q0.setStrokeWidth(f10);
            if (this.P0) {
                this.f1454a.f1446j = f10;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.graphics.drawable.Drawable] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void I(Drawable drawable) {
        ?? r10;
        Object obj = this.W;
        if (obj == null) {
            r10 = 0;
        } else if (obj instanceof i0.h) {
            r10 = obj;
            r10 = 0;
        }
        if (r10 != drawable) {
            float fR = r();
            this.W = drawable != null ? drawable.mutate() : null;
            int[] iArr = z8.a.f11521a;
            this.X = new RippleDrawable(z8.a.b(this.O), this.W, R0);
            float fR2 = r();
            U(r10);
            if (T()) {
                o(this.W);
            }
            invalidateSelf();
            if (fR != fR2) {
                v();
            }
        }
    }

    public final void J(float f10) {
        if (this.f7332n0 != f10) {
            this.f7332n0 = f10;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void K(float f10) {
        if (this.Z != f10) {
            this.Z = f10;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void L(float f10) {
        if (this.f7331m0 != f10) {
            this.f7331m0 = f10;
            invalidateSelf();
            if (T()) {
                v();
            }
        }
    }

    public final void M(ColorStateList colorStateList) {
        if (this.Y != colorStateList) {
            this.Y = colorStateList;
            if (T()) {
                i0.b.h(this.W, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void N(boolean z4) {
        if (this.V != z4) {
            boolean zT = T();
            this.V = z4;
            boolean zT2 = T();
            if (zT != zT2) {
                if (zT2) {
                    o(this.W);
                } else {
                    U(this.W);
                }
                invalidateSelf();
                v();
            }
        }
    }

    public final void O(float f10) {
        if (this.f7329j0 != f10) {
            float fQ = q();
            this.f7329j0 = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void P(float f10) {
        if (this.f7328i0 != f10) {
            float fQ = q();
            this.f7328i0 = f10;
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void Q(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            this.K0 = null;
            onStateChange(getState());
        }
    }

    public final boolean R() {
        return this.f7322c0 && this.f7323d0 != null && this.C0;
    }

    public final boolean S() {
        return this.Q && this.R != null;
    }

    public final boolean T() {
        return this.V && this.W != null;
    }

    @Override // u8.k
    public final void a() {
        v();
        invalidateSelf();
    }

    @Override // b9.g, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int iSaveLayerAlpha;
        float f10;
        int i10;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.E0) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            iSaveLayerAlpha = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            iSaveLayerAlpha = 0;
        }
        boolean z4 = this.P0;
        Paint paint = this.f7335q0;
        RectF rectF = this.f7337s0;
        if (!z4) {
            paint.setColor(this.f7341w0);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (!this.P0) {
            paint.setColor(this.f7342x0);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.F0;
            if (colorFilter == null) {
                colorFilter = this.G0;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (this.P0) {
            super.draw(canvas);
        }
        if (this.N > 0.0f && !this.P0) {
            paint.setColor(this.f7344z0);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.P0) {
                ColorFilter colorFilter2 = this.F0;
                if (colorFilter2 == null) {
                    colorFilter2 = this.G0;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f11 = bounds.left;
            float f12 = this.N / 2.0f;
            rectF.set(f11 + f12, bounds.top + f12, bounds.right - f12, bounds.bottom - f12);
            float f13 = this.L - (this.N / 2.0f);
            canvas2.drawRoundRect(rectF, f13, f13, paint);
        }
        paint.setColor(this.A0);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.P0) {
            RectF rectF2 = new RectF(bounds);
            b9.f fVar = this.f1454a;
            b9.k kVar = fVar.f1440a;
            float f14 = fVar.i;
            e7.i iVar = this.B;
            m mVar = this.C;
            Path path = this.f7339u0;
            mVar.a(kVar, f14, rectF2, iVar, path);
            e(canvas2, paint, path, this.f1454a.f1440a, g());
        } else {
            canvas2.drawRoundRect(rectF, s(), s(), paint);
        }
        if (S()) {
            p(bounds, rectF);
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.R.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.R.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (R()) {
            p(bounds, rectF);
            float f17 = rectF.left;
            float f18 = rectF.top;
            canvas2.translate(f17, f18);
            this.f7323d0.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.f7323d0.draw(canvas2);
            canvas2.translate(-f17, -f18);
        }
        if (this.N0 && this.P != null) {
            PointF pointF = this.f7338t0;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.P;
            l lVar = this.f7340v0;
            if (charSequence != null) {
                float fQ = q() + this.f7327h0 + this.k0;
                if (i0.c.a(this) == 0) {
                    pointF.x = bounds.left + fQ;
                } else {
                    pointF.x = bounds.right - fQ;
                    align = Paint.Align.RIGHT;
                }
                float fCenterY = bounds.centerY();
                TextPaint textPaint = lVar.f9034a;
                Paint.FontMetrics fontMetrics = this.f7336r0;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = fCenterY - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f);
            }
            rectF.setEmpty();
            if (this.P != null) {
                float fQ2 = q() + this.f7327h0 + this.k0;
                float fR = r() + this.f7333o0 + this.f7330l0;
                if (i0.c.a(this) == 0) {
                    rectF.left = bounds.left + fQ2;
                    rectF.right = bounds.right - fR;
                } else {
                    rectF.left = bounds.left + fR;
                    rectF.right = bounds.right - fQ2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            y8.d dVar = lVar.f9039g;
            TextPaint textPaint2 = lVar.f9034a;
            if (dVar != null) {
                textPaint2.drawableState = getState();
                lVar.f9039g.e(this.f7334p0, textPaint2, lVar.f9035b);
            }
            textPaint2.setTextAlign(align);
            String string = this.P.toString();
            if (lVar.e) {
                lVar.a(string);
                f10 = lVar.f9036c;
            } else {
                f10 = lVar.f9036c;
            }
            boolean z10 = Math.round(f10) > Math.round(rectF.width());
            if (z10) {
                int iSave = canvas2.save();
                canvas2.clipRect(rectF);
                i10 = iSave;
            } else {
                i10 = 0;
            }
            CharSequence charSequenceEllipsize = this.P;
            if (z10 && this.M0 != null) {
                charSequenceEllipsize = TextUtils.ellipsize(charSequenceEllipsize, textPaint2, rectF.width(), this.M0);
            }
            canvas.drawText(charSequenceEllipsize, 0, charSequenceEllipsize.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z10) {
                canvas2.restoreToCount(i10);
            }
        }
        if (T()) {
            rectF.setEmpty();
            if (T()) {
                float f19 = this.f7333o0 + this.f7332n0;
                if (i0.c.a(this) == 0) {
                    float f20 = bounds.right - f19;
                    rectF.right = f20;
                    rectF.left = f20 - this.Z;
                } else {
                    float f21 = bounds.left + f19;
                    rectF.left = f21;
                    rectF.right = f21 + this.Z;
                }
                float fExactCenterY = bounds.exactCenterY();
                float f22 = this.Z;
                float f23 = fExactCenterY - (f22 / 2.0f);
                rectF.top = f23;
                rectF.bottom = f23 + f22;
            }
            float f24 = rectF.left;
            float f25 = rectF.top;
            canvas2.translate(f24, f25);
            this.W.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            int[] iArr = z8.a.f11521a;
            this.X.setBounds(this.W.getBounds());
            this.X.jumpToCurrentState();
            this.X.draw(canvas2);
            canvas2.translate(-f24, -f25);
        }
        if (this.E0 < 255) {
            canvas2.restoreToCount(iSaveLayerAlpha);
        }
    }

    @Override // b9.g, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.E0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.F0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.K;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        float f10;
        float fQ = q() + this.f7327h0 + this.k0;
        String string = this.P.toString();
        l lVar = this.f7340v0;
        if (lVar.e) {
            lVar.a(string);
            f10 = lVar.f9036c;
        } else {
            f10 = lVar.f9036c;
        }
        return Math.min(Math.round(r() + f10 + fQ + this.f7330l0 + this.f7333o0), this.O0);
    }

    @Override // b9.g, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // b9.g, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.P0) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.K, this.L);
        } else {
            outline.setRoundRect(bounds, this.L);
            outline2 = outline;
        }
        outline2.setAlpha(this.E0 / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // b9.g, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (t(this.I) || t(this.J) || t(this.M)) {
            return true;
        }
        y8.d dVar = this.f7340v0.f9039g;
        if (dVar == null || (colorStateList = dVar.f10629j) == null || !colorStateList.isStateful()) {
            return (this.f7322c0 && this.f7323d0 != null && this.f7321b0) || u(this.R) || u(this.f7323d0) || t(this.H0);
        }
        return true;
    }

    public final void o(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        i0.c.b(drawable, i0.c.a(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.W) {
            if (drawable.isStateful()) {
                drawable.setState(this.J0);
            }
            i0.b.h(drawable, this.Y);
            return;
        }
        Drawable drawable2 = this.R;
        if (drawable == drawable2 && this.U) {
            i0.b.h(drawable2, this.S);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean zOnLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (S()) {
            zOnLayoutDirectionChanged |= i0.c.b(this.R, i);
        }
        if (R()) {
            zOnLayoutDirectionChanged |= i0.c.b(this.f7323d0, i);
        }
        if (T()) {
            zOnLayoutDirectionChanged |= i0.c.b(this.W, i);
        }
        if (!zOnLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean zOnLevelChange = super.onLevelChange(i);
        if (S()) {
            zOnLevelChange |= this.R.setLevel(i);
        }
        if (R()) {
            zOnLevelChange |= this.f7323d0.setLevel(i);
        }
        if (T()) {
            zOnLevelChange |= this.W.setLevel(i);
        }
        if (zOnLevelChange) {
            invalidateSelf();
        }
        return zOnLevelChange;
    }

    @Override // b9.g, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.P0) {
            super.onStateChange(iArr);
        }
        return w(iArr, this.J0);
    }

    public final void p(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (S() || R()) {
            float f10 = this.f7327h0 + this.f7328i0;
            Drawable drawable = this.C0 ? this.f7323d0 : this.R;
            float intrinsicWidth = this.T;
            if (intrinsicWidth <= 0.0f && drawable != null) {
                intrinsicWidth = drawable.getIntrinsicWidth();
            }
            if (i0.c.a(this) == 0) {
                float f11 = rect.left + f10;
                rectF.left = f11;
                rectF.right = f11 + intrinsicWidth;
            } else {
                float f12 = rect.right - f10;
                rectF.right = f12;
                rectF.left = f12 - intrinsicWidth;
            }
            Drawable drawable2 = this.C0 ? this.f7323d0 : this.R;
            float fCeil = this.T;
            if (fCeil <= 0.0f && drawable2 != null) {
                fCeil = (float) Math.ceil(n.d(this.f7334p0, 24));
                if (drawable2.getIntrinsicHeight() <= fCeil) {
                    fCeil = drawable2.getIntrinsicHeight();
                }
            }
            float fExactCenterY = rect.exactCenterY() - (fCeil / 2.0f);
            rectF.top = fExactCenterY;
            rectF.bottom = fExactCenterY + fCeil;
        }
    }

    public final float q() {
        if (!S() && !R()) {
            return 0.0f;
        }
        float f10 = this.f7328i0;
        Drawable drawable = this.C0 ? this.f7323d0 : this.R;
        float intrinsicWidth = this.T;
        if (intrinsicWidth <= 0.0f && drawable != null) {
            intrinsicWidth = drawable.getIntrinsicWidth();
        }
        return intrinsicWidth + f10 + this.f7329j0;
    }

    public final float r() {
        if (T()) {
            return this.f7331m0 + this.Z + this.f7332n0;
        }
        return 0.0f;
    }

    public final float s() {
        return this.P0 ? this.f1454a.f1440a.e.a(g()) : this.L;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j4);
        }
    }

    @Override // b9.g, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.E0 != i) {
            this.E0 = i;
            invalidateSelf();
        }
    }

    @Override // b9.g, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.F0 != colorFilter) {
            this.F0 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // b9.g, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // b9.g, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.I0 != mode) {
            this.I0 = mode;
            ColorStateList colorStateList = this.H0;
            this.G0 = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z10) {
        boolean visible = super.setVisible(z4, z10);
        if (S()) {
            visible |= this.R.setVisible(z4, z10);
        }
        if (R()) {
            visible |= this.f7323d0.setVisible(z4, z10);
        }
        if (T()) {
            visible |= this.W.setVisible(z4, z10);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v() {
        d dVar = (d) this.L0.get();
        if (dVar != null) {
            Chip chip = (Chip) dVar;
            chip.b(chip.B);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    public final boolean w(int[] iArr, int[] iArr2) {
        boolean z4;
        boolean z10;
        ColorStateList colorStateList;
        boolean zOnStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.I;
        int iC = c(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f7341w0) : 0);
        boolean state = true;
        if (this.f7341w0 != iC) {
            this.f7341w0 = iC;
            zOnStateChange = true;
        }
        ColorStateList colorStateList3 = this.J;
        int iC2 = c(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.f7342x0) : 0);
        if (this.f7342x0 != iC2) {
            this.f7342x0 = iC2;
            zOnStateChange = true;
        }
        int iB = h0.a.b(iC2, iC);
        if ((this.f7343y0 != iB) | (this.f1454a.f1442c == null)) {
            this.f7343y0 = iB;
            k(ColorStateList.valueOf(iB));
            zOnStateChange = true;
        }
        ColorStateList colorStateList4 = this.M;
        int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.f7344z0) : 0;
        if (this.f7344z0 != colorForState) {
            this.f7344z0 = colorForState;
            zOnStateChange = true;
        }
        int colorForState2 = (this.K0 == null || !z8.a.c(iArr)) ? 0 : this.K0.getColorForState(iArr, this.A0);
        if (this.A0 != colorForState2) {
            this.A0 = colorForState2;
        }
        y8.d dVar = this.f7340v0.f9039g;
        int colorForState3 = (dVar == null || (colorStateList = dVar.f10629j) == null) ? 0 : colorStateList.getColorForState(iArr, this.B0);
        if (this.B0 != colorForState3) {
            this.B0 = colorForState3;
            zOnStateChange = true;
        }
        int[] state2 = getState();
        if (state2 != null) {
            int length = state2.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (state2[i] != 16842912) {
                        i++;
                    } else if (this.f7321b0) {
                        z4 = true;
                        break;
                    }
                }
                z4 = false;
                break;
            }
        } else {
            z4 = false;
            break;
        }
        if (this.C0 == z4 || this.f7323d0 == null) {
            z10 = false;
        } else {
            float fQ = q();
            this.C0 = z4;
            if (fQ != q()) {
                zOnStateChange = true;
                z10 = true;
            } else {
                z10 = false;
                zOnStateChange = true;
            }
        }
        ColorStateList colorStateList5 = this.H0;
        int colorForState4 = colorStateList5 != null ? colorStateList5.getColorForState(iArr, this.D0) : 0;
        if (this.D0 != colorForState4) {
            this.D0 = colorForState4;
            ColorStateList colorStateList6 = this.H0;
            PorterDuff.Mode mode = this.I0;
            this.G0 = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
        } else {
            state = zOnStateChange;
        }
        if (u(this.R)) {
            state |= this.R.setState(iArr);
        }
        if (u(this.f7323d0)) {
            state |= this.f7323d0.setState(iArr);
        }
        if (u(this.W)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            state |= this.W.setState(iArr3);
        }
        int[] iArr4 = z8.a.f11521a;
        if (u(this.X)) {
            state |= this.X.setState(iArr2);
        }
        if (state) {
            invalidateSelf();
        }
        if (z10) {
            v();
        }
        return state;
    }

    public final void x(boolean z4) {
        if (this.f7321b0 != z4) {
            this.f7321b0 = z4;
            float fQ = q();
            if (!z4 && this.C0) {
                this.C0 = false;
            }
            float fQ2 = q();
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void y(Drawable drawable) {
        if (this.f7323d0 != drawable) {
            float fQ = q();
            this.f7323d0 = drawable;
            float fQ2 = q();
            U(this.f7323d0);
            o(this.f7323d0);
            invalidateSelf();
            if (fQ != fQ2) {
                v();
            }
        }
    }

    public final void z(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.f7324e0 != colorStateList) {
            this.f7324e0 = colorStateList;
            if (this.f7322c0 && (drawable = this.f7323d0) != null && this.f7321b0) {
                i0.b.h(drawable, colorStateList);
            }
            onStateChange(getState());
        }
    }
}

package u8;

import android.animation.TimeInterpolator;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.Gravity;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import q0.d0;
import q0.e0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    public CharSequence A;
    public CharSequence B;
    public boolean C;
    public Bitmap E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public int K;
    public int[] L;
    public boolean M;
    public final TextPaint N;
    public final TextPaint O;
    public TimeInterpolator P;
    public TimeInterpolator Q;
    public float R;
    public float S;
    public float T;
    public ColorStateList U;
    public float V;
    public float W;
    public float X;
    public StaticLayout Y;
    public float Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f8991a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public float f8992a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8993b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public float f8994b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f8995c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CharSequence f8996c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f8997d;
    public final RectF e;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f9003j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f9004k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f9005l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f9006m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f9007n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f9008o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f9009p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f9010q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Typeface f9011r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Typeface f9012s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Typeface f9013t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Typeface f9014u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Typeface f9015v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Typeface f9016w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Typeface f9017x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public y8.a f9018y;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f9000f = 16;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9002g = 16;
    public float h = 15.0f;
    public float i = 15.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final TextUtils.TruncateAt f9019z = TextUtils.TruncateAt.END;
    public final boolean D = true;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final int f8998d0 = 1;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final float f8999e0 = 1.0f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public final int f9001f0 = 1;

    public c(TextInputLayout textInputLayout) {
        this.f8991a = textInputLayout;
        TextPaint textPaint = new TextPaint(129);
        this.N = textPaint;
        this.O = new TextPaint(textPaint);
        this.f8997d = new Rect();
        this.f8995c = new Rect();
        this.e = new RectF();
        g(textInputLayout.getContext().getResources().getConfiguration());
    }

    public static int a(float f10, int i, int i10) {
        float f11 = 1.0f - f10;
        return Color.argb(Math.round((Color.alpha(i10) * f10) + (Color.alpha(i) * f11)), Math.round((Color.red(i10) * f10) + (Color.red(i) * f11)), Math.round((Color.green(i10) * f10) + (Color.green(i) * f11)), Math.round((Color.blue(i10) * f10) + (Color.blue(i) * f11)));
    }

    public static float f(float f10, float f11, float f12, TimeInterpolator timeInterpolator) {
        if (timeInterpolator != null) {
            f12 = timeInterpolator.getInterpolation(f12);
        }
        return e8.a.a(f10, f11, f12);
    }

    public final boolean b(CharSequence charSequence) {
        WeakHashMap weakHashMap = v0.f7946a;
        boolean z4 = e0.d(this.f8991a) == 1;
        if (this.D) {
            return (z4 ? o0.g.f7450d : o0.g.f7449c).c(charSequence, charSequence.length());
        }
        return z4;
    }

    public final void c(float f10, boolean z4) {
        float f11;
        float f12;
        Typeface typeface;
        boolean z10;
        Layout.Alignment alignment;
        if (this.A == null) {
            return;
        }
        float fWidth = this.f8997d.width();
        float fWidth2 = this.f8995c.width();
        if (Math.abs(f10 - 1.0f) < 1.0E-5f) {
            f11 = this.i;
            f12 = this.V;
            this.F = 1.0f;
            typeface = this.f9011r;
        } else {
            float f13 = this.h;
            float f14 = this.W;
            Typeface typeface2 = this.f9014u;
            if (Math.abs(f10 - 0.0f) < 1.0E-5f) {
                this.F = 1.0f;
            } else {
                this.F = f(this.h, this.i, f10, this.Q) / this.h;
            }
            float f15 = this.i / this.h;
            fWidth = (z4 || fWidth2 * f15 <= fWidth) ? fWidth2 : Math.min(fWidth / f15, fWidth2);
            f11 = f13;
            f12 = f14;
            typeface = typeface2;
        }
        TextPaint textPaint = this.N;
        if (fWidth > 0.0f) {
            boolean z11 = this.G != f11;
            boolean z12 = this.X != f12;
            boolean z13 = this.f9017x != typeface;
            StaticLayout staticLayout = this.Y;
            boolean z14 = z11 || z12 || (staticLayout != null && (fWidth > ((float) staticLayout.getWidth()) ? 1 : (fWidth == ((float) staticLayout.getWidth()) ? 0 : -1)) != 0) || z13 || this.M;
            this.G = f11;
            this.X = f12;
            this.f9017x = typeface;
            this.M = false;
            textPaint.setLinearText(this.F != 1.0f);
            z10 = z14;
        } else {
            z10 = false;
        }
        if (this.B == null || z10) {
            textPaint.setTextSize(this.G);
            textPaint.setTypeface(this.f9017x);
            textPaint.setLetterSpacing(this.X);
            boolean zB = b(this.A);
            this.C = zB;
            int i = this.f8998d0;
            if (i <= 1 || zB) {
                i = 1;
            }
            if (i == 1) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                int absoluteGravity = Gravity.getAbsoluteGravity(this.f9000f, zB ? 1 : 0) & 7;
                if (absoluteGravity == 1) {
                    alignment = Layout.Alignment.ALIGN_CENTER;
                } else if (absoluteGravity != 5) {
                    alignment = this.C ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL;
                } else {
                    alignment = this.C ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_OPPOSITE;
                }
            }
            j jVar = new j(this.A, textPaint, (int) fWidth);
            jVar.f9033k = this.f9019z;
            jVar.f9032j = zB;
            jVar.e = alignment;
            jVar.i = false;
            jVar.f9030f = i;
            jVar.f9031g = this.f8999e0;
            jVar.h = this.f9001f0;
            StaticLayout staticLayoutA = jVar.a();
            staticLayoutA.getClass();
            this.Y = staticLayoutA;
            this.B = staticLayoutA.getText();
        }
    }

    public final float d() {
        float f10 = this.i;
        TextPaint textPaint = this.O;
        textPaint.setTextSize(f10);
        textPaint.setTypeface(this.f9011r);
        textPaint.setLetterSpacing(this.V);
        return -textPaint.ascent();
    }

    public final int e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return 0;
        }
        int[] iArr = this.L;
        return iArr != null ? colorStateList.getColorForState(iArr, 0) : colorStateList.getDefaultColor();
    }

    public final void g(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            Typeface typeface = this.f9013t;
            if (typeface != null) {
                this.f9012s = y8.e.a(configuration, typeface);
            }
            Typeface typeface2 = this.f9016w;
            if (typeface2 != null) {
                this.f9015v = y8.e.a(configuration, typeface2);
            }
            Typeface typeface3 = this.f9012s;
            if (typeface3 == null) {
                typeface3 = this.f9013t;
            }
            this.f9011r = typeface3;
            Typeface typeface4 = this.f9015v;
            if (typeface4 == null) {
                typeface4 = this.f9016w;
            }
            this.f9014u = typeface4;
            h(true);
        }
    }

    public final void h(boolean z4) {
        float fMeasureText;
        StaticLayout staticLayout;
        TextInputLayout textInputLayout = this.f8991a;
        if ((textInputLayout.getHeight() <= 0 || textInputLayout.getWidth() <= 0) && !z4) {
            return;
        }
        c(1.0f, z4);
        CharSequence charSequence = this.B;
        TextPaint textPaint = this.N;
        if (charSequence != null && (staticLayout = this.Y) != null) {
            this.f8996c0 = TextUtils.ellipsize(charSequence, textPaint, staticLayout.getWidth(), this.f9019z);
        }
        CharSequence charSequence2 = this.f8996c0;
        if (charSequence2 != null) {
            this.Z = textPaint.measureText(charSequence2, 0, charSequence2.length());
        } else {
            this.Z = 0.0f;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f9002g, this.C ? 1 : 0);
        int i = absoluteGravity & 112;
        Rect rect = this.f8997d;
        if (i == 48) {
            this.f9006m = rect.top;
        } else if (i != 80) {
            this.f9006m = rect.centerY() - ((textPaint.descent() - textPaint.ascent()) / 2.0f);
        } else {
            this.f9006m = textPaint.ascent() + rect.bottom;
        }
        int i10 = absoluteGravity & 8388615;
        if (i10 == 1) {
            this.f9008o = rect.centerX() - (this.Z / 2.0f);
        } else if (i10 != 5) {
            this.f9008o = rect.left;
        } else {
            this.f9008o = rect.right - this.Z;
        }
        c(0.0f, z4);
        StaticLayout staticLayout2 = this.Y;
        float height = staticLayout2 != null ? staticLayout2.getHeight() : 0.0f;
        StaticLayout staticLayout3 = this.Y;
        if (staticLayout3 == null || this.f8998d0 <= 1) {
            CharSequence charSequence3 = this.B;
            fMeasureText = charSequence3 != null ? textPaint.measureText(charSequence3, 0, charSequence3.length()) : 0.0f;
        } else {
            fMeasureText = staticLayout3.getWidth();
        }
        StaticLayout staticLayout4 = this.Y;
        if (staticLayout4 != null) {
            staticLayout4.getLineCount();
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(this.f9000f, this.C ? 1 : 0);
        int i11 = absoluteGravity2 & 112;
        Rect rect2 = this.f8995c;
        if (i11 == 48) {
            this.f9005l = rect2.top;
        } else if (i11 != 80) {
            this.f9005l = rect2.centerY() - (height / 2.0f);
        } else {
            this.f9005l = textPaint.descent() + (rect2.bottom - height);
        }
        int i12 = absoluteGravity2 & 8388615;
        if (i12 == 1) {
            this.f9007n = rect2.centerX() - (fMeasureText / 2.0f);
        } else if (i12 != 5) {
            this.f9007n = rect2.left;
        } else {
            this.f9007n = rect2.right - fMeasureText;
        }
        Bitmap bitmap = this.E;
        if (bitmap != null) {
            bitmap.recycle();
            this.E = null;
        }
        l(this.f8993b);
        float f10 = this.f8993b;
        float f11 = f(rect2.left, rect.left, f10, this.P);
        RectF rectF = this.e;
        rectF.left = f11;
        rectF.top = f(this.f9005l, this.f9006m, f10, this.P);
        rectF.right = f(rect2.right, rect.right, f10, this.P);
        rectF.bottom = f(rect2.bottom, rect.bottom, f10, this.P);
        this.f9009p = f(this.f9007n, this.f9008o, f10, this.P);
        this.f9010q = f(this.f9005l, this.f9006m, f10, this.P);
        l(f10);
        j1.a aVar = e8.a.f3492b;
        this.f8992a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, aVar);
        WeakHashMap weakHashMap = v0.f7946a;
        d0.k(textInputLayout);
        this.f8994b0 = f(1.0f, 0.0f, f10, aVar);
        d0.k(textInputLayout);
        ColorStateList colorStateList = this.f9004k;
        ColorStateList colorStateList2 = this.f9003j;
        if (colorStateList != colorStateList2) {
            textPaint.setColor(a(f10, e(colorStateList2), e(this.f9004k)));
        } else {
            textPaint.setColor(e(colorStateList));
        }
        float f12 = this.V;
        float f13 = this.W;
        if (f12 != f13) {
            textPaint.setLetterSpacing(f(f13, f12, f10, aVar));
        } else {
            textPaint.setLetterSpacing(f12);
        }
        this.H = e8.a.a(0.0f, this.R, f10);
        this.I = e8.a.a(0.0f, this.S, f10);
        this.J = e8.a.a(0.0f, this.T, f10);
        int iA = a(f10, 0, e(this.U));
        this.K = iA;
        textPaint.setShadowLayer(this.H, this.I, this.J, iA);
        d0.k(textInputLayout);
    }

    public final void i(ColorStateList colorStateList) {
        if (this.f9004k == colorStateList && this.f9003j == colorStateList) {
            return;
        }
        this.f9004k = colorStateList;
        this.f9003j = colorStateList;
        h(false);
    }

    public final boolean j(Typeface typeface) {
        y8.a aVar = this.f9018y;
        if (aVar != null) {
            aVar.f10618c = true;
        }
        if (this.f9013t == typeface) {
            return false;
        }
        this.f9013t = typeface;
        Typeface typefaceA = y8.e.a(this.f8991a.getContext().getResources().getConfiguration(), typeface);
        this.f9012s = typefaceA;
        if (typefaceA == null) {
            typefaceA = this.f9013t;
        }
        this.f9011r = typefaceA;
        return true;
    }

    public final void k(float f10) {
        if (f10 < 0.0f) {
            f10 = 0.0f;
        } else if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        if (f10 != this.f8993b) {
            this.f8993b = f10;
            Rect rect = this.f8995c;
            float f11 = rect.left;
            Rect rect2 = this.f8997d;
            float f12 = f(f11, rect2.left, f10, this.P);
            RectF rectF = this.e;
            rectF.left = f12;
            rectF.top = f(this.f9005l, this.f9006m, f10, this.P);
            rectF.right = f(rect.right, rect2.right, f10, this.P);
            rectF.bottom = f(rect.bottom, rect2.bottom, f10, this.P);
            this.f9009p = f(this.f9007n, this.f9008o, f10, this.P);
            this.f9010q = f(this.f9005l, this.f9006m, f10, this.P);
            l(f10);
            j1.a aVar = e8.a.f3492b;
            this.f8992a0 = 1.0f - f(0.0f, 1.0f, 1.0f - f10, aVar);
            WeakHashMap weakHashMap = v0.f7946a;
            TextInputLayout textInputLayout = this.f8991a;
            d0.k(textInputLayout);
            this.f8994b0 = f(1.0f, 0.0f, f10, aVar);
            d0.k(textInputLayout);
            ColorStateList colorStateList = this.f9004k;
            ColorStateList colorStateList2 = this.f9003j;
            TextPaint textPaint = this.N;
            if (colorStateList != colorStateList2) {
                textPaint.setColor(a(f10, e(colorStateList2), e(this.f9004k)));
            } else {
                textPaint.setColor(e(colorStateList));
            }
            float f13 = this.V;
            float f14 = this.W;
            if (f13 != f14) {
                textPaint.setLetterSpacing(f(f14, f13, f10, aVar));
            } else {
                textPaint.setLetterSpacing(f13);
            }
            this.H = e8.a.a(0.0f, this.R, f10);
            this.I = e8.a.a(0.0f, this.S, f10);
            this.J = e8.a.a(0.0f, this.T, f10);
            int iA = a(f10, 0, e(this.U));
            this.K = iA;
            textPaint.setShadowLayer(this.H, this.I, this.J, iA);
            d0.k(textInputLayout);
        }
    }

    public final void l(float f10) {
        c(f10, false);
        WeakHashMap weakHashMap = v0.f7946a;
        d0.k(this.f8991a);
    }

    public final void m(Typeface typeface) {
        boolean z4;
        boolean zJ = j(typeface);
        if (this.f9016w != typeface) {
            this.f9016w = typeface;
            Typeface typefaceA = y8.e.a(this.f8991a.getContext().getResources().getConfiguration(), typeface);
            this.f9015v = typefaceA;
            if (typefaceA == null) {
                typefaceA = this.f9016w;
            }
            this.f9014u = typefaceA;
            z4 = true;
        } else {
            z4 = false;
        }
        if (zJ || z4) {
            h(false);
        }
    }
}

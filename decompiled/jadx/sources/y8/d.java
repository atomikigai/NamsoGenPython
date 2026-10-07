package y8;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import g0.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f10623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10624b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10625c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10626d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f10627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10628g;
    public final boolean h;
    public final float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ColorStateList f10629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f10630k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f10631l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f10632m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Typeface f10633n;

    public d(Context context, int i) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, d8.a.I);
        this.f10630k = typedArrayObtainStyledAttributes.getDimension(0, 0.0f);
        this.f10629j = android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 3);
        android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 4);
        android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 5);
        this.f10625c = typedArrayObtainStyledAttributes.getInt(2, 0);
        this.f10626d = typedArrayObtainStyledAttributes.getInt(1, 1);
        int i10 = typedArrayObtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.f10631l = typedArrayObtainStyledAttributes.getResourceId(i10, 0);
        this.f10624b = typedArrayObtainStyledAttributes.getString(i10);
        typedArrayObtainStyledAttributes.getBoolean(14, false);
        this.f10623a = android.support.v4.media.session.a.h(context, typedArrayObtainStyledAttributes, 6);
        this.e = typedArrayObtainStyledAttributes.getFloat(7, 0.0f);
        this.f10627f = typedArrayObtainStyledAttributes.getFloat(8, 0.0f);
        this.f10628g = typedArrayObtainStyledAttributes.getFloat(9, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, d8.a.f3033y);
        this.h = typedArrayObtainStyledAttributes2.hasValue(0);
        this.i = typedArrayObtainStyledAttributes2.getFloat(0, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public final void a() {
        String str;
        Typeface typeface = this.f10633n;
        int i = this.f10625c;
        if (typeface == null && (str = this.f10624b) != null) {
            this.f10633n = Typeface.create(str, i);
        }
        if (this.f10633n == null) {
            int i10 = this.f10626d;
            if (i10 == 1) {
                this.f10633n = Typeface.SANS_SERIF;
            } else if (i10 == 2) {
                this.f10633n = Typeface.SERIF;
            } else if (i10 != 3) {
                this.f10633n = Typeface.DEFAULT;
            } else {
                this.f10633n = Typeface.MONOSPACE;
            }
            this.f10633n = Typeface.create(this.f10633n, i);
        }
    }

    public final Typeface b(Context context) {
        if (this.f10632m) {
            return this.f10633n;
        }
        if (!context.isRestricted()) {
            try {
                int i = this.f10631l;
                ThreadLocal threadLocal = n.f4149a;
                Typeface typefaceA = context.isRestricted() ? null : n.a(context, i, new TypedValue(), 0, null, false, false);
                this.f10633n = typefaceA;
                if (typefaceA != null) {
                    this.f10633n = Typeface.create(typefaceA, this.f10625c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.f10624b, e);
            }
        }
        a();
        this.f10632m = true;
        return this.f10633n;
    }

    public final void c(Context context, com.bumptech.glide.c cVar) {
        if (d(context)) {
            b(context);
        } else {
            a();
        }
        int i = this.f10631l;
        if (i == 0) {
            this.f10632m = true;
        }
        if (this.f10632m) {
            cVar.A(this.f10633n, true);
            return;
        }
        try {
            b bVar = new b(this, cVar);
            ThreadLocal threadLocal = n.f4149a;
            if (context.isRestricted()) {
                bVar.a(-4);
            } else {
                n.a(context, i, new TypedValue(), 0, bVar, false, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.f10632m = true;
            cVar.z(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.f10624b, e);
            this.f10632m = true;
            cVar.z(-3);
        }
    }

    public final boolean d(Context context) {
        Typeface typefaceA = null;
        int i = this.f10631l;
        if (i != 0) {
            ThreadLocal threadLocal = n.f4149a;
            if (!context.isRestricted()) {
                typefaceA = n.a(context, i, new TypedValue(), 0, null, false, true);
            }
        }
        return typefaceA != null;
    }

    public final void e(Context context, TextPaint textPaint, com.bumptech.glide.c cVar) {
        f(context, textPaint, cVar);
        ColorStateList colorStateList = this.f10629j;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        ColorStateList colorStateList2 = this.f10623a;
        textPaint.setShadowLayer(this.f10628g, this.e, this.f10627f, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public final void f(Context context, TextPaint textPaint, com.bumptech.glide.c cVar) {
        if (d(context)) {
            g(context, textPaint, b(context));
            return;
        }
        a();
        g(context, textPaint, this.f10633n);
        c(context, new c(this, context, textPaint, cVar));
    }

    public final void g(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface typefaceA = e.a(context.getResources().getConfiguration(), typeface);
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f10625c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f10630k);
        if (this.h) {
            textPaint.setLetterSpacing(this.i);
        }
    }
}

package l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f6449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bd.h f6450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public bd.h f6451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bd.h f6452d;
    public bd.h e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public bd.h f6453f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bd.h f6454g;
    public bd.h h;
    public final g1 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f6455j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f6456k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Typeface f6457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f6458m;

    public w0(TextView textView) {
        this.f6449a = textView;
        this.i = new g1(textView);
    }

    public static bd.h c(Context context, r rVar, int i) {
        ColorStateList colorStateListF;
        synchronized (rVar) {
            colorStateListF = rVar.f6405a.f(context, i);
        }
        if (colorStateListF == null) {
            return null;
        }
        bd.h hVar = new bd.h();
        hVar.f1595b = true;
        hVar.f1596c = colorStateListF;
        return hVar;
    }

    public static void h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            t0.a.a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            t0.a.a(editorInfo, text);
            return;
        }
        int i10 = editorInfo.initialSelStart;
        int i11 = editorInfo.initialSelEnd;
        int i12 = i10 > i11 ? i11 : i10;
        if (i10 <= i11) {
            i10 = i11;
        }
        int length = text.length();
        if (i12 < 0 || i10 > length) {
            t0.b.c(editorInfo, null, 0, 0);
            return;
        }
        int i13 = editorInfo.inputType & 4095;
        if (i13 == 129 || i13 == 225 || i13 == 18) {
            t0.b.c(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            t0.b.c(editorInfo, text, i12, i10);
            return;
        }
        int i14 = i10 - i12;
        int i15 = i14 > 1024 ? 0 : i14;
        int i16 = 2048 - i15;
        int iMin = Math.min(text.length() - i10, i16 - Math.min(i12, (int) (((double) i16) * 0.8d)));
        int iMin2 = Math.min(i12, i16 - iMin);
        int i17 = i12 - iMin2;
        if (Character.isLowSurrogate(text.charAt(i17))) {
            i17++;
            iMin2--;
        }
        if (Character.isHighSurrogate(text.charAt((i10 + iMin) - 1))) {
            iMin--;
        }
        int i18 = iMin2 + i15;
        t0.b.c(editorInfo, i15 != i14 ? TextUtils.concat(text.subSequence(i17, i17 + iMin2), text.subSequence(i10, iMin + i10)) : text.subSequence(i17, i18 + iMin + i17), iMin2, i18);
    }

    public final void a(Drawable drawable, bd.h hVar) {
        if (drawable == null || hVar == null) {
            return;
        }
        r.e(drawable, hVar, this.f6449a.getDrawableState());
    }

    public final void b() {
        bd.h hVar = this.f6450b;
        TextView textView = this.f6449a;
        if (hVar != null || this.f6451c != null || this.f6452d != null || this.e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            a(compoundDrawables[0], this.f6450b);
            a(compoundDrawables[1], this.f6451c);
            a(compoundDrawables[2], this.f6452d);
            a(compoundDrawables[3], this.e);
        }
        if (this.f6453f == null && this.f6454g == null) {
            return;
        }
        Drawable[] drawableArrA = s0.a(textView);
        a(drawableArrA[0], this.f6453f);
        a(drawableArrA[2], this.f6454g);
    }

    public final ColorStateList d() {
        bd.h hVar = this.h;
        if (hVar != null) {
            return (ColorStateList) hVar.f1596c;
        }
        return null;
    }

    public final PorterDuff.Mode e() {
        bd.h hVar = this.h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f1597d;
        }
        return null;
    }

    public final void f(AttributeSet attributeSet, int i) {
        boolean z4;
        boolean z10;
        String string;
        String string2;
        ColorStateList colorStateList;
        int resourceId;
        int i10;
        int resourceId2;
        TextView textView = this.f6449a;
        Context context = textView.getContext();
        r rVarA = r.a();
        int[] iArr = f.a.h;
        a2.l lVarG = a2.l.G(context, attributeSet, iArr, i);
        q0.v0.k(textView, textView.getContext(), iArr, attributeSet, (TypedArray) lVarG.f44c, i);
        TypedArray typedArray = (TypedArray) lVarG.f44c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f6450b = c(context, rVarA, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f6451c = c(context, rVarA, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f6452d = c(context, rVarA, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.e = c(context, rVarA, typedArray.getResourceId(2, 0));
        }
        int i11 = Build.VERSION.SDK_INT;
        if (typedArray.hasValue(5)) {
            this.f6453f = c(context, rVarA, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f6454g = c(context, rVarA, typedArray.getResourceId(6, 0));
        }
        lVarG.I();
        boolean z11 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = f.a.f3571w;
        if (resourceId3 != -1) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            a2.l lVar = new a2.l(context, typedArrayObtainStyledAttributes);
            if (z11 || !typedArrayObtainStyledAttributes.hasValue(14)) {
                z4 = false;
                z10 = false;
            } else {
                z10 = typedArrayObtainStyledAttributes.getBoolean(14, false);
                z4 = true;
            }
            n(context, lVar);
            string2 = typedArrayObtainStyledAttributes.hasValue(15) ? typedArrayObtainStyledAttributes.getString(15) : null;
            string = (i11 < 26 || !typedArrayObtainStyledAttributes.hasValue(13)) ? null : typedArrayObtainStyledAttributes.getString(13);
            lVar.I();
        } else {
            z4 = false;
            z10 = false;
            string = null;
            string2 = null;
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        a2.l lVar2 = new a2.l(context, typedArrayObtainStyledAttributes2);
        if (!z11 && typedArrayObtainStyledAttributes2.hasValue(14)) {
            z10 = typedArrayObtainStyledAttributes2.getBoolean(14, false);
            z4 = true;
        }
        boolean z12 = z10;
        if (typedArrayObtainStyledAttributes2.hasValue(15)) {
            string2 = typedArrayObtainStyledAttributes2.getString(15);
        }
        if (i11 >= 26 && typedArrayObtainStyledAttributes2.hasValue(13)) {
            string = typedArrayObtainStyledAttributes2.getString(13);
        }
        if (i11 >= 28 && typedArrayObtainStyledAttributes2.hasValue(0) && typedArrayObtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, lVar2);
        lVar2.I();
        if (!z11 && z4) {
            textView.setAllCaps(z12);
        }
        Typeface typeface = this.f6457l;
        if (typeface != null) {
            if (this.f6456k == -1) {
                textView.setTypeface(typeface, this.f6455j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (string != null) {
            u0.d(textView, string);
        }
        if (string2 != null) {
            t0.b(textView, t0.a(string2));
        }
        g1 g1Var = this.i;
        Context context2 = g1Var.f6278j;
        int[] iArr3 = f.a.i;
        TypedArray typedArrayObtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = g1Var.i;
        q0.v0.k(textView2, textView2.getContext(), iArr3, attributeSet, typedArrayObtainStyledAttributes3, i);
        if (typedArrayObtainStyledAttributes3.hasValue(5)) {
            g1Var.f6272a = typedArrayObtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = typedArrayObtainStyledAttributes3.hasValue(4) ? typedArrayObtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes3.hasValue(2) ? typedArrayObtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes3.hasValue(1) ? typedArrayObtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes3.hasValue(3) && (resourceId2 = typedArrayObtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = typedArrayObtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i12 = 0; i12 < length; i12++) {
                    iArr4[i12] = typedArrayObtainTypedArray.getDimensionPixelSize(i12, -1);
                }
                g1Var.f6276f = g1.b(iArr4);
                g1Var.i();
            }
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes3.recycle();
        if (!g1Var.j()) {
            g1Var.f6272a = 0;
        } else if (g1Var.f6272a == 1) {
            if (!g1Var.f6277g) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i10 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i10 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i10, 112.0f, displayMetrics);
                }
                float f10 = dimension3;
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                g1Var.k(dimension2, f10, dimension);
            }
            g1Var.h();
        }
        if (p3.f6396b && g1Var.f6272a != 0) {
            int[] iArr5 = g1Var.f6276f;
            if (iArr5.length > 0) {
                if (u0.a(textView) != -1.0f) {
                    u0.b(textView, Math.round(g1Var.f6275d), Math.round(g1Var.e), Math.round(g1Var.f6274c), 0);
                } else {
                    u0.c(textView, iArr5, 0);
                }
            }
        }
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = typedArrayObtainStyledAttributes4.getResourceId(8, -1);
        Drawable drawableB = resourceId4 != -1 ? rVarA.b(context, resourceId4) : null;
        int resourceId5 = typedArrayObtainStyledAttributes4.getResourceId(13, -1);
        Drawable drawableB2 = resourceId5 != -1 ? rVarA.b(context, resourceId5) : null;
        int resourceId6 = typedArrayObtainStyledAttributes4.getResourceId(9, -1);
        Drawable drawableB3 = resourceId6 != -1 ? rVarA.b(context, resourceId6) : null;
        int resourceId7 = typedArrayObtainStyledAttributes4.getResourceId(6, -1);
        Drawable drawableB4 = resourceId7 != -1 ? rVarA.b(context, resourceId7) : null;
        int resourceId8 = typedArrayObtainStyledAttributes4.getResourceId(10, -1);
        Drawable drawableB5 = resourceId8 != -1 ? rVarA.b(context, resourceId8) : null;
        int resourceId9 = typedArrayObtainStyledAttributes4.getResourceId(7, -1);
        Drawable drawableB6 = resourceId9 != -1 ? rVarA.b(context, resourceId9) : null;
        if (drawableB5 != null || drawableB6 != null) {
            Drawable[] drawableArrA = s0.a(textView);
            if (drawableB5 == null) {
                drawableB5 = drawableArrA[0];
            }
            if (drawableB2 == null) {
                drawableB2 = drawableArrA[1];
            }
            if (drawableB6 == null) {
                drawableB6 = drawableArrA[2];
            }
            if (drawableB4 == null) {
                drawableB4 = drawableArrA[3];
            }
            s0.b(textView, drawableB5, drawableB2, drawableB6, drawableB4);
        } else if (drawableB != null || drawableB2 != null || drawableB3 != null || drawableB4 != null) {
            Drawable[] drawableArrA2 = s0.a(textView);
            Drawable drawable = drawableArrA2[0];
            if (drawable == null && drawableArrA2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (drawableB == null) {
                    drawableB = compoundDrawables[0];
                }
                if (drawableB2 == null) {
                    drawableB2 = compoundDrawables[1];
                }
                if (drawableB3 == null) {
                    drawableB3 = compoundDrawables[2];
                }
                if (drawableB4 == null) {
                    drawableB4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(drawableB, drawableB2, drawableB3, drawableB4);
            } else {
                if (drawableB2 == null) {
                    drawableB2 = drawableArrA2[1];
                }
                Drawable drawable2 = drawableArrA2[2];
                if (drawableB4 == null) {
                    drawableB4 = drawableArrA2[3];
                }
                s0.b(textView, drawable, drawableB2, drawable2, drawableB4);
            }
        }
        if (typedArrayObtainStyledAttributes4.hasValue(11)) {
            if (!typedArrayObtainStyledAttributes4.hasValue(11) || (resourceId = typedArrayObtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = e0.k.getColorStateList(context, resourceId)) == null) {
                colorStateList = typedArrayObtainStyledAttributes4.getColorStateList(11);
            }
            u0.p.f(textView, colorStateList);
        }
        if (typedArrayObtainStyledAttributes4.hasValue(12)) {
            u0.p.g(textView, l1.b(typedArrayObtainStyledAttributes4.getInt(12, -1), null));
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes4.getDimensionPixelSize(15, -1);
        int dimensionPixelSize2 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(18, -1);
        int dimensionPixelSize3 = typedArrayObtainStyledAttributes4.getDimensionPixelSize(19, -1);
        typedArrayObtainStyledAttributes4.recycle();
        if (dimensionPixelSize != -1) {
            jd.d.G(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != -1) {
            jd.d.H(textView, dimensionPixelSize2);
        }
        if (dimensionPixelSize3 != -1) {
            qd.b.g(dimensionPixelSize3);
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (dimensionPixelSize3 != fontMetricsInt) {
                textView.setLineSpacing(dimensionPixelSize3 - fontMetricsInt, 1.0f);
            }
        }
    }

    public final void g(Context context, int i) {
        String string;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, f.a.f3571w);
        a2.l lVar = new a2.l(context, typedArrayObtainStyledAttributes);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(14);
        TextView textView = this.f6449a;
        if (zHasValue) {
            textView.setAllCaps(typedArrayObtainStyledAttributes.getBoolean(14, false));
        }
        int i10 = Build.VERSION.SDK_INT;
        if (typedArrayObtainStyledAttributes.hasValue(0) && typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        n(context, lVar);
        if (i10 >= 26 && typedArrayObtainStyledAttributes.hasValue(13) && (string = typedArrayObtainStyledAttributes.getString(13)) != null) {
            u0.d(textView, string);
        }
        lVar.I();
        Typeface typeface = this.f6457l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f6455j);
        }
    }

    public final void i(int i, int i10, int i11, int i12) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            DisplayMetrics displayMetrics = g1Var.f6278j.getResources().getDisplayMetrics();
            g1Var.k(TypedValue.applyDimension(i12, i, displayMetrics), TypedValue.applyDimension(i12, i10, displayMetrics), TypedValue.applyDimension(i12, i11, displayMetrics));
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void j(int[] iArr, int i) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = g1Var.f6278j.getResources().getDisplayMetrics();
                    for (int i10 = 0; i10 < length; i10++) {
                        iArrCopyOf[i10] = Math.round(TypedValue.applyDimension(i, iArr[i10], displayMetrics));
                    }
                }
                g1Var.f6276f = g1.b(iArrCopyOf);
                if (!g1Var.i()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                g1Var.f6277g = false;
            }
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void k(int i) {
        g1 g1Var = this.i;
        if (g1Var.j()) {
            if (i == 0) {
                g1Var.f6272a = 0;
                g1Var.f6275d = -1.0f;
                g1Var.e = -1.0f;
                g1Var.f6274c = -1.0f;
                g1Var.f6276f = new int[0];
                g1Var.f6273b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(da.v.f(i, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = g1Var.f6278j.getResources().getDisplayMetrics();
            g1Var.k(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (g1Var.h()) {
                g1Var.a();
            }
        }
    }

    public final void l(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new bd.h();
        }
        bd.h hVar = this.h;
        hVar.f1596c = colorStateList;
        hVar.f1595b = colorStateList != null;
        this.f6450b = hVar;
        this.f6451c = hVar;
        this.f6452d = hVar;
        this.e = hVar;
        this.f6453f = hVar;
        this.f6454g = hVar;
    }

    public final void m(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new bd.h();
        }
        bd.h hVar = this.h;
        hVar.f1597d = mode;
        hVar.f1594a = mode != null;
        this.f6450b = hVar;
        this.f6451c = hVar;
        this.f6452d = hVar;
        this.e = hVar;
        this.f6453f = hVar;
        this.f6454g = hVar;
    }

    public final void n(Context context, a2.l lVar) {
        String string;
        int i = this.f6455j;
        TypedArray typedArray = (TypedArray) lVar.f44c;
        this.f6455j = typedArray.getInt(2, i);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 28) {
            int i11 = typedArray.getInt(11, -1);
            this.f6456k = i11;
            if (i11 != -1) {
                this.f6455j &= 2;
            }
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f6458m = false;
                int i12 = typedArray.getInt(1, 1);
                if (i12 == 1) {
                    this.f6457l = Typeface.SANS_SERIF;
                    return;
                } else if (i12 == 2) {
                    this.f6457l = Typeface.SERIF;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f6457l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f6457l = null;
        int i13 = typedArray.hasValue(12) ? 12 : 10;
        int i14 = this.f6456k;
        int i15 = this.f6455j;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceW = lVar.w(i13, this.f6455j, new r0(this, i14, i15, new WeakReference(this.f6449a)));
                if (typefaceW != null) {
                    if (i10 < 28 || this.f6456k == -1) {
                        this.f6457l = typefaceW;
                    } else {
                        this.f6457l = v0.a(Typeface.create(typefaceW, 0), this.f6456k, (this.f6455j & 2) != 0);
                    }
                }
                this.f6458m = this.f6457l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f6457l != null || (string = typedArray.getString(i13)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f6456k == -1) {
            this.f6457l = Typeface.create(string, this.f6455j);
        } else {
            this.f6457l = v0.a(Typeface.create(string, 0), this.f6456k, (this.f6455j & 2) != 0);
        }
    }
}

package com.google.android.material.textfield;

import a2.l;
import a5.f;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.d;
import b9.e;
import b9.g;
import b9.i;
import b9.j;
import b9.k;
import com.google.android.material.internal.CheckableImageButton;
import f9.b;
import g9.a0;
import g9.b0;
import g9.c0;
import g9.p;
import g9.s;
import g9.t;
import g9.w;
import g9.y;
import g9.z;
import i9.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import l.l1;
import l.r;
import l.z0;
import m2.h;
import m2.q;
import o6.h0;
import q0.d0;
import q0.e0;
import q0.g0;
import q0.m0;
import q0.v0;
import u0.o;
import u8.c;
import u8.n;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] M0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A;
    public int A0;
    public int B;
    public int B0;
    public CharSequence C;
    public int C0;
    public boolean D;
    public int D0;
    public z0 E;
    public boolean E0;
    public ColorStateList F;
    public final c F0;
    public int G;
    public boolean G0;
    public h H;
    public boolean H0;
    public h I;
    public ValueAnimator I0;
    public ColorStateList J;
    public boolean J0;
    public ColorStateList K;
    public boolean K0;
    public ColorStateList L;
    public boolean L0;
    public ColorStateList M;
    public boolean N;
    public CharSequence O;
    public boolean P;
    public g Q;
    public g R;
    public StateListDrawable S;
    public boolean T;
    public g U;
    public g V;
    public k W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f2538a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f2539a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f2540b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final int f2541b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f2542c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public int f2543c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public EditText f2544d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public int f2545d0;
    public CharSequence e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public int f2546e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f2547f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f2548f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f2549g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f2550h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public int f2551i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Rect f2552j0;
    public final Rect k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final RectF f2553l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public Typeface f2554m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public ColorDrawable f2555n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public int f2556o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LinkedHashSet f2557p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ColorDrawable f2558q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f2559r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f2560r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f2561s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public Drawable f2562s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f2563t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public ColorStateList f2564t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final t f2565u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ColorStateList f2566u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f2567v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public int f2568v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f2569w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f2570w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f2571x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f2572x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b0 f2573y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public ColorStateList f2574y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public z0 f2575z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public int f2576z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, app.namso_gen.spacehowen.R.attr.textInputStyle, app.namso_gen.spacehowen.R.style.Widget_Design_TextInputLayout), attributeSet, app.namso_gen.spacehowen.R.attr.textInputStyle);
        this.f2547f = -1;
        this.f2559r = -1;
        this.f2561s = -1;
        this.f2563t = -1;
        this.f2565u = new t(this);
        this.f2573y = new f(27);
        this.f2552j0 = new Rect();
        this.k0 = new Rect();
        this.f2553l0 = new RectF();
        this.f2557p0 = new LinkedHashSet();
        c cVar = new c(this);
        this.F0 = cVar;
        this.L0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2538a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = e8.a.f3491a;
        cVar.Q = linearInterpolator;
        cVar.h(false);
        cVar.P = linearInterpolator;
        cVar.h(false);
        if (cVar.f9002g != 8388659) {
            cVar.f9002g = 8388659;
            cVar.h(false);
        }
        n.a(context2, attributeSet, app.namso_gen.spacehowen.R.attr.textInputStyle, app.namso_gen.spacehowen.R.style.Widget_Design_TextInputLayout);
        int[] iArr = d8.a.K;
        n.b(context2, attributeSet, iArr, app.namso_gen.spacehowen.R.attr.textInputStyle, app.namso_gen.spacehowen.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, app.namso_gen.spacehowen.R.attr.textInputStyle, app.namso_gen.spacehowen.R.style.Widget_Design_TextInputLayout);
        l lVar = new l(context2, typedArrayObtainStyledAttributes);
        y yVar = new y(this, lVar);
        this.f2540b = yVar;
        this.N = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.H0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.G0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.W = k.b(context2, attributeSet, app.namso_gen.spacehowen.R.attr.textInputStyle, app.namso_gen.spacehowen.R.style.Widget_Design_TextInputLayout).a();
        this.f2541b0 = context2.getResources().getDimensionPixelOffset(app.namso_gen.spacehowen.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2545d0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f2548f0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2549g0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2546e0 = this.f2548f0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        j jVarE = this.W.e();
        if (dimension >= 0.0f) {
            jVarE.e = new b9.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            jVarE.f1473f = new b9.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            jVarE.f1474g = new b9.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            jVarE.h = new b9.a(dimension4);
        }
        this.W = jVarE.a();
        ColorStateList colorStateListG = android.support.v4.media.session.a.g(context2, lVar, 7);
        if (colorStateListG != null) {
            int defaultColor = colorStateListG.getDefaultColor();
            this.f2576z0 = defaultColor;
            this.f2551i0 = defaultColor;
            if (colorStateListG.isStateful()) {
                this.A0 = colorStateListG.getColorForState(new int[]{-16842910}, -1);
                this.B0 = colorStateListG.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.C0 = colorStateListG.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.B0 = this.f2576z0;
                ColorStateList colorStateList = e0.k.getColorStateList(context2, app.namso_gen.spacehowen.R.color.mtrl_filled_background_color);
                this.A0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.C0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2551i0 = 0;
            this.f2576z0 = 0;
            this.A0 = 0;
            this.B0 = 0;
            this.C0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListT = lVar.t(1);
            this.f2566u0 = colorStateListT;
            this.f2564t0 = colorStateListT;
        }
        ColorStateList colorStateListG2 = android.support.v4.media.session.a.g(context2, lVar, 14);
        this.f2572x0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.f2568v0 = e0.k.getColor(context2, app.namso_gen.spacehowen.R.color.mtrl_textinput_default_box_stroke_color);
        this.D0 = e0.k.getColor(context2, app.namso_gen.spacehowen.R.color.mtrl_textinput_disabled_color);
        this.f2570w0 = e0.k.getColor(context2, app.namso_gen.spacehowen.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListG2 != null) {
            setBoxStrokeColorStateList(colorStateListG2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(android.support.v4.media.session.a.g(context2, lVar, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(49, 0));
        }
        this.L = lVar.t(24);
        this.M = lVar.t(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(56);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.B = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.A);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.B);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(lVar.t(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(lVar.t(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(50)) {
            setHintTextColor(lVar.t(50));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(lVar.t(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(lVar.t(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(lVar.t(58));
        }
        p pVar = new p(this, lVar);
        this.f2542c = pVar;
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        lVar.I();
        d0.s(this, 2);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26 && i10 >= 26) {
            m0.m(this, 1);
        }
        frameLayout.addView(yVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z12);
        setHelperTextEnabled(z10);
        setErrorEnabled(z4);
        setCounterEnabled(z11);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f2544d;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.Q;
        }
        int iQ = com.bumptech.glide.c.q(this.f2544d, app.namso_gen.spacehowen.R.attr.colorControlHighlight);
        int i = this.f2543c0;
        int[][] iArr = M0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.Q;
            int i10 = this.f2551i0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{com.bumptech.glide.c.x(0.1f, iQ, i10), i10}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.Q;
        TypedValue typedValueN = a.a.n(context, "TextInputLayout", app.namso_gen.spacehowen.R.attr.colorSurface);
        int i11 = typedValueN.resourceId;
        int color = i11 != 0 ? e0.k.getColor(context, i11) : typedValueN.data;
        g gVar3 = new g(gVar2.f1454a.f1440a);
        int iX = com.bumptech.glide.c.x(0.1f, iQ, color);
        gVar3.k(new ColorStateList(iArr, new int[]{iX, 0}));
        gVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iX, color});
        g gVar4 = new g(gVar2.f1454a.f1440a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.S == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.S = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.S.addState(new int[0], f(false));
        }
        return this.S;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.R == null) {
            this.R = f(true);
        }
        return this.R;
    }

    public static void k(ViewGroup viewGroup, boolean z4) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z4);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z4);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f2544d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f2544d = editText;
        int i = this.f2547f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f2561s);
        }
        int i10 = this.f2559r;
        if (i10 != -1) {
            setMaxEms(i10);
        } else {
            setMaxWidth(this.f2563t);
        }
        this.T = false;
        i();
        setTextInputAccessibilityDelegate(new a0(this));
        Typeface typeface = this.f2544d.getTypeface();
        c cVar = this.F0;
        cVar.m(typeface);
        float textSize = this.f2544d.getTextSize();
        if (cVar.h != textSize) {
            cVar.h = textSize;
            cVar.h(false);
        }
        int i11 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f2544d.getLetterSpacing();
        if (cVar.W != letterSpacing) {
            cVar.W = letterSpacing;
            cVar.h(false);
        }
        int gravity = this.f2544d.getGravity();
        int i12 = (gravity & (-113)) | 48;
        if (cVar.f9002g != i12) {
            cVar.f9002g = i12;
            cVar.h(false);
        }
        if (cVar.f9000f != gravity) {
            cVar.f9000f = gravity;
            cVar.h(false);
        }
        this.f2544d.addTextChangedListener(new z(this, 0));
        if (this.f2564t0 == null) {
            this.f2564t0 = this.f2544d.getHintTextColors();
        }
        if (this.N) {
            if (TextUtils.isEmpty(this.O)) {
                CharSequence hint = this.f2544d.getHint();
                this.e = hint;
                setHint(hint);
                this.f2544d.setHint((CharSequence) null);
            }
            this.P = true;
        }
        if (i11 >= 29) {
            p();
        }
        if (this.f2575z != null) {
            n(this.f2544d.getText());
        }
        r();
        this.f2565u.b();
        this.f2540b.bringToFront();
        p pVar = this.f2542c;
        pVar.bringToFront();
        Iterator it = this.f2557p0.iterator();
        while (it.hasNext()) {
            ((g9.n) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.O)) {
            return;
        }
        this.O = charSequence;
        c cVar = this.F0;
        if (charSequence == null || !TextUtils.equals(cVar.A, charSequence)) {
            cVar.A = charSequence;
            cVar.B = null;
            Bitmap bitmap = cVar.E;
            if (bitmap != null) {
                bitmap.recycle();
                cVar.E = null;
            }
            cVar.h(false);
        }
        if (this.E0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z4) {
        if (this.D == z4) {
            return;
        }
        if (z4) {
            z0 z0Var = this.E;
            if (z0Var != null) {
                this.f2538a.addView(z0Var);
                this.E.setVisibility(0);
            }
        } else {
            z0 z0Var2 = this.E;
            if (z0Var2 != null) {
                z0Var2.setVisibility(8);
            }
            this.E = null;
        }
        this.D = z4;
    }

    public final void a(float f10) {
        c cVar = this.F0;
        if (cVar.f8993b == f10) {
            return;
        }
        int i = 1;
        if (this.I0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.I0 = valueAnimator;
            valueAnimator.setInterpolator(android.support.v4.media.session.a.w(getContext(), app.namso_gen.spacehowen.R.attr.motionEasingEmphasizedInterpolator, e8.a.f3492b));
            this.I0.setDuration(android.support.v4.media.session.a.v(getContext(), app.namso_gen.spacehowen.R.attr.motionDurationMedium4, 167));
            this.I0.addUpdateListener(new b(this, i));
        }
        this.I0.setFloatValues(cVar.f8993b, f10);
        this.I0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2538a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i10;
        g gVar = this.Q;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f1454a.f1440a;
        k kVar2 = this.W;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f2543c0 == 2 && (i = this.f2546e0) > -1 && (i10 = this.f2550h0) != 0) {
            g gVar2 = this.Q;
            gVar2.f1454a.f1446j = i;
            gVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i10);
            b9.f fVar = gVar2.f1454a;
            if (fVar.f1443d != colorStateListValueOf) {
                fVar.f1443d = colorStateListValueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int iB = this.f2551i0;
        if (this.f2543c0 == 1) {
            iB = h0.a.b(this.f2551i0, com.bumptech.glide.c.p(getContext(), app.namso_gen.spacehowen.R.attr.colorSurface, 0));
        }
        this.f2551i0 = iB;
        this.Q.k(ColorStateList.valueOf(iB));
        g gVar3 = this.U;
        if (gVar3 != null && this.V != null) {
            if (this.f2546e0 > -1 && this.f2550h0 != 0) {
                gVar3.k(this.f2544d.isFocused() ? ColorStateList.valueOf(this.f2568v0) : ColorStateList.valueOf(this.f2550h0));
                this.V.k(ColorStateList.valueOf(this.f2550h0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float fD;
        if (!this.N) {
            return 0;
        }
        int i = this.f2543c0;
        c cVar = this.F0;
        if (i == 0) {
            fD = cVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            fD = cVar.d() / 2.0f;
        }
        return (int) fD;
    }

    public final h d() {
        h hVar = new h();
        hVar.f7001c = android.support.v4.media.session.a.v(getContext(), app.namso_gen.spacehowen.R.attr.motionDurationShort2, 87);
        hVar.f7002d = android.support.v4.media.session.a.w(getContext(), app.namso_gen.spacehowen.R.attr.motionEasingLinearInterpolator, e8.a.f3491a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f2544d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.e != null) {
            boolean z4 = this.P;
            this.P = false;
            CharSequence hint = editText.getHint();
            this.f2544d.setHint(this.e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f2544d.setHint(hint);
                this.P = z4;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2538a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i10 = 0; i10 < frameLayout.getChildCount(); i10++) {
            View childAt = frameLayout.getChildAt(i10);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i10);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.f2544d) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.K0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.K0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        super.draw(canvas);
        boolean z4 = this.N;
        c cVar = this.F0;
        if (z4) {
            TextPaint textPaint = cVar.N;
            RectF rectF = cVar.e;
            int iSave = canvas.save();
            if (cVar.B != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(cVar.G);
                float f10 = cVar.f9009p;
                float f11 = cVar.f9010q;
                float f12 = cVar.F;
                if (f12 != 1.0f) {
                    canvas.scale(f12, f12, f10, f11);
                }
                if (cVar.f8998d0 <= 1 || cVar.C) {
                    canvas.translate(f10, f11);
                    cVar.Y.draw(canvas);
                } else {
                    float lineStart = cVar.f9009p - cVar.Y.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas.translate(lineStart, f11);
                    float f13 = alpha;
                    textPaint.setAlpha((int) (cVar.f8994b0 * f13));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, com.bumptech.glide.c.c(cVar.K, textPaint.getAlpha()));
                    }
                    cVar.Y.draw(canvas);
                    textPaint.setAlpha((int) (cVar.f8992a0 * f13));
                    if (i >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, com.bumptech.glide.c.c(cVar.K, textPaint.getAlpha()));
                    }
                    int lineBaseline = cVar.Y.getLineBaseline(0);
                    CharSequence charSequence = cVar.f8996c0;
                    float f14 = lineBaseline;
                    canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f14, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                    }
                    String strTrim = cVar.f8996c0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas.drawText(str, 0, Math.min(cVar.Y.getLineEnd(0), str.length()), 0.0f, f14, (Paint) textPaint);
                    canvas = canvas;
                }
                canvas.restoreToCount(iSave);
            }
        }
        if (this.V == null || (gVar = this.U) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f2544d.isFocused()) {
            Rect bounds = this.V.getBounds();
            Rect bounds2 = this.U.getBounds();
            float f15 = cVar.f8993b;
            int iCenterX = bounds2.centerX();
            bounds.left = e8.a.c(f15, iCenterX, bounds2.left);
            bounds.right = e8.a.c(f15, iCenterX, bounds2.right);
            this.V.draw(canvas);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z4;
        ColorStateList colorStateList;
        if (this.J0) {
            return;
        }
        this.J0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        c cVar = this.F0;
        if (cVar != null) {
            cVar.L = drawableState;
            ColorStateList colorStateList2 = cVar.f9004k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = cVar.f9003j) == null || !colorStateList.isStateful())) {
                z4 = false;
            } else {
                cVar.h(false);
                z4 = true;
            }
        } else {
            z4 = false;
        }
        if (this.f2544d != null) {
            WeakHashMap weakHashMap = v0.f7946a;
            u(g0.c(this) && isEnabled(), false);
        }
        r();
        x();
        if (z4) {
            invalidate();
        }
        this.J0 = false;
    }

    public final boolean e() {
        return this.N && !TextUtils.isEmpty(this.O) && (this.Q instanceof g9.h);
    }

    public final g f(boolean z4) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(app.namso_gen.spacehowen.R.dimen.mtrl_shape_corner_size_small_component);
        float f10 = z4 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f2544d;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(app.namso_gen.spacehowen.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(app.namso_gen.spacehowen.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        int i = 0;
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        b9.a aVar = new b9.a(f10);
        b9.a aVar2 = new b9.a(f10);
        b9.a aVar3 = new b9.a(dimensionPixelOffset);
        b9.a aVar4 = new b9.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f1479a = iVar;
        kVar.f1480b = iVar2;
        kVar.f1481c = iVar3;
        kVar.f1482d = iVar4;
        kVar.e = aVar;
        kVar.f1483f = aVar2;
        kVar.f1484g = aVar4;
        kVar.h = aVar3;
        kVar.i = eVar;
        kVar.f1485j = eVar2;
        kVar.f1486k = eVar3;
        kVar.f1487l = eVar4;
        EditText editText2 = this.f2544d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.H;
            TypedValue typedValueN = a.a.n(context, g.class.getSimpleName(), app.namso_gen.spacehowen.R.attr.colorSurface);
            int i10 = typedValueN.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i10 != 0 ? e0.k.getColor(context, i10) : typedValueN.data);
        }
        g gVar = new g();
        gVar.i(context);
        gVar.k(dropDownBackgroundTintList);
        gVar.j(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        b9.f fVar = gVar.f1454a;
        if (fVar.f1445g == null) {
            fVar.f1445g = new Rect();
        }
        gVar.f1454a.f1445g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z4) {
        int compoundPaddingLeft;
        if (z4 || getPrefixText() == null) {
            compoundPaddingLeft = (!z4 || getSuffixText() == null) ? this.f2544d.getCompoundPaddingLeft() : this.f2542c.c();
        } else {
            compoundPaddingLeft = this.f2540b.a();
        }
        return compoundPaddingLeft + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2544d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f2543c0;
        if (i == 1 || i == 2) {
            return this.Q;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2551i0;
    }

    public int getBoxBackgroundMode() {
        return this.f2543c0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2545d0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean zF = n.f(this);
        RectF rectF = this.f2553l0;
        return zF ? this.W.h.a(rectF) : this.W.f1484g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean zF = n.f(this);
        RectF rectF = this.f2553l0;
        return zF ? this.W.f1484g.a(rectF) : this.W.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean zF = n.f(this);
        RectF rectF = this.f2553l0;
        return zF ? this.W.e.a(rectF) : this.W.f1483f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean zF = n.f(this);
        RectF rectF = this.f2553l0;
        return zF ? this.W.f1483f.a(rectF) : this.W.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2572x0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2574y0;
    }

    public int getBoxStrokeWidth() {
        return this.f2548f0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2549g0;
    }

    public int getCounterMaxLength() {
        return this.f2569w;
    }

    public CharSequence getCounterOverflowDescription() {
        z0 z0Var;
        if (this.f2567v && this.f2571x && (z0Var = this.f2575z) != null) {
            return z0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.K;
    }

    public ColorStateList getCounterTextColor() {
        return this.J;
    }

    public ColorStateList getCursorColor() {
        return this.L;
    }

    public ColorStateList getCursorErrorColor() {
        return this.M;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2564t0;
    }

    public EditText getEditText() {
        return this.f2544d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2542c.f4360r.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2542c.f4360r.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2542c.f4366x;
    }

    public int getEndIconMode() {
        return this.f2542c.f4362t;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2542c.f4367y;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2542c.f4360r;
    }

    public CharSequence getError() {
        t tVar = this.f2565u;
        if (tVar.f4391q) {
            return tVar.f4390p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f2565u.f4394t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f2565u.f4393s;
    }

    public int getErrorCurrentTextColors() {
        z0 z0Var = this.f2565u.f4392r;
        if (z0Var != null) {
            return z0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2542c.f4357c.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.f2565u;
        if (tVar.f4398x) {
            return tVar.f4397w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        z0 z0Var = this.f2565u.f4399y;
        if (z0Var != null) {
            return z0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.N) {
            return this.O;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.F0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        c cVar = this.F0;
        return cVar.e(cVar.f9004k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2566u0;
    }

    public b0 getLengthCounter() {
        return this.f2573y;
    }

    public int getMaxEms() {
        return this.f2559r;
    }

    public int getMaxWidth() {
        return this.f2563t;
    }

    public int getMinEms() {
        return this.f2547f;
    }

    public int getMinWidth() {
        return this.f2561s;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2542c.f4360r.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2542c.f4360r.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.D) {
            return this.C;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.G;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.F;
    }

    public CharSequence getPrefixText() {
        return this.f2540b.f4417c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2540b.f4416b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2540b.f4416b;
    }

    public k getShapeAppearanceModel() {
        return this.W;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2540b.f4418d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2540b.f4418d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2540b.f4420r;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2540b.f4421s;
    }

    public CharSequence getSuffixText() {
        return this.f2542c.A;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2542c.B.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2542c.B;
    }

    public Typeface getTypeface() {
        return this.f2554m0;
    }

    public final int h(int i, boolean z4) {
        int compoundPaddingRight;
        if (z4 || getSuffixText() == null) {
            compoundPaddingRight = (!z4 || getPrefixText() == null) ? this.f2544d.getCompoundPaddingRight() : this.f2540b.a();
        } else {
            compoundPaddingRight = this.f2542c.c();
        }
        return i - compoundPaddingRight;
    }

    public final void i() {
        int i = this.f2543c0;
        if (i == 0) {
            this.Q = null;
            this.U = null;
            this.V = null;
        } else if (i == 1) {
            this.Q = new g(this.W);
            this.U = new g();
            this.V = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(u3.b.c(new StringBuilder(), this.f2543c0, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            if (!this.N || (this.Q instanceof g9.h)) {
                this.Q = new g(this.W);
            } else {
                k kVar = this.W;
                int i10 = g9.h.J;
                if (kVar == null) {
                    kVar = new k();
                }
                g9.f fVar = new g9.f(kVar, new RectF());
                g9.g gVar = new g9.g(fVar);
                gVar.I = fVar;
                this.Q = gVar;
            }
            this.U = null;
            this.V = null;
        }
        s();
        x();
        if (this.f2543c0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2545d0 = getResources().getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (android.support.v4.media.session.a.m(getContext())) {
                this.f2545d0 = getResources().getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2544d != null && this.f2543c0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f2544d;
                WeakHashMap weakHashMap = v0.f7946a;
                e0.k(editText, e0.f(editText), getResources().getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.material_filled_edittext_font_2_0_padding_top), e0.e(this.f2544d), getResources().getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (android.support.v4.media.session.a.m(getContext())) {
                EditText editText2 = this.f2544d;
                WeakHashMap weakHashMap2 = v0.f7946a;
                e0.k(editText2, e0.f(editText2), getResources().getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.material_filled_edittext_font_1_3_padding_top), e0.e(this.f2544d), getResources().getDimensionPixelSize(app.namso_gen.spacehowen.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2543c0 != 0) {
            t();
        }
        EditText editText3 = this.f2544d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i11 = this.f2543c0;
                if (i11 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i11 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    public final void j() {
        float f10;
        float f11;
        float f12;
        RectF rectF;
        float f13;
        int i;
        float f14;
        int i10;
        if (e()) {
            int width = this.f2544d.getWidth();
            int gravity = this.f2544d.getGravity();
            c cVar = this.F0;
            boolean zB = cVar.b(cVar.A);
            cVar.C = zB;
            Rect rect = cVar.f8997d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zB) {
                        i10 = rect.left;
                        f12 = i10;
                    } else {
                        f10 = rect.right;
                        f11 = cVar.Z;
                    }
                } else if (zB) {
                    f10 = rect.right;
                    f11 = cVar.Z;
                } else {
                    i10 = rect.left;
                    f12 = i10;
                }
                float fMax = Math.max(f12, rect.left);
                rectF = this.f2553l0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f13 = (width / 2.0f) + (cVar.Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (cVar.C) {
                        f14 = cVar.Z;
                        f13 = f14 + fMax;
                    } else {
                        i = rect.right;
                        f13 = i;
                    }
                } else if (cVar.C) {
                    i = rect.right;
                    f13 = i;
                } else {
                    f14 = cVar.Z;
                    f13 = f14 + fMax;
                }
                rectF.right = Math.min(f13, rect.right);
                rectF.bottom = cVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f15 = rectF.left;
                float f16 = this.f2541b0;
                rectF.left = f15 - f16;
                rectF.right += f16;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2546e0);
                g9.h hVar = (g9.h) this.Q;
                hVar.getClass();
                hVar.o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f10 = width / 2.0f;
            f11 = cVar.Z / 2.0f;
            f12 = f10 - f11;
            float fMax2 = Math.max(f12, rect.left);
            rectF = this.f2553l0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f13 = (width / 2.0f) + (cVar.Z / 2.0f);
            } else {
                f13 = (width / 2.0f) + (cVar.Z / 2.0f);
            }
            rectF.right = Math.min(f13, rect.right);
            rectF.bottom = cVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(z0 z0Var, int i) {
        try {
            z0Var.setTextAppearance(i);
            if (z0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        z0Var.setTextAppearance(app.namso_gen.spacehowen.R.style.TextAppearance_AppCompat_Caption);
        z0Var.setTextColor(e0.k.getColor(getContext(), app.namso_gen.spacehowen.R.color.design_error));
    }

    public final boolean m() {
        t tVar = this.f2565u;
        return (tVar.f4389o != 1 || tVar.f4392r == null || TextUtils.isEmpty(tVar.f4390p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((f) this.f2573y).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z4 = this.f2571x;
        int i = this.f2569w;
        if (i == -1) {
            this.f2575z.setText(String.valueOf(length));
            this.f2575z.setContentDescription(null);
            this.f2571x = false;
        } else {
            this.f2571x = length > i;
            Context context = getContext();
            this.f2575z.setContentDescription(context.getString(this.f2571x ? app.namso_gen.spacehowen.R.string.character_counter_overflowed_content_description : app.namso_gen.spacehowen.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2569w)));
            if (z4 != this.f2571x) {
                o();
            }
            String str = o0.b.f7438b;
            Locale locale = Locale.getDefault();
            int i10 = o0.i.f7451a;
            o0.b bVar = o0.h.a(locale) == 1 ? o0.b.e : o0.b.f7440d;
            z0 z0Var = this.f2575z;
            String string = getContext().getString(app.namso_gen.spacehowen.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2569w));
            bVar.getClass();
            ea.e eVar = o0.g.f7447a;
            z0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.f2544d == null || z4 == this.f2571x) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        z0 z0Var = this.f2575z;
        if (z0Var != null) {
            l(z0Var, this.f2571x ? this.A : this.B);
            if (!this.f2571x && (colorStateList2 = this.J) != null) {
                this.f2575z.setTextColor(colorStateList2);
            }
            if (!this.f2571x || (colorStateList = this.K) == null) {
                return;
            }
            this.f2575z.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.F0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        p pVar = this.f2542c;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z4 = false;
        this.L0 = false;
        if (this.f2544d != null && this.f2544d.getMeasuredHeight() < (iMax = Math.max(pVar.getMeasuredHeight(), this.f2540b.getMeasuredHeight()))) {
            this.f2544d.setMinimumHeight(iMax);
            z4 = true;
        }
        boolean zQ = q();
        if (z4 || zQ) {
            this.f2544d.post(new d(this, 11));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z4, int i, int i10, int i11, int i12) {
        super.onLayout(z4, i, i10, i11, i12);
        EditText editText = this.f2544d;
        if (editText != null) {
            ThreadLocal threadLocal = u8.d.f9020a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2552j0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = u8.d.f9020a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            u8.d.a(this, editText, matrix);
            ThreadLocal threadLocal3 = u8.d.f9021b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.U;
            if (gVar != null) {
                int i13 = rect.bottom;
                gVar.setBounds(rect.left, i13 - this.f2548f0, rect.right, i13);
            }
            g gVar2 = this.V;
            if (gVar2 != null) {
                int i14 = rect.bottom;
                gVar2.setBounds(rect.left, i14 - this.f2549g0, rect.right, i14);
            }
            if (this.N) {
                float textSize = this.f2544d.getTextSize();
                c cVar = this.F0;
                if (cVar.h != textSize) {
                    cVar.h = textSize;
                    cVar.h(false);
                }
                int gravity = this.f2544d.getGravity();
                int i15 = (gravity & (-113)) | 48;
                if (cVar.f9002g != i15) {
                    cVar.f9002g = i15;
                    cVar.h(false);
                }
                if (cVar.f9000f != gravity) {
                    cVar.f9000f = gravity;
                    cVar.h(false);
                }
                if (this.f2544d == null) {
                    throw new IllegalStateException();
                }
                boolean zF = n.f(this);
                int i16 = rect.bottom;
                Rect rect2 = this.k0;
                rect2.bottom = i16;
                int i17 = this.f2543c0;
                if (i17 == 1) {
                    rect2.left = g(rect.left, zF);
                    rect2.top = rect.top + this.f2545d0;
                    rect2.right = h(rect.right, zF);
                } else if (i17 != 2) {
                    rect2.left = g(rect.left, zF);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, zF);
                } else {
                    rect2.left = this.f2544d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f2544d.getPaddingRight();
                }
                int i18 = rect2.left;
                int i19 = rect2.top;
                int i20 = rect2.right;
                int i21 = rect2.bottom;
                Rect rect3 = cVar.f8997d;
                if (rect3.left != i18 || rect3.top != i19 || rect3.right != i20 || rect3.bottom != i21) {
                    rect3.set(i18, i19, i20, i21);
                    cVar.M = true;
                }
                if (this.f2544d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = cVar.O;
                textPaint.setTextSize(cVar.h);
                textPaint.setTypeface(cVar.f9014u);
                textPaint.setLetterSpacing(cVar.W);
                float f10 = -textPaint.ascent();
                rect2.left = this.f2544d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2543c0 != 1 || this.f2544d.getMinLines() > 1) ? rect.top + this.f2544d.getCompoundPaddingTop() : (int) (rect.centerY() - (f10 / 2.0f));
                rect2.right = rect.right - this.f2544d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2543c0 != 1 || this.f2544d.getMinLines() > 1) ? rect.bottom - this.f2544d.getCompoundPaddingBottom() : (int) (rect2.top + f10);
                rect2.bottom = compoundPaddingBottom;
                int i22 = rect2.left;
                int i23 = rect2.top;
                int i24 = rect2.right;
                Rect rect4 = cVar.f8995c;
                if (rect4.left != i22 || rect4.top != i23 || rect4.right != i24 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i22, i23, i24, compoundPaddingBottom);
                    cVar.M = true;
                }
                cVar.h(false);
                if (!e() || this.E0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        EditText editText;
        super.onMeasure(i, i10);
        boolean z4 = this.L0;
        p pVar = this.f2542c;
        if (!z4) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.L0 = true;
        }
        if (this.E != null && (editText = this.f2544d) != null) {
            this.E.setGravity(editText.getGravity());
            this.E.setPadding(this.f2544d.getCompoundPaddingLeft(), this.f2544d.getCompoundPaddingTop(), this.f2544d.getCompoundPaddingRight(), this.f2544d.getCompoundPaddingBottom());
        }
        pVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c0 c0Var = (c0) parcelable;
        super.onRestoreInstanceState(c0Var.f10011a);
        setError(c0Var.f4325c);
        if (c0Var.f4326d) {
            post(new androidx.activity.i(this, 20));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z4 = i == 1;
        if (z4 != this.f2539a0) {
            b9.c cVar = this.W.e;
            RectF rectF = this.f2553l0;
            float fA = cVar.a(rectF);
            float fA2 = this.W.f1483f.a(rectF);
            float fA3 = this.W.h.a(rectF);
            float fA4 = this.W.f1484g.a(rectF);
            k kVar = this.W;
            com.bumptech.glide.c cVar2 = kVar.f1479a;
            com.bumptech.glide.c cVar3 = kVar.f1480b;
            com.bumptech.glide.c cVar4 = kVar.f1482d;
            com.bumptech.glide.c cVar5 = kVar.f1481c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            b9.a aVar = new b9.a(fA2);
            b9.a aVar2 = new b9.a(fA);
            b9.a aVar3 = new b9.a(fA4);
            b9.a aVar4 = new b9.a(fA3);
            k kVar2 = new k();
            kVar2.f1479a = cVar3;
            kVar2.f1480b = cVar2;
            kVar2.f1481c = cVar4;
            kVar2.f1482d = cVar5;
            kVar2.e = aVar;
            kVar2.f1483f = aVar2;
            kVar2.f1484g = aVar4;
            kVar2.h = aVar3;
            kVar2.i = eVar;
            kVar2.f1485j = eVar2;
            kVar2.f1486k = eVar3;
            kVar2.f1487l = eVar4;
            this.f2539a0 = z4;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        c0 c0Var = new c0(super.onSaveInstanceState());
        if (m()) {
            c0Var.f4325c = getError();
        }
        p pVar = this.f2542c;
        c0Var.f4326d = pVar.f4362t != 0 && pVar.f4360r.f2490d;
        return c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void p() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.L;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueL = a.a.l(context, app.namso_gen.spacehowen.R.attr.colorControlActivated);
            if (typedValueL != null) {
                int i = typedValueL.resourceId;
                if (i != 0) {
                    colorStateListValueOf = e0.k.getColorStateList(context, i);
                } else {
                    int i10 = typedValueL.data;
                    if (i10 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i10);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.f2544d;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.f2544d.getTextCursorDrawable().mutate();
        if ((m() || (this.f2575z != null && this.f2571x)) && (colorStateList = this.M) != null) {
            colorStateListValueOf = colorStateList;
        }
        i0.b.h(drawableMutate, colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean q() {
        boolean z4;
        if (this.f2544d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z10 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            y yVar = this.f2540b;
            if (yVar.getMeasuredWidth() > 0) {
                int measuredWidth = yVar.getMeasuredWidth() - this.f2544d.getPaddingLeft();
                if (this.f2555n0 == null || this.f2556o0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.f2555n0 = colorDrawable;
                    this.f2556o0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] drawableArrA = o.a(this.f2544d);
                Drawable drawable = drawableArrA[0];
                ColorDrawable colorDrawable2 = this.f2555n0;
                if (drawable != colorDrawable2) {
                    o.e(this.f2544d, colorDrawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                    z4 = true;
                } else {
                    z4 = false;
                }
            } else if (this.f2555n0 != null) {
                Drawable[] drawableArrA2 = o.a(this.f2544d);
                o.e(this.f2544d, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
                this.f2555n0 = null;
                z4 = true;
            } else {
                z4 = false;
            }
        } else if (this.f2555n0 != null) {
            Drawable[] drawableArrA3 = o.a(this.f2544d);
            o.e(this.f2544d, null, drawableArrA3[1], drawableArrA3[2], drawableArrA3[3]);
            this.f2555n0 = null;
            z4 = true;
        } else {
            z4 = false;
        }
        p pVar = this.f2542c;
        if ((pVar.e() || ((pVar.f4362t != 0 && pVar.d()) || pVar.A != null)) && pVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = pVar.B.getMeasuredWidth() - this.f2544d.getPaddingRight();
            if (pVar.e()) {
                checkableImageButton = pVar.f4357c;
            } else if (pVar.f4362t != 0 && pVar.d()) {
                checkableImageButton = pVar.f4360r;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = q0.n.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] drawableArrA4 = o.a(this.f2544d);
            ColorDrawable colorDrawable3 = this.f2558q0;
            if (colorDrawable3 != null && this.f2560r0 != measuredWidth2) {
                this.f2560r0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                o.e(this.f2544d, drawableArrA4[0], drawableArrA4[1], this.f2558q0, drawableArrA4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.f2558q0 = colorDrawable4;
                this.f2560r0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = drawableArrA4[2];
            ColorDrawable colorDrawable5 = this.f2558q0;
            if (drawable2 != colorDrawable5) {
                this.f2562s0 = drawable2;
                o.e(this.f2544d, drawableArrA4[0], drawableArrA4[1], colorDrawable5, drawableArrA4[3]);
                return true;
            }
        } else if (this.f2558q0 != null) {
            Drawable[] drawableArrA5 = o.a(this.f2544d);
            if (drawableArrA5[2] == this.f2558q0) {
                o.e(this.f2544d, drawableArrA5[0], drawableArrA5[1], this.f2562s0, drawableArrA5[3]);
            } else {
                z10 = z4;
            }
            this.f2558q0 = null;
            return z10;
        }
        return z4;
    }

    public final void r() {
        Drawable background;
        z0 z0Var;
        EditText editText = this.f2544d;
        if (editText == null || this.f2543c0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = l1.f6340a;
        Drawable drawableMutate = background.mutate();
        if (m()) {
            drawableMutate.setColorFilter(r.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2571x && (z0Var = this.f2575z) != null) {
            drawableMutate.setColorFilter(r.c(z0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.f2544d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f2544d;
        if (editText == null || this.Q == null) {
            return;
        }
        if ((this.T || editText.getBackground() == null) && this.f2543c0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f2544d;
            WeakHashMap weakHashMap = v0.f7946a;
            d0.q(editText2, editTextBoxBackground);
            this.T = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2551i0 != i) {
            this.f2551i0 = i;
            this.f2576z0 = i;
            this.B0 = i;
            this.C0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(e0.k.getColor(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2576z0 = defaultColor;
        this.f2551i0 = defaultColor;
        this.A0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.B0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.C0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f2543c0) {
            return;
        }
        this.f2543c0 = i;
        if (this.f2544d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f2545d0 = i;
    }

    public void setBoxCornerFamily(int i) {
        j jVarE = this.W.e();
        b9.c cVar = this.W.e;
        jVarE.f1469a = com.bumptech.glide.d.f(i);
        jVarE.e = cVar;
        b9.c cVar2 = this.W.f1483f;
        jVarE.f1470b = com.bumptech.glide.d.f(i);
        jVarE.f1473f = cVar2;
        b9.c cVar3 = this.W.h;
        jVarE.f1472d = com.bumptech.glide.d.f(i);
        jVarE.h = cVar3;
        b9.c cVar4 = this.W.f1484g;
        jVarE.f1471c = com.bumptech.glide.d.f(i);
        jVarE.f1474g = cVar4;
        this.W = jVarE.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2572x0 != i) {
            this.f2572x0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2568v0 = colorStateList.getDefaultColor();
            this.D0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2570w0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2572x0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2572x0 != colorStateList.getDefaultColor()) {
            this.f2572x0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2574y0 != colorStateList) {
            this.f2574y0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f2548f0 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f2549g0 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z4) {
        if (this.f2567v != z4) {
            t tVar = this.f2565u;
            if (z4) {
                z0 z0Var = new z0(getContext(), null);
                this.f2575z = z0Var;
                z0Var.setId(app.namso_gen.spacehowen.R.id.textinput_counter);
                Typeface typeface = this.f2554m0;
                if (typeface != null) {
                    this.f2575z.setTypeface(typeface);
                }
                this.f2575z.setMaxLines(1);
                tVar.a(this.f2575z, 2);
                q0.n.h((ViewGroup.MarginLayoutParams) this.f2575z.getLayoutParams(), getResources().getDimensionPixelOffset(app.namso_gen.spacehowen.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2575z != null) {
                    EditText editText = this.f2544d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f2575z, 2);
                this.f2575z = null;
            }
            this.f2567v = z4;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2569w != i) {
            if (i > 0) {
                this.f2569w = i;
            } else {
                this.f2569w = -1;
            }
            if (!this.f2567v || this.f2575z == null) {
                return;
            }
            EditText editText = this.f2544d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.A != i) {
            this.A = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.B != i) {
            this.B = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.J != colorStateList) {
            this.J = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.L != colorStateList) {
            this.L = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.M != colorStateList) {
            this.M = colorStateList;
            if (m() || (this.f2575z != null && this.f2571x)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2564t0 = colorStateList;
        this.f2566u0 = colorStateList;
        if (this.f2544d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z4) {
        k(this, z4);
        super.setEnabled(z4);
    }

    public void setEndIconActivated(boolean z4) {
        this.f2542c.f4360r.setActivated(z4);
    }

    public void setEndIconCheckable(boolean z4) {
        this.f2542c.f4360r.setCheckable(z4);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.f2542c;
        CharSequence text = i != 0 ? pVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pVar.f4360r;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.f2542c;
        Drawable drawableR = i != 0 ? com.bumptech.glide.d.r(pVar.getContext(), i) : null;
        TextInputLayout textInputLayout = pVar.f4355a;
        CheckableImageButton checkableImageButton = pVar.f4360r;
        checkableImageButton.setImageDrawable(drawableR);
        if (drawableR != null) {
            p3.a.b(textInputLayout, checkableImageButton, pVar.f4364v, pVar.f4365w);
            p3.a.p(textInputLayout, checkableImageButton, pVar.f4364v);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.f2542c;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.f4366x) {
            pVar.f4366x = i;
            CheckableImageButton checkableImageButton = pVar.f4360r;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.f4357c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f2542c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2542c;
        CheckableImageButton checkableImageButton = pVar.f4360r;
        View.OnLongClickListener onLongClickListener = pVar.f4368z;
        checkableImageButton.setOnClickListener(onClickListener);
        p3.a.r(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2542c;
        pVar.f4368z = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f4360r;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p3.a.r(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f2542c;
        pVar.f4367y = scaleType;
        pVar.f4360r.setScaleType(scaleType);
        pVar.f4357c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2542c;
        if (pVar.f4364v != colorStateList) {
            pVar.f4364v = colorStateList;
            p3.a.b(pVar.f4355a, pVar.f4360r, colorStateList, pVar.f4365w);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2542c;
        if (pVar.f4365w != mode) {
            pVar.f4365w = mode;
            p3.a.b(pVar.f4355a, pVar.f4360r, pVar.f4364v, mode);
        }
    }

    public void setEndIconVisible(boolean z4) {
        this.f2542c.h(z4);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.f2565u;
        if (!tVar.f4391q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            tVar.f();
            return;
        }
        tVar.c();
        tVar.f4390p = charSequence;
        tVar.f4392r.setText(charSequence);
        int i = tVar.f4388n;
        if (i != 1) {
            tVar.f4389o = 1;
        }
        tVar.i(i, tVar.f4389o, tVar.h(tVar.f4392r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        t tVar = this.f2565u;
        tVar.f4394t = i;
        z0 z0Var = tVar.f4392r;
        if (z0Var != null) {
            WeakHashMap weakHashMap = v0.f7946a;
            g0.f(z0Var, i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.f2565u;
        tVar.f4393s = charSequence;
        z0 z0Var = tVar.f4392r;
        if (z0Var != null) {
            z0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z4) {
        t tVar = this.f2565u;
        TextInputLayout textInputLayout = tVar.h;
        if (tVar.f4391q == z4) {
            return;
        }
        tVar.c();
        if (z4) {
            z0 z0Var = new z0(tVar.f4383g, null);
            tVar.f4392r = z0Var;
            z0Var.setId(app.namso_gen.spacehowen.R.id.textinput_error);
            tVar.f4392r.setTextAlignment(5);
            Typeface typeface = tVar.B;
            if (typeface != null) {
                tVar.f4392r.setTypeface(typeface);
            }
            int i = tVar.f4395u;
            tVar.f4395u = i;
            z0 z0Var2 = tVar.f4392r;
            if (z0Var2 != null) {
                tVar.h.l(z0Var2, i);
            }
            ColorStateList colorStateList = tVar.f4396v;
            tVar.f4396v = colorStateList;
            z0 z0Var3 = tVar.f4392r;
            if (z0Var3 != null && colorStateList != null) {
                z0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f4393s;
            tVar.f4393s = charSequence;
            z0 z0Var4 = tVar.f4392r;
            if (z0Var4 != null) {
                z0Var4.setContentDescription(charSequence);
            }
            int i10 = tVar.f4394t;
            tVar.f4394t = i10;
            z0 z0Var5 = tVar.f4392r;
            if (z0Var5 != null) {
                WeakHashMap weakHashMap = v0.f7946a;
                g0.f(z0Var5, i10);
            }
            tVar.f4392r.setVisibility(4);
            tVar.a(tVar.f4392r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f4392r, 0);
            tVar.f4392r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f4391q = z4;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.f2542c;
        pVar.i(i != 0 ? com.bumptech.glide.d.r(pVar.getContext(), i) : null);
        p3.a.p(pVar.f4355a, pVar.f4357c, pVar.f4358d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2542c;
        CheckableImageButton checkableImageButton = pVar.f4357c;
        View.OnLongClickListener onLongClickListener = pVar.f4359f;
        checkableImageButton.setOnClickListener(onClickListener);
        p3.a.r(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2542c;
        pVar.f4359f = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f4357c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p3.a.r(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2542c;
        if (pVar.f4358d != colorStateList) {
            pVar.f4358d = colorStateList;
            p3.a.b(pVar.f4355a, pVar.f4357c, colorStateList, pVar.e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2542c;
        if (pVar.e != mode) {
            pVar.e = mode;
            p3.a.b(pVar.f4355a, pVar.f4357c, pVar.f4358d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        t tVar = this.f2565u;
        tVar.f4395u = i;
        z0 z0Var = tVar.f4392r;
        if (z0Var != null) {
            tVar.h.l(z0Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.f2565u;
        tVar.f4396v = colorStateList;
        z0 z0Var = tVar.f4392r;
        if (z0Var == null || colorStateList == null) {
            return;
        }
        z0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z4) {
        if (this.G0 != z4) {
            this.G0 = z4;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.f2565u;
        if (zIsEmpty) {
            if (tVar.f4398x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f4398x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f4397w = charSequence;
        tVar.f4399y.setText(charSequence);
        int i = tVar.f4388n;
        if (i != 2) {
            tVar.f4389o = 2;
        }
        tVar.i(i, tVar.f4389o, tVar.h(tVar.f4399y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.f2565u;
        tVar.A = colorStateList;
        z0 z0Var = tVar.f4399y;
        if (z0Var == null || colorStateList == null) {
            return;
        }
        z0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z4) {
        t tVar = this.f2565u;
        TextInputLayout textInputLayout = tVar.h;
        if (tVar.f4398x == z4) {
            return;
        }
        tVar.c();
        if (z4) {
            z0 z0Var = new z0(tVar.f4383g, null);
            tVar.f4399y = z0Var;
            z0Var.setId(app.namso_gen.spacehowen.R.id.textinput_helper_text);
            tVar.f4399y.setTextAlignment(5);
            Typeface typeface = tVar.B;
            if (typeface != null) {
                tVar.f4399y.setTypeface(typeface);
            }
            tVar.f4399y.setVisibility(4);
            g0.f(tVar.f4399y, 1);
            int i = tVar.f4400z;
            tVar.f4400z = i;
            z0 z0Var2 = tVar.f4399y;
            if (z0Var2 != null) {
                z0Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = tVar.A;
            tVar.A = colorStateList;
            z0 z0Var3 = tVar.f4399y;
            if (z0Var3 != null && colorStateList != null) {
                z0Var3.setTextColor(colorStateList);
            }
            tVar.a(tVar.f4399y, 1);
            tVar.f4399y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i10 = tVar.f4388n;
            if (i10 == 2) {
                tVar.f4389o = 0;
            }
            tVar.i(i10, tVar.f4389o, tVar.h(tVar.f4399y, ""));
            tVar.g(tVar.f4399y, 1);
            tVar.f4399y = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f4398x = z4;
    }

    public void setHelperTextTextAppearance(int i) {
        t tVar = this.f2565u;
        tVar.f4400z = i;
        z0 z0Var = tVar.f4399y;
        if (z0Var != null) {
            z0Var.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.N) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z4) {
        this.H0 = z4;
    }

    public void setHintEnabled(boolean z4) {
        if (z4 != this.N) {
            this.N = z4;
            if (z4) {
                CharSequence hint = this.f2544d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.O)) {
                        setHint(hint);
                    }
                    this.f2544d.setHint((CharSequence) null);
                }
                this.P = true;
            } else {
                this.P = false;
                if (!TextUtils.isEmpty(this.O) && TextUtils.isEmpty(this.f2544d.getHint())) {
                    this.f2544d.setHint(this.O);
                }
                setHintInternal(null);
            }
            if (this.f2544d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        c cVar = this.F0;
        TextInputLayout textInputLayout = cVar.f8991a;
        y8.d dVar = new y8.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f10629j;
        if (colorStateList != null) {
            cVar.f9004k = colorStateList;
        }
        float f10 = dVar.f10630k;
        if (f10 != 0.0f) {
            cVar.i = f10;
        }
        ColorStateList colorStateList2 = dVar.f10623a;
        if (colorStateList2 != null) {
            cVar.U = colorStateList2;
        }
        cVar.S = dVar.e;
        cVar.T = dVar.f10627f;
        cVar.R = dVar.f10628g;
        cVar.V = dVar.i;
        y8.a aVar = cVar.f9018y;
        if (aVar != null) {
            aVar.f10618c = true;
        }
        h0 h0Var = new h0(cVar);
        dVar.a();
        cVar.f9018y = new y8.a(h0Var, dVar.f10633n);
        dVar.c(textInputLayout.getContext(), cVar.f9018y);
        cVar.h(false);
        this.f2566u0 = cVar.f9004k;
        if (this.f2544d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2566u0 != colorStateList) {
            if (this.f2564t0 == null) {
                c cVar = this.F0;
                if (cVar.f9004k != colorStateList) {
                    cVar.f9004k = colorStateList;
                    cVar.h(false);
                }
            }
            this.f2566u0 = colorStateList;
            if (this.f2544d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(b0 b0Var) {
        this.f2573y = b0Var;
    }

    public void setMaxEms(int i) {
        this.f2559r = i;
        EditText editText = this.f2544d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f2563t = i;
        EditText editText = this.f2544d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f2547f = i;
        EditText editText = this.f2544d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f2561s = i;
        EditText editText = this.f2544d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        p pVar = this.f2542c;
        pVar.f4360r.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.f2542c;
        pVar.f4360r.setImageDrawable(i != 0 ? com.bumptech.glide.d.r(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z4) {
        p pVar = this.f2542c;
        if (z4 && pVar.f4362t != 1) {
            pVar.g(1);
        } else if (z4) {
            pVar.getClass();
        } else {
            pVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.f2542c;
        pVar.f4364v = colorStateList;
        p3.a.b(pVar.f4355a, pVar.f4360r, colorStateList, pVar.f4365w);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2542c;
        pVar.f4365w = mode;
        p3.a.b(pVar.f4355a, pVar.f4360r, pVar.f4364v, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.E == null) {
            z0 z0Var = new z0(getContext(), null);
            this.E = z0Var;
            z0Var.setId(app.namso_gen.spacehowen.R.id.textinput_placeholder);
            d0.s(this.E, 2);
            h hVarD = d();
            this.H = hVarD;
            hVarD.f7000b = 67L;
            this.I = d();
            setPlaceholderTextAppearance(this.G);
            setPlaceholderTextColor(this.F);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.D) {
                setPlaceholderTextEnabled(true);
            }
            this.C = charSequence;
        }
        EditText editText = this.f2544d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.G = i;
        z0 z0Var = this.E;
        if (z0Var != null) {
            z0Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            z0 z0Var = this.E;
            if (z0Var == null || colorStateList == null) {
                return;
            }
            z0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y yVar = this.f2540b;
        yVar.getClass();
        yVar.f4417c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.f4416b.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2540b.f4416b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2540b.f4416b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.Q;
        if (gVar == null || gVar.f1454a.f1440a == kVar) {
            return;
        }
        this.W = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z4) {
        this.f2540b.f4418d.setCheckable(z4);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? com.bumptech.glide.d.r(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        y yVar = this.f2540b;
        if (i < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != yVar.f4420r) {
            yVar.f4420r = i;
            CheckableImageButton checkableImageButton = yVar.f4418d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y yVar = this.f2540b;
        CheckableImageButton checkableImageButton = yVar.f4418d;
        View.OnLongClickListener onLongClickListener = yVar.f4422t;
        checkableImageButton.setOnClickListener(onClickListener);
        p3.a.r(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y yVar = this.f2540b;
        yVar.f4422t = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.f4418d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p3.a.r(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y yVar = this.f2540b;
        yVar.f4421s = scaleType;
        yVar.f4418d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y yVar = this.f2540b;
        if (yVar.e != colorStateList) {
            yVar.e = colorStateList;
            p3.a.b(yVar.f4415a, yVar.f4418d, colorStateList, yVar.f4419f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y yVar = this.f2540b;
        if (yVar.f4419f != mode) {
            yVar.f4419f = mode;
            p3.a.b(yVar.f4415a, yVar.f4418d, yVar.e, mode);
        }
    }

    public void setStartIconVisible(boolean z4) {
        this.f2540b.c(z4);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.f2542c;
        pVar.getClass();
        pVar.A = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.B.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2542c.B.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2542c.B.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(a0 a0Var) {
        EditText editText = this.f2544d;
        if (editText != null) {
            v0.l(editText, a0Var);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2554m0) {
            this.f2554m0 = typeface;
            this.F0.m(typeface);
            t tVar = this.f2565u;
            if (typeface != tVar.B) {
                tVar.B = typeface;
                z0 z0Var = tVar.f4392r;
                if (z0Var != null) {
                    z0Var.setTypeface(typeface);
                }
                z0 z0Var2 = tVar.f4399y;
                if (z0Var2 != null) {
                    z0Var2.setTypeface(typeface);
                }
            }
            z0 z0Var3 = this.f2575z;
            if (z0Var3 != null) {
                z0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2543c0 != 1) {
            FrameLayout frameLayout = this.f2538a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iC = c();
            if (iC != layoutParams.topMargin) {
                layoutParams.topMargin = iC;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z4, boolean z10) {
        ColorStateList colorStateList;
        z0 z0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.f2544d;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2544d;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2564t0;
        c cVar = this.F0;
        if (colorStateList2 != null) {
            cVar.i(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.f2564t0;
            cVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.D0) : this.D0));
        } else if (m()) {
            z0 z0Var2 = this.f2565u.f4392r;
            cVar.i(z0Var2 != null ? z0Var2.getTextColors() : null);
        } else if (this.f2571x && (z0Var = this.f2575z) != null) {
            cVar.i(z0Var.getTextColors());
        } else if (z12 && (colorStateList = this.f2566u0) != null && cVar.f9004k != colorStateList) {
            cVar.f9004k = colorStateList;
            cVar.h(false);
        }
        p pVar = this.f2542c;
        y yVar = this.f2540b;
        if (z11 || !this.G0 || (isEnabled() && z12)) {
            if (z10 || this.E0) {
                ValueAnimator valueAnimator = this.I0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.I0.cancel();
                }
                if (z4 && this.H0) {
                    a(1.0f);
                } else {
                    cVar.k(1.0f);
                }
                this.E0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f2544d;
                v(editText3 != null ? editText3.getText() : null);
                yVar.f4423u = false;
                yVar.e();
                pVar.C = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z10 || !this.E0) {
            ValueAnimator valueAnimator2 = this.I0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.I0.cancel();
            }
            if (z4 && this.H0) {
                a(0.0f);
            } else {
                cVar.k(0.0f);
            }
            if (e() && !((g9.h) this.Q).I.f4333r.isEmpty() && e()) {
                ((g9.h) this.Q).o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.E0 = true;
            z0 z0Var3 = this.E;
            if (z0Var3 != null && this.D) {
                z0Var3.setText((CharSequence) null);
                q.a(this.f2538a, this.I);
                this.E.setVisibility(4);
            }
            yVar.f4423u = true;
            yVar.e();
            pVar.C = true;
            pVar.n();
        }
    }

    public final void v(Editable editable) {
        ((f) this.f2573y).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2538a;
        if (length != 0 || this.E0) {
            z0 z0Var = this.E;
            if (z0Var == null || !this.D) {
                return;
            }
            z0Var.setText((CharSequence) null);
            q.a(frameLayout, this.I);
            this.E.setVisibility(4);
            return;
        }
        if (this.E == null || !this.D || TextUtils.isEmpty(this.C)) {
            return;
        }
        this.E.setText(this.C);
        q.a(frameLayout, this.H);
        this.E.setVisibility(0);
        this.E.bringToFront();
        announceForAccessibility(this.C);
    }

    public final void w(boolean z4, boolean z10) {
        int defaultColor = this.f2574y0.getDefaultColor();
        int colorForState = this.f2574y0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2574y0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z4) {
            this.f2550h0 = colorForState2;
        } else if (z10) {
            this.f2550h0 = colorForState;
        } else {
            this.f2550h0 = defaultColor;
        }
    }

    public final void x() {
        z0 z0Var;
        EditText editText;
        EditText editText2;
        if (this.Q == null || this.f2543c0 == 0) {
            return;
        }
        boolean z4 = false;
        boolean z10 = isFocused() || ((editText2 = this.f2544d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f2544d) != null && editText.isHovered())) {
            z4 = true;
        }
        if (!isEnabled()) {
            this.f2550h0 = this.D0;
        } else if (m()) {
            if (this.f2574y0 != null) {
                w(z10, z4);
            } else {
                this.f2550h0 = getErrorCurrentTextColors();
            }
        } else if (!this.f2571x || (z0Var = this.f2575z) == null) {
            if (z10) {
                this.f2550h0 = this.f2572x0;
            } else if (z4) {
                this.f2550h0 = this.f2570w0;
            } else {
                this.f2550h0 = this.f2568v0;
            }
        } else if (this.f2574y0 != null) {
            w(z10, z4);
        } else {
            this.f2550h0 = z0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        p pVar = this.f2542c;
        TextInputLayout textInputLayout = pVar.f4355a;
        CheckableImageButton checkableImageButton = pVar.f4360r;
        TextInputLayout textInputLayout2 = pVar.f4355a;
        pVar.l();
        p3.a.p(textInputLayout2, pVar.f4357c, pVar.f4358d);
        p3.a.p(textInputLayout2, checkableImageButton, pVar.f4364v);
        if (pVar.b() instanceof g9.l) {
            if (!textInputLayout.m() || checkableImageButton.getDrawable() == null) {
                p3.a.b(textInputLayout, checkableImageButton, pVar.f4364v, pVar.f4365w);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                i0.b.g(drawableMutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        y yVar = this.f2540b;
        p3.a.p(yVar.f4415a, yVar.f4418d, yVar.e);
        if (this.f2543c0 == 2) {
            int i = this.f2546e0;
            if (z10 && isEnabled()) {
                this.f2546e0 = this.f2549g0;
            } else {
                this.f2546e0 = this.f2548f0;
            }
            if (this.f2546e0 != i && e() && !this.E0) {
                if (e()) {
                    ((g9.h) this.Q).o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f2543c0 == 1) {
            if (!isEnabled()) {
                this.f2551i0 = this.A0;
            } else if (z4 && !z10) {
                this.f2551i0 = this.C0;
            } else if (z10) {
                this.f2551i0 = this.B0;
            } else {
                this.f2551i0 = this.f2576z0;
            }
        }
        b();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2540b.f4418d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2540b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2542c.f4360r.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2542c.f4360r.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2542c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2542c.f4360r;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.f2542c;
        TextInputLayout textInputLayout = pVar.f4355a;
        CheckableImageButton checkableImageButton = pVar.f4360r;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            p3.a.b(textInputLayout, checkableImageButton, pVar.f4364v, pVar.f4365w);
            p3.a.p(textInputLayout, checkableImageButton, pVar.f4364v);
        }
    }
}

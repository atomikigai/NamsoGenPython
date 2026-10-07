package g9;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.n0;
import app.namso_gen.spacehowen.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import l.z0;
import q0.d0;
import q0.e0;
import q0.g0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends LinearLayout {
    public CharSequence A;
    public final z0 B;
    public boolean C;
    public EditText D;
    public final AccessibilityManager E;
    public r0.d F;
    public final m G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f4355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FrameLayout f4356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f4357c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ColorStateList f4358d;
    public PorterDuff.Mode e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f4359f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CheckableImageButton f4360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final o f4361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final LinkedHashSet f4363u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f4364v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PorterDuff.Mode f4365w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f4366x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ImageView.ScaleType f4367y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public View.OnLongClickListener f4368z;

    public p(TextInputLayout textInputLayout, a2.l lVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f4362t = 0;
        this.f4363u = new LinkedHashSet();
        this.G = new m(this);
        n nVar = new n(this);
        this.E = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f4355a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f4356b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.f4357c = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.f4360r = checkableImageButtonA2;
        this.f4361s = new o(this, lVar);
        z0 z0Var = new z0(getContext(), null);
        this.B = z0Var;
        TypedArray typedArray = (TypedArray) lVar.f44c;
        if (typedArray.hasValue(38)) {
            this.f4358d = android.support.v4.media.session.a.g(getContext(), lVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.e = u8.n.h(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(lVar.u(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = v0.f7946a;
        d0.s(checkableImageButtonA, 2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f4364v = android.support.v4.media.session.a.g(getContext(), lVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f4365w = u8.n.h(typedArray.getInt(33, -1), null);
            }
        }
        int i = 1;
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f4364v = android.support.v4.media.session.a.g(getContext(), lVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f4365w = u8.n.h(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f4366x) {
            this.f4366x = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeH = p3.a.h(typedArray.getInt(31, -1));
            this.f4367y = scaleTypeH;
            checkableImageButtonA2.setScaleType(scaleTypeH);
            checkableImageButtonA.setScaleType(scaleTypeH);
        }
        z0Var.setVisibility(8);
        z0Var.setId(R.id.textinput_suffix_text);
        z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        g0.f(z0Var, 1);
        z0Var.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            z0Var.setTextColor(lVar.t(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.A = TextUtils.isEmpty(text3) ? null : text3;
        z0Var.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(z0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.f2557p0.add(nVar);
        if (textInputLayout.f2544d != null) {
            nVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new n0(this, i));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (android.support.v4.media.session.a.m(getContext())) {
            q0.n.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q eVar;
        int i = this.f4362t;
        o oVar = this.f4361s;
        SparseArray sparseArray = oVar.f4351a;
        q qVar = (q) sparseArray.get(i);
        if (qVar != null) {
            return qVar;
        }
        p pVar = oVar.f4352b;
        if (i == -1) {
            eVar = new e(pVar, 0);
        } else if (i == 0) {
            eVar = new e(pVar, 1);
        } else if (i == 1) {
            eVar = new x(pVar, oVar.f4354d);
        } else if (i == 2) {
            eVar = new d(pVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(da.v.f(i, "Invalid end icon mode: "));
            }
            eVar = new l(pVar);
        }
        sparseArray.append(i, eVar);
        return eVar;
    }

    public final int c() {
        int iC;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f4360r;
            iC = q0.n.c((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iC = 0;
        }
        WeakHashMap weakHashMap = v0.f7946a;
        return e0.e(this.B) + e0.e(this) + iC;
    }

    public final boolean d() {
        return this.f4356b.getVisibility() == 0 && this.f4360r.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f4357c.getVisibility() == 0;
    }

    public final void f(boolean z4) {
        boolean z10;
        boolean zIsActivated;
        boolean z11;
        q qVarB = b();
        boolean zJ = qVarB.j();
        CheckableImageButton checkableImageButton = this.f4360r;
        boolean z12 = true;
        if (!zJ || (z11 = checkableImageButton.f2490d) == qVarB.k()) {
            z10 = false;
        } else {
            checkableImageButton.setChecked(!z11);
            z10 = true;
        }
        if (!(qVarB instanceof l) || (zIsActivated = checkableImageButton.isActivated()) == ((l) qVarB).f4342l) {
            z12 = z10;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z4 || z12) {
            p3.a.p(this.f4355a, checkableImageButton, this.f4364v);
        }
    }

    public final void g(int i) {
        if (this.f4362t == i) {
            return;
        }
        q qVarB = b();
        r0.d dVar = this.F;
        AccessibilityManager accessibilityManager = this.E;
        if (dVar != null && accessibilityManager != null) {
            r0.c.b(accessibilityManager, dVar);
        }
        this.F = null;
        qVarB.r();
        this.f4362t = i;
        Iterator it = this.f4363u.iterator();
        if (it.hasNext()) {
            throw q1.a.g(it);
        }
        h(i != 0);
        q qVarB2 = b();
        int iD = this.f4361s.f4353c;
        if (iD == 0) {
            iD = qVarB2.d();
        }
        Drawable drawableR = iD != 0 ? com.bumptech.glide.d.r(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.f4360r;
        checkableImageButton.setImageDrawable(drawableR);
        TextInputLayout textInputLayout = this.f4355a;
        if (drawableR != null) {
            p3.a.b(textInputLayout, checkableImageButton, this.f4364v, this.f4365w);
            p3.a.p(textInputLayout, checkableImageButton, this.f4364v);
        }
        int iC = qVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(qVarB2.j());
        if (!qVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        qVarB2.q();
        r0.d dVarH = qVarB2.h();
        this.F = dVarH;
        if (dVarH != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = v0.f7946a;
            if (g0.b(this)) {
                r0.c.a(accessibilityManager, this.F);
            }
        }
        View.OnClickListener onClickListenerF = qVarB2.f();
        View.OnLongClickListener onLongClickListener = this.f4368z;
        checkableImageButton.setOnClickListener(onClickListenerF);
        p3.a.r(checkableImageButton, onLongClickListener);
        EditText editText = this.D;
        if (editText != null) {
            qVarB2.l(editText);
            j(qVarB2);
        }
        p3.a.b(textInputLayout, checkableImageButton, this.f4364v, this.f4365w);
        f(true);
    }

    public final void h(boolean z4) {
        if (d() != z4) {
            this.f4360r.setVisibility(z4 ? 0 : 8);
            k();
            m();
            this.f4355a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4357c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        p3.a.b(this.f4355a, checkableImageButton, this.f4358d, this.e);
    }

    public final void j(q qVar) {
        if (this.D == null) {
            return;
        }
        if (qVar.e() != null) {
            this.D.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.f4360r.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void k() {
        this.f4356b.setVisibility((this.f4360r.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.A == null || this.C) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f4357c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f4355a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f2565u.f4391q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f4362t != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int iE;
        TextInputLayout textInputLayout = this.f4355a;
        if (textInputLayout.f2544d == null) {
            return;
        }
        if (d() || e()) {
            iE = 0;
        } else {
            EditText editText = textInputLayout.f2544d;
            WeakHashMap weakHashMap = v0.f7946a;
            iE = e0.e(editText);
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f2544d.getPaddingTop();
        int paddingBottom = textInputLayout.f2544d.getPaddingBottom();
        WeakHashMap weakHashMap2 = v0.f7946a;
        e0.k(this.B, dimensionPixelSize, paddingTop, iE, paddingBottom);
    }

    public final void n() {
        z0 z0Var = this.B;
        int visibility = z0Var.getVisibility();
        int i = (this.A == null || this.C) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        z0Var.setVisibility(i);
        this.f4355a.q();
    }
}

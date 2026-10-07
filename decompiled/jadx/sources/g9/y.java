package g9;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import app.namso_gen.spacehowen.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import l.z0;
import q0.e0;
import q0.g0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f4415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f4416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public CharSequence f4417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CheckableImageButton f4418d;
    public ColorStateList e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PorterDuff.Mode f4419f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f4420r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ImageView.ScaleType f4421s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View.OnLongClickListener f4422t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f4423u;

    public y(TextInputLayout textInputLayout, a2.l lVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.f4415a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f4418d = checkableImageButton;
        z0 z0Var = new z0(getContext(), null);
        this.f4416b = z0Var;
        if (android.support.v4.media.session.a.m(getContext())) {
            q0.n.g((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        View.OnLongClickListener onLongClickListener = this.f4422t;
        checkableImageButton.setOnClickListener(null);
        p3.a.r(checkableImageButton, onLongClickListener);
        this.f4422t = null;
        checkableImageButton.setOnLongClickListener(null);
        p3.a.r(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) lVar.f44c;
        if (typedArray.hasValue(69)) {
            this.e = android.support.v4.media.session.a.g(getContext(), lVar, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f4419f = u8.n.h(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            b(lVar.u(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f4420r) {
            this.f4420r = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType scaleTypeH = p3.a.h(typedArray.getInt(68, -1));
            this.f4421s = scaleTypeH;
            checkableImageButton.setScaleType(scaleTypeH);
        }
        z0Var.setVisibility(8);
        z0Var.setId(R.id.textinput_prefix_text);
        z0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = v0.f7946a;
        g0.f(z0Var, 1);
        z0Var.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            z0Var.setTextColor(lVar.t(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f4417c = TextUtils.isEmpty(text2) ? null : text2;
        z0Var.setText(text2);
        e();
        addView(checkableImageButton);
        addView(z0Var);
    }

    public final int a() {
        int iB;
        CheckableImageButton checkableImageButton = this.f4418d;
        if (checkableImageButton.getVisibility() == 0) {
            iB = q0.n.b((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()) + checkableImageButton.getMeasuredWidth();
        } else {
            iB = 0;
        }
        WeakHashMap weakHashMap = v0.f7946a;
        return e0.f(this.f4416b) + e0.f(this) + iB;
    }

    public final void b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f4418d;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.e;
            PorterDuff.Mode mode = this.f4419f;
            TextInputLayout textInputLayout = this.f4415a;
            p3.a.b(textInputLayout, checkableImageButton, colorStateList, mode);
            c(true);
            p3.a.p(textInputLayout, checkableImageButton, this.e);
            return;
        }
        c(false);
        View.OnLongClickListener onLongClickListener = this.f4422t;
        checkableImageButton.setOnClickListener(null);
        p3.a.r(checkableImageButton, onLongClickListener);
        this.f4422t = null;
        checkableImageButton.setOnLongClickListener(null);
        p3.a.r(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    public final void c(boolean z4) {
        CheckableImageButton checkableImageButton = this.f4418d;
        if ((checkableImageButton.getVisibility() == 0) != z4) {
            checkableImageButton.setVisibility(z4 ? 0 : 8);
            d();
            e();
        }
    }

    public final void d() {
        int iF;
        EditText editText = this.f4415a.f2544d;
        if (editText == null) {
            return;
        }
        if (this.f4418d.getVisibility() == 0) {
            iF = 0;
        } else {
            WeakHashMap weakHashMap = v0.f7946a;
            iF = e0.f(editText);
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = v0.f7946a;
        e0.k(this.f4416b, iF, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    public final void e() {
        int i = (this.f4417c == null || this.f4423u) ? 8 : 0;
        setVisibility((this.f4418d.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f4416b.setVisibility(i);
        this.f4415a.q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i10) {
        super.onMeasure(i, i10);
        d();
    }
}

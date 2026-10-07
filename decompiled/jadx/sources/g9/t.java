package g9;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import app.namso_gen.spacehowen.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import l.z0;
import q0.e0;
import q0.g0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t {
    public ColorStateList A;
    public Typeface B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4379b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f4380c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimeInterpolator f4381d;
    public final TimeInterpolator e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TimeInterpolator f4382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f4383g;
    public final TextInputLayout h;
    public LinearLayout i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f4384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f4385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f4386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f4387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f4388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f4389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public CharSequence f4390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f4391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public z0 f4392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f4393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f4394t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f4395u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ColorStateList f4396v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public CharSequence f4397w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f4398x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public z0 f4399y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f4400z;

    public t(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f4383g = context;
        this.h = textInputLayout;
        this.f4387m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f4378a = android.support.v4.media.session.a.v(context, R.attr.motionDurationShort4, 217);
        this.f4379b = android.support.v4.media.session.a.v(context, R.attr.motionDurationMedium4, 167);
        this.f4380c = android.support.v4.media.session.a.v(context, R.attr.motionDurationShort4, 167);
        this.f4381d = android.support.v4.media.session.a.w(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, e8.a.f3494d);
        LinearInterpolator linearInterpolator = e8.a.f3491a;
        this.e = android.support.v4.media.session.a.w(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f4382f = android.support.v4.media.session.a.w(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    public final void a(z0 z0Var, int i) {
        if (this.i == null && this.f4385k == null) {
            Context context = this.f4383g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.i;
            TextInputLayout textInputLayout = this.h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f4385k = new FrameLayout(context);
            this.i.addView(this.f4385k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                b();
            }
        }
        if (i == 0 || i == 1) {
            this.f4385k.setVisibility(0);
            this.f4385k.addView(z0Var);
        } else {
            this.i.addView(z0Var, new LinearLayout.LayoutParams(-2, -2));
        }
        this.i.setVisibility(0);
        this.f4384j++;
    }

    public final void b() {
        if (this.i != null) {
            TextInputLayout textInputLayout = this.h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f4383g;
                boolean zM = android.support.v4.media.session.a.m(context);
                LinearLayout linearLayout = this.i;
                WeakHashMap weakHashMap = v0.f7946a;
                int iF = e0.f(editText);
                if (zM) {
                    iF = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (zM) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int iE = e0.e(editText);
                if (zM) {
                    iE = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                e0.k(linearLayout, iF, dimensionPixelSize, iE, 0);
            }
        }
    }

    public final void c() {
        AnimatorSet animatorSet = this.f4386l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    public final void d(ArrayList arrayList, boolean z4, z0 z0Var, int i, int i10, int i11) {
        if (z0Var == null || !z4) {
            return;
        }
        if (i == i11 || i == i10) {
            boolean z10 = i11 == i;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(z0Var, (Property<z0, Float>) View.ALPHA, z10 ? 1.0f : 0.0f);
            int i12 = this.f4380c;
            objectAnimatorOfFloat.setDuration(z10 ? this.f4379b : i12);
            objectAnimatorOfFloat.setInterpolator(z10 ? this.e : this.f4382f);
            if (i == i11 && i10 != 0) {
                objectAnimatorOfFloat.setStartDelay(i12);
            }
            arrayList.add(objectAnimatorOfFloat);
            if (i11 != i || i10 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(z0Var, (Property<z0, Float>) View.TRANSLATION_Y, -this.f4387m, 0.0f);
            objectAnimatorOfFloat2.setDuration(this.f4378a);
            objectAnimatorOfFloat2.setInterpolator(this.f4381d);
            objectAnimatorOfFloat2.setStartDelay(i12);
            arrayList.add(objectAnimatorOfFloat2);
        }
    }

    public final TextView e(int i) {
        if (i == 1) {
            return this.f4392r;
        }
        if (i != 2) {
            return null;
        }
        return this.f4399y;
    }

    public final void f() {
        this.f4390p = null;
        c();
        if (this.f4388n == 1) {
            if (!this.f4398x || TextUtils.isEmpty(this.f4397w)) {
                this.f4389o = 0;
            } else {
                this.f4389o = 2;
            }
        }
        i(this.f4388n, this.f4389o, h(this.f4392r, ""));
    }

    public final void g(z0 z0Var, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f4385k) != null) {
            frameLayout.removeView(z0Var);
        } else {
            linearLayout.removeView(z0Var);
        }
        int i10 = this.f4384j - 1;
        this.f4384j = i10;
        LinearLayout linearLayout2 = this.i;
        if (i10 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    public final boolean h(z0 z0Var, CharSequence charSequence) {
        WeakHashMap weakHashMap = v0.f7946a;
        TextInputLayout textInputLayout = this.h;
        if (g0.c(textInputLayout) && textInputLayout.isEnabled()) {
            return (this.f4389o == this.f4388n && z0Var != null && TextUtils.equals(z0Var.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    public final void i(int i, int i10, boolean z4) {
        TextView textViewE;
        TextView textViewE2;
        if (i == i10) {
            return;
        }
        if (z4) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f4386l = animatorSet;
            ArrayList arrayList = new ArrayList();
            d(arrayList, this.f4398x, this.f4399y, 2, i, i10);
            d(arrayList, this.f4391q, this.f4392r, 1, i, i10);
            jd.l.u(animatorSet, arrayList);
            animatorSet.addListener(new r(this, i10, e(i), i, e(i10)));
            animatorSet.start();
        } else if (i != i10) {
            if (i10 != 0 && (textViewE2 = e(i10)) != null) {
                textViewE2.setVisibility(0);
                textViewE2.setAlpha(1.0f);
            }
            if (i != 0 && (textViewE = e(i)) != null) {
                textViewE.setVisibility(4);
                if (i == 1) {
                    textViewE.setText((CharSequence) null);
                }
            }
            this.f4388n = i10;
        }
        TextInputLayout textInputLayout = this.h;
        textInputLayout.r();
        textInputLayout.u(z4, false);
        textInputLayout.x();
    }
}

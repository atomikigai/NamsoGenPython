package g9;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import app.namso_gen.spacehowen.R;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends q {
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4327f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f4328g;
    public final TimeInterpolator h;
    public EditText i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.google.android.material.datepicker.n f4329j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f4330k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AnimatorSet f4331l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ValueAnimator f4332m;

    public d(p pVar) {
        super(pVar);
        this.f4329j = new com.google.android.material.datepicker.n(this, 1);
        this.f4330k = new a(this, 0);
        this.e = android.support.v4.media.session.a.v(pVar.getContext(), R.attr.motionDurationShort3, 100);
        this.f4327f = android.support.v4.media.session.a.v(pVar.getContext(), R.attr.motionDurationShort3, 150);
        this.f4328g = android.support.v4.media.session.a.w(pVar.getContext(), R.attr.motionEasingLinearInterpolator, e8.a.f3491a);
        this.h = android.support.v4.media.session.a.w(pVar.getContext(), R.attr.motionEasingEmphasizedInterpolator, e8.a.f3494d);
    }

    @Override // g9.q
    public final void a() {
        if (this.f4370b.A != null) {
            return;
        }
        s(t());
    }

    @Override // g9.q
    public final int c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // g9.q
    public final int d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // g9.q
    public final View.OnFocusChangeListener e() {
        return this.f4330k;
    }

    @Override // g9.q
    public final View.OnClickListener f() {
        return this.f4329j;
    }

    @Override // g9.q
    public final View.OnFocusChangeListener g() {
        return this.f4330k;
    }

    @Override // g9.q
    public final void l(EditText editText) {
        this.i = editText;
        this.f4369a.setEndIconVisible(t());
    }

    @Override // g9.q
    public final void o(boolean z4) {
        if (this.f4370b.A == null) {
            return;
        }
        s(z4);
    }

    @Override // g9.q
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.h);
        valueAnimatorOfFloat.setDuration(this.f4327f);
        final int i = 1;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f4322b;

            {
                this.f4322b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        d dVar = this.f4322b;
                        dVar.getClass();
                        dVar.f4372d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f4322b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f4372d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f4328g;
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        int i10 = this.e;
        valueAnimatorOfFloat2.setDuration(i10);
        final int i11 = 0;
        valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f4322b;

            {
                this.f4322b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        d dVar = this.f4322b;
                        dVar.getClass();
                        dVar.f4372d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f4322b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f4372d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f4331l = animatorSet;
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfFloat2);
        this.f4331l.addListener(new c(this, i11));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat3.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat3.setDuration(i10);
        valueAnimatorOfFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: g9.b

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f4322b;

            {
                this.f4322b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i11) {
                    case 0:
                        d dVar = this.f4322b;
                        dVar.getClass();
                        dVar.f4372d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        d dVar2 = this.f4322b;
                        dVar2.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = dVar2.f4372d;
                        checkableImageButton.setScaleX(fFloatValue);
                        checkableImageButton.setScaleY(fFloatValue);
                        break;
                }
            }
        });
        this.f4332m = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.addListener(new c(this, i));
    }

    @Override // g9.q
    public final void r() {
        EditText editText = this.i;
        if (editText != null) {
            editText.post(new androidx.activity.d(this, 9));
        }
    }

    public final void s(boolean z4) {
        boolean z10 = this.f4370b.d() == z4;
        if (z4 && !this.f4331l.isRunning()) {
            this.f4332m.cancel();
            this.f4331l.start();
            if (z10) {
                this.f4331l.end();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.f4331l.cancel();
        this.f4332m.start();
        if (z10) {
            this.f4332m.end();
        }
    }

    public final boolean t() {
        EditText editText = this.i;
        if (editText != null) {
            return (editText.hasFocus() || this.f4372d.hasFocus()) && this.i.getText().length() > 0;
        }
        return false;
    }
}

package g9;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import app.namso_gen.spacehowen.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import q0.d0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends q {
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeInterpolator f4339g;
    public AutoCompleteTextView h;
    public final com.google.android.material.datepicker.n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a f4340j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a5.a f4341k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f4342l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f4343m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f4344n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f4345o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AccessibilityManager f4346p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ValueAnimator f4347q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ValueAnimator f4348r;

    public l(p pVar) {
        super(pVar);
        this.i = new com.google.android.material.datepicker.n(this, 2);
        this.f4340j = new a(this, 1);
        this.f4341k = new a5.a(this, 6);
        this.f4345o = Long.MAX_VALUE;
        this.f4338f = android.support.v4.media.session.a.v(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.e = android.support.v4.media.session.a.v(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f4339g = android.support.v4.media.session.a.w(pVar.getContext(), R.attr.motionEasingLinearInterpolator, e8.a.f3491a);
    }

    @Override // g9.q
    public final void a() {
        if (this.f4346p.isTouchExplorationEnabled() && this.h.getInputType() != 0 && !this.f4372d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new androidx.activity.d(this, 10));
    }

    @Override // g9.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // g9.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // g9.q
    public final View.OnFocusChangeListener e() {
        return this.f4340j;
    }

    @Override // g9.q
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // g9.q
    public final r0.d h() {
        return this.f4341k;
    }

    @Override // g9.q
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // g9.q
    public final boolean k() {
        return this.f4344n;
    }

    @Override // g9.q
    public final void l(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: g9.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    l lVar = this.f4336a;
                    long j4 = jCurrentTimeMillis - lVar.f4345o;
                    if (j4 < 0 || j4 > 300) {
                        lVar.f4343m = false;
                    }
                    lVar.t();
                    lVar.f4343m = true;
                    lVar.f4345o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: g9.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                l lVar = this.f4337a;
                lVar.f4343m = true;
                lVar.f4345o = System.currentTimeMillis();
                lVar.s(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.f4369a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (editText.getInputType() == 0 && this.f4346p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = v0.f7946a;
            d0.s(this.f4372d, 2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // g9.q
    public final void m(r0.l lVar) {
        if (this.h.getInputType() == 0) {
            lVar.f8119a.setClassName(Spinner.class.getName());
        }
        if (lVar.h()) {
            lVar.l(null);
        }
    }

    @Override // g9.q
    public final void n(AccessibilityEvent accessibilityEvent) {
        if (this.f4346p.isEnabled() && this.h.getInputType() == 0) {
            boolean z4 = accessibilityEvent.getEventType() == 32768 && this.f4344n && !this.h.isPopupShowing();
            if (accessibilityEvent.getEventType() == 1 || z4) {
                t();
                this.f4343m = true;
                this.f4345o = System.currentTimeMillis();
            }
        }
    }

    @Override // g9.q
    public final void q() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f4339g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f4338f);
        int i = 0;
        valueAnimatorOfFloat.addUpdateListener(new i(this, i));
        this.f4348r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new i(this, i));
        this.f4347q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new g6.m(this, 1));
        this.f4346p = (AccessibilityManager) this.f4371c.getSystemService("accessibility");
    }

    @Override // g9.q
    public final void r() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void s(boolean z4) {
        if (this.f4344n != z4) {
            this.f4344n = z4;
            this.f4348r.cancel();
            this.f4347q.start();
        }
    }

    public final void t() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f4345o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f4343m = false;
        }
        if (this.f4343m) {
            this.f4343m = false;
            return;
        }
        s(!this.f4344n);
        if (!this.f4344n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}

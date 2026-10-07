package w8;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import app.namso_gen.spacehowen.R;
import com.google.android.gms.internal.ads.zzbbs;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends c5.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f9793l = {533, 567, 850, 750};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f9794m = {1267, zzbbs.zzq.zzf, 333, 0};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final m2.b f9795n = new m2.b(Float.class, "animationFraction", 11);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f9796d;
    public ObjectAnimator e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Interpolator[] f9797f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u f9798g;
    public int h;
    public boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f9799j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f9800k;

    public t(Context context, u uVar) {
        super(2);
        this.h = 0;
        this.f9800k = null;
        this.f9798g = uVar;
        this.f9797f = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator)};
    }

    @Override // c5.a
    public final void b() {
        ObjectAnimator objectAnimator = this.f9796d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // c5.a
    public final void d() {
        this.h = 0;
        int iC = com.bumptech.glide.c.c(this.f9798g.f9745c[0], ((p) this.f1774a).f9779u);
        int[] iArr = (int[]) this.f1776c;
        iArr[0] = iC;
        iArr[1] = iC;
    }

    @Override // c5.a
    public final void f(c cVar) {
        this.f9800k = cVar;
    }

    @Override // c5.a
    public final void h() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        b();
        if (((p) this.f1774a).isVisible()) {
            this.e.setFloatValues(this.f9799j, 1.0f);
            this.e.setDuration((long) ((1.0f - this.f9799j) * 1800.0f));
            this.e.start();
        }
    }

    @Override // c5.a
    public final void i() {
        ObjectAnimator objectAnimator = this.f9796d;
        m2.b bVar = f9795n;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, bVar, 0.0f, 1.0f);
            this.f9796d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f9796d.setInterpolator(null);
            this.f9796d.setRepeatCount(-1);
            this.f9796d.addListener(new s(this, 0));
        }
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, bVar, 1.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.e.setInterpolator(null);
            this.e.addListener(new s(this, 1));
        }
        this.h = 0;
        int iC = com.bumptech.glide.c.c(this.f9798g.f9745c[0], ((p) this.f1774a).f9779u);
        int[] iArr = (int[]) this.f1776c;
        iArr[0] = iC;
        iArr[1] = iC;
        this.f9796d.start();
    }

    @Override // c5.a
    public final void j() {
        this.f9800k = null;
    }
}

package w8;

import android.animation.ObjectAnimator;
import com.google.android.gms.internal.ads.zzbbs;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends c5.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int[] f9753l = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f9754m = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f9755n = {zzbbs.zzq.zzf, 2350, 3700, 5050};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final m2.b f9756o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final m2.b f9757p;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f9758d;
    public ObjectAnimator e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j1.a f9759f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f9760g;
    public int h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f9761j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c f9762k;

    static {
        Class<Float> cls = Float.class;
        f9756o = new m2.b(cls, "animationFraction", 7);
        f9757p = new m2.b(cls, "completeEndFraction", 8);
    }

    public h(j jVar) {
        super(1);
        this.h = 0;
        this.f9762k = null;
        this.f9760g = jVar;
        this.f9759f = new j1.a(1);
    }

    @Override // c5.a
    public final void b() {
        ObjectAnimator objectAnimator = this.f9758d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // c5.a
    public final void d() {
        this.h = 0;
        ((int[]) this.f1776c)[0] = com.bumptech.glide.c.c(this.f9760g.f9745c[0], ((p) this.f1774a).f9779u);
        this.f9761j = 0.0f;
    }

    @Override // c5.a
    public final void f(c cVar) {
        this.f9762k = cVar;
    }

    @Override // c5.a
    public final void h() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((p) this.f1774a).isVisible()) {
            this.e.start();
        } else {
            b();
        }
    }

    @Override // c5.a
    public final void i() {
        int i = 0;
        if (this.f9758d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f9756o, 0.0f, 1.0f);
            this.f9758d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f9758d.setInterpolator(null);
            this.f9758d.setRepeatCount(-1);
            this.f9758d.addListener(new g(this, i));
        }
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f9757p, 0.0f, 1.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.e.setInterpolator(this.f9759f);
            this.e.addListener(new g(this, 1));
        }
        this.h = 0;
        ((int[]) this.f1776c)[0] = com.bumptech.glide.c.c(this.f9760g.f9745c[0], ((p) this.f1774a).f9779u);
        this.f9761j = 0.0f;
        this.f9758d.start();
    }

    @Override // c5.a
    public final void j() {
        this.f9762k = null;
    }
}

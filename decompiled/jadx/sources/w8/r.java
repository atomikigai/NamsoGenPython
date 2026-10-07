package w8;

import android.animation.ObjectAnimator;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends c5.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final m2.b f9787j = new m2.b(Float.class, "animationFraction", 10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f9788d;
    public final j1.a e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f9789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f9790g;
    public boolean h;
    public float i;

    public r(u uVar) {
        super(3);
        this.f9790g = 1;
        this.f9789f = uVar;
        this.e = new j1.a(1);
    }

    @Override // c5.a
    public final void b() {
        ObjectAnimator objectAnimator = this.f9788d;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // c5.a
    public final void d() {
        this.h = true;
        this.f9790g = 1;
        Arrays.fill((int[]) this.f1776c, com.bumptech.glide.c.c(this.f9789f.f9745c[0], ((p) this.f1774a).f9779u));
    }

    @Override // c5.a
    public final void i() {
        if (this.f9788d == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f9787j, 0.0f, 1.0f);
            this.f9788d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f9788d.setInterpolator(null);
            this.f9788d.setRepeatCount(-1);
            this.f9788d.addListener(new g6.m(this, 9));
        }
        this.h = true;
        this.f9790g = 1;
        Arrays.fill((int[]) this.f1776c, com.bumptech.glide.c.c(this.f9789f.f9745c[0], ((p) this.f1774a).f9779u));
        this.f9788d.start();
    }

    @Override // c5.a
    public final void h() {
    }

    @Override // c5.a
    public final void j() {
    }

    @Override // c5.a
    public final void f(c cVar) {
    }
}

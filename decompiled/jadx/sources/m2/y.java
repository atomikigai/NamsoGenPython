package m2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends AnimatorListenerAdapter implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f7036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewGroup f7038c;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7040f = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7039d = true;

    public y(View view, int i) {
        this.f7036a = view;
        this.f7037b = i;
        this.f7038c = (ViewGroup) view.getParent();
        f(true);
    }

    @Override // m2.l
    public final void a() {
        f(false);
    }

    @Override // m2.l
    public final void c(m mVar) {
        if (!this.f7040f) {
            t.f7026a.E(this.f7036a, this.f7037b);
            ViewGroup viewGroup = this.f7038c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
        mVar.u(this);
    }

    @Override // m2.l
    public final void e() {
        f(true);
    }

    public final void f(boolean z4) {
        ViewGroup viewGroup;
        if (!this.f7039d || this.e == z4 || (viewGroup = this.f7038c) == null) {
            return;
        }
        this.e = z4;
        gb.p.c(viewGroup, z4);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.f7040f = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (!this.f7040f) {
            t.f7026a.E(this.f7036a, this.f7037b);
            ViewGroup viewGroup = this.f7038c;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        }
        f(false);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        if (this.f7040f) {
            return;
        }
        t.f7026a.E(this.f7036a, this.f7037b);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        if (this.f7040f) {
            return;
        }
        t.f7026a.E(this.f7036a, 0);
    }

    @Override // m2.l
    public final void b() {
    }

    @Override // m2.l
    public final void d() {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}

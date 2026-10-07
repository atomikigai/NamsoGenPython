package t8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f8619b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f8620c;

    public c(j jVar) {
        this.f8618a = 0;
        this.f8620c = jVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.f8618a) {
            case 0:
                this.f8619b = true;
                break;
            default:
                this.f8619b = true;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8618a) {
            case 0:
                j jVar = (j) this.f8620c;
                jVar.f8652r = 0;
                jVar.f8646l = null;
                if (!this.f8619b) {
                    jVar.f8653s.a(4, false);
                }
                break;
            default:
                x1.k kVar = (x1.k) this.f8620c;
                if (this.f8619b) {
                    this.f8619b = false;
                } else if (((Float) kVar.f10136z.getAnimatedValue()).floatValue() != 0.0f) {
                    kVar.A = 2;
                    kVar.f10129s.invalidate();
                } else {
                    kVar.A = 0;
                    kVar.f(0);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f8618a) {
            case 0:
                j jVar = (j) this.f8620c;
                jVar.f8653s.a(0, false);
                jVar.f8652r = 1;
                jVar.f8646l = animator;
                this.f8619b = false;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public c(x1.k kVar) {
        this.f8618a = 1;
        this.f8620c = kVar;
        this.f8619b = false;
    }
}

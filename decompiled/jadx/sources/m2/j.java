package m2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import q0.f1;
import q0.k1;
import q0.p1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f6993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f6994c;

    public /* synthetic */ j(Object obj, View view, int i) {
        this.f6992a = i;
        this.f6993b = obj;
        this.f6994c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f6992a) {
            case 1:
                ((f1) this.f6993b).a((View) this.f6994c);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f6992a) {
            case 0:
                ((r.e) this.f6993b).remove(animator);
                ((m) this.f6994c).f7010x.remove(animator);
                break;
            case 1:
                ((f1) this.f6993b).c();
                break;
            default:
                ((p1) this.f6993b).f7929a.d(1.0f);
                k1.e((View) this.f6994c);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f6992a) {
            case 0:
                ((m) this.f6994c).f7010x.add(animator);
                break;
            case 1:
                ((f1) this.f6993b).b();
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public j(m mVar, r.e eVar) {
        this.f6992a = 0;
        this.f6994c = mVar;
        this.f6993b = eVar;
    }
}

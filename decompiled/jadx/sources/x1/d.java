package x1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10029a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w0 f10030b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10031c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10032d;
    public final /* synthetic */ i e;

    public d(i iVar, w0 w0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = iVar;
        this.f10030b = w0Var;
        this.f10032d = viewPropertyAnimator;
        this.f10031c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f10029a) {
            case 1:
                this.f10031c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10029a) {
            case 0:
                this.f10032d.setListener(null);
                this.f10031c.setAlpha(1.0f);
                i iVar = this.e;
                w0 w0Var = this.f10030b;
                iVar.c(w0Var);
                iVar.f10103q.remove(w0Var);
                iVar.i();
                break;
            default:
                this.f10032d.setListener(null);
                i iVar2 = this.e;
                w0 w0Var2 = this.f10030b;
                iVar2.c(w0Var2);
                iVar2.f10101o.remove(w0Var2);
                iVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10029a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public d(i iVar, w0 w0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = iVar;
        this.f10030b = w0Var;
        this.f10031c = view;
        this.f10032d = viewPropertyAnimator;
    }
}

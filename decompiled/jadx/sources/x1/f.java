package x1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f10057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ViewPropertyAnimator f10058c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f10059d;
    public final /* synthetic */ i e;

    public /* synthetic */ f(i iVar, g gVar, ViewPropertyAnimator viewPropertyAnimator, View view, int i) {
        this.f10056a = i;
        this.e = iVar;
        this.f10057b = gVar;
        this.f10058c = viewPropertyAnimator;
        this.f10059d = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f10056a) {
            case 0:
                this.f10058c.setListener(null);
                View view = this.f10059d;
                view.setAlpha(1.0f);
                view.setTranslationX(0.0f);
                view.setTranslationY(0.0f);
                g gVar = this.f10057b;
                w0 w0Var = gVar.f10065a;
                i iVar = this.e;
                iVar.c(w0Var);
                iVar.f10104r.remove(gVar.f10065a);
                iVar.i();
                break;
            default:
                this.f10058c.setListener(null);
                View view2 = this.f10059d;
                view2.setAlpha(1.0f);
                view2.setTranslationX(0.0f);
                view2.setTranslationY(0.0f);
                g gVar2 = this.f10057b;
                w0 w0Var2 = gVar2.f10066b;
                i iVar2 = this.e;
                iVar2.c(w0Var2);
                iVar2.f10104r.remove(gVar2.f10066b);
                iVar2.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.f10056a) {
            case 0:
                w0 w0Var = this.f10057b.f10065a;
                this.e.getClass();
                break;
            default:
                w0 w0Var2 = this.f10057b.f10066b;
                this.e.getClass();
                break;
        }
    }
}

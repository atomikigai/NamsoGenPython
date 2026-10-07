package x1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w0 f10037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f10039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f10040d;
    public final /* synthetic */ ViewPropertyAnimator e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i f10041f;

    public e(i iVar, w0 w0Var, int i, View view, int i10, ViewPropertyAnimator viewPropertyAnimator) {
        this.f10041f = iVar;
        this.f10037a = w0Var;
        this.f10038b = i;
        this.f10039c = view;
        this.f10040d = i10;
        this.e = viewPropertyAnimator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.f10038b;
        View view = this.f10039c;
        if (i != 0) {
            view.setTranslationX(0.0f);
        }
        if (this.f10040d != 0) {
            view.setTranslationY(0.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        i iVar = this.f10041f;
        w0 w0Var = this.f10037a;
        iVar.c(w0Var);
        iVar.f10102p.remove(w0Var);
        iVar.i();
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.f10041f.getClass();
    }
}

package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f853c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w0 f854d;
    public final /* synthetic */ e e;

    public c(ViewGroup viewGroup, View view, boolean z4, w0 w0Var, e eVar) {
        this.f851a = viewGroup;
        this.f852b = view;
        this.f853c = z4;
        this.f854d = w0Var;
        this.e = eVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ViewGroup viewGroup = this.f851a;
        View view = this.f852b;
        viewGroup.endViewTransition(view);
        if (this.f853c) {
            q1.a.a(view, this.f854d.f1004a);
        }
        this.e.d();
    }
}

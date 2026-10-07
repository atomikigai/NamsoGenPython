package g9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import l.z0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TextView f4374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ TextView f4376d;
    public final /* synthetic */ t e;

    public r(t tVar, int i, TextView textView, int i10, TextView textView2) {
        this.e = tVar;
        this.f4373a = i;
        this.f4374b = textView;
        this.f4375c = i10;
        this.f4376d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        z0 z0Var;
        int i = this.f4373a;
        t tVar = this.e;
        tVar.f4388n = i;
        tVar.f4386l = null;
        TextView textView = this.f4374b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f4375c == 1 && (z0Var = tVar.f4392r) != null) {
                z0Var.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f4376d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f4376d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}

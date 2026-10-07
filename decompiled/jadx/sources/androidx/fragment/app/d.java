package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Animation.AnimationListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f859c;

    public d(ViewGroup viewGroup, View view, e eVar) {
        this.f857a = viewGroup;
        this.f858b = view;
        this.f859c = eVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.f857a.post(new androidx.activity.i(this, 1));
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}

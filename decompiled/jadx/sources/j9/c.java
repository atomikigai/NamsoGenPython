package j9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import java.util.WeakHashMap;
import m2.t;
import m2.v;
import q0.d0;
import q0.v0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f5716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5717c;

    public c(View view, boolean z4) {
        this.f5715a = 0;
        this.f5717c = z4;
        this.f5716b = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f5715a) {
            case 0:
                if (!this.f5717c) {
                    this.f5716b.setVisibility(4);
                }
                break;
            default:
                v vVar = t.f7026a;
                View view = this.f5716b;
                vVar.I(view, 1.0f);
                if (this.f5717c) {
                    view.setLayerType(0, null);
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.f5715a;
        View view = this.f5716b;
        switch (i) {
            case 0:
                if (this.f5717c) {
                    view.setVisibility(0);
                }
                break;
            default:
                WeakHashMap weakHashMap = v0.f7946a;
                if (d0.h(view) && view.getLayerType() == 0) {
                    this.f5717c = true;
                    view.setLayerType(2, null);
                    break;
                }
                break;
        }
    }

    public c(View view) {
        this.f5715a = 1;
        this.f5717c = false;
        this.f5716b = view;
    }
}

package t8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f8633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f8634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f8635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f8636d;

    public i(l lVar) {
        this.f8636d = lVar;
    }

    public abstract float a();

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        float f10 = (int) this.f8635c;
        b9.g gVar = this.f8636d.f8639b;
        if (gVar != null) {
            gVar.j(f10);
        }
        this.f8633a = false;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z4 = this.f8633a;
        l lVar = this.f8636d;
        if (!z4) {
            b9.g gVar = lVar.f8639b;
            this.f8634b = gVar == null ? 0.0f : gVar.f1454a.f1449m;
            this.f8635c = a();
            this.f8633a = true;
        }
        float f10 = this.f8634b;
        float animatedFraction = (int) ((valueAnimator.getAnimatedFraction() * (this.f8635c - f10)) + f10);
        b9.g gVar2 = lVar.f8639b;
        if (gVar2 != null) {
            gVar2.j(animatedFraction);
        }
    }
}

package w8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t f9792b;

    public /* synthetic */ s(t tVar, int i) {
        this.f9791a = i;
        this.f9792b = tVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f9791a) {
            case 1:
                super.onAnimationEnd(animator);
                t tVar = this.f9792b;
                tVar.b();
                c cVar = tVar.f9800k;
                if (cVar != null) {
                    cVar.a((p) tVar.f1774a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f9791a) {
            case 0:
                super.onAnimationRepeat(animator);
                t tVar = this.f9792b;
                tVar.h = (tVar.h + 1) % tVar.f9798g.f9745c.length;
                tVar.i = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}

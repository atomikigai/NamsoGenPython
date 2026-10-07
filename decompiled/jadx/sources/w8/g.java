package w8;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f9752b;

    public /* synthetic */ g(h hVar, int i) {
        this.f9751a = i;
        this.f9752b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f9751a) {
            case 1:
                super.onAnimationEnd(animator);
                h hVar = this.f9752b;
                hVar.b();
                c cVar = hVar.f9762k;
                if (cVar != null) {
                    cVar.a((p) hVar.f1774a);
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f9751a) {
            case 0:
                super.onAnimationRepeat(animator);
                h hVar = this.f9752b;
                hVar.h = (hVar.h + 4) % hVar.f9760g.f9745c.length;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }
}

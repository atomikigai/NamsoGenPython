package g6;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.transformation.ExpandableTransformationBehavior;
import java.util.ArrayList;
import w8.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4219b;

    public /* synthetic */ m(Object obj, int i) {
        this.f4218a = i;
        this.f4219b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.f4218a) {
            case 0:
                o oVar = (o) this.f4219b;
                oVar.setEnabled(true);
                oVar.f4224a.setEnabled(true);
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4219b;
                actionBarOverlayLayout.H = null;
                actionBarOverlayLayout.f477v = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.f4218a) {
            case 0:
                o oVar = (o) this.f4219b;
                oVar.setEnabled(true);
                oVar.f4224a.setEnabled(true);
                break;
            case 1:
                g9.l lVar = (g9.l) this.f4219b;
                lVar.p();
                lVar.f4348r.start();
                break;
            case 2:
                ((HideBottomViewOnScrollBehavior) this.f4219b).h = null;
                break;
            case 3:
                ((ExpandableTransformationBehavior) this.f4219b).f2598b = null;
                break;
            case 4:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.f4219b;
                actionBarOverlayLayout.H = null;
                actionBarOverlayLayout.f477v = false;
                break;
            case 5:
                ((m2.m) this.f4219b).l();
                animator.removeListener(this);
                break;
            case 6:
                n2.e eVar = (n2.e) this.f4219b;
                ArrayList arrayList = new ArrayList(eVar.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((w8.c) arrayList.get(i)).a(eVar);
                }
                break;
            case 7:
                t8.j jVar = (t8.j) this.f4219b;
                jVar.f8652r = 0;
                jVar.f8646l = null;
                break;
            case 8:
                q5.d dVar = (q5.d) this.f4219b;
                if (((ValueAnimator) dVar.f8040b) == animator) {
                    dVar.f8040b = null;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
        switch (this.f4218a) {
            case 9:
                super.onAnimationRepeat(animator);
                r rVar = (r) this.f4219b;
                rVar.f9790g = (rVar.f9790g + 1) % rVar.f9789f.f9745c.length;
                rVar.h = true;
                break;
            default:
                super.onAnimationRepeat(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f4218a) {
            case 0:
                o oVar = (o) this.f4219b;
                oVar.setEnabled(false);
                oVar.f4224a.setEnabled(false);
                break;
            case 6:
                n2.e eVar = (n2.e) this.f4219b;
                ArrayList arrayList = new ArrayList(eVar.e);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((w8.c) arrayList.get(i)).b(eVar);
                }
                break;
            case 7:
                t8.j jVar = (t8.j) this.f4219b;
                jVar.f8653s.a(0, false);
                jVar.f8652r = 2;
                jVar.f8646l = animator;
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}

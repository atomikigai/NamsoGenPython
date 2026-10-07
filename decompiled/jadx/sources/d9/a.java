package d9;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.view.ViewPropertyAnimator;
import com.google.android.material.snackbar.SnackbarContentLayout;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends AnimatorListenerAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3035a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3036b;

    public /* synthetic */ a(h hVar, int i) {
        this.f3035a = i;
        this.f3036b = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f3035a) {
            case 0:
                this.f3036b.c();
                break;
            case 1:
                this.f3036b.d();
                break;
            case 2:
                this.f3036b.c();
                break;
            default:
                this.f3036b.d();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f3035a) {
            case 1:
                h hVar = this.f3036b;
                i iVar = hVar.f3066j;
                int i = hVar.f3062c;
                int i10 = hVar.f3060a;
                int i11 = i - i10;
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) iVar;
                snackbarContentLayout.f2512a.setAlpha(0.0f);
                long j4 = i10;
                ViewPropertyAnimator duration = snackbarContentLayout.f2512a.animate().alpha(1.0f).setDuration(j4);
                TimeInterpolator timeInterpolator = snackbarContentLayout.f2514c;
                long j10 = i11;
                duration.setInterpolator(timeInterpolator).setStartDelay(j10).start();
                if (snackbarContentLayout.f2513b.getVisibility() == 0) {
                    snackbarContentLayout.f2513b.setAlpha(0.0f);
                    snackbarContentLayout.f2513b.animate().alpha(1.0f).setDuration(j4).setInterpolator(timeInterpolator).setStartDelay(j10).start();
                }
                break;
            case 2:
                h hVar2 = this.f3036b;
                i iVar2 = hVar2.f3066j;
                int i12 = hVar2.f3061b;
                SnackbarContentLayout snackbarContentLayout2 = (SnackbarContentLayout) iVar2;
                snackbarContentLayout2.f2512a.setAlpha(1.0f);
                long j11 = i12;
                ViewPropertyAnimator duration2 = snackbarContentLayout2.f2512a.animate().alpha(0.0f).setDuration(j11);
                TimeInterpolator timeInterpolator2 = snackbarContentLayout2.f2514c;
                long j12 = 0;
                duration2.setInterpolator(timeInterpolator2).setStartDelay(j12).start();
                if (snackbarContentLayout2.f2513b.getVisibility() == 0) {
                    snackbarContentLayout2.f2513b.setAlpha(1.0f);
                    snackbarContentLayout2.f2513b.animate().alpha(0.0f).setDuration(j11).setInterpolator(timeInterpolator2).setStartDelay(j12).start();
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public /* synthetic */ a(h hVar, int i, int i10) {
        this.f3035a = i10;
        this.f3036b = hVar;
    }
}

package d9;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f3038b;

    public /* synthetic */ b(h hVar, int i, byte b10) {
        this.f3037a = i;
        this.f3038b = hVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.f3037a;
        h hVar = this.f3038b;
        switch (i) {
            case 0:
                hVar.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hVar.i.setScaleX(fFloatValue);
                hVar.i.setScaleY(fFloatValue);
                break;
            case 2:
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j1.a aVar = h.f3054u;
                hVar.i.setTranslationY(iIntValue);
                break;
            default:
                int iIntValue2 = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                j1.a aVar2 = h.f3054u;
                hVar.i.setTranslationY(iIntValue2);
                break;
        }
    }

    public b(h hVar, int i) {
        this.f3037a = 2;
        this.f3038b = hVar;
    }
}

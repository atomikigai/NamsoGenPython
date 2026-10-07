package g9;

import android.animation.ValueAnimator;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4335b;

    public /* synthetic */ i(Object obj, int i) {
        this.f4334a = i;
        this.f4335b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4334a) {
            case 0:
                l lVar = (l) this.f4335b;
                lVar.getClass();
                lVar.f4372d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                TextView textView = (TextView) this.f4335b;
                jc.i.e(textView, "$this_colorAnimator");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                textView.setTextColor(((Integer) animatedValue).intValue());
                return;
        }
    }
}

package q0;

import android.animation.ValueAnimator;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.ismaeldivita.chipnavigation.view.BadgeImageView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f7890c;

    public /* synthetic */ c1(PorterDuff.Mode mode, ValueAnimator valueAnimator, BadgeImageView badgeImageView) {
        this.f7888a = 1;
        this.f7889b = mode;
        this.f7890c = badgeImageView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ub.k kVar;
        float[] fArr;
        switch (this.f7888a) {
            case 0:
                ((View) ((g.h0) ((a5.b) this.f7889b).f188b).f4031d.getParent()).invalidate();
                return;
            case 1:
                PorterDuff.Mode mode = (PorterDuff.Mode) this.f7889b;
                BadgeImageView badgeImageView = (BadgeImageView) this.f7890c;
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                }
                int iIntValue = ((Integer) animatedValue).intValue();
                if (mode == null) {
                    kVar = null;
                } else {
                    badgeImageView.setColorFilter(iIntValue, mode);
                    kVar = ub.k.f9073a;
                }
                if (kVar == null) {
                    badgeImageView.setColorFilter(iIntValue);
                    return;
                }
                return;
            default:
                GradientDrawable gradientDrawable = (GradientDrawable) this.f7889b;
                sb.h hVar = (sb.h) this.f7890c;
                jc.i.e(gradientDrawable, "$this_cornerAnimation");
                jc.i.e(hVar, "this$0");
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                if (animatedValue2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
                }
                float fFloatValue = ((Float) animatedValue2).floatValue();
                if (gradientDrawable.getLayoutDirection() == 0) {
                    float f10 = hVar.f8486v;
                    fArr = new float[]{fFloatValue, fFloatValue, f10, f10, f10, f10, fFloatValue, fFloatValue};
                } else {
                    float f11 = hVar.f8486v;
                    fArr = new float[]{f11, f11, fFloatValue, fFloatValue, fFloatValue, fFloatValue, f11, f11};
                }
                gradientDrawable.setCornerRadii(fArr);
                return;
        }
    }

    public /* synthetic */ c1(Object obj, View view, int i) {
        this.f7888a = i;
        this.f7889b = obj;
        this.f7890c = view;
    }
}

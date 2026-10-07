package f9;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.textfield.TextInputLayout;
import x1.k;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3651b;

    public /* synthetic */ b(Object obj, int i) {
        this.f3650a = i;
        this.f3651b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3650a) {
            case 0:
                ((TabLayout) this.f3651b).scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
                break;
            case 1:
                ((TextInputLayout) this.f3651b).F0.k(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b9.g gVar = ((BottomSheetBehavior) this.f3651b).i;
                if (gVar != null) {
                    b9.f fVar = gVar.f1454a;
                    if (fVar.i != fFloatValue) {
                        fVar.i = fFloatValue;
                        gVar.e = true;
                        gVar.invalidateSelf();
                    }
                }
                break;
            default:
                int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
                k kVar = (k) this.f3651b;
                kVar.f10116c.setAlpha(iFloatValue);
                kVar.f10117d.setAlpha(iFloatValue);
                kVar.f10129s.invalidate();
                break;
        }
    }
}

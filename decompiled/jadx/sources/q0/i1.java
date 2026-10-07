package q0;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.PathInterpolator;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p1 f7908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d2 f7909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d2 f7910c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f7911d;
    public final /* synthetic */ View e;

    public i1(p1 p1Var, d2 d2Var, d2 d2Var2, int i, View view) {
        this.f7908a = p1Var;
        this.f7909b = d2Var;
        this.f7910c = d2Var2;
        this.f7911d = i;
        this.e = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction = valueAnimator.getAnimatedFraction();
        p1 p1Var = this.f7908a;
        o1 o1Var = p1Var.f7929a;
        o1Var.d(animatedFraction);
        d2 d2Var = this.f7909b;
        b2 b2Var = d2Var.f7892a;
        float fB = o1Var.b();
        PathInterpolator pathInterpolator = k1.e;
        int i = Build.VERSION.SDK_INT;
        v1 u1Var = i >= 30 ? new u1(d2Var) : i >= 29 ? new t1(d2Var) : new r1(d2Var);
        for (int i10 = 1; i10 <= 256; i10 <<= 1) {
            if ((this.f7911d & i10) == 0) {
                u1Var.c(i10, b2Var.f(i10));
            } else {
                h0.c cVarF = b2Var.f(i10);
                h0.c cVarF2 = this.f7910c.f7892a.f(i10);
                float f10 = 1.0f - fB;
                u1Var.c(i10, d2.e(cVarF, (int) (((double) ((cVarF.f4545a - cVarF2.f4545a) * f10)) + 0.5d), (int) (((double) ((cVarF.f4546b - cVarF2.f4546b) * f10)) + 0.5d), (int) (((double) ((cVarF.f4547c - cVarF2.f4547c) * f10)) + 0.5d), (int) (((double) ((cVarF.f4548d - cVarF2.f4548d) * f10)) + 0.5d)));
            }
        }
        k1.g(this.e, u1Var.b(), Collections.singletonList(p1Var));
    }
}

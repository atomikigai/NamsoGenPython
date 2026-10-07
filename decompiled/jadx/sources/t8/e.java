package t8;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements ValueAnimator.AnimatorUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ float f8625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f8626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float f8627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f8628d;
    public final /* synthetic */ float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f8629f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f8630g;
    public final /* synthetic */ Matrix h;
    public final /* synthetic */ j i;

    public e(j jVar, float f10, float f11, float f12, float f13, float f14, float f15, float f16, Matrix matrix) {
        this.i = jVar;
        this.f8625a = f10;
        this.f8626b = f11;
        this.f8627c = f12;
        this.f8628d = f13;
        this.e = f14;
        this.f8629f = f15;
        this.f8630g = f16;
        this.h = matrix;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        j jVar = this.i;
        jVar.f8653s.setAlpha(e8.a.b(this.f8625a, this.f8626b, 0.0f, 0.2f, fFloatValue));
        FloatingActionButton floatingActionButton = jVar.f8653s;
        float f10 = this.f8627c;
        float f11 = this.f8628d;
        floatingActionButton.setScaleX(e8.a.a(f10, f11, fFloatValue));
        jVar.f8653s.setScaleY(e8.a.a(this.e, f11, fFloatValue));
        float f12 = this.f8629f;
        float f13 = this.f8630g;
        jVar.f8650p = e8.a.a(f12, f13, fFloatValue);
        float fA = e8.a.a(f12, f13, fFloatValue);
        Matrix matrix = this.h;
        jVar.a(fA, matrix);
        jVar.f8653s.setImageMatrix(matrix);
    }
}

package t8;

import android.animation.TypeEvaluator;
import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements TypeEvaluator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f8621a = new float[9];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f8622b = new float[9];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix f8623c = new Matrix();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j f8624d;

    public d(j jVar) {
        this.f8624d = jVar;
    }

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f10, Object obj, Object obj2) {
        this.f8624d.f8650p = f10;
        float[] fArr = this.f8621a;
        ((Matrix) obj).getValues(fArr);
        float[] fArr2 = this.f8622b;
        ((Matrix) obj2).getValues(fArr2);
        for (int i = 0; i < 9; i++) {
            float f11 = fArr2[i];
            float f12 = fArr[i];
            fArr2[i] = ((f11 - f12) * f10) + f12;
        }
        Matrix matrix = this.f8623c;
        matrix.setValues(fArr2);
        return matrix;
    }
}

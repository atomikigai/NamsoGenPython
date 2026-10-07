package b9;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f1501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1502d;
    public final float e;

    public p(r rVar, float f10, float f11) {
        this.f1501c = rVar;
        this.f1502d = f10;
        this.e = f11;
    }

    @Override // b9.t
    public final void a(Matrix matrix, a9.a aVar, int i, Canvas canvas) {
        r rVar = this.f1501c;
        float f10 = rVar.f1509c;
        float f11 = this.e;
        float f12 = rVar.f1508b;
        float f13 = this.f1502d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f10 - f11, f12 - f13), 0.0f);
        Matrix matrix2 = this.f1512a;
        matrix2.set(matrix);
        matrix2.preTranslate(f13, f11);
        matrix2.preRotate(b());
        aVar.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int i10 = aVar.f254f;
        int[] iArr = a9.a.i;
        iArr[0] = i10;
        iArr[1] = aVar.e;
        iArr[2] = aVar.f253d;
        Paint paint = aVar.f252c;
        float f14 = rectF.left;
        paint.setShader(new LinearGradient(f14, rectF.top, f14, rectF.bottom, iArr, a9.a.f247j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public final float b() {
        r rVar = this.f1501c;
        return (float) Math.toDegrees(Math.atan((rVar.f1509c - this.e) / (rVar.f1508b - this.f1502d)));
    }
}

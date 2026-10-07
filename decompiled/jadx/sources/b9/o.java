package b9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q f1500c;

    public o(q qVar) {
        this.f1500c = qVar;
    }

    @Override // b9.t
    public final void a(Matrix matrix, a9.a aVar, int i, Canvas canvas) {
        q qVar = this.f1500c;
        float f10 = qVar.f1506f;
        float f11 = qVar.f1507g;
        RectF rectF = new RectF(qVar.f1503b, qVar.f1504c, qVar.f1505d, qVar.e);
        Paint paint = aVar.f251b;
        boolean z4 = f11 < 0.0f;
        Path path = aVar.f255g;
        int[] iArr = a9.a.f248k;
        if (z4) {
            iArr[0] = 0;
            iArr[1] = aVar.f254f;
            iArr[2] = aVar.e;
            iArr[3] = aVar.f253d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f10, f11);
            path.close();
            float f12 = -i;
            rectF.inset(f12, f12);
            iArr[0] = 0;
            iArr[1] = aVar.f253d;
            iArr[2] = aVar.e;
            iArr[3] = aVar.f254f;
        }
        float fWidth = rectF.width() / 2.0f;
        if (fWidth <= 0) {
            return;
        }
        float f13 = 1.0f - (i / fWidth);
        float[] fArr = a9.a.f249l;
        fArr[1] = f13;
        fArr[2] = ((1.0f - f13) / 2.0f) + f13;
        paint.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z4) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f10, f11, true, paint);
        canvas.restore();
    }
}

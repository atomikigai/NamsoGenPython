package b9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends s {
    public static final RectF h = new RectF();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f1503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f1504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1505d;
    public final float e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f1506f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f1507g;

    public q(float f10, float f11, float f12, float f13) {
        this.f1503b = f10;
        this.f1504c = f11;
        this.f1505d = f12;
        this.e = f13;
    }

    @Override // b9.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1510a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        float f10 = this.f1505d;
        float f11 = this.e;
        RectF rectF = h;
        rectF.set(this.f1503b, this.f1504c, f10, f11);
        path.arcTo(rectF, this.f1506f, this.f1507g, false);
        path.transform(matrix);
    }
}

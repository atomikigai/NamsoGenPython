package b9;

import android.graphics.Matrix;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f1508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f1509c;

    @Override // b9.s
    public final void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1510a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1508b, this.f1509c);
        path.transform(matrix);
    }
}

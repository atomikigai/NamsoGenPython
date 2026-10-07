package b9;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends t {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Matrix f1499d;

    public n(ArrayList arrayList, Matrix matrix) {
        this.f1498c = arrayList;
        this.f1499d = matrix;
    }

    @Override // b9.t
    public final void a(Matrix matrix, a9.a aVar, int i, Canvas canvas) {
        ArrayList arrayList = this.f1498c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((t) obj).a(this.f1499d, aVar, i, canvas);
        }
    }
}

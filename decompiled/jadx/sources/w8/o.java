package w8;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f9780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f9781b;

    public o(e eVar) {
        this.f9780a = eVar;
    }

    public abstract void a(Canvas canvas, Rect rect, float f10);

    public abstract void b(Canvas canvas, Paint paint, float f10, float f11, int i);

    public abstract void c(Canvas canvas, Paint paint);

    public abstract int d();

    public abstract int e();
}

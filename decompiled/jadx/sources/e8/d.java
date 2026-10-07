package e8;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Property {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3496a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f3497b;

    public /* synthetic */ d(Class cls, String str) {
        super(cls, str);
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f3496a) {
            case 0:
                Matrix matrix = (Matrix) this.f3497b;
                matrix.set(((ImageView) obj).getImageMatrix());
                return matrix;
            default:
                Rect rect = (Rect) this.f3497b;
                ((Drawable) obj).copyBounds(rect);
                return new PointF(rect.left, rect.top);
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f3496a) {
            case 0:
                ((ImageView) obj).setImageMatrix((Matrix) obj2);
                break;
            default:
                Drawable drawable = (Drawable) obj;
                PointF pointF = (PointF) obj2;
                Rect rect = (Rect) this.f3497b;
                drawable.copyBounds(rect);
                rect.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
                drawable.setBounds(rect);
                break;
        }
    }

    public d() {
        super(Matrix.class, "imageMatrixProperty");
        this.f3497b = new Matrix();
    }
}

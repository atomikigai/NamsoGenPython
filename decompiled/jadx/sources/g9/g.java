package g9;

import android.graphics.Canvas;
import android.graphics.Region;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends h {
    @Override // b9.g
    public final void f(Canvas canvas) {
        if (this.I.f4333r.isEmpty()) {
            super.f(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.I.f4333r);
        } else {
            canvas.clipRect(this.I.f4333r, Region.Op.DIFFERENCE);
        }
        super.f(canvas);
        canvas.restore();
    }
}

package g9;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h extends b9.g {
    public static final /* synthetic */ int J = 0;
    public f I;

    @Override // b9.g, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.I = new f(this.I);
        return this;
    }

    public final void o(float f10, float f11, float f12, float f13) {
        RectF rectF = this.I.f4333r;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }
}

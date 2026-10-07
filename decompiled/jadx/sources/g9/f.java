package g9;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends b9.f {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RectF f4333r;

    public f(b9.k kVar, RectF rectF) {
        super(kVar);
        this.f4333r = rectF;
    }

    @Override // b9.f, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        g gVar = new g(this);
        gVar.I = this;
        gVar.invalidateSelf();
        return gVar;
    }

    public f(f fVar) {
        super(fVar);
        this.f4333r = fVar.f4333r;
    }
}

package f4;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import p4.n;
import w3.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AnimatedImageDrawable f3587a;

    public a(AnimatedImageDrawable animatedImageDrawable) {
        this.f3587a = animatedImageDrawable;
    }

    @Override // w3.x
    public final void b() {
        this.f3587a.stop();
        this.f3587a.clearAnimationCallbacks();
    }

    @Override // w3.x
    public final int d() {
        return n.d(Bitmap.Config.ARGB_8888) * this.f3587a.getIntrinsicHeight() * this.f3587a.getIntrinsicWidth() * 2;
    }

    @Override // w3.x
    public final Class e() {
        return Drawable.class;
    }

    @Override // w3.x
    public final Object get() {
        return this.f3587a;
    }
}

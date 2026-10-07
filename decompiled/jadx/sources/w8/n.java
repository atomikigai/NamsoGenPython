package w8;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n extends Drawable implements Animatable {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final m2.b f9770v = new m2.b(Float.class, "growFraction", 9);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f9772b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ObjectAnimator f9774d;
    public ObjectAnimator e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f9775f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f9776r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f9777s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9779u;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f9778t = new Paint();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f9773c = new a();

    public n(Context context, e eVar) {
        this.f9771a = context;
        this.f9772b = eVar;
        setAlpha(255);
    }

    public final float b() {
        e eVar = this.f9772b;
        if (eVar.e == 0 && eVar.f9747f == 0) {
            return 1.0f;
        }
        return this.f9777s;
    }

    public final boolean c() {
        ObjectAnimator objectAnimator = this.e;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final boolean d() {
        ObjectAnimator objectAnimator = this.f9774d;
        return objectAnimator != null && objectAnimator.isRunning();
    }

    public final boolean e(boolean z4, boolean z10, boolean z11) {
        a aVar = this.f9773c;
        ContentResolver contentResolver = this.f9771a.getContentResolver();
        aVar.getClass();
        return f(z4, z10, z11 && Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) > 0.0f);
    }

    public boolean f(boolean z4, boolean z10, boolean z11) {
        ObjectAnimator objectAnimator = this.f9774d;
        int i = 0;
        m2.b bVar = f9770v;
        if (objectAnimator == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, bVar, 0.0f, 1.0f);
            this.f9774d = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f9774d.setInterpolator(e8.a.f3492b);
            ObjectAnimator objectAnimator2 = this.f9774d;
            if (objectAnimator2 != null && objectAnimator2.isRunning()) {
                throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
            }
            this.f9774d = objectAnimator2;
            objectAnimator2.addListener(new m(this, i));
        }
        int i10 = 1;
        if (this.e == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, bVar, 1.0f, 0.0f);
            this.e = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.e.setInterpolator(e8.a.f3492b);
            ObjectAnimator objectAnimator3 = this.e;
            if (objectAnimator3 != null && objectAnimator3.isRunning()) {
                throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
            }
            this.e = objectAnimator3;
            objectAnimator3.addListener(new m(this, i10));
        }
        if (isVisible() || z4) {
            ObjectAnimator objectAnimator4 = z4 ? this.f9774d : this.e;
            ObjectAnimator objectAnimator5 = z4 ? this.e : this.f9774d;
            if (!z11) {
                if (objectAnimator5.isRunning()) {
                    boolean z12 = this.f9776r;
                    this.f9776r = true;
                    new ValueAnimator[]{objectAnimator5}[0].cancel();
                    this.f9776r = z12;
                }
                if (objectAnimator4.isRunning()) {
                    objectAnimator4.end();
                } else {
                    boolean z13 = this.f9776r;
                    this.f9776r = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f9776r = z13;
                }
                return super.setVisible(z4, false);
            }
            if (!z11 || !objectAnimator4.isRunning()) {
                boolean z14 = !z4 || super.setVisible(z4, false);
                e eVar = this.f9772b;
                if (!z4 ? eVar.f9747f != 0 : eVar.e != 0) {
                    boolean z15 = this.f9776r;
                    this.f9776r = true;
                    new ValueAnimator[]{objectAnimator4}[0].end();
                    this.f9776r = z15;
                    return z14;
                }
                if (z10 || !objectAnimator4.isPaused()) {
                    objectAnimator4.start();
                    return z14;
                }
                objectAnimator4.resume();
                return z14;
            }
        }
        return false;
    }

    public final void g(c cVar) {
        ArrayList arrayList = this.f9775f;
        if (arrayList == null || !arrayList.contains(cVar)) {
            return;
        }
        this.f9775f.remove(cVar);
        if (this.f9775f.isEmpty()) {
            this.f9775f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f9779u;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        return d() || c();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.f9779u = i;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.f9778t.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z10) {
        return e(z4, z10, true);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        f(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        f(false, true, false);
    }
}

package q0;

import android.view.animation.Interpolator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f7922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Interpolator f7923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f7924d;

    public o1(int i, Interpolator interpolator, long j4) {
        this.f7921a = i;
        this.f7923c = interpolator;
        this.f7924d = j4;
    }

    public long a() {
        return this.f7924d;
    }

    public float b() {
        Interpolator interpolator = this.f7923c;
        return interpolator != null ? interpolator.getInterpolation(this.f7922b) : this.f7922b;
    }

    public int c() {
        return this.f7921a;
    }

    public void d(float f10) {
        this.f7922b = f10;
    }
}

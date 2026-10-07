package e8;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f3500a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TimeInterpolator f3502c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3503d = 0;
    public int e = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f3501b = 150;

    public f(long j4) {
        this.f3500a = j4;
    }

    public final void a(ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay(this.f3500a);
        objectAnimator.setDuration(this.f3501b);
        objectAnimator.setInterpolator(b());
        objectAnimator.setRepeatCount(this.f3503d);
        objectAnimator.setRepeatMode(this.e);
    }

    public final TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.f3502c;
        return timeInterpolator != null ? timeInterpolator : a.f3492b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f3500a == fVar.f3500a && this.f3501b == fVar.f3501b && this.f3503d == fVar.f3503d && this.e == fVar.e) {
            return b().getClass().equals(fVar.b().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f3500a;
        long j10 = this.f3501b;
        return ((((b().getClass().hashCode() + (((((int) (j4 ^ (j4 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f3503d) * 31) + this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(f.class.getName());
        sb2.append('{');
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.f3500a);
        sb2.append(" duration: ");
        sb2.append(this.f3501b);
        sb2.append(" interpolator: ");
        sb2.append(b().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f3503d);
        sb2.append(" repeatMode: ");
        return u3.b.c(sb2, this.e, "}\n");
    }
}

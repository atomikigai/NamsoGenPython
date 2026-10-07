package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class p0 extends m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f3815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f3817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3818d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3819f;

    public p0(Double d10, int i, boolean z4, int i10, long j4, long j10) {
        this.f3815a = d10;
        this.f3816b = i;
        this.f3817c = z4;
        this.f3818d = i10;
        this.e = j4;
        this.f3819f = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            Double d10 = this.f3815a;
            if (d10 != null ? d10.equals(((p0) m1Var).f3815a) : ((p0) m1Var).f3815a == null) {
                p0 p0Var = (p0) m1Var;
                if (this.f3816b == p0Var.f3816b && this.f3817c == p0Var.f3817c && this.f3818d == p0Var.f3818d && this.e == p0Var.e && this.f3819f == p0Var.f3819f) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        Double d10 = this.f3815a;
        int iHashCode = ((((((((d10 == null ? 0 : d10.hashCode()) ^ 1000003) * 1000003) ^ this.f3816b) * 1000003) ^ (this.f3817c ? 1231 : 1237)) * 1000003) ^ this.f3818d) * 1000003;
        long j4 = this.e;
        long j10 = this.f3819f;
        return ((iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{batteryLevel=");
        sb2.append(this.f3815a);
        sb2.append(", batteryVelocity=");
        sb2.append(this.f3816b);
        sb2.append(", proximityOn=");
        sb2.append(this.f3817c);
        sb2.append(", orientation=");
        sb2.append(this.f3818d);
        sb2.append(", ramUsed=");
        sb2.append(this.e);
        sb2.append(", diskUsed=");
        return q1.a.l(sb2, this.f3819f, "}");
    }
}

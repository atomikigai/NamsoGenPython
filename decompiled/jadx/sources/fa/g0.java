package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3737d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f3738f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f3739g;
    public final String h;
    public final String i;

    public g0(int i, String str, int i10, long j4, long j10, boolean z4, int i11, String str2, String str3) {
        this.f3734a = i;
        this.f3735b = str;
        this.f3736c = i10;
        this.f3737d = j4;
        this.e = j10;
        this.f3738f = z4;
        this.f3739g = i11;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e1) {
            g0 g0Var = (g0) ((e1) obj);
            if (this.f3734a == g0Var.f3734a && this.f3735b.equals(g0Var.f3735b) && this.f3736c == g0Var.f3736c && this.f3737d == g0Var.f3737d && this.e == g0Var.e && this.f3738f == g0Var.f3738f && this.f3739g == g0Var.f3739g && this.h.equals(g0Var.h) && this.i.equals(g0Var.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.f3734a ^ 1000003) * 1000003) ^ this.f3735b.hashCode()) * 1000003) ^ this.f3736c) * 1000003;
        long j4 = this.f3737d;
        int i = (iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.e;
        return ((((((((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.f3738f ? 1231 : 1237)) * 1000003) ^ this.f3739g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Device{arch=");
        sb2.append(this.f3734a);
        sb2.append(", model=");
        sb2.append(this.f3735b);
        sb2.append(", cores=");
        sb2.append(this.f3736c);
        sb2.append(", ram=");
        sb2.append(this.f3737d);
        sb2.append(", diskSpace=");
        sb2.append(this.e);
        sb2.append(", simulator=");
        sb2.append(this.f3738f);
        sb2.append(", state=");
        sb2.append(this.f3739g);
        sb2.append(", manufacturer=");
        sb2.append(this.h);
        sb2.append(", modelClass=");
        return q1.a.m(sb2, this.i, "}");
    }
}

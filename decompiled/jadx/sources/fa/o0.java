package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class o0 extends i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3810d;
    public final int e;

    public o0(int i, long j4, long j10, String str, String str2) {
        this.f3807a = j4;
        this.f3808b = str;
        this.f3809c = str2;
        this.f3810d = j10;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof i1) {
            o0 o0Var = (o0) ((i1) obj);
            String str2 = o0Var.f3809c;
            if (this.f3807a == o0Var.f3807a && this.f3808b.equals(o0Var.f3808b) && ((str = this.f3809c) != null ? str.equals(str2) : str2 == null) && this.f3810d == o0Var.f3810d && this.e == o0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f3807a;
        int iHashCode = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f3808b.hashCode()) * 1000003;
        String str = this.f3809c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j10 = this.f3810d;
        return ((iHashCode2 ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Frame{pc=");
        sb2.append(this.f3807a);
        sb2.append(", symbol=");
        sb2.append(this.f3808b);
        sb2.append(", file=");
        sb2.append(this.f3809c);
        sb2.append(", offset=");
        sb2.append(this.f3810d);
        sb2.append(", importance=");
        return u3.b.c(sb2, this.e, "}");
    }
}

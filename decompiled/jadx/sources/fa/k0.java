package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k0 extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3778d;

    public k0(String str, String str2, long j4, long j10) {
        this.f3775a = j4;
        this.f3776b = j10;
        this.f3777c = str;
        this.f3778d = str2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1) {
            k0 k0Var = (k0) ((f1) obj);
            String str2 = k0Var.f3778d;
            if (this.f3775a == k0Var.f3775a && this.f3776b == k0Var.f3776b && this.f3777c.equals(k0Var.f3777c) && ((str = this.f3778d) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f3775a;
        long j10 = this.f3776b;
        int iHashCode = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f3777c.hashCode()) * 1000003;
        String str = this.f3778d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BinaryImage{baseAddress=");
        sb2.append(this.f3775a);
        sb2.append(", size=");
        sb2.append(this.f3776b);
        sb2.append(", name=");
        sb2.append(this.f3777c);
        sb2.append(", uuid=");
        return q1.a.m(sb2, this.f3778d, "}");
    }
}

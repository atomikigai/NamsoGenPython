package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class m0 extends h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3794c;

    public m0(String str, String str2, long j4) {
        this.f3792a = str;
        this.f3793b = str2;
        this.f3794c = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof h1) {
            m0 m0Var = (m0) ((h1) obj);
            if (this.f3792a.equals(m0Var.f3792a) && this.f3793b.equals(m0Var.f3793b) && this.f3794c == m0Var.f3794c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f3792a.hashCode() ^ 1000003) * 1000003) ^ this.f3793b.hashCode()) * 1000003;
        long j4 = this.f3794c;
        return iHashCode ^ ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Signal{name=");
        sb2.append(this.f3792a);
        sb2.append(", code=");
        sb2.append(this.f3793b);
        sb2.append(", address=");
        return q1.a.l(sb2, this.f3794c, "}");
    }
}

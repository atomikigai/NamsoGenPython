package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h0 extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3741a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3742b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l1 f3743c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m1 f3744d;
    public final n1 e;

    public h0(long j4, String str, l1 l1Var, m1 m1Var, n1 n1Var) {
        this.f3741a = j4;
        this.f3742b = str;
        this.f3743c = l1Var;
        this.f3744d = m1Var;
        this.e = n1Var;
    }

    public final boolean equals(Object obj) {
        n1 n1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof o1) {
            h0 h0Var = (h0) ((o1) obj);
            n1 n1Var2 = h0Var.e;
            if (this.f3741a == h0Var.f3741a && this.f3742b.equals(h0Var.f3742b) && this.f3743c.equals(h0Var.f3743c) && this.f3744d.equals(h0Var.f3744d) && ((n1Var = this.e) != null ? n1Var.equals(n1Var2) : n1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f3741a;
        int iHashCode = (((((((((int) ((j4 >>> 32) ^ j4)) ^ 1000003) * 1000003) ^ this.f3742b.hashCode()) * 1000003) ^ this.f3743c.hashCode()) * 1000003) ^ this.f3744d.hashCode()) * 1000003;
        n1 n1Var = this.e;
        return iHashCode ^ (n1Var == null ? 0 : n1Var.hashCode());
    }

    public final String toString() {
        return "Event{timestamp=" + this.f3741a + ", type=" + this.f3742b + ", app=" + this.f3743c + ", device=" + this.f3744d + ", log=" + this.e + "}";
    }
}

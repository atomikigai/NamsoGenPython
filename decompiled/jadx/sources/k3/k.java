package k3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5947d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f5948f;

    public k(boolean z4, int i, long j4, long j10, long j11, boolean z10) {
        this.f5944a = z4;
        this.f5945b = i;
        this.f5946c = j4;
        this.f5947d = j10;
        this.e = j11;
        this.f5948f = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f5944a == kVar.f5944a && this.f5945b == kVar.f5945b && this.f5946c == kVar.f5946c && this.f5947d == kVar.f5947d && this.e == kVar.e && this.f5948f == kVar.f5948f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f5948f) + ((Long.hashCode(this.e) + ((Long.hashCode(this.f5947d) + ((Long.hashCode(this.f5946c) + ((Integer.hashCode(this.f5945b) + ((Boolean.hashCode(this.f5944a) + (Boolean.hashCode(true) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "BalanceResult(ok=true, hasAccount=" + this.f5944a + ", mbLeft=" + this.f5945b + ", quotaBytes=" + this.f5946c + ", usedBytes=" + this.f5947d + ", expiresAt=" + this.e + ", stockAvailable=" + this.f5948f + ')';
    }
}

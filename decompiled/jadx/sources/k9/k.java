package k9;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f6114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6115b;

    public k(int i, long j4) {
        this.f6114a = i;
        this.f6115b = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f6114a == kVar.f6114a && this.f6115b == kVar.f6115b;
    }

    public final int hashCode() {
        int i = this.f6114a ^ 1000003;
        long j4 = this.f6115b;
        return (i * 1000003) ^ ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f6114a + ", eventTimestamp=" + this.f6115b + "}";
    }
}

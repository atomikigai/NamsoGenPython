package n9;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7349c;

    public a(long j4, long j10, long j11) {
        this.f7347a = j4;
        this.f7348b = j10;
        this.f7349c = j11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f7347a == aVar.f7347a && this.f7348b == aVar.f7348b && this.f7349c == aVar.f7349c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f7347a;
        long j10 = this.f7348b;
        int i = (((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f7349c;
        return i ^ ((int) ((j11 >>> 32) ^ j11));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StartupTime{epochMillis=");
        sb2.append(this.f7347a);
        sb2.append(", elapsedRealtime=");
        sb2.append(this.f7348b);
        sb2.append(", uptimeMillis=");
        return q1.a.l(sb2, this.f7349c, "}");
    }
}

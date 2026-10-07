package za;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f11532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f11533c;

    public a(String str, long j4, long j10) {
        this.f11531a = str;
        this.f11532b = j4;
        this.f11533c = j10;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f11531a.equals(aVar.f11531a) && this.f11532b == aVar.f11532b && this.f11533c == aVar.f11533c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f11531a.hashCode() ^ 1000003) * 1000003;
        long j4 = this.f11532b;
        long j10 = this.f11533c;
        return ((iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("InstallationTokenResult{token=");
        sb2.append(this.f11531a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f11532b);
        sb2.append(", tokenCreationTimestamp=");
        return q1.a.l(sb2, this.f11533c, "}");
    }
}

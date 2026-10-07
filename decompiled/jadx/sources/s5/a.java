package s5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f8425f = new a(10485760, 200, 10000, 604800000, 81920);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8426a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8427b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f8429d;
    public final int e;

    public a(long j4, int i, int i10, long j10, int i11) {
        this.f8426a = j4;
        this.f8427b = i;
        this.f8428c = i10;
        this.f8429d = j10;
        this.e = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f8426a == aVar.f8426a && this.f8427b == aVar.f8427b && this.f8428c == aVar.f8428c && this.f8429d == aVar.f8429d && this.e == aVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f8426a;
        int i = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ this.f8427b) * 1000003) ^ this.f8428c) * 1000003;
        long j10 = this.f8429d;
        return ((i ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb2.append(this.f8426a);
        sb2.append(", loadBatchSize=");
        sb2.append(this.f8427b);
        sb2.append(", criticalSectionEnterTimeoutMs=");
        sb2.append(this.f8428c);
        sb2.append(", eventCleanUpAge=");
        sb2.append(this.f8429d);
        sb2.append(", maxBlobByteSizePerRow=");
        return u3.b.c(sb2, this.e, "}");
    }
}

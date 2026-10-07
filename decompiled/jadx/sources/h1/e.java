package h1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f4583b;

    public e(long j4, long j10) {
        if (j10 == 0) {
            this.f4582a = 0L;
            this.f4583b = 1L;
        } else {
            this.f4582a = j4;
            this.f4583b = j10;
        }
    }

    public final String toString() {
        return this.f4582a + "/" + this.f4583b;
    }
}

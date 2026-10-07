package mc;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7115b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f7116c;

    public g(long j4, long j10) {
        this.f7114a = j4;
        if (j4 < j10) {
            long j11 = j10 % 1;
            long j12 = j4 % 1;
            long j13 = ((j11 < 0 ? j11 + 1 : j11) - (j12 < 0 ? j12 + 1 : j12)) % 1;
            j10 -= j13 < 0 ? j13 + 1 : j13;
        }
        this.f7115b = j10;
        this.f7116c = 1L;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof g)) {
            return false;
        }
        long j4 = this.f7114a;
        long j10 = this.f7115b;
        if (j4 > j10) {
            g gVar = (g) obj;
            if (gVar.f7114a > gVar.f7115b) {
                return true;
            }
        }
        g gVar2 = (g) obj;
        return j4 == gVar2.f7114a && j10 == gVar2.f7115b;
    }

    public final int hashCode() {
        long j4 = this.f7114a;
        long j10 = this.f7115b;
        if (j4 > j10) {
            return -1;
        }
        return (int) ((((long) 31) * (j4 ^ (j4 >>> 32))) + ((j10 >>> 32) ^ j10));
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new f(this.f7114a, this.f7115b, this.f7116c);
    }

    public final String toString() {
        return this.f7114a + ".." + this.f7115b;
    }
}

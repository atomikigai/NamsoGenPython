package r5;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f8175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f8176c;

    public b(long j4, long j10, Set set) {
        this.f8174a = j4;
        this.f8175b = j10;
        this.f8176c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f8174a == bVar.f8174a && this.f8175b == bVar.f8175b && this.f8176c.equals(bVar.f8176c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f8174a;
        int i = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        long j10 = this.f8175b;
        return ((i ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f8176c.hashCode();
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f8174a + ", maxAllowedDelay=" + this.f8175b + ", flags=" + this.f8176c + "}";
    }
}

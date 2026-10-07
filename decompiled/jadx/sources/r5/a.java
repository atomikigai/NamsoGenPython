package r5;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5.a f8172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f8173b;

    public a(u5.a aVar, HashMap map) {
        this.f8172a = aVar;
        this.f8173b = map;
    }

    public final long a(i5.c cVar, long j4, int i) {
        long jD = j4 - this.f8172a.d();
        b bVar = (b) this.f8173b.get(cVar);
        long j10 = bVar.f8174a;
        int i10 = i - 1;
        return Math.min(Math.max((long) (Math.pow(3.0d, i10) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) i10)))), jD), bVar.f8175b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f8172a.equals(aVar.f8172a) && this.f8173b.equals(aVar.f8173b);
    }

    public final int hashCode() {
        return ((this.f8172a.hashCode() ^ 1000003) * 1000003) ^ this.f8173b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f8172a + ", values=" + this.f8173b + "}";
    }
}

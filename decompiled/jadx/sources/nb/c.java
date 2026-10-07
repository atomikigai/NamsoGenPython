package nb;

import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Boolean f7380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Double f7381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f7382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f7383d;
    public final Long e;

    public c(Boolean bool, Double d10, Integer num, Integer num2, Long l2) {
        this.f7380a = bool;
        this.f7381b = d10;
        this.f7382c = num;
        this.f7383d = num2;
        this.e = l2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return i.a(this.f7380a, cVar.f7380a) && i.a(this.f7381b, cVar.f7381b) && i.a(this.f7382c, cVar.f7382c) && i.a(this.f7383d, cVar.f7383d) && i.a(this.e, cVar.e);
    }

    public final int hashCode() {
        Boolean bool = this.f7380a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Double d10 = this.f7381b;
        int iHashCode2 = (iHashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Integer num = this.f7382c;
        int iHashCode3 = (iHashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f7383d;
        int iHashCode4 = (iHashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l2 = this.e;
        return iHashCode4 + (l2 != null ? l2.hashCode() : 0);
    }

    public final String toString() {
        return "SessionConfigs(sessionEnabled=" + this.f7380a + ", sessionSamplingRate=" + this.f7381b + ", sessionRestartTimeout=" + this.f7382c + ", cacheDuration=" + this.f7383d + ", cacheUpdatedTime=" + this.e + ')';
    }
}

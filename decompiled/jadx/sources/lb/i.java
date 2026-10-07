package lb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f6913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f6914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f6915c;

    public i(h hVar, h hVar2, double d10) {
        jc.i.e(hVar, "performance");
        jc.i.e(hVar2, "crashlytics");
        this.f6913a = hVar;
        this.f6914b = hVar2;
        this.f6915c = d10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f6913a == iVar.f6913a && this.f6914b == iVar.f6914b && Double.valueOf(this.f6915c).equals(Double.valueOf(iVar.f6915c));
    }

    public final int hashCode() {
        return Double.hashCode(this.f6915c) + ((this.f6914b.hashCode() + (this.f6913a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "DataCollectionStatus(performance=" + this.f6913a + ", crashlytics=" + this.f6914b + ", sessionSamplingRate=" + this.f6915c + ')';
    }
}

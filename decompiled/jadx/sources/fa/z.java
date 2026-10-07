package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3890c;

    public z(String str, String str2, String str3) {
        this.f3888a = str;
        this.f3889b = str2;
        this.f3890c = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x0) {
            z zVar = (z) ((x0) obj);
            if (this.f3888a.equals(zVar.f3888a) && this.f3889b.equals(zVar.f3889b) && this.f3890c.equals(zVar.f3890c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3888a.hashCode() ^ 1000003) * 1000003) ^ this.f3889b.hashCode()) * 1000003) ^ this.f3890c.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BuildIdMappingForArch{arch=");
        sb2.append(this.f3888a);
        sb2.append(", libraryName=");
        sb2.append(this.f3889b);
        sb2.append(", buildId=");
        return q1.a.m(sb2, this.f3890c, "}");
    }
}

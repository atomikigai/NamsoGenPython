package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3856d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final aa.c f3857f;

    public u0(String str, String str2, String str3, String str4, int i, aa.c cVar) {
        if (str == null) {
            throw new NullPointerException("Null appIdentifier");
        }
        this.f3853a = str;
        if (str2 == null) {
            throw new NullPointerException("Null versionCode");
        }
        this.f3854b = str2;
        if (str3 == null) {
            throw new NullPointerException("Null versionName");
        }
        this.f3855c = str3;
        if (str4 == null) {
            throw new NullPointerException("Null installUuid");
        }
        this.f3856d = str4;
        this.e = i;
        this.f3857f = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return this.f3853a.equals(u0Var.f3853a) && this.f3854b.equals(u0Var.f3854b) && this.f3855c.equals(u0Var.f3855c) && this.f3856d.equals(u0Var.f3856d) && this.e == u0Var.e && this.f3857f.equals(u0Var.f3857f);
    }

    public final int hashCode() {
        return ((((((((((this.f3853a.hashCode() ^ 1000003) * 1000003) ^ this.f3854b.hashCode()) * 1000003) ^ this.f3855c.hashCode()) * 1000003) ^ this.f3856d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f3857f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f3853a + ", versionCode=" + this.f3854b + ", versionName=" + this.f3855c + ", installUuid=" + this.f3856d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f3857f + "}";
    }
}

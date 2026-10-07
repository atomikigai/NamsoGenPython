package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 extends p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3832a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3835d;

    public r0(String str, int i, String str2, boolean z4) {
        this.f3832a = i;
        this.f3833b = str;
        this.f3834c = str2;
        this.f3835d = z4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof p1) {
            r0 r0Var = (r0) ((p1) obj);
            if (this.f3832a == r0Var.f3832a && this.f3833b.equals(r0Var.f3833b) && this.f3834c.equals(r0Var.f3834c) && this.f3835d == r0Var.f3835d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.f3832a ^ 1000003) * 1000003) ^ this.f3833b.hashCode()) * 1000003) ^ this.f3834c.hashCode()) * 1000003) ^ (this.f3835d ? 1231 : 1237);
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f3832a + ", version=" + this.f3833b + ", buildVersion=" + this.f3834c + ", jailbroken=" + this.f3835d + "}";
    }
}

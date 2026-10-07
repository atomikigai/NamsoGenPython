package h3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4694c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4695d;

    public f1(String str, String str2, String str3, String str4) {
        this.f4692a = str;
        this.f4693b = str2;
        this.f4694c = str3;
        this.f4695d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f1)) {
            return false;
        }
        f1 f1Var = (f1) obj;
        return this.f4692a.equals(f1Var.f4692a) && this.f4693b.equals(f1Var.f4693b) && this.f4694c.equals(f1Var.f4694c) && this.f4695d.equals(f1Var.f4695d);
    }

    public final int hashCode() {
        return (Boolean.hashCode(false) + da.v.d(da.v.d(da.v.d(this.f4692a.hashCode() * 31, 31, this.f4693b), 31, this.f4694c), 31, this.f4695d)) * 31;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Mail(id=");
        sb2.append(this.f4692a);
        sb2.append(", from=");
        sb2.append(this.f4693b);
        sb2.append(", subject=");
        sb2.append(this.f4694c);
        sb2.append(", createdAt=");
        return q1.a.m(sb2, this.f4695d, ", seen=false, intro=null)");
    }
}

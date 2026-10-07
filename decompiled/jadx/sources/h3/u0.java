package h3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4855b;

    public u0(String str, String str2) {
        this.f4854a = str;
        this.f4855b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return jc.i.a(this.f4854a, u0Var.f4854a) && jc.i.a(this.f4855b, u0Var.f4855b);
    }

    public final int hashCode() {
        return this.f4855b.hashCode() + (this.f4854a.hashCode() * 31);
    }

    public final String toString() {
        return "CountryData(name=" + this.f4854a + ", flag=" + this.f4855b + ')';
    }
}

package l3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6540c;

    public d(String str, String str2, String str3) {
        jc.i.e(str, "code");
        jc.i.e(str3, "flag");
        this.f6538a = str;
        this.f6539b = str2;
        this.f6540c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jc.i.a(this.f6538a, dVar.f6538a) && jc.i.a(this.f6539b, dVar.f6539b) && jc.i.a(this.f6540c, dVar.f6540c);
    }

    public final int hashCode() {
        return this.f6540c.hashCode() + da.v.d(this.f6538a.hashCode() * 31, 31, this.f6539b);
    }

    public final String toString() {
        return "CountryItem(code=" + this.f6538a + ", name=" + this.f6539b + ", flag=" + this.f6540c + ')';
    }
}

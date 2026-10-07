package k3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5956b;

    public m(String str, String str2) {
        this.f5955a = str;
        this.f5956b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return jc.i.a(this.f5955a, mVar.f5955a) && jc.i.a(this.f5956b, mVar.f5956b);
    }

    public final int hashCode() {
        return this.f5956b.hashCode() + (this.f5955a.hashCode() * 31);
    }

    public final String toString() {
        return "Country(code=" + this.f5955a + ", name=" + this.f5956b + ')';
    }
}

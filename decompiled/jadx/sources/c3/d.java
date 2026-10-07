package c3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1737b;

    public d(String str, int i) {
        this.f1736a = str;
        this.f1737b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (this.f1737b != dVar.f1737b) {
            return false;
        }
        return this.f1736a.equals(dVar.f1736a);
    }

    public final int hashCode() {
        return (this.f1736a.hashCode() * 31) + this.f1737b;
    }
}

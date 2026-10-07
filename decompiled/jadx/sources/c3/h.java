package c3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1743b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f1743b != hVar.f1743b) {
            return false;
        }
        return this.f1742a.equals(hVar.f1742a);
    }

    public final int hashCode() {
        return u.e.d(this.f1743b) + (this.f1742a.hashCode() * 31);
    }
}

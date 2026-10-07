package k5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f6026a;

    public j(h hVar) {
        this.f6026a = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        Object obj2 = p.f6041a;
        if (obj2.equals(obj2)) {
            return this.f6026a.equals(((j) qVar).f6026a);
        }
        return false;
    }

    public final int hashCode() {
        return ((p.f6041a.hashCode() ^ 1000003) * 1000003) ^ this.f6026a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + p.f6041a + ", androidClientInfo=" + this.f6026a + "}";
    }
}

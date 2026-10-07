package i5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f5207b;

    public a(Object obj, c cVar) {
        if (obj == null) {
            throw new NullPointerException("Null payload");
        }
        this.f5206a = obj;
        this.f5207b = cVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5206a.equals(aVar.f5206a) && this.f5207b.equals(aVar.f5207b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f5207b.hashCode() ^ (((1000003 * 1000003) ^ this.f5206a.hashCode()) * 1000003);
    }

    public final String toString() {
        return "Event{code=null, payload=" + this.f5206a + ", priority=" + this.f5207b + "}";
    }
}

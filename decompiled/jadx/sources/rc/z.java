package rc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class z extends yb.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final y f8338c = new y();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8339b;

    public z() {
        super(f8338c);
        this.f8339b = "Room Invalidation Tracker Refresh";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && jc.i.a(this.f8339b, ((z) obj).f8339b);
    }

    public final int hashCode() {
        return this.f8339b.hashCode();
    }

    public final String toString() {
        return "CoroutineName(" + this.f8339b + ')';
    }
}

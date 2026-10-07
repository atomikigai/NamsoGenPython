package p0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f7781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7782b;

    public c(Object obj, Object obj2) {
        this.f7781a = obj;
        this.f7782b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f7781a, this.f7781a) && b.a(cVar.f7782b, this.f7782b);
    }

    public final int hashCode() {
        Object obj = this.f7781a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f7782b;
        return (obj2 != null ? obj2.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "Pair{" + this.f7781a + " " + this.f7782b + "}";
    }
}

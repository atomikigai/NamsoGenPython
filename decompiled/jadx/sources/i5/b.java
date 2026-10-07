package i5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5208a;

    public b(String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f5208a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f5208a.equals(((b) obj).f5208a);
    }

    public final int hashCode() {
        return this.f5208a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return q1.a.m(new StringBuilder("Encoding{name=\""), this.f5208a, "\"}");
    }
}

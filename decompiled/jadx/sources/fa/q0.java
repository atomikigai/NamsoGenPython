package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 extends n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3825a;

    public q0(String str) {
        this.f3825a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof n1)) {
            return false;
        }
        return this.f3825a.equals(((q0) ((n1) obj)).f3825a);
    }

    public final int hashCode() {
        return this.f3825a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return q1.a.m(new StringBuilder("Log{content="), this.f3825a, "}");
    }
}

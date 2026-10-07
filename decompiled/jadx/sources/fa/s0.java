package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0 extends q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3841a;

    public s0(String str) {
        this.f3841a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        return this.f3841a.equals(((s0) ((q1) obj)).f3841a);
    }

    public final int hashCode() {
        return this.f3841a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return q1.a.m(new StringBuilder("User{identifier="), this.f3841a, "}");
    }
}

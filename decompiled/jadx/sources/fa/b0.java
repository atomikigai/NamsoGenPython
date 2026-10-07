package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b0 extends b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f3690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3691b;

    public b0(t1 t1Var, String str) {
        this.f3690a = t1Var;
        this.f3691b = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof b1) {
            b0 b0Var = (b0) ((b1) obj);
            String str2 = b0Var.f3691b;
            if (this.f3690a.f3848a.equals(b0Var.f3690a) && ((str = this.f3691b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f3690a.f3848a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3691b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.f3690a);
        sb2.append(", orgId=");
        return q1.a.m(sb2, this.f3691b, "}");
    }
}

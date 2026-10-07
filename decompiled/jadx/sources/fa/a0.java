package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3682b;

    public a0(String str, String str2) {
        this.f3681a = str;
        this.f3682b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z0) {
            a0 a0Var = (a0) ((z0) obj);
            if (this.f3681a.equals(a0Var.f3681a) && this.f3682b.equals(a0Var.f3682b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3681a.hashCode() ^ 1000003) * 1000003) ^ this.f3682b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CustomAttribute{key=");
        sb2.append(this.f3681a);
        sb2.append(", value=");
        return q1.a.m(sb2, this.f3682b, "}");
    }
}

package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 extends j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f3802c;

    public n0(String str, int i, t1 t1Var) {
        this.f3800a = str;
        this.f3801b = i;
        this.f3802c = t1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j1) {
            n0 n0Var = (n0) ((j1) obj);
            if (this.f3800a.equals(n0Var.f3800a) && this.f3801b == n0Var.f3801b) {
                if (this.f3802c.f3848a.equals(n0Var.f3802c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3800a.hashCode() ^ 1000003) * 1000003) ^ this.f3801b) * 1000003) ^ this.f3802c.f3848a.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f3800a + ", importance=" + this.f3801b + ", frames=" + this.f3802c + "}";
    }
}

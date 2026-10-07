package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u0 f3845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w0 f3846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v0 f3847c;

    public t0(u0 u0Var, w0 w0Var, v0 v0Var) {
        this.f3845a = u0Var;
        this.f3846b = w0Var;
        this.f3847c = v0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t0) {
            t0 t0Var = (t0) obj;
            if (this.f3845a.equals(t0Var.f3845a) && this.f3846b.equals(t0Var.f3846b) && this.f3847c.equals(t0Var.f3847c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f3845a.hashCode() ^ 1000003) * 1000003) ^ this.f3846b.hashCode()) * 1000003) ^ this.f3847c.hashCode();
    }

    public final String toString() {
        return "StaticSessionData{appData=" + this.f3845a + ", osData=" + this.f3846b + ", deviceData=" + this.f3847c + "}";
    }
}

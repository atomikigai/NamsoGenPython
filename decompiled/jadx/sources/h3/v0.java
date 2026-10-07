package h3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f4872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f4873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f4874d;

    public v0(int i, String str, long j4, long j10) {
        jc.i.e(str, "nombre");
        this.f4871a = str;
        this.f4872b = i;
        this.f4873c = j4;
        this.f4874d = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return jc.i.a(this.f4871a, v0Var.f4871a) && this.f4872b == v0Var.f4872b && this.f4873c == v0Var.f4873c && this.f4874d == v0Var.f4874d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4874d) + ((Long.hashCode(this.f4873c) + ((Integer.hashCode(this.f4872b) + (this.f4871a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "GateConfig(nombre=" + this.f4871a + ", livePct=" + this.f4872b + ", vidaMinMs=" + this.f4873c + ", vidaMaxMs=" + this.f4874d + ')';
    }
}

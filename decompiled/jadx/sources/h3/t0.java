package h3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4848d;
    public final u0 e;

    public t0(String str, String str2, String str3, String str4, u0 u0Var) {
        this.f4845a = str;
        this.f4846b = str2;
        this.f4847c = str3;
        this.f4848d = str4;
        this.e = u0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.f4845a.equals(t0Var.f4845a) && this.f4846b.equals(t0Var.f4846b) && this.f4847c.equals(t0Var.f4847c) && this.f4848d.equals(t0Var.f4848d) && this.e.equals(t0Var.e);
    }

    public final int hashCode() {
        int iD = da.v.d(da.v.d(da.v.d(da.v.d(502856090, 31, this.f4845a), 31, this.f4846b), 31, this.f4847c), 31, this.f4848d);
        u0 u0Var = this.e;
        return Boolean.hashCode(false) + ((iD + (u0Var == null ? 0 : u0Var.hashCode())) * 31);
    }

    public final String toString() {
        return "BinData(status=Active, scheme=" + this.f4845a + ", type=" + this.f4846b + ", issuer=" + this.f4847c + ", cardTier=" + this.f4848d + ", country=" + this.e + ", luhn=false)";
    }
}

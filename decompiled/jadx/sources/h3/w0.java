package h3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f4885c;

    public w0(String str, String str2, t0 t0Var) {
        jc.i.e(str, "tarjeta");
        jc.i.e(str2, "status");
        this.f4883a = str;
        this.f4884b = str2;
        this.f4885c = t0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return jc.i.a(this.f4883a, w0Var.f4883a) && jc.i.a(this.f4884b, w0Var.f4884b) && jc.i.a(this.f4885c, w0Var.f4885c);
    }

    public final int hashCode() {
        int iD = da.v.d(this.f4883a.hashCode() * 31, 31, this.f4884b);
        t0 t0Var = this.f4885c;
        return iD + (t0Var == null ? 0 : t0Var.hashCode());
    }

    public final String toString() {
        return "TarjetaResultado(tarjeta=" + this.f4883a + ", status=" + this.f4884b + ", binData=" + this.f4885c + ')';
    }
}

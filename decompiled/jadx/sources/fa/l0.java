package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 extends g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f3785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g1 f3786d;
    public final int e;

    public l0(String str, String str2, t1 t1Var, g1 g1Var, int i) {
        this.f3783a = str;
        this.f3784b = str2;
        this.f3785c = t1Var;
        this.f3786d = g1Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        g1 g1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof g1) {
            l0 l0Var = (l0) ((g1) obj);
            g1 g1Var2 = l0Var.f3786d;
            String str2 = l0Var.f3784b;
            if (this.f3783a.equals(l0Var.f3783a) && ((str = this.f3784b) != null ? str.equals(str2) : str2 == null)) {
                if (this.f3785c.f3848a.equals(l0Var.f3785c) && ((g1Var = this.f3786d) != null ? g1Var.equals(g1Var2) : g1Var2 == null) && this.e == l0Var.e) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f3783a.hashCode() ^ 1000003) * 1000003;
        String str = this.f3784b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f3785c.f3848a.hashCode()) * 1000003;
        g1 g1Var = this.f3786d;
        return ((iHashCode2 ^ (g1Var != null ? g1Var.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.f3783a);
        sb2.append(", reason=");
        sb2.append(this.f3784b);
        sb2.append(", frames=");
        sb2.append(this.f3785c);
        sb2.append(", causedBy=");
        sb2.append(this.f3786d);
        sb2.append(", overflowCount=");
        return u3.b.c(sb2, this.e, "}");
    }
}

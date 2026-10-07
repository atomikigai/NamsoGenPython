package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k1 f3752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t1 f3753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f3754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Boolean f3755d;
    public final int e;

    public i0(k1 k1Var, t1 t1Var, t1 t1Var2, Boolean bool, int i) {
        this.f3752a = k1Var;
        this.f3753b = t1Var;
        this.f3754c = t1Var2;
        this.f3755d = bool;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        t1 t1Var;
        t1 t1Var2;
        Boolean bool;
        if (obj == this) {
            return true;
        }
        if (obj instanceof l1) {
            i0 i0Var = (i0) ((l1) obj);
            Boolean bool2 = i0Var.f3755d;
            t1 t1Var3 = i0Var.f3754c;
            t1 t1Var4 = i0Var.f3753b;
            if (this.f3752a.equals(i0Var.f3752a) && ((t1Var = this.f3753b) != null ? t1Var.f3848a.equals(t1Var4) : t1Var4 == null) && ((t1Var2 = this.f3754c) != null ? t1Var2.f3848a.equals(t1Var3) : t1Var3 == null) && ((bool = this.f3755d) != null ? bool.equals(bool2) : bool2 == null) && this.e == i0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f3752a.hashCode() ^ 1000003) * 1000003;
        t1 t1Var = this.f3753b;
        int iHashCode2 = (iHashCode ^ (t1Var == null ? 0 : t1Var.f3848a.hashCode())) * 1000003;
        t1 t1Var2 = this.f3754c;
        int iHashCode3 = (iHashCode2 ^ (t1Var2 == null ? 0 : t1Var2.f3848a.hashCode())) * 1000003;
        Boolean bool = this.f3755d;
        return ((iHashCode3 ^ (bool != null ? bool.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.f3752a);
        sb2.append(", customAttributes=");
        sb2.append(this.f3753b);
        sb2.append(", internalKeys=");
        sb2.append(this.f3754c);
        sb2.append(", background=");
        sb2.append(this.f3755d);
        sb2.append(", uiOrientation=");
        return u3.b.c(sb2, this.e, "}");
    }
}

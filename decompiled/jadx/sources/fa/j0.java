package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j0 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f3766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g1 f3767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0 f3768c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h1 f3769d;
    public final t1 e;

    public j0(t1 t1Var, l0 l0Var, y0 y0Var, m0 m0Var, t1 t1Var2) {
        this.f3766a = t1Var;
        this.f3767b = l0Var;
        this.f3768c = y0Var;
        this.f3769d = m0Var;
        this.e = t1Var2;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0024  */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x005e  */
    /* JADX WARN: Code duplicated, block: B:32:0x006a A[RETURN] */
    public final boolean equals(Object obj) {
        g1 g1Var;
        y0 y0Var;
        j0 j0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            t1 t1Var = this.f3766a;
            if (t1Var != null) {
                if (t1Var.f3848a.equals(((j0) k1Var).f3766a)) {
                    g1Var = this.f3767b;
                    if (g1Var == null) {
                        y0Var = this.f3768c;
                        if (y0Var == null) {
                            j0Var = (j0) k1Var;
                            if (this.f3769d.equals(j0Var.f3769d)) {
                                if (this.e.f3848a.equals(j0Var.e)) {
                                    return true;
                                }
                            }
                        } else {
                            j0Var = (j0) k1Var;
                            if (this.f3769d.equals(j0Var.f3769d)) {
                                if (this.e.f3848a.equals(j0Var.e)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        y0Var = this.f3768c;
                        if (y0Var == null) {
                            j0Var = (j0) k1Var;
                            if (this.f3769d.equals(j0Var.f3769d)) {
                                if (this.e.f3848a.equals(j0Var.e)) {
                                    return true;
                                }
                            }
                        } else {
                            j0Var = (j0) k1Var;
                            if (this.f3769d.equals(j0Var.f3769d)) {
                                if (this.e.f3848a.equals(j0Var.e)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            } else if (((j0) k1Var).f3766a == null) {
                g1Var = this.f3767b;
                if (g1Var == null ? g1Var.equals(((j0) k1Var).f3767b) : ((j0) k1Var).f3767b == null) {
                    y0Var = this.f3768c;
                    if (y0Var == null ? y0Var.equals(((j0) k1Var).f3768c) : ((j0) k1Var).f3768c == null) {
                        j0Var = (j0) k1Var;
                        if (this.f3769d.equals(j0Var.f3769d)) {
                            if (this.e.f3848a.equals(j0Var.e)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        t1 t1Var = this.f3766a;
        int iHashCode = ((t1Var == null ? 0 : t1Var.f3848a.hashCode()) ^ 1000003) * 1000003;
        g1 g1Var = this.f3767b;
        int iHashCode2 = (iHashCode ^ (g1Var == null ? 0 : g1Var.hashCode())) * 1000003;
        y0 y0Var = this.f3768c;
        return (((((y0Var != null ? y0Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.f3769d.hashCode()) * 1000003) ^ this.e.f3848a.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f3766a + ", exception=" + this.f3767b + ", appExitInfo=" + this.f3768c + ", signal=" + this.f3769d + ", binaries=" + this.e + "}";
    }
}

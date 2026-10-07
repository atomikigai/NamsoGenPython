package k5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f6039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f6040b;

    public n(u uVar, t tVar) {
        this.f6039a = uVar;
        this.f6040b = tVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof v) {
            v vVar = (v) obj;
            u uVar = this.f6039a;
            if (uVar != null ? uVar.equals(((n) vVar).f6039a) : ((n) vVar).f6039a == null) {
                t tVar = this.f6040b;
                if (tVar != null ? tVar.equals(((n) vVar).f6040b) : ((n) vVar).f6040b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        u uVar = this.f6039a;
        int iHashCode = ((uVar == null ? 0 : uVar.hashCode()) ^ 1000003) * 1000003;
        t tVar = this.f6040b;
        return (tVar != null ? tVar.hashCode() : 0) ^ iHashCode;
    }

    public final String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f6039a + ", mobileSubtype=" + this.f6040b + "}";
    }
}

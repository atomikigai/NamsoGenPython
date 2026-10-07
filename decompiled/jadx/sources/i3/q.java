package i3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f5197b;

    public q(String str, long j4) {
        jc.i.e(str, "email");
        this.f5196a = str;
        this.f5197b = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return jc.i.a(this.f5196a, qVar.f5196a) && this.f5197b == qVar.f5197b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5197b) + (this.f5196a.hashCode() * 31);
    }

    public final String toString() {
        return "TempMailHistory(email=" + this.f5196a + ", createdAt=" + this.f5197b + ')';
    }
}

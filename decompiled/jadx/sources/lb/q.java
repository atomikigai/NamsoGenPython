package lb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6939b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6940c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6941d;

    public q(long j4, String str, String str2, int i) {
        jc.i.e(str, "sessionId");
        jc.i.e(str2, "firstSessionId");
        this.f6938a = str;
        this.f6939b = str2;
        this.f6940c = i;
        this.f6941d = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return jc.i.a(this.f6938a, qVar.f6938a) && jc.i.a(this.f6939b, qVar.f6939b) && this.f6940c == qVar.f6940c && this.f6941d == qVar.f6941d;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6941d) + ((Integer.hashCode(this.f6940c) + da.v.d(this.f6938a.hashCode() * 31, 31, this.f6939b)) * 31);
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f6938a + ", firstSessionId=" + this.f6939b + ", sessionIndex=" + this.f6940c + ", sessionStartTimestampUs=" + this.f6941d + ')';
    }
}

package lb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6954d;
    public final i e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f6955f;

    public v(String str, String str2, int i, long j4, i iVar) {
        jc.i.e(str, "sessionId");
        jc.i.e(str2, "firstSessionId");
        this.f6951a = str;
        this.f6952b = str2;
        this.f6953c = i;
        this.f6954d = j4;
        this.e = iVar;
        this.f6955f = "";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return jc.i.a(this.f6951a, vVar.f6951a) && jc.i.a(this.f6952b, vVar.f6952b) && this.f6953c == vVar.f6953c && this.f6954d == vVar.f6954d && jc.i.a(this.e, vVar.e) && jc.i.a(this.f6955f, vVar.f6955f);
    }

    public final int hashCode() {
        return this.f6955f.hashCode() + ((this.e.hashCode() + ((Long.hashCode(this.f6954d) + ((Integer.hashCode(this.f6953c) + da.v.d(this.f6951a.hashCode() * 31, 31, this.f6952b)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f6951a + ", firstSessionId=" + this.f6952b + ", sessionIndex=" + this.f6953c + ", eventTimestampUs=" + this.f6954d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f6955f + ')';
    }
}

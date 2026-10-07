package m5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f7061b;

    public a(int i, long j4) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.f7060a = i;
        this.f7061b = j4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return u.e.a(this.f7060a, aVar.f7060a) && this.f7061b == aVar.f7061b;
    }

    public final int hashCode() {
        int iD = (u.e.d(this.f7060a) ^ 1000003) * 1000003;
        long j4 = this.f7061b;
        return iD ^ ((int) ((j4 >>> 32) ^ j4));
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BackendResponse{status=");
        int i = this.f7060a;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb2.append(str);
        sb2.append(", nextRequestWaitMillis=");
        return q1.a.l(sb2, this.f7061b, "}");
    }
}

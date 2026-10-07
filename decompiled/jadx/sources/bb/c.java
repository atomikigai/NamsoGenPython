package bb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1527a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1528b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1529c;

    public c(String str, long j4, int i) {
        this.f1527a = str;
        this.f1528b = j4;
        this.f1529c = i;
    }

    public static b a() {
        b bVar = new b();
        bVar.f1526d = 0L;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        int i = cVar.f1529c;
        String str = cVar.f1527a;
        String str2 = this.f1527a;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        if (this.f1528b != cVar.f1528b) {
            return false;
        }
        int i10 = this.f1529c;
        if (i10 == 0) {
            return i == 0;
        }
        return u.e.a(i10, i);
    }

    public final int hashCode() {
        String str = this.f1527a;
        int iHashCode = str == null ? 0 : str.hashCode();
        long j4 = this.f1528b;
        int i = (((iHashCode ^ 1000003) * 1000003) ^ ((int) ((j4 >>> 32) ^ j4))) * 1000003;
        int i10 = this.f1529c;
        return (i10 != 0 ? u.e.d(i10) : 0) ^ i;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("TokenResult{token=");
        sb2.append(this.f1527a);
        sb2.append(", tokenExpirationTimestamp=");
        sb2.append(this.f1528b);
        sb2.append(", responseCode=");
        int i = this.f1529c;
        if (i == 1) {
            str = "OK";
        } else if (i != 2) {
            str = i != 3 ? "null" : "AUTH_ERROR";
        } else {
            str = "BAD_CONFIG";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}

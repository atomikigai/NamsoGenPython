package bb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f1521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c f1522d;
    public final int e;

    public a(String str, String str2, String str3, c cVar, int i) {
        this.f1519a = str;
        this.f1520b = str2;
        this.f1521c = str3;
        this.f1522d = cVar;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i = aVar.e;
        c cVar = aVar.f1522d;
        String str = aVar.f1521c;
        String str2 = aVar.f1520b;
        String str3 = aVar.f1519a;
        String str4 = this.f1519a;
        if (str4 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str4.equals(str3)) {
            return false;
        }
        String str5 = this.f1520b;
        if (str5 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str5.equals(str2)) {
            return false;
        }
        String str6 = this.f1521c;
        if (str6 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str6.equals(str)) {
            return false;
        }
        c cVar2 = this.f1522d;
        if (cVar2 == null) {
            if (cVar != null) {
                return false;
            }
        } else if (!cVar2.equals(cVar)) {
            return false;
        }
        int i10 = this.e;
        if (i10 == 0) {
            return i == 0;
        }
        return u.e.a(i10, i);
    }

    public final int hashCode() {
        String str = this.f1519a;
        int iHashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f1520b;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f1521c;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        c cVar = this.f1522d;
        int iHashCode4 = (iHashCode3 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        int i = this.e;
        return (i != 0 ? u.e.d(i) : 0) ^ iHashCode4;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("InstallationResponse{uri=");
        sb2.append(this.f1519a);
        sb2.append(", fid=");
        sb2.append(this.f1520b);
        sb2.append(", refreshToken=");
        sb2.append(this.f1521c);
        sb2.append(", authToken=");
        sb2.append(this.f1522d);
        sb2.append(", responseCode=");
        int i = this.e;
        if (i != 1) {
            str = i != 2 ? "null" : "BAD_CONFIG";
        } else {
            str = "OK";
        }
        sb2.append(str);
        sb2.append("}");
        return sb2.toString();
    }
}

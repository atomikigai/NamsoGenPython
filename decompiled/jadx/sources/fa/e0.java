package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f3723d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3724f;

    public e0(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f3720a = str;
        this.f3721b = str2;
        this.f3722c = str3;
        this.f3723d = str4;
        this.e = str5;
        this.f3724f = str6;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (obj instanceof d1) {
            e0 e0Var = (e0) ((d1) obj);
            String str5 = e0Var.f3724f;
            String str6 = e0Var.e;
            String str7 = e0Var.f3723d;
            String str8 = e0Var.f3722c;
            if (this.f3720a.equals(e0Var.f3720a) && this.f3721b.equals(e0Var.f3721b) && ((str = this.f3722c) != null ? str.equals(str8) : str8 == null) && ((str2 = this.f3723d) != null ? str2.equals(str7) : str7 == null) && ((str3 = this.e) != null ? str3.equals(str6) : str6 == null) && ((str4 = this.f3724f) != null ? str4.equals(str5) : str5 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((this.f3720a.hashCode() ^ 1000003) * 1000003) ^ this.f3721b.hashCode()) * 1000003;
        String str = this.f3722c;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * (-721379959);
        String str2 = this.f3723d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f3724f;
        return iHashCode4 ^ (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{identifier=");
        sb2.append(this.f3720a);
        sb2.append(", version=");
        sb2.append(this.f3721b);
        sb2.append(", displayVersion=");
        sb2.append(this.f3722c);
        sb2.append(", organization=null, installationUuid=");
        sb2.append(this.f3723d);
        sb2.append(", developmentPlatform=");
        sb2.append(this.e);
        sb2.append(", developmentPlatformVersion=");
        return q1.a.m(sb2, this.f3724f, "}");
    }
}

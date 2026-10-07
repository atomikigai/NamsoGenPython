package ab;

import u.e;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f275d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f277g;

    public b(String str, int i, String str2, String str3, long j4, long j10, String str4) {
        this.f272a = str;
        this.f273b = i;
        this.f274c = str2;
        this.f275d = str3;
        this.e = j4;
        this.f276f = j10;
        this.f277g = str4;
    }

    public final a a() {
        a aVar = new a();
        aVar.f267b = this.f272a;
        aVar.f266a = this.f273b;
        aVar.f268c = this.f274c;
        aVar.f269d = this.f275d;
        aVar.f270f = Long.valueOf(this.e);
        aVar.f271g = Long.valueOf(this.f276f);
        aVar.e = this.f277g;
        return aVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        String str = bVar.f277g;
        String str2 = bVar.f275d;
        String str3 = bVar.f274c;
        String str4 = bVar.f272a;
        String str5 = this.f272a;
        if (str5 == null) {
            if (str4 != null) {
                return false;
            }
        } else if (!str5.equals(str4)) {
            return false;
        }
        if (!e.a(this.f273b, bVar.f273b)) {
            return false;
        }
        String str6 = this.f274c;
        if (str6 == null) {
            if (str3 != null) {
                return false;
            }
        } else if (!str6.equals(str3)) {
            return false;
        }
        String str7 = this.f275d;
        if (str7 == null) {
            if (str2 != null) {
                return false;
            }
        } else if (!str7.equals(str2)) {
            return false;
        }
        if (this.e != bVar.e || this.f276f != bVar.f276f) {
            return false;
        }
        String str8 = this.f277g;
        if (str8 == null) {
            return str == null;
        }
        return str8.equals(str);
    }

    public final int hashCode() {
        String str = this.f272a;
        int iHashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ e.d(this.f273b)) * 1000003;
        String str2 = this.f274c;
        int iHashCode2 = (iHashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f275d;
        int iHashCode3 = (iHashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        long j4 = this.e;
        int i = (iHashCode3 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.f276f;
        int i10 = (i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        String str4 = this.f277g;
        return (str4 != null ? str4.hashCode() : 0) ^ i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.f272a);
        sb2.append(", registrationStatus=");
        int i = this.f273b;
        if (i == 1) {
            str = "ATTEMPT_MIGRATION";
        } else if (i == 2) {
            str = "NOT_GENERATED";
        } else if (i == 3) {
            str = "UNREGISTERED";
        } else if (i != 4) {
            str = i != 5 ? "null" : "REGISTER_ERROR";
        } else {
            str = "REGISTERED";
        }
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.f274c);
        sb2.append(", refreshToken=");
        sb2.append(this.f275d);
        sb2.append(", expiresInSecs=");
        sb2.append(this.e);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.f276f);
        sb2.append(", fisError=");
        return q1.a.m(sb2, this.f277g, "}");
    }
}

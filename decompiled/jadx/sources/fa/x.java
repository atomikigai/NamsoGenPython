package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class x extends s1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3875c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3876d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f3877f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f3878g;
    public final String h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r1 f3879j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b1 f3880k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f3881l;

    public x(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, r1 r1Var, b1 b1Var, y0 y0Var) {
        this.f3874b = str;
        this.f3875c = str2;
        this.f3876d = i;
        this.e = str3;
        this.f3877f = str4;
        this.f3878g = str5;
        this.h = str6;
        this.i = str7;
        this.f3879j = r1Var;
        this.f3880k = b1Var;
        this.f3881l = y0Var;
    }

    public final w a() {
        w wVar = new w();
        wVar.f3865a = this.f3874b;
        wVar.f3866b = this.f3875c;
        wVar.h = Integer.valueOf(this.f3876d);
        wVar.f3867c = this.e;
        wVar.f3868d = this.f3877f;
        wVar.e = this.f3878g;
        wVar.f3869f = this.h;
        wVar.f3870g = this.i;
        wVar.i = this.f3879j;
        wVar.f3871j = this.f3880k;
        wVar.f3872k = this.f3881l;
        return wVar;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        r1 r1Var;
        b1 b1Var;
        y0 y0Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof s1) {
            x xVar = (x) ((s1) obj);
            y0 y0Var2 = xVar.f3881l;
            b1 b1Var2 = xVar.f3880k;
            r1 r1Var2 = xVar.f3879j;
            String str3 = xVar.f3878g;
            String str4 = xVar.f3877f;
            if (this.f3874b.equals(xVar.f3874b) && this.f3875c.equals(xVar.f3875c) && this.f3876d == xVar.f3876d && this.e.equals(xVar.e) && ((str = this.f3877f) != null ? str.equals(str4) : str4 == null) && ((str2 = this.f3878g) != null ? str2.equals(str3) : str3 == null) && this.h.equals(xVar.h) && this.i.equals(xVar.i) && ((r1Var = this.f3879j) != null ? r1Var.equals(r1Var2) : r1Var2 == null) && ((b1Var = this.f3880k) != null ? b1Var.equals(b1Var2) : b1Var2 == null) && ((y0Var = this.f3881l) != null ? y0Var.equals(y0Var2) : y0Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f3874b.hashCode() ^ 1000003) * 1000003) ^ this.f3875c.hashCode()) * 1000003) ^ this.f3876d) * 1000003) ^ this.e.hashCode()) * 1000003;
        String str = this.f3877f;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f3878g;
        int iHashCode3 = (((((iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        r1 r1Var = this.f3879j;
        int iHashCode4 = (iHashCode3 ^ (r1Var == null ? 0 : r1Var.hashCode())) * 1000003;
        b1 b1Var = this.f3880k;
        int iHashCode5 = (iHashCode4 ^ (b1Var == null ? 0 : b1Var.hashCode())) * 1000003;
        y0 y0Var = this.f3881l;
        return iHashCode5 ^ (y0Var != null ? y0Var.hashCode() : 0);
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f3874b + ", gmpAppId=" + this.f3875c + ", platform=" + this.f3876d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f3877f + ", appQualitySessionId=" + this.f3878g + ", buildVersion=" + this.h + ", displayVersion=" + this.i + ", session=" + this.f3879j + ", ndkPayload=" + this.f3880k + ", appExitInfo=" + this.f3881l + "}";
    }
}

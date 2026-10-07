package fa;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f3885d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f3886f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f3887g;
    public final String h;
    public final t1 i;

    public y(int i, String str, int i10, int i11, long j4, long j10, long j11, String str2, t1 t1Var) {
        this.f3882a = i;
        this.f3883b = str;
        this.f3884c = i10;
        this.f3885d = i11;
        this.e = j4;
        this.f3886f = j10;
        this.f3887g = j11;
        this.h = str2;
        this.i = t1Var;
    }

    public final boolean equals(Object obj) {
        String str;
        t1 t1Var;
        if (obj == this) {
            return true;
        }
        if (obj instanceof y0) {
            y yVar = (y) ((y0) obj);
            t1 t1Var2 = yVar.i;
            String str2 = yVar.h;
            if (this.f3882a == yVar.f3882a && this.f3883b.equals(yVar.f3883b) && this.f3884c == yVar.f3884c && this.f3885d == yVar.f3885d && this.e == yVar.e && this.f3886f == yVar.f3886f && this.f3887g == yVar.f3887g && ((str = this.h) != null ? str.equals(str2) : str2 == null) && ((t1Var = this.i) != null ? t1Var.f3848a.equals(t1Var2) : t1Var2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((this.f3882a ^ 1000003) * 1000003) ^ this.f3883b.hashCode()) * 1000003) ^ this.f3884c) * 1000003) ^ this.f3885d) * 1000003;
        long j4 = this.e;
        int i = (iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.f3886f;
        int i10 = (i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        long j11 = this.f3887g;
        int i11 = (i10 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str = this.h;
        int iHashCode2 = (i11 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        t1 t1Var = this.i;
        return iHashCode2 ^ (t1Var != null ? t1Var.f3848a.hashCode() : 0);
    }

    public final String toString() {
        return "ApplicationExitInfo{pid=" + this.f3882a + ", processName=" + this.f3883b + ", reasonCode=" + this.f3884c + ", importance=" + this.f3885d + ", pss=" + this.e + ", rss=" + this.f3886f + ", timestamp=" + this.f3887g + ", traceFile=" + this.h + ", buildIdMappingForArch=" + this.i + "}";
    }
}

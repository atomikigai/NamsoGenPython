package k3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5952d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f5953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f5954g;
    public final boolean h;
    public final String i;

    public l(boolean z4, int i, int i10, int i11, long j4, long j10, long j11, boolean z10, String str, int i12) {
        i = (i12 & 2) != 0 ? 0 : i;
        i10 = (i12 & 4) != 0 ? 0 : i10;
        int i13 = (i12 & 8) != 0 ? 0 : i11;
        long j12 = (i12 & 16) != 0 ? 0L : j4;
        long j13 = (i12 & 32) != 0 ? 0L : j10;
        long j14 = (i12 & 64) == 0 ? j11 : 0L;
        boolean z11 = (i12 & 128) == 0 ? z10 : false;
        String str2 = (i12 & 256) != 0 ? null : str;
        this.f5949a = z4;
        this.f5950b = i;
        this.f5951c = i10;
        this.f5952d = i13;
        this.e = j12;
        this.f5953f = j13;
        this.f5954g = j14;
        this.h = z11;
        this.i = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f5949a == lVar.f5949a && this.f5950b == lVar.f5950b && this.f5951c == lVar.f5951c && this.f5952d == lVar.f5952d && this.e == lVar.e && this.f5953f == lVar.f5953f && this.f5954g == lVar.f5954g && this.h == lVar.h && jc.i.a(this.i, lVar.i);
    }

    public final int hashCode() {
        int iHashCode = (Boolean.hashCode(this.h) + ((Long.hashCode(this.f5954g) + ((Long.hashCode(this.f5953f) + ((Long.hashCode(this.e) + ((Integer.hashCode(this.f5952d) + ((Integer.hashCode(this.f5951c) + ((Integer.hashCode(this.f5950b) + (Boolean.hashCode(this.f5949a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31;
        String str = this.i;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "BuyResult(ok=" + this.f5949a + ", mbAdded=" + this.f5950b + ", mbTotal=" + this.f5951c + ", mbLeft=" + this.f5952d + ", quotaBytes=" + this.e + ", usedBytes=" + this.f5953f + ", expiresAt=" + this.f5954g + ", alreadyCredited=" + this.h + ", error=" + this.i + ')';
    }
}

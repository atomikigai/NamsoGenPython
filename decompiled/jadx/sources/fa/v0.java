package fa;

import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f3862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f3863d;
    public final boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f3864f;

    public v0(int i, int i10, long j4, long j10, boolean z4, int i11) {
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        String str3 = Build.PRODUCT;
        this.f3860a = i;
        if (str == null) {
            throw new NullPointerException("Null model");
        }
        this.f3861b = i10;
        this.f3862c = j4;
        this.f3863d = j10;
        this.e = z4;
        this.f3864f = i11;
        if (str2 == null) {
            throw new NullPointerException("Null manufacturer");
        }
        if (str3 == null) {
            throw new NullPointerException("Null modelClass");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (this.f3860a != v0Var.f3860a) {
            return false;
        }
        String str = Build.MODEL;
        if (!str.equals(str) || this.f3861b != v0Var.f3861b || this.f3862c != v0Var.f3862c || this.f3863d != v0Var.f3863d || this.e != v0Var.e || this.f3864f != v0Var.f3864f) {
            return false;
        }
        String str2 = Build.MANUFACTURER;
        if (!str2.equals(str2)) {
            return false;
        }
        String str3 = Build.PRODUCT;
        return str3.equals(str3);
    }

    public final int hashCode() {
        int iHashCode = (((((this.f3860a ^ 1000003) * 1000003) ^ Build.MODEL.hashCode()) * 1000003) ^ this.f3861b) * 1000003;
        long j4 = this.f3862c;
        int i = (iHashCode ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.f3863d;
        return ((((((((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003) ^ this.f3864f) * 1000003) ^ Build.MANUFACTURER.hashCode()) * 1000003) ^ Build.PRODUCT.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeviceData{arch=");
        sb2.append(this.f3860a);
        sb2.append(", model=");
        sb2.append(Build.MODEL);
        sb2.append(", availableProcessors=");
        sb2.append(this.f3861b);
        sb2.append(", totalRam=");
        sb2.append(this.f3862c);
        sb2.append(", diskSpace=");
        sb2.append(this.f3863d);
        sb2.append(", isEmulator=");
        sb2.append(this.e);
        sb2.append(", state=");
        sb2.append(this.f3864f);
        sb2.append(", manufacturer=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(", modelClass=");
        return q1.a.m(sb2, Build.PRODUCT, "}");
    }
}

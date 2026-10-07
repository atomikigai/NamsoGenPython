package k5;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6028b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f6029c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f6030d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f6031f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final v f6032g;

    public k(long j4, Integer num, long j10, byte[] bArr, String str, long j11, v vVar) {
        this.f6027a = j4;
        this.f6028b = num;
        this.f6029c = j10;
        this.f6030d = bArr;
        this.e = str;
        this.f6031f = j11;
        this.f6032g = vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        String str;
        v vVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            k kVar = (k) rVar;
            v vVar2 = kVar.f6032g;
            String str2 = kVar.e;
            Integer num2 = kVar.f6028b;
            if (this.f6027a == kVar.f6027a && ((num = this.f6028b) != null ? num.equals(num2) : num2 == null) && this.f6029c == kVar.f6029c) {
                if (Arrays.equals(this.f6030d, rVar instanceof k ? ((k) rVar).f6030d : kVar.f6030d) && ((str = this.e) != null ? str.equals(str2) : str2 == null) && this.f6031f == kVar.f6031f && ((vVar = this.f6032g) != null ? vVar.equals(vVar2) : vVar2 == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f6027a;
        int i = (((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f6028b;
        int iHashCode = (i ^ (num == null ? 0 : num.hashCode())) * 1000003;
        long j10 = this.f6029c;
        int iHashCode2 = (((iHashCode ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f6030d)) * 1000003;
        String str = this.e;
        int iHashCode3 = (iHashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        long j11 = this.f6031f;
        int i10 = (iHashCode3 ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        v vVar = this.f6032g;
        return i10 ^ (vVar != null ? vVar.hashCode() : 0);
    }

    public final String toString() {
        return "LogEvent{eventTimeMs=" + this.f6027a + ", eventCode=" + this.f6028b + ", eventUptimeMs=" + this.f6029c + ", sourceExtension=" + Arrays.toString(this.f6030d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f6031f + ", networkConnectionInfo=" + this.f6032g + "}";
    }
}

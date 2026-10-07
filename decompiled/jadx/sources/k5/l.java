package k5;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f6034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j f6035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f6036d;
    public final String e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f6037f;

    public l(long j4, long j10, j jVar, Integer num, String str, ArrayList arrayList) {
        w wVar = w.f6047a;
        this.f6033a = j4;
        this.f6034b = j10;
        this.f6035c = jVar;
        this.f6036d = num;
        this.e = str;
        this.f6037f = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        l lVar = (l) ((s) obj);
        Object obj2 = w.f6047a;
        ArrayList arrayList = lVar.f6037f;
        String str = lVar.e;
        Integer num = lVar.f6036d;
        j jVar = lVar.f6035c;
        if (this.f6033a != lVar.f6033a || this.f6034b != lVar.f6034b || !this.f6035c.equals(jVar)) {
            return false;
        }
        Integer num2 = this.f6036d;
        if (num2 == null) {
            if (num != null) {
                return false;
            }
        } else if (!num2.equals(num)) {
            return false;
        }
        String str2 = this.e;
        if (str2 == null) {
            if (str != null) {
                return false;
            }
        } else if (!str2.equals(str)) {
            return false;
        }
        return this.f6037f.equals(arrayList) && obj2.equals(obj2);
    }

    public final int hashCode() {
        long j4 = this.f6033a;
        long j10 = this.f6034b;
        int iHashCode = (((((((int) (j4 ^ (j4 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ this.f6035c.hashCode()) * 1000003;
        Integer num = this.f6036d;
        int iHashCode2 = (iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.e;
        return ((((iHashCode2 ^ (str != null ? str.hashCode() : 0)) * 1000003) ^ this.f6037f.hashCode()) * 1000003) ^ w.f6047a.hashCode();
    }

    public final String toString() {
        return "LogRequest{requestTimeMs=" + this.f6033a + ", requestUptimeMs=" + this.f6034b + ", clientInfo=" + this.f6035c + ", logSource=" + this.f6036d + ", logSourceName=" + this.e + ", logEvents=" + this.f6037f + ", qosTier=" + w.f6047a + "}";
    }
}

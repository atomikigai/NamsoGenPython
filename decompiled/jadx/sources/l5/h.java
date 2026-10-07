package l5;

import bd.v;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Integer f6818b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f6819c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f6820d;
    public final long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f6821f;

    public h(String str, Integer num, l lVar, long j4, long j10, HashMap map) {
        this.f6817a = str;
        this.f6818b = num;
        this.f6819c = lVar;
        this.f6820d = j4;
        this.e = j10;
        this.f6821f = map;
    }

    public final String a(String str) {
        String str2 = (String) this.f6821f.get(str);
        return str2 == null ? "" : str2;
    }

    public final int b(String str) {
        String str2 = (String) this.f6821f.get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    public final v c() {
        v vVar = new v(8);
        String str = this.f6817a;
        if (str == null) {
            throw new NullPointerException("Null transportName");
        }
        vVar.f1681b = str;
        vVar.f1682c = this.f6818b;
        l lVar = this.f6819c;
        if (lVar == null) {
            throw new NullPointerException("Null encodedPayload");
        }
        vVar.f1683d = lVar;
        vVar.e = Long.valueOf(this.f6820d);
        vVar.f1684f = Long.valueOf(this.e);
        vVar.f1685g = new HashMap(this.f6821f);
        return vVar;
    }

    public final boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            Integer num2 = hVar.f6818b;
            if (this.f6817a.equals(hVar.f6817a) && ((num = this.f6818b) != null ? num.equals(num2) : num2 == null) && this.f6819c.equals(hVar.f6819c) && this.f6820d == hVar.f6820d && this.e == hVar.e && this.f6821f.equals(hVar.f6821f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f6817a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.f6818b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.f6819c.hashCode()) * 1000003;
        long j4 = this.f6820d;
        int i = (iHashCode2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        long j10 = this.e;
        return ((i ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ this.f6821f.hashCode();
    }

    public final String toString() {
        return "EventInternal{transportName=" + this.f6817a + ", code=" + this.f6818b + ", encodedPayload=" + this.f6819c + ", eventMillis=" + this.f6820d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f6821f + "}";
    }
}

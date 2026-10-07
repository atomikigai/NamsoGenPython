package wa;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9873a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f9874b;

    public a(String str, ArrayList arrayList) {
        if (str == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.f9873a = str;
        this.f9874b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9873a.equals(aVar.f9873a) && this.f9874b.equals(aVar.f9874b);
    }

    public final int hashCode() {
        return ((this.f9873a.hashCode() ^ 1000003) * 1000003) ^ this.f9874b.hashCode();
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.f9873a + ", usedDates=" + this.f9874b + "}";
    }
}

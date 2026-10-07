package c3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f1735b;

    public c(String str, long j4) {
        this.f1734a = str;
        this.f1735b = Long.valueOf(j4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        Long l2 = cVar.f1735b;
        if (!this.f1734a.equals(cVar.f1734a)) {
            return false;
        }
        Long l10 = this.f1735b;
        if (l10 != null) {
            return l10.equals(l2);
        }
        return l2 == null;
    }

    public final int hashCode() {
        int iHashCode = this.f1734a.hashCode() * 31;
        Long l2 = this.f1735b;
        return iHashCode + (l2 != null ? l2.hashCode() : 0);
    }
}

package ib;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5251b;

    public a(String str, String str2) {
        this.f5250a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f5251b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f5250a.equals(aVar.f5250a) && this.f5251b.equals(aVar.f5251b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f5250a.hashCode() ^ 1000003) * 1000003) ^ this.f5251b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f5250a);
        sb2.append(", version=");
        return q1.a.m(sb2, this.f5251b, "}");
    }
}

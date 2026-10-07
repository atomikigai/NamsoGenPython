package ub;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f9062b = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9063a = 131348;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        b bVar = (b) obj;
        jc.i.e(bVar, "other");
        return this.f9063a - bVar.f9063a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        b bVar = obj instanceof b ? (b) obj : null;
        return bVar != null && this.f9063a == bVar.f9063a;
    }

    public final int hashCode() {
        return this.f9063a;
    }

    public final String toString() {
        return "2.1.20";
    }
}

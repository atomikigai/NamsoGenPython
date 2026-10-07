package jc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5772a;

    public k(Class cls) {
        this.f5772a = cls;
    }

    @Override // jc.d
    public final Class a() {
        return this.f5772a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            return i.a(this.f5772a, ((k) obj).f5772a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5772a.hashCode();
    }

    public final String toString() {
        return this.f5772a + " (Kotlin reflection is not available)";
    }
}

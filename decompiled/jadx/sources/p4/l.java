package p4;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class f7807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class f7808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f7809c;

    public l(Class cls, Class cls2, Class cls3) {
        this.f7807a = cls;
        this.f7808b = cls2;
        this.f7809c = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return this.f7807a.equals(lVar.f7807a) && this.f7808b.equals(lVar.f7808b) && n.b(this.f7809c, lVar.f7809c);
    }

    public final int hashCode() {
        int iHashCode = (this.f7808b.hashCode() + (this.f7807a.hashCode() * 31)) * 31;
        Class cls = this.f7809c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.f7807a + ", second=" + this.f7808b + '}';
    }
}

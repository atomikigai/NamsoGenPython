package x9;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f10349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f10350b;

    public q(Class cls, Class cls2) {
        this.f10349a = cls;
        this.f10350b = cls2;
    }

    public static q a(Class cls) {
        return new q(p.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f10350b.equals(qVar.f10350b)) {
            return this.f10349a.equals(qVar.f10349a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10349a.hashCode() + (this.f10350b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f10350b;
        Class cls2 = this.f10349a;
        if (cls2 == p.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}

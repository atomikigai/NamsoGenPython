package x3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f10267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f10269c;

    public d(e eVar) {
        this.f10267a = eVar;
    }

    @Override // x3.h
    public final void a() {
        this.f10267a.b(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f10268b == dVar.f10268b && this.f10269c == dVar.f10269c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f10268b * 31;
        Class cls = this.f10269c;
        return i + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        return "Key{size=" + this.f10268b + "array=" + this.f10269c + '}';
    }
}

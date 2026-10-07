package lb;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f6942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f6943b;

    public r(v vVar, b bVar) {
        this.f6942a = vVar;
        this.f6943b = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return this.f6942a.equals(rVar.f6942a) && this.f6943b.equals(rVar.f6943b);
    }

    public final int hashCode() {
        return this.f6943b.hashCode() + ((this.f6942a.hashCode() + (j.SESSION_START.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SessionEvent(eventType=" + j.SESSION_START + ", sessionData=" + this.f6942a + ", applicationInfo=" + this.f6943b + ')';
    }
}

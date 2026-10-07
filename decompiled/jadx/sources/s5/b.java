package s5;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l5.i f8431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l5.h f8432c;

    public b(long j4, l5.i iVar, l5.h hVar) {
        this.f8430a = j4;
        this.f8431b = iVar;
        this.f8432c = hVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f8430a == bVar.f8430a && this.f8431b.equals(bVar.f8431b) && this.f8432c.equals(bVar.f8432c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j4 = this.f8430a;
        return ((((((int) ((j4 >>> 32) ^ j4)) ^ 1000003) * 1000003) ^ this.f8431b.hashCode()) * 1000003) ^ this.f8432c.hashCode();
    }

    public final String toString() {
        return "PersistedEvent{id=" + this.f8430a + ", transportContext=" + this.f8431b + ", event=" + this.f8432c + "}";
    }
}

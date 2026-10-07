package tc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f8707a;

    public g(Throwable th) {
        this.f8707a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return jc.i.a(this.f8707a, ((g) obj).f8707a);
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f8707a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // tc.h
    public final String toString() {
        return "Closed(" + this.f8707a + ')';
    }
}

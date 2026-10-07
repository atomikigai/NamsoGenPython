package wc;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class y implements yb.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadLocal f9964a;

    public y(ThreadLocal threadLocal) {
        this.f9964a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && jc.i.a(this.f9964a, ((y) obj).f9964a);
    }

    public final int hashCode() {
        return this.f9964a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f9964a + ')';
    }
}

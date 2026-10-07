package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f9067a;

    public g(Throwable th) {
        jc.i.e(th, "exception");
        this.f9067a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof g) {
            return jc.i.a(this.f9067a, ((g) obj).f9067a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9067a.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.f9067a + ')';
    }
}

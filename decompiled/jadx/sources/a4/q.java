package a4;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f169a;

    public q(String str) {
        this.f169a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.f169a.equals(((q) obj).f169a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f169a.hashCode();
    }

    public final String toString() {
        return q1.a.m(new StringBuilder("StringHeaderFactory{value='"), this.f169a, "'}");
    }
}

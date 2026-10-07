package mb;

import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7098a;

    public e(String str) {
        i.e(str, "sessionId");
        this.f7098a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && i.a(this.f7098a, ((e) obj).f7098a);
    }

    public final int hashCode() {
        return this.f7098a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f7098a + ')';
    }
}

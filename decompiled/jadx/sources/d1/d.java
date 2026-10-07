package d1;

import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2797a;

    public d(String str) {
        i.e(str, "name");
        this.f2797a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        return i.a(this.f2797a, ((d) obj).f2797a);
    }

    public final int hashCode() {
        return this.f2797a.hashCode();
    }

    public final String toString() {
        return this.f2797a;
    }
}

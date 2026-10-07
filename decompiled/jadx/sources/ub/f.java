package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9066b;

    public f(Object obj, Object obj2) {
        this.f9065a = obj;
        this.f9066b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jc.i.a(this.f9065a, fVar.f9065a) && jc.i.a(this.f9066b, fVar.f9066b);
    }

    public final int hashCode() {
        Object obj = this.f9065a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f9066b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.f9065a + ", " + this.f9066b + ')';
    }
}

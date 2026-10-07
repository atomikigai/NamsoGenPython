package ub;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9068a;

    public static final Throwable a(Object obj) {
        if (obj instanceof g) {
            return ((g) obj).f9067a;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            return jc.i.a(this.f9068a, ((h) obj).f9068a);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.f9068a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f9068a;
        if (obj instanceof g) {
            return ((g) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}

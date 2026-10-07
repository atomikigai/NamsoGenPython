package androidx.lifecycle;

import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f1034b;

    public b(int i, Method method) {
        this.f1033a = i;
        this.f1034b = method;
        method.setAccessible(true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1033a == bVar.f1033a && this.f1034b.getName().equals(bVar.f1034b.getName());
    }

    public final int hashCode() {
        return this.f1034b.getName().hashCode() + (this.f1033a * 31);
    }
}

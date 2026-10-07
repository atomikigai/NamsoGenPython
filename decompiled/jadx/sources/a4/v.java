package a4;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayDeque f178b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f179a;

    static {
        char[] cArr = p4.n.f7811a;
        f178b = new ArrayDeque(0);
    }

    public static v a(Object obj) {
        v vVar;
        ArrayDeque arrayDeque = f178b;
        synchronized (arrayDeque) {
            vVar = (v) arrayDeque.poll();
        }
        if (vVar == null) {
            vVar = new v();
        }
        vVar.f179a = obj;
        return vVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && this.f179a.equals(((v) obj).f179a);
    }

    public final int hashCode() {
        return this.f179a.hashCode();
    }
}

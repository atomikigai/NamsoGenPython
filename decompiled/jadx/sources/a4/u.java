package a4;

import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends p4.j {
    @Override // p4.j
    public final void c(Object obj, Object obj2) {
        v vVar = (v) obj;
        vVar.getClass();
        ArrayDeque arrayDeque = v.f178b;
        synchronized (arrayDeque) {
            arrayDeque.offer(vVar);
        }
    }
}

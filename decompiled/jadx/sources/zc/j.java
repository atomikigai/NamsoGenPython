package zc;

import java.util.concurrent.atomic.AtomicReferenceArray;
import wc.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends t {
    public final AtomicReferenceArray e;

    public j(long j4, j jVar, int i) {
        super(j4, jVar, i);
        this.e = new AtomicReferenceArray(i.f11575f);
    }

    @Override // wc.t
    public final int f() {
        return i.f11575f;
    }

    @Override // wc.t
    public final void g(int i, yb.i iVar) {
        this.e.set(i, i.e);
        h();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f9954c + ", hashCode=" + hashCode() + ']';
    }
}

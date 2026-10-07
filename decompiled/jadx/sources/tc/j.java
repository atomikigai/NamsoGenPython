package tc;

import java.util.concurrent.atomic.AtomicReferenceArray;
import rc.y1;
import wc.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends t {
    public final b e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReferenceArray f8709f;

    public j(long j4, j jVar, b bVar, int i) {
        super(j4, jVar, i);
        this.e = bVar;
        this.f8709f = new AtomicReferenceArray(d.f8689b * 2);
    }

    @Override // wc.t
    public final int f() {
        return d.f8689b;
    }

    @Override // wc.t
    public final void g(int i, yb.i iVar) {
        b bVar;
        int i10 = d.f8689b;
        boolean z4 = i >= i10;
        if (z4) {
            i -= i10;
        }
        this.f8709f.get(i * 2);
        while (true) {
            Object objK = k(i);
            boolean z10 = objK instanceof y1;
            bVar = this.e;
            if (z10 || (objK instanceof r)) {
                if (j(i, objK, z4 ? d.f8694j : d.f8695k)) {
                    m(i, null);
                    l(i, !z4);
                    if (z4) {
                        jc.i.b(bVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objK == d.f8694j || objK == d.f8695k) {
                    break;
                }
                if (objK != d.f8693g && objK != d.f8692f) {
                    if (objK == d.i || objK == d.f8691d || objK == d.f8696l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objK).toString());
                }
            }
        }
        m(i, null);
        if (z4) {
            jc.i.b(bVar);
        }
    }

    public final boolean j(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f8709f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object k(int i) {
        return this.f8709f.get((i * 2) + 1);
    }

    public final void l(int i, boolean z4) {
        if (z4) {
            b bVar = this.e;
            jc.i.b(bVar);
            bVar.C((this.f9954c * ((long) d.f8689b)) + ((long) i));
        }
        h();
    }

    public final void m(int i, Object obj) {
        this.f8709f.lazySet(i * 2, obj);
    }

    public final void n(int i, Object obj) {
        this.f8709f.set((i * 2) + 1, obj);
    }
}

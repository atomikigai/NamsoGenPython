package wc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rc.o1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t extends d implements o1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9953d = AtomicIntegerFieldUpdater.newUpdater(t.class, "cleanedAndPointers");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f9954c;
    private volatile int cleanedAndPointers;

    public t(long j4, t tVar, int i) {
        super(tVar);
        this.f9954c = j4;
        this.cleanedAndPointers = i << 16;
    }

    @Override // wc.d
    public final boolean c() {
        return f9953d.get(this) == f() && b() != null;
    }

    public final boolean e() {
        return f9953d.addAndGet(this, -65536) == f() && b() != null;
    }

    public abstract int f();

    public abstract void g(int i, yb.i iVar);

    public final void h() {
        if (f9953d.incrementAndGet(this) == f()) {
            d();
        }
    }

    public final boolean i() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i;
        do {
            atomicIntegerFieldUpdater = f9953d;
            i = atomicIntegerFieldUpdater.get(this);
            if (i == f() && b() != null) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, 65536 + i));
        return true;
    }
}

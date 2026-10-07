package rc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a1 extends d1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8250f = AtomicIntegerFieldUpdater.newUpdater(a1.class, "_invoked");
    private volatile int _invoked;
    public final ic.l e;

    public a1(ic.l lVar) {
        this.e = lVar;
    }

    @Override // ic.l
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        m((Throwable) obj);
        return ub.k.f9073a;
    }

    @Override // rc.f1
    public final void m(Throwable th) {
        if (f8250f.compareAndSet(this, 0, 1)) {
            this.e.invoke(th);
        }
    }
}

package rc;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Thread f8274d;
    public final u0 e;

    public g(yb.i iVar, Thread thread, u0 u0Var) {
        super(iVar, true);
        this.f8274d = thread;
        this.e = u0Var;
    }

    @Override // rc.l1
    public final void k(Object obj) {
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = this.f8274d;
        if (jc.i.a(threadCurrentThread, thread)) {
            return;
        }
        LockSupport.unpark(thread);
    }
}

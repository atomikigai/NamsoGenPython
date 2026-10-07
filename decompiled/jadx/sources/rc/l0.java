package rc;

import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledFuture f8299a;

    public l0(ScheduledFuture scheduledFuture) {
        this.f8299a = scheduledFuture;
    }

    @Override // rc.m0
    public final void f() {
        this.f8299a.cancel(false);
    }

    public final String toString() {
        return "DisposableFutureHandle[" + this.f8299a + ']';
    }
}

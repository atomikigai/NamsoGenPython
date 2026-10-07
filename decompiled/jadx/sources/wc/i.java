package wc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import rc.d0;
import rc.g0;
import rc.m0;
import rc.u1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends rc.x implements g0 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f9934s = AtomicIntegerFieldUpdater.newUpdater(i.class, "runningWorkers");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final rc.x f9935c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9936d;
    public final /* synthetic */ g0 e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final l f9937f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f9938r;
    private volatile int runningWorkers;

    /* JADX WARN: Multi-variable type inference failed */
    public i(rc.x xVar, int i) {
        this.f9935c = xVar;
        this.f9936d = i;
        g0 g0Var = xVar instanceof g0 ? (g0) xVar : null;
        this.e = g0Var == null ? d0.f8266a : g0Var;
        this.f9937f = new l();
        this.f9938r = new Object();
    }

    @Override // rc.x
    public final void S(yb.i iVar, Runnable runnable) {
        this.f9937f.a(runnable);
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9934s;
        if (atomicIntegerFieldUpdater.get(this) < this.f9936d) {
            synchronized (this.f9938r) {
                if (atomicIntegerFieldUpdater.get(this) >= this.f9936d) {
                    return;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
                Runnable runnableU = U();
                if (runnableU == null) {
                    return;
                }
                this.f9935c.S(this, new a3.e(29, this, runnableU));
            }
        }
    }

    public final Runnable U() {
        while (true) {
            Runnable runnable = (Runnable) this.f9937f.d();
            if (runnable != null) {
                return runnable;
            }
            synchronized (this.f9938r) {
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f9934s;
                atomicIntegerFieldUpdater.decrementAndGet(this);
                if (this.f9937f.c() == 0) {
                    return null;
                }
                atomicIntegerFieldUpdater.incrementAndGet(this);
            }
        }
    }

    @Override // rc.g0
    public final m0 o(long j4, u1 u1Var, yb.i iVar) {
        return this.e.o(j4, u1Var, iVar);
    }
}

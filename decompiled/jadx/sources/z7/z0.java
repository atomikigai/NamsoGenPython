package z7;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 extends f1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final AtomicLong f11495v = new AtomicLong(Long.MIN_VALUE);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public y0 f11496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y0 f11497d;
    public final PriorityBlockingQueue e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedBlockingQueue f11498f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final w0 f11499r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final w0 f11500s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f11501t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Semaphore f11502u;

    public z0(a1 a1Var) {
        super(a1Var);
        this.f11501t = new Object();
        this.f11502u = new Semaphore(2);
        this.e = new PriorityBlockingQueue();
        this.f11498f = new LinkedBlockingQueue();
        this.f11499r = new w0(this, "Thread death: Uncaught exception on worker thread");
        this.f11500s = new w0(this, "Thread death: Uncaught exception on network thread");
    }

    @Override // a4.l
    public final void c() {
        if (Thread.currentThread() != this.f11496c) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    @Override // z7.f1
    public final boolean d() {
        return false;
    }

    public final void g() {
        if (Thread.currentThread() != this.f11497d) {
            throw new IllegalStateException("Call expected from network thread");
        }
    }

    public final Object h(AtomicReference atomicReference, long j4, String str, Runnable runnable) {
        synchronized (atomicReference) {
            z0 z0Var = ((a1) this.f159a).f11008u;
            a1.f(z0Var);
            z0Var.l(runnable);
            try {
                atomicReference.wait(j4);
            } catch (InterruptedException unused) {
                i0 i0Var = ((a1) this.f159a).f11007t;
                a1.f(i0Var);
                i0Var.f11193t.b("Interrupted waiting for ".concat(str));
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            i0 i0Var2 = ((a1) this.f159a).f11007t;
            a1.f(i0Var2);
            i0Var2.f11193t.b("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final x0 j(Callable callable) {
        e();
        x0 x0Var = new x0(this, callable, false);
        if (Thread.currentThread() != this.f11496c) {
            o(x0Var);
            return x0Var;
        }
        if (!this.e.isEmpty()) {
            i0 i0Var = ((a1) this.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11193t.b("Callable skipped the worker queue.");
        }
        x0Var.run();
        return x0Var;
    }

    public final void k(Runnable runnable) {
        e();
        x0 x0Var = new x0(this, runnable, false, "Task exception on network thread");
        synchronized (this.f11501t) {
            try {
                this.f11498f.add(x0Var);
                y0 y0Var = this.f11497d;
                if (y0Var == null) {
                    y0 y0Var2 = new y0(this, "Measurement Network", this.f11498f);
                    this.f11497d = y0Var2;
                    y0Var2.setUncaughtExceptionHandler(this.f11500s);
                    this.f11497d.start();
                } else {
                    synchronized (y0Var.f11441a) {
                        y0Var.f11441a.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(Runnable runnable) {
        e();
        o(new x0(this, runnable, false, "Task exception on worker thread"));
    }

    public final void m(Runnable runnable) {
        e();
        o(new x0(this, runnable, true, "Task exception on worker thread"));
    }

    public final boolean n() {
        return Thread.currentThread() == this.f11496c;
    }

    public final void o(x0 x0Var) {
        synchronized (this.f11501t) {
            try {
                this.e.add(x0Var);
                y0 y0Var = this.f11496c;
                if (y0Var == null) {
                    y0 y0Var2 = new y0(this, "Measurement Worker", this.e);
                    this.f11496c = y0Var2;
                    y0Var2.setUncaughtExceptionHandler(this.f11499r);
                    this.f11496c.start();
                } else {
                    synchronized (y0Var.f11441a) {
                        y0Var.f11441a.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

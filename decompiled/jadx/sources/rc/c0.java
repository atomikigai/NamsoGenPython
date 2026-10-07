package rc;

import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 extends t0 implements Runnable {
    private static volatile Thread _thread;
    private static volatile int debugStatus;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final c0 f8262u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final long f8263v;

    static {
        Long l2;
        c0 c0Var = new c0();
        f8262u = c0Var;
        c0Var.W(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l2 = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l2 = 1000L;
        }
        f8263v = timeUnit.toNanos(l2.longValue());
    }

    @Override // rc.u0
    public final Thread V() {
        Thread thread;
        Thread thread2 = _thread;
        if (thread2 != null) {
            return thread2;
        }
        synchronized (this) {
            thread = _thread;
            if (thread == null) {
                thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
                _thread = thread;
                thread.setDaemon(true);
                thread.start();
            }
        }
        return thread;
    }

    @Override // rc.u0
    public final void Z(long j4, r0 r0Var) {
        throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
    }

    @Override // rc.t0
    public final void a0(Runnable runnable) {
        if (debugStatus == 4) {
            throw new RejectedExecutionException("DefaultExecutor was shut down. This error indicates that Dispatchers.shutdown() was invoked prior to completion of exiting coroutines, leaving coroutines in incomplete state. Please refer to Dispatchers.shutdown documentation for more details");
        }
        super.a0(runnable);
    }

    public final synchronized void e0() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            debugStatus = 3;
            t0.f8318r.set(this, null);
            t0.f8319s.set(this, null);
            notifyAll();
        }
    }

    @Override // rc.t0, rc.g0
    public final m0 o(long j4, u1 u1Var, yb.i iVar) {
        long j10 = 0;
        if (j4 > 0) {
            j10 = j4 >= 9223372036854L ? Long.MAX_VALUE : 1000000 * j4;
        }
        if (j10 >= 4611686018427387903L) {
            return n1.f8304a;
        }
        long jNanoTime = System.nanoTime();
        q0 q0Var = new q0(j10 + jNanoTime, u1Var);
        d0(jNanoTime, q0Var);
        return q0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        s1.f8317a.set(this);
        try {
            synchronized (this) {
                int i = debugStatus;
                if (i == 2 || i == 3) {
                    _thread = null;
                    e0();
                    if (c0()) {
                        return;
                    }
                    V();
                    return;
                }
                debugStatus = 1;
                notifyAll();
                long j4 = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long jX = X();
                    if (jX == Long.MAX_VALUE) {
                        long jNanoTime = System.nanoTime();
                        if (j4 == Long.MAX_VALUE) {
                            j4 = f8263v + jNanoTime;
                        }
                        long j10 = j4 - jNanoTime;
                        if (j10 <= 0) {
                            _thread = null;
                            e0();
                            if (c0()) {
                                return;
                            }
                            V();
                            return;
                        }
                        if (jX > j10) {
                            jX = j10;
                        }
                    } else {
                        j4 = Long.MAX_VALUE;
                    }
                    if (jX > 0) {
                        int i10 = debugStatus;
                        if (i10 == 2 || i10 == 3) {
                            _thread = null;
                            e0();
                            if (c0()) {
                                return;
                            }
                            V();
                            return;
                        }
                        LockSupport.parkNanos(this, jX);
                    }
                }
            }
        } catch (Throwable th) {
            _thread = null;
            e0();
            if (!c0()) {
                V();
            }
            throw th;
        }
    }

    @Override // rc.t0, rc.u0
    public final void shutdown() {
        debugStatus = 4;
        super.shutdown();
    }
}

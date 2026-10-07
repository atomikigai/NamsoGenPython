package rc;

import java.lang.reflect.Method;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class w0 extends v0 implements g0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f8332c;

    public w0(Executor executor) {
        Method method;
        this.f8332c = executor;
        Method method2 = wc.c.f9924a;
        try {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = executor instanceof ScheduledThreadPoolExecutor ? (ScheduledThreadPoolExecutor) executor : null;
            if (scheduledThreadPoolExecutor != null && (method = wc.c.f9924a) != null) {
                method.invoke(scheduledThreadPoolExecutor, Boolean.TRUE);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // rc.x
    public final void S(yb.i iVar, Runnable runnable) {
        try {
            this.f8332c.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            b0.f(iVar, cancellationException);
            k0.f8293b.S(iVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.f8332c;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof w0) && ((w0) obj).f8332c == this.f8332c;
    }

    public final int hashCode() {
        return System.identityHashCode(this.f8332c);
    }

    @Override // rc.g0
    public final m0 o(long j4, u1 u1Var, yb.i iVar) {
        Executor executor = this.f8332c;
        ScheduledFuture<?> scheduledFutureSchedule = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFutureSchedule = scheduledExecutorService.schedule(u1Var, j4, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                b0.f(iVar, cancellationException);
            }
        }
        return scheduledFutureSchedule != null ? new l0(scheduledFutureSchedule) : c0.f8262u.o(j4, u1Var, iVar);
    }

    @Override // rc.x
    public final String toString() {
        return this.f8332c.toString();
    }
}

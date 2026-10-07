package y9;

import com.google.android.gms.common.internal.i0;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import l5.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Executor {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f10661f = Logger.getLogger(k.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f10662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f10663b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10664c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10665d = 0;
    public final j e = new j(this);

    public k(Executor executor) {
        i0.i(executor);
        this.f10662a = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        i0.i(runnable);
        synchronized (this.f10663b) {
            int i = this.f10664c;
            if (i != 4 && i != 3) {
                long j4 = this.f10665d;
                o oVar = new o(3, runnable);
                this.f10663b.add(oVar);
                this.f10664c = 2;
                try {
                    this.f10662a.execute(this.e);
                    if (this.f10664c != 2) {
                        return;
                    }
                    synchronized (this.f10663b) {
                        try {
                            if (this.f10665d == j4 && this.f10664c == 2) {
                                this.f10664c = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e) {
                    synchronized (this.f10663b) {
                        try {
                            int i10 = this.f10664c;
                            boolean z4 = true;
                            if ((i10 != 1 && i10 != 2) || !this.f10663b.removeLastOccurrence(oVar)) {
                                z4 = false;
                            }
                            if (!(e instanceof RejectedExecutionException) || z4) {
                                throw e;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return;
                }
            }
            this.f10663b.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.f10662a + "}";
    }
}

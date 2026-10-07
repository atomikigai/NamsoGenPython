package d3;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f2816b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile Runnable f2818d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayDeque f2815a = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f2817c = new Object();

    public i(Executor executor) {
        this.f2816b = executor;
    }

    public final void a() {
        synchronized (this.f2817c) {
            try {
                Runnable runnable = (Runnable) this.f2815a.poll();
                this.f2818d = runnable;
                if (runnable != null) {
                    this.f2816b.execute(this.f2818d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        synchronized (this.f2817c) {
            try {
                this.f2815a.add(new a3.e(this, runnable, 5, false));
                if (this.f2818d == null) {
                    a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

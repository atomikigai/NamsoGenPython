package g;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f3965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f3966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f3967d;
    public final Executor e;

    public a0(Executor executor) {
        this.f3964a = 1;
        jc.i.e(executor, "executor");
        this.e = executor;
        this.f3965b = new ArrayDeque();
        this.f3967d = new Object();
    }

    public final void a() {
        switch (this.f3964a) {
            case 0:
                synchronized (this.f3967d) {
                    try {
                        Runnable runnable = (Runnable) this.f3965b.poll();
                        this.f3966c = runnable;
                        if (runnable != null) {
                            ((b0) this.e).execute(runnable);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f3967d) {
                    Object objPoll = this.f3965b.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.f3966c = runnable2;
                    if (objPoll != null) {
                        this.e.execute(runnable2);
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3964a) {
            case 0:
                synchronized (this.f3967d) {
                    try {
                        this.f3965b.add(new androidx.webkit.b(1, this, runnable));
                        if (this.f3966c == null) {
                            a();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                jc.i.e(runnable, "command");
                synchronized (this.f3967d) {
                    this.f3965b.offer(new androidx.webkit.b(19, runnable, this));
                    if (this.f3966c == null) {
                        a();
                    }
                    break;
                }
                return;
        }
    }

    public a0(b0 b0Var) {
        this.f3964a = 0;
        this.f3967d = new Object();
        this.f3965b = new ArrayDeque();
        this.e = b0Var;
    }
}

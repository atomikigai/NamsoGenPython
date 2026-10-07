package z7;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f11441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f11442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f11443c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f11444d;

    public y0(z0 z0Var, String str, BlockingQueue blockingQueue) {
        this.f11444d = z0Var;
        com.google.android.gms.common.internal.i0.i(blockingQueue);
        this.f11441a = new Object();
        this.f11442b = blockingQueue;
        setName(str);
    }

    public final void a() {
        synchronized (this.f11444d.f11501t) {
            try {
                if (!this.f11443c) {
                    this.f11444d.f11502u.release();
                    this.f11444d.f11501t.notifyAll();
                    z0 z0Var = this.f11444d;
                    if (this == z0Var.f11496c) {
                        z0Var.f11496c = null;
                    } else if (this == z0Var.f11497d) {
                        z0Var.f11497d = null;
                    } else {
                        i0 i0Var = ((a1) z0Var.f159a).f11007t;
                        a1.f(i0Var);
                        i0Var.f11190f.b("Current scheduler thread is neither worker nor network");
                    }
                    this.f11443c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z4 = false;
        while (!z4) {
            try {
                this.f11444d.f11502u.acquire();
                z4 = true;
            } catch (InterruptedException e) {
                i0 i0Var = ((a1) this.f11444d.f159a).f11007t;
                a1.f(i0Var);
                i0Var.f11193t.c(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                x0 x0Var = (x0) this.f11442b.poll();
                if (x0Var != null) {
                    Process.setThreadPriority(true != x0Var.f11421b ? 10 : threadPriority);
                    x0Var.run();
                } else {
                    synchronized (this.f11441a) {
                        if (this.f11442b.peek() == null) {
                            try {
                                this.f11441a.wait(30000L);
                            } catch (InterruptedException e4) {
                                i0 i0Var2 = ((a1) this.f11444d.f159a).f11007t;
                                a1.f(i0Var2);
                                i0Var2.f11193t.c(e4, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.f11444d.f11501t) {
                        if (this.f11442b.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}

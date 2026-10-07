package q3;

import android.os.Process;
import gb.r;
import java.util.HashMap;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends Thread {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f7984r = q.f8026a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue f7985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BlockingQueue f7986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r3.c f7987c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f7988d;
    public volatile boolean e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f7989f;

    public c(PriorityBlockingQueue priorityBlockingQueue, PriorityBlockingQueue priorityBlockingQueue2, r3.c cVar, e eVar) {
        this.f7985a = priorityBlockingQueue;
        this.f7986b = priorityBlockingQueue2;
        this.f7987c = cVar;
        this.f7988d = eVar;
        r rVar = new r();
        rVar.f4493a = new HashMap();
        rVar.f4494b = eVar;
        rVar.f4495c = this;
        rVar.f4496d = priorityBlockingQueue2;
        this.f7989f = rVar;
    }

    private void a() throws InterruptedException {
        k kVar = (k) this.f7985a.take();
        kVar.a("cache-queue-take");
        kVar.m();
        try {
            if (kVar.i()) {
                kVar.d("cache-discard-canceled");
                kVar.m();
                return;
            }
            b bVarA = this.f7987c.a(kVar.g());
            if (bVarA == null) {
                kVar.a("cache-miss");
                if (!this.f7989f.l(kVar)) {
                    this.f7986b.put(kVar);
                }
                kVar.m();
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (bVarA.e < jCurrentTimeMillis) {
                kVar.a("cache-hit-expired");
                kVar.f8016x = bVarA;
                if (!this.f7989f.l(kVar)) {
                    this.f7986b.put(kVar);
                }
                kVar.m();
                return;
            }
            kVar.a("cache-hit");
            com.bumptech.glide.manager.q qVarL = kVar.l(new h(bVarA.f7978a, bVarA.f7983g));
            kVar.a("cache-hit-parsed");
            if (((n) qVarL.f1935d) == null) {
                if (bVarA.f7982f < jCurrentTimeMillis) {
                    kVar.a("cache-hit-refresh-needed");
                    kVar.f8016x = bVarA;
                    qVarL.f1932a = true;
                    if (this.f7989f.l(kVar)) {
                        this.f7988d.f(kVar, qVarL, null);
                    } else {
                        this.f7988d.f(kVar, qVarL, new a3.e(23, this, kVar));
                    }
                } else {
                    this.f7988d.f(kVar, qVarL, null);
                }
                kVar.m();
                return;
            }
            kVar.a("cache-parsing-failed");
            r3.c cVar = this.f7987c;
            String strG = kVar.g();
            synchronized (cVar) {
                b bVarA2 = cVar.a(strG);
                if (bVarA2 != null) {
                    bVarA2.f7982f = 0L;
                    bVarA2.e = 0L;
                    cVar.f(strG, bVarA2);
                }
            }
            kVar.f8016x = null;
            if (!this.f7989f.l(kVar)) {
                this.f7986b.put(kVar);
            }
            kVar.m();
        } catch (Throwable th) {
            kVar.m();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (f7984r) {
            q.d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f7987c.d();
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                q.c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

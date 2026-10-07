package q3;

import android.net.TrafficStats;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.api.internal.d0;
import h6.o0;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BlockingQueue f7993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o0 f7994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r3.c f7995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f7996d;
    public volatile boolean e = false;

    public g(PriorityBlockingQueue priorityBlockingQueue, o0 o0Var, r3.c cVar, e eVar) {
        this.f7993a = priorityBlockingQueue;
        this.f7994b = o0Var;
        this.f7995c = cVar;
        this.f7996d = eVar;
    }

    private void a() throws InterruptedException {
        k kVar = (k) this.f7993a.take();
        e eVar = this.f7996d;
        SystemClock.elapsedRealtime();
        kVar.m();
        Object obj = null;
        try {
            try {
                kVar.a("network-queue-take");
                if (kVar.i()) {
                    kVar.d("network-discard-cancelled");
                    kVar.j();
                    kVar.m();
                    return;
                }
                TrafficStats.setThreadStatsTag(kVar.f8008d);
                h hVarN = this.f7994b.n(kVar);
                kVar.a("network-http-complete");
                if (hVarN.e && kVar.h()) {
                    kVar.d("not-modified");
                    kVar.j();
                    kVar.m();
                    return;
                }
                com.bumptech.glide.manager.q qVarL = kVar.l(hVarN);
                kVar.a("network-parse-complete");
                if (kVar.f8012t && ((b) qVarL.f1934c) != null) {
                    this.f7995c.f(kVar.g(), (b) qVarL.f1934c);
                    kVar.a("network-cache-written");
                }
                synchronized (kVar.e) {
                    kVar.f8014v = true;
                }
                eVar.f(kVar, qVarL, null);
                kVar.k(qVarL);
                kVar.m();
            } catch (n e) {
                SystemClock.elapsedRealtime();
                eVar.getClass();
                kVar.a("post-error");
                ((d0) eVar.f7990a).execute(new b3.b(kVar, new com.bumptech.glide.manager.q(e), obj, 15, false));
                kVar.j();
                kVar.m();
            } catch (Exception e4) {
                Log.e("Volley", q.a("Unhandled exception %s", e4.toString()), e4);
                n nVar = new n(e4);
                SystemClock.elapsedRealtime();
                eVar.getClass();
                kVar.a("post-error");
                ((d0) eVar.f7990a).execute(new b3.b(kVar, new com.bumptech.glide.manager.q(nVar), obj, 15, false));
                kVar.j();
                kVar.m();
            }
        } catch (Throwable th) {
            kVar.m();
            throw th;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                q.c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}

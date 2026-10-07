package d3;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class u {
    public static final String e = t2.m.f("WorkTimer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScheduledExecutorService f2852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f2853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f2854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f2855d;

    public u() {
        r rVar = new r();
        rVar.f2849a = 0;
        this.f2853b = new HashMap();
        this.f2854c = new HashMap();
        this.f2855d = new Object();
        this.f2852a = Executors.newSingleThreadScheduledExecutor(rVar);
    }

    public final void a(String str, w2.e eVar) {
        synchronized (this.f2855d) {
            t2.m.d().a(e, "Starting timer for " + str, new Throwable[0]);
            b(str);
            t tVar = new t(this, str);
            this.f2853b.put(str, tVar);
            this.f2854c.put(str, eVar);
            this.f2852a.schedule(tVar, 600000L, TimeUnit.MILLISECONDS);
        }
    }

    public final void b(String str) {
        synchronized (this.f2855d) {
            try {
                if (((t) this.f2853b.remove(str)) != null) {
                    t2.m.d().a(e, "Stopping timer for " + str, new Throwable[0]);
                    this.f2854c.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

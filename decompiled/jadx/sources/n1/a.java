package n1;

import android.os.Looper;
import d6.m;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ThreadPoolExecutor f7150s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static d f7151t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static volatile ThreadPoolExecutor f7152u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f7153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile int f7155c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f7156d = new AtomicBoolean();
    public final AtomicBoolean e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CountDownLatch f7157f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e7.d f7158r;

    static {
        m.b bVar = new m.b(1);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue(10), bVar);
        f7150s = threadPoolExecutor;
        f7152u = threadPoolExecutor;
    }

    public a(e7.d dVar) {
        this.f7158r = dVar;
        m mVar = new m(this, 2);
        this.f7153a = mVar;
        this.f7154b = new b(this, mVar);
        this.f7157f = new CountDownLatch(1);
    }

    public final void a(Object obj) {
        d dVar;
        synchronized (a.class) {
            try {
                if (f7151t == null) {
                    f7151t = new d(Looper.getMainLooper());
                }
                dVar = f7151t;
            } catch (Throwable th) {
                throw th;
            }
        }
        dVar.obtainMessage(1, new c(this, obj)).sendToTarget();
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7158r.b();
    }
}

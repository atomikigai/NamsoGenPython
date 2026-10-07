package ja;

import android.os.SystemClock;
import android.util.Log;
import bd.u;
import com.google.android.gms.tasks.TaskCompletionSource;
import da.c0;
import i5.f;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f5726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f5727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f5728c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f5729d;
    public final int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayBlockingQueue f5730f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ThreadPoolExecutor f5731g;
    public final u h;
    public final aa.c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5733k;

    public c(u uVar, ka.b bVar, aa.c cVar) {
        double d10 = bVar.f6132d;
        double d11 = bVar.e;
        long j4 = ((long) bVar.f6133f) * 1000;
        this.f5726a = d10;
        this.f5727b = d11;
        this.f5728c = j4;
        this.h = uVar;
        this.i = cVar;
        this.f5729d = SystemClock.elapsedRealtime();
        int i = (int) d10;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f5730f = arrayBlockingQueue;
        this.f5731g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f5732j = 0;
        this.f5733k = 0L;
    }

    public final int a() {
        if (this.f5733k == 0) {
            this.f5733k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.f5733k) / this.f5728c);
        int iMin = this.f5730f.size() == this.e ? Math.min(100, this.f5732j + iCurrentTimeMillis) : Math.max(0, this.f5732j - iCurrentTimeMillis);
        if (this.f5732j != iMin) {
            this.f5732j = iMin;
            this.f5733k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(final da.b bVar, final TaskCompletionSource taskCompletionSource) {
        String str = "Sending report through Google DataTransport: " + bVar.f3091b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        final boolean z4 = SystemClock.elapsedRealtime() - this.f5729d < 2000;
        this.h.i(new i5.a(bVar.f3090a, i5.c.f5211c), new f() { // from class: ja.b
            @Override // i5.f
            public final void f(Exception exc) throws Throwable {
                TaskCompletionSource taskCompletionSource2 = taskCompletionSource;
                if (exc != null) {
                    taskCompletionSource2.trySetException(exc);
                    return;
                }
                if (z4) {
                    boolean z10 = true;
                    CountDownLatch countDownLatch = new CountDownLatch(1);
                    new Thread(new androidx.webkit.b(6, this.f5722a, countDownLatch)).start();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    ExecutorService executorService = c0.f3097a;
                    boolean z11 = false;
                    try {
                        long nanos = timeUnit.toNanos(2L);
                        long jNanoTime = System.nanoTime() + nanos;
                        while (true) {
                            try {
                                try {
                                    countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                                    break;
                                } catch (InterruptedException unused) {
                                    nanos = jNanoTime - System.nanoTime();
                                    z11 = true;
                                }
                            } catch (Throwable th) {
                                th = th;
                                if (z10) {
                                    Thread.currentThread().interrupt();
                                }
                                throw th;
                            }
                        }
                        if (z11) {
                            Thread.currentThread().interrupt();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z10 = z11;
                    }
                }
                taskCompletionSource2.trySetResult(bVar);
            }
        });
    }
}

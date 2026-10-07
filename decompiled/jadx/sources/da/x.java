package da;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3167c;

    public x(String str, int i) {
        this.f3165a = i;
        switch (i) {
            case 3:
                this.f3167c = Executors.defaultThreadFactory();
                this.f3166b = str;
                break;
            default:
                this.f3166b = str;
                this.f3167c = new AtomicInteger(1);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3165a) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new w(runnable));
                threadNewThread.setName(((String) this.f3166b) + ((AtomicLong) this.f3167c).getAndIncrement());
                return threadNewThread;
            case 1:
                return new Thread(runnable, "AdWorker(" + ((String) this.f3166b) + ") #" + ((AtomicInteger) this.f3167c).getAndIncrement());
            case 2:
                AtomicInteger atomicInteger = (AtomicInteger) this.f3167c;
                Thread threadNewThread2 = ((ThreadFactory) this.f3166b).newThread(runnable);
                threadNewThread2.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread2;
            default:
                Thread threadNewThread3 = ((ThreadFactory) this.f3167c).newThread(new l5.o(1, runnable));
                threadNewThread3.setName((String) this.f3166b);
                return threadNewThread3;
        }
    }

    public x(o3.b bVar) {
        this.f3165a = 2;
        this.f3166b = Executors.defaultThreadFactory();
        this.f3167c = new AtomicInteger(1);
    }

    public x(String str, AtomicLong atomicLong) {
        this.f3165a = 0;
        this.f3166b = str;
        this.f3167c = atomicLong;
    }
}

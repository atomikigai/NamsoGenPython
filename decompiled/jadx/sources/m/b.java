package m;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f6961b;

    public b(int i) {
        this.f6960a = i;
        switch (i) {
            case 1:
                this.f6961b = new AtomicInteger(1);
                break;
            default:
                this.f6961b = new AtomicInteger(0);
                break;
        }
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f6960a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + this.f6961b.getAndIncrement());
                return thread;
            default:
                return new Thread(runnable, "ModernAsyncTask #" + this.f6961b.getAndIncrement());
        }
    }
}

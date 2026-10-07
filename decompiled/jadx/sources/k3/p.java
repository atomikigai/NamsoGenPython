package k3;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5964a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f5964a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setDaemon(true);
                thread.setName("krypt-router");
                return thread;
            case 1:
                Thread thread2 = new Thread(runnable);
                thread2.setDaemon(true);
                thread2.setName("krypt-relay");
                return thread2;
            case 2:
                Thread thread3 = new Thread(runnable);
                thread3.setDaemon(true);
                thread3.setName("krypt-test");
                return thread3;
            default:
                Thread thread4 = new Thread(runnable, "reCaptcha");
                thread4.setDaemon(true);
                return thread4;
        }
    }
}

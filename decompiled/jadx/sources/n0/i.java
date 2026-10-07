package n0;

import java.util.concurrent.ThreadFactory;
import l5.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7149a;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f7149a) {
            case 0:
                return new h(runnable);
            default:
                return new Thread(new o(2, runnable), "glide-active-resources");
        }
    }
}

package z3;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import y9.j;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f10960a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f10961b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10963d;
    public final AtomicInteger e = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f10962c = c.f10964a;

    public b(a aVar, String str, boolean z4) {
        this.f10960a = aVar;
        this.f10961b = str;
        this.f10963d = z4;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        j jVar = new j(1, this, runnable);
        this.f10960a.getClass();
        od.b bVar = new od.b(jVar);
        bVar.setName("glide-" + this.f10961b + "-thread-" + this.e.getAndIncrement());
        return bVar;
    }
}

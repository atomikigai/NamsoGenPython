package b6;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f1416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f1417b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f1418c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1419d = false;

    public d(b bVar, long j4) {
        this.f1416a = new WeakReference(bVar);
        this.f1417b = j4;
        start();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        b bVar;
        WeakReference weakReference = this.f1416a;
        try {
            if (this.f1418c.await(this.f1417b, TimeUnit.MILLISECONDS) || (bVar = (b) weakReference.get()) == null) {
                return;
            }
            bVar.c();
            this.f1419d = true;
        } catch (InterruptedException unused) {
            b bVar2 = (b) weakReference.get();
            if (bVar2 != null) {
                bVar2.c();
                this.f1419d = true;
            }
        }
    }
}

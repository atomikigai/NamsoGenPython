package n0;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7148a;

    public h(Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.f7148a = 10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f7148a);
        super.run();
    }
}

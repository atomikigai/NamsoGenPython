package l5;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Runnable f6835b;

    public /* synthetic */ o(int i, Runnable runnable) {
        this.f6834a = i;
        this.f6835b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6834a) {
            case 0:
                try {
                    this.f6835b.run();
                } catch (Exception e) {
                    a.a.f(e, "Executor", "Background execution failure.");
                    return;
                }
                break;
            case 1:
                Process.setThreadPriority(0);
                this.f6835b.run();
                break;
            case 2:
                Process.setThreadPriority(10);
                this.f6835b.run();
                break;
            default:
                this.f6835b.run();
                break;
        }
    }

    public String toString() {
        switch (this.f6834a) {
            case 3:
                return this.f6835b.toString();
            default:
                return super.toString();
        }
    }
}

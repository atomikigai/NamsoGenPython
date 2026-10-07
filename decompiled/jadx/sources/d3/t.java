package d3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f2850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2851b;

    public t(u uVar, String str) {
        this.f2850a = uVar;
        this.f2851b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.f2850a.f2855d) {
            try {
                if (((t) this.f2850a.f2853b.remove(this.f2851b)) != null) {
                    s sVar = (s) this.f2850a.f2854c.remove(this.f2851b);
                    if (sVar != null) {
                        String str = this.f2851b;
                        t2.m.d().a(w2.e.f9457u, "Exceeded time limits on execution for " + str, new Throwable[0]);
                        ((w2.e) sVar).d();
                    }
                } else {
                    t2.m.d().a("WrkTimerRunnable", "Timer with " + this.f2851b + " is already marked as complete.", new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

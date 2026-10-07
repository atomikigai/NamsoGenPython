package d3;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f2819d = t2.m.f("StopWorkRunnable");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u2.j f2820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f2821b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2822c;

    public j(u2.j jVar, String str, boolean z4) {
        this.f2820a = jVar;
        this.f2821b = str;
        this.f2822c = z4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zContainsKey;
        boolean zJ;
        u2.j jVar = this.f2820a;
        WorkDatabase workDatabase = jVar.f8821o;
        u2.b bVar = jVar.f8824r;
        c3.j jVarX = workDatabase.x();
        workDatabase.c();
        try {
            String str = this.f2821b;
            synchronized (bVar.f8799v) {
                zContainsKey = bVar.f8794f.containsKey(str);
            }
            if (this.f2822c) {
                zJ = this.f2820a.f8824r.i(this.f2821b);
            } else {
                if (!zContainsKey && jVarX.i(this.f2821b) == 2) {
                    jVarX.r(1, this.f2821b);
                }
                zJ = this.f2820a.f8824r.j(this.f2821b);
            }
            t2.m.d().a(f2819d, "StopWorkRunnable for " + this.f2821b + "; Processor.stopWork = " + zJ, new Throwable[0]);
            workDatabase.q();
            workDatabase.n();
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }
}

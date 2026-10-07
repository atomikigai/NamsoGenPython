package d3;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f2812a;

    public /* synthetic */ f(WorkDatabase workDatabase) {
        this.f2812a = workDatabase;
    }

    public int a(int i) {
        int i10;
        synchronized (f.class) {
            try {
                WorkDatabase workDatabase = this.f2812a;
                workDatabase.c();
                try {
                    Long lX = workDatabase.t().x("next_job_scheduler_id");
                    i10 = 0;
                    int iIntValue = lX != null ? lX.intValue() : 0;
                    workDatabase.t().C(new c3.c("next_job_scheduler_id", iIntValue == Integer.MAX_VALUE ? 0 : iIntValue + 1));
                    workDatabase.q();
                    workDatabase.n();
                    if (iIntValue < 0 || iIntValue > i) {
                        this.f2812a.t().C(new c3.c("next_job_scheduler_id", 1));
                    } else {
                        i10 = iIntValue;
                    }
                } catch (Throwable th) {
                    workDatabase.n();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i10;
    }
}

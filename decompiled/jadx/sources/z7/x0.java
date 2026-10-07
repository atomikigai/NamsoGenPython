package z7;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11422c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z0 f11423d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, Runnable runnable, boolean z4, String str) {
        super(runnable, null);
        this.f11423d = z0Var;
        long andIncrement = z0.f11495v.getAndIncrement();
        this.f11420a = andIncrement;
        this.f11422c = str;
        this.f11421b = z4;
        if (andIncrement == Long.MAX_VALUE) {
            i0 i0Var = ((a1) z0Var.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11190f.b("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        x0 x0Var = (x0) obj;
        boolean z4 = x0Var.f11421b;
        boolean z10 = this.f11421b;
        if (z10 != z4) {
            return !z10 ? 1 : -1;
        }
        long j4 = x0Var.f11420a;
        long j10 = this.f11420a;
        if (j10 < j4) {
            return -1;
        }
        if (j10 > j4) {
            return 1;
        }
        i0 i0Var = ((a1) this.f11423d.f159a).f11007t;
        a1.f(i0Var);
        i0Var.f11191r.c(Long.valueOf(j10), "Two tasks share the same index. index");
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        i0 i0Var = ((a1) this.f11423d.f159a).f11007t;
        a1.f(i0Var);
        i0Var.f11190f.c(th, this.f11422c);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(z0 z0Var, Callable callable, boolean z4) {
        super(callable);
        this.f11423d = z0Var;
        long andIncrement = z0.f11495v.getAndIncrement();
        this.f11420a = andIncrement;
        this.f11422c = "Task exception on worker thread";
        this.f11421b = z4;
        if (andIncrement == Long.MAX_VALUE) {
            i0 i0Var = ((a1) z0Var.f159a).f11007t;
            a1.f(i0Var);
            i0Var.f11190f.b("Tasks index overflow");
        }
    }
}

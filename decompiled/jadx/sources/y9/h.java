package y9;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends t.g implements ScheduledFuture {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ScheduledFuture f10655s;

    public h(g gVar) {
        this.f10655s = gVar.a(new ta.c(this));
    }

    @Override // t.g
    public final void b() {
        ScheduledFuture scheduledFuture = this.f10655s;
        Object obj = this.f8509a;
        scheduledFuture.cancel((obj instanceof t.a) && ((t.a) obj).f8493a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f10655s.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f10655s.getDelay(timeUnit);
    }
}

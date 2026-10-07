package od;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final w f7767d = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f7769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f7770c;

    public x a() {
        this.f7768a = false;
        return this;
    }

    public x b() {
        this.f7770c = 0L;
        return this;
    }

    public long c() {
        if (this.f7768a) {
            return this.f7769b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j4) {
        this.f7768a = true;
        this.f7769b = j4;
        return this;
    }

    public boolean e() {
        return this.f7768a;
    }

    public void f() throws InterruptedIOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f7768a && this.f7769b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j4) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        jc.i.e(timeUnit, "unit");
        if (j4 < 0) {
            throw new IllegalArgumentException(da.v.g("timeout < 0: ", j4).toString());
        }
        this.f7770c = timeUnit.toNanos(j4);
        return this;
    }
}

package od;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends x {
    public x e;

    public j(x xVar) {
        jc.i.e(xVar, "delegate");
        this.e = xVar;
    }

    @Override // od.x
    public final x a() {
        return this.e.a();
    }

    @Override // od.x
    public final x b() {
        return this.e.b();
    }

    @Override // od.x
    public final long c() {
        return this.e.c();
    }

    @Override // od.x
    public final x d(long j4) {
        return this.e.d(j4);
    }

    @Override // od.x
    public final boolean e() {
        return this.e.e();
    }

    @Override // od.x
    public final void f() throws InterruptedIOException {
        this.e.f();
    }

    @Override // od.x
    public final x g(long j4) {
        jc.i.e(TimeUnit.MILLISECONDS, "unit");
        return this.e.g(j4);
    }
}

package hd;

import od.g;
import od.j;
import od.t;
import od.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ab.a f5125c;

    public e(ab.a aVar) {
        this.f5125c = aVar;
        this.f5123a = new j(((g) aVar.e).a());
    }

    @Override // od.t
    public final x a() {
        return this.f5123a;
    }

    @Override // od.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5124b) {
            return;
        }
        this.f5124b = true;
        j jVar = this.f5123a;
        x xVar = jVar.e;
        jVar.e = x.f7767d;
        xVar.a();
        xVar.b();
        this.f5125c.f266a = 3;
    }

    @Override // od.t
    public final void f(long j4, od.f fVar) {
        if (this.f5124b) {
            throw new IllegalStateException("closed");
        }
        cd.b.c(fVar.f7734b, 0L, j4);
        ((g) this.f5125c.e).f(j4, fVar);
    }

    @Override // od.t, java.io.Flushable
    public final void flush() {
        if (this.f5124b) {
            return;
        }
        ((g) this.f5125c.e).flush();
    }
}

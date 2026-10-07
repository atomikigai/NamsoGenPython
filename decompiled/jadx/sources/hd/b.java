package hd;

import od.g;
import od.j;
import od.t;
import od.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f5116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ab.a f5118c;

    public b(ab.a aVar) {
        this.f5118c = aVar;
        this.f5116a = new j(((g) aVar.e).a());
    }

    @Override // od.t
    public final x a() {
        return this.f5116a;
    }

    @Override // od.t, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f5117b) {
            return;
        }
        this.f5117b = true;
        ((g) this.f5118c.e).y("0\r\n\r\n");
        j jVar = this.f5116a;
        x xVar = jVar.e;
        jVar.e = x.f7767d;
        xVar.a();
        xVar.b();
        this.f5118c.f266a = 3;
    }

    @Override // od.t
    public final void f(long j4, od.f fVar) {
        g gVar = (g) this.f5118c.e;
        if (this.f5117b) {
            throw new IllegalStateException("closed");
        }
        if (j4 == 0) {
            return;
        }
        gVar.D(j4);
        gVar.y("\r\n");
        gVar.f(j4, fVar);
        gVar.y("\r\n");
    }

    @Override // od.t, java.io.Flushable
    public final synchronized void flush() {
        if (this.f5117b) {
            return;
        }
        ((g) this.f5118c.e).flush();
    }
}

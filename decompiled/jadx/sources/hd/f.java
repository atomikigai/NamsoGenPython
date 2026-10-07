package hd;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5126d;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f5114b) {
            return;
        }
        if (!this.f5126d) {
            c();
        }
        this.f5114b = true;
    }

    @Override // hd.a, od.v
    public final long t(long j4, od.f fVar) throws IOException {
        if (this.f5114b) {
            throw new IllegalStateException("closed");
        }
        if (this.f5126d) {
            return -1L;
        }
        long jT = super.t(8192L, fVar);
        if (jT != -1) {
            return jT;
        }
        this.f5126d = true;
        c();
        return -1L;
    }
}

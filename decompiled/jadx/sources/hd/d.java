package hd;

import fd.k;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5122d;
    public final /* synthetic */ ab.a e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ab.a aVar, long j4) {
        super(aVar);
        this.e = aVar;
        this.f5122d = j4;
        if (j4 == 0) {
            c();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.f5114b) {
            return;
        }
        if (this.f5122d != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = cd.b.f1822a;
            i.e(timeUnit, "timeUnit");
            try {
                zT = cd.b.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((k) this.e.f268c).k();
                c();
            }
        }
        this.f5114b = true;
    }

    @Override // hd.a, od.v
    public final long t(long j4, od.f fVar) throws IOException {
        if (this.f5114b) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f5122d;
        if (j10 == 0) {
            return -1L;
        }
        long jT = super.t(Math.min(j10, 8192L), fVar);
        if (jT == -1) {
            ((k) this.e.f268c).k();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }
        long j11 = this.f5122d - jT;
        this.f5122d = j11;
        if (j11 == 0) {
            c();
        }
        return jT;
    }
}

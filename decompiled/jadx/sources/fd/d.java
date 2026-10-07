package fd;

import java.io.IOException;
import java.net.ProtocolException;
import od.v;
import od.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f3905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f3907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3908d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3909f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e f3910r;

    public d(e eVar, v vVar, long j4) {
        jc.i.e(vVar, "delegate");
        this.f3910r = eVar;
        this.f3905a = vVar;
        this.f3906b = j4;
        this.f3908d = true;
        if (j4 == 0) {
            d(null);
        }
    }

    @Override // od.v
    public final x a() {
        return this.f3905a.a();
    }

    public final void c() throws IOException {
        this.f3905a.close();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f3909f) {
            return;
        }
        this.f3909f = true;
        try {
            c();
            d(null);
        } catch (IOException e) {
            throw d(e);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.e) {
            return iOException;
        }
        this.e = true;
        if (iOException == null && this.f3908d) {
            this.f3908d = false;
        }
        return this.f3910r.a(true, false, iOException);
    }

    @Override // od.v
    public final long t(long j4, od.f fVar) throws IOException {
        if (this.f3909f) {
            throw new IllegalStateException("closed");
        }
        try {
            long jT = this.f3905a.t(8192L, fVar);
            if (this.f3908d) {
                this.f3908d = false;
            }
            if (jT == -1) {
                d(null);
                return -1L;
            }
            long j10 = this.f3907c + jT;
            long j11 = this.f3906b;
            if (j11 == -1 || j10 <= j11) {
                this.f3907c = j10;
                if (j10 == j11) {
                    d(null);
                }
                return jT;
            }
            throw new ProtocolException("expected " + j11 + " bytes but received " + j10);
        } catch (IOException e) {
            throw d(e);
        }
    }

    public final String toString() {
        return d.class.getSimpleName() + '(' + this.f3905a + ')';
    }
}

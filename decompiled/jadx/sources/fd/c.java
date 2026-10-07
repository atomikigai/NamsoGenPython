package fd;

import da.v;
import java.io.IOException;
import java.net.ProtocolException;
import od.t;
import od.x;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f3900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f3901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f3903d;
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f3904f;

    public c(e eVar, t tVar, long j4) {
        jc.i.e(tVar, "delegate");
        this.f3904f = eVar;
        this.f3900a = tVar;
        this.f3901b = j4;
    }

    @Override // od.t
    public final x a() {
        return this.f3900a.a();
    }

    public final void c() {
        this.f3900a.close();
    }

    @Override // od.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.e) {
            return;
        }
        this.e = true;
        long j4 = this.f3901b;
        if (j4 != -1 && this.f3903d != j4) {
            throw new ProtocolException("unexpected end of stream");
        }
        try {
            c();
            d(null);
        } catch (IOException e) {
            throw d(e);
        }
    }

    public final IOException d(IOException iOException) {
        if (this.f3902c) {
            return iOException;
        }
        this.f3902c = true;
        return this.f3904f.a(false, true, iOException);
    }

    @Override // od.t
    public final void f(long j4, od.f fVar) throws IOException {
        if (this.e) {
            throw new IllegalStateException("closed");
        }
        long j10 = this.f3901b;
        if (j10 != -1 && this.f3903d + j4 > j10) {
            StringBuilder sbL = v.l("expected ", " bytes but received ", j10);
            sbL.append(this.f3903d + j4);
            throw new ProtocolException(sbL.toString());
        }
        try {
            this.f3900a.f(j4, fVar);
            this.f3903d += j4;
        } catch (IOException e) {
            throw d(e);
        }
    }

    @Override // od.t, java.io.Flushable
    public final void flush() throws IOException {
        try {
            g();
        } catch (IOException e) {
            throw d(e);
        }
    }

    public final void g() {
        this.f3900a.flush();
    }

    public final String toString() {
        return c.class.getSimpleName() + '(' + this.f3900a + ')';
    }
}

package id;

import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class u implements od.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5331b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final od.f f5332c = new od.f();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final od.f f5333d = new od.f();
    public boolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ w f5334f;

    public u(w wVar, long j4, boolean z4) {
        this.f5334f = wVar;
        this.f5330a = j4;
        this.f5331b = z4;
    }

    @Override // od.v
    public final od.x a() {
        return this.f5334f.f5343k;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j4;
        w wVar = this.f5334f;
        synchronized (wVar) {
            this.e = true;
            od.f fVar = this.f5333d;
            j4 = fVar.f7734b;
            fVar.skip(j4);
            wVar.notifyAll();
        }
        if (j4 > 0) {
            w wVar2 = this.f5334f;
            byte[] bArr = cd.b.f1822a;
            wVar2.f5337b.B(j4);
        }
        this.f5334f.a();
    }

    @Override // od.v
    public final long t(long j4, od.f fVar) throws Throwable {
        int i;
        Throwable b0Var;
        boolean z4;
        long jT;
        do {
            w wVar = this.f5334f;
            synchronized (wVar) {
                wVar.f5343k.h();
                try {
                    synchronized (wVar) {
                        i = wVar.f5345m;
                    }
                } catch (Throwable th) {
                    wVar.f5343k.k();
                    throw th;
                }
            }
            if (i != 0 && !this.f5331b) {
                b0Var = wVar.f5346n;
                if (b0Var == null) {
                    synchronized (wVar) {
                        int i10 = wVar.f5345m;
                        da.v.p(i10);
                        b0Var = new b0(i10);
                    }
                }
                throw th;
            }
            b0Var = null;
            if (this.e) {
                throw new IOException("stream closed");
            }
            od.f fVar2 = this.f5333d;
            long j10 = fVar2.f7734b;
            z4 = false;
            if (j10 > 0) {
                jT = fVar2.t(Math.min(8192L, j10), fVar);
                long j11 = wVar.f5338c + jT;
                wVar.f5338c = j11;
                long j12 = j11 - wVar.f5339d;
                if (b0Var == null && j12 >= wVar.f5337b.A.a() / 2) {
                    wVar.f5337b.H(wVar.f5336a, j12);
                    wVar.f5339d = wVar.f5338c;
                }
            } else {
                if (!this.f5331b && b0Var == null) {
                    try {
                        wVar.wait();
                        z4 = true;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                jT = -1;
            }
            wVar.f5343k.k();
        } while (z4);
        if (jT != -1) {
            return jT;
        }
        if (b0Var == null) {
            return -1L;
        }
        throw b0Var;
    }
}

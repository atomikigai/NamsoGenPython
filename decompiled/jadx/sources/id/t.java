package id;

import java.io.InterruptedIOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class t implements od.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od.f f5327b = new od.f();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f5329d;

    public t(w wVar, boolean z4) {
        this.f5329d = wVar;
        this.f5326a = z4;
    }

    @Override // od.t
    public final od.x a() {
        return this.f5329d.f5344l;
    }

    public final void c(boolean z4) {
        long jMin;
        boolean z10;
        w wVar = this.f5329d;
        synchronized (wVar) {
            wVar.f5344l.h();
            while (wVar.e >= wVar.f5340f && !this.f5326a && !this.f5328c) {
                try {
                    synchronized (wVar) {
                        int i = wVar.f5345m;
                        if (i != 0) {
                            break;
                        }
                        try {
                            wVar.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } catch (Throwable th) {
                    wVar.f5344l.k();
                    throw th;
                }
            }
            wVar.f5344l.k();
            wVar.b();
            jMin = Math.min(wVar.f5340f - wVar.e, this.f5327b.f7734b);
            wVar.e += jMin;
            z10 = z4 && jMin == this.f5327b.f7734b;
        }
        this.f5329d.f5344l.h();
        try {
            w wVar2 = this.f5329d;
            wVar2.f5337b.E(wVar2.f5336a, z10, this.f5327b, jMin);
        } finally {
            this.f5329d.f5344l.k();
        }
    }

    @Override // od.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z4;
        w wVar = this.f5329d;
        byte[] bArr = cd.b.f1822a;
        synchronized (wVar) {
            if (this.f5328c) {
                return;
            }
            synchronized (wVar) {
                z4 = wVar.f5345m == 0;
            }
            w wVar2 = this.f5329d;
            if (!wVar2.f5342j.f5326a) {
                if (this.f5327b.f7734b > 0) {
                    while (this.f5327b.f7734b > 0) {
                        c(true);
                    }
                } else if (z4) {
                    wVar2.f5337b.E(wVar2.f5336a, true, null, 0L);
                }
            }
            synchronized (this.f5329d) {
                this.f5328c = true;
            }
            this.f5329d.f5337b.flush();
            this.f5329d.a();
        }
    }

    @Override // od.t
    public final void f(long j4, od.f fVar) {
        byte[] bArr = cd.b.f1822a;
        od.f fVar2 = this.f5327b;
        fVar2.f(j4, fVar);
        while (fVar2.f7734b >= 16384) {
            c(false);
        }
    }

    @Override // od.t, java.io.Flushable
    public final void flush() {
        w wVar = this.f5329d;
        byte[] bArr = cd.b.f1822a;
        synchronized (wVar) {
            wVar.b();
        }
        while (this.f5327b.f7734b > 0) {
            c(false);
            this.f5329d.f5337b.flush();
        }
    }
}

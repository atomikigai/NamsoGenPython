package od;

import fa.c1;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7722a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f7723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7724c;

    public c(OutputStream outputStream, u uVar) {
        this.f7724c = outputStream;
        this.f7723b = uVar;
    }

    @Override // od.t
    public final x a() {
        switch (this.f7722a) {
            case 0:
                break;
        }
        return this.f7723b;
    }

    @Override // od.t, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f7722a) {
            case 0:
                c cVar = (c) this.f7724c;
                u uVar = this.f7723b;
                uVar.h();
                try {
                    try {
                        cVar.close();
                        if (uVar.i()) {
                            throw uVar.k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!uVar.i()) {
                            throw e;
                        }
                        throw uVar.k(e);
                    }
                } catch (Throwable th) {
                    uVar.i();
                    throw th;
                }
            default:
                ((OutputStream) this.f7724c).close();
                return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x008f A[LOOP:1: B:12:0x0058->B:25:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:49:0x0091 A[SYNTHETIC] */
    @Override // od.t
    public final void f(long j4, f fVar) throws IOException {
        u uVar;
        switch (this.f7722a) {
            case 0:
                c1.k(fVar.f7734b, 0L, j4);
                long j10 = j4;
                while (true) {
                    long j11 = 0;
                    if (j10 <= 0) {
                        return;
                    }
                    q qVar = fVar.f7733a;
                    jc.i.b(qVar);
                    try {
                        try {
                            while (j11 < 65536) {
                                j11 += (long) (qVar.f7758c - qVar.f7757b);
                                if (j11 >= j10) {
                                    j11 = j10;
                                    c cVar = (c) this.f7724c;
                                    uVar = this.f7723b;
                                    uVar.h();
                                    cVar.f(j11, fVar);
                                    if (!uVar.i()) {
                                        throw uVar.k(null);
                                    }
                                    j10 -= j11;
                                } else {
                                    qVar = qVar.f7760f;
                                    jc.i.b(qVar);
                                }
                            }
                            cVar.f(j11, fVar);
                            if (!uVar.i()) {
                                throw uVar.k(null);
                            }
                            j10 -= j11;
                        } catch (IOException e) {
                            if (!uVar.i()) {
                                throw e;
                            }
                            throw uVar.k(e);
                        }
                    } catch (Throwable th) {
                        uVar.i();
                        throw th;
                    }
                    c cVar2 = (c) this.f7724c;
                    uVar = this.f7723b;
                    uVar.h();
                }
                break;
            default:
                c1.k(fVar.f7734b, 0L, j4);
                while (j4 > 0) {
                    this.f7723b.f();
                    q qVar2 = fVar.f7733a;
                    jc.i.b(qVar2);
                    int iMin = (int) Math.min(j4, qVar2.f7758c - qVar2.f7757b);
                    ((OutputStream) this.f7724c).write(qVar2.f7756a, qVar2.f7757b, iMin);
                    int i = qVar2.f7757b + iMin;
                    qVar2.f7757b = i;
                    long j12 = iMin;
                    j4 -= j12;
                    fVar.f7734b -= j12;
                    if (i == qVar2.f7758c) {
                        fVar.f7733a = qVar2.a();
                        r.a(qVar2);
                    }
                }
                return;
        }
    }

    @Override // od.t, java.io.Flushable
    public final void flush() throws IOException {
        switch (this.f7722a) {
            case 0:
                c cVar = (c) this.f7724c;
                u uVar = this.f7723b;
                uVar.h();
                try {
                    try {
                        cVar.flush();
                        if (uVar.i()) {
                            throw uVar.k(null);
                        }
                        return;
                    } catch (IOException e) {
                        if (!uVar.i()) {
                            throw e;
                        }
                        throw uVar.k(e);
                    }
                } catch (Throwable th) {
                    uVar.i();
                    throw th;
                }
            default:
                ((OutputStream) this.f7724c).flush();
                return;
        }
    }

    public final String toString() {
        switch (this.f7722a) {
            case 0:
                return "AsyncTimeout.sink(" + ((c) this.f7724c) + ')';
            default:
                return "sink(" + ((OutputStream) this.f7724c) + ')';
        }
    }

    public c(u uVar, c cVar) {
        this.f7723b = uVar;
        this.f7724c = cVar;
    }
}

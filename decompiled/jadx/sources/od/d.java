package od;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f7726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f7727c;

    public /* synthetic */ d(int i, Object obj, Object obj2) {
        this.f7725a = i;
        this.f7726b = obj;
        this.f7727c = obj2;
    }

    @Override // od.v
    public final x a() {
        switch (this.f7725a) {
            case 0:
                return (u) this.f7726b;
            default:
                return (x) this.f7727c;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f7725a) {
            case 0:
                u uVar = (u) this.f7726b;
                d dVar = (d) this.f7727c;
                uVar.h();
                try {
                    try {
                        dVar.close();
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
                ((InputStream) this.f7726b).close();
                return;
        }
    }

    @Override // od.v
    public final long t(long j4, f fVar) throws IOException {
        switch (this.f7725a) {
            case 0:
                u uVar = (u) this.f7726b;
                d dVar = (d) this.f7727c;
                uVar.h();
                try {
                    try {
                        long jT = dVar.t(8192L, fVar);
                        if (uVar.i()) {
                            throw uVar.k(null);
                        }
                        return jT;
                    } catch (IOException e) {
                        if (uVar.i()) {
                            throw uVar.k(e);
                        }
                        throw e;
                    }
                } catch (Throwable th) {
                    uVar.i();
                    throw th;
                }
            default:
                try {
                    ((x) this.f7727c).f();
                    q qVarH = fVar.H(1);
                    int i = ((InputStream) this.f7726b).read(qVarH.f7756a, qVarH.f7758c, (int) Math.min(8192L, 8192 - qVarH.f7758c));
                    if (i == -1) {
                        if (qVarH.f7757b == qVarH.f7758c) {
                            fVar.f7733a = qVarH.a();
                            r.a(qVarH);
                        }
                        return -1L;
                    }
                    qVarH.f7758c += i;
                    long j10 = i;
                    fVar.f7734b += j10;
                    return j10;
                } catch (AssertionError e4) {
                    if (jd.l.n(e4)) {
                        throw new IOException(e4);
                    }
                    throw e4;
                }
        }
    }

    public final String toString() {
        switch (this.f7725a) {
            case 0:
                return "AsyncTimeout.source(" + ((d) this.f7727c) + ')';
            default:
                return "source(" + ((InputStream) this.f7726b) + ')';
        }
    }
}

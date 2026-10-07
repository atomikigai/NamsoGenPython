package od;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f7743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Inflater f7744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f7745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7746d;

    public l(p pVar, Inflater inflater) {
        this.f7743a = pVar;
        this.f7744b = inflater;
    }

    @Override // od.v
    public final x a() {
        return this.f7743a.f7753a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f7746d) {
            return;
        }
        this.f7744b.end();
        this.f7746d = true;
        this.f7743a.close();
    }

    @Override // od.v
    public final long t(long j4, f fVar) throws IOException {
        long j10;
        Inflater inflater = this.f7744b;
        jc.i.e(fVar, "sink");
        while (!this.f7746d) {
            try {
                q qVarH = fVar.H(1);
                int iMin = (int) Math.min(8192L, 8192 - qVarH.f7758c);
                boolean zNeedsInput = inflater.needsInput();
                p pVar = this.f7743a;
                if (zNeedsInput && !pVar.c()) {
                    q qVar = pVar.f7754b.f7733a;
                    jc.i.b(qVar);
                    int i = qVar.f7758c;
                    int i10 = qVar.f7757b;
                    int i11 = i - i10;
                    this.f7745c = i11;
                    inflater.setInput(qVar.f7756a, i10, i11);
                }
                int iInflate = inflater.inflate(qVarH.f7756a, qVarH.f7758c, iMin);
                int i12 = this.f7745c;
                if (i12 != 0) {
                    int remaining = i12 - inflater.getRemaining();
                    this.f7745c -= remaining;
                    pVar.skip(remaining);
                }
                if (iInflate > 0) {
                    qVarH.f7758c += iInflate;
                    j10 = iInflate;
                    fVar.f7734b += j10;
                } else {
                    if (qVarH.f7757b == qVarH.f7758c) {
                        fVar.f7733a = qVarH.a();
                        r.a(qVarH);
                    }
                    j10 = 0;
                }
                if (j10 > 0) {
                    return j10;
                }
                if (inflater.finished() || inflater.needsDictionary()) {
                    return -1L;
                }
                if (pVar.c()) {
                    throw new EOFException("source exhausted prematurely");
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        throw new IllegalStateException("closed");
    }
}

package hd;

import bd.o;
import fd.k;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import jc.i;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class c extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o f5119d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5120f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ ab.a f5121r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ab.a aVar, o oVar) {
        super(aVar);
        i.e(oVar, "url");
        this.f5121r = aVar;
        this.f5119d = oVar;
        this.e = -1L;
        this.f5120f = true;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean zT;
        if (this.f5114b) {
            return;
        }
        if (this.f5120f) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            byte[] bArr = cd.b.f1822a;
            i.e(timeUnit, "timeUnit");
            try {
                zT = cd.b.t(this, 100);
            } catch (IOException unused) {
                zT = false;
            }
            if (!zT) {
                ((k) this.f5121r.f268c).k();
                c();
            }
        }
        this.f5114b = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007c, code lost:
    
        if (r9.f5120f == false) goto L28;
     */
    @Override // hd.a, od.v
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long t(long r10, od.f r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: hd.c.t(long, od.f):long");
    }
}

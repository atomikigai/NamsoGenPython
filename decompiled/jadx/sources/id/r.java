package id;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class r implements od.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od.h f5317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5320d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5321f;

    public r(od.h hVar) {
        jc.i.e(hVar, "source");
        this.f5317a = hVar;
    }

    @Override // od.v
    public final od.x a() {
        return this.f5317a.a();
    }

    @Override // od.v
    public final long t(long j4, od.f fVar) throws IOException {
        int i;
        int i10;
        do {
            int i11 = this.e;
            od.h hVar = this.f5317a;
            if (i11 == 0) {
                hVar.skip(this.f5321f);
                this.f5321f = 0;
                if ((this.f5319c & 4) == 0) {
                    i = this.f5320d;
                    int iS = cd.b.s(hVar);
                    this.e = iS;
                    this.f5318b = iS;
                    int i12 = hVar.readByte() & 255;
                    this.f5319c = hVar.readByte() & 255;
                    Logger logger = s.f5322d;
                    if (logger.isLoggable(Level.FINE)) {
                        od.i iVar = f.f5280a;
                        logger.fine(f.a(this.f5320d, this.f5318b, i12, this.f5319c, true));
                    }
                    i10 = hVar.readInt() & com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
                    this.f5320d = i10;
                    if (i12 != 9) {
                        throw new IOException(i12 + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long jT = hVar.t(Math.min(8192L, i11), fVar);
                if (jT != -1) {
                    this.e -= (int) jT;
                    return jT;
                }
            }
            return -1L;
        } while (i10 == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

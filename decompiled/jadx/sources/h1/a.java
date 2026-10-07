package h1;

import android.media.MediaDataSource;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f4567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f4568b;

    public a(f fVar) {
        this.f4568b = fVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i, int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (j4 < 0) {
            return -1;
        }
        try {
            long j10 = this.f4567a;
            f fVar = this.f4568b;
            if (j10 != j4) {
                if (j10 >= 0 && j4 >= j10 + ((long) fVar.f4570a.available())) {
                    return -1;
                }
                fVar.d(j4);
                this.f4567a = j4;
            }
            if (i10 > fVar.f4570a.available()) {
                i10 = fVar.f4570a.available();
            }
            int i11 = fVar.read(bArr, i, i10);
            if (i11 >= 0) {
                this.f4567a += (long) i11;
                return i11;
            }
        } catch (IOException unused) {
        }
        this.f4567a = -1L;
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

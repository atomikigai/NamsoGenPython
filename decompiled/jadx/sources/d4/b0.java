package d4;

import android.media.MediaDataSource;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ByteBuffer f2863a;

    public b0(ByteBuffer byteBuffer) {
        this.f2863a = byteBuffer;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return this.f2863a.limit();
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j4, byte[] bArr, int i, int i10) {
        ByteBuffer byteBuffer = this.f2863a;
        if (j4 >= byteBuffer.limit()) {
            return -1;
        }
        byteBuffer.position((int) j4);
        int iMin = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}

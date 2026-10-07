package p4;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ByteBuffer f7788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7789b = -1;

    public a(ByteBuffer byteBuffer) {
        this.f7788a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f7788a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f7789b = this.f7788a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        ByteBuffer byteBuffer = this.f7788a;
        if (byteBuffer.hasRemaining()) {
            return byteBuffer.get() & 255;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.f7789b;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.f7788a.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j4) {
        ByteBuffer byteBuffer = this.f7788a;
        if (!byteBuffer.hasRemaining()) {
            return -1L;
        }
        long jMin = Math.min(j4, byteBuffer.remaining());
        byteBuffer.position((int) (((long) byteBuffer.position()) + jMin));
        return jMin;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        ByteBuffer byteBuffer = this.f7788a;
        if (!byteBuffer.hasRemaining()) {
            return -1;
        }
        int iMin = Math.min(i10, byteBuffer.remaining());
        byteBuffer.get(bArr, i, iMin);
        return iMin;
    }
}

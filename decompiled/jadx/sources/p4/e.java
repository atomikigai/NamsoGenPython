package p4;

import d4.w;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends InputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayDeque f7794c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public w f7795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public IOException f7796b;

    static {
        char[] cArr = n.f7811a;
        f7794c = new ArrayDeque(0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f7795a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7795a.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.f7795a.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        this.f7795a.getClass();
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        try {
            return this.f7795a.read();
        } catch (IOException e) {
            this.f7796b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.f7795a.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j4) throws IOException {
        try {
            return this.f7795a.skip(j4);
        } catch (IOException e) {
            this.f7796b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        try {
            return this.f7795a.read(bArr);
        } catch (IOException e) {
            this.f7796b = e;
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        try {
            return this.f7795a.read(bArr, i, i10);
        } catch (IOException e) {
            this.f7796b = e;
            throw e;
        }
    }
}

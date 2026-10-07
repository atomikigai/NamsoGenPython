package p4;

import da.v;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7793b;

    public d(InputStream inputStream, long j4) {
        super(inputStream);
        this.f7792a = j4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return (int) Math.max(this.f7792a - ((long) this.f7793b), ((FilterInputStream) this).in.available());
    }

    public final void c(int i) throws IOException {
        if (i >= 0) {
            this.f7793b += i;
            return;
        }
        long j4 = this.f7793b;
        long j10 = this.f7792a;
        if (j10 - j4 <= 0) {
            return;
        }
        StringBuilder sbL = v.l("Failed to read all expected data, expected: ", ", but read: ", j10);
        sbL.append(this.f7793b);
        throw new IOException(sbL.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        c(i >= 0 ? 1 : -1);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i10) {
        int i11;
        i11 = super.read(bArr, i, i10);
        c(i11);
        return i11;
    }
}

package p4;

import java.io.FilterInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7806a;

    public k(e eVar) {
        super(eVar);
        this.f7806a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        int i = this.f7806a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final long c(long j4) {
        int i = this.f7806a;
        if (i == 0) {
            return -1L;
        }
        return (i == Integer.MIN_VALUE || j4 <= ((long) i)) ? j4 : i;
    }

    public final void d(long j4) {
        int i = this.f7806a;
        if (i == Integer.MIN_VALUE || j4 == -1) {
            return;
        }
        this.f7806a = (int) (((long) i) - j4);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        super.mark(i);
        this.f7806a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (c(1L) == -1) {
            return -1;
        }
        int i = super.read();
        d(1L);
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        super.reset();
        this.f7806a = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) throws IOException {
        long jC = c(j4);
        if (jC == -1) {
            return 0L;
        }
        long jSkip = super.skip(jC);
        d(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int iC = (int) c(i10);
        if (iC == -1) {
            return -1;
        }
        int i11 = super.read(bArr, i, iC);
        d(i11);
        return i11;
    }
}

package gb;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class d extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4450a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f4451b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f4452c;

    public d(InputStream inputStream) {
        super(inputStream);
        this.f4452c = -1L;
        this.f4451b = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() {
        switch (this.f4450a) {
            case 0:
                return (int) Math.min(((FilterInputStream) this).in.available(), this.f4451b);
            default:
                return super.available();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i) {
        switch (this.f4450a) {
            case 0:
                synchronized (this) {
                    ((FilterInputStream) this).in.mark(i);
                    this.f4452c = this.f4451b;
                }
                return;
            default:
                super.mark(i);
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        switch (this.f4450a) {
            case 0:
                if (this.f4451b == 0) {
                    return -1;
                }
                int i = ((FilterInputStream) this).in.read();
                if (i != -1) {
                    this.f4451b--;
                }
                return i;
            default:
                int i10 = super.read();
                if (i10 != -1) {
                    this.f4452c++;
                }
                return i10;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        switch (this.f4450a) {
            case 0:
                synchronized (this) {
                    if (!((FilterInputStream) this).in.markSupported()) {
                        throw new IOException("Mark not supported");
                    }
                    if (this.f4452c == -1) {
                        throw new IOException("Mark not set");
                    }
                    ((FilterInputStream) this).in.reset();
                    this.f4451b = this.f4452c;
                }
                return;
            default:
                super.reset();
                return;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j4) throws IOException {
        switch (this.f4450a) {
            case 0:
                long jSkip = ((FilterInputStream) this).in.skip(Math.min(j4, this.f4451b));
                this.f4451b -= jSkip;
                return jSkip;
            default:
                return super.skip(j4);
        }
    }

    public d(BufferedInputStream bufferedInputStream, long j4) {
        super(bufferedInputStream);
        this.f4451b = j4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        switch (this.f4450a) {
            case 0:
                long j4 = this.f4451b;
                if (j4 == 0) {
                    return -1;
                }
                int i11 = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i10, j4));
                if (i11 != -1) {
                    this.f4451b -= (long) i11;
                }
                return i11;
            default:
                int i12 = super.read(bArr, i, i10);
                if (i12 != -1) {
                    this.f4452c += (long) i12;
                }
                return i12;
        }
    }
}

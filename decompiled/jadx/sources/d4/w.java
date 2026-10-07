package d4;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile byte[] f2906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f2907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f2908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f2909d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x3.f f2910f;

    public w(InputStream inputStream, x3.f fVar) {
        super(inputStream);
        this.f2909d = -1;
        this.f2910f = fVar;
        this.f2906a = (byte[]) fVar.c(65536, byte[].class);
    }

    public static void g() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f2906a == null || inputStream == null) {
            g();
            throw null;
        }
        return (this.f2907b - this.e) + inputStream.available();
    }

    public final int c(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.f2909d;
        if (i != -1) {
            int i10 = this.e - i;
            int i11 = this.f2908c;
            if (i10 < i11) {
                if (i == 0 && i11 > bArr.length && this.f2907b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i11) {
                        i11 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f2910f.c(i11, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f2906a = bArr2;
                    this.f2910f.g(bArr);
                    bArr = bArr2;
                } else if (i > 0) {
                    System.arraycopy(bArr, i, bArr, 0, bArr.length - i);
                }
                int i12 = this.e - this.f2909d;
                this.e = i12;
                this.f2909d = 0;
                this.f2907b = 0;
                int i13 = inputStream.read(bArr, i12, bArr.length - i12);
                int i14 = this.e;
                if (i13 > 0) {
                    i14 += i13;
                }
                this.f2907b = i14;
                return i13;
            }
        }
        int i15 = inputStream.read(bArr);
        if (i15 > 0) {
            this.f2909d = -1;
            this.e = 0;
            this.f2907b = i15;
        }
        return i15;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f2906a != null) {
            this.f2910f.g(this.f2906a);
            this.f2906a = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    public final synchronized void d() {
        if (this.f2906a != null) {
            this.f2910f.g(this.f2906a);
            this.f2906a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.f2908c = Math.max(this.f2908c, i);
        this.f2909d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() {
        byte[] bArr = this.f2906a;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            g();
            throw null;
        }
        if (this.e >= this.f2907b && c(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f2906a && (bArr = this.f2906a) == null) {
            g();
            throw null;
        }
        int i = this.f2907b;
        int i10 = this.e;
        if (i - i10 <= 0) {
            return -1;
        }
        this.e = i10 + 1;
        return bArr[i10] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (this.f2906a == null) {
            throw new IOException("Stream is closed");
        }
        int i = this.f2909d;
        if (-1 == i) {
            throw new v("Mark has been invalidated, pos: " + this.e + " markLimit: " + this.f2908c);
        }
        this.e = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j4) {
        if (j4 < 1) {
            return 0L;
        }
        byte[] bArr = this.f2906a;
        if (bArr == null) {
            g();
            throw null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            g();
            throw null;
        }
        int i = this.f2907b;
        int i10 = this.e;
        if (i - i10 >= j4) {
            this.e = (int) (((long) i10) + j4);
            return j4;
        }
        long j10 = ((long) i) - ((long) i10);
        this.e = i;
        if (this.f2909d == -1 || j4 > this.f2908c) {
            long jSkip = inputStream.skip(j4 - j10);
            if (jSkip > 0) {
                this.f2909d = -1;
            }
            return j10 + jSkip;
        }
        if (c(inputStream, bArr) == -1) {
            return j10;
        }
        int i11 = this.f2907b;
        int i12 = this.e;
        if (i11 - i12 >= j4 - j10) {
            this.e = (int) ((((long) i12) + j4) - j10);
            return j4;
        }
        long j11 = (j10 + ((long) i11)) - ((long) i12);
        this.e = i11;
        return j11;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i10) {
        int i11;
        int i12;
        byte[] bArr2 = this.f2906a;
        if (bArr2 == null) {
            g();
            throw null;
        }
        if (i10 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i13 = this.e;
            int i14 = this.f2907b;
            if (i13 < i14) {
                int i15 = i14 - i13;
                if (i15 >= i10) {
                    i15 = i10;
                }
                System.arraycopy(bArr2, i13, bArr, i, i15);
                this.e += i15;
                if (i15 == i10 || inputStream.available() == 0) {
                    return i15;
                }
                i += i15;
                i11 = i10 - i15;
            } else {
                i11 = i10;
            }
            while (true) {
                if (this.f2909d == -1 && i11 >= bArr2.length) {
                    i12 = inputStream.read(bArr, i, i11);
                    if (i12 == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                } else {
                    if (c(inputStream, bArr2) == -1) {
                        return i11 != i10 ? i10 - i11 : -1;
                    }
                    if (bArr2 != this.f2906a && (bArr2 = this.f2906a) == null) {
                        g();
                        throw null;
                    }
                    int i16 = this.f2907b;
                    int i17 = this.e;
                    i12 = i16 - i17;
                    if (i12 >= i11) {
                        i12 = i11;
                    }
                    System.arraycopy(bArr2, i17, bArr, i, i12);
                    this.e += i12;
                }
                i11 -= i12;
                if (i11 == 0) {
                    return i10;
                }
                if (inputStream.available() == 0) {
                    return i10 - i11;
                }
                i += i12;
            }
        } else {
            g();
            throw null;
        }
    }
}

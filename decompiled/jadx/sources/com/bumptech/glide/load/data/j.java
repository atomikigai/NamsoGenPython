package com.bumptech.glide.load.data;

import da.v;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends FilterInputStream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f1901c = {-1, -31, 0, 28, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f1902d = 31;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f1903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f1904b;

    public j(InputStream inputStream, int i) {
        super(inputStream);
        if (i < -1 || i > 8) {
            throw new IllegalArgumentException(v.f(i, "Cannot add invalid orientation: "));
        }
        this.f1903a = (byte) i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        int i;
        int i10;
        int i11 = this.f1904b;
        if (i11 < 2 || i11 > (i10 = f1902d)) {
            i = super.read();
        } else {
            i = i11 == i10 ? this.f1903a : f1901c[i11 - 2] & 255;
        }
        if (i != -1) {
            this.f1904b++;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j4) throws IOException {
        long jSkip = super.skip(j4);
        if (jSkip > 0) {
            this.f1904b = (int) (((long) this.f1904b) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11;
        int i12 = this.f1904b;
        int i13 = f1902d;
        if (i12 > i13) {
            i11 = super.read(bArr, i, i10);
        } else if (i12 == i13) {
            bArr[i] = this.f1903a;
            i11 = 1;
        } else if (i12 < 2) {
            i11 = super.read(bArr, i, 2 - i12);
        } else {
            int iMin = Math.min(i13 - i12, i10);
            System.arraycopy(f1901c, this.f1904b - 2, bArr, i, iMin);
            i11 = iMin;
        }
        if (i11 > 0) {
            this.f1904b += i11;
        }
        return i11;
    }
}

package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f1893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte[] f1894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x3.f f1895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f1896d;

    public c(FileOutputStream fileOutputStream, x3.f fVar) {
        this.f1893a = fileOutputStream;
        this.f1895c = fVar;
        this.f1894b = (byte[]) fVar.c(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        FileOutputStream fileOutputStream = this.f1893a;
        try {
            flush();
            fileOutputStream.close();
            byte[] bArr = this.f1894b;
            if (bArr != null) {
                this.f1895c.g(bArr);
                this.f1894b = null;
            }
        } catch (Throwable th) {
            fileOutputStream.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i = this.f1896d;
        FileOutputStream fileOutputStream = this.f1893a;
        if (i > 0) {
            fileOutputStream.write(this.f1894b, 0, i);
            this.f1896d = 0;
        }
        fileOutputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.f1894b;
        int i10 = this.f1896d;
        int i11 = i10 + 1;
        this.f1896d = i11;
        bArr[i10] = (byte) i;
        if (i11 != bArr.length || i11 <= 0) {
            return;
        }
        this.f1893a.write(bArr, 0, i11);
        this.f1896d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i10) throws IOException {
        int i11 = 0;
        do {
            int i12 = i10 - i11;
            int i13 = i + i11;
            int i14 = this.f1896d;
            FileOutputStream fileOutputStream = this.f1893a;
            if (i14 == 0 && i12 >= this.f1894b.length) {
                fileOutputStream.write(bArr, i13, i12);
                return;
            }
            int iMin = Math.min(i12, this.f1894b.length - i14);
            System.arraycopy(bArr, i13, this.f1894b, this.f1896d, iMin);
            int i15 = this.f1896d + iMin;
            this.f1896d = i15;
            i11 += iMin;
            byte[] bArr2 = this.f1894b;
            if (i15 == bArr2.length && i15 > 0) {
                fileOutputStream.write(bArr2, 0, i15);
                this.f1896d = 0;
            }
        } while (i11 < i10);
    }
}

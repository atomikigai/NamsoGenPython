package s3;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import r3.f;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileInputStream f8384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Charset f8385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f8386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f8387d;
    public int e;

    public d(FileInputStream fileInputStream, Charset charset) {
        if (charset == null) {
            throw null;
        }
        if (!charset.equals(e.f8388a)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f8384a = fileInputStream;
        this.f8385b = charset;
        this.f8386c = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0040  */
    public final String c() {
        int i;
        synchronized (this.f8384a) {
            try {
                byte[] bArr = this.f8386c;
                if (bArr == null) {
                    throw new IOException("LineReader is closed");
                }
                if (this.f8387d >= this.e) {
                    int i10 = this.f8384a.read(bArr, 0, bArr.length);
                    if (i10 == -1) {
                        throw new EOFException();
                    }
                    this.f8387d = 0;
                    this.e = i10;
                }
                for (int i11 = this.f8387d; i11 != this.e; i11++) {
                    byte[] bArr2 = this.f8386c;
                    if (bArr2[i11] == 10) {
                        int i12 = this.f8387d;
                        if (i11 != i12) {
                            i = i11 - 1;
                            if (bArr2[i] != 13) {
                                i = i11;
                            }
                        } else {
                            i = i11;
                        }
                        String str = new String(bArr2, i12, i - i12, this.f8385b.name());
                        this.f8387d = i11 + 1;
                        return str;
                    }
                }
                f fVar = new f(this, (this.e - this.f8387d) + 80);
                while (true) {
                    byte[] bArr3 = this.f8386c;
                    int i13 = this.f8387d;
                    fVar.write(bArr3, i13, this.e - i13);
                    this.e = -1;
                    FileInputStream fileInputStream = this.f8384a;
                    byte[] bArr4 = this.f8386c;
                    int i14 = fileInputStream.read(bArr4, 0, bArr4.length);
                    if (i14 == -1) {
                        throw new EOFException();
                    }
                    this.f8387d = 0;
                    this.e = i14;
                    for (int i15 = 0; i15 != this.e; i15++) {
                        byte[] bArr5 = this.f8386c;
                        if (bArr5[i15] == 10) {
                            int i16 = this.f8387d;
                            if (i15 != i16) {
                                fVar.write(bArr5, i16, i15 - i16);
                            }
                            this.f8387d = i15 + 1;
                            return fVar.toString();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f8384a) {
            try {
                if (this.f8386c != null) {
                    this.f8386c = null;
                    this.f8384a.close();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

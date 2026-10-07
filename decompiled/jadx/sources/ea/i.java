package ea;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Closeable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Logger f3523r = Logger.getLogger(i.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RandomAccessFile f3524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f3525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f f3527d;
    public f e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f3528f;

    public i(File file) throws IOException {
        byte[] bArr = new byte[16];
        this.f3528f = bArr;
        if (!file.exists()) {
            File file2 = new File(file.getPath() + ".tmp");
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rwd");
            try {
                randomAccessFile.setLength(4096L);
                randomAccessFile.seek(0L);
                byte[] bArr2 = new byte[16];
                int[] iArr = {4096, 0, 0, 0};
                int i = 0;
                for (int i10 = 0; i10 < 4; i10++) {
                    W(i, bArr2, iArr[i10]);
                    i += 4;
                }
                randomAccessFile.write(bArr2);
                randomAccessFile.close();
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } catch (Throwable th) {
                randomAccessFile.close();
                throw th;
            }
        }
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rwd");
        this.f3524a = randomAccessFile2;
        randomAccessFile2.seek(0L);
        randomAccessFile2.readFully(bArr);
        int iE = E(0, bArr);
        this.f3525b = iE;
        if (iE > randomAccessFile2.length()) {
            throw new IOException("File is truncated. Expected length: " + this.f3525b + ", Actual length: " + randomAccessFile2.length());
        }
        this.f3526c = E(4, bArr);
        int iE2 = E(8, bArr);
        int iE3 = E(12, bArr);
        this.f3527d = B(iE2);
        this.e = B(iE3);
    }

    public static int E(int i, byte[] bArr) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    public static void W(int i, byte[] bArr, int i10) {
        bArr[i] = (byte) (i10 >> 24);
        bArr[i + 1] = (byte) (i10 >> 16);
        bArr[i + 2] = (byte) (i10 >> 8);
        bArr[i + 3] = (byte) i10;
    }

    public final f B(int i) throws IOException {
        if (i == 0) {
            return f.f3517c;
        }
        RandomAccessFile randomAccessFile = this.f3524a;
        randomAccessFile.seek(i);
        return new f(i, randomAccessFile.readInt());
    }

    public final synchronized void G() {
        if (o()) {
            throw new NoSuchElementException();
        }
        if (this.f3526c == 1) {
            synchronized (this) {
                V(4096, 0, 0, 0);
                this.f3526c = 0;
                f fVar = f.f3517c;
                this.f3527d = fVar;
                this.e = fVar;
                if (this.f3525b > 4096) {
                    RandomAccessFile randomAccessFile = this.f3524a;
                    randomAccessFile.setLength(4096);
                    randomAccessFile.getChannel().force(true);
                }
                this.f3525b = 4096;
            }
        } else {
            f fVar2 = this.f3527d;
            int iU = U(fVar2.f3518a + 4 + fVar2.f3519b);
            H(iU, this.f3528f, 0, 4);
            int iE = E(0, this.f3528f);
            V(this.f3525b, this.f3526c - 1, iU, this.e.f3518a);
            this.f3526c--;
            this.f3527d = new f(iU, iE);
        }
    }

    public final void H(int i, byte[] bArr, int i10, int i11) throws IOException {
        int iU = U(i);
        int i12 = iU + i11;
        int i13 = this.f3525b;
        RandomAccessFile randomAccessFile = this.f3524a;
        if (i12 <= i13) {
            randomAccessFile.seek(iU);
            randomAccessFile.readFully(bArr, i10, i11);
            return;
        }
        int i14 = i13 - iU;
        randomAccessFile.seek(iU);
        randomAccessFile.readFully(bArr, i10, i14);
        randomAccessFile.seek(16L);
        randomAccessFile.readFully(bArr, i10 + i14, i11 - i14);
    }

    public final void S(int i, byte[] bArr, int i10) throws IOException {
        int iU = U(i);
        int i11 = iU + i10;
        int i12 = this.f3525b;
        RandomAccessFile randomAccessFile = this.f3524a;
        if (i11 <= i12) {
            randomAccessFile.seek(iU);
            randomAccessFile.write(bArr, 0, i10);
            return;
        }
        int i13 = i12 - iU;
        randomAccessFile.seek(iU);
        randomAccessFile.write(bArr, 0, i13);
        randomAccessFile.seek(16L);
        randomAccessFile.write(bArr, i13, i10 - i13);
    }

    public final int T() {
        if (this.f3526c == 0) {
            return 16;
        }
        f fVar = this.e;
        int i = fVar.f3518a;
        int i10 = this.f3527d.f3518a;
        return i >= i10 ? (i - i10) + 4 + fVar.f3519b + 16 : (((i + 4) + fVar.f3519b) + this.f3525b) - i10;
    }

    public final int U(int i) {
        int i10 = this.f3525b;
        return i < i10 ? i : (i + 16) - i10;
    }

    public final void V(int i, int i10, int i11, int i12) throws IOException {
        int[] iArr = {i, i10, i11, i12};
        int i13 = 0;
        int i14 = 0;
        while (true) {
            byte[] bArr = this.f3528f;
            if (i13 >= 4) {
                RandomAccessFile randomAccessFile = this.f3524a;
                randomAccessFile.seek(0L);
                randomAccessFile.write(bArr);
                return;
            } else {
                W(i14, bArr, iArr[i13]);
                i14 += 4;
                i13++;
            }
        }
    }

    public final void c(byte[] bArr) {
        int iU;
        int length = bArr.length;
        synchronized (this) {
            if (length >= 0) {
                if (length <= bArr.length) {
                    d(length);
                    boolean zO = o();
                    if (zO) {
                        iU = 16;
                    } else {
                        f fVar = this.e;
                        iU = U(fVar.f3518a + 4 + fVar.f3519b);
                    }
                    f fVar2 = new f(iU, length);
                    W(0, this.f3528f, length);
                    S(iU, this.f3528f, 4);
                    S(iU + 4, bArr, length);
                    V(this.f3525b, this.f3526c + 1, zO ? iU : this.f3527d.f3518a, iU);
                    this.e = fVar2;
                    this.f3526c++;
                    if (zO) {
                        this.f3527d = fVar2;
                    }
                }
            }
            throw new IndexOutOfBoundsException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f3524a.close();
    }

    public final void d(int i) throws IOException {
        int i10 = i + 4;
        int iT = this.f3525b - T();
        if (iT >= i10) {
            return;
        }
        int i11 = this.f3525b;
        do {
            iT += i11;
            i11 <<= 1;
        } while (iT < i10);
        RandomAccessFile randomAccessFile = this.f3524a;
        randomAccessFile.setLength(i11);
        randomAccessFile.getChannel().force(true);
        f fVar = this.e;
        int iU = U(fVar.f3518a + 4 + fVar.f3519b);
        if (iU < this.f3527d.f3518a) {
            FileChannel channel = randomAccessFile.getChannel();
            channel.position(this.f3525b);
            long j4 = iU - 4;
            if (channel.transferTo(16L, j4, channel) != j4) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i12 = this.e.f3518a;
        int i13 = this.f3527d.f3518a;
        if (i12 < i13) {
            int i14 = (this.f3525b + i12) - 16;
            V(i11, this.f3526c, i13, i14);
            this.e = new f(i14, this.e.f3519b);
        } else {
            V(i11, this.f3526c, i13, i12);
        }
        this.f3525b = i11;
    }

    public final synchronized void g(h hVar) {
        int iU = this.f3527d.f3518a;
        for (int i = 0; i < this.f3526c; i++) {
            f fVarB = B(iU);
            hVar.a(new g(this, fVarB), fVarB.f3519b);
            iU = U(fVarB.f3518a + 4 + fVarB.f3519b);
        }
    }

    public final synchronized boolean o() {
        return this.f3526c == 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.class.getSimpleName());
        sb2.append("[fileLength=");
        sb2.append(this.f3525b);
        sb2.append(", size=");
        sb2.append(this.f3526c);
        sb2.append(", first=");
        sb2.append(this.f3527d);
        sb2.append(", last=");
        sb2.append(this.e);
        sb2.append(", element lengths=[");
        try {
            g(new e(sb2));
        } catch (IOException e) {
            f3523r.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb2.append("]]");
        return sb2.toString();
    }
}

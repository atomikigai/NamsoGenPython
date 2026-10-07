package h1;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class b extends InputStream implements DataInput {
    public static final ByteOrder e = ByteOrder.LITTLE_ENDIAN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ByteOrder f4569f = ByteOrder.BIG_ENDIAN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataInputStream f4570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteOrder f4571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f4572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public byte[] f4573d;

    public b(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this(byteArrayInputStream, 0);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f4570a.available();
    }

    public final void c(int i) throws IOException {
        int i10 = 0;
        while (i10 < i) {
            int i11 = i - i10;
            DataInputStream dataInputStream = this.f4570a;
            int iSkip = (int) dataInputStream.skip(i11);
            if (iSkip <= 0) {
                if (this.f4573d == null) {
                    this.f4573d = new byte[8192];
                }
                iSkip = dataInputStream.read(this.f4573d, 0, Math.min(8192, i11));
                if (iSkip == -1) {
                    throw new EOFException(q1.a.j(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i10 += iSkip;
        }
        this.f4572c += i10;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f4572c++;
        return this.f4570a.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f4572c++;
        return this.f4570a.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() throws IOException {
        this.f4572c++;
        int i = this.f4570a.read();
        if (i >= 0) {
            return (byte) i;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f4572c += 2;
        return this.f4570a.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i10) throws IOException {
        this.f4572c += i10;
        this.f4570a.readFully(bArr, i, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() throws IOException {
        this.f4572c += 4;
        DataInputStream dataInputStream = this.f4570a;
        int i = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        if ((i | i10 | i11 | i12) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f4571b;
        if (byteOrder == e) {
            return (i12 << 24) + (i11 << 16) + (i10 << 8) + i;
        }
        if (byteOrder == f4569f) {
            return (i << 24) + (i10 << 16) + (i11 << 8) + i12;
        }
        throw new IOException("Invalid byte order: " + this.f4571b);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() throws IOException {
        long j4;
        long j10;
        this.f4572c += 8;
        DataInputStream dataInputStream = this.f4570a;
        int i = dataInputStream.read();
        int i10 = dataInputStream.read();
        int i11 = dataInputStream.read();
        int i12 = dataInputStream.read();
        int i13 = dataInputStream.read();
        int i14 = dataInputStream.read();
        int i15 = dataInputStream.read();
        int i16 = dataInputStream.read();
        if ((i | i10 | i11 | i12 | i13 | i14 | i15 | i16) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f4571b;
        if (byteOrder == e) {
            j4 = (((long) i16) << 56) + (((long) i15) << 48) + (((long) i14) << 40) + (((long) i13) << 32) + (((long) i12) << 24) + (((long) i11) << 16) + (((long) i10) << 8);
            j10 = i;
        } else {
            if (byteOrder != f4569f) {
                throw new IOException("Invalid byte order: " + this.f4571b);
            }
            j4 = (((long) i) << 56) + (((long) i10) << 48) + (((long) i11) << 40) + (((long) i12) << 32) + (((long) i13) << 24) + (((long) i14) << 16) + (((long) i15) << 8);
            j10 = i16;
        }
        return j4 + j10;
    }

    @Override // java.io.DataInput
    public final short readShort() throws IOException {
        this.f4572c += 2;
        DataInputStream dataInputStream = this.f4570a;
        int i = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f4571b;
        if (byteOrder == e) {
            return (short) ((i10 << 8) + i);
        }
        if (byteOrder == f4569f) {
            return (short) ((i << 8) + i10);
        }
        throw new IOException("Invalid byte order: " + this.f4571b);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f4572c += 2;
        return this.f4570a.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f4572c++;
        return this.f4570a.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() throws IOException {
        this.f4572c += 2;
        DataInputStream dataInputStream = this.f4570a;
        int i = dataInputStream.read();
        int i10 = dataInputStream.read();
        if ((i | i10) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f4571b;
        if (byteOrder == e) {
            return (i10 << 8) + i;
        }
        if (byteOrder == f4569f) {
            return (i << 8) + i10;
        }
        throw new IOException("Invalid byte order: " + this.f4571b);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    public b(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f4571b = byteOrder;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f4570a = dataInputStream;
        dataInputStream.mark(0);
        this.f4572c = 0;
        this.f4571b = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) throws IOException {
        int i11 = this.f4570a.read(bArr, i, i10);
        this.f4572c += i11;
        return i11;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) throws IOException {
        this.f4572c += bArr.length;
        this.f4570a.readFully(bArr);
    }
}

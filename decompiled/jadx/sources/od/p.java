package od;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f7753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f7754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7755c;

    public p(v vVar) {
        jc.i.e(vVar, "source");
        this.f7753a = vVar;
        this.f7754b = new f();
    }

    @Override // od.h
    public final String A(Charset charset) {
        v vVar = this.f7753a;
        f fVar = this.f7754b;
        fVar.U(vVar);
        return fVar.E(fVar.f7734b, charset);
    }

    @Override // od.h
    public final String K() {
        return r(Long.MAX_VALUE);
    }

    @Override // od.h
    public final int L(n nVar) throws EOFException {
        f fVar;
        jc.i.e(nVar, "options");
        if (this.f7755c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f7754b;
            int iB = pd.a.b(fVar, nVar, true);
            if (iB != -2) {
                if (iB == -1) {
                    break;
                }
                fVar.skip(nVar.f7748a[iB].a());
                return iB;
            }
        } while (this.f7753a.t(8192L, fVar) != -1);
        return -1;
    }

    @Override // od.h
    public final void P(long j4) throws EOFException {
        if (!o(j4)) {
            throw new EOFException();
        }
    }

    @Override // od.h
    public final long Q() throws EOFException {
        f fVar;
        P(1L);
        int i = 0;
        while (true) {
            int i10 = i + 1;
            boolean zO = o(i10);
            fVar = this.f7754b;
            if (!zO) {
                break;
            }
            byte bG = fVar.g(i);
            if ((bG < 48 || bG > 57) && ((bG < 97 || bG > 102) && (bG < 65 || bG > 70))) {
                if (i != 0) {
                    break;
                }
                android.support.v4.media.session.a.c(16);
                android.support.v4.media.session.a.c(16);
                String string = Integer.toString(bG, 16);
                jc.i.d(string, "toString(this, checkRadix(radix))");
                throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(string));
            }
            i = i10;
        }
        return fVar.Q();
    }

    @Override // od.v
    public final x a() {
        return this.f7753a.a();
    }

    public final boolean c() {
        if (this.f7755c) {
            throw new IllegalStateException("closed");
        }
        f fVar = this.f7754b;
        return fVar.d() && this.f7753a.t(8192L, fVar) == -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() throws IOException {
        if (this.f7755c) {
            return;
        }
        this.f7755c = true;
        this.f7753a.close();
        f fVar = this.f7754b;
        fVar.skip(fVar.f7734b);
    }

    public final long d(byte b10, long j4, long j10) {
        if (this.f7755c) {
            throw new IllegalStateException("closed");
        }
        if (0 > j10) {
            throw new IllegalArgumentException(da.v.g("fromIndex=0 toIndex=", j10).toString());
        }
        long jMax = 0;
        while (jMax < j10) {
            f fVar = this.f7754b;
            byte b11 = b10;
            long j11 = j10;
            long jO = fVar.o(b11, jMax, j11);
            if (jO != -1) {
                return jO;
            }
            long j12 = fVar.f7734b;
            if (j12 >= j11 || this.f7753a.t(8192L, fVar) == -1) {
                break;
            }
            jMax = Math.max(jMax, j12);
            b10 = b11;
            j10 = j11;
        }
        return -1L;
    }

    public final int g() throws EOFException {
        P(4L);
        int i = this.f7754b.readInt();
        return ((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8);
    }

    @Override // od.h
    public final i h(long j4) throws EOFException {
        P(j4);
        return this.f7754b.h(j4);
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f7755c;
    }

    public final boolean o(long j4) {
        f fVar;
        if (j4 < 0) {
            throw new IllegalArgumentException(da.v.g("byteCount < 0: ", j4).toString());
        }
        if (this.f7755c) {
            throw new IllegalStateException("closed");
        }
        do {
            fVar = this.f7754b;
            if (fVar.f7734b >= j4) {
                return true;
            }
        } while (this.f7753a.t(8192L, fVar) != -1);
        return false;
    }

    @Override // od.h
    public final String r(long j4) throws EOFException {
        if (j4 < 0) {
            throw new IllegalArgumentException(da.v.g("limit < 0: ", j4).toString());
        }
        long j10 = j4 == Long.MAX_VALUE ? Long.MAX_VALUE : j4 + 1;
        long jD = d((byte) 10, 0L, j10);
        f fVar = this.f7754b;
        if (jD != -1) {
            return pd.a.a(jD, fVar);
        }
        if (j10 < Long.MAX_VALUE && o(j10) && fVar.g(j10 - 1) == 13 && o(j10 + 1) && fVar.g(j10) == 10) {
            return pd.a.a(j10, fVar);
        }
        f fVar2 = new f();
        fVar.c(fVar2, 0L, Math.min(32, fVar.f7734b));
        throw new EOFException("\\n not found: limit=" + Math.min(fVar.f7734b, j4) + " content=" + fVar2.h(fVar2.f7734b).b() + (char) 8230);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        jc.i.e(byteBuffer, "sink");
        f fVar = this.f7754b;
        if (fVar.f7734b == 0 && this.f7753a.t(8192L, fVar) == -1) {
            return -1;
        }
        return fVar.read(byteBuffer);
    }

    @Override // od.h
    public final byte readByte() {
        P(1L);
        return this.f7754b.readByte();
    }

    @Override // od.h
    public final int readInt() throws EOFException {
        P(4L);
        return this.f7754b.readInt();
    }

    @Override // od.h
    public final short readShort() throws EOFException {
        P(2L);
        return this.f7754b.readShort();
    }

    @Override // od.h
    public final void skip(long j4) throws EOFException {
        if (this.f7755c) {
            throw new IllegalStateException("closed");
        }
        while (j4 > 0) {
            f fVar = this.f7754b;
            if (fVar.f7734b == 0 && this.f7753a.t(8192L, fVar) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j4, fVar.f7734b);
            fVar.skip(jMin);
            j4 -= jMin;
        }
    }

    @Override // od.v
    public final long t(long j4, f fVar) {
        jc.i.e(fVar, "sink");
        if (j4 < 0) {
            throw new IllegalArgumentException(da.v.g("byteCount < 0: ", j4).toString());
        }
        if (this.f7755c) {
            throw new IllegalStateException("closed");
        }
        f fVar2 = this.f7754b;
        if (fVar2.f7734b == 0 && this.f7753a.t(8192L, fVar2) == -1) {
            return -1L;
        }
        return fVar2.t(Math.min(j4, fVar2.f7734b), fVar);
    }

    public final String toString() {
        return "buffer(" + this.f7753a + ')';
    }
}

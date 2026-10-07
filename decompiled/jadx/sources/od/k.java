package od;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte f7739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f7740b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f7741c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f7742d;
    public final CRC32 e;

    public k(v vVar) {
        jc.i.e(vVar, "source");
        p pVar = new p(vVar);
        this.f7740b = pVar;
        Inflater inflater = new Inflater(true);
        this.f7741c = inflater;
        this.f7742d = new l(pVar, inflater);
        this.e = new CRC32();
    }

    public static void c(int i, int i10, String str) throws IOException {
        if (i10 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i10), Integer.valueOf(i)}, 3)));
        }
    }

    @Override // od.v
    public final x a() {
        return this.f7740b.f7753a.a();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f7742d.close();
    }

    public final void d(f fVar, long j4, long j10) {
        q qVar = fVar.f7733a;
        jc.i.b(qVar);
        while (true) {
            int i = qVar.f7758c;
            int i10 = qVar.f7757b;
            if (j4 < i - i10) {
                break;
            }
            j4 -= (long) (i - i10);
            qVar = qVar.f7760f;
            jc.i.b(qVar);
        }
        while (j10 > 0) {
            int i11 = (int) (((long) qVar.f7757b) + j4);
            int iMin = (int) Math.min(qVar.f7758c - i11, j10);
            this.e.update(qVar.f7756a, i11, iMin);
            j10 -= (long) iMin;
            qVar = qVar.f7760f;
            jc.i.b(qVar);
            j4 = 0;
        }
    }

    @Override // od.v
    public final long t(long j4, f fVar) throws IOException {
        long j10;
        k kVar = this;
        byte b10 = kVar.f7739a;
        CRC32 crc32 = kVar.e;
        p pVar = kVar.f7740b;
        if (b10 == 0) {
            pVar.P(10L);
            f fVar2 = pVar.f7754b;
            byte bG = fVar2.g(3L);
            boolean z4 = ((bG >> 1) & 1) == 1;
            if (z4) {
                kVar.d(fVar2, 0L, 10L);
            }
            c(8075, pVar.readShort(), "ID1ID2");
            pVar.skip(8L);
            if (((bG >> 2) & 1) == 1) {
                pVar.P(2L);
                if (z4) {
                    d(fVar2, 0L, 2L);
                }
                short s10 = fVar2.readShort();
                long j11 = ((short) (((s10 & 255) << 8) | ((s10 & 65280) >>> 8))) & 65535;
                pVar.P(j11);
                if (z4) {
                    d(fVar2, 0L, j11);
                }
                pVar.skip(j11);
            }
            if (((bG >> 3) & 1) == 1) {
                long jD = pVar.d((byte) 0, 0L, Long.MAX_VALUE);
                if (jD == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    j10 = 2;
                    d(fVar2, 0L, jD + 1);
                } else {
                    j10 = 2;
                }
                pVar.skip(jD + 1);
            } else {
                j10 = 2;
            }
            if (((bG >> 4) & 1) == 1) {
                j10 = j10;
                long jD2 = pVar.d((byte) 0, 0L, Long.MAX_VALUE);
                if (jD2 == -1) {
                    throw new EOFException();
                }
                if (z4) {
                    kVar = this;
                    kVar.d(fVar2, 0L, jD2 + 1);
                } else {
                    kVar = this;
                }
                pVar.skip(jD2 + 1);
            } else {
                kVar = this;
            }
            if (z4) {
                pVar.P(j10);
                short s11 = fVar2.readShort();
                c((short) (((s11 & 255) << 8) | ((s11 & 65280) >>> 8)), (short) crc32.getValue(), "FHCRC");
                crc32.reset();
            }
            kVar.f7739a = (byte) 1;
        }
        if (kVar.f7739a == 1) {
            long j12 = fVar.f7734b;
            long jT = kVar.f7742d.t(8192L, fVar);
            if (jT != -1) {
                kVar.d(fVar, j12, jT);
                return jT;
            }
            kVar.f7739a = (byte) 2;
        }
        if (kVar.f7739a == 2) {
            c(pVar.g(), (int) crc32.getValue(), "CRC");
            c(pVar.g(), (int) kVar.f7741c.getBytesWritten(), "ISIZE");
            kVar.f7739a = (byte) 3;
            if (!pVar.c()) {
                throw new IOException("gzip finished without exhausting source");
            }
        }
        return -1L;
    }
}

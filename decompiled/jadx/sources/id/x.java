package id;

import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements Closeable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Logger f5347f = Logger.getLogger(f.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final od.g f5348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final od.f f5349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f5350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5351d;
    public final d e;

    public x(od.o oVar) {
        jc.i.e(oVar, "sink");
        this.f5348a = oVar;
        od.f fVar = new od.f();
        this.f5349b = fVar;
        this.f5350c = 16384;
        this.e = new d(fVar);
    }

    public final synchronized void B(boolean z4, int i, ArrayList arrayList) {
        if (this.f5351d) {
            throw new IOException("closed");
        }
        this.e.d(arrayList);
        long j4 = this.f5349b.f7734b;
        long jMin = Math.min(this.f5350c, j4);
        int i10 = j4 == jMin ? 4 : 0;
        if (z4) {
            i10 |= 1;
        }
        g(i, (int) jMin, 1, i10);
        this.f5348a.f(jMin, this.f5349b);
        if (j4 > jMin) {
            long j10 = j4 - jMin;
            while (j10 > 0) {
                long jMin2 = Math.min(this.f5350c, j10);
                j10 -= jMin2;
                g(i, (int) jMin2, 9, j10 == 0 ? 4 : 0);
                this.f5348a.f(jMin2, this.f5349b);
            }
        }
    }

    public final synchronized void E(int i, int i10, boolean z4) {
        if (this.f5351d) {
            throw new IOException("closed");
        }
        g(0, 8, 6, z4 ? 1 : 0);
        this.f5348a.writeInt(i);
        this.f5348a.writeInt(i10);
        this.f5348a.flush();
    }

    public final synchronized void G(int i, int i10) {
        da.v.q(i10, "errorCode");
        if (this.f5351d) {
            throw new IOException("closed");
        }
        if (u.e.d(i10) == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        g(i, 4, 3, 0);
        this.f5348a.writeInt(u.e.d(i10));
        this.f5348a.flush();
    }

    public final synchronized void H(int i, long j4) {
        if (this.f5351d) {
            throw new IOException("closed");
        }
        if (j4 == 0 || j4 > 2147483647L) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j4).toString());
        }
        g(i, 4, 8, 0);
        this.f5348a.writeInt((int) j4);
        this.f5348a.flush();
    }

    public final synchronized void c(a0 a0Var) {
        try {
            jc.i.e(a0Var, "peerSettings");
            if (this.f5351d) {
                throw new IOException("closed");
            }
            int i = this.f5350c;
            int i10 = a0Var.f5257a;
            if ((i10 & 32) != 0) {
                i = a0Var.f5258b[5];
            }
            this.f5350c = i;
            if (((i10 & 2) != 0 ? a0Var.f5258b[1] : -1) != -1) {
                d dVar = this.e;
                int i11 = (i10 & 2) != 0 ? a0Var.f5258b[1] : -1;
                dVar.getClass();
                int iMin = Math.min(i11, 16384);
                int i12 = dVar.f5275d;
                if (i12 != iMin) {
                    if (iMin < i12) {
                        dVar.f5273b = Math.min(dVar.f5273b, iMin);
                    }
                    dVar.f5274c = true;
                    dVar.f5275d = iMin;
                    int i13 = dVar.h;
                    if (iMin < i13) {
                        if (iMin == 0) {
                            b[] bVarArr = dVar.e;
                            vb.h.N(bVarArr, 0, bVarArr.length);
                            dVar.f5276f = dVar.e.length - 1;
                            dVar.f5277g = 0;
                            dVar.h = 0;
                        } else {
                            dVar.a(i13 - iMin);
                        }
                    }
                }
            }
            g(0, 0, 4, 1);
            this.f5348a.flush();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.f5351d = true;
        this.f5348a.close();
    }

    public final synchronized void d(boolean z4, int i, od.f fVar, int i10) {
        if (this.f5351d) {
            throw new IOException("closed");
        }
        g(i, i10, 0, z4 ? 1 : 0);
        if (i10 > 0) {
            od.g gVar = this.f5348a;
            jc.i.b(fVar);
            gVar.f(i10, fVar);
        }
    }

    public final synchronized void flush() {
        if (this.f5351d) {
            throw new IOException("closed");
        }
        this.f5348a.flush();
    }

    public final void g(int i, int i10, int i11, int i12) {
        Level level = Level.FINE;
        Logger logger = f5347f;
        if (logger.isLoggable(level)) {
            logger.fine(f.a(i, i10, i11, i12, false));
        }
        if (i10 > this.f5350c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f5350c + ": " + i10).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(da.v.f(i, "reserved bit set: ").toString());
        }
        byte[] bArr = cd.b.f1822a;
        od.g gVar = this.f5348a;
        jc.i.e(gVar, "<this>");
        gVar.writeByte((i10 >>> 16) & 255);
        gVar.writeByte((i10 >>> 8) & 255);
        gVar.writeByte(i10 & 255);
        gVar.writeByte(i11 & 255);
        gVar.writeByte(i12 & 255);
        gVar.writeInt(i & com.google.android.gms.common.api.f.API_PRIORITY_OTHER);
    }

    public final synchronized void o(int i, byte[] bArr, int i10) {
        da.v.q(i10, "errorCode");
        if (this.f5351d) {
            throw new IOException("closed");
        }
        if (u.e.d(i10) == -1) {
            throw new IllegalArgumentException("errorCode.httpCode == -1");
        }
        g(0, bArr.length + 8, 7, 0);
        this.f5348a.writeInt(i);
        this.f5348a.writeInt(u.e.d(i10));
        if (bArr.length != 0) {
            this.f5348a.write(bArr);
        }
        this.f5348a.flush();
    }
}

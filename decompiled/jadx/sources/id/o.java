package id;

import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class o implements Closeable {
    public static final a0 K;
    public final a0 A;
    public a0 B;
    public long C;
    public long D;
    public long E;
    public long F;
    public final Socket G;
    public final x H;
    public final k I;
    public final LinkedHashSet J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f5297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f5298b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f5299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f5300d;
    public int e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f5301f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ed.d f5302r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ed.c f5303s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ed.c f5304t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ed.c f5305u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final z f5306v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f5307w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f5308x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public long f5309y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f5310z;

    static {
        a0 a0Var = new a0();
        a0Var.c(7, 65535);
        a0Var.c(5, 16384);
        K = a0Var;
    }

    public o(bd.v vVar) {
        this.f5297a = (h) vVar.f1685g;
        String str = (String) vVar.f1681b;
        if (str == null) {
            jc.i.i("connectionName");
            throw null;
        }
        this.f5299c = str;
        this.e = 3;
        ed.d dVar = (ed.d) vVar.f1682c;
        this.f5302r = dVar;
        this.f5303s = dVar.e();
        this.f5304t = dVar.e();
        this.f5305u = dVar.e();
        this.f5306v = z.f5355a;
        a0 a0Var = new a0();
        a0Var.c(7, 16777216);
        this.A = a0Var;
        a0 a0Var2 = K;
        this.B = a0Var2;
        this.F = a0Var2.a();
        Socket socket = (Socket) vVar.f1683d;
        if (socket == null) {
            jc.i.i("socket");
            throw null;
        }
        this.G = socket;
        od.o oVar = (od.o) vVar.f1684f;
        if (oVar == null) {
            jc.i.i("sink");
            throw null;
        }
        this.H = new x(oVar);
        od.p pVar = (od.p) vVar.e;
        if (pVar == null) {
            jc.i.i("source");
            throw null;
        }
        this.I = new k(this, new s(pVar));
        this.J = new LinkedHashSet();
    }

    public final synchronized void B(long j4) {
        long j10 = this.C + j4;
        this.C = j10;
        long j11 = j10 - this.D;
        if (j11 >= this.A.a() / 2) {
            H(0, j11);
            this.D += j11;
        }
    }

    public final void E(int i, boolean z4, od.f fVar, long j4) {
        long j10;
        long j11;
        int iMin;
        long j12;
        if (j4 == 0) {
            this.H.d(z4, i, fVar, 0);
            return;
        }
        while (j4 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            j10 = this.E;
                            j11 = this.F;
                            if (j10 >= j11) {
                                if (!this.f5298b.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                iMin = Math.min((int) Math.min(j4, j11 - j10), this.H.f5350c);
                j12 = iMin;
                this.E += j12;
            }
            j4 -= j12;
            this.H.d(z4 && j4 == 0, i, fVar, iMin);
        }
    }

    public final void G(int i, int i10) {
        da.v.q(i10, "errorCode");
        this.f5303s.c(new j(this.f5299c + '[' + i + "] writeSynReset", this, i, i10, 2), 0L);
    }

    public final void H(int i, long j4) {
        this.f5303s.c(new n(this.f5299c + '[' + i + "] windowUpdate", this, i, j4), 0L);
    }

    public final void c(int i, int i10, IOException iOException) {
        int i11;
        Object[] array;
        da.v.q(i, "connectionCode");
        da.v.q(i10, "streamCode");
        byte[] bArr = cd.b.f1822a;
        try {
            o(i);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.f5298b.isEmpty()) {
                array = null;
            } else {
                array = this.f5298b.values().toArray(new w[0]);
                this.f5298b.clear();
            }
        }
        w[] wVarArr = (w[]) array;
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.c(iOException, i10);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.H.close();
        } catch (IOException unused3) {
        }
        try {
            this.G.close();
        } catch (IOException unused4) {
        }
        this.f5303s.e();
        this.f5304t.e();
        this.f5305u.e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c(1, 9, null);
    }

    public final synchronized w d(int i) {
        return (w) this.f5298b.get(Integer.valueOf(i));
    }

    public final void flush() {
        this.H.flush();
    }

    public final synchronized w g(int i) {
        w wVar;
        wVar = (w) this.f5298b.remove(Integer.valueOf(i));
        notifyAll();
        return wVar;
    }

    public final void o(int i) {
        da.v.q(i, "statusCode");
        synchronized (this.H) {
            synchronized (this) {
                if (this.f5301f) {
                    return;
                }
                this.f5301f = true;
                this.H.o(this.f5300d, cd.b.f1822a, i);
            }
        }
    }
}

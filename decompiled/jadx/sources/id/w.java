package id;

import java.io.IOException;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f5337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f5339d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f5340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f5341g;
    public boolean h;
    public final u i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f5342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final v f5343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final v f5344l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5345m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f5346n;

    public w(int i, o oVar, boolean z4, boolean z10, bd.m mVar) {
        jc.i.e(oVar, "connection");
        this.f5336a = i;
        this.f5337b = oVar;
        this.f5340f = oVar.B.a();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f5341g = arrayDeque;
        this.i = new u(this, oVar.A.a(), z10);
        this.f5342j = new t(this, z4);
        this.f5343k = new v(this);
        this.f5344l = new v(this);
        if (mVar == null) {
            if (!g()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (g()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(mVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001c  */
    public final void a() {
        boolean z4;
        boolean zH;
        byte[] bArr = cd.b.f1822a;
        synchronized (this) {
            try {
                u uVar = this.i;
                if (uVar.f5331b || !uVar.e) {
                    z4 = false;
                } else {
                    t tVar = this.f5342j;
                    if (tVar.f5326a || tVar.f5328c) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                }
                zH = h();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z4) {
            c(null, 9);
        } else {
            if (zH) {
                return;
            }
            this.f5337b.g(this.f5336a);
        }
    }

    public final void b() throws IOException {
        t tVar = this.f5342j;
        if (tVar.f5328c) {
            throw new IOException("stream closed");
        }
        if (tVar.f5326a) {
            throw new IOException("stream finished");
        }
        if (this.f5345m != 0) {
            IOException iOException = this.f5346n;
            if (iOException != null) {
                throw iOException;
            }
            int i = this.f5345m;
            da.v.p(i);
            throw new b0(i);
        }
    }

    public final void c(IOException iOException, int i) {
        da.v.q(i, "rstStatusCode");
        if (d(iOException, i)) {
            o oVar = this.f5337b;
            oVar.getClass();
            da.v.q(i, "statusCode");
            oVar.H.G(this.f5336a, i);
        }
    }

    public final boolean d(IOException iOException, int i) {
        byte[] bArr = cd.b.f1822a;
        synchronized (this) {
            if (this.f5345m != 0) {
                return false;
            }
            this.f5345m = i;
            this.f5346n = iOException;
            notifyAll();
            if (this.i.f5331b && this.f5342j.f5326a) {
                return false;
            }
            this.f5337b.g(this.f5336a);
            return true;
        }
    }

    public final void e(int i) {
        da.v.q(i, "errorCode");
        if (d(null, i)) {
            this.f5337b.G(this.f5336a, i);
        }
    }

    public final t f() {
        synchronized (this) {
            if (!this.h && !g()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f5342j;
    }

    public final boolean g() {
        boolean z4 = (this.f5336a & 1) == 1;
        this.f5337b.getClass();
        return true == z4;
    }

    public final synchronized boolean h() {
        try {
            if (this.f5345m != 0) {
                return false;
            }
            u uVar = this.i;
            if (uVar.f5331b || uVar.e) {
                t tVar = this.f5342j;
                if ((tVar.f5326a || tVar.f5328c) && this.h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void i(bd.m mVar, boolean z4) {
        boolean zH;
        jc.i.e(mVar, "headers");
        byte[] bArr = cd.b.f1822a;
        synchronized (this) {
            try {
                if (this.h && z4) {
                    this.i.getClass();
                } else {
                    this.h = true;
                    this.f5341g.add(mVar);
                }
                if (z4) {
                    this.i.f5331b = true;
                }
                zH = h();
                notifyAll();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zH) {
            return;
        }
        this.f5337b.g(this.f5336a);
    }

    public final synchronized void j(int i) {
        da.v.q(i, "errorCode");
        if (this.f5345m == 0) {
            this.f5345m = i;
            notifyAll();
        }
    }
}

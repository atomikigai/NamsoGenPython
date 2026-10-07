package fd;

import bd.s;
import bd.v;
import bd.x;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import vb.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f3923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f3924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f3925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f3926d;
    public final AtomicBoolean e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f3927f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public f f3928r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f3929s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public e f3930t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f3931u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f3932v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f3933w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public volatile boolean f3934x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile e f3935y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile k f3936z;

    public i(s sVar, v vVar) {
        this.f3923a = sVar;
        this.f3924b = vVar;
        this.f3925c = (l) sVar.f1655b.f113b;
        sVar.e.getClass();
        h hVar = new h(this);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        hVar.g(0);
        this.f3926d = hVar;
        this.e = new AtomicBoolean();
        this.f3933w = true;
    }

    public final void a(k kVar) {
        byte[] bArr = cd.b.f1822a;
        if (this.f3929s != null) {
            throw new IllegalStateException("Check failed.");
        }
        this.f3929s = kVar;
        kVar.f3949p.add(new g(this, this.f3927f));
    }

    public final IOException b(IOException iOException) {
        IOException interruptedIOException;
        Socket socketH;
        byte[] bArr = cd.b.f1822a;
        k kVar = this.f3929s;
        if (kVar != null) {
            synchronized (kVar) {
                socketH = h();
            }
            if (this.f3929s == null) {
                if (socketH != null) {
                    cd.b.e(socketH);
                }
            } else if (socketH != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        if (this.f3926d.i()) {
            interruptedIOException = new InterruptedIOException("timeout");
            if (iOException != null) {
                interruptedIOException.initCause(iOException);
            }
        } else {
            interruptedIOException = iOException;
        }
        if (iOException != null) {
            jc.i.b(interruptedIOException);
        }
        return interruptedIOException;
    }

    public final x c() {
        if (!this.e.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        this.f3926d.h();
        jd.n nVar = jd.n.f5799a;
        this.f3927f = jd.n.f5799a.g();
        try {
            a3.j jVar = this.f3923a.f1654a;
            synchronized (jVar) {
                ((ArrayDeque) jVar.f110d).add(this);
            }
            x xVarE = e();
            this.f3923a.f1654a.a(this);
            return xVarE;
        } catch (Throwable th) {
            this.f3923a.f1654a.a(this);
            throw th;
        }
    }

    public final Object clone() {
        return new i(this.f3923a, this.f3924b);
    }

    public final void d(boolean z4) {
        e eVar;
        synchronized (this) {
            if (!this.f3933w) {
                throw new IllegalStateException("released");
            }
        }
        if (z4 && (eVar = this.f3935y) != null) {
            ((gd.d) eVar.f3914d).cancel();
            ((i) eVar.f3912b).f(eVar, true, true, null);
        }
        this.f3930t = null;
    }

    public final x e() {
        ArrayList arrayList = new ArrayList();
        o.W(this.f3923a.f1656c, arrayList);
        arrayList.add(new gd.a(this.f3923a));
        arrayList.add(new gd.a(this.f3923a.f1662u));
        arrayList.add(new dd.b());
        arrayList.add(a.f3895a);
        o.W(this.f3923a.f1657d, arrayList);
        arrayList.add(new gd.b());
        v vVar = this.f3924b;
        s sVar = this.f3923a;
        try {
            try {
                x xVarB = new gd.f(this, arrayList, 0, null, vVar, sVar.H, sVar.I, sVar.J).b(vVar);
                if (this.f3934x) {
                    cd.b.d(xVarB);
                    throw new IOException("Canceled");
                }
                g(null);
                return xVarB;
            } catch (IOException e) {
                IOException iOExceptionG = g(e);
                jc.i.c(iOExceptionG, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionG;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                g(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0020 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0022 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0026 A[Catch: all -> 0x0018, TryCatch #1 {all -> 0x0018, blocks: (B:8:0x0013, B:17:0x0022, B:19:0x0026, B:20:0x0028, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:14:0x001c), top: B:53:0x0013 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException f(e eVar, boolean z4, boolean z10, IOException iOException) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        jc.i.e(eVar, "exchange");
        if (eVar.equals(this.f3935y)) {
            synchronized (this) {
                z11 = false;
                if (z4) {
                    try {
                        if (this.f3931u) {
                            if (z4) {
                                this.f3931u = false;
                            }
                            if (z10) {
                                this.f3932v = false;
                            }
                            z13 = this.f3931u;
                            if (z13) {
                                z14 = false;
                            } else {
                                z14 = false;
                            }
                            if (!z13) {
                                z11 = true;
                            }
                            z12 = z11;
                            z11 = z14;
                        } else if (z10 || !this.f3932v) {
                            z12 = false;
                        } else {
                            if (z4) {
                                this.f3931u = false;
                            }
                            if (z10) {
                                this.f3932v = false;
                            }
                            z13 = this.f3931u;
                            if (z13 || this.f3932v) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            if (!z13 && !this.f3932v && !this.f3933w) {
                                z11 = true;
                            }
                            z12 = z11;
                            z11 = z14;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z10) {
                    }
                    z12 = false;
                }
            }
            if (z11) {
                this.f3935y = null;
                k kVar = this.f3929s;
                if (kVar != null) {
                    synchronized (kVar) {
                        kVar.f3946m++;
                    }
                }
            }
            if (z12) {
                return b(iOException);
            }
        }
        return iOException;
    }

    public final IOException g(IOException iOException) {
        boolean z4;
        synchronized (this) {
            z4 = false;
            if (this.f3933w) {
                this.f3933w = false;
                if (!this.f3931u && !this.f3932v) {
                    z4 = true;
                }
            }
        }
        return z4 ? b(iOException) : iOException;
    }

    public final Socket h() {
        k kVar = this.f3929s;
        jc.i.b(kVar);
        byte[] bArr = cd.b.f1822a;
        ArrayList arrayList = kVar.f3949p;
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i = -1;
                break;
            }
            Object obj = arrayList.get(i10);
            i10++;
            if (jc.i.a(((Reference) obj).get(), this)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            throw new IllegalStateException("Check failed.");
        }
        arrayList.remove(i);
        this.f3929s = null;
        if (!arrayList.isEmpty()) {
            return null;
        }
        kVar.f3950q = System.nanoTime();
        l lVar = this.f3925c;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) lVar.e;
        ed.c cVar = (ed.c) lVar.f3953c;
        byte[] bArr2 = cd.b.f1822a;
        if (!kVar.f3943j) {
            cVar.c((ed.b) lVar.f3954d, 0L);
            return null;
        }
        kVar.f3943j = true;
        concurrentLinkedQueue.remove(kVar);
        if (concurrentLinkedQueue.isEmpty()) {
            cVar.a();
        }
        Socket socket = kVar.f3940d;
        jc.i.b(socket);
        return socket;
    }
}

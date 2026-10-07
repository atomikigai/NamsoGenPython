package a2;

import android.database.SQLException;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import rc.b0;
import rc.t1;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f26a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f27b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ThreadLocal f28c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f29d;
    public final long e;

    public h(s5.j jVar) {
        this.f28c = new ThreadLocal();
        this.f29d = new AtomicBoolean(false);
        int i = qc.a.f8058d;
        this.e = qd.b.D(30, qc.c.SECONDS);
        n nVar = new n(1, new d(jVar, 0));
        this.f26a = nVar;
        this.f27b = nVar;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x01da A[Catch: all -> 0x01f3, TRY_LEAVE, TryCatch #3 {all -> 0x01f3, blocks: (B:109:0x01d4, B:111:0x01da, B:113:0x01e4, B:114:0x01e9), top: B:146:0x01d4 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x01e4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // a2.b
    public final Object J(boolean z4, ic.p pVar, ac.c cVar) {
        f fVar;
        jc.q qVar;
        Throwable th;
        n nVar;
        jc.q qVar2;
        n nVar2;
        yb.i iVar;
        jc.q qVar3;
        h hVar;
        ic.p pVar2;
        jc.q qVar4;
        Throwable th2;
        boolean z10;
        jc.q qVar5;
        v vVar;
        v vVar2;
        boolean z11 = z4;
        ic.p pVar3 = pVar;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i = fVar.f21u;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.f21u = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, cVar);
            }
        } else {
            fVar = new f(this, cVar);
        }
        Object objY = fVar.f19s;
        zb.a aVar = zb.a.f11555a;
        int i10 = fVar.f21u;
        yb.d dVar = null;
        try {
            if (i10 == 0) {
                r7.g.G(objY);
                if (this.f29d.get()) {
                    jd.d.K(21, "Connection pool is closed");
                    throw null;
                }
                ThreadLocal threadLocal = this.f28c;
                v vVar3 = (v) threadLocal.get();
                wa.d dVar2 = a.f2b;
                if (vVar3 == null) {
                    a aVar2 = (a) fVar.getContext().H(dVar2);
                    vVar3 = aVar2 != null ? aVar2.f3a : null;
                }
                if (vVar3 == null) {
                    n nVar3 = z11 ? this.f26a : this.f27b;
                    qVar = new jc.q();
                    try {
                        yb.i context = fVar.getContext();
                        jc.q qVar6 = new jc.q();
                        try {
                            long j4 = this.e;
                            e eVar = new e(qVar6, nVar3, dVar, 0);
                            fVar.f13a = this;
                            fVar.f14b = (Serializable) pVar3;
                            fVar.f15c = nVar3;
                            fVar.f16d = qVar;
                            fVar.e = context;
                            fVar.f17f = qVar6;
                            fVar.f18r = z11;
                            fVar.f21u = 3;
                            qVar2 = qVar6;
                            long jE = 0;
                            try {
                                if (qc.a.c(j4, 0L) > 0) {
                                    jE = (!((((int) j4) & 1) == 1) || qc.a.d(j4)) ? qc.a.e(j4, qc.c.MILLISECONDS) : j4 >> 1;
                                    if (jE < 1) {
                                        jE = 1;
                                    }
                                }
                                if (b0.z(jE, eVar, fVar) != aVar) {
                                    nVar2 = nVar3;
                                    iVar = context;
                                    pVar2 = pVar3;
                                    qVar3 = qVar;
                                    qVar4 = qVar2;
                                    hVar = this;
                                    th2 = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                nVar2 = nVar3;
                                iVar = context;
                                qVar3 = qVar;
                                hVar = this;
                                th2 = th;
                                pVar2 = pVar3;
                                qVar4 = qVar2;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            qVar2 = qVar6;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        nVar = nVar3;
                        throw th;
                    }
                } else {
                    if (!z11 && vVar3.f84b) {
                        jd.d.K(1, "Cannot upgrade connection from reader to writer");
                        throw null;
                    }
                    if (fVar.getContext().H(dVar2) == null) {
                        a aVar3 = new a(vVar3);
                        jc.i.e(threadLocal, "<this>");
                        yb.i iVarX = com.bumptech.glide.d.x(aVar3, new wc.x(vVar3, threadLocal));
                        g gVar = new g(pVar3, vVar3, dVar, 0);
                        fVar.f21u = 1;
                        Object objY2 = b0.y(iVarX, gVar, fVar);
                        if (objY2 != aVar) {
                            return objY2;
                        }
                    } else {
                        fVar.f21u = 2;
                        Object objInvoke = pVar3.invoke(vVar3, fVar);
                        if (objInvoke != aVar) {
                            return objInvoke;
                        }
                    }
                }
                return aVar;
            }
            if (i10 == 1) {
                r7.g.G(objY);
                return objY;
            }
            if (i10 == 2) {
                r7.g.G(objY);
                return objY;
            }
            if (i10 != 3) {
                if (i10 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qVar5 = (jc.q) fVar.f14b;
                nVar = (n) fVar.f13a;
                try {
                    r7.g.G(objY);
                    try {
                        vVar2 = (v) qVar5.f5776a;
                        if (vVar2 != null) {
                            if (vVar2.f86d.compareAndSet(false, true)) {
                                try {
                                    jd.d.o(vVar2.f83a, "ROLLBACK TRANSACTION");
                                } catch (SQLException unused) {
                                }
                            }
                            i iVar2 = vVar2.f83a;
                            iVar2.f32c = null;
                            iVar2.f33d = null;
                            nVar.d(iVar2);
                        }
                    } catch (Throwable unused2) {
                    }
                    return objY;
                } catch (Throwable th6) {
                    th = th6;
                    qVar = qVar5;
                    th = th;
                    try {
                        throw th;
                    } catch (Throwable th7) {
                        try {
                            v vVar4 = (v) qVar.f5776a;
                            if (vVar4 == null) {
                                throw th7;
                            }
                            if (vVar4.f86d.compareAndSet(false, true)) {
                                try {
                                    jd.d.o(vVar4.f83a, "ROLLBACK TRANSACTION");
                                } catch (SQLException unused3) {
                                }
                            }
                            i iVar3 = vVar4.f83a;
                            iVar3.f32c = null;
                            iVar3.f33d = null;
                            nVar.d(iVar3);
                            throw th7;
                        } catch (Throwable th8) {
                            p3.a.a(th, th8);
                            throw th7;
                        }
                    }
                }
            }
            z11 = fVar.f18r;
            qVar4 = fVar.f17f;
            iVar = fVar.e;
            qVar3 = fVar.f16d;
            nVar2 = fVar.f15c;
            pVar2 = (ic.p) fVar.f14b;
            hVar = (h) fVar.f13a;
            try {
                r7.g.G(objY);
                th2 = null;
            } catch (Throwable th9) {
                th = th9;
                qVar2 = qVar4;
                pVar3 = pVar2;
                th2 = th;
                pVar2 = pVar3;
                qVar4 = qVar2;
            }
            i iVar4 = (i) qVar4.f5776a;
            if (iVar4 != null) {
                jc.i.e(iVar, "context");
                iVar4.f32c = iVar;
                iVar4.f33d = new Throwable();
                vVar = new v(iVar4, hVar.f26a != hVar.f27b && z10);
            } else {
                vVar = null;
            }
            qVar5.f5776a = vVar;
            if (th2 instanceof t1) {
                hVar.c(z10);
                throw null;
            }
            if (th2 != null) {
                throw th2;
            }
            if (vVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            hVar.getClass();
            a aVar4 = new a(vVar);
            ThreadLocal threadLocal2 = hVar.f28c;
            jc.i.e(threadLocal2, "<this>");
            yb.i iVarX2 = com.bumptech.glide.d.x(aVar4, new wc.x(vVar, threadLocal2));
            g gVar2 = new g(pVar2, qVar5, null, 1);
            fVar.f13a = nVar2;
            fVar.f14b = qVar5;
            fVar.f15c = null;
            fVar.f16d = null;
            fVar.e = null;
            fVar.f17f = null;
            fVar.f21u = 4;
            objY = b0.y(iVarX2, gVar2, fVar);
            if (objY != aVar) {
                nVar = nVar2;
                vVar2 = (v) qVar5.f5776a;
                if (vVar2 != null) {
                    if (vVar2.f86d.compareAndSet(false, true)) {
                        jd.d.o(vVar2.f83a, "ROLLBACK TRANSACTION");
                    }
                    i iVar5 = vVar2.f83a;
                    iVar5.f32c = null;
                    iVar5.f33d = null;
                    nVar.d(iVar5);
                }
                return objY;
            }
            return aVar;
        } catch (Throwable th10) {
            th = th10;
            qVar = qVar5;
            nVar = nVar2;
            th = th;
            throw th;
        }
        z10 = z11;
        qVar5 = qVar3;
    }

    public final void c(boolean z4) {
        String str = z4 ? "reader" : "writer";
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Timed out attempting to acquire a " + str + " connection.");
        sb2.append("\n\nWriter pool:\n");
        this.f27b.c(sb2);
        sb2.append("Reader pool:");
        sb2.append('\n');
        this.f26a.c(sb2);
        jd.d.K(5, sb2.toString());
        throw null;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.f29d.compareAndSet(false, true)) {
            this.f26a.b();
            this.f27b.b();
        }
    }

    public h(final s5.j jVar, final String str, int i) {
        jc.i.e(str, "fileName");
        this.f28c = new ThreadLocal();
        final int i10 = 0;
        this.f29d = new AtomicBoolean(false);
        int i11 = qc.a.f8058d;
        this.e = qd.b.D(30, qc.c.SECONDS);
        if (i > 0) {
            this.f26a = new n(i, new ic.a() { // from class: a2.c
                @Override // ic.a
                public final Object a() {
                    switch (i10) {
                        case 0:
                            g2.a aVarH = jVar.h(str);
                            jd.d.o(aVarH, "PRAGMA query_only = 1");
                            return aVarH;
                        default:
                            return jVar.h(str);
                    }
                }
            });
            final int i12 = 1;
            this.f27b = new n(1, new ic.a() { // from class: a2.c
                @Override // ic.a
                public final Object a() {
                    switch (i12) {
                        case 0:
                            g2.a aVarH = jVar.h(str);
                            jd.d.o(aVarH, "PRAGMA query_only = 1");
                            return aVarH;
                        default:
                            return jVar.h(str);
                    }
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
    }
}

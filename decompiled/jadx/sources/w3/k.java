package w3;

import android.os.SystemClock;
import android.util.Log;
import g.b0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import o6.h0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements o, q {
    public static final boolean h = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a4.a0 f9534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r7.i f9535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y3.c f9536c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e6.q f9537d;
    public final ea.e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bb.b f9538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gb.r f9539g;

    public k(y3.c cVar, h0 h0Var, z3.d dVar, z3.d dVar2, z3.d dVar3, z3.d dVar4) throws Throwable {
        this.f9536c = cVar;
        g7.i iVar = new g7.i(h0Var);
        gb.r rVar = new gb.r(9);
        this.f9539g = rVar;
        synchronized (this) {
            try {
                synchronized (rVar) {
                    try {
                        try {
                            rVar.f4496d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.f9535b = new r7.i();
                this.f9534a = new a4.a0(1);
                this.f9537d = new e6.q(dVar, dVar2, dVar3, dVar4, this, this);
                this.f9538f = new bb.b(iVar);
                this.e = new ea.e();
                cVar.f10547d = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void c(String str, long j4, p pVar) {
        StringBuilder sbC = u.e.c(str, " in ");
        sbC.append(p4.h.a(j4));
        sbC.append("ms, key: ");
        sbC.append(pVar);
        Log.v("Engine", sbC.toString());
    }

    public static void f(x xVar) {
        if (!(xVar instanceof r)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((r) xVar).c();
    }

    public final q5.d a(com.bumptech.glide.e eVar, Object obj, u3.f fVar, int i, int i10, Class cls, Class cls2, com.bumptech.glide.f fVar2, j jVar, p4.c cVar, boolean z4, boolean z10, u3.i iVar, boolean z11, boolean z12, l4.f fVar3, b0 b0Var) {
        long jElapsedRealtimeNanos;
        if (h) {
            int i11 = p4.h.f7800b;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f9535b.getClass();
        p pVar = new p(obj, fVar, i, i10, cVar, cls, cls2, iVar);
        synchronized (this) {
            try {
                r rVarB = b(pVar, z11, jElapsedRealtimeNanos);
                if (rVarB == null) {
                    return g(eVar, obj, fVar, i, i10, cls, cls2, fVar2, jVar, cVar, z4, z10, iVar, z11, z12, fVar3, b0Var, pVar, jElapsedRealtimeNanos);
                }
                fVar3.k(rVarB, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008e */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final w3.r b(w3.p r8, boolean r9, long r10) throws java.lang.Throwable {
        /*
            r7 = this;
            r0 = 0
            if (r9 != 0) goto L6
            r6 = r7
            goto L88
        L6:
            gb.r r9 = r7.f9539g
            monitor-enter(r9)
            java.lang.Object r1 = r9.f4494b     // Catch: java.lang.Throwable -> L90
            java.util.HashMap r1 = (java.util.HashMap) r1     // Catch: java.lang.Throwable -> L90
            java.lang.Object r1 = r1.get(r8)     // Catch: java.lang.Throwable -> L90
            w3.a r1 = (w3.a) r1     // Catch: java.lang.Throwable -> L90
            if (r1 != 0) goto L18
            monitor-exit(r9)
            r2 = r0
            goto L2a
        L18:
            java.lang.Object r2 = r1.get()     // Catch: java.lang.Throwable -> L90
            w3.r r2 = (w3.r) r2     // Catch: java.lang.Throwable -> L90
            if (r2 != 0) goto L29
            r9.d(r1)     // Catch: java.lang.Throwable -> L24
            goto L29
        L24:
            r0 = move-exception
            r8 = r0
            r6 = r7
            goto L93
        L29:
            monitor-exit(r9)
        L2a:
            if (r2 == 0) goto L2f
            r2.a()
        L2f:
            if (r2 == 0) goto L3b
            boolean r9 = w3.k.h
            if (r9 == 0) goto L3a
            java.lang.String r9 = "Loaded resource from active resources"
            c(r9, r10, r8)
        L3a:
            return r2
        L3b:
            y3.c r1 = r7.f9536c
            monitor-enter(r1)
            java.util.LinkedHashMap r9 = r1.f7803a     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = r9.remove(r8)     // Catch: java.lang.Throwable -> L89
            p4.i r9 = (p4.i) r9     // Catch: java.lang.Throwable -> L89
            if (r9 != 0) goto L4b
            monitor-exit(r1)
            r9 = r0
            goto L56
        L4b:
            long r2 = r1.f7805c     // Catch: java.lang.Throwable -> L89
            int r4 = r9.f7802b     // Catch: java.lang.Throwable -> L89
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L89
            long r2 = r2 - r4
            r1.f7805c = r2     // Catch: java.lang.Throwable -> L89
            java.lang.Object r9 = r9.f7801a     // Catch: java.lang.Throwable -> L89
            monitor-exit(r1)
        L56:
            r2 = r9
            w3.x r2 = (w3.x) r2
            if (r2 != 0) goto L5f
            r6 = r7
            r5 = r8
            r2 = r0
            goto L72
        L5f:
            boolean r9 = r2 instanceof w3.r
            if (r9 == 0) goto L68
            w3.r r2 = (w3.r) r2
            r6 = r7
            r5 = r8
            goto L72
        L68:
            w3.r r1 = new w3.r
            r3 = 1
            r4 = 1
            r6 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r2 = r1
        L72:
            if (r2 == 0) goto L7c
            r2.a()
            gb.r r8 = r6.f9539g
            r8.a(r5, r2)
        L7c:
            if (r2 == 0) goto L88
            boolean r8 = w3.k.h
            if (r8 == 0) goto L87
            java.lang.String r8 = "Loaded resource from cache"
            c(r8, r10, r5)
        L87:
            return r2
        L88:
            return r0
        L89:
            r0 = move-exception
            r6 = r7
        L8b:
            r8 = r0
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8e
            throw r8
        L8e:
            r0 = move-exception
            goto L8b
        L90:
            r0 = move-exception
            r6 = r7
        L92:
            r8 = r0
        L93:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L95
            throw r8
        L95:
            r0 = move-exception
            goto L92
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.k.b(w3.p, boolean, long):w3.r");
    }

    public final synchronized void d(n nVar, u3.f fVar, r rVar) {
        if (rVar != null) {
            try {
                if (rVar.f9565a) {
                    this.f9539g.a(fVar, rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        a4.a0 a0Var = this.f9534a;
        a0Var.getClass();
        nVar.getClass();
        HashMap map = a0Var.f111a;
        if (nVar.equals(map.get(fVar))) {
            map.remove(fVar);
        }
    }

    public final void e(u3.f fVar, r rVar) {
        gb.r rVar2 = this.f9539g;
        synchronized (rVar2) {
            a aVar = (a) ((HashMap) rVar2.f4494b).remove(fVar);
            if (aVar != null) {
                aVar.f9480c = null;
                aVar.clear();
            }
        }
        if (rVar.f9565a) {
        } else {
            this.e.d(rVar, false);
        }
    }

    public final q5.d g(com.bumptech.glide.e eVar, Object obj, u3.f fVar, int i, int i10, Class cls, Class cls2, com.bumptech.glide.f fVar2, j jVar, Map map, boolean z4, boolean z10, u3.i iVar, boolean z11, boolean z12, l4.f fVar3, Executor executor, p pVar, long j4) {
        z3.d dVar;
        n nVar = (n) this.f9534a.f111a.get(pVar);
        if (nVar != null) {
            nVar.a(fVar3, executor);
            if (h) {
                c("Added to existing load", j4, pVar);
            }
            return new q5.d(this, fVar3, nVar);
        }
        n nVar2 = (n) ((a2.l) this.f9537d.f3395g).c();
        synchronized (nVar2) {
            nVar2.f9554v = pVar;
            nVar2.f9555w = z11;
            nVar2.f9556x = z12;
        }
        bb.b bVar = this.f9538f;
        h hVar = (h) ((a2.l) bVar.f1526d).c();
        int i11 = bVar.f1524b;
        bVar.f1524b = i11 + 1;
        g gVar = hVar.f9512a;
        g7.i iVar2 = hVar.f9515d;
        gVar.f9499c = eVar;
        gVar.f9500d = obj;
        gVar.f9507n = fVar;
        gVar.e = i;
        gVar.f9501f = i10;
        gVar.f9509p = jVar;
        gVar.f9502g = cls;
        gVar.h = iVar2;
        gVar.f9504k = cls2;
        gVar.f9508o = fVar2;
        gVar.i = iVar;
        gVar.f9503j = map;
        gVar.f9510q = z4;
        gVar.f9511r = z10;
        hVar.f9518s = eVar;
        hVar.f9519t = fVar;
        hVar.f9520u = fVar2;
        hVar.f9521v = pVar;
        hVar.f9522w = i;
        hVar.f9523x = i10;
        hVar.f9524y = jVar;
        hVar.f9525z = iVar;
        hVar.A = nVar2;
        hVar.B = i11;
        hVar.O = 1;
        hVar.D = obj;
        a4.a0 a0Var = this.f9534a;
        a0Var.getClass();
        a0Var.f111a.put(pVar, nVar2);
        nVar2.a(fVar3, executor);
        synchronized (nVar2) {
            nVar2.E = hVar;
            int iH = hVar.h(1);
            if (iH == 2 || iH == 3) {
                dVar = nVar2.f9550r;
            } else {
                dVar = nVar2.f9556x ? nVar2.f9552t : nVar2.f9551s;
            }
            dVar.execute(hVar);
        }
        if (h) {
            c("Started new load", j4, pVar);
        }
        return new q5.d(this, fVar3, nVar2);
    }
}

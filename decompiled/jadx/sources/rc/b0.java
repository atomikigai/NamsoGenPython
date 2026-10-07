package rc;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i6.e f8252a = new i6.e("RESUME_TOKEN", 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i6.e f8253b = new i6.e("REMOVED_TASK", 3);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i6.e f8254c = new i6.e("CLOSED_EMPTY", 3);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i6.e f8255d = new i6.e("COMPLETING_ALREADY", 3);
    public static final i6.e e = new i6.e("COMPLETING_WAITING_CHILDREN", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final i6.e f8256f = new i6.e("COMPLETING_RETRY", 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i6.e f8257g = new i6.e("TOO_LATE_TO_CANCEL", 3);
    public static final i6.e h = new i6.e("SEALED", 3);
    public static final p0 i = new p0(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p0 f8258j = new p0(true);

    public static q a() {
        q qVar = new q(true);
        qVar.F(null);
        return qVar;
    }

    public static final wc.e b(yb.i iVar) {
        if (iVar.H(y.f8337b) == null) {
            iVar = iVar.B(new e1(null));
        }
        return new wc.e(iVar);
    }

    public static r1 c() {
        return new r1(null);
    }

    public static f0 d(a0 a0Var, ic.p pVar) {
        f0 f0Var = new f0(r(a0Var, yb.j.f10674a), true);
        f0Var.X(1, f0Var, pVar);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object e(e0[] e0VarArr, ac.i iVar) {
        int iS;
        if (e0VarArr.length == 0) {
            return vb.q.f9297a;
        }
        e eVar = new e(e0VarArr);
        k kVar = new k(1, qd.b.r(iVar));
        kVar.s();
        int length = e0VarArr.length;
        c[] cVarArr = new c[length];
        for (int i10 = 0; i10 < length; i10++) {
            l1 l1Var = (l1) e0VarArr[i10];
            do {
                iS = l1Var.S(l1Var.A());
                if (iS == 0) {
                    break;
                }
            } while (iS != 1);
            c cVar = new c(eVar, kVar);
            cVar.f8260f = l1Var.I(false, true, cVar);
            cVarArr[i10] = cVar;
        }
        d dVar = new d(cVarArr);
        for (int i11 = 0; i11 < length; i11++) {
            c cVar2 = cVarArr[i11];
            cVar2.getClass();
            c.f8259s.set(cVar2, dVar);
        }
        if (k.f8289r.get(kVar) instanceof o1) {
            kVar.u(dVar);
        } else {
            dVar.d();
        }
        Object objR = kVar.r();
        zb.a aVar = zb.a.f11555a;
        return objR;
    }

    public static final void f(yb.i iVar, CancellationException cancellationException) {
        b1 b1Var = (b1) iVar.H(y.f8337b);
        if (b1Var != null) {
            b1Var.d(cancellationException);
        }
    }

    public static final Object g(ic.p pVar, yb.d dVar) {
        wc.s sVar = new wc.s(dVar, dVar.getContext());
        Object objT = p3.a.t(sVar, sVar, pVar);
        zb.a aVar = zb.a.f11555a;
        return objT;
    }

    public static final void h(yb.i iVar) {
        b1 b1Var = (b1) iVar.H(y.f8337b);
        if (b1Var != null && !b1Var.c()) {
            throw ((l1) b1Var).u();
        }
    }

    public static final yb.i i(yb.i iVar, yb.i iVar2, boolean z4) {
        Boolean bool = Boolean.FALSE;
        u uVar = u.f8323c;
        boolean zBooleanValue = ((Boolean) iVar.G(bool, uVar)).booleanValue();
        boolean zBooleanValue2 = ((Boolean) iVar2.G(bool, uVar)).booleanValue();
        if (!zBooleanValue && !zBooleanValue2) {
            return iVar.B(iVar2);
        }
        u uVar2 = new u(2, 2);
        yb.j jVar = yb.j.f10674a;
        yb.i iVar3 = (yb.i) iVar.G(jVar, uVar2);
        Object objG = iVar2;
        if (zBooleanValue2) {
            objG = iVar2.G(jVar, u.f8322b);
        }
        return iVar3.B((yb.i) objG);
    }

    public static final x j(Executor executor) {
        return new w0(executor);
    }

    public static final g0 k(yb.i iVar) {
        yb.g gVarH = iVar.H(yb.e.f10673a);
        g0 g0Var = gVarH instanceof g0 ? (g0) gVarH : null;
        return g0Var == null ? d0.f8266a : g0Var;
    }

    public static final String l(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }

    public static final k m(yb.d dVar) {
        k kVar;
        k kVar2;
        if (!(dVar instanceof wc.h)) {
            return new k(1, dVar);
        }
        wc.h hVar = (wc.h) dVar;
        i6.e eVar = wc.a.f9917d;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wc.h.f9930s;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(hVar);
            kVar = null;
            if (obj == null) {
                atomicReferenceFieldUpdater.set(hVar, eVar);
                kVar2 = null;
                break;
            }
            if (obj instanceof k) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(hVar, obj, eVar)) {
                        kVar2 = (k) obj;
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(hVar) == obj);
            } else if (obj != eVar && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
        if (kVar2 != null) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = k.f8289r;
            Object obj2 = atomicReferenceFieldUpdater2.get(kVar2);
            if (!(obj2 instanceof r) || ((r) obj2).f8311d == null) {
                k.f8288f.set(kVar2, 536870911);
                atomicReferenceFieldUpdater2.set(kVar2, b.f8251a);
                kVar = kVar2;
            } else {
                kVar2.o();
            }
            if (kVar != null) {
                return kVar;
            }
        }
        return new k(2, dVar);
    }

    public static final void n(Throwable th, yb.i iVar) {
        try {
            sc.b bVar = (sc.b) iVar.H(y.f8336a);
            if (bVar != null) {
                bVar.S(th);
            } else {
                wc.a.d(th, iVar);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                p3.a.a(runtimeException, th);
                th = runtimeException;
            }
            wc.a.d(th, iVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object p(List list, ac.c cVar) {
        f fVar;
        Iterator it;
        Object obj;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f8272c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f8272c = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(cVar);
            }
        } else {
            fVar = new f(cVar);
        }
        Object obj2 = fVar.f8271b;
        zb.a aVar = zb.a.f11555a;
        int i11 = fVar.f8272c;
        if (i11 == 0) {
            r7.g.G(obj2);
            it = list.iterator();
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = fVar.f8270a;
            r7.g.G(obj2);
        }
        do {
            boolean zHasNext = it.hasNext();
            obj = ub.k.f9073a;
            if (!zHasNext) {
                return obj;
            }
            b1 b1Var = (b1) it.next();
            fVar.f8270a = it;
            fVar.f8272c = 1;
            l1 l1Var = (l1) b1Var;
            while (true) {
                Object objA = l1Var.A();
                if (!(objA instanceof y0)) {
                    h(fVar.getContext());
                    break;
                }
                if (l1Var.S(objA) >= 0) {
                    k kVar = new k(1, qd.b.r(fVar));
                    kVar.s();
                    kVar.u(new n0(l1Var.I(false, true, new o0(kVar, 3)), 0));
                    Object objR = kVar.r();
                    zb.a aVar2 = zb.a.f11555a;
                    if (objR != aVar2) {
                        objR = obj;
                    }
                    if (objR != aVar2) {
                        break;
                    }
                    obj = objR;
                    break;
                }
            }
        } while (obj != aVar);
        return aVar;
    }

    public static q1 q(a0 a0Var, yb.i iVar, ic.p pVar, int i10) {
        if ((i10 & 1) != 0) {
            iVar = yb.j.f10674a;
        }
        q1 q1Var = new q1(r(a0Var, iVar), true);
        q1Var.X(1, q1Var, pVar);
        return q1Var;
    }

    public static final yb.i r(a0 a0Var, yb.i iVar) {
        yb.i iVarI = i(a0Var.b(), iVar, true);
        yc.d dVar = k0.f8292a;
        return (iVarI == dVar || iVarI.H(yb.e.f10673a) != null) ? iVarI : iVarI.B(dVar);
    }

    public static final Object s(Object obj) {
        return obj instanceof s ? r7.g.m(((s) obj).f8315a) : obj;
    }

    public static final void t(k kVar, yb.d dVar, boolean z4) {
        Object obj = k.f8289r.get(kVar);
        Throwable thD = kVar.d(obj);
        Object objM = thD != null ? r7.g.m(thD) : kVar.g(obj);
        if (!z4) {
            dVar.resumeWith(objM);
            return;
        }
        jc.i.c(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
        wc.h hVar = (wc.h) dVar;
        ac.c cVar = hVar.e;
        Object obj2 = hVar.f9933r;
        yb.i context = cVar.getContext();
        Object objM2 = wc.a.m(context, obj2);
        w1 w1VarX = objM2 != wc.a.f9918f ? x(cVar, context, objM2) : null;
        try {
            cVar.resumeWith(objM);
        } finally {
            if (w1VarX == null || w1VarX.Y()) {
                wc.a.g(context, objM2);
            }
        }
    }

    public static final Object u(yb.i iVar, ic.p pVar) throws Throwable {
        u0 u0VarA;
        yb.i iVarI;
        Thread threadCurrentThread = Thread.currentThread();
        yb.h hVar = yb.e.f10673a;
        yb.f fVar = (yb.f) iVar.H(hVar);
        yb.j jVar = yb.j.f10674a;
        if (fVar == null) {
            u0VarA = s1.a();
            iVarI = i(jVar, iVar.B(u0VarA), true);
            yc.d dVar = k0.f8292a;
            if (iVarI != dVar && iVarI.H(hVar) == null) {
                iVarI = iVarI.B(dVar);
            }
        } else {
            if (fVar instanceof u0) {
            }
            u0VarA = (u0) s1.f8317a.get();
            iVarI = i(jVar, iVar, true);
            yc.d dVar2 = k0.f8292a;
            if (iVarI != dVar2 && iVarI.H(hVar) == null) {
                iVarI = iVarI.B(dVar2);
            }
        }
        g gVar = new g(iVarI, threadCurrentThread, u0VarA);
        gVar.X(1, gVar, pVar);
        u0 u0Var = gVar.e;
        if (u0Var != null) {
            int i10 = u0.f8325f;
            u0Var.W(false);
        }
        while (!Thread.interrupted()) {
            try {
                long jX = u0Var != null ? u0Var.X() : Long.MAX_VALUE;
                if (!(gVar.A() instanceof y0)) {
                    if (u0Var != null) {
                        int i11 = u0.f8325f;
                        u0Var.U(false);
                    }
                    Object objW = w(gVar.A());
                    s sVar = objW instanceof s ? (s) objW : null;
                    if (sVar == null) {
                        return objW;
                    }
                    throw sVar.f8315a;
                }
                LockSupport.parkNanos(gVar, jX);
            } catch (Throwable th) {
                if (u0Var != null) {
                    int i12 = u0.f8325f;
                    u0Var.U(false);
                }
                throw th;
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        gVar.m(interruptedException);
        throw interruptedException;
    }

    public static final String v(yb.d dVar) {
        Object objM;
        if (dVar instanceof wc.h) {
            return dVar.toString();
        }
        try {
            objM = dVar + '@' + l(dVar);
        } catch (Throwable th) {
            objM = r7.g.m(th);
        }
        if (ub.h.a(objM) != null) {
            objM = dVar.getClass().getName() + '@' + l(dVar);
        }
        return (String) objM;
    }

    public static final Object w(Object obj) {
        y0 y0Var;
        z0 z0Var = obj instanceof z0 ? (z0) obj : null;
        return (z0Var == null || (y0Var = z0Var.f8340a) == null) ? obj : y0Var;
    }

    public static final w1 x(yb.d dVar, yb.i iVar, Object obj) {
        w1 w1Var = null;
        if ((dVar instanceof ac.d) && iVar.H(x1.f8335a) != null) {
            ac.d callerFrame = (ac.d) dVar;
            while (!(callerFrame instanceof h0) && (callerFrame = callerFrame.getCallerFrame()) != null) {
                if (callerFrame instanceof w1) {
                    w1Var = (w1) callerFrame;
                    break;
                }
            }
            if (w1Var != null) {
                w1Var.Z(iVar, obj);
            }
        }
        return w1Var;
    }

    public static final Object y(yb.i iVar, ic.p pVar, yb.d dVar) {
        Object objW;
        yb.i context = dVar.getContext();
        yb.i iVarB = !((Boolean) iVar.G(Boolean.FALSE, u.f8323c)).booleanValue() ? context.B(iVar) : i(context, iVar, false);
        h(iVarB);
        if (iVarB == context) {
            wc.s sVar = new wc.s(dVar, iVarB);
            objW = p3.a.t(sVar, sVar, pVar);
        } else {
            yb.e eVar = yb.e.f10673a;
            if (jc.i.a(iVarB.H(eVar), context.H(eVar))) {
                w1 w1Var = new w1(dVar, iVarB);
                yb.i iVar2 = w1Var.f8249c;
                Object objM = wc.a.m(iVar2, null);
                try {
                    Object objT = p3.a.t(w1Var, w1Var, pVar);
                    wc.a.g(iVar2, objM);
                    objW = objT;
                } catch (Throwable th) {
                    wc.a.g(iVar2, objM);
                    throw th;
                }
            } else {
                h0 h0Var = new h0(dVar, iVarB);
                n9.b.C(pVar, h0Var, h0Var);
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = h0.e;
                do {
                    int i10 = atomicIntegerFieldUpdater.get(h0Var);
                    if (i10 != 0) {
                        if (i10 != 2) {
                            throw new IllegalStateException("Already suspended");
                        }
                        objW = w(h0Var.A());
                        if (objW instanceof s) {
                            throw ((s) objW).f8315a;
                        }
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(h0Var, 0, 1));
                objW = zb.a.f11555a;
            }
        }
        zb.a aVar = zb.a.f11555a;
        return objW;
    }

    public static final Object z(long j4, ic.p pVar, ac.c cVar) throws Throwable {
        Object sVar;
        Object objL;
        if (j4 <= 0) {
            throw new t1("Timed out immediately", null);
        }
        u1 u1Var = new u1(j4, cVar);
        u1Var.I(false, true, new o0(k(u1Var.f9952d.getContext()).o(u1Var.e, u1Var, u1Var.f8249c), 0));
        try {
            jc.t.a(2, pVar);
            sVar = pVar.invoke(u1Var, u1Var);
        } catch (Throwable th) {
            sVar = new s(false, th);
        }
        Object obj = zb.a.f11555a;
        if (sVar == obj || (objL = u1Var.L(sVar)) == e) {
            return obj;
        }
        if (objL instanceof s) {
            Throwable th2 = ((s) objL).f8315a;
            if (!(th2 instanceof t1) || ((t1) th2).f8321a != u1Var) {
                throw th2;
            }
            if (sVar instanceof s) {
                throw ((s) sVar).f8315a;
            }
        } else {
            sVar = w(objL);
        }
        return sVar;
    }
}

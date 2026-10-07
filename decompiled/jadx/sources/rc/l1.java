package rc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class l1 implements b1, p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8300a = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_state");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8301b = AtomicReferenceFieldUpdater.newUpdater(l1.class, Object.class, "_parentHandle");
    private volatile Object _parentHandle;
    private volatile Object _state;

    public l1(boolean z4) {
        this._state = z4 ? b0.f8258j : b0.i;
    }

    public static o N(wc.k kVar) {
        while (kVar.k()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wc.k.f9940b;
            wc.k kVarG = kVar.g();
            if (kVarG == null) {
                Object obj = atomicReferenceFieldUpdater.get(kVar);
                while (true) {
                    kVar = (wc.k) obj;
                    if (!kVar.k()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVar);
                }
            } else {
                kVar = kVarG;
            }
        }
        while (true) {
            kVar = kVar.j();
            if (!kVar.k()) {
                if (kVar instanceof o) {
                    return (o) kVar;
                }
                if (kVar instanceof m1) {
                    return null;
                }
            }
        }
    }

    public static String T(Object obj) {
        if (!(obj instanceof i1)) {
            if (obj instanceof y0) {
                return ((y0) obj).c() ? "Active" : "New";
            }
            return obj instanceof s ? "Cancelled" : "Completed";
        }
        i1 i1Var = (i1) obj;
        if (i1Var.d()) {
            return "Cancelling";
        }
        return i1Var.f() ? "Completing" : "Active";
    }

    public final Object A() {
        while (true) {
            Object obj = f8300a.get(this);
            if (!(obj instanceof wc.p)) {
                return obj;
            }
            ((wc.p) obj).a(this);
        }
    }

    @Override // yb.i
    public final yb.i B(yb.i iVar) {
        return com.bumptech.glide.d.x(this, iVar);
    }

    public boolean C(Throwable th) {
        return false;
    }

    @Override // yb.i
    public final yb.i E(yb.h hVar) {
        return com.bumptech.glide.d.u(this, hVar);
    }

    public final void F(b1 b1Var) {
        int iS;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8301b;
        n1 n1Var = n1.f8304a;
        if (b1Var == null) {
            atomicReferenceFieldUpdater.set(this, n1Var);
            return;
        }
        l1 l1Var = (l1) b1Var;
        do {
            iS = l1Var.S(l1Var.A());
            if (iS == 0) {
                break;
            }
        } while (iS != 1);
        n nVar = (n) l1Var.I((2 & 1) == 0, (2 & 2) != 0, new o(this));
        atomicReferenceFieldUpdater.set(this, nVar);
        if (A() instanceof y0) {
            return;
        }
        nVar.f();
        atomicReferenceFieldUpdater.set(this, n1Var);
    }

    @Override // yb.i
    public final Object G(Object obj, ic.p pVar) {
        return pVar.invoke(obj, this);
    }

    @Override // yb.i
    public final yb.g H(yb.h hVar) {
        return com.bumptech.glide.d.n(this, hVar);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0028 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:98:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:99:0x00c0 A[EDGE_INSN: B:99:0x00c0->B:78:0x00c0 BREAK  A[LOOP:0: B:18:0x0028->B:108:0x0028], SYNTHETIC] */
    public final m0 I(boolean z4, boolean z10, ic.l lVar) {
        f1 o0Var;
        Throwable thB;
        if (z4) {
            o0Var = lVar instanceof d1 ? (d1) lVar : null;
            if (o0Var == null) {
                o0Var = new a1(lVar);
            }
        } else {
            o0Var = lVar instanceof f1 ? (f1) lVar : null;
            if (o0Var == null) {
                o0Var = new o0(lVar, 1);
            }
        }
        o0Var.f8273d = this;
        loop0: while (true) {
            Object objA = A();
            if (objA instanceof p0) {
                p0 p0Var = (p0) objA;
                if (p0Var.f8306a) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8300a;
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, objA, o0Var)) {
                        if (atomicReferenceFieldUpdater.get(this) != objA) {
                        }
                    }
                    break loop0;
                }
                m1 m1Var = new m1();
                y0 x0Var = p0Var.f8306a ? m1Var : new x0(m1Var);
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8300a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, p0Var, x0Var) && atomicReferenceFieldUpdater2.get(this) == p0Var) {
                }
            } else {
                if (!(objA instanceof y0)) {
                    if (z10) {
                        s sVar = objA instanceof s ? (s) objA : null;
                        lVar.invoke(sVar != null ? sVar.f8315a : null);
                    }
                    return n1.f8304a;
                }
                y0 y0Var = (y0) objA;
                m1 m1VarE = y0Var.e();
                if (m1VarE == null) {
                    R((f1) objA);
                } else {
                    m0 m0Var = n1.f8304a;
                    if (z4 && (objA instanceof i1)) {
                        synchronized (objA) {
                            try {
                                thB = ((i1) objA).b();
                                if (thB == null || ((lVar instanceof o) && !((i1) objA).f())) {
                                    if (j((y0) objA, m1VarE, o0Var)) {
                                        if (thB == null) {
                                            return o0Var;
                                        }
                                        m0Var = o0Var;
                                    }
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        if (thB != null) {
                            if (z10) {
                                lVar.invoke(thB);
                            }
                            return m0Var;
                        }
                        if (j(y0Var, m1VarE, o0Var)) {
                            break;
                            break;
                        }
                    } else {
                        thB = null;
                        if (thB != null) {
                            if (z10) {
                                lVar.invoke(thB);
                            }
                            return m0Var;
                        }
                        if (j(y0Var, m1VarE, o0Var)) {
                            break;
                        }
                    }
                }
            }
        }
        return o0Var;
    }

    public boolean J() {
        return this instanceof g;
    }

    public final boolean K(Object obj) {
        Object objU;
        do {
            objU = U(A(), obj);
            if (objU == b0.f8255d) {
                return false;
            }
            if (objU == b0.e) {
                return true;
            }
        } while (objU == b0.f8256f);
        k(objU);
        return true;
    }

    public final Object L(Object obj) {
        Object objU;
        do {
            objU = U(A(), obj);
            if (objU == b0.f8255d) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                s sVar = obj instanceof s ? (s) obj : null;
                throw new IllegalStateException(str, sVar != null ? sVar.f8315a : null);
            }
        } while (objU == b0.f8256f);
        return objU;
    }

    public String M() {
        return getClass().getSimpleName();
    }

    public final void O(m1 m1Var, Throwable th) {
        Object objI = m1Var.i();
        jc.i.c(objI, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
        androidx.datastore.preferences.protobuf.d1 d1Var = null;
        for (wc.k kVarJ = (wc.k) objI; !kVarJ.equals(m1Var); kVarJ = kVarJ.j()) {
            if (kVarJ instanceof d1) {
                f1 f1Var = (f1) kVarJ;
                try {
                    f1Var.m(th);
                } catch (Throwable th2) {
                    if (d1Var != null) {
                        p3.a.a(d1Var, th2);
                    } else {
                        d1Var = new androidx.datastore.preferences.protobuf.d1("Exception in completion handler " + f1Var + " for " + this, th2);
                    }
                }
            }
        }
        if (d1Var != null) {
            D(d1Var);
        }
        o(th);
    }

    public final void R(f1 f1Var) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        m1 m1Var = new m1();
        f1Var.getClass();
        wc.k.f9940b.lazySet(m1Var, f1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = wc.k.f9939a;
        atomicReferenceFieldUpdater2.lazySet(m1Var, f1Var);
        loop0: while (f1Var.i() == f1Var) {
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(f1Var, f1Var, m1Var)) {
                    m1Var.h(f1Var);
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(f1Var) == f1Var);
        }
        wc.k kVarJ = f1Var.j();
        do {
            atomicReferenceFieldUpdater = f8300a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, f1Var, kVarJ)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == f1Var);
    }

    public final int S(Object obj) {
        boolean z4 = obj instanceof p0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8300a;
        if (z4) {
            if (((p0) obj).f8306a) {
                return 0;
            }
            p0 p0Var = b0.f8258j;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, p0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            return 1;
        }
        if (!(obj instanceof x0)) {
            return 0;
        }
        m1 m1Var = ((x0) obj).f8334a;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, m1Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        return 1;
    }

    public final Object U(Object obj, Object obj2) {
        if (!(obj instanceof y0)) {
            return b0.f8255d;
        }
        if (((obj instanceof p0) || (obj instanceof f1)) && !(obj instanceof o) && !(obj2 instanceof s)) {
            y0 y0Var = (y0) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8300a;
            Object z0Var = obj2 instanceof y0 ? new z0((y0) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, y0Var, z0Var)) {
                if (atomicReferenceFieldUpdater.get(this) != y0Var) {
                    return b0.f8256f;
                }
            }
            P(obj2);
            r(y0Var, obj2);
            return obj2;
        }
        y0 y0Var2 = (y0) obj;
        m1 m1VarZ = z(y0Var2);
        if (m1VarZ == null) {
            return b0.f8256f;
        }
        o oVarN = null;
        i1 i1Var = y0Var2 instanceof i1 ? (i1) y0Var2 : null;
        if (i1Var == null) {
            i1Var = new i1(m1VarZ, null);
        }
        synchronized (i1Var) {
            if (i1Var.f()) {
                return b0.f8255d;
            }
            i1.f8281b.set(i1Var, 1);
            if (i1Var != y0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8300a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, y0Var2, i1Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != y0Var2) {
                        return b0.f8256f;
                    }
                }
            }
            boolean zD = i1Var.d();
            s sVar = obj2 instanceof s ? (s) obj2 : null;
            if (sVar != null) {
                i1Var.a(sVar.f8315a);
            }
            Throwable thB = i1Var.b();
            if (zD) {
                thB = null;
            }
            if (thB != null) {
                O(m1VarZ, thB);
            }
            o oVar = y0Var2 instanceof o ? (o) y0Var2 : null;
            if (oVar == null) {
                m1 m1VarE = y0Var2.e();
                if (m1VarE != null) {
                    oVarN = N(m1VarE);
                }
            } else {
                oVarN = oVar;
            }
            if (oVarN != null) {
                while (oVarN.e.I((2 & 1) == 0, (2 & 2) != 0, new h1(this, i1Var, oVarN, obj2)) == n1.f8304a) {
                    oVarN = N(oVarN);
                    if (oVarN == null) {
                    }
                }
                return b0.e;
            }
            return t(i1Var, obj2);
        }
    }

    @Override // rc.b1
    public boolean c() {
        Object objA = A();
        return (objA instanceof y0) && ((y0) objA).c();
    }

    @Override // rc.b1
    public void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new c1(p(), null, this);
        }
        n(cancellationException);
    }

    public Object g() {
        return v();
    }

    @Override // yb.g
    public final yb.h getKey() {
        return y.f8337b;
    }

    public final boolean j(y0 y0Var, m1 m1Var, f1 f1Var) {
        wc.k kVarG;
        j1 j1Var = new j1(f1Var, this, y0Var);
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wc.k.f9940b;
            kVarG = m1Var.g();
            if (kVarG == null) {
                Object obj = atomicReferenceFieldUpdater.get(m1Var);
                while (true) {
                    kVarG = (wc.k) obj;
                    if (!kVarG.k()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(kVarG);
                }
            }
            wc.k.f9940b.lazySet(f1Var, kVarG);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = wc.k.f9939a;
            atomicReferenceFieldUpdater2.lazySet(f1Var, m1Var);
            j1Var.f8286c = m1Var;
            do {
                if (atomicReferenceFieldUpdater2.compareAndSet(kVarG, m1Var, j1Var)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater2.get(kVarG) == m1Var);
        }
        return j1Var.a(kVarG) == null;
    }

    public void l(Object obj) {
        k(obj);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003a A[PHI: r0
      0x003a: PHI (r0v1 java.lang.Object) = (r0v0 java.lang.Object), (r0v12 java.lang.Object) binds: [B:3:0x0008, B:16:0x0036] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x003e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:29:0x005b A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {, blocks: (B:24:0x0049, B:29:0x005b, B:34:0x0063, B:36:0x006c, B:37:0x0070), top: B:81:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[Catch: all -> 0x0061, TRY_ENTER, TryCatch #0 {, blocks: (B:24:0x0049, B:29:0x005b, B:34:0x0063, B:36:0x006c, B:37:0x0070), top: B:81:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x006c A[Catch: all -> 0x0061, TryCatch #0 {, blocks: (B:24:0x0049, B:29:0x005b, B:34:0x0063, B:36:0x006c, B:37:0x0070), top: B:81:0x0049 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:46:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x0101 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:79:0x0102  */
    /* JADX WARN: Code duplicated, block: B:81:0x0049 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x00c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:88:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:0x00a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0040 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:? A[LOOP:2: B:56:0x00b0->B:98:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:20:0x003e, please report this as an issue */
    public final boolean m(Object obj) {
        Throwable thS;
        Object objA;
        boolean z4;
        Throwable thB;
        i6.e eVar;
        y0 y0Var;
        m1 m1VarZ;
        i1 i1Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        Object objU;
        Object objU2 = b0.f8255d;
        if (y()) {
            do {
                Object objA2 = A();
                if (!(objA2 instanceof y0) || ((objA2 instanceof i1) && ((i1) objA2).f())) {
                    objU2 = b0.f8255d;
                    break;
                }
                objU2 = U(objA2, new s(false, s(obj)));
            } while (objU2 == b0.f8256f);
            if (objU2 != b0.e) {
                if (objU2 == b0.f8255d) {
                    thS = null;
                    loop1: while (true) {
                        objA = A();
                        if (objA instanceof i1) {
                            synchronized (objA) {
                                if (i1.f8283d.get((i1) objA) == b0.h) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z4) {
                                    eVar = b0.f8257g;
                                } else {
                                    boolean zD = ((i1) objA).d();
                                    if (thS == null) {
                                        thS = s(obj);
                                    }
                                    ((i1) objA).a(thS);
                                    thB = zD ? null : ((i1) objA).b();
                                    if (thB != null) {
                                        O(((i1) objA).f8284a, thB);
                                    }
                                    eVar = b0.f8255d;
                                }
                            }
                        } else if (objA instanceof y0) {
                            if (thS == null) {
                                thS = s(obj);
                            }
                            y0Var = (y0) objA;
                            if (y0Var.c()) {
                                m1VarZ = z(y0Var);
                                if (m1VarZ == null) {
                                    continue;
                                } else {
                                    i1Var = new i1(m1VarZ, thS);
                                    atomicReferenceFieldUpdater = f8300a;
                                    while (true) {
                                        if (atomicReferenceFieldUpdater.compareAndSet(this, y0Var, i1Var)) {
                                            O(m1VarZ, thS);
                                            eVar = b0.f8255d;
                                        } else if (atomicReferenceFieldUpdater.get(this) != y0Var) {
                                        }
                                    }
                                }
                            } else {
                                objU = U(objA, new s(false, thS));
                                if (objU != b0.f8255d) {
                                    throw new IllegalStateException(("Cannot happen in " + objA).toString());
                                }
                                if (objU != b0.f8256f) {
                                    objU2 = objU;
                                    break;
                                }
                            }
                        } else {
                            eVar = b0.f8257g;
                        }
                        objU2 = eVar;
                        break;
                    }
                }
                if (objU2 != b0.f8255d && objU2 != b0.e) {
                    if (objU2 == b0.f8257g) {
                        return false;
                    }
                    k(objU2);
                    return true;
                }
            }
        } else {
            if (objU2 == b0.f8255d) {
                thS = null;
                loop1: while (true) {
                    objA = A();
                    if (objA instanceof i1) {
                        synchronized (objA) {
                            if (i1.f8283d.get((i1) objA) == b0.h) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (z4) {
                                eVar = b0.f8257g;
                            } else {
                                boolean zD2 = ((i1) objA).d();
                                if (thS == null) {
                                    thS = s(obj);
                                }
                                ((i1) objA).a(thS);
                                if (zD2) {
                                }
                                if (thB != null) {
                                    O(((i1) objA).f8284a, thB);
                                }
                                eVar = b0.f8255d;
                            }
                        }
                    } else if (objA instanceof y0) {
                        if (thS == null) {
                            thS = s(obj);
                        }
                        y0Var = (y0) objA;
                        if (y0Var.c()) {
                            m1VarZ = z(y0Var);
                            if (m1VarZ == null) {
                                continue;
                            } else {
                                i1Var = new i1(m1VarZ, thS);
                                atomicReferenceFieldUpdater = f8300a;
                                while (true) {
                                    if (atomicReferenceFieldUpdater.compareAndSet(this, y0Var, i1Var)) {
                                        O(m1VarZ, thS);
                                        eVar = b0.f8255d;
                                    } else if (atomicReferenceFieldUpdater.get(this) != y0Var) {
                                    }
                                }
                            }
                        } else {
                            objU = U(objA, new s(false, thS));
                            if (objU != b0.f8255d) {
                                throw new IllegalStateException(("Cannot happen in " + objA).toString());
                            }
                            if (objU != b0.f8256f) {
                                objU2 = objU;
                                break;
                            }
                        }
                    } else {
                        eVar = b0.f8257g;
                    }
                    objU2 = eVar;
                    break;
                }
            }
            if (objU2 != b0.f8255d) {
                if (objU2 == b0.f8257g) {
                    return false;
                }
                k(objU2);
                return true;
            }
        }
        return true;
    }

    public void n(CancellationException cancellationException) {
        m(cancellationException);
    }

    public final boolean o(Throwable th) {
        if (J()) {
            return true;
        }
        boolean z4 = th instanceof CancellationException;
        n nVar = (n) f8301b.get(this);
        if (nVar == null || nVar == n1.f8304a) {
            return z4;
        }
        return nVar.d(th) || z4;
    }

    public String p() {
        return "Job was cancelled";
    }

    public boolean q(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return m(th) && x();
    }

    public final void r(y0 y0Var, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8301b;
        n nVar = (n) atomicReferenceFieldUpdater.get(this);
        if (nVar != null) {
            nVar.f();
            atomicReferenceFieldUpdater.set(this, n1.f8304a);
        }
        androidx.datastore.preferences.protobuf.d1 d1Var = null;
        s sVar = obj instanceof s ? (s) obj : null;
        Throwable th = sVar != null ? sVar.f8315a : null;
        if (y0Var instanceof f1) {
            try {
                ((f1) y0Var).m(th);
                return;
            } catch (Throwable th2) {
                D(new androidx.datastore.preferences.protobuf.d1("Exception in completion handler " + y0Var + " for " + this, th2));
                return;
            }
        }
        m1 m1VarE = y0Var.e();
        if (m1VarE != null) {
            Object objI = m1VarE.i();
            jc.i.c(objI, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }");
            for (wc.k kVarJ = (wc.k) objI; !kVarJ.equals(m1VarE); kVarJ = kVarJ.j()) {
                if (kVarJ instanceof f1) {
                    f1 f1Var = (f1) kVarJ;
                    try {
                        f1Var.m(th);
                    } catch (Throwable th3) {
                        if (d1Var != null) {
                            p3.a.a(d1Var, th3);
                        } else {
                            d1Var = new androidx.datastore.preferences.protobuf.d1("Exception in completion handler " + f1Var + " for " + this, th3);
                        }
                    }
                }
            }
            if (d1Var != null) {
                D(d1Var);
            }
        }
    }

    public final Throwable s(Object obj) {
        Throwable thB;
        if (obj instanceof Throwable) {
            return (Throwable) obj;
        }
        l1 l1Var = (l1) ((p1) obj);
        Object objA = l1Var.A();
        if (objA instanceof i1) {
            thB = ((i1) objA).b();
        } else if (objA instanceof s) {
            thB = ((s) objA).f8315a;
        } else {
            if (objA instanceof y0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objA).toString());
            }
            thB = null;
        }
        CancellationException cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        return cancellationException == null ? new c1("Parent job is ".concat(T(objA)), thB, l1Var) : cancellationException;
    }

    public final Object t(i1 i1Var, Object obj) {
        Throwable thW;
        s sVar = obj instanceof s ? (s) obj : null;
        Throwable th = sVar != null ? sVar.f8315a : null;
        synchronized (i1Var) {
            i1Var.d();
            ArrayList arrayListG = i1Var.g(th);
            thW = w(i1Var, arrayListG);
            if (thW != null && arrayListG.size() > 1) {
                Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(arrayListG.size()));
                int size = arrayListG.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayListG.get(i);
                    i++;
                    Throwable th2 = (Throwable) obj2;
                    if (th2 != thW && th2 != thW && !(th2 instanceof CancellationException) && setNewSetFromMap.add(th2)) {
                        p3.a.a(thW, th2);
                    }
                }
            }
        }
        if (thW != null && thW != th) {
            obj = new s(false, thW);
        }
        if (thW != null && (o(thW) || C(thW))) {
            jc.i.c(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            s.f8314b.compareAndSet((s) obj, 0, 1);
        }
        P(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8300a;
        Object z0Var = obj instanceof y0 ? new z0((y0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, i1Var, z0Var) && atomicReferenceFieldUpdater.get(this) == i1Var) {
        }
        r(i1Var, obj);
        return obj;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(M() + '{' + T(A()) + '}');
        sb2.append('@');
        sb2.append(b0.l(this));
        return sb2.toString();
    }

    public final CancellationException u() {
        CancellationException cancellationException;
        Object objA = A();
        if (!(objA instanceof i1)) {
            if (objA instanceof y0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(objA instanceof s)) {
                return new c1(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((s) objA).f8315a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new c1(p(), th, this) : cancellationException;
        }
        Throwable thB = ((i1) objA).b();
        if (thB == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String strConcat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = thB instanceof CancellationException ? (CancellationException) thB : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (strConcat == null) {
            strConcat = p();
        }
        return new c1(strConcat, thB, this);
    }

    public final Object v() throws Throwable {
        Object objA = A();
        if (objA instanceof y0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objA instanceof s) {
            throw ((s) objA).f8315a;
        }
        return b0.w(objA);
    }

    public final Throwable w(i1 i1Var, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (i1Var.d()) {
                return new c1(p(), null, this);
            }
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        int i10 = 0;
        do {
            if (i10 >= size) {
                obj = null;
                break;
            }
            obj = arrayList.get(i10);
            i10++;
        } while (((Throwable) obj) instanceof CancellationException);
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof t1) {
            int size2 = arrayList.size();
            while (i < size2) {
                Object obj3 = arrayList.get(i);
                i++;
                Throwable th3 = (Throwable) obj3;
                if (th3 != th2 && (th3 instanceof t1)) {
                    obj2 = obj3;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean x() {
        return true;
    }

    public boolean y() {
        return this instanceof q;
    }

    public final m1 z(y0 y0Var) {
        m1 m1VarE = y0Var.e();
        if (m1VarE != null) {
            return m1VarE;
        }
        if (y0Var instanceof p0) {
            return new m1();
        }
        if (y0Var instanceof f1) {
            R((f1) y0Var);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + y0Var).toString());
    }

    public void Q() {
    }

    public void D(androidx.datastore.preferences.protobuf.d1 d1Var) {
        throw d1Var;
    }

    public void P(Object obj) {
    }

    public void k(Object obj) {
    }
}

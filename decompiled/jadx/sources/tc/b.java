package tc;

import da.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rc.b0;
import rc.y1;
import wc.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8678b = AtomicLongFieldUpdater.newUpdater(b.class, "sendersAndCloseStatus");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8679c = AtomicLongFieldUpdater.newUpdater(b.class, "receivers");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f8680d = AtomicLongFieldUpdater.newUpdater(b.class, "bufferEnd");
    public static final AtomicLongFieldUpdater e = AtomicLongFieldUpdater.newUpdater(b.class, "completedExpandBuffersAndPauseFlag");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8681f = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "sendSegment");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8682r = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "receiveSegment");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8683s = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "bufferEndSegment");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8684t = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "_closeCause");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8685u = AtomicReferenceFieldUpdater.newUpdater(b.class, Object.class, "closeHandler");
    private volatile Object _closeCause;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8686a;
    private volatile long bufferEnd;
    private volatile Object bufferEndSegment;
    private volatile Object closeHandler;
    private volatile long completedExpandBuffersAndPauseFlag;
    private volatile Object receiveSegment;
    private volatile long receivers;
    private volatile Object sendSegment;
    private volatile long sendersAndCloseStatus;

    public b(int i) {
        this.f8686a = i;
        if (i < 0) {
            throw new IllegalArgumentException(q1.a.j(i, "Invalid channel capacity: ", ", should be >=0").toString());
        }
        j jVar = d.f8688a;
        this.bufferEnd = i != 0 ? i != Integer.MAX_VALUE ? i : Long.MAX_VALUE : 0L;
        this.completedExpandBuffersAndPauseFlag = f8680d.get(this);
        j jVar2 = new j(0L, null, this, 3);
        this.sendSegment = jVar2;
        this.receiveSegment = jVar2;
        if (u()) {
            jVar2 = d.f8688a;
            jc.i.c(jVar2, "null cannot be cast to non-null type kotlinx.coroutines.channels.ChannelSegment<E of kotlinx.coroutines.channels.BufferedChannel>");
        }
        this.bufferEndSegment = jVar2;
        this._closeCause = d.f8703s;
    }

    public static final j b(b bVar, long j4, j jVar) {
        Object objB;
        b bVar2;
        j jVar2 = d.f8688a;
        c cVar = c.f8687t;
        loop0: while (true) {
            objB = wc.a.b(jVar, j4, cVar);
            if (!wc.a.e(objB)) {
                t tVarC = wc.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8681f;
                    t tVar = (t) atomicReferenceFieldUpdater.get(bVar);
                    if (tVar.f9954c >= tVarC.f9954c) {
                        break loop0;
                    }
                    if (!tVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(bVar, tVar, tVarC)) {
                            if (!tVar.e()) {
                                break loop0;
                            }
                            tVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(bVar) == tVar);
                    if (tVarC.e()) {
                        tVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        boolean zE = wc.a.e(objB);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8679c;
        if (zE) {
            bVar.j();
            if (jVar.f9954c * ((long) d.f8689b) < atomicLongFieldUpdater.get(bVar)) {
                jVar.a();
                return null;
            }
        } else {
            j jVar3 = (j) wc.a.c(objB);
            long j10 = jVar3.f9954c;
            if (j10 <= j4) {
                return jVar3;
            }
            long j11 = ((long) d.f8689b) * j10;
            while (true) {
                long j12 = f8678b.get(bVar);
                long j13 = 1152921504606846975L & j12;
                if (j13 >= j11) {
                    bVar2 = bVar;
                    break;
                }
                bVar2 = bVar;
                if (f8678b.compareAndSet(bVar2, j12, (((long) ((int) (j12 >> 60))) << 60) + j13)) {
                    break;
                }
                bVar = bVar2;
            }
            if (j10 * ((long) d.f8689b) < atomicLongFieldUpdater.get(bVar2)) {
                jVar3.a();
            }
        }
        return null;
    }

    public static final void c(b bVar, Object obj, rc.k kVar) {
        kVar.resumeWith(r7.g.m(bVar.p()));
    }

    public static final int e(b bVar, j jVar, int i, Object obj, long j4, Object obj2, boolean z4) {
        jVar.m(i, obj);
        if (z4) {
            return bVar.B(jVar, i, obj, j4, obj2, z4);
        }
        Object objK = jVar.k(i);
        if (objK == null) {
            if (bVar.f(j4)) {
                if (jVar.j(i, null, d.f8691d)) {
                    return 1;
                }
            } else {
                if (obj2 == null) {
                    return 3;
                }
                if (jVar.j(i, null, obj2)) {
                    return 2;
                }
            }
        } else if (objK instanceof y1) {
            jVar.m(i, null);
            if (bVar.y(objK, obj)) {
                jVar.n(i, d.i);
                return 0;
            }
            i6.e eVar = d.f8695k;
            if (jVar.f8709f.getAndSet((i * 2) + 1, eVar) == eVar) {
                return 5;
            }
            jVar.l(i, true);
            return 5;
        }
        return bVar.B(jVar, i, obj, j4, obj2, z4);
    }

    public static void r(b bVar) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = e;
        if ((atomicLongFieldUpdater.addAndGet(bVar, 1L) & 4611686018427387904L) != 0) {
            while ((atomicLongFieldUpdater.get(bVar) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static boolean z(Object obj) {
        if (!(obj instanceof rc.j)) {
            throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
        }
        rc.j jVar = (rc.j) obj;
        j jVar2 = d.f8688a;
        i6.e eVarE = jVar.e(ub.k.f9073a, null);
        if (eVarE == null) {
            return false;
        }
        jVar.i(eVarE);
        return true;
    }

    public final Object A(j jVar, int i, long j4, Object obj) {
        AtomicReferenceArray atomicReferenceArray = jVar.f8709f;
        Object objK = jVar.k(i);
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8678b;
        if (objK == null) {
            if (j4 >= (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return d.f8698n;
                }
                if (jVar.j(i, objK, obj)) {
                    l();
                    return d.f8697m;
                }
            }
        } else if (objK == d.f8691d && jVar.j(i, objK, d.i)) {
            l();
            Object obj2 = atomicReferenceArray.get(i * 2);
            jVar.m(i, null);
            return obj2;
        }
        while (true) {
            Object objK2 = jVar.k(i);
            if (objK2 == null || objK2 == d.e) {
                if (j4 < (atomicLongFieldUpdater.get(this) & 1152921504606846975L)) {
                    if (jVar.j(i, objK2, d.h)) {
                        l();
                        return d.f8699o;
                    }
                } else {
                    if (obj == null) {
                        return d.f8698n;
                    }
                    if (jVar.j(i, objK2, obj)) {
                        l();
                        return d.f8697m;
                    }
                }
            } else if (objK2 != d.f8691d) {
                i6.e eVar = d.f8694j;
                if (objK2 == eVar) {
                    return d.f8699o;
                }
                if (objK2 == d.h) {
                    return d.f8699o;
                }
                if (objK2 == d.f8696l) {
                    l();
                    return d.f8699o;
                }
                if (objK2 != d.f8693g && jVar.j(i, objK2, d.f8692f)) {
                    boolean z4 = objK2 instanceof r;
                    if (z4) {
                        objK2 = ((r) objK2).f8712a;
                    }
                    if (z(objK2)) {
                        jVar.n(i, d.i);
                        l();
                        Object obj3 = atomicReferenceArray.get(i * 2);
                        jVar.m(i, null);
                        return obj3;
                    }
                    jVar.n(i, eVar);
                    jVar.h();
                    if (z4) {
                        l();
                    }
                    return d.f8699o;
                }
            } else if (jVar.j(i, objK2, d.i)) {
                l();
                Object obj4 = atomicReferenceArray.get(i * 2);
                jVar.m(i, null);
                return obj4;
            }
        }
    }

    public final int B(j jVar, int i, Object obj, long j4, Object obj2, boolean z4) {
        while (true) {
            Object objK = jVar.k(i);
            if (objK == null) {
                if (!f(j4) || z4) {
                    if (z4) {
                        if (jVar.j(i, null, d.f8694j)) {
                            jVar.h();
                            return 4;
                        }
                    } else {
                        if (obj2 == null) {
                            return 3;
                        }
                        if (jVar.j(i, null, obj2)) {
                            return 2;
                        }
                    }
                } else if (jVar.j(i, null, d.f8691d)) {
                    break;
                }
            } else {
                if (objK != d.e) {
                    i6.e eVar = d.f8695k;
                    if (objK == eVar) {
                        jVar.m(i, null);
                        return 5;
                    }
                    if (objK == d.h) {
                        jVar.m(i, null);
                        return 5;
                    }
                    if (objK == d.f8696l) {
                        jVar.m(i, null);
                        j();
                        return 4;
                    }
                    jVar.m(i, null);
                    if (objK instanceof r) {
                        objK = ((r) objK).f8712a;
                    }
                    if (y(objK, obj)) {
                        jVar.n(i, d.i);
                        return 0;
                    }
                    if (jVar.f8709f.getAndSet((i * 2) + 1, eVar) != eVar) {
                        jVar.l(i, true);
                    }
                    return 5;
                }
                if (jVar.j(i, objK, d.f8691d)) {
                    break;
                }
            }
        }
        return 1;
    }

    public final void C(long j4) {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        b bVar = this;
        if (bVar.u()) {
            return;
        }
        while (true) {
            atomicLongFieldUpdater = f8680d;
            if (atomicLongFieldUpdater.get(bVar) > j4) {
                break;
            } else {
                bVar = this;
            }
        }
        int i = d.f8690c;
        int i10 = 0;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = e;
            if (i10 < i) {
                long j10 = atomicLongFieldUpdater.get(bVar);
                if (j10 == (4611686018427387903L & atomicLongFieldUpdater2.get(bVar)) && j10 == atomicLongFieldUpdater.get(bVar)) {
                    return;
                } else {
                    i10++;
                }
            } else {
                while (true) {
                    long j11 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j11, (j11 & 4611686018427387903L) + 4611686018427387904L)) {
                        break;
                    } else {
                        bVar = this;
                    }
                }
                while (true) {
                    long j12 = atomicLongFieldUpdater.get(bVar);
                    long j13 = atomicLongFieldUpdater2.get(bVar);
                    long j14 = j13 & 4611686018427387903L;
                    boolean z4 = (j13 & 4611686018427387904L) != 0;
                    if (j12 == j14 && j12 == atomicLongFieldUpdater.get(bVar)) {
                        break;
                    }
                    if (z4) {
                        bVar = this;
                    } else {
                        bVar = this;
                        atomicLongFieldUpdater2.compareAndSet(bVar, j13, 4611686018427387904L + j14);
                    }
                }
                while (true) {
                    long j15 = atomicLongFieldUpdater2.get(bVar);
                    if (atomicLongFieldUpdater2.compareAndSet(bVar, j15, j15 & 4611686018427387903L)) {
                        return;
                    } else {
                        bVar = this;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0068  */
    /* JADX WARN: Code duplicated, block: B:24:0x006b  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074  */
    /* JADX WARN: Code duplicated, block: B:33:0x0078  */
    /* JADX WARN: Code duplicated, block: B:37:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x009e  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00af  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:57:0x00be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x009c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x007d A[SYNTHETIC] */
    @Override // tc.q
    public Object a(Object obj) {
        int iE;
        ub.k kVar;
        y1 y1Var;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8678b;
        long j4 = atomicLongFieldUpdater.get(this);
        boolean z4 = false;
        long j10 = 1152921504606846975L;
        boolean z10 = s(j4, false) ? false : !f(j4 & 1152921504606846975L);
        h hVar = i.f8708a;
        if (z10) {
            return hVar;
        }
        i6.f fVar = d.f8694j;
        j jVar = (j) f8681f.get(this);
        while (true) {
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(this);
            long j11 = andIncrement & j10;
            boolean zS = s(andIncrement, z4);
            int i = d.f8689b;
            long j12 = i;
            long j13 = j11 / j12;
            int i10 = (int) (j11 % j12);
            if (jVar.f9954c == j13) {
                iE = e(this, jVar, i10, obj, j11, fVar, zS);
                kVar = ub.k.f9073a;
                if (iE != 0) {
                    jVar.a();
                    return kVar;
                }
                if (iE != 1) {
                    return kVar;
                }
                if (iE != 2) {
                    if (zS) {
                        jVar.h();
                        return new g(p());
                    }
                    if (fVar instanceof y1) {
                        y1Var = (y1) fVar;
                    } else {
                        y1Var = null;
                    }
                    if (y1Var != null) {
                        y1Var.a(jVar, i10 + i);
                    }
                    jVar.h();
                    return hVar;
                }
                if (iE != 3) {
                    throw new IllegalStateException("unexpected");
                }
                if (iE != 4) {
                    if (j11 < f8679c.get(this)) {
                        jVar.a();
                    }
                    return new g(p());
                }
                if (iE == 5) {
                    jVar.a();
                }
                z4 = false;
            } else {
                j jVarB = b(this, j13, jVar);
                if (jVarB != null) {
                    jVar = jVarB;
                    iE = e(this, jVar, i10, obj, j11, fVar, zS);
                    kVar = ub.k.f9073a;
                    if (iE != 0) {
                        jVar.a();
                        return kVar;
                    }
                    if (iE != 1) {
                        return kVar;
                    }
                    if (iE != 2) {
                        if (zS) {
                            jVar.h();
                            return new g(p());
                        }
                        if (fVar instanceof y1) {
                            y1Var = (y1) fVar;
                        } else {
                            y1Var = null;
                        }
                        if (y1Var != null) {
                            y1Var.a(jVar, i10 + i);
                        }
                        jVar.h();
                        return hVar;
                    }
                    if (iE != 3) {
                        throw new IllegalStateException("unexpected");
                    }
                    if (iE != 4) {
                        if (j11 < f8679c.get(this)) {
                            jVar.a();
                        }
                        return new g(p());
                    }
                    if (iE == 5) {
                        jVar.a();
                    }
                    z4 = false;
                } else {
                    if (zS) {
                        return new g(p());
                    }
                    z4 = false;
                }
            }
            j10 = 1152921504606846975L;
        }
    }

    @Override // tc.p
    public final void d(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new CancellationException("Channel was cancelled");
        }
        g(true, cancellationException);
    }

    public final boolean f(long j4) {
        return j4 < f8680d.get(this) || j4 < f8679c.get(this) + ((long) this.f8686a);
    }

    public final boolean g(boolean z4, Throwable th) {
        b bVar;
        boolean z10;
        long j4;
        long j10;
        long j11;
        Object obj;
        long j12;
        long j13;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f8678b;
        if (!z4) {
            bVar = this;
            break;
        }
        do {
            j13 = atomicLongFieldUpdater.get(this);
            if (((int) (j13 >> 60)) != 0) {
                bVar = this;
                break;
            }
            j jVar = d.f8688a;
            bVar = this;
        } while (!atomicLongFieldUpdater.compareAndSet(bVar, j13, (j13 & 1152921504606846975L) + (((long) 1) << 60)));
        i6.e eVar = d.f8703s;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8684t;
            if (atomicReferenceFieldUpdater.compareAndSet(this, eVar, th)) {
                z10 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != eVar) {
                z10 = false;
                break;
            }
        }
        if (z4) {
            do {
                j12 = atomicLongFieldUpdater.get(this);
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j12, (((long) 3) << 60) + (j12 & 1152921504606846975L)));
        } else {
            do {
                j4 = atomicLongFieldUpdater.get(this);
                int i = (int) (j4 >> 60);
                if (i == 0) {
                    j10 = j4 & 1152921504606846975L;
                    j11 = 2;
                } else {
                    if (i != 1) {
                        break;
                    }
                    j10 = j4 & 1152921504606846975L;
                    j11 = 3;
                }
            } while (!atomicLongFieldUpdater.compareAndSet(bVar, j4, (j11 << 60) + j10));
        }
        j();
        if (z10) {
            loop3: while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8685u;
                obj = atomicReferenceFieldUpdater2.get(this);
                i6.e eVar2 = obj == null ? d.f8701q : d.f8702r;
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, eVar2)) {
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == obj);
            }
            if (obj != null) {
                jc.t.a(1, obj);
                ((ic.l) obj).invoke(n());
                return z10;
            }
        }
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x0170  */
    /* JADX WARN: Code duplicated, block: B:94:0x0173 A[RETURN] */
    @Override // tc.q
    public Object h(Object obj, yb.d dVar) throws Throwable {
        ub.k kVar;
        Object objR;
        zb.a aVar;
        Object obj2;
        b bVar;
        j jVar;
        boolean z4;
        b bVar2 = this;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8681f;
        j jVar2 = (j) atomicReferenceFieldUpdater.get(bVar2);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8678b;
            long andIncrement = atomicLongFieldUpdater.getAndIncrement(bVar2);
            long j4 = andIncrement & 1152921504606846975L;
            boolean zS = bVar2.s(andIncrement, false);
            int i = d.f8689b;
            long j10 = i;
            long j11 = j4 / j10;
            int i10 = (int) (j4 % j10);
            long j12 = jVar2.f9954c;
            kVar = ub.k.f9073a;
            if (j12 != j11) {
                j jVarB = b(bVar2, j11, jVar2);
                if (jVarB != null) {
                    jVar2 = jVarB;
                } else if (zS) {
                    Object objW = w(obj, dVar);
                    if (objW != zb.a.f11555a) {
                        break;
                    }
                    return objW;
                }
            }
            int iE = e(bVar2, jVar2, i10, obj, j4, null, zS);
            if (iE == 0) {
                jVar2.a();
                return kVar;
            }
            if (iE == 1) {
                break;
            }
            if (iE != 2) {
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8679c;
                if (iE == 3) {
                    rc.k kVarM = b0.m(qd.b.r(dVar));
                    Object obj3 = obj;
                    try {
                        int iE2 = e(bVar2, jVar2, i10, obj3, j4, kVarM, false);
                        try {
                            if (iE2 != 0) {
                                if (iE2 == 1) {
                                    kVarM.resumeWith(kVar);
                                } else if (iE2 != 2) {
                                    if (iE2 != 4) {
                                        String str = "unexpected";
                                        if (iE2 != 5) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        jVar2.a();
                                        j jVar3 = (j) atomicReferenceFieldUpdater.get(bVar2);
                                        while (true) {
                                            long andIncrement2 = atomicLongFieldUpdater.getAndIncrement(bVar2);
                                            long j13 = andIncrement2 & 1152921504606846975L;
                                            boolean zS2 = bVar2.s(andIncrement2, false);
                                            int i11 = d.f8689b;
                                            atomicLongFieldUpdater = atomicLongFieldUpdater;
                                            long j14 = i11;
                                            str = str;
                                            long j15 = j13 / j14;
                                            int i12 = (int) (j13 % j14);
                                            atomicLongFieldUpdater2 = atomicLongFieldUpdater2;
                                            if (jVar3.f9954c != j15) {
                                                j jVarB2 = b(bVar2, j15, jVar3);
                                                if (jVarB2 != null) {
                                                    z4 = zS2;
                                                    jVar = jVarB2;
                                                } else if (zS2) {
                                                    c(bVar2, obj3, kVarM);
                                                    break;
                                                }
                                            } else {
                                                jVar = jVar3;
                                                z4 = zS2;
                                            }
                                            int iE3 = e(bVar2, jVar, i12, obj3, j13, kVarM, z4);
                                            Object obj4 = obj3;
                                            bVar = bVar2;
                                            j jVar4 = jVar;
                                            obj2 = obj4;
                                            if (iE3 == 0) {
                                                jVar4.a();
                                            } else if (iE3 != 1) {
                                                if (iE3 == 2) {
                                                    if (!z4) {
                                                        kVarM.a(jVar4, i12 + i11);
                                                        break;
                                                    }
                                                    jVar4.h();
                                                } else {
                                                    if (iE3 == 3) {
                                                        throw new IllegalStateException(str);
                                                    }
                                                    if (iE3 != 4) {
                                                        if (iE3 == 5) {
                                                            jVar4.a();
                                                        }
                                                        jVar3 = jVar4;
                                                        bVar2 = bVar;
                                                        obj3 = obj2;
                                                    } else if (j13 < atomicLongFieldUpdater2.get(bVar)) {
                                                        jVar4.a();
                                                    }
                                                }
                                            }
                                        }
                                        kVarM.z();
                                        throw th;
                                    }
                                    obj2 = obj3;
                                    bVar = bVar2;
                                    if (j4 < atomicLongFieldUpdater2.get(bVar)) {
                                        jVar2.a();
                                    }
                                    c(bVar, obj2, kVarM);
                                    break;
                                } else {
                                    kVarM.a(jVar2, i10 + i);
                                }
                                objR = kVarM.r();
                                aVar = zb.a.f11555a;
                                if (objR != aVar) {
                                    objR = kVar;
                                }
                                if (objR == aVar) {
                                    return objR;
                                }
                            } else {
                                jVar2.a();
                            }
                            kVarM.resumeWith(kVar);
                            objR = kVarM.r();
                            aVar = zb.a.f11555a;
                            if (objR != aVar) {
                                objR = kVar;
                            }
                            if (objR == aVar) {
                                return objR;
                            }
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } else {
                    if (iE == 4) {
                        if (j4 < atomicLongFieldUpdater2.get(bVar2)) {
                            jVar2.a();
                        }
                        Object objW2 = w(obj, dVar);
                        if (objW2 != zb.a.f11555a) {
                            break;
                        }
                        return objW2;
                    }
                    if (iE == 5) {
                        jVar2.a();
                    }
                }
            } else if (zS) {
                jVar2.h();
                Object objW3 = w(obj, dVar);
                if (objW3 == zb.a.f11555a) {
                    return objW3;
                }
            }
            return kVar;
        }
        return kVar;
    }

    public final j i(long j4) {
        Object objF;
        long j10;
        Object obj = f8683s.get(this);
        j jVar = (j) f8681f.get(this);
        if (jVar.f9954c > ((j) obj).f9954c) {
            obj = jVar;
        }
        j jVar2 = (j) f8682r.get(this);
        if (jVar2.f9954c > ((j) obj).f9954c) {
            obj = jVar2;
        }
        wc.d dVar = (wc.d) obj;
        loop0: while (true) {
            dVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = wc.d.f9925a;
            Object obj2 = atomicReferenceFieldUpdater.get(dVar);
            i6.e eVar = wc.a.f9915b;
            objF = null;
            if (obj2 == eVar) {
                break;
            }
            wc.d dVar2 = (wc.d) obj2;
            if (dVar2 == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(dVar, null, eVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(dVar) == null);
            } else {
                dVar = dVar2;
            }
        }
        j jVar3 = (j) dVar;
        if (t()) {
            j jVar4 = jVar3;
            loop2: while (true) {
                int i = d.f8689b - 1;
                while (true) {
                    if (-1 < i) {
                        j10 = (jVar4.f9954c * ((long) d.f8689b)) + ((long) i);
                        if (j10 >= f8679c.get(this)) {
                            while (true) {
                                Object objK = jVar4.k(i);
                                if (objK != null && objK != d.e) {
                                    if (objK != d.f8691d) {
                                        break;
                                    }
                                    break loop2;
                                }
                                if (jVar4.j(i, objK, d.f8696l)) {
                                    jVar4.h();
                                    break;
                                }
                            }
                            i--;
                        }
                    } else {
                        jVar4 = (j) ((wc.d) wc.d.f9926b.get(jVar4));
                        if (jVar4 == null) {
                        }
                    }
                    j10 = -1;
                    break;
                }
            }
            if (j10 != -1) {
                k(j10);
            }
        }
        loop5: for (j jVar5 = jVar3; jVar5 != null; jVar5 = (j) ((wc.d) wc.d.f9926b.get(jVar5))) {
            for (int i10 = d.f8689b - 1; -1 < i10; i10--) {
                if ((jVar5.f9954c * ((long) d.f8689b)) + ((long) i10) < j4) {
                    break loop5;
                }
                while (true) {
                    Object objK2 = jVar5.k(i10);
                    if (objK2 != null && objK2 != d.e) {
                        if (!(objK2 instanceof r)) {
                            if (!(objK2 instanceof y1)) {
                                break;
                            }
                            if (jVar5.j(i10, objK2, d.f8696l)) {
                                objF = wc.a.f(objF, objK2);
                                jVar5.l(i10, true);
                                break;
                            }
                        } else {
                            if (jVar5.j(i10, objK2, d.f8696l)) {
                                objF = wc.a.f(objF, ((r) objK2).f8712a);
                                jVar5.l(i10, true);
                                break;
                            }
                        }
                    } else {
                        if (jVar5.j(i10, objK2, d.f8696l)) {
                            jVar5.h();
                            break;
                        }
                    }
                }
            }
        }
        if (objF != null) {
            if (!(objF instanceof ArrayList)) {
                x((y1) objF, true);
                return jVar3;
            }
            ArrayList arrayList = (ArrayList) objF;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                x((y1) arrayList.get(size), true);
            }
        }
        return jVar3;
    }

    @Override // tc.p
    public final a iterator() {
        return new a(this);
    }

    public final void j() {
        s(f8678b.get(this), false);
    }

    public final void k(long j4) {
        j jVar = (j) f8682r.get(this);
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8679c;
            long j10 = atomicLongFieldUpdater.get(this);
            if (j4 < Math.max(((long) this.f8686a) + j10, f8680d.get(this))) {
                return;
            }
            if (atomicLongFieldUpdater.compareAndSet(this, j10, 1 + j10)) {
                long j11 = d.f8689b;
                long j12 = j10 / j11;
                int i = (int) (j10 % j11);
                if (jVar.f9954c != j12) {
                    j jVarM = m(j12, jVar);
                    if (jVarM != null) {
                        jVar = jVarM;
                    }
                }
                j jVar2 = jVar;
                if (A(jVar2, i, j10, null) != d.f8699o || j10 < q()) {
                    jVar2.a();
                }
                jVar = jVar2;
            }
        }
    }

    public final void l() {
        Object objB;
        if (u()) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8683s;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        while (true) {
            long andIncrement = f8680d.getAndIncrement(this);
            long j4 = andIncrement / ((long) d.f8689b);
            if (q() <= andIncrement) {
                if (jVar.f9954c < j4 && jVar.b() != null) {
                    v(j4, jVar);
                }
                r(this);
                return;
            }
            if (jVar.f9954c != j4) {
                c cVar = c.f8687t;
                while (true) {
                    objB = wc.a.b(jVar, j4, cVar);
                    if (!wc.a.e(objB)) {
                        t tVarC = wc.a.c(objB);
                        while (true) {
                            t tVar = (t) atomicReferenceFieldUpdater.get(this);
                            if (tVar.f9954c >= tVarC.f9954c) {
                                break;
                            }
                            if (!tVarC.i()) {
                                break;
                            }
                            do {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarC)) {
                                    if (!tVar.e()) {
                                        break;
                                    }
                                    tVar.d();
                                    break;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == tVar);
                            if (tVarC.e()) {
                                tVarC.d();
                            }
                        }
                    } else {
                        break;
                    }
                }
                j jVar2 = null;
                if (wc.a.e(objB)) {
                    j();
                    v(j4, jVar);
                    r(this);
                } else {
                    j jVar3 = (j) wc.a.c(objB);
                    long j10 = jVar3.f9954c;
                    if (j10 > j4) {
                        long j11 = j10 * ((long) d.f8689b);
                        if (f8680d.compareAndSet(this, 1 + andIncrement, j11)) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater = e;
                            if ((atomicLongFieldUpdater.addAndGet(this, j11 - andIncrement) & 4611686018427387904L) != 0) {
                                while ((atomicLongFieldUpdater.get(this) & 4611686018427387904L) != 0) {
                                }
                            }
                        } else {
                            r(this);
                        }
                    } else {
                        jVar2 = jVar3;
                    }
                }
                if (jVar2 == null) {
                    continue;
                } else {
                    jVar = jVar2;
                }
            }
            int i = (int) (andIncrement % ((long) d.f8689b));
            Object objK = jVar.k(i);
            boolean z4 = objK instanceof y1;
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = f8679c;
            if (!z4 || andIncrement < atomicLongFieldUpdater2.get(this) || !jVar.j(i, objK, d.f8693g)) {
                while (true) {
                    Object objK2 = jVar.k(i);
                    if (objK2 instanceof y1) {
                        if (andIncrement < atomicLongFieldUpdater2.get(this)) {
                            if (jVar.j(i, objK2, new r((y1) objK2))) {
                                r(this);
                                return;
                            }
                        } else if (jVar.j(i, objK2, d.f8693g)) {
                            if (!z(objK2)) {
                                jVar.n(i, d.f8694j);
                                jVar.h();
                                break;
                            } else {
                                jVar.n(i, d.f8691d);
                                r(this);
                                return;
                            }
                        }
                    } else {
                        if (objK2 == d.f8694j) {
                            break;
                        }
                        if (objK2 == null) {
                            if (jVar.j(i, objK2, d.e)) {
                                r(this);
                                return;
                            }
                        } else if (objK2 == d.f8691d || objK2 == d.h || objK2 == d.i || objK2 == d.f8695k || objK2 == d.f8696l) {
                            r(this);
                            return;
                        } else if (objK2 != d.f8692f) {
                            throw new IllegalStateException(("Unexpected cell state: " + objK2).toString());
                        }
                    }
                }
                r(this);
            } else if (z(objK)) {
                jVar.n(i, d.f8691d);
                r(this);
                return;
            } else {
                jVar.n(i, d.f8694j);
                jVar.h();
                r(this);
            }
        }
    }

    public final j m(long j4, j jVar) {
        Object objB;
        long j10;
        j jVar2 = d.f8688a;
        c cVar = c.f8687t;
        loop0: while (true) {
            objB = wc.a.b(jVar, j4, cVar);
            if (!wc.a.e(objB)) {
                t tVarC = wc.a.c(objB);
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8682r;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f9954c >= tVarC.f9954c) {
                        break loop0;
                    }
                    if (!tVarC.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, tVarC)) {
                            if (!tVar.e()) {
                                break loop0;
                            }
                            tVar.d();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == tVar);
                    if (tVarC.e()) {
                        tVarC.d();
                    }
                }
            } else {
                break;
            }
        }
        if (wc.a.e(objB)) {
            j();
            if (jVar.f9954c * ((long) d.f8689b) < q()) {
                jVar.a();
                return null;
            }
        } else {
            j jVar3 = (j) wc.a.c(objB);
            long j11 = jVar3.f9954c;
            if (!u() && j4 <= f8680d.get(this) / ((long) d.f8689b)) {
                loop3: while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f8683s;
                    t tVar2 = (t) atomicReferenceFieldUpdater2.get(this);
                    if (tVar2.f9954c >= j11 || !jVar3.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater2.compareAndSet(this, tVar2, jVar3)) {
                            if (!tVar2.e()) {
                                break loop3;
                            }
                            tVar2.d();
                            break loop3;
                        }
                    } while (atomicReferenceFieldUpdater2.get(this) == tVar2);
                    if (jVar3.e()) {
                        jVar3.d();
                    }
                }
            }
            if (j11 <= j4) {
                return jVar3;
            }
            long j12 = j11 * ((long) d.f8689b);
            do {
                j10 = f8679c.get(this);
                if (j10 >= j12) {
                    break;
                }
            } while (!f8679c.compareAndSet(this, j10, j12));
            if (j11 * ((long) d.f8689b) < q()) {
                jVar3.a();
            }
        }
        return null;
    }

    public final Throwable n() {
        return (Throwable) f8684t.get(this);
    }

    public final Throwable o() {
        Throwable thN = n();
        return thN == null ? new k("Channel was closed") : thN;
    }

    public final Throwable p() {
        Throwable thN = n();
        return thN == null ? new l("Channel was closed") : thN;
    }

    public final long q() {
        return f8678b.get(this) & 1152921504606846975L;
    }

    public final boolean s(long j4, boolean z4) {
        int i = (int) (j4 >> 60);
        if (i != 0 && i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f8679c;
            if (i == 2) {
                i(1152921504606846975L & j4);
                if (z4) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8682r;
                        j jVarM = (j) atomicReferenceFieldUpdater.get(this);
                        long j10 = atomicLongFieldUpdater.get(this);
                        if (q() <= j10) {
                            break;
                        }
                        long j11 = d.f8689b;
                        long j12 = j10 / j11;
                        if (jVarM.f9954c != j12 && (jVarM = m(j12, jVarM)) == null) {
                            if (((j) atomicReferenceFieldUpdater.get(this)).f9954c < j12) {
                                break;
                            }
                        } else {
                            jVarM.a();
                            int i10 = (int) (j10 % j11);
                            while (true) {
                                Object objK = jVarM.k(i10);
                                if (objK != null && objK != d.e) {
                                    if (objK != d.f8691d && (objK == d.f8694j || objK == d.f8696l || objK == d.i || objK == d.h || (objK != d.f8693g && (objK == d.f8692f || j10 != atomicLongFieldUpdater.get(this))))) {
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                        break;
                                    }
                                } else if (jVarM.j(i10, objK, d.h)) {
                                    l();
                                    break;
                                }
                            }
                            f8679c.compareAndSet(this, j10, j10 + 1);
                        }
                    }
                }
            } else {
                if (i != 3) {
                    throw new IllegalStateException(v.f(i, "unexpected close status: ").toString());
                }
                j jVarI = i(1152921504606846975L & j4);
                Object objF = null;
                loop0: do {
                    for (int i11 = d.f8689b - 1; -1 < i11; i11--) {
                        long j13 = (jVarI.f9954c * ((long) d.f8689b)) + ((long) i11);
                        while (true) {
                            Object objK2 = jVarI.k(i11);
                            if (objK2 == d.i) {
                                break loop0;
                            }
                            if (objK2 != d.f8691d) {
                                if (objK2 != d.e && objK2 != null) {
                                    if (!(objK2 instanceof y1) && !(objK2 instanceof r)) {
                                        i6.e eVar = d.f8693g;
                                        if (objK2 == eVar || objK2 == d.f8692f) {
                                            break loop0;
                                        }
                                        if (objK2 != eVar) {
                                            break;
                                        }
                                    } else {
                                        if (j13 < atomicLongFieldUpdater.get(this)) {
                                            break loop0;
                                        }
                                        y1 y1Var = objK2 instanceof r ? ((r) objK2).f8712a : (y1) objK2;
                                        if (jVarI.j(i11, objK2, d.f8696l)) {
                                            objF = wc.a.f(objF, y1Var);
                                            jVarI.m(i11, null);
                                            jVarI.h();
                                            break;
                                        }
                                    }
                                } else {
                                    if (jVarI.j(i11, objK2, d.f8696l)) {
                                        jVarI.h();
                                        break;
                                    }
                                }
                            } else {
                                if (j13 < atomicLongFieldUpdater.get(this)) {
                                    break loop0;
                                }
                                if (jVarI.j(i11, objK2, d.f8696l)) {
                                    jVarI.m(i11, null);
                                    jVarI.h();
                                    break;
                                }
                            }
                        }
                    }
                    jVarI = (j) ((wc.d) wc.d.f9926b.get(jVarI));
                } while (jVarI != null);
                if (objF != null) {
                    if (objF instanceof ArrayList) {
                        ArrayList arrayList = (ArrayList) objF;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            x((y1) arrayList.get(size), false);
                        }
                    } else {
                        x((y1) objF, false);
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean t() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String string;
        StringBuilder sb2 = new StringBuilder();
        int i = (int) (f8678b.get(this) >> 60);
        if (i == 2) {
            sb2.append("closed,");
        } else if (i == 3) {
            sb2.append("cancelled,");
        }
        sb2.append("capacity=" + this.f8686a + ',');
        sb2.append("data=[");
        int i10 = 0;
        boolean z4 = true;
        List listS = vb.j.S(f8682r.get(this), f8681f.get(this), f8683s.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (((j) obj) != d.f8688a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j4 = ((j) next).f9954c;
            do {
                Object next2 = it.next();
                long j10 = ((j) next2).f9954c;
                if (j4 > j10) {
                    next = next2;
                    j4 = j10;
                }
            } while (it.hasNext());
        }
        j jVar = (j) next;
        long j11 = f8679c.get(this);
        long jQ = q();
        loop2: while (true) {
            int i11 = d.f8689b;
            int i12 = i10;
            while (i12 < i11) {
                long j12 = (jVar.f9954c * ((long) d.f8689b)) + ((long) i12);
                if (j12 >= jQ && j12 >= j11) {
                    break loop2;
                }
                Object objK = jVar.k(i12);
                boolean z10 = z4;
                Object obj2 = jVar.f8709f.get(i12 * 2);
                if (objK instanceof rc.j) {
                    string = (j12 >= j11 || j12 < jQ) ? (j12 >= jQ || j12 < j11) ? "cont" : "send" : "receive";
                } else if (objK instanceof r) {
                    string = "EB(" + objK + ')';
                } else if (jc.i.a(objK, d.f8692f) ? z10 : jc.i.a(objK, d.f8693g)) {
                    string = "resuming_sender";
                } else {
                    if (!(objK == null ? z10 : objK.equals(d.e) ? z10 : jc.i.a(objK, d.i) ? z10 : jc.i.a(objK, d.h) ? z10 : jc.i.a(objK, d.f8695k) ? z10 : jc.i.a(objK, d.f8694j) ? z10 : jc.i.a(objK, d.f8696l))) {
                        string = objK.toString();
                    }
                    i12++;
                    z4 = z10;
                }
                if (obj2 != null) {
                    sb2.append("(" + string + ',' + obj2 + "),");
                } else {
                    sb2.append(string + ',');
                }
                i12++;
                z4 = z10;
            }
            boolean z11 = z4;
            jVar = (j) jVar.b();
            if (jVar == null) {
                break;
            }
            z4 = z11;
            i10 = 0;
        }
        if (sb2.length() == 0) {
            throw new NoSuchElementException("Char sequence is empty.");
        }
        if (sb2.charAt(pc.g.h0(sb2)) == ',') {
            jc.i.d(sb2.deleteCharAt(sb2.length() - 1), "this.deleteCharAt(index)");
        }
        sb2.append("]");
        return sb2.toString();
    }

    public final boolean u() {
        long j4 = f8680d.get(this);
        return j4 == 0 || j4 == Long.MAX_VALUE;
    }

    public final void v(long j4, j jVar) {
        j jVar2;
        j jVar3;
        while (jVar.f9954c < j4 && (jVar3 = (j) jVar.b()) != null) {
            jVar = jVar3;
        }
        while (true) {
            if (!jVar.c() || (jVar2 = (j) jVar.b()) == null) {
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8683s;
                    t tVar = (t) atomicReferenceFieldUpdater.get(this);
                    if (tVar.f9954c >= jVar.f9954c) {
                        return;
                    }
                    if (!jVar.i()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, tVar, jVar)) {
                            if (tVar.e()) {
                                tVar.d();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == tVar);
                    if (jVar.e()) {
                        jVar.d();
                    }
                }
            } else {
                jVar = jVar2;
            }
        }
    }

    public final Object w(Object obj, yb.d dVar) {
        rc.k kVar = new rc.k(1, qd.b.r(dVar));
        kVar.s();
        kVar.resumeWith(r7.g.m(p()));
        Object objR = kVar.r();
        return objR == zb.a.f11555a ? objR : ub.k.f9073a;
    }

    public final void x(y1 y1Var, boolean z4) {
        if (y1Var instanceof rc.j) {
            ((yb.d) y1Var).resumeWith(r7.g.m(z4 ? o() : p()));
            return;
        }
        if (!(y1Var instanceof a)) {
            throw new IllegalStateException(("Unexpected waiter: " + y1Var).toString());
        }
        a aVar = (a) y1Var;
        rc.k kVar = aVar.f8676b;
        jc.i.b(kVar);
        aVar.f8676b = null;
        aVar.f8675a = d.f8696l;
        Throwable thN = aVar.f8677c.n();
        if (thN == null) {
            kVar.resumeWith(Boolean.FALSE);
        } else {
            kVar.resumeWith(r7.g.m(thN));
        }
    }

    public final boolean y(Object obj, Object obj2) {
        if (!(obj instanceof a)) {
            if (!(obj instanceof rc.j)) {
                throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
            }
            rc.j jVar = (rc.j) obj;
            j jVar2 = d.f8688a;
            i6.e eVarE = jVar.e(obj2, null);
            if (eVarE == null) {
                return false;
            }
            jVar.i(eVarE);
            return true;
        }
        a aVar = (a) obj;
        rc.k kVar = aVar.f8676b;
        jc.i.b(kVar);
        aVar.f8676b = null;
        aVar.f8675a = obj2;
        Boolean bool = Boolean.TRUE;
        j jVar3 = d.f8688a;
        i6.e eVarE2 = kVar.e(bool, null);
        if (eVarE2 == null) {
            return false;
        }
        kVar.i(eVarE2);
        return true;
    }
}

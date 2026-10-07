package zc;

import da.v;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import rc.y1;
import ub.k;
import wc.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f11565c = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "head");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f11566d = AtomicLongFieldUpdater.newUpdater(h.class, "deqIdx");
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(h.class, Object.class, "tail");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f11567f = AtomicLongFieldUpdater.newUpdater(h.class, "enqIdx");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f11568r = AtomicIntegerFieldUpdater.newUpdater(h.class, "_availablePermits");
    private volatile int _availablePermits;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pb.c f11570b;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private volatile Object tail;

    public h(int i, int i10) {
        this.f11569a = i;
        if (i <= 0) {
            throw new IllegalArgumentException(v.f(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i10 < 0 || i10 > i) {
            throw new IllegalArgumentException(v.f(i, "The number of acquired permits should be in 0..").toString());
        }
        j jVar = new j(0L, null, 2);
        this.head = jVar;
        this.tail = jVar;
        this._availablePermits = i - i10;
        this.f11570b = new pb.c(this, 2);
    }

    public final boolean a(y1 y1Var) {
        Object objB;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
        j jVar = (j) atomicReferenceFieldUpdater.get(this);
        long andIncrement = f11567f.getAndIncrement(this);
        f fVar = f.f11563t;
        long j4 = andIncrement / ((long) i.f11575f);
        loop0: while (true) {
            objB = wc.a.b(jVar, j4, fVar);
            if (!wc.a.e(objB)) {
                t tVarC = wc.a.c(objB);
                while (true) {
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
        j jVar2 = (j) wc.a.c(objB);
        AtomicReferenceArray atomicReferenceArray = jVar2.e;
        int i = (int) (andIncrement % ((long) i.f11575f));
        while (!atomicReferenceArray.compareAndSet(i, null, y1Var)) {
            if (atomicReferenceArray.get(i) != null) {
                i6.e eVar = i.f11572b;
                i6.e eVar2 = i.f11573c;
                while (!atomicReferenceArray.compareAndSet(i, eVar, eVar2)) {
                    if (atomicReferenceArray.get(i) != eVar) {
                        return false;
                    }
                }
                ((rc.j) y1Var).f(k.f9073a, this.f11570b);
                return true;
            }
        }
        y1Var.a(jVar2, i);
        return true;
    }

    public final void b() {
        int i;
        Object objB;
        boolean z4;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f11568r;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i10 = this.f11569a;
            if (andIncrement >= i10) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i10) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i10));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i10).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f11565c;
            j jVar = (j) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = f11566d.getAndIncrement(this);
            long j4 = andIncrement2 / ((long) i.f11575f);
            g gVar = g.f11564t;
            while (true) {
                objB = wc.a.b(jVar, j4, gVar);
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
            j jVar2 = (j) wc.a.c(objB);
            AtomicReferenceArray atomicReferenceArray = jVar2.e;
            jVar2.a();
            z4 = false;
            if (jVar2.f9954c <= j4) {
                int i11 = (int) (andIncrement2 % ((long) i.f11575f));
                Object andSet = atomicReferenceArray.getAndSet(i11, i.f11572b);
                if (andSet == null) {
                    int i12 = i.f11571a;
                    int i13 = 0;
                    while (true) {
                        if (i13 >= i12) {
                            i6.e eVar = i.f11572b;
                            i6.e eVar2 = i.f11574d;
                            do {
                                if (atomicReferenceArray.compareAndSet(i11, eVar, eVar2)) {
                                    z4 = true;
                                    break;
                                }
                            } while (atomicReferenceArray.get(i11) == eVar);
                            z4 = !z4;
                            break;
                        }
                        if (atomicReferenceArray.get(i11) == i.f11573c) {
                            z4 = true;
                            break;
                        }
                        i13++;
                    }
                } else if (andSet != i.e) {
                    if (!(andSet instanceof rc.j)) {
                        throw new IllegalStateException(("unexpected: " + andSet).toString());
                    }
                    rc.j jVar3 = (rc.j) andSet;
                    i6.e eVarE = jVar3.e(k.f9073a, this.f11570b);
                    if (eVarE != null) {
                        jVar3.i(eVarE);
                        z4 = true;
                        break;
                        break;
                    }
                }
            }
        } while (!z4);
    }
}

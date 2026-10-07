package yc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import jc.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Thread {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10675t = AtomicIntegerFieldUpdater.newUpdater(a.class, "workerCtl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q f10677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f10679d;
    public long e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10680f;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f10681r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b f10682s;
    private volatile int workerCtl;

    public a(b bVar, int i) {
        this.f10682s = bVar;
        setDaemon(true);
        this.f10676a = new l();
        this.f10677b = new q();
        this.f10678c = 4;
        this.nextParkedWorker = b.f10686v;
        this.f10680f = kc.d.f6207b.b();
        f(i);
    }

    public final h a(boolean z4) {
        h hVarE;
        h hVarE2;
        long j4;
        int i = this.f10678c;
        b bVar = this.f10682s;
        h hVar = null;
        l lVar = this.f10676a;
        if (i != 1) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f10684t;
            do {
                j4 = atomicLongFieldUpdater.get(bVar);
                if (((int) ((9223367638808264704L & j4) >> 42)) == 0) {
                    lVar.getClass();
                    loop1: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f10708b;
                        h hVar2 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar2 == null || hVar2.f10699b.f8551a != 1) {
                            int i10 = l.f10710d.get(lVar);
                            int i11 = l.f10709c.get(lVar);
                            while (i10 != i11 && l.e.get(lVar) != 0) {
                                i11--;
                                h hVarB = lVar.b(i11, true);
                                if (hVarB != null) {
                                    hVar = hVarB;
                                    break;
                                }
                            }
                            break;
                        }
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(lVar, hVar2, null)) {
                                hVar = hVar2;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(lVar) == hVar2);
                    }
                    if (hVar != null) {
                        return hVar;
                    }
                    h hVar3 = (h) bVar.f10691f.d();
                    return hVar3 == null ? i(1) : hVar3;
                }
            } while (!b.f10684t.compareAndSet(bVar, j4, j4 - 4398046511104L));
            this.f10678c = 1;
        }
        if (z4) {
            boolean z10 = d(bVar.f10687a * 2) == 0;
            if (z10 && (hVarE2 = e()) != null) {
                return hVarE2;
            }
            lVar.getClass();
            h hVarA = (h) l.f10708b.getAndSet(lVar, null);
            if (hVarA == null) {
                hVarA = lVar.a();
            }
            if (hVarA != null) {
                return hVarA;
            }
            if (!z10 && (hVarE = e()) != null) {
                return hVarE;
            }
        } else {
            h hVarE3 = e();
            if (hVarE3 != null) {
                return hVarE3;
            }
        }
        return i(3);
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i) {
        int i10 = this.f10680f;
        int i11 = i10 ^ (i10 << 13);
        int i12 = i11 ^ (i11 >> 17);
        int i13 = i12 ^ (i12 << 5);
        this.f10680f = i13;
        int i14 = i - 1;
        return (i14 & i) == 0 ? i13 & i14 : (i13 & com.google.android.gms.common.api.f.API_PRIORITY_OTHER) % i;
    }

    public final h e() {
        int iD = d(2);
        b bVar = this.f10682s;
        if (iD == 0) {
            h hVar = (h) bVar.e.d();
            return hVar != null ? hVar : (h) bVar.f10691f.d();
        }
        h hVar2 = (h) bVar.f10691f.d();
        return hVar2 != null ? hVar2 : (h) bVar.e.d();
    }

    public final void f(int i) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10682s.f10690d);
        sb2.append("-worker-");
        sb2.append(i == 0 ? "TERMINATED" : String.valueOf(i));
        setName(sb2.toString());
        this.indexInArray = i;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(int i) {
        int i10 = this.f10678c;
        boolean z4 = i10 == 1;
        if (z4) {
            b.f10684t.addAndGet(this.f10682s, 4398046511104L);
        }
        if (i10 != i) {
            this.f10678c = i;
        }
        return z4;
    }

    public final h i(int i) {
        long j4;
        h hVarB;
        long j10;
        long j11;
        h hVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater = b.f10684t;
        b bVar = this.f10682s;
        int i10 = (int) (atomicLongFieldUpdater.get(bVar) & 2097151);
        h hVar2 = null;
        if (i10 < 2) {
            return null;
        }
        int iD = d(i10);
        int i11 = 0;
        long jMin = Long.MAX_VALUE;
        while (i11 < i10) {
            iD++;
            if (iD > i10) {
                iD = 1;
            }
            a aVar = (a) bVar.f10692r.b(iD);
            if (aVar != null && aVar != this) {
                l lVar = aVar.f10676a;
                if (i != 3) {
                    lVar.getClass();
                    int i12 = l.f10710d.get(lVar);
                    int i13 = l.f10709c.get(lVar);
                    boolean z4 = i == 1;
                    while (true) {
                        if (i12 != i13) {
                            j4 = 0;
                            if (!z4 || l.e.get(lVar) != 0) {
                                int i14 = i12 + 1;
                                hVarB = lVar.b(i12, z4);
                                if (hVarB != null) {
                                    break;
                                }
                                i12 = i14;
                            }
                        } else {
                            j4 = 0;
                        }
                        hVarB = hVar2;
                        break;
                    }
                } else {
                    hVarB = lVar.a();
                    j4 = 0;
                }
                q qVar = this.f10677b;
                if (hVarB == null) {
                    while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = l.f10708b;
                        h hVar3 = (h) atomicReferenceFieldUpdater.get(lVar);
                        if (hVar3 == null) {
                            j10 = -1;
                        } else {
                            j10 = -1;
                            if (((hVar3.f10699b.f8551a == 1 ? 1 : 2) & i) != 0) {
                                j.f10705f.getClass();
                                l lVar2 = lVar;
                                long jNanoTime = System.nanoTime() - hVar3.f10698a;
                                long j12 = j.f10702b;
                                if (jNanoTime < j12) {
                                    j11 = j12 - jNanoTime;
                                    hVar = null;
                                    break;
                                }
                                do {
                                    hVar = null;
                                    if (atomicReferenceFieldUpdater.compareAndSet(lVar2, hVar3, null)) {
                                        qVar.f5776a = hVar3;
                                        j11 = -1;
                                        break;
                                    }
                                } while (atomicReferenceFieldUpdater.get(lVar2) == hVar3);
                                lVar = lVar2;
                                hVar2 = null;
                            }
                        }
                        j11 = -2;
                        hVar = hVar2;
                        break;
                    }
                } else {
                    qVar.f5776a = hVarB;
                    hVar = hVar2;
                    j11 = -1;
                    j10 = -1;
                }
                if (j11 == j10) {
                    h hVar4 = (h) qVar.f5776a;
                    qVar.f5776a = hVar;
                    return hVar4;
                }
                if (j11 > j4) {
                    jMin = Math.min(jMin, j11);
                }
            }
            i11++;
            hVar2 = null;
        }
        if (jMin == Long.MAX_VALUE) {
            jMin = 0;
        }
        this.e = jMin;
        return null;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        long j4;
        loop0: while (true) {
            boolean z4 = false;
            while (true) {
                if (b.f10685u.get(this.f10682s) != 0 || this.f10678c == 5) {
                    break loop0;
                }
                h hVarA = a(this.f10681r);
                if (hVarA != null) {
                    this.e = 0L;
                    b bVar = this.f10682s;
                    int i = hVarA.f10699b.f8551a;
                    this.f10679d = 0L;
                    if (this.f10678c == 3) {
                        this.f10678c = 2;
                    }
                    if (i != 0 && h(2) && !bVar.B() && !bVar.o(b.f10684t.get(bVar))) {
                        bVar.B();
                    }
                    try {
                        hVarA.run();
                    } catch (Throwable th) {
                        Thread threadCurrentThread = Thread.currentThread();
                        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
                    }
                    if (i != 0) {
                        b.f10684t.addAndGet(bVar, -2097152L);
                        if (this.f10678c == 5) {
                            break;
                        }
                        this.f10678c = 4;
                        break;
                    }
                    break;
                }
                this.f10681r = false;
                if (this.e == 0) {
                    Object obj = this.nextParkedWorker;
                    i6.e eVar = b.f10686v;
                    if (obj != eVar) {
                        f10675t.set(this, -1);
                        while (this.nextParkedWorker != b.f10686v) {
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10675t;
                            if (atomicIntegerFieldUpdater.get(this) != -1) {
                                break;
                            }
                            b bVar2 = this.f10682s;
                            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater2 = b.f10685u;
                            if (atomicIntegerFieldUpdater2.get(bVar2) != 0 || this.f10678c == 5) {
                                break;
                            }
                            h(3);
                            Thread.interrupted();
                            if (this.f10679d == 0) {
                                j4 = 2097151;
                                this.f10679d = System.nanoTime() + this.f10682s.f10689c;
                            } else {
                                j4 = 2097151;
                            }
                            LockSupport.parkNanos(this.f10682s.f10689c);
                            if (System.nanoTime() - this.f10679d >= 0) {
                                this.f10679d = 0L;
                                b bVar3 = this.f10682s;
                                synchronized (bVar3.f10692r) {
                                    try {
                                        if (!(atomicIntegerFieldUpdater2.get(bVar3) != 0)) {
                                            AtomicLongFieldUpdater atomicLongFieldUpdater = b.f10684t;
                                            if (((int) (atomicLongFieldUpdater.get(bVar3) & j4)) > bVar3.f10687a) {
                                                if (atomicIntegerFieldUpdater.compareAndSet(this, -1, 1)) {
                                                    int i10 = this.indexInArray;
                                                    f(0);
                                                    bVar3.g(this, i10, 0);
                                                    int andDecrement = (int) (atomicLongFieldUpdater.getAndDecrement(bVar3) & j4);
                                                    if (andDecrement != i10) {
                                                        Object objB = bVar3.f10692r.b(andDecrement);
                                                        jc.i.b(objB);
                                                        a aVar = (a) objB;
                                                        bVar3.f10692r.c(i10, aVar);
                                                        aVar.f(i10);
                                                        bVar3.g(aVar, andDecrement, i10);
                                                    }
                                                    bVar3.f10692r.c(andDecrement, null);
                                                    this.f10678c = 5;
                                                }
                                            }
                                        }
                                    } catch (Throwable th2) {
                                        throw th2;
                                    }
                                }
                            }
                        }
                    } else {
                        b bVar4 = this.f10682s;
                        if (this.nextParkedWorker == eVar) {
                            AtomicLongFieldUpdater atomicLongFieldUpdater2 = b.f10683s;
                            while (true) {
                                long j10 = atomicLongFieldUpdater2.get(bVar4);
                                int i11 = this.indexInArray;
                                this.nextParkedWorker = bVar4.f10692r.b((int) (j10 & 2097151));
                                b bVar5 = bVar4;
                                if (b.f10683s.compareAndSet(bVar5, j10, ((j10 + 2097152) & (-2097152)) | ((long) i11))) {
                                    break;
                                } else {
                                    bVar4 = bVar5;
                                }
                            }
                        }
                    }
                } else {
                    if (z4) {
                        h(3);
                        Thread.interrupted();
                        LockSupport.parkNanos(this.e);
                        this.e = 0L;
                        break;
                    }
                    z4 = true;
                }
            }
        }
        h(5);
    }
}

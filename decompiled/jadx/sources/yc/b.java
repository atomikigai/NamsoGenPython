package yc;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import rc.b0;
import t2.m;
import wc.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements Executor, Closeable {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10683s = AtomicLongFieldUpdater.newUpdater(b.class, "parkedWorkersStack");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f10684t = AtomicLongFieldUpdater.newUpdater(b.class, "controlState");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10685u = AtomicIntegerFieldUpdater.newUpdater(b.class, "_isTerminated");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final i6.e f10686v = new i6.e("NOT_IN_STACK", 3);
    private volatile int _isTerminated;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10688b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10689c;
    private volatile long controlState;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f10690d;
    public final e e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f10691f;
    private volatile long parkedWorkersStack;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final r f10692r;

    public b(int i, int i10, long j4, String str) {
        this.f10687a = i;
        this.f10688b = i10;
        this.f10689c = j4;
        this.f10690d = str;
        if (i < 1) {
            throw new IllegalArgumentException(q1.a.j(i, "Core pool size ", " should be at least 1").toString());
        }
        if (i10 < i) {
            throw new IllegalArgumentException(q1.a.i(i10, i, "Max pool size ", " should be greater than or equals to core pool size ").toString());
        }
        if (i10 > 2097150) {
            throw new IllegalArgumentException(q1.a.j(i10, "Max pool size ", " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j4 <= 0) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + j4 + " must be positive").toString());
        }
        this.e = new e();
        this.f10691f = new e();
        this.f10692r = new r((i + 1) * 2);
        this.controlState = ((long) i) << 42;
        this._isTerminated = 0;
    }

    public final boolean B() {
        i6.e eVar;
        int iB;
        while (true) {
            long j4 = f10683s.get(this);
            a aVar = (a) this.f10692r.b((int) (2097151 & j4));
            if (aVar == null) {
                aVar = null;
            } else {
                long j10 = (2097152 + j4) & (-2097152);
                Object objC = aVar.c();
                while (true) {
                    eVar = f10686v;
                    if (objC == eVar) {
                        iB = -1;
                        break;
                    }
                    if (objC == null) {
                        iB = 0;
                        break;
                    }
                    a aVar2 = (a) objC;
                    iB = aVar2.b();
                    if (iB != 0) {
                        break;
                    }
                    objC = aVar2.c();
                }
                if (iB >= 0) {
                    if (f10683s.compareAndSet(this, j4, ((long) iB) | j10)) {
                        aVar.g(eVar);
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
            if (aVar == null) {
                return false;
            }
            if (a.f10675t.compareAndSet(aVar, -1, 0)) {
                LockSupport.unpark(aVar);
                return true;
            }
        }
    }

    public final int c() {
        synchronized (this.f10692r) {
            try {
                if (f10685u.get(this) != 0) {
                    return -1;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater = f10684t;
                long j4 = atomicLongFieldUpdater.get(this);
                int i = (int) (j4 & 2097151);
                int i10 = i - ((int) ((j4 & 4398044413952L) >> 21));
                if (i10 < 0) {
                    i10 = 0;
                }
                if (i10 >= this.f10687a) {
                    return 0;
                }
                if (i >= this.f10688b) {
                    return 0;
                }
                int i11 = ((int) (atomicLongFieldUpdater.get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f10692r.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                a aVar = new a(this, i11);
                this.f10692r.c(i11, aVar);
                if (i11 != ((int) (2097151 & atomicLongFieldUpdater.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = i10 + 1;
                aVar.start();
                return i12;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0088  */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws InterruptedException {
        int i;
        h hVarA;
        if (f10685u.compareAndSet(this, 0, 1)) {
            Thread threadCurrentThread = Thread.currentThread();
            a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
            if (aVar == null || !jc.i.a(aVar.f10682s, this)) {
                aVar = null;
            }
            synchronized (this.f10692r) {
                i = (int) (f10684t.get(this) & 2097151);
            }
            if (1 <= i) {
                int i10 = 1;
                while (true) {
                    Object objB = this.f10692r.b(i10);
                    jc.i.b(objB);
                    a aVar2 = (a) objB;
                    if (aVar2 != aVar) {
                        while (aVar2.isAlive()) {
                            LockSupport.unpark(aVar2);
                            aVar2.join(10000L);
                        }
                        l lVar = aVar2.f10676a;
                        e eVar = this.f10691f;
                        lVar.getClass();
                        h hVar = (h) l.f10708b.getAndSet(lVar, null);
                        if (hVar != null) {
                            eVar.a(hVar);
                        }
                        while (true) {
                            h hVarA2 = lVar.a();
                            if (hVarA2 == null) {
                                break;
                            } else {
                                eVar.a(hVarA2);
                            }
                        }
                    }
                    if (i10 == i) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            this.f10691f.b();
            this.e.b();
            while (true) {
                if (aVar != null) {
                    hVarA = aVar.a(true);
                    if (hVarA == null) {
                        hVarA = (h) this.e.d();
                        if (hVarA == null) {
                            break;
                            break;
                        }
                    }
                } else {
                    hVarA = (h) this.e.d();
                    if (hVarA == null && (hVarA = (h) this.f10691f.d()) == null) {
                        break;
                    }
                }
                try {
                    hVarA.run();
                } catch (Throwable th) {
                    Thread threadCurrentThread2 = Thread.currentThread();
                    threadCurrentThread2.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread2, th);
                }
            }
            if (aVar != null) {
                aVar.h(5);
            }
            f10683s.set(this, 0L);
            f10684t.set(this, 0L);
        }
    }

    public final void d(Runnable runnable, m mVar) {
        h iVar;
        int i;
        j.f10705f.getClass();
        long jNanoTime = System.nanoTime();
        if (runnable instanceof h) {
            iVar = (h) runnable;
            iVar.f10698a = jNanoTime;
            iVar.f10699b = mVar;
        } else {
            iVar = new i(runnable, jNanoTime, mVar);
        }
        boolean z4 = iVar.f10699b.f8551a == 1;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f10684t;
        long jAddAndGet = z4 ? atomicLongFieldUpdater.addAndGet(this, 2097152L) : 0L;
        Thread threadCurrentThread = Thread.currentThread();
        a aVar = threadCurrentThread instanceof a ? (a) threadCurrentThread : null;
        if (aVar == null || !jc.i.a(aVar.f10682s, this)) {
            aVar = null;
        }
        if (aVar != null && (i = aVar.f10678c) != 5 && (iVar.f10699b.f8551a != 0 || i != 2)) {
            aVar.f10681r = true;
            l lVar = aVar.f10676a;
            lVar.getClass();
            iVar = (h) l.f10708b.getAndSet(lVar, iVar);
            if (iVar == null) {
                iVar = null;
            } else {
                AtomicReferenceArray atomicReferenceArray = lVar.f10711a;
                AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = l.f10709c;
                if (atomicIntegerFieldUpdater.get(lVar) - l.f10710d.get(lVar) != 127) {
                    if (iVar.f10699b.f8551a == 1) {
                        l.e.incrementAndGet(lVar);
                    }
                    int i10 = atomicIntegerFieldUpdater.get(lVar) & 127;
                    while (atomicReferenceArray.get(i10) != null) {
                        Thread.yield();
                    }
                    atomicReferenceArray.lazySet(i10, iVar);
                    atomicIntegerFieldUpdater.incrementAndGet(lVar);
                    iVar = null;
                }
            }
        }
        if (iVar != null) {
            if (!(iVar.f10699b.f8551a == 1 ? this.f10691f.a(iVar) : this.e.a(iVar))) {
                throw new RejectedExecutionException(q1.a.m(new StringBuilder(), this.f10690d, " was terminated"));
            }
        }
        if (z4) {
            if (B() || o(jAddAndGet)) {
                return;
            }
            B();
            return;
        }
        if (B() || o(atomicLongFieldUpdater.get(this))) {
            return;
        }
        B();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        d(runnable, j.f10706g);
    }

    public final void g(a aVar, int i, int i10) {
        while (true) {
            long j4 = f10683s.get(this);
            int i11 = (int) (2097151 & j4);
            long j10 = (2097152 + j4) & (-2097152);
            if (i11 == i) {
                if (i10 == 0) {
                    Object objC = aVar.c();
                    while (true) {
                        if (objC == f10686v) {
                            i11 = -1;
                            break;
                        }
                        if (objC == null) {
                            i11 = 0;
                            break;
                        }
                        a aVar2 = (a) objC;
                        int iB = aVar2.b();
                        if (iB != 0) {
                            i11 = iB;
                            break;
                        }
                        objC = aVar2.c();
                    }
                } else {
                    i11 = i10;
                }
            }
            if (i11 >= 0) {
                if (f10683s.compareAndSet(this, j4, ((long) i11) | j10)) {
                    return;
                }
            }
        }
    }

    public final boolean o(long j4) {
        int i = ((int) (2097151 & j4)) - ((int) ((j4 & 4398044413952L) >> 21));
        if (i < 0) {
            i = 0;
        }
        int i10 = this.f10687a;
        if (i < i10) {
            int iC = c();
            if (iC == 1 && i10 > 1) {
                c();
            }
            if (iC > 0) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        r rVar = this.f10692r;
        int iA = rVar.a();
        int i = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 1; i14 < iA; i14++) {
            a aVar = (a) rVar.b(i14);
            if (aVar != null) {
                l lVar = aVar.f10676a;
                lVar.getClass();
                int i15 = l.f10708b.get(lVar) != null ? (l.f10709c.get(lVar) - l.f10710d.get(lVar)) + 1 : l.f10709c.get(lVar) - l.f10710d.get(lVar);
                int iD = u.e.d(aVar.f10678c);
                if (iD == 0) {
                    i++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i15);
                    sb2.append('c');
                    arrayList.add(sb2.toString());
                } else if (iD == 1) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(i15);
                    sb3.append('b');
                    arrayList.add(sb3.toString());
                } else if (iD == 2) {
                    i11++;
                } else if (iD == 3) {
                    i12++;
                    if (i15 > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(i15);
                        sb4.append('d');
                        arrayList.add(sb4.toString());
                    }
                } else if (iD == 4) {
                    i13++;
                }
            }
        }
        long j4 = f10684t.get(this);
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f10690d);
        sb5.append('@');
        sb5.append(b0.l(this));
        sb5.append("[Pool Size {core = ");
        int i16 = this.f10687a;
        sb5.append(i16);
        sb5.append(", max = ");
        sb5.append(this.f10688b);
        sb5.append("}, Worker States {CPU = ");
        sb5.append(i);
        sb5.append(", blocking = ");
        sb5.append(i10);
        sb5.append(", parked = ");
        sb5.append(i11);
        sb5.append(", dormant = ");
        sb5.append(i12);
        sb5.append(", terminated = ");
        sb5.append(i13);
        sb5.append("}, running workers queues = ");
        sb5.append(arrayList);
        sb5.append(", global CPU queue size = ");
        sb5.append(this.e.c());
        sb5.append(", global blocking queue size = ");
        sb5.append(this.f10691f.c());
        sb5.append(", Control State {created workers= ");
        sb5.append((int) (2097151 & j4));
        sb5.append(", blocking tasks = ");
        sb5.append((int) ((4398044413952L & j4) >> 21));
        sb5.append(", CPUs acquired = ");
        sb5.append(i16 - ((int) ((j4 & 9223367638808264704L) >> 42)));
        sb5.append("}]");
        return sb5.toString();
    }
}

package rc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class t0 extends u0 implements g0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8318r = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_queue");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f8319s = AtomicReferenceFieldUpdater.newUpdater(t0.class, Object.class, "_delayed");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f8320t = AtomicIntegerFieldUpdater.newUpdater(t0.class, "_isCompleted");
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;

    @Override // rc.x
    public final void S(yb.i iVar, Runnable runnable) {
        a0(runnable);
    }

    @Override // rc.u0
    public final long X() {
        Runnable runnable;
        r0 r0Var;
        r0 r0VarB;
        if (!Y()) {
            s0 s0Var = (s0) f8319s.get(this);
            if (s0Var != null && wc.z.f9965b.get(s0Var) != 0) {
                long jNanoTime = System.nanoTime();
                do {
                    synchronized (s0Var) {
                        try {
                            r0[] r0VarArr = s0Var.f9966a;
                            r0 r0Var2 = r0VarArr != null ? r0VarArr[0] : null;
                            if (r0Var2 == null) {
                                r0VarB = null;
                            } else {
                                r0VarB = ((jNanoTime - r0Var2.f8312a) > 0L ? 1 : ((jNanoTime - r0Var2.f8312a) == 0L ? 0 : -1)) >= 0 ? b0(r0Var2) : false ? s0Var.b(0) : null;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } while (r0VarB != null);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8318r;
            loop1: while (true) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                if (obj != null) {
                    if (obj instanceof wc.n) {
                        wc.n nVar = (wc.n) obj;
                        Object objD = nVar.d();
                        if (objD != wc.n.f9945g) {
                            runnable = (Runnable) objD;
                            break;
                        }
                        wc.n nVarC = nVar.c();
                        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                        }
                    } else if (obj != b0.f8254c) {
                        do {
                            if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                                runnable = (Runnable) obj;
                                break loop1;
                            }
                        } while (atomicReferenceFieldUpdater.get(this) == obj);
                    }
                }
                runnable = null;
                break;
            }
            if (runnable != null) {
                runnable.run();
                return 0L;
            }
            vb.g gVar = this.e;
            if (((gVar == null || gVar.isEmpty()) ? Long.MAX_VALUE : 0L) != 0) {
                Object obj2 = f8318r.get(this);
                if (obj2 != null) {
                    if (obj2 instanceof wc.n) {
                        long j4 = wc.n.f9944f.get((wc.n) obj2);
                        if (((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30))) {
                        }
                    } else if (obj2 == b0.f8254c) {
                        return Long.MAX_VALUE;
                    }
                }
                s0 s0Var2 = (s0) f8319s.get(this);
                if (s0Var2 != null) {
                    synchronized (s0Var2) {
                        r0[] r0VarArr2 = s0Var2.f9966a;
                        r0Var = r0VarArr2 != null ? r0VarArr2[0] : null;
                    }
                    if (r0Var != null) {
                        long jNanoTime2 = r0Var.f8312a - System.nanoTime();
                        if (jNanoTime2 >= 0) {
                            return jNanoTime2;
                        }
                    }
                }
                return Long.MAX_VALUE;
            }
        }
        return 0L;
    }

    public void a0(Runnable runnable) {
        if (!b0(runnable)) {
            c0.f8262u.a0(runnable);
            return;
        }
        Thread threadV = V();
        if (Thread.currentThread() != threadV) {
            LockSupport.unpark(threadV);
        }
    }

    public final boolean b0(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8318r;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (f8320t.get(this) != 0) {
                return false;
            }
            if (obj == null) {
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, runnable)) {
                    if (atomicReferenceFieldUpdater.get(this) != null) {
                    }
                }
                return true;
            }
            if (!(obj instanceof wc.n)) {
                if (obj == b0.f8254c) {
                    return false;
                }
                wc.n nVar = new wc.n(8, true);
                nVar.a((Runnable) obj);
                nVar.a(runnable);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                    }
                }
                return true;
            }
            wc.n nVar2 = (wc.n) obj;
            int iA = nVar2.a(runnable);
            if (iA == 0) {
                return true;
            }
            if (iA == 1) {
                wc.n nVarC = nVar2.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nVarC) && atomicReferenceFieldUpdater.get(this) == obj) {
                }
            } else if (iA == 2) {
                return false;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0027  */
    /* JADX WARN: Code duplicated, block: B:20:0x0030  */
    /* JADX WARN: Code duplicated, block: B:22:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    public final boolean c0() {
        Object obj;
        long j4;
        vb.g gVar = this.e;
        if (gVar != null ? gVar.isEmpty() : true) {
            s0 s0Var = (s0) f8319s.get(this);
            if (s0Var == null) {
                obj = f8318r.get(this);
                if (obj != null) {
                    if (obj instanceof wc.n) {
                        j4 = wc.n.f9944f.get((wc.n) obj);
                        if (((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == b0.f8254c) {
                    }
                }
                return true;
            }
            if (wc.z.f9965b.get(s0Var) == 0) {
                obj = f8318r.get(this);
                if (obj != null) {
                    if (obj instanceof wc.n) {
                        j4 = wc.n.f9944f.get((wc.n) obj);
                        if (((int) (1073741823 & j4)) == ((int) ((j4 & 1152921503533105152L) >> 30))) {
                            return true;
                        }
                        return false;
                    }
                    if (obj == b0.f8254c) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void d0(long j4, r0 r0Var) {
        int iA;
        Thread threadV;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8319s;
        r0 r0Var2 = null;
        if (f8320t.get(this) != 0) {
            iA = 1;
        } else {
            s0 s0Var = (s0) atomicReferenceFieldUpdater.get(this);
            if (s0Var == null) {
                s0 s0Var2 = new s0();
                s0Var2.f8316c = j4;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, null, s0Var2) && atomicReferenceFieldUpdater.get(this) == null) {
                }
                Object obj = atomicReferenceFieldUpdater.get(this);
                jc.i.b(obj);
                s0Var = (s0) obj;
            }
            iA = r0Var.a(j4, s0Var, this);
        }
        if (iA != 0) {
            if (iA == 1) {
                Z(j4, r0Var);
                return;
            } else {
                if (iA != 2) {
                    throw new IllegalStateException("unexpected result");
                }
                return;
            }
        }
        s0 s0Var3 = (s0) atomicReferenceFieldUpdater.get(this);
        if (s0Var3 != null) {
            synchronized (s0Var3) {
                r0[] r0VarArr = s0Var3.f9966a;
                r0Var2 = r0VarArr != null ? r0VarArr[0] : null;
            }
        }
        if (r0Var2 != r0Var || Thread.currentThread() == (threadV = V())) {
            return;
        }
        LockSupport.unpark(threadV);
    }

    public m0 o(long j4, u1 u1Var, yb.i iVar) {
        return d0.f8266a.o(j4, u1Var, iVar);
    }

    @Override // rc.u0
    public void shutdown() {
        r0 r0VarB;
        s1.f8317a.set(null);
        f8320t.set(this, 1);
        i6.e eVar = b0.f8254c;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f8318r;
        loop0: while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, eVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == null);
            } else if (obj instanceof wc.n) {
                ((wc.n) obj).b();
                break;
            } else {
                if (obj == eVar) {
                    break;
                }
                wc.n nVar = new wc.n(8, true);
                nVar.a((Runnable) obj);
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, nVar)) {
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj);
            }
        }
        while (X() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            s0 s0Var = (s0) f8319s.get(this);
            if (s0Var == null) {
                return;
            }
            synchronized (s0Var) {
                r0VarB = wc.z.f9965b.get(s0Var) > 0 ? s0Var.b(0) : null;
            }
            if (r0VarB == null) {
                return;
            } else {
                Z(jNanoTime, r0VarB);
            }
        }
    }
}

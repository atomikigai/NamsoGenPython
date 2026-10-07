package wc;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class n {
    public static final AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "_next");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AtomicLongFieldUpdater f9944f = AtomicLongFieldUpdater.newUpdater(n.class, "_state");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final i6.e f9945g = new i6.e("REMOVE_FROZEN", 3);
    private volatile Object _next;
    private volatile long _state;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f9947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9948c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReferenceArray f9949d;

    public n(int i, boolean z4) {
        this.f9946a = i;
        this.f9947b = z4;
        int i10 = i - 1;
        this.f9948c = i10;
        this.f9949d = new AtomicReferenceArray(i);
        if (i10 > 1073741823) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & i10) != 0) {
            throw new IllegalStateException("Check failed.");
        }
    }

    public final int a(Object obj) {
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9944f;
            long j4 = atomicLongFieldUpdater.get(this);
            if ((3458764513820540928L & j4) != 0) {
                return (2305843009213693952L & j4) != 0 ? 2 : 1;
            }
            int i = (int) (1073741823 & j4);
            int i10 = (int) ((1152921503533105152L & j4) >> 30);
            int i11 = this.f9948c;
            if (((i10 + 2) & i11) == (i & i11)) {
                return 1;
            }
            boolean z4 = this.f9947b;
            AtomicReferenceArray atomicReferenceArray = this.f9949d;
            if (z4 || atomicReferenceArray.get(i10 & i11) == null) {
                if (f9944f.compareAndSet(this, j4, ((-1152921503533105153L) & j4) | (((long) ((i10 + 1) & 1073741823)) << 30))) {
                    atomicReferenceArray.set(i10 & i11, obj);
                    n nVarC = this;
                    while ((atomicLongFieldUpdater.get(nVarC) & 1152921504606846976L) != 0) {
                        nVarC = nVarC.c();
                        AtomicReferenceArray atomicReferenceArray2 = nVarC.f9949d;
                        int i12 = nVarC.f9948c & i10;
                        Object obj2 = atomicReferenceArray2.get(i12);
                        if ((obj2 instanceof m) && ((m) obj2).f9943a == i10) {
                            atomicReferenceArray2.set(i12, obj);
                        } else {
                            nVarC = null;
                        }
                        if (nVarC == null) {
                            return 0;
                        }
                    }
                    return 0;
                }
            } else {
                int i13 = this.f9946a;
                if (i13 < 1024 || ((i10 - i) & 1073741823) > (i13 >> 1)) {
                    return 1;
                }
            }
        }
    }

    public final boolean b() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        do {
            atomicLongFieldUpdater = f9944f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j4) != 0) {
                return false;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j4, 2305843009213693952L | j4));
        return true;
    }

    public final n c() {
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        long j4;
        n nVar;
        while (true) {
            atomicLongFieldUpdater = f9944f;
            j4 = atomicLongFieldUpdater.get(this);
            if ((j4 & 1152921504606846976L) != 0) {
                nVar = this;
                break;
            }
            long j10 = 1152921504606846976L | j4;
            nVar = this;
            if (atomicLongFieldUpdater.compareAndSet(nVar, j4, j10)) {
                j4 = j10;
                break;
            }
        }
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            n nVar2 = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar2 != null) {
                return nVar2;
            }
            n nVar3 = new n(nVar.f9946a * 2, nVar.f9947b);
            int i = (int) (1073741823 & j4);
            int i10 = (int) ((1152921503533105152L & j4) >> 30);
            while (true) {
                int i11 = nVar.f9948c;
                int i12 = i & i11;
                if (i12 == (i11 & i10)) {
                    break;
                }
                Object mVar = nVar.f9949d.get(i12);
                if (mVar == null) {
                    mVar = new m(i);
                }
                nVar3.f9949d.set(nVar3.f9948c & i, mVar);
                i++;
            }
            atomicLongFieldUpdater.set(nVar3, (-1152921504606846977L) & j4);
            while (!atomicReferenceFieldUpdater.compareAndSet(this, null, nVar3) && atomicReferenceFieldUpdater.get(this) == null) {
            }
        }
    }

    public final Object d() {
        n nVarC = this;
        while (true) {
            AtomicLongFieldUpdater atomicLongFieldUpdater = f9944f;
            long j4 = atomicLongFieldUpdater.get(nVarC);
            if ((j4 & 1152921504606846976L) != 0) {
                return f9945g;
            }
            int i = (int) (j4 & 1073741823);
            int i10 = nVarC.f9948c;
            int i11 = i & i10;
            if ((((int) ((1152921503533105152L & j4) >> 30)) & i10) != i11) {
                AtomicReferenceArray atomicReferenceArray = nVarC.f9949d;
                Object obj = atomicReferenceArray.get(i11);
                boolean z4 = nVarC.f9947b;
                if (obj == null) {
                    if (z4) {
                    }
                } else if (!(obj instanceof m)) {
                    long j10 = (i + 1) & 1073741823;
                    if (f9944f.compareAndSet(nVarC, j4, (j4 & (-1073741824)) | j10)) {
                        atomicReferenceArray.set(i11, null);
                        return obj;
                    }
                    nVarC = this;
                    if (z4) {
                        while (true) {
                            long j11 = atomicLongFieldUpdater.get(nVarC);
                            int i12 = (int) (j11 & 1073741823);
                            if ((j11 & 1152921504606846976L) != 0) {
                                nVarC = nVarC.c();
                            } else {
                                n nVar = nVarC;
                                if (f9944f.compareAndSet(nVar, j11, (j11 & (-1073741824)) | j10)) {
                                    nVar.f9949d.set(i12 & nVar.f9948c, null);
                                    nVarC = null;
                                } else {
                                    nVarC = nVar;
                                }
                            }
                            if (nVarC == null) {
                                return obj;
                            }
                        }
                    }
                }
            }
            return null;
        }
    }
}

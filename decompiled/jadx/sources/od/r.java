package od;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f7762a = new q(new byte[0], 0, 0, false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f7763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference[] f7764c;

    static {
        int iHighestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        f7763b = iHighestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[iHighestOneBit];
        for (int i = 0; i < iHighestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        f7764c = atomicReferenceArr;
    }

    public static final void a(q qVar) {
        jc.i.e(qVar, "segment");
        if (qVar.f7760f != null || qVar.f7761g != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (qVar.f7759d) {
            return;
        }
        AtomicReference atomicReference = f7764c[(int) (Thread.currentThread().getId() & (((long) f7763b) - 1))];
        q qVar2 = f7762a;
        q qVar3 = (q) atomicReference.getAndSet(qVar2);
        if (qVar3 == qVar2) {
            return;
        }
        int i = qVar3 != null ? qVar3.f7758c : 0;
        if (i >= 65536) {
            atomicReference.set(qVar3);
            return;
        }
        qVar.f7760f = qVar3;
        qVar.f7757b = 0;
        qVar.f7758c = i + 8192;
        atomicReference.set(qVar);
    }

    public static final q b() {
        AtomicReference atomicReference = f7764c[(int) (Thread.currentThread().getId() & (((long) f7763b) - 1))];
        q qVar = f7762a;
        q qVar2 = (q) atomicReference.getAndSet(qVar);
        if (qVar2 == qVar) {
            return new q();
        }
        if (qVar2 == null) {
            atomicReference.set(null);
            return new q();
        }
        atomicReference.set(qVar2.f7760f);
        qVar2.f7760f = null;
        qVar2.f7758c = 0;
        return qVar2;
    }
}

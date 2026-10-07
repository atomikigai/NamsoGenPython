package yc;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f10708b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10709c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f10710d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");
    public static final AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f10711a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10710d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f10709c.get(this) == 0) {
                return null;
            }
            int i10 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (hVar = (h) this.f10711a.getAndSet(i10, null)) != null) {
                if (hVar.f10699b.f8551a == 1) {
                    e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h b(int i, boolean z4) {
        int i10 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f10711a;
        h hVar = (h) atomicReferenceArray.get(i10);
        if (hVar != null) {
            if ((hVar.f10699b.f8551a == 1) == z4) {
                while (!atomicReferenceArray.compareAndSet(i10, hVar, null)) {
                    if (atomicReferenceArray.get(i10) != hVar) {
                    }
                }
                if (z4) {
                    e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}

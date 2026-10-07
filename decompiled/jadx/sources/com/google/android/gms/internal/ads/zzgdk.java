package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgdk extends zzgdj {
    final AtomicReferenceFieldUpdater zza;
    final AtomicIntegerFieldUpdater zzb;

    public zzgdk(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final int zza(zzgdn zzgdnVar) {
        return this.zzb.decrementAndGet(zzgdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zzb(zzgdn zzgdnVar, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.zza;
            while (!atomicReferenceFieldUpdater.compareAndSet(zzgdnVar, null, set2)) {
                if (atomicReferenceFieldUpdater.get(zzgdnVar) != null) {
                }
            }
            return;
        } while (atomicReferenceFieldUpdater.get(zzgdnVar) == null);
    }
}

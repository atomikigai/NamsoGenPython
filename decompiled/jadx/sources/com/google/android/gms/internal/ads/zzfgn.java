package com.google.android.gms.internal.ads;

import java.util.Deque;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfgn {
    private final Deque zza = new LinkedBlockingDeque();
    private final Callable zzb;
    private final zzges zzc;

    public zzfgn(Callable callable, zzges zzgesVar) {
        this.zzb = callable;
        this.zzc = zzgesVar;
    }

    public final synchronized m9.a zza() {
        zzc(1);
        return (m9.a) this.zza.poll();
    }

    public final synchronized void zzb(m9.a aVar) {
        this.zza.addFirst(aVar);
    }

    public final synchronized void zzc(int i) {
        int size = i - this.zza.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.zza.add(this.zzc.zzb(this.zzb));
        }
    }
}

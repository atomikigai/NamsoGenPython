package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzech {
    private final zzecd zza;
    private final zzges zzb;

    public zzech(zzecd zzecdVar, zzges zzgesVar) {
        this.zza = zzecdVar;
        this.zzb = zzgesVar;
    }

    public final void zza(zzfiv zzfivVar) {
        final zzecd zzecdVar = this.zza;
        Objects.requireNonNull(zzecdVar);
        zzgei.zzr(this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzecf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzecdVar.getWritableDatabase();
            }
        }), new zzecg(this, zzfivVar), this.zzb);
    }
}

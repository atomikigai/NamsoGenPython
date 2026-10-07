package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeym implements zzevz {
    final zzges zza;
    final List zzb;

    public zzeym(zzbbw zzbbwVar, zzges zzgesVar, List list) {
        this.zza = zzgesVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 48;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyl
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeyn(this.zza.zzb);
            }
        });
    }
}

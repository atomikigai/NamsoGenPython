package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfiz {
    final /* synthetic */ zzfjj zza;
    private final Object zzb;
    private final List zzc;

    public /* synthetic */ zzfiz(zzfjj zzfjjVar, Object obj, List list, zzfji zzfjiVar) {
        this.zza = zzfjjVar;
        this.zzb = obj;
        this.zzc = list;
    }

    public final zzfjh zza(Callable callable) {
        zzgeg zzgegVarZzb = zzgei.zzb(this.zzc);
        m9.a aVarZza = zzgegVarZzb.zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzfiy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, zzcaj.zzf);
        m9.a aVarZza2 = zzgegVarZzb.zza(callable, this.zza.zzb);
        return new zzfjh(this.zza, this.zzb, aVarZza, this.zzc, aVarZza2);
    }
}

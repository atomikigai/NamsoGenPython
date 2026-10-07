package com.google.android.gms.internal.ads;

import e6.t;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeyi implements zzevz {
    public zzeyi(zzbzn zzbznVar, zzges zzgesVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 47;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final m9.a zzb() {
        final m9.a aVarZzh = zzgei.zzh(null);
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfK)).booleanValue()) {
            aVarZzh = zzgei.zzh(null);
        }
        final m9.a aVarZzh2 = zzgei.zzh(null);
        return zzgei.zzc(aVarZzh, aVarZzh2).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return new zzeyj((String) aVarZzh.get(), (String) aVarZzh2.get());
            }
        }, zzcaj.zza);
    }
}

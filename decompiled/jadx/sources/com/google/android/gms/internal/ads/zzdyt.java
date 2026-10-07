package com.google.android.gms.internal.ads;

import e6.t;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdyt implements zzdyv {
    private final Map zza;
    private final zzges zzb;
    private final zzczh zzc;

    public zzdyt(Map map, zzges zzgesVar, zzczh zzczhVar) {
        this.zza = map;
        this.zzb = zzgesVar;
        this.zzc = zzczhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdyv
    public final m9.a zzb(final zzbvx zzbvxVar) {
        this.zzc.zzdn(zzbvxVar);
        m9.a aVarZzg = zzgei.zzg(new zzdwn(3));
        for (String str : ((String) t.f3437d.f3440c.zza(zzbcn.zzhR)).split(",")) {
            final zzhgp zzhgpVar = (zzhgp) this.zza.get(str.trim());
            if (zzhgpVar != null) {
                aVarZzg = zzgei.zzf(aVarZzg, zzdwn.class, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdyr
                    @Override // com.google.android.gms.internal.ads.zzgdp
                    public final m9.a zza(Object obj) {
                        return ((zzdyv) zzhgpVar.zzb()).zzb(zzbvxVar);
                    }
                }, this.zzb);
            }
        }
        zzgei.zzr(aVarZzg, new zzdys(this), zzcaj.zzf);
        return aVarZzg;
    }
}

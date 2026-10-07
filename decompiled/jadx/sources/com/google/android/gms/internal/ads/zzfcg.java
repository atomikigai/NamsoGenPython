package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfcg {
    private final zzfhc zza;
    private final zzcvt zzb;
    private final Executor zzc;
    private zzfce zzd;

    public zzfcg(zzfhc zzfhcVar, zzcvt zzcvtVar, Executor executor) {
        this.zza = zzfhcVar;
        this.zzb = zzcvtVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfhm zze() {
        zzffo zzffoVarZzg = this.zzb.zzg();
        return this.zza.zzc(zzffoVarZzg.zzd, zzffoVarZzg.zzf, zzffoVarZzg.zzj);
    }

    public final m9.a zzc() {
        m9.a aVarZzh;
        zzfce zzfceVar = this.zzd;
        if (zzfceVar != null) {
            return zzgei.zzh(zzfceVar);
        }
        if (((Boolean) zzbeu.zza.zze()).booleanValue()) {
            aVarZzh = (zzgdz) zzgei.zze((zzgdz) zzgei.zzm(zzgdz.zzu(this.zzb.zzb().zze(this.zza.zza())), new zzfcd(this), this.zzc), zzdyw.class, new zzfcc(this), this.zzc);
        } else {
            zzfce zzfceVar2 = new zzfce(null, zze(), null);
            this.zzd = zzfceVar2;
            aVarZzh = zzgei.zzh(zzfceVar2);
        }
        return zzgei.zzm(aVarZzh, new zzfwh() { // from class: com.google.android.gms.internal.ads.zzfcb
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                return (zzfce) obj;
            }
        }, this.zzc);
    }
}

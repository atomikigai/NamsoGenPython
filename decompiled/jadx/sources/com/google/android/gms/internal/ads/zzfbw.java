package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfbw implements zzfck {
    private final zzfhc zza;
    private final Executor zzb;
    private final zzgee zzc = new zzfbu(this);

    public zzfbw(zzfhc zzfhcVar, Executor executor) {
        this.zza = zzfhcVar;
        this.zzb = executor;
    }

    public final /* synthetic */ m9.a zza(zzcvt zzcvtVar, zzfce zzfceVar) throws Exception {
        zzfhc zzfhcVar = this.zza;
        zzfhm zzfhmVar = zzfceVar.zzb;
        zzbvx zzbvxVar = zzfceVar.zza;
        zzfhl zzfhlVarZzb = zzfhcVar.zzb(zzfhmVar);
        if (zzfhlVarZzb != null && zzbvxVar != null) {
            zzgei.zzr(zzcvtVar.zzb().zzh(zzbvxVar), this.zzc, this.zzb);
        }
        return zzgei.zzh(new zzfbv(zzfhmVar, zzbvxVar, zzfhlVarZzb));
    }

    public final m9.a zzb(zzfcl zzfclVar, zzfcj zzfcjVar, final zzcvt zzcvtVar) {
        return (zzgdz) zzgei.zze((zzgdz) zzgei.zzn(zzgdz.zzu(new zzfcg(this.zza, zzcvtVar, this.zzb).zzc()), new zzgdp() { // from class: com.google.android.gms.internal.ads.zzfbs
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final m9.a zza(Object obj) {
                return this.zza.zza(zzcvtVar, (zzfce) obj);
            }
        }, this.zzb), Exception.class, new zzfbt(this), this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ m9.a zzc(zzfcl zzfclVar, zzfcj zzfcjVar, Object obj) {
        return zzb(zzfclVar, zzfcjVar, null);
    }

    @Override // com.google.android.gms.internal.ads.zzfck
    public final /* bridge */ /* synthetic */ Object zzd() {
        return null;
    }
}

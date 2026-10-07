package com.google.android.gms.internal.ads;

import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdnw implements zzgee {
    final /* synthetic */ zzfet zza;
    final /* synthetic */ zzfew zzb;
    final /* synthetic */ zzcnb zzc;
    final /* synthetic */ zzdoc zzd;

    public zzdnw(zzdoc zzdocVar, zzfet zzfetVar, zzfew zzfewVar, zzcnb zzcnbVar) {
        this.zza = zzfetVar;
        this.zzb = zzfewVar;
        this.zzc = zzcnbVar;
        this.zzd = zzdocVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        zzcfk zzcfkVar = (zzcfk) obj;
        zzcfkVar.zzW(this.zza, this.zzb);
        zzchc zzchcVarZzN = zzcfkVar.zzN();
        zzbce zzbceVar = zzbcn.zzjM;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && zzchcVarZzN != null) {
            zzcnb zzcnbVar = this.zzc;
            zzdoc zzdocVar = this.zzd;
            zzchcVarZzN.zzJ(zzcnbVar, zzdocVar.zzi, zzdocVar.zzj);
            zzcnb zzcnbVar2 = this.zzc;
            zzdoc zzdocVar2 = this.zzd;
            zzchcVarZzN.zzL(zzcnbVar2, zzdocVar2.zzi, zzdocVar2.zzd);
        }
        if (!((Boolean) tVar.f3440c.zza(zzbcn.zzmH)).booleanValue() || zzchcVarZzN == null) {
            return;
        }
        zzchcVarZzN.zzM(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
    }
}

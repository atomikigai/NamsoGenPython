package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcjp implements zzdtw {
    private final Context zza;
    private final zzbkq zzb;
    private final zzciy zzc;
    private final zzcjp zzd = this;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;

    public /* synthetic */ zzcjp(zzciy zzciyVar, Context context, zzbkq zzbkqVar, zzckd zzckdVar) {
        this.zzc = zzciyVar;
        this.zza = context;
        this.zzb = zzbkqVar;
        zzhfx zzhfxVarZza = zzhfy.zza(this);
        this.zze = zzhfxVarZza;
        zzhfx zzhfxVarZza2 = zzhfy.zza(zzbkqVar);
        this.zzf = zzhfxVarZza2;
        zzdts zzdtsVar = new zzdts(zzhfxVarZza2);
        this.zzg = zzdtsVar;
        this.zzh = zzhfw.zzc(new zzdtu(zzhfxVarZza, zzdtsVar));
    }

    @Override // com.google.android.gms.internal.ads.zzdtw
    public final zzdtn zzb() {
        return new zzcjm(this.zzc, this.zzd, null);
    }

    @Override // com.google.android.gms.internal.ads.zzdtw
    public final zzdtt zzd() {
        return (zzdtt) this.zzh.zzb();
    }
}

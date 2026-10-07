package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcjd implements zzezu {
    private final zzciy zza;
    private final zzhgg zzb;
    private final zzhgg zzc;
    private final zzhgg zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;

    public /* synthetic */ zzcjd(zzciy zzciyVar, Context context, String str, zzckd zzckdVar) {
        this.zza = zzciyVar;
        zzhfx zzhfxVarZza = zzhfy.zza(context);
        this.zzb = zzhfxVarZza;
        zzhfx zzhfxVarZza2 = zzhfy.zza(str);
        this.zzc = zzhfxVarZza2;
        zzfcm zzfcmVar = new zzfcm(zzhfxVarZza, zzciyVar.zzbd, zzciyVar.zzbe);
        this.zzd = zzfcmVar;
        zzhgg zzhggVarZzc = zzhfw.zzc(new zzfas(zzciyVar.zzbd));
        this.zze = zzhggVarZzc;
        zzhgg zzhggVarZzc2 = zzhfw.zzc(new zzfau(zzhfxVarZza, zzciyVar.zzc, zzciyVar.zzS, zzfcmVar, zzhggVarZzc, zzffq.zza(), zzciyVar.zzl));
        this.zzf = zzhggVarZzc2;
        this.zzg = zzhfw.zzc(new zzfba(zzciyVar.zzS, zzhfxVarZza, zzhfxVarZza2, zzhggVarZzc2, zzhggVarZzc, zzciyVar.zzl, zzciyVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzezu
    public final zzfaz zza() {
        return (zzfaz) this.zzg.zzb();
    }
}

package com.google.android.gms.internal.ads;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcjw implements zzfen {
    private final zzciy zza;
    private final zzhgg zzb;
    private final zzhgg zzc;
    private final zzhgg zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;
    private final zzhgg zzi;

    public /* synthetic */ zzcjw(zzciy zzciyVar, Context context, String str, zzckd zzckdVar) {
        this.zza = zzciyVar;
        zzhfx zzhfxVarZza = zzhfy.zza(context);
        this.zzb = zzhfxVarZza;
        zzfcn zzfcnVar = new zzfcn(zzhfxVarZza, zzciyVar.zzbd, zzciyVar.zzbe);
        this.zzc = zzfcnVar;
        zzhgg zzhggVarZzc = zzhfw.zzc(new zzfdx(zzciyVar.zzbd));
        this.zzd = zzhggVarZzc;
        zzhgg zzhggVarZzc2 = zzhfw.zzc(zzffl.zza());
        this.zze = zzhggVarZzc2;
        zzhgg zzhggVarZzc3 = zzhfw.zzc(new zzfeh(zzhfxVarZza, zzciyVar.zzc, zzciyVar.zzS, zzfcnVar, zzhggVarZzc, zzffq.zza(), zzhggVarZzc2));
        this.zzf = zzhggVarZzc3;
        this.zzg = zzhfw.zzc(new zzfer(zzhggVarZzc3, zzhggVarZzc, zzhggVarZzc2));
        zzhfx zzhfxVarZzc = zzhfy.zzc(str);
        this.zzh = zzhfxVarZzc;
        this.zzi = zzhfw.zzc(new zzfel(zzhfxVarZzc, zzhggVarZzc3, zzhfxVarZza, zzhggVarZzc, zzhggVarZzc2, zzciyVar.zzl, zzciyVar.zzU, zzciyVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzfen
    public final zzfek zza() {
        return (zzfek) this.zzi.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzfen
    public final zzfeq zzb() {
        return (zzfeq) this.zzg.zzb();
    }
}

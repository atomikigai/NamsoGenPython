package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.q3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcju implements zzfcz {
    private final zzciy zza;
    private final zzhgg zzb;
    private final zzhgg zzc;
    private final zzhgg zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;

    public /* synthetic */ zzcju(zzciy zzciyVar, Context context, String str, q3 q3Var, zzckd zzckdVar) {
        this.zza = zzciyVar;
        zzhfx zzhfxVarZza = zzhfy.zza(context);
        this.zzb = zzhfxVarZza;
        zzhfx zzhfxVarZza2 = zzhfy.zza(q3Var);
        this.zzc = zzhfxVarZza2;
        zzhfx zzhfxVarZza3 = zzhfy.zza(str);
        this.zzd = zzhfxVarZza3;
        zzhgg zzhggVarZzc = zzhfw.zzc(new zzemt(zzciyVar.zzM));
        this.zze = zzhggVarZzc;
        zzhgg zzhggVarZzc2 = zzhfw.zzc(new zzfdx(zzciyVar.zzbd));
        this.zzf = zzhggVarZzc2;
        zzhgg zzhggVarZzc3 = zzhfw.zzc(new zzfcx(zzhfxVarZza, zzciyVar.zzc, zzciyVar.zzS, zzhggVarZzc, zzhggVarZzc2, zzffq.zza()));
        this.zzg = zzhggVarZzc3;
        this.zzh = zzhfw.zzc(new zzenb(zzhfxVarZza, zzhfxVarZza2, zzhfxVarZza3, zzhggVarZzc3, zzhggVarZzc, zzhggVarZzc2, zzciyVar.zzl, zzciyVar.zzU, zzciyVar.zzM));
    }

    @Override // com.google.android.gms.internal.ads.zzfcz
    public final zzena zza() {
        return (zzena) this.zzh.zzb();
    }
}

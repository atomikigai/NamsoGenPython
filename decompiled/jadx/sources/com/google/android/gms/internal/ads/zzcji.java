package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.q3;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcji implements zzfbi {
    private final Context zza;
    private final q3 zzb;
    private final String zzc;
    private final zzciy zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;
    private final zzhgg zzi;
    private final zzhgg zzj;

    public /* synthetic */ zzcji(zzciy zzciyVar, Context context, String str, q3 q3Var, zzckd zzckdVar) {
        this.zzd = zzciyVar;
        this.zza = context;
        this.zzb = q3Var;
        this.zzc = str;
        zzhfx zzhfxVarZza = zzhfy.zza(context);
        this.zze = zzhfxVarZza;
        zzhfx zzhfxVarZza2 = zzhfy.zza(q3Var);
        this.zzf = zzhfxVarZza2;
        zzhgg zzhggVarZzc = zzhfw.zzc(new zzemt(zzciyVar.zzM));
        this.zzg = zzhggVarZzc;
        zzhgg zzhggVarZzc2 = zzhfw.zzc(zzemy.zza());
        this.zzh = zzhggVarZzc2;
        zzhgg zzhggVarZzc3 = zzhfw.zzc(zzdbm.zza());
        this.zzi = zzhggVarZzc3;
        this.zzj = zzhfw.zzc(new zzfbg(zzhfxVarZza, zzciyVar.zzc, zzhfxVarZza2, zzciyVar.zzS, zzhggVarZzc, zzhggVarZzc2, zzffq.zza(), zzhggVarZzc3));
    }

    @Override // com.google.android.gms.internal.ads.zzfbi
    public final zzely zza() {
        return new zzely(this.zza, this.zzb, this.zzc, (zzfbf) this.zzj.zzb(), (zzems) this.zzg.zzb(), zzcid.zzc(this.zzd.zza), (zzdsm) this.zzd.zzM.zzb());
    }
}

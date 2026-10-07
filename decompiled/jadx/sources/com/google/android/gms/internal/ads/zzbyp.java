package com.google.android.gms.internal.ads;

import android.content.Context;
import h6.m0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbyp extends zzbyw {
    private final n7.a zzb;
    private final zzhgg zzc;
    private final zzhgg zzd;
    private final zzhgg zze;
    private final zzhgg zzf;
    private final zzhgg zzg;
    private final zzhgg zzh;
    private final zzhgg zzi;
    private final zzhgg zzj;

    public /* synthetic */ zzbyp(Context context, n7.a aVar, m0 m0Var, zzbyv zzbyvVar, zzbyq zzbyqVar) {
        this.zzb = aVar;
        zzhfx zzhfxVarZza = zzhfy.zza(context);
        this.zzc = zzhfxVarZza;
        zzhfx zzhfxVarZza2 = zzhfy.zza(m0Var);
        this.zzd = zzhfxVarZza2;
        this.zze = zzhfw.zzc(new zzbyj(zzhfxVarZza, zzhfxVarZza2));
        zzhfx zzhfxVarZza3 = zzhfy.zza(aVar);
        this.zzf = zzhfxVarZza3;
        zzhfx zzhfxVarZza4 = zzhfy.zza(zzbyvVar);
        this.zzg = zzhfxVarZza4;
        zzhgg zzhggVarZzc = zzhfw.zzc(new zzbyl(zzhfxVarZza3, zzhfxVarZza2, zzhfxVarZza4));
        this.zzh = zzhggVarZzc;
        zzbyn zzbynVar = new zzbyn(zzhfxVarZza3, zzhggVarZzc);
        this.zzi = zzbynVar;
        this.zzj = zzhfw.zzc(new zzbzb(zzhfxVarZza, zzbynVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbyw
    public final zzbyi zza() {
        return (zzbyi) this.zze.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbyw
    public final zzbym zzb() {
        return new zzbym(this.zzb, (zzbyk) this.zzh.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzbyw
    public final zzbza zzc() {
        return (zzbza) this.zzj.zzb();
    }
}

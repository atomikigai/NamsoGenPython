package com.google.android.gms.internal.ads;

import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdhp implements zzhfx {
    private final zzhgp zza;
    private final zzhgp zzb;
    private final zzhgp zzc;
    private final zzhgp zzd;
    private final zzhgp zze;
    private final zzhgp zzf;

    public zzdhp(zzhgp zzhgpVar, zzhgp zzhgpVar2, zzhgp zzhgpVar3, zzhgp zzhgpVar4, zzhgp zzhgpVar5, zzhgp zzhgpVar6) {
        this.zza = zzhgpVar;
        this.zzb = zzhgpVar2;
        this.zzc = zzhgpVar3;
        this.zzd = zzhgpVar4;
        this.zze = zzhgpVar5;
        this.zzf = zzhgpVar6;
    }

    @Override // com.google.android.gms.internal.ads.zzhgp, com.google.android.gms.internal.ads.zzhgo
    public final Object zzb() {
        zzchk zzchkVar = (zzchk) this.zza.zzb();
        zzcvu zzcvuVarZza = ((zzcwe) this.zzb).zza();
        zzdcf zzdcfVarZza = ((zzdcz) this.zzc).zza();
        zzdhe zzdheVarZza = ((zzdhg) this.zzd).zza();
        zzcze zzczeVarZzb = ((zzcpc) this.zze).zzb();
        zzeiv zzeivVar = (zzeiv) this.zzf.zzb();
        zzcqg zzcqgVarZze = zzchkVar.zze();
        zzcqgVarZze.zzi(zzcvuVarZza.zzj());
        zzcqgVarZze.zzf(zzdcfVarZza);
        zzcqgVarZze.zzd(zzdheVarZza);
        zzcqgVarZze.zze(new zzelb(null));
        zzcqgVarZze.zzg(new zzcri(zzczeVarZzb, null));
        zzcqgVarZze.zzc(new zzcpa(null));
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdJ)).booleanValue()) {
            zzcqgVarZze.zzj(zzeje.zzb(zzeivVar));
        }
        zzcrt zzcrtVarZzc = zzcqgVarZze.zzh().zzc();
        zzhgf.zzb(zzcrtVarZzc);
        return zzcrtVarZzc;
    }
}

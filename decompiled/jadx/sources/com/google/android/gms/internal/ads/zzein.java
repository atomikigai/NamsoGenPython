package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.ViewGroup;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzein extends zzeik {
    private final zzchk zza;
    private final zzcvu zzb;
    private final zzelb zzc;
    private final zzdcf zzd;
    private final zzdhe zze;
    private final zzcze zzf;
    private final ViewGroup zzg;
    private final zzdbk zzh;
    private final zzeiv zzi;
    private final zzefg zzj;

    public zzein(zzchk zzchkVar, zzcvu zzcvuVar, zzelb zzelbVar, zzdcf zzdcfVar, zzdhe zzdheVar, zzcze zzczeVar, ViewGroup viewGroup, zzdbk zzdbkVar, zzeiv zzeivVar, zzefg zzefgVar) {
        this.zza = zzchkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzelbVar;
        this.zzd = zzdcfVar;
        this.zze = zzdheVar;
        this.zzf = zzczeVar;
        this.zzg = viewGroup;
        this.zzh = zzdbkVar;
        this.zzi = zzeivVar;
        this.zzj = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik
    public final m9.a zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar) {
        zzcvu zzcvuVar = this.zzb;
        zzcvuVar.zzi(zzffoVar);
        zzcvuVar.zzf(bundle);
        zzcvuVar.zzg(new zzcvo(zzfffVar, zzfetVar, this.zzi));
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdG)).booleanValue()) {
            this.zzb.zzd(this.zzj);
        }
        zzchk zzchkVar = this.zza;
        zzcvu zzcvuVar2 = this.zzb;
        zzcqg zzcqgVarZze = zzchkVar.zze();
        zzcqgVarZze.zzi(zzcvuVar2.zzj());
        zzcqgVarZze.zzf(this.zzd);
        zzcqgVarZze.zze(this.zzc);
        zzcqgVarZze.zzd(this.zze);
        zzcqgVarZze.zzg(new zzcri(this.zzf, this.zzh));
        zzcqgVarZze.zzc(new zzcpa(this.zzg));
        zzcsy zzcsyVarZzd = zzcqgVarZze.zzk().zzd();
        return zzcsyVarZzd.zzi(zzcsyVarZzd.zzj());
    }
}

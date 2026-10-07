package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeip extends zzeik {
    private final zzchk zza;
    private final zzcvu zzb;
    private final zzelb zzc;
    private final zzdcf zzd;
    private final zzeiv zze;
    private final zzefg zzf;

    public zzeip(zzchk zzchkVar, zzcvu zzcvuVar, zzelb zzelbVar, zzdcf zzdcfVar, zzeiv zzeivVar, zzefg zzefgVar) {
        this.zza = zzchkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzelbVar;
        this.zzd = zzdcfVar;
        this.zze = zzeivVar;
        this.zzf = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik
    public final m9.a zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar) {
        zzcvu zzcvuVar = this.zzb;
        zzcvuVar.zzi(zzffoVar);
        zzcvuVar.zzf(bundle);
        zzcvuVar.zzg(new zzcvo(zzfffVar, zzfetVar, this.zze));
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdG)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzchk zzchkVar = this.zza;
        zzcvu zzcvuVar2 = this.zzb;
        zzdgm zzdgmVarZzg = zzchkVar.zzg();
        zzdgmVarZzg.zze(zzcvuVar2.zzj());
        zzdgmVarZzg.zzd(this.zzd);
        zzdgmVarZzg.zzc(this.zzc);
        zzcsy zzcsyVarZza = zzdgmVarZzg.zzf().zza();
        return zzcsyVarZza.zzi(zzcsyVarZza.zzj());
    }
}

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeii extends zzeik {
    private final zzchk zza;
    private final zzdhe zzb;
    private final zzcvu zzc;
    private final zzdcf zzd;
    private final zzeiv zze;
    private final zzefg zzf;

    public zzeii(zzchk zzchkVar, zzdhe zzdheVar, zzcvu zzcvuVar, zzdcf zzdcfVar, zzeiv zzeivVar, zzefg zzefgVar) {
        this.zza = zzchkVar;
        this.zzb = zzdheVar;
        this.zzc = zzcvuVar;
        this.zzd = zzdcfVar;
        this.zze = zzeivVar;
        this.zzf = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik
    public final m9.a zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar) {
        zzcvu zzcvuVar = this.zzc;
        zzcvuVar.zzi(zzffoVar);
        zzcvuVar.zzf(bundle);
        zzcvuVar.zzg(new zzcvo(zzfffVar, zzfetVar, this.zze));
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdG)).booleanValue()) {
            this.zzc.zzd(this.zzf);
        }
        zzchk zzchkVar = this.zza;
        zzcvu zzcvuVar2 = this.zzc;
        zzdhi zzdhiVarZzh = zzchkVar.zzh();
        zzdhiVarZzh.zzf(zzcvuVar2.zzj());
        zzdhiVarZzh.zze(this.zzd);
        zzdhiVarZzh.zzd(this.zzb);
        zzdhiVarZzh.zzc(new zzcpa(null));
        zzcsy zzcsyVarZza = zzdhiVarZzh.zzg().zza();
        return zzcsyVarZza.zzi(zzcsyVarZza.zzj());
    }
}

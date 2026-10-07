package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeil extends zzeik {
    private final zzchk zza;
    private final zzcvu zzb;
    private final zzdcf zzc;
    private final zzeiv zzd;
    private final zzefg zze;

    public zzeil(zzchk zzchkVar, zzcvu zzcvuVar, zzdcf zzdcfVar, zzeiv zzeivVar, zzefg zzefgVar) {
        this.zza = zzchkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzdcfVar;
        this.zzd = zzeivVar;
        this.zze = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik
    public final m9.a zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar) {
        zzcvu zzcvuVar = this.zzb;
        zzcvuVar.zzi(zzffoVar);
        zzcvuVar.zzf(bundle);
        zzcvuVar.zzg(new zzcvo(zzfffVar, zzfetVar, this.zzd));
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdG)).booleanValue()) {
            this.zzb.zzd(this.zze);
        }
        zzchk zzchkVar = this.zza;
        zzcvu zzcvuVar2 = this.zzb;
        zzcoq zzcoqVarZzd = zzchkVar.zzd();
        zzcoqVarZzd.zzd(zzcvuVar2.zzj());
        zzcoqVarZzd.zzc(this.zzc);
        zzcsy zzcsyVarZzb = zzcoqVarZzd.zze().zzb();
        return zzcsyVarZzb.zzi(zzcsyVarZzb.zzj());
    }
}

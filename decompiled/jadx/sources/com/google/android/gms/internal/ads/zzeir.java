package com.google.android.gms.internal.ads;

import android.os.Bundle;
import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeir extends zzeik {
    private final zzchk zza;
    private final zzcvu zzb;
    private final zzdcf zzc;
    private final zzeiv zzd;
    private final zzffg zze;
    private final zzefg zzf;

    public zzeir(zzchk zzchkVar, zzcvu zzcvuVar, zzdcf zzdcfVar, zzffg zzffgVar, zzeiv zzeivVar, zzefg zzefgVar) {
        this.zza = zzchkVar;
        this.zzb = zzcvuVar;
        this.zzc = zzdcfVar;
        this.zze = zzffgVar;
        this.zzd = zzeivVar;
        this.zzf = zzefgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeik
    public final m9.a zzc(zzffo zzffoVar, Bundle bundle, zzfet zzfetVar, zzfff zzfffVar) {
        zzffg zzffgVar;
        zzcvu zzcvuVar = this.zzb;
        zzcvuVar.zzi(zzffoVar);
        zzcvuVar.zzf(bundle);
        zzcvuVar.zzg(new zzcvo(zzfffVar, zzfetVar, this.zzd));
        zzbce zzbceVar = zzbcn.zzdF;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue() && (zzffgVar = this.zze) != null) {
            this.zzb.zzh(zzffgVar);
        }
        if (((Boolean) tVar.f3440c.zza(zzbcn.zzdG)).booleanValue()) {
            this.zzb.zzd(this.zzf);
        }
        zzchk zzchkVar = this.zza;
        zzcvu zzcvuVar2 = this.zzb;
        zzdov zzdovVarZzi = zzchkVar.zzi();
        zzdovVarZzi.zzd(zzcvuVar2.zzj());
        zzdovVarZzi.zzc(this.zzc);
        zzcsy zzcsyVarZzb = zzdovVarZzi.zze().zzb();
        return zzcsyVarZzb.zzi(zzcsyVarZzb.zzj());
    }
}

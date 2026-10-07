package com.google.android.gms.internal.ads;

import e6.h2;
import e6.t;
import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzezy implements zzgee {
    final /* synthetic */ zzenh zza;
    final /* synthetic */ zzfkl zzb;
    final /* synthetic */ zzfka zzc;
    final /* synthetic */ zzezz zzd;
    final /* synthetic */ zzfab zze;

    public zzezy(zzfab zzfabVar, zzenh zzenhVar, zzfkl zzfklVar, zzfka zzfkaVar, zzezz zzezzVar) {
        this.zza = zzenhVar;
        this.zzb = zzfklVar;
        this.zzc = zzfkaVar;
        this.zzd = zzezzVar;
        this.zze = zzfabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        zzfkl zzfklVar;
        zzbce zzbceVar = zzbcn.zzfH;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            k0.l("App open ad failed to load", th);
        }
        zzcon zzconVar = (zzcon) this.zze.zze.zzd();
        final h2 h2VarZzb = zzconVar == null ? zzfgq.zzb(th, null) : zzconVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (zzconVar != null) {
                    zzconVar.zzc().zzdB(h2VarZzb);
                    if (((Boolean) tVar.f3440c.zza(zzbcn.zzhP)).booleanValue()) {
                        this.zze.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzezx
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.zza.zze.zzd.zzdB(h2VarZzb);
                            }
                        });
                    }
                } else {
                    this.zze.zzd.zzdB(h2VarZzb);
                    ((zzcon) this.zze.zzm(this.zzd).zzh()).zzb().zzc().zzh();
                }
                zzfgl.zzb(h2VarZzb.f3314a, th, "AppOpenAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbeg.zzc.zze()).booleanValue() || (zzfklVar = this.zzb) == null) {
                    zzfko zzfkoVar = this.zze.zzh;
                    zzfka zzfkaVar = this.zzc;
                    zzfkaVar.zza(h2VarZzb);
                    zzfkaVar.zzh(th);
                    zzfkaVar.zzg(false);
                    zzfkoVar.zzb(zzfkaVar.zzm());
                } else {
                    zzfklVar.zzc(h2VarZzb);
                    zzfka zzfkaVar2 = this.zzc;
                    zzfkaVar2.zzh(th);
                    zzfkaVar2.zzg(false);
                    zzfklVar.zza(zzfkaVar2);
                    zzfklVar.zzh();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        zzfkl zzfklVar;
        zzcrq zzcrqVar = (zzcrq) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzj = null;
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzhP)).booleanValue()) {
                    zzcrqVar.zzo().zzb(this.zze.zzd);
                }
                this.zza.zzb(zzcrqVar);
                if (!((Boolean) zzbeg.zzc.zze()).booleanValue() || (zzfklVar = this.zzb) == null) {
                    zzfko zzfkoVar = this.zze.zzh;
                    zzfka zzfkaVar = this.zzc;
                    zzfkaVar.zzb(zzcrqVar.zzq().zzb);
                    zzfkaVar.zzd(zzcrqVar.zzm().zzg());
                    zzfkaVar.zzg(true);
                    zzfkoVar.zzb(zzfkaVar.zzm());
                } else {
                    zzfklVar.zzg(zzcrqVar.zzq().zzb);
                    zzfklVar.zze(zzcrqVar.zzm().zzg());
                    zzfka zzfkaVar2 = this.zzc;
                    zzfkaVar2.zzg(true);
                    zzfklVar.zza(zzfkaVar2);
                    zzfklVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

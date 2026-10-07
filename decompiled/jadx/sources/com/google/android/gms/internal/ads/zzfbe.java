package com.google.android.gms.internal.ads;

import e6.t;
import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfbe implements zzgee {
    final /* synthetic */ zzfkl zza;
    final /* synthetic */ zzfka zzb;
    final /* synthetic */ zzcqh zzc;
    final /* synthetic */ zzfbf zzd;

    public zzfbe(zzfbf zzfbfVar, zzfkl zzfklVar, zzfka zzfkaVar, zzcqh zzcqhVar) {
        this.zza = zzfklVar;
        this.zzb = zzfkaVar;
        this.zzc = zzcqhVar;
        this.zzd = zzfbfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        zzfkl zzfklVar;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfH)).booleanValue()) {
            k0.l("Banner ad failed to load", th);
        }
        this.zzd.zzn = this.zzc.zzd().zza(th);
        synchronized (this.zzd) {
            try {
                this.zzc.zzf().zzdB(this.zzd.zzn);
                zzfgl.zzb(this.zzd.zzn.f3314a, th, "BannerAdLoader.onFailure");
                zzfbf zzfbfVar = this.zzd;
                if (zzfbfVar.zzm) {
                    zzfbfVar.zzu();
                    zzfbf zzfbfVar2 = this.zzd;
                    zzfbfVar2.zzh.zzd(zzfbfVar2.zzj.zzc());
                }
                if (!((Boolean) zzbeg.zzc.zze()).booleanValue() || (zzfklVar = this.zza) == null) {
                    zzfbf zzfbfVar3 = this.zzd;
                    zzfko zzfkoVar = zzfbfVar3.zzi;
                    zzfka zzfkaVar = this.zzb;
                    zzfkaVar.zza(zzfbfVar3.zzn);
                    zzfkaVar.zzh(th);
                    zzfkaVar.zzg(false);
                    zzfkoVar.zzb(zzfkaVar.zzm());
                } else {
                    zzfklVar.zzc(this.zzd.zzn);
                    zzfka zzfkaVar2 = this.zzb;
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
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfkl zzfklVar;
        zzcpd zzcpdVar = (zzcpd) obj;
        synchronized (this.zzd) {
            try {
                zzfbf zzfbfVar = this.zzd;
                if (zzfbfVar.zzm) {
                    zzfbfVar.zzr();
                }
                if (!((Boolean) zzbeg.zzc.zze()).booleanValue() || (zzfklVar = this.zza) == null) {
                    zzfko zzfkoVar = this.zzd.zzi;
                    zzfka zzfkaVar = this.zzb;
                    zzfkaVar.zzb(zzcpdVar.zzq().zzb);
                    zzfkaVar.zzd(zzcpdVar.zzm().zzg());
                    zzfkaVar.zzg(true);
                    zzfkoVar.zzb(zzfkaVar.zzm());
                } else {
                    zzfklVar.zzg(zzcpdVar.zzq().zzb);
                    zzfklVar.zze(zzcpdVar.zzm().zzg());
                    zzfka zzfkaVar2 = this.zzb;
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

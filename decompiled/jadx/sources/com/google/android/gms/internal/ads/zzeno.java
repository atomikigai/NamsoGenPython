package com.google.android.gms.internal.ads;

import e6.h2;
import e6.t;
import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzeno implements zzgee {
    final /* synthetic */ zzenh zza;
    final /* synthetic */ zzfkl zzb;
    final /* synthetic */ zzfka zzc;
    final /* synthetic */ zzdhj zzd;
    final /* synthetic */ zzenp zze;

    public zzeno(zzenp zzenpVar, zzenh zzenhVar, zzfkl zzfklVar, zzfka zzfkaVar, zzdhj zzdhjVar) {
        this.zza = zzenhVar;
        this.zzb = zzfklVar;
        this.zzc = zzfkaVar;
        this.zzd = zzdhjVar;
        this.zze = zzenpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        zzfkl zzfklVar;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfH)).booleanValue()) {
            k0.l("Native ad failed to load", th);
        }
        final h2 h2VarZza = this.zzd.zza().zza(th);
        this.zzd.zzb().zzdB(h2VarZza);
        this.zze.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenn
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zze.zzd.zza().zzdB(h2VarZza);
            }
        });
        zzfgl.zzb(h2VarZza.f3314a, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (((Boolean) zzbeg.zzc.zze()).booleanValue() && (zzfklVar = this.zzb) != null) {
            zzfklVar.zzc(h2VarZza);
            zzfka zzfkaVar = this.zzc;
            zzfkaVar.zzh(th);
            zzfkaVar.zzg(false);
            zzfklVar.zza(zzfkaVar);
            zzfklVar.zzh();
            return;
        }
        zzenp zzenpVar = this.zze;
        zzfka zzfkaVar2 = this.zzc;
        zzfko zzfkoVar = zzenpVar.zze;
        zzfkaVar2.zza(h2VarZza);
        zzfkaVar2.zzh(th);
        zzfkaVar2.zzg(false);
        zzfkoVar.zzb(zzfkaVar2.zzm());
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfkl zzfklVar;
        zzcrq zzcrqVar = (zzcrq) obj;
        synchronized (this.zze) {
            try {
                zzcrqVar.zzo().zza(this.zze.zzd.zzd());
                this.zza.zzb(zzcrqVar);
                this.zze.zzb.zzC().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzenm
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zze.zzd.zzb().zzs();
                    }
                });
                if (!((Boolean) zzbeg.zzc.zze()).booleanValue() || (zzfklVar = this.zzb) == null) {
                    zzfko zzfkoVar = this.zze.zze;
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

package com.google.android.gms.internal.ads;

import e6.h2;
import e6.t;
import h6.k0;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfed implements zzgee {
    final /* synthetic */ zzenh zza;
    final /* synthetic */ zzfkl zzb;
    final /* synthetic */ zzfka zzc;
    final /* synthetic */ zzfee zzd;
    final /* synthetic */ zzfeg zze;

    public zzfed(zzfeg zzfegVar, zzenh zzenhVar, zzfkl zzfklVar, zzfka zzfkaVar, zzfee zzfeeVar) {
        this.zza = zzenhVar;
        this.zzb = zzfklVar;
        this.zzc = zzfkaVar;
        this.zzd = zzfeeVar;
        this.zze = zzfegVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        zzfkl zzfklVar;
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzfH)).booleanValue()) {
            k0.l("Rewarded ad failed to load", th);
        }
        zzdow zzdowVar = (zzdow) this.zze.zze.zzd();
        final h2 h2VarZzb = zzdowVar == null ? zzfgq.zzb(th, null) : zzdowVar.zzb().zza(th);
        synchronized (this.zze) {
            try {
                if (zzdowVar != null) {
                    zzdowVar.zza().zzdB(h2VarZzb);
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfeb
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdB(h2VarZzb);
                        }
                    });
                } else {
                    this.zze.zzd.zzdB(h2VarZzb);
                    this.zze.zzk(this.zzd).zzh().zzb().zzc().zzh();
                }
                zzfgl.zzb(h2VarZzb.f3314a, th, "RewardedAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbeg.zzc.zze()).booleanValue() || (zzfklVar = this.zzb) == null) {
                    zzfko zzfkoVar = this.zze.zzg;
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
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfkl zzfklVar;
        zzdor zzdorVar = (zzdor) obj;
        synchronized (this.zze) {
            try {
                zzdorVar.zzo().zzd(this.zze.zzd);
                this.zza.zzb(zzdorVar);
                zzfeg zzfegVar = this.zze;
                Executor executor = zzfegVar.zzb;
                final zzfdw zzfdwVar = zzfegVar.zzd;
                Objects.requireNonNull(zzfdwVar);
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfec
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfdwVar.zzs();
                    }
                });
                this.zze.zzd.onAdMetadataChanged();
                if (!((Boolean) zzbeg.zzc.zze()).booleanValue() || (zzfklVar = this.zzb) == null) {
                    zzfko zzfkoVar = this.zze.zzg;
                    zzfka zzfkaVar = this.zzc;
                    zzfkaVar.zzb(zzdorVar.zzq().zzb);
                    zzfkaVar.zzd(zzdorVar.zzm().zzg());
                    zzfkaVar.zzg(true);
                    zzfkoVar.zzb(zzfkaVar.zzm());
                } else {
                    zzfklVar.zzg(zzdorVar.zzq().zzb);
                    zzfklVar.zze(zzdorVar.zzm().zzg());
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

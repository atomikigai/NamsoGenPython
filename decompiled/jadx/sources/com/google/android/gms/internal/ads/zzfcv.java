package com.google.android.gms.internal.ads;

import e6.h2;
import e6.t;
import h6.k0;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfcv implements zzgee {
    final /* synthetic */ zzenh zza;
    final /* synthetic */ zzfkl zzb;
    final /* synthetic */ zzfka zzc;
    final /* synthetic */ zzdgn zzd;
    final /* synthetic */ zzfcw zze;

    public zzfcv(zzfcw zzfcwVar, zzenh zzenhVar, zzfkl zzfklVar, zzfka zzfkaVar, zzdgn zzdgnVar) {
        this.zza = zzenhVar;
        this.zzb = zzfklVar;
        this.zzc = zzfkaVar;
        this.zzd = zzdgnVar;
        this.zze = zzfcwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        zzfkl zzfklVar;
        zzbce zzbceVar = zzbcn.zzfH;
        t tVar = t.f3437d;
        if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
            k0.l("Interstitial ad failed to load", th);
        }
        final h2 h2VarZza = this.zzd.zza().zza(th);
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                this.zzd.zzb().zzdB(h2VarZza);
                if (((Boolean) tVar.f3440c.zza(zzbcn.zzhQ)).booleanValue()) {
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcr
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzdB(h2VarZza);
                        }
                    });
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcs
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zze.zzdB(h2VarZza);
                        }
                    });
                }
                zzfgl.zzb(h2VarZza.f3314a, th, "InterstitialAdLoader.onFailure");
                this.zza.zza();
                if (!((Boolean) zzbeg.zzc.zze()).booleanValue() || (zzfklVar = this.zzb) == null) {
                    zzfko zzfkoVar = this.zze.zzg;
                    zzfka zzfkaVar = this.zzc;
                    zzfkaVar.zza(h2VarZza);
                    zzfkaVar.zzh(th);
                    zzfkaVar.zzg(false);
                    zzfkoVar.zzb(zzfkaVar.zzm());
                } else {
                    zzfklVar.zzc(h2VarZza);
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
        zzdfj zzdfjVar = (zzdfj) obj;
        synchronized (this.zze) {
            try {
                this.zze.zzi = null;
                zzbce zzbceVar = zzbcn.zzhQ;
                t tVar = t.f3437d;
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                    zzdas zzdasVarZzo = zzdfjVar.zzo();
                    zzdasVarZzo.zza(this.zze.zzd);
                    zzdasVarZzo.zzd(this.zze.zze);
                }
                this.zza.zzb(zzdfjVar);
                if (((Boolean) tVar.f3440c.zza(zzbceVar)).booleanValue()) {
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfct
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zzd.zzs();
                        }
                    });
                    this.zze.zzb.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfcu
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.zze.zze.zzs();
                        }
                    });
                }
                if (!((Boolean) zzbeg.zzc.zze()).booleanValue() || (zzfklVar = this.zzb) == null) {
                    zzfko zzfkoVar = this.zze.zzg;
                    zzfka zzfkaVar = this.zzc;
                    zzfkaVar.zzb(zzdfjVar.zzq().zzb);
                    zzfkaVar.zzd(zzdfjVar.zzm().zzg());
                    zzfkaVar.zzg(true);
                    zzfkoVar.zzb(zzfkaVar.zzm());
                } else {
                    zzfklVar.zzg(zzdfjVar.zzq().zzb);
                    zzfklVar.zze(zzdfjVar.zzm().zzg());
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

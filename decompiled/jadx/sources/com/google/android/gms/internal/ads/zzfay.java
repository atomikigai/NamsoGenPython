package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfay implements zzenh {
    final /* synthetic */ zzfaz zza;

    public zzfay(zzfaz zzfazVar) {
        this.zza = zzfazVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcox zzcoxVar = (zzcox) obj;
        synchronized (this.zza) {
            try {
                zzcox zzcoxVar2 = this.zza.zza;
                if (zzcoxVar2 != null) {
                    zzcoxVar2.zzb();
                }
                zzfaz zzfazVar = this.zza;
                zzfazVar.zza = zzcoxVar;
                zzcoxVar.zzc(zzfazVar);
                zzfaz zzfazVar2 = this.zza;
                zzfazVar2.zzg.zzk(new zzcoy(zzcoxVar, zzfazVar2, zzfazVar2.zzg, zzfazVar2.zzi));
                zzcoxVar.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

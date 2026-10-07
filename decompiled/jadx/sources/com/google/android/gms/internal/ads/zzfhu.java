package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfhu implements zzgee {
    final /* synthetic */ zzfhx zza;
    final /* synthetic */ zzfhy zzb;

    public zzfhu(zzfhy zzfhyVar, zzfhx zzfhxVar) {
        this.zza = zzfhxVar;
        this.zzb = zzfhyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        synchronized (this.zzb) {
            try {
                this.zzb.zze = null;
                this.zzb.zzd.addFirst(this.zza);
                zzfhy zzfhyVar = this.zzb;
                if (zzfhyVar.zzf == 1) {
                    zzfhyVar.zzh();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

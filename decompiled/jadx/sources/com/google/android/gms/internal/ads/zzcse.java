package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcse implements zzgee {
    final /* synthetic */ zzgee zza;
    final /* synthetic */ zzcsf zzb;

    public zzcse(zzcsf zzcsfVar, zzgee zzgeeVar) {
        this.zza = zzgeeVar;
        this.zzb = zzcsfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
        this.zza.zza(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcrz
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zzd();
            }
        });
        this.zza.zzb((zzcrq) obj);
    }
}

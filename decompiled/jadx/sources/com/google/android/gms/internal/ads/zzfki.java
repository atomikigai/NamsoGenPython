package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfki implements zzgee {
    final /* synthetic */ zzfkl zza;
    final /* synthetic */ zzfka zzb;
    final /* synthetic */ boolean zzc;

    public zzfki(zzfkl zzfklVar, zzfka zzfkaVar, boolean z4) {
        this.zza = zzfklVar;
        this.zzb = zzfkaVar;
        this.zzc = z4;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        zzfka zzfkaVar = this.zzb;
        if (zzfkaVar.zzk()) {
            zzfkl zzfklVar = this.zza;
            zzfkaVar.zzh(th);
            zzfkaVar.zzg(false);
            zzfklVar.zza(zzfkaVar);
            if (this.zzc) {
                this.zza.zzh();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        zzfka zzfkaVar = this.zzb;
        zzfkaVar.zzg(true);
        this.zza.zza(zzfkaVar);
        if (this.zzc) {
            this.zza.zzh();
        }
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfkj implements zzgee {
    final /* synthetic */ zzfkl zza;
    final /* synthetic */ zzfka zzb;

    public zzfkj(zzfkl zzfklVar, zzfka zzfkaVar) {
        this.zza = zzfklVar;
        this.zzb = zzfkaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        zzfka zzfkaVar = this.zzb;
        zzfkaVar.zzh(th);
        zzfkaVar.zzg(false);
        this.zza.zza(zzfkaVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzbyb implements zzgee {
    final /* synthetic */ m9.a zza;

    public zzbyb(zzbyc zzbycVar, m9.a aVar) {
        this.zza = aVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        zzbyc.zzc.remove(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzbyc.zzc.remove(this.zza);
    }
}

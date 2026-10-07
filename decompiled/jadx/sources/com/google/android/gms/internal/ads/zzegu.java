package com.google.android.gms.internal.ads;

import e6.h2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzegu implements zzgee {
    final /* synthetic */ zzegv zza;

    public zzegu(zzegv zzegvVar) {
        this.zza = zzegvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        h2 h2VarZza = this.zza.zza.zzd().zza(th);
        this.zza.zzd.zzdB(h2VarZza);
        zzfgl.zzb(h2VarZza.f3314a, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* synthetic */ void zzb(Object obj) {
        ((zzcpd) obj).zzk();
    }
}

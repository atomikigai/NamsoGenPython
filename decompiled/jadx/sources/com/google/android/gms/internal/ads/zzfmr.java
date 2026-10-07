package com.google.android.gms.internal.ads;

import e6.h2;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfmr extends zzbxi {
    final /* synthetic */ zzgfa zza;
    final /* synthetic */ zzbxc zzb;
    final /* synthetic */ zzfms zzc;

    public zzfmr(zzfms zzfmsVar, zzgfa zzgfaVar, zzbxc zzbxcVar) {
        this.zza = zzgfaVar;
        this.zzb = zzbxcVar;
        this.zzc = zzfmsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzf(h2 h2Var) {
        h.g("Failed to load rewarded ad with error: " + h2Var.h().toString() + ", adUnitId: " + this.zzc.zze.f3318a);
        new zzfmn(this.zzc, this.zza).zza(h2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzg() {
        new zzfmn(this.zzc, this.zza).zzb(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zze(int i) {
    }
}

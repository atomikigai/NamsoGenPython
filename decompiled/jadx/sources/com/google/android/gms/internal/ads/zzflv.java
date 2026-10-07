package com.google.android.gms.internal.ads;

import e6.h2;
import e6.h3;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzflv extends zzbah {
    final /* synthetic */ zzgfa zza;
    final /* synthetic */ h3 zzb;
    final /* synthetic */ zzflw zzc;

    public zzflv(zzflw zzflwVar, zzgfa zzgfaVar, h3 h3Var) {
        this.zza = zzgfaVar;
        this.zzb = h3Var;
        this.zzc = zzflwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzc(h2 h2Var) {
        h.g("Failed to load app open ad with error parcel: " + h2Var.h().toString() + " for ad unit: " + this.zzb.f3318a);
        new zzfmn(this.zzc, this.zza).zza(h2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzd(zzbaf zzbafVar) {
        new zzfmn(this.zzc, this.zza).zzb(zzbafVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzb(int i) {
    }
}

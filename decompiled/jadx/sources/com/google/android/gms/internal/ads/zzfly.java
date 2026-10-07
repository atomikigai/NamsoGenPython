package com.google.android.gms.internal.ads;

import e6.b0;
import e6.h2;
import e6.m0;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfly extends b0 {
    final /* synthetic */ zzgfa zza;
    final /* synthetic */ m0 zzb;
    final /* synthetic */ zzflz zzc;

    public zzfly(zzflz zzflzVar, zzgfa zzgfaVar, m0 m0Var) {
        this.zza = zzgfaVar;
        this.zzb = m0Var;
        this.zzc = zzflzVar;
    }

    @Override // e6.c0
    public final void zzb(h2 h2Var) {
        h.g("Failed to load interstitial ad with error: " + h2Var.h().toString() + " for ad unit: " + this.zzc.zze.f3318a);
        new zzfmn(this.zzc, this.zza).zza(h2Var);
    }

    @Override // e6.c0
    public final void zzc() {
        new zzfmn(this.zzc, this.zza).zzb(this.zzb);
    }
}

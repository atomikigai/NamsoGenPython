package com.google.android.gms.internal.ads;

import e6.h2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbaa extends zzbah {
    private final y5.a zza;
    private final String zzb;

    public zzbaa(y5.a aVar, String str) {
        this.zza = aVar;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzc(h2 h2Var) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(h2Var.h());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzd(zzbaf zzbafVar) {
        if (this.zza != null) {
            this.zza.onAdLoaded(new zzbab(zzbafVar, this.zzb));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbai
    public final void zzb(int i) {
    }
}

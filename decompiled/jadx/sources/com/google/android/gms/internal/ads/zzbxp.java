package com.google.android.gms.internal.ads;

import e6.h2;
import r6.c;
import r6.d;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxp extends zzbxi {
    private final d zza;
    private final c zzb;

    public zzbxp(d dVar, c cVar) {
        this.zza = dVar;
        this.zzb = cVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzf(h2 h2Var) {
        if (this.zza != null) {
            this.zza.onAdFailedToLoad(h2Var.h());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzg() {
        d dVar = this.zza;
        if (dVar != null) {
            dVar.onAdLoaded(this.zzb);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zze(int i) {
    }
}

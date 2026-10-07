package com.google.android.gms.internal.ads;

import e6.h2;
import s6.b;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxv extends zzbxi {
    private final b zza;
    private final zzbxw zzb;

    public zzbxv(b bVar, zzbxw zzbxwVar) {
        this.zza = bVar;
        this.zzb = zzbxwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzf(h2 h2Var) {
        b bVar = this.zza;
        if (bVar != null) {
            bVar.onAdFailedToLoad(h2Var.h());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zzg() {
        zzbxw zzbxwVar;
        b bVar = this.zza;
        if (bVar == null || (zzbxwVar = this.zzb) == null) {
            return;
        }
        bVar.onAdLoaded(zzbxwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbxj
    public final void zze(int i) {
    }
}

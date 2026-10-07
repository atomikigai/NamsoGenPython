package com.google.android.gms.internal.ads;

import e6.h2;
import e6.h3;
import i6.h;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfmn extends zzflu {
    final /* synthetic */ zzfmo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfmn(zzfmo zzfmoVar, zzgfa zzgfaVar) {
        super(zzgfaVar);
        this.zza = zzfmoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zza(h2 h2Var) {
        this.zza.zzj.set(false);
        int i = h2Var.f3314a;
        if (i != 1 && i != 8 && i != 10 && i != 11) {
            this.zza.zzo(true);
            return;
        }
        h3 h3Var = this.zza.zze;
        h.f("Preloading " + h3Var.f3319b + ", for adUnitId:" + h3Var.f3318a + ", Ad load failed. Stop preloading due to non-retriable error:");
        this.zza.zzf.set(false);
    }
}

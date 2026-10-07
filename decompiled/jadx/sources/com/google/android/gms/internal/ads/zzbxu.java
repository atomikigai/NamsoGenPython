package com.google.android.gms.internal.ads;

import e6.h2;
import w5.k;
import w5.q;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbxu extends zzbxe {
    private k zza;
    private q zzb;

    public final void zzb(k kVar) {
        this.zza = kVar;
    }

    public final void zzc(q qVar) {
        this.zzb = qVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzg() {
        k kVar = this.zza;
        if (kVar != null) {
            kVar.a();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzi(h2 h2Var) {
        k kVar = this.zza;
        if (kVar != null) {
            kVar.b(h2Var.g());
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzj() {
        k kVar = this.zza;
        if (kVar != null) {
            kVar.c();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzk(zzbwz zzbwzVar) {
        q qVar = this.zzb;
        if (qVar != null) {
            qVar.onUserEarnedReward(new zzbxm(zzbwzVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzbxf
    public final void zzh(int i) {
    }
}

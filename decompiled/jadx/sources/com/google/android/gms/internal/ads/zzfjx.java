package com.google.android.gms.internal.ads;

import android.content.Context;
import e6.h2;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzfjx implements zzddq, zzcxc, zzddu {
    private final zzfkl zza;
    private final zzfka zzb;

    public zzfjx(Context context, zzfkl zzfklVar) {
        this.zza = zzfklVar;
        this.zzb = zzfjz.zza(context, 13);
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zzb() {
        if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
            zzfkl zzfklVar = this.zza;
            zzfka zzfkaVar = this.zzb;
            zzfkaVar.zzg(true);
            zzfklVar.zza(zzfkaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzl() {
        if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
            this.zzb.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxc
    public final void zzq(h2 h2Var) {
        if (((Boolean) zzbeg.zzd.zze()).booleanValue()) {
            zzfkl zzfklVar = this.zza;
            zzfka zzfkaVar = this.zzb;
            zzfkaVar.zzc(h2Var.g().toString());
            zzfkaVar.zzg(false);
            zzfklVar.zza(zzfkaVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzddu
    public final void zza() {
    }

    @Override // com.google.android.gms.internal.ads.zzddq
    public final void zzk() {
    }
}

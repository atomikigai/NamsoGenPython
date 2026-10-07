package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdyp implements zzczj {
    private final Context zza;
    private final zzbyv zzb;

    public zzdyp(Context context, zzbyv zzbyvVar) {
        this.zza = context;
        this.zzb = zzbyvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
        if (TextUtils.isEmpty(zzfffVar.zzb.zzb.zze)) {
            return;
        }
        this.zzb.zzm(this.zza, zzfffVar.zza.zza.zzd);
        this.zzb.zzi(this.zza, zzfffVar.zzb.zzb.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
    }
}

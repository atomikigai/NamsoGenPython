package com.google.android.gms.internal.ads;

import android.content.Context;
import h6.o;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdye implements zzgee {
    final /* synthetic */ Context zza;

    public zzdye(Context context) {
        this.zza = context;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th) {
        if (((Boolean) zzbef.zzh.zze()).booleanValue() && (th instanceof o)) {
            zzbbx.zze(this.zza);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        if (((Boolean) zzbef.zzj.zze()).booleanValue()) {
            zzbbx.zze(this.zza);
        }
    }
}

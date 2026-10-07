package com.google.android.gms.internal.ads;

import android.content.Context;
import d6.p;
import e6.t;
import o6.r;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzdwp implements zzczj, zzdex {
    private final Context zza;
    private final zzdsm zzb;

    public zzdwp(Context context, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = zzdsmVar;
    }

    private final void zzd(final Context context) {
        if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzeF)).booleanValue()) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdwo
                @Override // java.lang.Runnable
                public final void run() {
                    this.zza.zzc(context);
                }
            });
        }
    }

    public final void zzc(Context context) {
        p.C.f2986m.zzb(context, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zze(r rVar) {
        zzd(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzdex
    public final void zzf(String str) {
    }
}

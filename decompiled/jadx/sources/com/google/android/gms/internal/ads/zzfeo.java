package com.google.android.gms.internal.ads;

import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfeo implements zzenh {
    final /* synthetic */ zzfeq zza;

    public zzfeo(zzfeq zzfeqVar) {
        this.zza = zzfeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zzb(Object obj) {
        zzdor zzdorVar = (zzdor) obj;
        synchronized (this.zza) {
            try {
                this.zza.zzd = zzdorVar;
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdE)).booleanValue()) {
                    zzdorVar.zzd().zza = this.zza.zzc;
                }
                this.zza.zzd.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

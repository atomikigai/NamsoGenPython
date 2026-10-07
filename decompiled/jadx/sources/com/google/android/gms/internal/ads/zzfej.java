package com.google.android.gms.internal.ads;

import e6.t;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzfej implements zzenh {
    final /* synthetic */ zzfek zza;

    public zzfej(zzfek zzfekVar) {
        this.zza = zzfekVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zzb(Object obj) {
        zzdor zzdorVar = (zzdor) obj;
        synchronized (this.zza) {
            try {
                this.zza.zzi = zzdorVar;
                if (((Boolean) t.f3437d.f3440c.zza(zzbcn.zzdE)).booleanValue()) {
                    zzdorVar.zzd().zza = this.zza.zzd;
                }
                this.zza.zzi.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

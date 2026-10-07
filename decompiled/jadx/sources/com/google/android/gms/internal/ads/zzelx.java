package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzelx implements zzenh {
    final /* synthetic */ zzely zza;

    public zzelx(zzely zzelyVar) {
        this.zza = zzelyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzi = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcpd zzcpdVar = (zzcpd) obj;
        synchronized (this.zza) {
            try {
                zzely zzelyVar = this.zza;
                if (zzelyVar.zzi != null) {
                    zzelyVar.zzi.zzb();
                }
                this.zza.zzi = zzcpdVar;
                this.zza.zzi.zzk();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}

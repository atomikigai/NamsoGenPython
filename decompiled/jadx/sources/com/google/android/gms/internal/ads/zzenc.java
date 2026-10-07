package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzenc implements zzenh {
    final /* synthetic */ zzend zza;

    public zzenc(zzend zzendVar) {
        this.zza = zzendVar;
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final void zza() {
        synchronized (this.zza) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzenh
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcrq zzcrqVar = (zzcrq) obj;
        synchronized (this.zza) {
            this.zza.zzc = zzcrqVar.zzm();
            zzcrqVar.zzk();
        }
    }
}

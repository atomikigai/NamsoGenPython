package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaur implements zzfqs {
    final /* synthetic */ zzfpp zza;

    public zzaur(zzfpp zzfppVar) {
        this.zza = zzfppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final void zza(int i, long j4) {
        this.zza.zzd(i, System.currentTimeMillis() - j4);
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final void zzb(int i, long j4, String str) {
        this.zza.zze(i, System.currentTimeMillis() - j4, str);
    }
}

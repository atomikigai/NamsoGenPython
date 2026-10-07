package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzafi extends zzadd {
    private final long zza;

    public zzafi(zzacs zzacsVar, long j4) {
        super(zzacsVar);
        zzdb.zzd(zzacsVar.zzf() >= j4);
        this.zza = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzadd, com.google.android.gms.internal.ads.zzacs
    public final long zzd() {
        return super.zzd() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadd, com.google.android.gms.internal.ads.zzacs
    public final long zze() {
        return super.zze() - this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzadd, com.google.android.gms.internal.ads.zzacs
    public final long zzf() {
        return super.zzf() - this.zza;
    }
}

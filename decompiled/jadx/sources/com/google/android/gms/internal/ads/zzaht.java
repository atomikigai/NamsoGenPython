package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaht extends zzacf implements zzahy {
    private final long zza;
    private final int zzb;
    private final int zzc;
    private final long zzd;

    public zzaht(long j4, long j10, int i, int i10, boolean z4) {
        super(j4, j10, i, i10, false);
        this.zza = j10;
        this.zzb = i;
        this.zzc = i10;
        this.zzd = j4 != -1 ? j4 : -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int zzc() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zzd() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zze(long j4) {
        return zzb(j4);
    }

    public final zzaht zzf(long j4) {
        return new zzaht(j4, this.zza, this.zzb, this.zzc, false);
    }
}

package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzajm implements zzajr {
    private final zzadc zza;
    private final zzadb zzb;
    private long zzc = -1;
    private long zzd = -1;

    public zzajm(zzadc zzadcVar, zzadb zzadbVar) {
        this.zza = zzadcVar;
        this.zzb = zzadbVar;
    }

    public final void zza(long j4) {
        this.zzc = j4;
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final long zzd(zzacs zzacsVar) {
        long j4 = this.zzd;
        if (j4 < 0) {
            return -1L;
        }
        this.zzd = -1L;
        return -(j4 + 2);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final zzadq zze() {
        zzdb.zzf(this.zzc != -1);
        return new zzada(this.zza, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzajr
    public final void zzg(long j4) {
        long[] jArr = this.zzb.zza;
        this.zzd = jArr[zzen.zzd(jArr, j4, true, true)];
    }
}

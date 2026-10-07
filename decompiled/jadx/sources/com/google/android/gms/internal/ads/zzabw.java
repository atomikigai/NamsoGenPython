package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzabw implements zzadq {
    private final zzabz zza;
    private final long zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;

    public zzabw(zzabz zzabzVar, long j4, long j10, long j11, long j12, long j13, long j14) {
        this.zza = zzabzVar;
        this.zzb = j4;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
        this.zzf = j14;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzb;
    }

    public final long zzf(long j4) {
        return this.zza.zza(j4);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        zzadr zzadrVar = new zzadr(j4, zzaby.zzf(this.zza.zza(j4), 0L, this.zzc, this.zzd, this.zze, this.zzf));
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}

package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaol implements zzadq {
    private final zzaoi zza;
    private final int zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;

    public zzaol(zzaoi zzaoiVar, int i, long j4, long j10) {
        this.zza = zzaoiVar;
        this.zzb = i;
        this.zzc = j4;
        long j11 = (j10 - j4) / ((long) zzaoiVar.zzd);
        this.zzd = j11;
        this.zze = zzb(j11);
    }

    private final long zzb(long j4) {
        return zzen.zzu(j4 * ((long) this.zzb), 1000000L, this.zza.zzc, RoundingMode.FLOOR);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        long jMax = Math.max(0L, Math.min((((long) this.zza.zzc) * j4) / (((long) this.zzb) * 1000000), this.zzd - 1));
        long j10 = ((long) this.zza.zzd) * jMax;
        long jZzb = zzb(jMax);
        zzadr zzadrVar = new zzadr(jZzb, this.zzc + j10);
        if (jZzb >= j4 || jMax == this.zzd - 1) {
            return new zzado(zzadrVar, zzadrVar);
        }
        long j11 = jMax + 1;
        return new zzado(zzadrVar, new zzadr(zzb(j11), (j11 * ((long) this.zza.zzd)) + this.zzc));
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}

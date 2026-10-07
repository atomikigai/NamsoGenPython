package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public class zzacf implements zzadq {
    private final long zza;
    private final long zzb;
    private final int zzc;
    private final long zzd;
    private final int zze;
    private final long zzf;

    public zzacf(long j4, long j10, int i, int i10, boolean z4) {
        long jZzc;
        this.zza = j4;
        this.zzb = j10;
        this.zzc = i10 == -1 ? 1 : i10;
        this.zze = i;
        if (j4 == -1) {
            this.zzd = -1L;
            jZzc = -9223372036854775807L;
        } else {
            this.zzd = j4 - j10;
            jZzc = zzc(j4, j10, i);
        }
        this.zzf = jZzc;
    }

    private static long zzc(long j4, long j10, int i) {
        return (Math.max(0L, j4 - j10) * 8000000) / ((long) i);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzf;
    }

    public final long zzb(long j4) {
        return zzc(j4, this.zzb, this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        long j10 = this.zzd;
        if (j10 == -1) {
            zzadr zzadrVar = new zzadr(0L, this.zzb);
            return new zzado(zzadrVar, zzadrVar);
        }
        long j11 = ((long) this.zze) * j4;
        long j12 = this.zzc;
        long jMin = ((j11 / 8000000) / j12) * j12;
        if (j10 != -1) {
            jMin = Math.min(jMin, j10 - j12);
        }
        long jMax = this.zzb + Math.max(jMin, 0L);
        long jZzb = zzb(jMax);
        zzadr zzadrVar2 = new zzadr(jZzb, jMax);
        if (this.zzd != -1 && jZzb < j4) {
            long j13 = jMax + ((long) this.zzc);
            if (j13 < this.zza) {
                return new zzado(zzadrVar2, new zzadr(zzb(j13), j13));
            }
        }
        return new zzado(zzadrVar2, zzadrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return this.zzd != -1;
    }
}

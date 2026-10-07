package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzek {
    private long zza;
    private long zzb;
    private long zzc;
    private final ThreadLocal zzd = new ThreadLocal();

    public zzek(long j4) {
        zzi(0L);
    }

    public static long zzg(long j4) {
        return (j4 * 1000000) / 90000;
    }

    public static long zzh(long j4) {
        return (j4 * 90000) / 1000000;
    }

    public final synchronized long zza(long j4) {
        try {
            if (!zzj()) {
                long jLongValue = this.zza;
                if (jLongValue == 9223372036854775806L) {
                    Long l2 = (Long) this.zzd.get();
                    if (l2 == null) {
                        throw null;
                    }
                    jLongValue = l2.longValue();
                }
                this.zzb = jLongValue - j4;
                notifyAll();
            }
            this.zzc = j4;
        } catch (Throwable th) {
            throw th;
        }
        return j4 + this.zzb;
    }

    public final synchronized long zzb(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.zzc;
            if (j10 != -9223372036854775807L) {
                long jZzh = zzh(j10);
                long j11 = (4294967296L + jZzh) / 8589934592L;
                long j12 = (((-1) + j11) * 8589934592L) + j4;
                long j13 = (j11 * 8589934592L) + j4;
                j4 = Math.abs(j12 - jZzh) < Math.abs(j13 - jZzh) ? j12 : j13;
            }
            return zza(zzg(j4));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzc(long j4) {
        if (j4 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        try {
            long j10 = this.zzc;
            if (j10 != -9223372036854775807L) {
                long jZzh = zzh(j10);
                long j11 = jZzh / 8589934592L;
                long j12 = (j11 * 8589934592L) + j4;
                j4 = j12 >= jZzh ? j12 : ((j11 + 1) * 8589934592L) + j4;
            }
            return zza(zzg(j4));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long zzd() {
        long j4 = this.zza;
        if (j4 == Long.MAX_VALUE || j4 == 9223372036854775806L) {
            return -9223372036854775807L;
        }
        return j4;
    }

    public final synchronized long zze() {
        long j4;
        try {
            j4 = this.zzc;
        } catch (Throwable th) {
            throw th;
        }
        return j4 != -9223372036854775807L ? j4 + this.zzb : zzd();
    }

    public final synchronized long zzf() {
        return this.zzb;
    }

    public final synchronized void zzi(long j4) {
        this.zza = j4;
        this.zzb = j4 == Long.MAX_VALUE ? 0L : -9223372036854775807L;
        this.zzc = -9223372036854775807L;
    }

    public final synchronized boolean zzj() {
        return this.zzb != -9223372036854775807L;
    }
}

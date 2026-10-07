package com.google.android.gms.internal.ads;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzia {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private float zzj = 0.97f;
    private float zzi = 1.03f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzia(float f10, float f11, long j4, float f12, long j10, long j11, float f13, zzhz zzhzVar) {
        this.zza = j10;
        this.zzb = j11;
    }

    private static long zzf(long j4, long j10, float f10) {
        return (long) ((j10 * 9.999871E-4f) + (j4 * 0.999f));
    }

    private final void zzg() {
        long j4;
        long j10 = this.zzc;
        if (j10 != -9223372036854775807L) {
            j4 = this.zzd;
            if (j4 == -9223372036854775807L) {
                long j11 = this.zzf;
                if (j11 != -9223372036854775807L && j10 < j11) {
                    j10 = j11;
                }
                j4 = this.zzg;
                if (j4 == -9223372036854775807L || j10 <= j4) {
                    j4 = j10;
                }
            }
        } else {
            j4 = -9223372036854775807L;
        }
        if (this.zze == j4) {
            return;
        }
        this.zze = j4;
        this.zzh = j4;
        this.zzm = -9223372036854775807L;
        this.zzn = -9223372036854775807L;
        this.zzl = -9223372036854775807L;
    }

    public final float zza(long j4, long j10) {
        long jMax;
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j11 = j4 - j10;
        long j12 = this.zzm;
        if (j12 == -9223372036854775807L) {
            this.zzm = j11;
            this.zzn = 0L;
        } else {
            long jMax2 = Math.max(j11, zzf(j12, j11, 0.999f));
            this.zzm = jMax2;
            this.zzn = zzf(this.zzn, Math.abs(j11 - jMax2), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j13 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j13) {
            long jZzs = zzen.zzs(1000L);
            float f10 = this.zzk - 1.0f;
            float f11 = this.zzi - 1.0f;
            long j14 = this.zze;
            float f12 = jZzs;
            long j15 = this.zzh - (((long) (f10 * f12)) + ((long) (f11 * f12)));
            long[] jArr = {j13, j14, j15};
            jMax = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j16 = jArr[i];
                if (j16 > jMax) {
                    jMax = j16;
                }
            }
            this.zzh = jMax;
        } else {
            jMax = Math.max(this.zzh, Math.min(j4 - ((long) (Math.max(0.0f, this.zzk - 1.0f) / 1.0E-7f)), j13));
            this.zzh = jMax;
            long j17 = this.zzg;
            if (j17 != -9223372036854775807L && jMax > j17) {
                this.zzh = j17;
                jMax = j17;
            }
        }
        long j18 = j4 - jMax;
        if (Math.abs(j18) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.zzj, Math.min((j18 * 1.0E-7f) + 1.0f, this.zzi));
        this.zzk = fMax;
        return fMax;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j4 = this.zzh;
        if (j4 == -9223372036854775807L) {
            return;
        }
        long j10 = j4 + this.zzb;
        this.zzh = j10;
        long j11 = this.zzg;
        if (j11 != -9223372036854775807L && j10 > j11) {
            this.zzh = j11;
        }
        this.zzl = -9223372036854775807L;
    }

    public final void zzd(zzaq zzaqVar) {
        long j4 = zzaqVar.zza;
        this.zzc = zzen.zzs(-9223372036854775807L);
        this.zzf = zzen.zzs(-9223372036854775807L);
        this.zzg = zzen.zzs(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j4) {
        this.zzd = j4;
        zzg();
    }
}

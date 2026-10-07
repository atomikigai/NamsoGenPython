package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaab {
    private long zza;
    private long zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private final boolean[] zzg = new boolean[15];
    private int zzh;

    public final long zza() {
        long j4 = this.zze;
        if (j4 == 0) {
            return 0L;
        }
        return this.zzf / j4;
    }

    public final long zzb() {
        return this.zzf;
    }

    public final void zzc(long j4) {
        long j10 = this.zzd;
        if (j10 == 0) {
            this.zza = j4;
        } else if (j10 == 1) {
            long j11 = j4 - this.zza;
            this.zzb = j11;
            this.zzf = j11;
            this.zze = 1L;
        } else {
            long j12 = j4 - this.zzc;
            int i = (int) (j10 % 15);
            if (Math.abs(j12 - this.zzb) <= 1000000) {
                this.zze++;
                this.zzf += j12;
                boolean[] zArr = this.zzg;
                if (zArr[i]) {
                    zArr[i] = false;
                    this.zzh--;
                }
            } else {
                boolean[] zArr2 = this.zzg;
                if (!zArr2[i]) {
                    zArr2[i] = true;
                    this.zzh++;
                }
            }
        }
        this.zzd++;
        this.zzc = j4;
    }

    public final void zzd() {
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzh = 0;
        Arrays.fill(this.zzg, false);
    }

    public final boolean zze() {
        long j4 = this.zzd;
        if (j4 == 0) {
            return false;
        }
        return this.zzg[(int) ((j4 - 1) % 15)];
    }

    public final boolean zzf() {
        return this.zzd > 15 && this.zzh == 0;
    }
}

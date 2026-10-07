package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzpw {
    private final zzpv zza;
    private int zzb;
    private long zzc;
    private long zzd;
    private long zze;
    private long zzf;

    public zzpw(AudioTrack audioTrack) {
        this.zza = new zzpv(audioTrack);
        zzh(0);
    }

    private final void zzh(int i) {
        this.zzb = i;
        long j4 = 10000;
        if (i == 0) {
            this.zze = 0L;
            this.zzf = -1L;
            this.zzc = System.nanoTime() / 1000;
        } else {
            if (i == 1) {
                this.zzd = 10000L;
                return;
            }
            j4 = (i == 2 || i == 3) ? 10000000L : 500000L;
        }
        this.zzd = j4;
    }

    public final long zza() {
        return this.zza.zza();
    }

    public final long zzb() {
        return this.zza.zzb();
    }

    public final void zzc() {
        if (this.zzb == 4) {
            zzh(0);
        }
    }

    public final void zzd() {
        zzh(4);
    }

    public final void zze() {
        zzh(0);
    }

    public final boolean zzf() {
        return this.zzb == 2;
    }

    public final boolean zzg(long j4) {
        if (j4 - this.zze < this.zzd) {
            return false;
        }
        this.zze = j4;
        boolean zZzc = this.zza.zzc();
        int i = this.zzb;
        if (i == 0) {
            if (!zZzc) {
                if (j4 - this.zzc <= 500000) {
                    return false;
                }
                zzh(3);
                return false;
            }
            if (this.zza.zzb() < this.zzc) {
                return false;
            }
            this.zzf = this.zza.zza();
            zzh(1);
            return true;
        }
        if (i == 1) {
            if (!zZzc) {
                zzh(0);
                return false;
            }
            if (this.zza.zza() <= this.zzf) {
                return true;
            }
            zzh(2);
            return true;
        }
        if (i == 2) {
            if (zZzc) {
                return true;
            }
            zzh(0);
            return false;
        }
        if (i != 3) {
            return zZzc;
        }
        if (!zZzc) {
            return false;
        }
        zzh(0);
        return true;
    }
}

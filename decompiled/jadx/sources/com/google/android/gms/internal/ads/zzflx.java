package com.google.android.gms.internal.ads;

import e6.t;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzflx {
    private final long zza;
    private final long zzb;
    private long zzd;
    private final Random zze = new Random();
    private long zzc = 0;

    public zzflx(long j4, double d10, long j10, double d11) {
        this.zza = j4;
        this.zzb = j10;
        zzc();
    }

    public final long zza() {
        double d10 = this.zzd;
        double d11 = 0.2d * d10;
        long j4 = (long) (d10 + d11);
        long j10 = (long) (d10 - d11);
        return j10 + ((long) (this.zze.nextDouble() * ((j4 - j10) + 1)));
    }

    public final void zzb() {
        double d10 = this.zzd;
        this.zzd = Math.min((long) (d10 + d10), this.zzb);
        this.zzc++;
    }

    public final void zzc() {
        this.zzd = this.zza;
        this.zzc = 0L;
    }

    public final boolean zzd() {
        return this.zzc > ((long) ((Integer) t.f3437d.f3440c.zza(zzbcn.zzw)).intValue()) && this.zzd >= this.zzb;
    }
}

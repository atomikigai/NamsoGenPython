package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzaca {
    public static final zzaca zza = new zzaca(-3, -9223372036854775807L, -1);
    private final int zzb;
    private final long zzc;
    private final long zzd;

    private zzaca(int i, long j4, long j10) {
        this.zzb = i;
        this.zzc = j4;
        this.zzd = j10;
    }

    public static zzaca zzd(long j4, long j10) {
        return new zzaca(-1, j4, j10);
    }

    public static zzaca zze(long j4) {
        return new zzaca(0, -9223372036854775807L, j4);
    }

    public static zzaca zzf(long j4, long j10) {
        return new zzaca(-2, j4, j10);
    }
}

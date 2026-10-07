package com.google.android.gms.internal.ads;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzahv implements zzahy {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;

    private zzahv(long[] jArr, long[] jArr2, long j4) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j4 == -9223372036854775807L ? zzen.zzs(jArr2[jArr2.length - 1]) : j4;
    }

    public static zzahv zzb(long j4, zzagq zzagqVar, long j10) {
        int length = zzagqVar.zzd.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j4;
        long j11 = 0;
        jArr2[0] = 0;
        for (int i10 = 1; i10 <= length; i10++) {
            int i11 = i10 - 1;
            j4 += (long) (zzagqVar.zzb + zzagqVar.zzd[i11]);
            j11 += (long) (zzagqVar.zzc + zzagqVar.zze[i11]);
            jArr[i10] = j4;
            jArr2[i10] = j11;
        }
        return new zzahv(jArr, jArr2, j10);
    }

    private static Pair zzf(long j4, long[] jArr, long[] jArr2) {
        int iZzd = zzen.zzd(jArr, j4, true, true);
        long j10 = jArr[iZzd];
        long j11 = jArr2[iZzd];
        int i = iZzd + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        long j12 = jArr[i];
        return Pair.create(Long.valueOf(j4), Long.valueOf(((long) ((j12 == j10 ? 0.0d : (j4 - j10) / (j12 - j10)) * (jArr2[i] - j11))) + j11));
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int zzc() {
        return -2147483647;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zzd() {
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zze(long j4) {
        return zzen.zzs(((Long) zzf(j4, this.zza, this.zzb).second).longValue());
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        Pair pairZzf = zzf(zzen.zzv(Math.max(0L, Math.min(j4, this.zzc))), this.zzb, this.zza);
        zzadr zzadrVar = new zzadr(zzen.zzs(((Long) pairZzf.first).longValue()), ((Long) pairZzf.second).longValue());
        return new zzado(zzadrVar, zzadrVar);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return true;
    }
}

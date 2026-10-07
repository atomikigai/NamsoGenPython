package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaib implements zzahy {
    private final long zza;
    private final int zzb;
    private final long zzc;
    private final int zzd;
    private final long zze;
    private final long zzf;
    private final long[] zzg;

    private zzaib(long j4, int i, long j10, int i10, long j11, long[] jArr) {
        this.zza = j4;
        this.zzb = i;
        this.zzc = j10;
        this.zzd = i10;
        this.zze = j11;
        this.zzg = jArr;
        this.zzf = j11 != -1 ? j4 + j11 : -1L;
    }

    public static zzaib zzb(zzaia zzaiaVar, long j4) {
        long[] jArr;
        long jZza = zzaiaVar.zza();
        if (jZza == -9223372036854775807L) {
            return null;
        }
        long j10 = zzaiaVar.zzc;
        if (j10 == -1 || (jArr = zzaiaVar.zzf) == null) {
            zzadj zzadjVar = zzaiaVar.zza;
            return new zzaib(j4, zzadjVar.zzc, jZza, zzadjVar.zzf, -1L, null);
        }
        zzadj zzadjVar2 = zzaiaVar.zza;
        return new zzaib(j4, zzadjVar2.zzc, jZza, zzadjVar2.zzf, j10, jArr);
    }

    private final long zzf(int i) {
        return (this.zzc * ((long) i)) / 100;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final long zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zzd() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.ads.zzahy
    public final long zze(long j4) {
        if (!zzh()) {
            return 0L;
        }
        long j10 = j4 - this.zza;
        if (j10 <= this.zzb) {
            return 0L;
        }
        long[] jArr = this.zzg;
        zzdb.zzb(jArr);
        double d10 = (j10 * 256.0d) / this.zze;
        int iZzd = zzen.zzd(jArr, (long) d10, true, true);
        long jZzf = zzf(iZzd);
        long j11 = jArr[iZzd];
        int i = iZzd + 1;
        long jZzf2 = zzf(i);
        long j12 = iZzd == 99 ? 256L : jArr[i];
        return Math.round((j11 == j12 ? 0.0d : (d10 - j11) / (j12 - j11)) * (jZzf2 - jZzf)) + jZzf;
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final zzado zzg(long j4) {
        if (!zzh()) {
            zzadr zzadrVar = new zzadr(0L, this.zza + ((long) this.zzb));
            return new zzado(zzadrVar, zzadrVar);
        }
        long jMax = Math.max(0L, Math.min(j4, this.zzc));
        double d10 = (jMax * 100.0d) / this.zzc;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i = (int) d10;
                long[] jArr = this.zzg;
                zzdb.zzb(jArr);
                double d12 = jArr[i];
                d11 = (((i == 99 ? 256.0d : jArr[i + 1]) - d12) * (d10 - ((double) i))) + d12;
            }
        }
        long j10 = this.zze;
        zzadr zzadrVar2 = new zzadr(jMax, this.zza + Math.max(this.zzb, Math.min(Math.round((d11 / 256.0d) * j10), j10 - 1)));
        return new zzado(zzadrVar2, zzadrVar2);
    }

    @Override // com.google.android.gms.internal.ads.zzadq
    public final boolean zzh() {
        return this.zzg != null;
    }
}

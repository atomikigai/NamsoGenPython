package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzaia {
    public final zzadj zza;
    public final long zzb;
    public final long zzc;
    public final int zzd;
    public final int zze;
    public final long[] zzf;

    private zzaia(zzadj zzadjVar, long j4, long j10, long[] jArr, int i, int i10) {
        this.zza = new zzadj(zzadjVar);
        this.zzb = j4;
        this.zzc = j10;
        this.zzf = jArr;
        this.zzd = i;
        this.zze = i10;
    }

    public static zzaia zzb(zzadj zzadjVar, zzed zzedVar) {
        long[] jArr;
        int i;
        int i10;
        int iZzg = zzedVar.zzg();
        int iZzp = (iZzg & 1) != 0 ? zzedVar.zzp() : -1;
        long jZzu = (iZzg & 2) != 0 ? zzedVar.zzu() : -1L;
        if ((iZzg & 4) == 4) {
            jArr = new long[100];
            for (int i11 = 0; i11 < 100; i11++) {
                jArr[i11] = zzedVar.zzm();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iZzg & 8) != 0) {
            zzedVar.zzM(4);
        }
        if (zzedVar.zzb() >= 24) {
            zzedVar.zzM(21);
            int iZzo = zzedVar.zzo();
            i10 = iZzo & 4095;
            i = iZzo >> 12;
        } else {
            i = -1;
            i10 = -1;
        }
        return new zzaia(zzadjVar, iZzp, jZzu, jArr2, i, i10);
    }

    public final long zza() {
        long j4 = this.zzb;
        if (j4 == -1 || j4 == 0) {
            return -9223372036854775807L;
        }
        zzadj zzadjVar = this.zza;
        return zzen.zzt((j4 * ((long) zzadjVar.zzg)) - 1, zzadjVar.zzd);
    }
}

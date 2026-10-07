package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzank {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzek zza = new zzek(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzed zzb = new zzed();

    public static long zzc(zzed zzedVar) {
        int iZzd = zzedVar.zzd();
        if (zzedVar.zzb() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzedVar.zzH(bArr, 0, 9);
        zzedVar.zzL(iZzd);
        byte b10 = bArr[0];
        if ((b10 & 196) != 68) {
            return -9223372036854775807L;
        }
        byte b11 = bArr[2];
        if ((b11 & 4) != 4) {
            return -9223372036854775807L;
        }
        byte b12 = bArr[4];
        if ((b12 & 4) != 4 || (bArr[5] & 1) != 1 || (bArr[8] & 3) != 3) {
            return -9223372036854775807L;
        }
        long j4 = b10;
        long j10 = b11;
        long j11 = (248 & j10) >> 3;
        long j12 = (j10 & 3) << 13;
        return j12 | ((bArr[1] & 255) << 20) | ((j4 & 3) << 28) | (((j4 & 56) >> 3) << 30) | (j11 << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b12) & 248) >> 3);
    }

    private final int zzf(zzacs zzacsVar) {
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacsVar.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzacs zzacsVar, zzadn zzadnVar) throws IOException {
        long j4 = -9223372036854775807L;
        if (!this.zze) {
            long jZzd = zzacsVar.zzd();
            int iMin = (int) Math.min(20000L, jZzd);
            long j10 = jZzd - ((long) iMin);
            if (zzacsVar.zzf() != j10) {
                zzadnVar.zza = j10;
                return 1;
            }
            this.zzb.zzI(iMin);
            zzacsVar.zzj();
            zzacsVar.zzh(this.zzb.zzN(), 0, iMin);
            zzed zzedVar = this.zzb;
            int iZzd = zzedVar.zzd();
            for (int iZze = zzedVar.zze() - 4; iZze >= iZzd; iZze--) {
                if (zzg(zzedVar.zzN(), iZze) == 442) {
                    zzedVar.zzL(iZze + 4);
                    long jZzc = zzc(zzedVar);
                    if (jZzc != -9223372036854775807L) {
                        j4 = jZzc;
                        break;
                    }
                }
            }
            this.zzg = j4;
            this.zze = true;
            return 0;
        }
        if (this.zzg == -9223372036854775807L) {
            zzf(zzacsVar);
            return 0;
        }
        if (this.zzd) {
            long j11 = this.zzf;
            if (j11 == -9223372036854775807L) {
                zzf(zzacsVar);
                return 0;
            }
            zzek zzekVar = this.zza;
            this.zzh = zzekVar.zzc(this.zzg) - zzekVar.zzb(j11);
            zzf(zzacsVar);
            return 0;
        }
        int iMin2 = (int) Math.min(20000L, zzacsVar.zzd());
        if (zzacsVar.zzf() != 0) {
            zzadnVar.zza = 0L;
            return 1;
        }
        this.zzb.zzI(iMin2);
        zzacsVar.zzj();
        zzacsVar.zzh(this.zzb.zzN(), 0, iMin2);
        zzed zzedVar2 = this.zzb;
        int iZze2 = zzedVar2.zze();
        for (int iZzd2 = zzedVar2.zzd(); iZzd2 < iZze2 - 3; iZzd2++) {
            if (zzg(zzedVar2.zzN(), iZzd2) == 442) {
                zzedVar2.zzL(iZzd2 + 4);
                long jZzc2 = zzc(zzedVar2);
                if (jZzc2 != -9223372036854775807L) {
                    j4 = jZzc2;
                    break;
                }
            }
        }
        this.zzf = j4;
        this.zzd = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzek zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}

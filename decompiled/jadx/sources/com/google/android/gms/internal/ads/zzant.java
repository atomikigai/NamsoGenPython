package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzant {
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final zzek zza = new zzek(0);
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private final zzed zzb = new zzed();

    public zzant(int i) {
    }

    private final int zze(zzacs zzacsVar) {
        byte[] bArr = zzen.zzf;
        int length = bArr.length;
        this.zzb.zzJ(bArr, 0);
        this.zzc = true;
        zzacsVar.zzj();
        return 0;
    }

    public final int zza(zzacs zzacsVar, zzadn zzadnVar, int i) throws IOException {
        if (i <= 0) {
            zze(zzacsVar);
            return 0;
        }
        long j4 = -9223372036854775807L;
        if (this.zze) {
            if (this.zzg == -9223372036854775807L) {
                zze(zzacsVar);
                return 0;
            }
            if (this.zzd) {
                long j10 = this.zzf;
                if (j10 == -9223372036854775807L) {
                    zze(zzacsVar);
                    return 0;
                }
                zzek zzekVar = this.zza;
                this.zzh = zzekVar.zzc(this.zzg) - zzekVar.zzb(j10);
                zze(zzacsVar);
                return 0;
            }
            int iMin = (int) Math.min(112800L, zzacsVar.zzd());
            if (zzacsVar.zzf() != 0) {
                zzadnVar.zza = 0L;
                return 1;
            }
            this.zzb.zzI(iMin);
            zzacsVar.zzj();
            zzacsVar.zzh(this.zzb.zzN(), 0, iMin);
            zzed zzedVar = this.zzb;
            int iZze = zzedVar.zze();
            for (int iZzd = zzedVar.zzd(); iZzd < iZze; iZzd++) {
                if (zzedVar.zzN()[iZzd] == 71) {
                    long jZzb = zzaoc.zzb(zzedVar, iZzd, i);
                    if (jZzb != -9223372036854775807L) {
                        j4 = jZzb;
                        break;
                    }
                }
            }
            this.zzf = j4;
            this.zzd = true;
            return 0;
        }
        long jZzd = zzacsVar.zzd();
        int iMin2 = (int) Math.min(112800L, jZzd);
        long j11 = jZzd - ((long) iMin2);
        if (zzacsVar.zzf() != j11) {
            zzadnVar.zza = j11;
            return 1;
        }
        this.zzb.zzI(iMin2);
        zzacsVar.zzj();
        zzacsVar.zzh(this.zzb.zzN(), 0, iMin2);
        zzed zzedVar2 = this.zzb;
        int iZzd2 = zzedVar2.zzd();
        int iZze2 = zzedVar2.zze();
        for (int i10 = iZze2 - 188; i10 >= iZzd2; i10--) {
            byte[] bArrZzN = zzedVar2.zzN();
            int i11 = 0;
            for (int i12 = -4; i12 <= 4; i12++) {
                int i13 = (i12 * 188) + i10;
                if (i13 >= iZzd2 && i13 < iZze2 && bArrZzN[i13] == 71) {
                    i11++;
                    if (i11 == 5) {
                        long jZzb2 = zzaoc.zzb(zzedVar2, i10, i);
                        if (jZzb2 == -9223372036854775807L) {
                            break;
                        }
                        j4 = jZzb2;
                        break;
                    }
                } else {
                    i11 = 0;
                }
            }
        }
        this.zzg = j4;
        this.zze = true;
        return 0;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzek zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzc;
    }
}

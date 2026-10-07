package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzacy {
    public static int zza(zzed zzedVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzedVar.zzm() + 1;
            case 7:
                return zzedVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzacs zzacsVar, zzadc zzadcVar) throws IOException {
        zzacsVar.zzj();
        zzacsVar.zzg(1);
        byte[] bArr = new byte[1];
        zzacsVar.zzh(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z4 = 1 == i;
        zzacsVar.zzg(2);
        int i10 = 1 != i ? 6 : 7;
        zzed zzedVar = new zzed(i10);
        zzedVar.zzK(zzacv.zza(zzacsVar, zzedVar.zzN(), 0, i10));
        zzacsVar.zzj();
        zzacx zzacxVar = new zzacx();
        if (zzd(zzedVar, zzadcVar, z4, zzacxVar)) {
            return zzacxVar.zza;
        }
        throw zzbh.zza(null, null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x009b  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ae A[RETURN] */
    public static boolean zzc(zzed zzedVar, zzadc zzadcVar, int i, zzacx zzacxVar) {
        int iZza;
        int iZzd = zzedVar.zzd();
        long jZzu = zzedVar.zzu();
        long j4 = jZzu >>> 16;
        if (j4 != i) {
            return false;
        }
        boolean z4 = (j4 & 1) == 1;
        long j10 = jZzu >> 12;
        long j11 = jZzu >> 8;
        long j12 = jZzu >> 4;
        long j13 = jZzu >> 1;
        long j14 = jZzu & 1;
        int i10 = (int) (j12 & 15);
        if (i10 > 7 ? !(i10 > 10 || zzadcVar.zzg != 2) : i10 == zzadcVar.zzg - 1) {
            int i11 = (int) (j13 & 7);
            if ((i11 == 0 || i11 == zzadcVar.zzi) && j14 != 1 && zzd(zzedVar, zzadcVar, z4, zzacxVar) && (iZza = zza(zzedVar, (int) (j10 & 15))) != -1 && iZza <= zzadcVar.zzb) {
                int i12 = zzadcVar.zze;
                int i13 = (int) (j11 & 15);
                if (i13 != 0) {
                    if (i13 <= 11) {
                        if (i13 == zzadcVar.zzf) {
                            if (zzedVar.zzm() == zzen.zzg(zzedVar.zzN(), iZzd, zzedVar.zzd() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i13 == 12) {
                        if (zzedVar.zzm() * zzbbs.zzq.zzf == i12) {
                            if (zzedVar.zzm() == zzen.zzg(zzedVar.zzN(), iZzd, zzedVar.zzd() - 1, 0)) {
                                return true;
                            }
                        }
                    } else if (i13 <= 14) {
                        int iZzq = zzedVar.zzq();
                        if (i13 == 14) {
                            iZzq *= 10;
                        }
                        if (iZzq == i12) {
                            if (zzedVar.zzm() == zzen.zzg(zzedVar.zzN(), iZzd, zzedVar.zzd() - 1, 0)) {
                                return true;
                            }
                        }
                    }
                } else if (zzedVar.zzm() == zzen.zzg(zzedVar.zzN(), iZzd, zzedVar.zzd() - 1, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean zzd(zzed zzedVar, zzadc zzadcVar, boolean z4, zzacx zzacxVar) {
        try {
            long jZzx = zzedVar.zzx();
            if (!z4) {
                jZzx *= (long) zzadcVar.zzb;
            }
            zzacxVar.zza = jZzx;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}

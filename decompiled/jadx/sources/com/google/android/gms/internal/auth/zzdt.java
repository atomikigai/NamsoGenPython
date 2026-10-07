package com.google.android.gms.internal.auth;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdt {
    public static int zza(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i, zzdsVar);
        int i10 = zzdsVar.zza;
        if (i10 < 0) {
            throw zzfa.zzc();
        }
        if (i10 > bArr.length - iZzj) {
            throw zzfa.zzf();
        }
        if (i10 == 0) {
            zzdsVar.zzc = zzee.zzb;
            return iZzj;
        }
        zzdsVar.zzc = zzee.zzk(bArr, iZzj, i10);
        return iZzj + i10;
    }

    public static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static int zzc(zzgh zzghVar, byte[] bArr, int i, int i10, int i11, zzds zzdsVar) throws IOException {
        zzfz zzfzVar = (zzfz) zzghVar;
        Object objZzd = zzfzVar.zzd();
        int iZzb = zzfzVar.zzb(objZzd, bArr, i, i10, i11, zzdsVar);
        zzfzVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return iZzb;
    }

    public static int zzd(zzgh zzghVar, byte[] bArr, int i, int i10, zzds zzdsVar) throws IOException {
        int iZzk = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iZzk = zzk(i11, bArr, iZzk, zzdsVar);
            i11 = zzdsVar.zza;
        }
        int i12 = iZzk;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzfa.zzf();
        }
        Object objZzd = zzghVar.zzd();
        int i13 = i12 + i11;
        zzghVar.zzg(objZzd, bArr, i12, i13, zzdsVar);
        zzghVar.zze(objZzd);
        zzdsVar.zzc = objZzd;
        return i13;
    }

    public static int zze(zzgh zzghVar, int i, byte[] bArr, int i10, int i11, zzey zzeyVar, zzds zzdsVar) throws IOException {
        int iZzd = zzd(zzghVar, bArr, i10, i11, zzdsVar);
        zzeyVar.add(zzdsVar.zzc);
        while (iZzd < i11) {
            int iZzj = zzj(bArr, iZzd, zzdsVar);
            if (i != zzdsVar.zza) {
                break;
            }
            iZzd = zzd(zzghVar, bArr, iZzj, i11, zzdsVar);
            zzeyVar.add(zzdsVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzey zzeyVar, zzds zzdsVar) throws IOException {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i, zzdsVar);
        int i10 = zzdsVar.zza + iZzj;
        while (iZzj < i10) {
            iZzj = zzj(bArr, iZzj, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        if (iZzj == i10) {
            return iZzj;
        }
        throw zzfa.zzf();
    }

    public static int zzg(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i, zzdsVar);
        int i10 = zzdsVar.zza;
        if (i10 < 0) {
            throw zzfa.zzc();
        }
        if (i10 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = new String(bArr, iZzj, i10, zzez.zzb);
        return iZzj + i10;
    }

    public static int zzh(byte[] bArr, int i, zzds zzdsVar) throws zzfa {
        int iZzj = zzj(bArr, i, zzdsVar);
        int i10 = zzdsVar.zza;
        if (i10 < 0) {
            throw zzfa.zzc();
        }
        if (i10 == 0) {
            zzdsVar.zzc = "";
            return iZzj;
        }
        zzdsVar.zzc = zzhm.zzb(bArr, iZzj, i10);
        return iZzj + i10;
    }

    public static int zzi(int i, byte[] bArr, int i10, int i11, zzgz zzgzVar, zzds zzdsVar) throws zzfa {
        if ((i >>> 3) == 0) {
            throw zzfa.zza();
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iZzm = zzm(bArr, i10, zzdsVar);
            zzgzVar.zzf(i, Long.valueOf(zzdsVar.zzb));
            return iZzm;
        }
        if (i12 == 1) {
            zzgzVar.zzf(i, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzj = zzj(bArr, i10, zzdsVar);
            int i13 = zzdsVar.zza;
            if (i13 < 0) {
                throw zzfa.zzc();
            }
            if (i13 > bArr.length - iZzj) {
                throw zzfa.zzf();
            }
            if (i13 == 0) {
                zzgzVar.zzf(i, zzee.zzb);
            } else {
                zzgzVar.zzf(i, zzee.zzk(bArr, iZzj, i13));
            }
            return iZzj + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzfa.zza();
            }
            zzgzVar.zzf(i, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        zzgz zzgzVarZzc = zzgz.zzc();
        int i15 = 0;
        while (i10 < i11) {
            int iZzj2 = zzj(bArr, i10, zzdsVar);
            i15 = zzdsVar.zza;
            if (i15 == i14) {
                i10 = iZzj2;
                break;
            }
            i10 = zzi(i15, bArr, iZzj2, i11, zzgzVarZzc, zzdsVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw zzfa.zzd();
        }
        zzgzVar.zzf(i, zzgzVarZzc);
        return i10;
    }

    public static int zzj(byte[] bArr, int i, zzds zzdsVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzk(b10, bArr, i10, zzdsVar);
        }
        zzdsVar.zza = b10;
        return i10;
    }

    public static int zzk(int i, byte[] bArr, int i10, zzds zzdsVar) {
        int i11 = i & 127;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            zzdsVar.zza = i11 | (b10 << 7);
            return i12;
        }
        int i13 = i11 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i12];
        if (b11 >= 0) {
            zzdsVar.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzdsVar.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzdsVar.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzdsVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzl(int i, byte[] bArr, int i10, int i11, zzey zzeyVar, zzds zzdsVar) {
        zzev zzevVar = (zzev) zzeyVar;
        int iZzj = zzj(bArr, i10, zzdsVar);
        zzevVar.zze(zzdsVar.zza);
        while (iZzj < i11) {
            int iZzj2 = zzj(bArr, iZzj, zzdsVar);
            if (i != zzdsVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzdsVar);
            zzevVar.zze(zzdsVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i, zzds zzdsVar) {
        int i10 = i + 1;
        long j4 = bArr[i];
        if (j4 >= 0) {
            zzdsVar.zzb = j4;
            return i10;
        }
        int i11 = i + 2;
        byte b10 = bArr[i10];
        long j10 = (j4 & 127) | (((long) (b10 & 127)) << 7);
        int i12 = 7;
        while (b10 < 0) {
            int i13 = i11 + 1;
            byte b11 = bArr[i11];
            i12 += 7;
            j10 |= ((long) (b11 & 127)) << i12;
            b10 = b11;
            i11 = i13;
        }
        zzdsVar.zzb = j10;
        return i11;
    }

    public static long zzn(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}

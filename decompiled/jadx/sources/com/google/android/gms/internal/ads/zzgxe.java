package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgxe {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zzgxd zzgxdVar) throws zzgzm {
        int iZzh = zzh(bArr, i, zzgxdVar);
        int i10 = zzgxdVar.zza;
        if (i10 < 0) {
            throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iZzh) {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            zzgxdVar.zzc = zzgxp.zzb;
            return iZzh;
        }
        zzgxdVar.zzc = zzgxp.zzv(bArr, iZzh, i10);
        return iZzh + i10;
    }

    public static int zzb(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzhbb zzhbbVar, byte[] bArr, int i, int i10, int i11, zzgxd zzgxdVar) throws IOException {
        Object objZze = zzhbbVar.zze();
        int iZzl = zzl(objZze, zzhbbVar, bArr, i, i10, i11, zzgxdVar);
        zzhbbVar.zzf(objZze);
        zzgxdVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzhbb zzhbbVar, byte[] bArr, int i, int i10, zzgxd zzgxdVar) throws IOException {
        Object objZze = zzhbbVar.zze();
        int iZzm = zzm(objZze, zzhbbVar, bArr, i, i10, zzgxdVar);
        zzhbbVar.zzf(objZze);
        zzgxdVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzhbb zzhbbVar, int i, byte[] bArr, int i10, int i11, zzgzj zzgzjVar, zzgxd zzgxdVar) throws IOException {
        int iZzd = zzd(zzhbbVar, bArr, i10, i11, zzgxdVar);
        zzgzjVar.add(zzgxdVar.zzc);
        while (iZzd < i11) {
            int iZzh = zzh(bArr, iZzd, zzgxdVar);
            if (i != zzgxdVar.zza) {
                break;
            }
            iZzd = zzd(zzhbbVar, bArr, iZzh, i11, zzgxdVar);
            zzgzjVar.add(zzgxdVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzgzj zzgzjVar, zzgxd zzgxdVar) throws IOException {
        zzgyy zzgyyVar = (zzgyy) zzgzjVar;
        int iZzh = zzh(bArr, i, zzgxdVar);
        int i10 = zzgxdVar.zza + iZzh;
        while (iZzh < i10) {
            iZzh = zzh(bArr, iZzh, zzgxdVar);
            zzgyyVar.zzi(zzgxdVar.zza);
        }
        if (iZzh == i10) {
            return iZzh;
        }
        throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(int i, byte[] bArr, int i10, int i11, zzhbo zzhboVar, zzgxd zzgxdVar) throws zzgzm {
        if ((i >>> 3) == 0) {
            throw new zzgzm("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iZzk = zzk(bArr, i10, zzgxdVar);
            zzhboVar.zzj(i, Long.valueOf(zzgxdVar.zzb));
            return iZzk;
        }
        if (i12 == 1) {
            zzhboVar.zzj(i, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzh = zzh(bArr, i10, zzgxdVar);
            int i13 = zzgxdVar.zza;
            if (i13 < 0) {
                throw new zzgzm("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iZzh) {
                throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                zzhboVar.zzj(i, zzgxp.zzb);
            } else {
                zzhboVar.zzj(i, zzgxp.zzv(bArr, iZzh, i13));
            }
            return iZzh + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new zzgzm("Protocol message contained an invalid tag (zero).");
            }
            zzhboVar.zzj(i, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        zzhbo zzhboVarZzf = zzhbo.zzf();
        int i15 = zzgxdVar.zze + 1;
        zzgxdVar.zze = i15;
        zzo(i15);
        int i16 = 0;
        while (i10 < i11) {
            int iZzh2 = zzh(bArr, i10, zzgxdVar);
            int i17 = zzgxdVar.zza;
            if (i17 == i14) {
                i16 = i17;
                i10 = iZzh2;
                break;
            }
            i10 = zzg(i17, bArr, iZzh2, i11, zzhboVarZzf, zzgxdVar);
            i16 = i17;
        }
        zzgxdVar.zze--;
        if (i10 > i11 || i16 != i14) {
            throw new zzgzm("Failed to parse the message.");
        }
        zzhboVar.zzj(i, zzhboVarZzf);
        return i10;
    }

    public static int zzh(byte[] bArr, int i, zzgxd zzgxdVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzi(b10, bArr, i10, zzgxdVar);
        }
        zzgxdVar.zza = b10;
        return i10;
    }

    public static int zzi(int i, byte[] bArr, int i10, zzgxd zzgxdVar) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b10 >= 0) {
            zzgxdVar.zza = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzgxdVar.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzgxdVar.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzgxdVar.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzgxdVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzj(int i, byte[] bArr, int i10, int i11, zzgzj zzgzjVar, zzgxd zzgxdVar) {
        zzgyy zzgyyVar = (zzgyy) zzgzjVar;
        int iZzh = zzh(bArr, i10, zzgxdVar);
        zzgyyVar.zzi(zzgxdVar.zza);
        while (iZzh < i11) {
            int iZzh2 = zzh(bArr, iZzh, zzgxdVar);
            if (i != zzgxdVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzgxdVar);
            zzgyyVar.zzi(zzgxdVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i, zzgxd zzgxdVar) {
        long j4 = bArr[i];
        int i10 = i + 1;
        if (j4 >= 0) {
            zzgxdVar.zzb = j4;
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
        zzgxdVar.zzb = j10;
        return i11;
    }

    public static int zzl(Object obj, zzhbb zzhbbVar, byte[] bArr, int i, int i10, int i11, zzgxd zzgxdVar) throws IOException {
        int i12 = zzgxdVar.zze + 1;
        zzgxdVar.zze = i12;
        zzo(i12);
        int iZzc = ((zzhal) zzhbbVar).zzc(obj, bArr, i, i10, i11, zzgxdVar);
        zzgxdVar.zze--;
        zzgxdVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzhbb zzhbbVar, byte[] bArr, int i, int i10, zzgxd zzgxdVar) throws IOException {
        int iZzi = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iZzi = zzi(i11, bArr, iZzi, zzgxdVar);
            i11 = zzgxdVar.zza;
        }
        int i12 = iZzi;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new zzgzm("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = zzgxdVar.zze + 1;
        zzgxdVar.zze = i13;
        zzo(i13);
        int i14 = i12 + i11;
        zzhbbVar.zzi(obj, bArr, i12, i14, zzgxdVar);
        zzgxdVar.zze--;
        zzgxdVar.zzc = obj;
        return i14;
    }

    public static long zzn(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzo(int i) throws zzgzm {
        if (i >= zzb) {
            throw new zzgzm("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}

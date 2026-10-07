package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzjo {
    public static int zza(byte[] bArr, int i, zzjn zzjnVar) throws zzll {
        int iZzj = zzj(bArr, i, zzjnVar);
        int i10 = zzjnVar.zza;
        if (i10 < 0) {
            throw zzll.zzd();
        }
        if (i10 > bArr.length - iZzj) {
            throw zzll.zzf();
        }
        if (i10 == 0) {
            zzjnVar.zzc = zzka.zzb;
            return iZzj;
        }
        zzjnVar.zzc = zzka.zzl(bArr, iZzj, i10);
        return iZzj + i10;
    }

    public static int zzb(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzmt zzmtVar, byte[] bArr, int i, int i10, int i11, zzjn zzjnVar) throws IOException {
        Object objZze = zzmtVar.zze();
        int iZzn = zzn(objZze, zzmtVar, bArr, i, i10, i11, zzjnVar);
        zzmtVar.zzf(objZze);
        zzjnVar.zzc = objZze;
        return iZzn;
    }

    public static int zzd(zzmt zzmtVar, byte[] bArr, int i, int i10, zzjn zzjnVar) throws IOException {
        Object objZze = zzmtVar.zze();
        int iZzo = zzo(objZze, zzmtVar, bArr, i, i10, zzjnVar);
        zzmtVar.zzf(objZze);
        zzjnVar.zzc = objZze;
        return iZzo;
    }

    public static int zze(zzmt zzmtVar, int i, byte[] bArr, int i10, int i11, zzli zzliVar, zzjn zzjnVar) throws IOException {
        int iZzd = zzd(zzmtVar, bArr, i10, i11, zzjnVar);
        zzliVar.add(zzjnVar.zzc);
        while (iZzd < i11) {
            int iZzj = zzj(bArr, iZzd, zzjnVar);
            if (i != zzjnVar.zza) {
                break;
            }
            iZzd = zzd(zzmtVar, bArr, iZzj, i11, zzjnVar);
            zzliVar.add(zzjnVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzli zzliVar, zzjn zzjnVar) throws IOException {
        zzlc zzlcVar = (zzlc) zzliVar;
        int iZzj = zzj(bArr, i, zzjnVar);
        int i10 = zzjnVar.zza + iZzj;
        while (iZzj < i10) {
            iZzj = zzj(bArr, iZzj, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        if (iZzj == i10) {
            return iZzj;
        }
        throw zzll.zzf();
    }

    public static int zzg(byte[] bArr, int i, zzjn zzjnVar) throws zzll {
        int iZzj = zzj(bArr, i, zzjnVar);
        int i10 = zzjnVar.zza;
        if (i10 < 0) {
            throw zzll.zzd();
        }
        if (i10 == 0) {
            zzjnVar.zzc = "";
            return iZzj;
        }
        zzjnVar.zzc = new String(bArr, iZzj, i10, zzlj.zzb);
        return iZzj + i10;
    }

    public static int zzh(byte[] bArr, int i, zzjn zzjnVar) throws zzll {
        int iZzj = zzj(bArr, i, zzjnVar);
        int i10 = zzjnVar.zza;
        if (i10 < 0) {
            throw zzll.zzd();
        }
        if (i10 == 0) {
            zzjnVar.zzc = "";
            return iZzj;
        }
        int i11 = zznz.zza;
        int length = bArr.length;
        if ((((length - iZzj) - i10) | iZzj | i10) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzj), Integer.valueOf(i10)));
        }
        int i12 = iZzj + i10;
        char[] cArr = new char[i10];
        int i13 = 0;
        while (iZzj < i12) {
            byte b10 = bArr[iZzj];
            if (!zznv.zzd(b10)) {
                break;
            }
            iZzj++;
            cArr[i13] = (char) b10;
            i13++;
        }
        int i14 = i13;
        while (iZzj < i12) {
            int i15 = iZzj + 1;
            byte b11 = bArr[iZzj];
            if (zznv.zzd(b11)) {
                cArr[i14] = (char) b11;
                i14++;
                iZzj = i15;
                while (iZzj < i12) {
                    byte b12 = bArr[iZzj];
                    if (!zznv.zzd(b12)) {
                        break;
                    }
                    iZzj++;
                    cArr[i14] = (char) b12;
                    i14++;
                }
            } else if (b11 < -32) {
                if (i15 >= i12) {
                    throw zzll.zzc();
                }
                iZzj += 2;
                zznv.zzc(b11, bArr[i15], cArr, i14);
                i14++;
            } else if (b11 < -16) {
                if (i15 >= i12 - 1) {
                    throw zzll.zzc();
                }
                int i16 = iZzj + 2;
                iZzj += 3;
                zznv.zzb(b11, bArr[i15], bArr[i16], cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw zzll.zzc();
                }
                byte b13 = bArr[i15];
                int i17 = iZzj + 3;
                byte b14 = bArr[iZzj + 2];
                iZzj += 4;
                zznv.zza(b11, b13, b14, bArr[i17], cArr, i14);
                i14 += 2;
            }
        }
        zzjnVar.zzc = new String(cArr, 0, i14);
        return i12;
    }

    public static int zzi(int i, byte[] bArr, int i10, int i11, zznl zznlVar, zzjn zzjnVar) throws zzll {
        if ((i >>> 3) == 0) {
            throw zzll.zzb();
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iZzm = zzm(bArr, i10, zzjnVar);
            zznlVar.zzj(i, Long.valueOf(zzjnVar.zzb));
            return iZzm;
        }
        if (i12 == 1) {
            zznlVar.zzj(i, Long.valueOf(zzp(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzj = zzj(bArr, i10, zzjnVar);
            int i13 = zzjnVar.zza;
            if (i13 < 0) {
                throw zzll.zzd();
            }
            if (i13 > bArr.length - iZzj) {
                throw zzll.zzf();
            }
            if (i13 == 0) {
                zznlVar.zzj(i, zzka.zzb);
            } else {
                zznlVar.zzj(i, zzka.zzl(bArr, iZzj, i13));
            }
            return iZzj + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzll.zzb();
            }
            zznlVar.zzj(i, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        zznl zznlVarZzf = zznl.zzf();
        int i15 = 0;
        while (i10 < i11) {
            int iZzj2 = zzj(bArr, i10, zzjnVar);
            i15 = zzjnVar.zza;
            if (i15 == i14) {
                i10 = iZzj2;
                break;
            }
            i10 = zzi(i15, bArr, iZzj2, i11, zznlVarZzf, zzjnVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw zzll.zze();
        }
        zznlVar.zzj(i, zznlVarZzf);
        return i10;
    }

    public static int zzj(byte[] bArr, int i, zzjn zzjnVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzk(b10, bArr, i10, zzjnVar);
        }
        zzjnVar.zza = b10;
        return i10;
    }

    public static int zzk(int i, byte[] bArr, int i10, zzjn zzjnVar) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b10 >= 0) {
            zzjnVar.zza = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzjnVar.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzjnVar.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzjnVar.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzjnVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzl(int i, byte[] bArr, int i10, int i11, zzli zzliVar, zzjn zzjnVar) {
        zzlc zzlcVar = (zzlc) zzliVar;
        int iZzj = zzj(bArr, i10, zzjnVar);
        zzlcVar.zzh(zzjnVar.zza);
        while (iZzj < i11) {
            int iZzj2 = zzj(bArr, iZzj, zzjnVar);
            if (i != zzjnVar.zza) {
                break;
            }
            iZzj = zzj(bArr, iZzj2, zzjnVar);
            zzlcVar.zzh(zzjnVar.zza);
        }
        return iZzj;
    }

    public static int zzm(byte[] bArr, int i, zzjn zzjnVar) {
        long j4 = bArr[i];
        int i10 = i + 1;
        if (j4 >= 0) {
            zzjnVar.zzb = j4;
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
        zzjnVar.zzb = j10;
        return i11;
    }

    public static int zzn(Object obj, zzmt zzmtVar, byte[] bArr, int i, int i10, int i11, zzjn zzjnVar) throws IOException {
        int iZzc = ((zzml) zzmtVar).zzc(obj, bArr, i, i10, i11, zzjnVar);
        zzjnVar.zzc = obj;
        return iZzc;
    }

    public static int zzo(Object obj, zzmt zzmtVar, byte[] bArr, int i, int i10, zzjn zzjnVar) throws IOException {
        int iZzk = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iZzk = zzk(i11, bArr, iZzk, zzjnVar);
            i11 = zzjnVar.zza;
        }
        int i12 = iZzk;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzll.zzf();
        }
        int i13 = i12 + i11;
        zzmtVar.zzh(obj, bArr, i12, i13, zzjnVar);
        zzjnVar.zzc = obj;
        return i13;
    }

    public static long zzp(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzait {
    public static int zza(byte[] bArr, int i, zzais zzaisVar) throws zzaks {
        int iZzh = zzh(bArr, i, zzaisVar);
        int i10 = zzaisVar.zza;
        if (i10 < 0) {
            throw zzaks.zzf();
        }
        if (i10 > bArr.length - iZzh) {
            throw zzaks.zzj();
        }
        if (i10 == 0) {
            zzaisVar.zzc = zzajf.zzb;
            return iZzh;
        }
        zzaisVar.zzc = zzajf.zzn(bArr, iZzh, i10);
        return iZzh + i10;
    }

    public static int zzb(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzamb zzambVar, byte[] bArr, int i, int i10, int i11, zzais zzaisVar) throws IOException {
        Object objZze = zzambVar.zze();
        int iZzl = zzl(objZze, zzambVar, bArr, i, i10, i11, zzaisVar);
        zzambVar.zzf(objZze);
        zzaisVar.zzc = objZze;
        return iZzl;
    }

    public static int zzd(zzamb zzambVar, byte[] bArr, int i, int i10, zzais zzaisVar) throws IOException {
        Object objZze = zzambVar.zze();
        int iZzm = zzm(objZze, zzambVar, bArr, i, i10, zzaisVar);
        zzambVar.zzf(objZze);
        zzaisVar.zzc = objZze;
        return iZzm;
    }

    public static int zze(zzamb zzambVar, int i, byte[] bArr, int i10, int i11, zzakp zzakpVar, zzais zzaisVar) throws IOException {
        int iZzd = zzd(zzambVar, bArr, i10, i11, zzaisVar);
        zzakpVar.add(zzaisVar.zzc);
        while (iZzd < i11) {
            int iZzh = zzh(bArr, iZzd, zzaisVar);
            if (i != zzaisVar.zza) {
                break;
            }
            iZzd = zzd(zzambVar, bArr, iZzh, i11, zzaisVar);
            zzakpVar.add(zzaisVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzakp zzakpVar, zzais zzaisVar) throws IOException {
        zzakl zzaklVar = (zzakl) zzakpVar;
        int iZzh = zzh(bArr, i, zzaisVar);
        int i10 = zzaisVar.zza + iZzh;
        while (iZzh < i10) {
            iZzh = zzh(bArr, iZzh, zzaisVar);
            zzaklVar.zzf(zzaisVar.zza);
        }
        if (iZzh == i10) {
            return iZzh;
        }
        throw zzaks.zzj();
    }

    public static int zzg(int i, byte[] bArr, int i10, int i11, zzamw zzamwVar, zzais zzaisVar) throws zzaks {
        if ((i >>> 3) == 0) {
            throw zzaks.zzc();
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iZzk = zzk(bArr, i10, zzaisVar);
            zzamwVar.zzj(i, Long.valueOf(zzaisVar.zzb));
            return iZzk;
        }
        if (i12 == 1) {
            zzamwVar.zzj(i, Long.valueOf(zzn(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzh = zzh(bArr, i10, zzaisVar);
            int i13 = zzaisVar.zza;
            if (i13 < 0) {
                throw zzaks.zzf();
            }
            if (i13 > bArr.length - iZzh) {
                throw zzaks.zzj();
            }
            if (i13 == 0) {
                zzamwVar.zzj(i, zzajf.zzb);
            } else {
                zzamwVar.zzj(i, zzajf.zzn(bArr, iZzh, i13));
            }
            return iZzh + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzaks.zzc();
            }
            zzamwVar.zzj(i, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        zzamw zzamwVarZzf = zzamw.zzf();
        int i15 = 0;
        while (i10 < i11) {
            int iZzh2 = zzh(bArr, i10, zzaisVar);
            i15 = zzaisVar.zza;
            if (i15 == i14) {
                i10 = iZzh2;
                break;
            }
            i10 = zzg(i15, bArr, iZzh2, i11, zzamwVarZzf, zzaisVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw zzaks.zzg();
        }
        zzamwVar.zzj(i, zzamwVarZzf);
        return i10;
    }

    public static int zzh(byte[] bArr, int i, zzais zzaisVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzi(b10, bArr, i10, zzaisVar);
        }
        zzaisVar.zza = b10;
        return i10;
    }

    public static int zzi(int i, byte[] bArr, int i10, zzais zzaisVar) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b10 >= 0) {
            zzaisVar.zza = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzaisVar.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzaisVar.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzaisVar.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzaisVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzj(int i, byte[] bArr, int i10, int i11, zzakp zzakpVar, zzais zzaisVar) {
        zzakl zzaklVar = (zzakl) zzakpVar;
        int iZzh = zzh(bArr, i10, zzaisVar);
        zzaklVar.zzf(zzaisVar.zza);
        while (iZzh < i11) {
            int iZzh2 = zzh(bArr, iZzh, zzaisVar);
            if (i != zzaisVar.zza) {
                break;
            }
            iZzh = zzh(bArr, iZzh2, zzaisVar);
            zzaklVar.zzf(zzaisVar.zza);
        }
        return iZzh;
    }

    public static int zzk(byte[] bArr, int i, zzais zzaisVar) {
        long j4 = bArr[i];
        int i10 = i + 1;
        if (j4 >= 0) {
            zzaisVar.zzb = j4;
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
        zzaisVar.zzb = j10;
        return i11;
    }

    public static int zzl(Object obj, zzamb zzambVar, byte[] bArr, int i, int i10, int i11, zzais zzaisVar) throws IOException {
        int iZzc = ((zzals) zzambVar).zzc(obj, bArr, i, i10, i11, zzaisVar);
        zzaisVar.zzc = obj;
        return iZzc;
    }

    public static int zzm(Object obj, zzamb zzambVar, byte[] bArr, int i, int i10, zzais zzaisVar) throws IOException {
        int iZzi = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iZzi = zzi(i11, bArr, iZzi, zzaisVar);
            i11 = zzaisVar.zza;
        }
        int i12 = iZzi;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzaks.zzj();
        }
        int i13 = i12 + i11;
        zzambVar.zzi(obj, bArr, i12, i13, zzaisVar);
        zzaisVar.zzc = obj;
        return i13;
    }

    public static long zzn(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}

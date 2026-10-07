package com.google.android.recaptcha.internal;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
final class zzgk {
    public static int zza(byte[] bArr, int i, zzgj zzgjVar) throws zzje {
        int iZzi = zzi(bArr, i, zzgjVar);
        int i10 = zzgjVar.zza;
        if (i10 < 0) {
            throw zzje.zzf();
        }
        if (i10 > bArr.length - iZzi) {
            throw zzje.zzj();
        }
        if (i10 == 0) {
            zzgjVar.zzc = zzgw.zzb;
            return iZzi;
        }
        zzgjVar.zzc = zzgw.zzm(bArr, iZzi, i10);
        return iZzi + i10;
    }

    public static int zzb(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzkr zzkrVar, byte[] bArr, int i, int i10, int i11, zzgj zzgjVar) throws IOException {
        Object objZze = zzkrVar.zze();
        int iZzm = zzm(objZze, zzkrVar, bArr, i, i10, i11, zzgjVar);
        zzkrVar.zzf(objZze);
        zzgjVar.zzc = objZze;
        return iZzm;
    }

    public static int zzd(zzkr zzkrVar, byte[] bArr, int i, int i10, zzgj zzgjVar) throws IOException {
        Object objZze = zzkrVar.zze();
        int iZzn = zzn(objZze, zzkrVar, bArr, i, i10, zzgjVar);
        zzkrVar.zzf(objZze);
        zzgjVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzkr zzkrVar, int i, byte[] bArr, int i10, int i11, zzjb zzjbVar, zzgj zzgjVar) throws IOException {
        int iZzd = zzd(zzkrVar, bArr, i10, i11, zzgjVar);
        zzjbVar.add(zzgjVar.zzc);
        while (iZzd < i11) {
            int iZzi = zzi(bArr, iZzd, zzgjVar);
            if (i != zzgjVar.zza) {
                break;
            }
            iZzd = zzd(zzkrVar, bArr, iZzi, i11, zzgjVar);
            zzjbVar.add(zzgjVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzjb zzjbVar, zzgj zzgjVar) throws IOException {
        zziu zziuVar = (zziu) zzjbVar;
        int iZzi = zzi(bArr, i, zzgjVar);
        int i10 = zzgjVar.zza + iZzi;
        while (iZzi < i10) {
            iZzi = zzi(bArr, iZzi, zzgjVar);
            zziuVar.zzg(zzgjVar.zza);
        }
        if (iZzi == i10) {
            return iZzi;
        }
        throw zzje.zzj();
    }

    public static int zzg(byte[] bArr, int i, zzgj zzgjVar) throws zzje {
        int iZzi = zzi(bArr, i, zzgjVar);
        int i10 = zzgjVar.zza;
        if (i10 < 0) {
            throw zzje.zzf();
        }
        if (i10 == 0) {
            zzgjVar.zzc = "";
            return iZzi;
        }
        zzgjVar.zzc = new String(bArr, iZzi, i10, zzjc.zzb);
        return iZzi + i10;
    }

    public static int zzh(int i, byte[] bArr, int i10, int i11, zzlm zzlmVar, zzgj zzgjVar) throws zzje {
        if ((i >>> 3) == 0) {
            throw zzje.zzc();
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iZzl = zzl(bArr, i10, zzgjVar);
            zzlmVar.zzj(i, Long.valueOf(zzgjVar.zzb));
            return iZzl;
        }
        if (i12 == 1) {
            zzlmVar.zzj(i, Long.valueOf(zzp(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzi = zzi(bArr, i10, zzgjVar);
            int i13 = zzgjVar.zza;
            if (i13 < 0) {
                throw zzje.zzf();
            }
            if (i13 > bArr.length - iZzi) {
                throw zzje.zzj();
            }
            if (i13 == 0) {
                zzlmVar.zzj(i, zzgw.zzb);
            } else {
                zzlmVar.zzj(i, zzgw.zzm(bArr, iZzi, i13));
            }
            return iZzi + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw zzje.zzc();
            }
            zzlmVar.zzj(i, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        zzlm zzlmVarZzf = zzlm.zzf();
        int i15 = 0;
        while (i10 < i11) {
            int iZzi2 = zzi(bArr, i10, zzgjVar);
            i15 = zzgjVar.zza;
            if (i15 == i14) {
                i10 = iZzi2;
                break;
            }
            i10 = zzh(i15, bArr, iZzi2, i11, zzlmVarZzf, zzgjVar);
        }
        if (i10 > i11 || i15 != i14) {
            throw zzje.zzg();
        }
        zzlmVar.zzj(i, zzlmVarZzf);
        return i10;
    }

    public static int zzi(byte[] bArr, int i, zzgj zzgjVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzj(b10, bArr, i10, zzgjVar);
        }
        zzgjVar.zza = b10;
        return i10;
    }

    public static int zzj(int i, byte[] bArr, int i10, zzgj zzgjVar) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b10 >= 0) {
            zzgjVar.zza = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzgjVar.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzgjVar.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzgjVar.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzgjVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzk(int i, byte[] bArr, int i10, int i11, zzjb zzjbVar, zzgj zzgjVar) {
        zziu zziuVar = (zziu) zzjbVar;
        int iZzi = zzi(bArr, i10, zzgjVar);
        zziuVar.zzg(zzgjVar.zza);
        while (iZzi < i11) {
            int iZzi2 = zzi(bArr, iZzi, zzgjVar);
            if (i != zzgjVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzgjVar);
            zziuVar.zzg(zzgjVar.zza);
        }
        return iZzi;
    }

    public static int zzl(byte[] bArr, int i, zzgj zzgjVar) {
        long j4 = bArr[i];
        int i10 = i + 1;
        if (j4 >= 0) {
            zzgjVar.zzb = j4;
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
        zzgjVar.zzb = j10;
        return i11;
    }

    public static int zzm(Object obj, zzkr zzkrVar, byte[] bArr, int i, int i10, int i11, zzgj zzgjVar) throws IOException {
        int iZzc = ((zzkh) zzkrVar).zzc(obj, bArr, i, i10, i11, zzgjVar);
        zzgjVar.zzc = obj;
        return iZzc;
    }

    public static int zzn(Object obj, zzkr zzkrVar, byte[] bArr, int i, int i10, zzgj zzgjVar) throws IOException {
        int iZzj = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iZzj = zzj(i11, bArr, iZzj, zzgjVar);
            i11 = zzgjVar.zza;
        }
        int i12 = iZzj;
        if (i11 < 0 || i11 > i10 - i12) {
            throw zzje.zzj();
        }
        int i13 = i12 + i11;
        zzkrVar.zzi(obj, bArr, i12, i13, zzgjVar);
        zzgjVar.zzc = obj;
        return i13;
    }

    public static int zzo(int i, byte[] bArr, int i10, int i11, zzgj zzgjVar) throws zzje {
        if ((i >>> 3) == 0) {
            throw zzje.zzc();
        }
        int i12 = i & 7;
        if (i12 == 0) {
            return zzl(bArr, i10, zzgjVar);
        }
        if (i12 == 1) {
            return i10 + 8;
        }
        if (i12 == 2) {
            return zzi(bArr, i10, zzgjVar) + zzgjVar.zza;
        }
        if (i12 != 3) {
            if (i12 == 5) {
                return i10 + 4;
            }
            throw zzje.zzc();
        }
        int i13 = (i & (-8)) | 4;
        int i14 = 0;
        while (i10 < i11) {
            i10 = zzi(bArr, i10, zzgjVar);
            i14 = zzgjVar.zza;
            if (i14 == i13) {
                break;
            }
            i10 = zzo(i14, bArr, i10, i11, zzgjVar);
        }
        if (i10 > i11 || i14 != i13) {
            throw zzje.zzg();
        }
        return i10;
    }

    public static long zzp(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }
}

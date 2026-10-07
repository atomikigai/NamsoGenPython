package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzdx {
    public static final /* synthetic */ int zza = 0;
    private static volatile int zzb = 100;

    public static int zza(byte[] bArr, int i, zzdw zzdwVar) throws zzfq {
        int iZzi = zzi(bArr, i, zzdwVar);
        int i10 = zzdwVar.zza;
        if (i10 < 0) {
            throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i10 > bArr.length - iZzi) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i10 == 0) {
            zzdwVar.zzc = zzei.zzb;
            return iZzi;
        }
        zzdwVar.zzc = zzei.zzj(bArr, iZzi, i10);
        return iZzi + i10;
    }

    public static int zzb(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }

    public static int zzc(zzgv zzgvVar, byte[] bArr, int i, int i10, int i11, zzdw zzdwVar) throws IOException {
        Object objZze = zzgvVar.zze();
        int iZzm = zzm(objZze, zzgvVar, bArr, i, i10, i11, zzdwVar);
        zzgvVar.zzf(objZze);
        zzdwVar.zzc = objZze;
        return iZzm;
    }

    public static int zzd(zzgv zzgvVar, byte[] bArr, int i, int i10, zzdw zzdwVar) throws IOException {
        Object objZze = zzgvVar.zze();
        int iZzn = zzn(objZze, zzgvVar, bArr, i, i10, zzdwVar);
        zzgvVar.zzf(objZze);
        zzdwVar.zzc = objZze;
        return iZzn;
    }

    public static int zze(zzgv zzgvVar, int i, byte[] bArr, int i10, int i11, zzfn zzfnVar, zzdw zzdwVar) throws IOException {
        int iZzd = zzd(zzgvVar, bArr, i10, i11, zzdwVar);
        zzfnVar.add(zzdwVar.zzc);
        while (iZzd < i11) {
            int iZzi = zzi(bArr, iZzd, zzdwVar);
            if (i != zzdwVar.zza) {
                break;
            }
            iZzd = zzd(zzgvVar, bArr, iZzi, i11, zzdwVar);
            zzfnVar.add(zzdwVar.zzc);
        }
        return iZzd;
    }

    public static int zzf(byte[] bArr, int i, zzfn zzfnVar, zzdw zzdwVar) throws IOException {
        zzfj zzfjVar = (zzfj) zzfnVar;
        int iZzi = zzi(bArr, i, zzdwVar);
        int i10 = zzdwVar.zza + iZzi;
        while (iZzi < i10) {
            iZzi = zzi(bArr, iZzi, zzdwVar);
            zzfjVar.zzg(zzdwVar.zza);
        }
        if (iZzi == i10) {
            return iZzi;
        }
        throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public static int zzg(byte[] bArr, int i, zzdw zzdwVar) throws zzfq {
        int i10;
        int iZzi = zzi(bArr, i, zzdwVar);
        int i11 = zzdwVar.zza;
        if (i11 < 0) {
            throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i11 == 0) {
            zzdwVar.zzc = "";
            return iZzi;
        }
        int i12 = zzhr.zza;
        int length = bArr.length;
        if ((((length - iZzi) - i11) | iZzi | i11) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(length), Integer.valueOf(iZzi), Integer.valueOf(i11)));
        }
        int i13 = iZzi + i11;
        char[] cArr = new char[i11];
        int i14 = 0;
        while (iZzi < i13) {
            byte b10 = bArr[iZzi];
            if (!zzhp.zzd(b10)) {
                break;
            }
            iZzi++;
            cArr[i14] = (char) b10;
            i14++;
        }
        int i15 = i14;
        while (iZzi < i13) {
            int i16 = iZzi + 1;
            byte b11 = bArr[iZzi];
            if (zzhp.zzd(b11)) {
                cArr[i15] = (char) b11;
                i15++;
                iZzi = i16;
                while (iZzi < i13) {
                    byte b12 = bArr[iZzi];
                    if (!zzhp.zzd(b12)) {
                        break;
                    }
                    iZzi++;
                    cArr[i15] = (char) b12;
                    i15++;
                }
            } else {
                if (b11 < -32) {
                    if (i16 >= i13) {
                        throw new zzfq("Protocol message had invalid UTF-8.");
                    }
                    i10 = i15 + 1;
                    iZzi += 2;
                    zzhp.zzc(b11, bArr[i16], cArr, i15);
                } else if (b11 < -16) {
                    if (i16 >= i13 - 1) {
                        throw new zzfq("Protocol message had invalid UTF-8.");
                    }
                    i10 = i15 + 1;
                    int i17 = iZzi + 2;
                    iZzi += 3;
                    zzhp.zzb(b11, bArr[i16], bArr[i17], cArr, i15);
                } else {
                    if (i16 >= i13 - 2) {
                        throw new zzfq("Protocol message had invalid UTF-8.");
                    }
                    byte b13 = bArr[i16];
                    int i18 = iZzi + 3;
                    byte b14 = bArr[iZzi + 2];
                    iZzi += 4;
                    zzhp.zza(b11, b13, b14, bArr[i18], cArr, i15);
                    i15 += 2;
                }
                i15 = i10;
            }
        }
        zzdwVar.zzc = new String(cArr, 0, i15);
        return i13;
    }

    public static int zzh(int i, byte[] bArr, int i10, int i11, zzhi zzhiVar, zzdw zzdwVar) throws zzfq {
        if ((i >>> 3) == 0) {
            throw new zzfq("Protocol message contained an invalid tag (zero).");
        }
        int i12 = i & 7;
        if (i12 == 0) {
            int iZzl = zzl(bArr, i10, zzdwVar);
            zzhiVar.zzj(i, Long.valueOf(zzdwVar.zzb));
            return iZzl;
        }
        if (i12 == 1) {
            zzhiVar.zzj(i, Long.valueOf(zzo(bArr, i10)));
            return i10 + 8;
        }
        if (i12 == 2) {
            int iZzi = zzi(bArr, i10, zzdwVar);
            int i13 = zzdwVar.zza;
            if (i13 < 0) {
                throw new zzfq("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i13 > bArr.length - iZzi) {
                throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i13 == 0) {
                zzhiVar.zzj(i, zzei.zzb);
            } else {
                zzhiVar.zzj(i, zzei.zzj(bArr, iZzi, i13));
            }
            return iZzi + i13;
        }
        if (i12 != 3) {
            if (i12 != 5) {
                throw new zzfq("Protocol message contained an invalid tag (zero).");
            }
            zzhiVar.zzj(i, Integer.valueOf(zzb(bArr, i10)));
            return i10 + 4;
        }
        int i14 = (i & (-8)) | 4;
        zzhi zzhiVarZzf = zzhi.zzf();
        int i15 = zzdwVar.zze + 1;
        zzdwVar.zze = i15;
        zzp(i15);
        int i16 = 0;
        while (i10 < i11) {
            int iZzi2 = zzi(bArr, i10, zzdwVar);
            int i17 = zzdwVar.zza;
            if (i17 == i14) {
                i16 = i17;
                i10 = iZzi2;
                break;
            }
            i10 = zzh(i17, bArr, iZzi2, i11, zzhiVarZzf, zzdwVar);
            i16 = i17;
        }
        zzdwVar.zze--;
        if (i10 > i11 || i16 != i14) {
            throw new zzfq("Failed to parse the message.");
        }
        zzhiVar.zzj(i, zzhiVarZzf);
        return i10;
    }

    public static int zzi(byte[] bArr, int i, zzdw zzdwVar) {
        int i10 = i + 1;
        byte b10 = bArr[i];
        if (b10 < 0) {
            return zzj(b10, bArr, i10, zzdwVar);
        }
        zzdwVar.zza = b10;
        return i10;
    }

    public static int zzj(int i, byte[] bArr, int i10, zzdw zzdwVar) {
        byte b10 = bArr[i10];
        int i11 = i10 + 1;
        int i12 = i & 127;
        if (b10 >= 0) {
            zzdwVar.zza = i12 | (b10 << 7);
            return i11;
        }
        int i13 = i12 | ((b10 & 127) << 7);
        int i14 = i10 + 2;
        byte b11 = bArr[i11];
        if (b11 >= 0) {
            zzdwVar.zza = i13 | (b11 << 14);
            return i14;
        }
        int i15 = i13 | ((b11 & 127) << 14);
        int i16 = i10 + 3;
        byte b12 = bArr[i14];
        if (b12 >= 0) {
            zzdwVar.zza = i15 | (b12 << 21);
            return i16;
        }
        int i17 = i15 | ((b12 & 127) << 21);
        int i18 = i10 + 4;
        byte b13 = bArr[i16];
        if (b13 >= 0) {
            zzdwVar.zza = i17 | (b13 << 28);
            return i18;
        }
        int i19 = i17 | ((b13 & 127) << 28);
        while (true) {
            int i20 = i18 + 1;
            if (bArr[i18] >= 0) {
                zzdwVar.zza = i19;
                return i20;
            }
            i18 = i20;
        }
    }

    public static int zzk(int i, byte[] bArr, int i10, int i11, zzfn zzfnVar, zzdw zzdwVar) {
        zzfj zzfjVar = (zzfj) zzfnVar;
        int iZzi = zzi(bArr, i10, zzdwVar);
        zzfjVar.zzg(zzdwVar.zza);
        while (iZzi < i11) {
            int iZzi2 = zzi(bArr, iZzi, zzdwVar);
            if (i != zzdwVar.zza) {
                break;
            }
            iZzi = zzi(bArr, iZzi2, zzdwVar);
            zzfjVar.zzg(zzdwVar.zza);
        }
        return iZzi;
    }

    public static int zzl(byte[] bArr, int i, zzdw zzdwVar) {
        long j4 = bArr[i];
        int i10 = i + 1;
        if (j4 >= 0) {
            zzdwVar.zzb = j4;
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
        zzdwVar.zzb = j10;
        return i11;
    }

    public static int zzm(Object obj, zzgv zzgvVar, byte[] bArr, int i, int i10, int i11, zzdw zzdwVar) throws IOException {
        int i12 = zzdwVar.zze + 1;
        zzdwVar.zze = i12;
        zzp(i12);
        int iZzc = ((zzgo) zzgvVar).zzc(obj, bArr, i, i10, i11, zzdwVar);
        zzdwVar.zze--;
        zzdwVar.zzc = obj;
        return iZzc;
    }

    public static int zzn(Object obj, zzgv zzgvVar, byte[] bArr, int i, int i10, zzdw zzdwVar) throws IOException {
        int iZzj = i + 1;
        int i11 = bArr[i];
        if (i11 < 0) {
            iZzj = zzj(i11, bArr, iZzj, zzdwVar);
            i11 = zzdwVar.zza;
        }
        int i12 = iZzj;
        if (i11 < 0 || i11 > i10 - i12) {
            throw new zzfq("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i13 = zzdwVar.zze + 1;
        zzdwVar.zze = i13;
        zzp(i13);
        int i14 = i12 + i11;
        zzgvVar.zzh(obj, bArr, i12, i14, zzdwVar);
        zzdwVar.zze--;
        zzdwVar.zzc = obj;
        return i14;
    }

    public static long zzo(byte[] bArr, int i) {
        return (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48) | ((((long) bArr[i + 7]) & 255) << 56);
    }

    private static void zzp(int i) throws zzfq {
        if (i >= zzb) {
            throw new zzfq("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
    }
}

package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzacq {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] zzc = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] zzd = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] zze = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] zzf = {5, 8, 10, 12};
    private static final int[] zzg = {6, 9, 12, 15};
    private static final int[] zzh = {2, 4, 6, 8};
    private static final int[] zzi = {9, 11, 13, 16};
    private static final int[] zzj = {5, 8, 10, 12};

    public static int zza(byte[] bArr) {
        zzec zzecVarZzg = zzg(bArr);
        zzecVarZzg.zzn(42);
        return zzecVarZzg.zzd(true != zzecVarZzg.zzp() ? 8 : 12) + 1;
    }

    public static int zzb(byte[] bArr) {
        zzec zzecVarZzg = zzg(bArr);
        zzecVarZzg.zzn(32);
        return zzf(zzecVarZzg, zzj, true) + 1;
    }

    public static zzad zzc(byte[] bArr, String str, String str2, int i, zzw zzwVar) {
        zzec zzecVarZzg = zzg(bArr);
        zzecVarZzg.zzn(60);
        int i10 = zzb[zzecVarZzg.zzd(6)];
        int i11 = zzc[zzecVarZzg.zzd(4)];
        int iZzd = zzecVarZzg.zzd(5);
        int i12 = iZzd >= 29 ? -1 : (zzd[iZzd] * zzbbs.zzq.zzf) / 2;
        zzecVarZzg.zzn(10);
        int i13 = i10 + (zzecVarZzg.zzd(2) > 0 ? 1 : 0);
        zzab zzabVar = new zzab();
        zzabVar.zzL(str);
        zzabVar.zzZ("audio/vnd.dts");
        zzabVar.zzy(i12);
        zzabVar.zzz(i13);
        zzabVar.zzaa(i11);
        zzabVar.zzF(null);
        zzabVar.zzP(str2);
        zzabVar.zzX(i);
        return zzabVar.zzaf();
    }

    public static zzaco zzd(byte[] bArr) throws zzbh {
        int iZzd;
        int i;
        long jZzu;
        int i10;
        zzec zzecVarZzg = zzg(bArr);
        zzecVarZzg.zzn(40);
        int iZzd2 = zzecVarZzg.zzd(2);
        boolean zZzp = zzecVarZzg.zzp();
        int i11 = true != zZzp ? 16 : 20;
        zzecVarZzg.zzn(true != zZzp ? 8 : 12);
        int iZzd3 = zzecVarZzg.zzd(i11) + 1;
        boolean zZzp2 = zzecVarZzg.zzp();
        int iZzd4 = -1;
        int i12 = 0;
        if (zZzp2) {
            iZzd = zzecVarZzg.zzd(2);
            int iZzd5 = zzecVarZzg.zzd(3) + 1;
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzn(36);
            }
            int iZzd6 = zzecVarZzg.zzd(3) + 1;
            int iZzd7 = zzecVarZzg.zzd(3) + 1;
            if (iZzd6 != 1 || iZzd7 != 1) {
                throw zzbh.zzc("Multiple audio presentations or assets not supported");
            }
            int i13 = iZzd2 + 1;
            int iZzd8 = zzecVarZzg.zzd(i13);
            for (int i14 = 0; i14 < i13; i14++) {
                if (((iZzd8 >> i14) & 1) == 1) {
                    zzecVarZzg.zzn(8);
                }
            }
            int i15 = iZzd5 * 512;
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzn(2);
                int iZzd9 = (zzecVarZzg.zzd(2) + 1) << 2;
                int iZzd10 = zzecVarZzg.zzd(2) + 1;
                while (i12 < iZzd10) {
                    zzecVarZzg.zzn(iZzd9);
                    i12++;
                }
            }
            i12 = i15;
        } else {
            iZzd = -1;
        }
        zzecVarZzg.zzn(i11);
        zzecVarZzg.zzn(12);
        if (zZzp2) {
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzn(4);
            }
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzn(24);
            }
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzo(zzecVarZzg.zzd(10) + 1);
            }
            zzecVarZzg.zzn(5);
            i = zze[zzecVarZzg.zzd(4)];
            iZzd4 = zzecVarZzg.zzd(8) + 1;
        } else {
            i = -2147483647;
        }
        int i16 = i;
        if (zZzp2) {
            if (iZzd == 0) {
                i10 = 32000;
            } else if (iZzd == 1) {
                i10 = 44100;
            } else {
                if (iZzd != 2) {
                    throw zzbh.zza("Unsupported reference clock code in DTS HD header: " + iZzd, null);
                }
                i10 = 48000;
            }
            jZzu = zzen.zzu(i12, 1000000L, i10, RoundingMode.FLOOR);
        } else {
            jZzu = -9223372036854775807L;
        }
        return new zzaco("audio/vnd.dts.hd;profile=lbr", iZzd4, i16, iZzd3, jZzu, 0, null);
    }

    public static zzaco zze(byte[] bArr, AtomicInteger atomicInteger) throws zzbh {
        long jZzu;
        int iZzd;
        AtomicInteger atomicInteger2;
        int i;
        int i10;
        zzec zzecVarZzg = zzg(bArr);
        int iZzd2 = zzecVarZzg.zzd(32);
        int iZzf = zzf(zzecVarZzg, zzf, true);
        int i11 = iZzf + 1;
        char c10 = iZzd2 == 1078008818 ? (char) 1 : (char) 0;
        if (c10 == 0) {
            jZzu = -9223372036854775807L;
            iZzd = -2147483647;
        } else {
            if (!zzecVarZzg.zzp()) {
                throw zzbh.zzc("Only supports full channel mask-based audio presentation");
            }
            int i12 = iZzf - 1;
            if (((bArr[iZzf] & 255) | ((char) (bArr[i12] << 8))) != zzen.zze(bArr, 0, i12, 65535)) {
                throw zzbh.zza("CRC check failed", null);
            }
            int iZzd3 = zzecVarZzg.zzd(2);
            if (iZzd3 == 0) {
                i = 512;
            } else if (iZzd3 == 1) {
                i = 480;
            } else {
                if (iZzd3 != 2) {
                    throw zzbh.zza("Unsupported base duration index in DTS UHD header: " + iZzd3, null);
                }
                i = 384;
            }
            int iZzd4 = zzecVarZzg.zzd(3) + 1;
            int iZzd5 = zzecVarZzg.zzd(2);
            if (iZzd5 == 0) {
                i10 = 32000;
            } else if (iZzd5 == 1) {
                i10 = 44100;
            } else {
                if (iZzd5 != 2) {
                    throw zzbh.zza("Unsupported clock rate index in DTS UHD header: " + iZzd5, null);
                }
                i10 = 48000;
            }
            if (zzecVarZzg.zzp()) {
                zzecVarZzg.zzn(36);
            }
            iZzd = (1 << zzecVarZzg.zzd(2)) * i10;
            jZzu = zzen.zzu(i * iZzd4, 1000000L, i10, RoundingMode.FLOOR);
        }
        int i13 = iZzd;
        long j4 = jZzu;
        int iZzf2 = 0;
        for (char c11 = 0; c11 < c10; c11 = 1) {
            iZzf2 += zzf(zzecVarZzg, zzg, true);
        }
        for (int i14 = 0; i14 <= 0; i14++) {
            if (c10 != 0) {
                atomicInteger2 = atomicInteger;
                atomicInteger2.set(zzf(zzecVarZzg, zzh, true));
            } else {
                atomicInteger2 = atomicInteger;
            }
            iZzf2 += atomicInteger2.get() != 0 ? zzf(zzecVarZzg, zzi, true) : 0;
        }
        return new zzaco("audio/vnd.dts.uhd;profile=p2", 2, i13, i11 + iZzf2, j4, 0, null);
    }

    private static int zzf(zzec zzecVar, int[] iArr, boolean z4) {
        int i = 0;
        for (int i10 = 0; i10 < 3 && zzecVar.zzp(); i10++) {
            i++;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < i; i12++) {
            i11 += 1 << iArr[i12];
        }
        return zzecVar.zzd(iArr[i]) + i11;
    }

    private static zzec zzg(byte[] bArr) {
        byte b10 = bArr[0];
        if (b10 == 127 || b10 == 100 || b10 == 64 || b10 == 113) {
            return new zzec(bArr, bArr.length);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        byte b11 = bArrCopyOf[0];
        if (b11 == -2 || b11 == -1 || b11 == 37 || b11 == -14 || b11 == -24) {
            for (int i = 0; i < bArrCopyOf.length - 1; i += 2) {
                byte b12 = bArrCopyOf[i];
                int i10 = i + 1;
                bArrCopyOf[i] = bArrCopyOf[i10];
                bArrCopyOf[i10] = b12;
            }
        }
        int length = bArrCopyOf.length;
        zzec zzecVar = new zzec(bArrCopyOf, length);
        if (bArrCopyOf[0] == 31) {
            zzec zzecVar2 = new zzec(bArrCopyOf, length);
            while (zzecVar2.zza() >= 16) {
                zzecVar2.zzn(2);
                zzecVar.zzg(zzecVar2.zzd(14), 14);
            }
        }
        zzecVar.zzk(bArrCopyOf, bArrCopyOf.length);
        return zzecVar;
    }
}

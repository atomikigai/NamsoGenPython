package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgly {
    public static byte[] zza(byte[] bArr, byte[] bArr2) {
        long jZzb = zzb(bArr, 0, 0);
        long jZzb2 = zzb(bArr, 3, 2) & 67108611;
        long jZzb3 = zzb(bArr, 6, 4) & 67092735;
        long jZzb4 = zzb(bArr, 9, 6) & 66076671;
        long jZzb5 = zzb(bArr, 12, 8) & 1048575;
        int i = 17;
        byte[] bArr3 = new byte[17];
        long j4 = 0;
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            int length = bArr2.length;
            if (i10 >= length) {
                long j14 = j4 + (j10 >> 26);
                long j15 = j14 & 67108863;
                long j16 = j11 + (j14 >> 26);
                long j17 = j16 & 67108863;
                long j18 = j12 + (j16 >> 26);
                long j19 = j18 & 67108863;
                long j20 = ((j18 >> 26) * 5) + j13;
                long j21 = j20 >> 26;
                long j22 = j20 & 67108863;
                long j23 = j22 + 5;
                long j24 = (j10 & 67108863) + j21;
                long j25 = j24 + (j23 >> 26);
                long j26 = (j25 >> 26) + j15;
                long j27 = j17 + (j26 >> 26);
                long j28 = (j19 + (j27 >> 26)) - 67108864;
                long j29 = j28 >> 63;
                long j30 = ~j29;
                long j31 = (j24 & j29) | (j25 & 67108863 & j30);
                long j32 = (j15 & j29) | (j26 & 67108863 & j30);
                long j33 = (j17 & j29) | (j27 & 67108863 & j30);
                long j34 = (j19 & j29) | (j28 & j30);
                long jZzc = (((j22 & j29) | (j23 & 67108863 & j30) | (j31 << 26)) & 4294967295L) + zzc(bArr, 16);
                long jZzc2 = (((j31 >> 6) | (j32 << 20)) & 4294967295L) + zzc(bArr, 20);
                long jZzc3 = (((j33 << 14) | (j32 >> 12)) & 4294967295L) + zzc(bArr, 24);
                long jZzc4 = (((j33 >> 18) | (j34 << 8)) & 4294967295L) + zzc(bArr, 28);
                byte[] bArr4 = new byte[16];
                zzd(bArr4, jZzc & 4294967295L, 0);
                long j35 = jZzc2 + (jZzc >> 32);
                zzd(bArr4, j35 & 4294967295L, 4);
                long j36 = jZzc3 + (j35 >> 32);
                zzd(bArr4, j36 & 4294967295L, 8);
                zzd(bArr4, (jZzc4 + (j36 >> 32)) & 4294967295L, 12);
                return bArr4;
            }
            int iMin = Math.min(16, length - i10);
            System.arraycopy(bArr2, i10, bArr3, 0, iMin);
            bArr3[iMin] = 1;
            if (iMin != 16) {
                Arrays.fill(bArr3, iMin + 1, i, (byte) 0);
            }
            long j37 = jZzb5 * 5;
            long j38 = jZzb4 * 5;
            long j39 = jZzb3 * 5;
            long jZzb6 = j13 + zzb(bArr3, 0, 0);
            long jZzb7 = j10 + zzb(bArr3, 3, 2);
            long jZzb8 = j4 + zzb(bArr3, 6, 4);
            long jZzb9 = j11 + zzb(bArr3, 9, 6);
            long jZzb10 = j12 + (zzb(bArr3, 12, 8) | ((long) (bArr3[16] << 24)));
            long j40 = jZzb7 * jZzb;
            long j41 = jZzb7 * jZzb2;
            long j42 = jZzb8 * jZzb;
            long j43 = jZzb7 * jZzb3;
            long j44 = jZzb8 * jZzb2;
            long j45 = jZzb9 * jZzb;
            long j46 = jZzb7 * jZzb4;
            long j47 = jZzb8 * jZzb3;
            long j48 = jZzb9 * jZzb2;
            long j49 = jZzb10 * jZzb;
            long j50 = (jZzb2 * 5 * jZzb10) + (jZzb9 * j39) + (jZzb8 * j38) + (jZzb7 * j37) + (jZzb6 * jZzb);
            long j51 = j50 & 67108863;
            long j52 = jZzb9 * j38;
            long j53 = j39 * jZzb10;
            long j54 = j53 + j52 + (jZzb8 * j37) + (jZzb6 * jZzb2) + j40 + (j50 >> 26);
            long j55 = j38 * jZzb10;
            long j56 = j55 + (jZzb9 * j37) + (jZzb6 * jZzb3) + j41 + j42 + (j54 >> 26);
            long j57 = (jZzb10 * j37) + (jZzb6 * jZzb4) + j43 + j44 + j45 + (j56 >> 26);
            long j58 = (jZzb6 * jZzb5) + j46 + j47 + j48 + j49 + (j57 >> 26);
            long j59 = ((j58 >> 26) * 5) + j51;
            j10 = (j54 & 67108863) + (j59 >> 26);
            i10 += 16;
            j4 = j56 & 67108863;
            j11 = j57 & 67108863;
            j12 = j58 & 67108863;
            i = 17;
            j13 = j59 & 67108863;
        }
    }

    private static long zzb(byte[] bArr, int i, int i10) {
        return (zzc(bArr, i) >> i10) & 67108863;
    }

    private static long zzc(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((long) (((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16))) & 4294967295L;
    }

    private static void zzd(byte[] bArr, long j4, int i) {
        for (int i10 = 0; i10 < 4; i10++) {
            bArr[i + i10] = (byte) (255 & j4);
            j4 >>= 8;
        }
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmv {
    private static final int[] zza = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    private static final int[] zzb = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    private static final int[] zzc = {67108863, 33554431};
    private static final int[] zzd = {26, 25};

    public static void zza(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        zzb(jArr4, jArr2, jArr3);
        zzc(jArr4, jArr);
    }

    public static void zzb(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j4 = jArr2[0];
        long j10 = jArr3[1] * j4;
        long j11 = jArr2[1];
        long j12 = jArr3[0];
        jArr[1] = (j11 * j12) + j10;
        long j13 = jArr2[1];
        long j14 = jArr3[1];
        jArr[2] = ((j13 + j13) * j14) + (jArr3[2] * j4) + (jArr2[2] * j12);
        long j15 = jArr3[2];
        long j16 = jArr2[2];
        jArr[3] = (j13 * j15) + (j16 * j14) + (jArr3[3] * j4) + (jArr2[3] * j12);
        long j17 = jArr3[3];
        long j18 = jArr2[3];
        long j19 = (j13 * j17) + (j18 * j14);
        jArr[4] = j19 + j19 + (j16 * j15) + (jArr3[4] * j4) + (jArr2[4] * j12);
        long j20 = jArr3[4];
        long j21 = jArr2[4];
        jArr[5] = (j16 * j17) + (j18 * j15) + (j13 * j20) + (j21 * j14) + (jArr3[5] * j4) + (jArr2[5] * j12);
        long j22 = jArr3[5];
        long j23 = jArr2[5];
        long j24 = (j18 * j17) + (j13 * j22) + (j23 * j14);
        jArr[6] = j24 + j24 + (j16 * j20) + (j21 * j15) + (jArr3[6] * j4) + (jArr2[6] * j12);
        long j25 = jArr3[6];
        long j26 = jArr2[6];
        jArr[7] = (j18 * j20) + (j21 * j17) + (j16 * j22) + (j23 * j15) + (j13 * j25) + (j26 * j14) + (jArr3[7] * j4) + (jArr2[7] * j12);
        long j27 = jArr3[7];
        long j28 = jArr2[7];
        long j29 = (j18 * j22) + (j23 * j17) + (j13 * j27) + (j28 * j14);
        jArr[8] = j29 + j29 + (j21 * j20) + (j16 * j25) + (j26 * j15) + (jArr3[8] * j4) + (jArr2[8] * j12);
        long j30 = jArr3[8];
        long j31 = jArr2[8];
        jArr[9] = (j21 * j22) + (j23 * j20) + (j18 * j25) + (j26 * j17) + (j16 * j27) + (j28 * j15) + (j13 * j30) + (j31 * j14) + (j4 * jArr3[9]) + (jArr2[9] * j12);
        long j32 = jArr3[9];
        long j33 = jArr2[9];
        long j34 = (j23 * j22) + (j18 * j27) + (j28 * j17) + (j13 * j32) + (j14 * j33);
        jArr[10] = j34 + j34 + (j21 * j25) + (j26 * j20) + (j16 * j30) + (j31 * j15);
        jArr[11] = (j23 * j25) + (j26 * j22) + (j21 * j27) + (j28 * j20) + (j18 * j30) + (j31 * j17) + (j16 * j32) + (j15 * j33);
        long j35 = (j23 * j27) + (j28 * j22) + (j18 * j32) + (j17 * j33);
        jArr[12] = j35 + j35 + (j26 * j25) + (j21 * j30) + (j31 * j20);
        jArr[13] = (j26 * j27) + (j28 * j25) + (j23 * j30) + (j31 * j22) + (j21 * j32) + (j20 * j33);
        long j36 = (j28 * j27) + (j23 * j32) + (j22 * j33);
        jArr[14] = j36 + j36 + (j26 * j30) + (j31 * j25);
        jArr[15] = (j28 * j30) + (j31 * j27) + (j26 * j32) + (j25 * j33);
        long j37 = (j27 * j33) + (j28 * j32);
        jArr[16] = j37 + j37 + (j31 * j30);
        jArr[17] = (j30 * j33) + (j31 * j32);
        jArr[18] = (j33 + j33) * j32;
    }

    public static void zzc(long[] jArr, long[] jArr2) {
        zze(jArr);
        zzd(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void zzd(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j4 = jArr[i];
            long j10 = j4 / 67108864;
            jArr[i] = j4 - (j10 << 26);
            int i10 = i + 1;
            long j11 = jArr[i10] + j10;
            jArr[i10] = j11;
            long j12 = j11 / 33554432;
            jArr[i10] = j11 - (j12 << 25);
            i += 2;
            jArr[i] = jArr[i] + j12;
        }
        long j13 = jArr[0];
        long j14 = jArr[10];
        long j15 = j13 + (j14 << 4);
        jArr[0] = j15;
        long j16 = j14 + j14 + j15;
        jArr[0] = j16;
        long j17 = j16 + j14;
        jArr[0] = j17;
        jArr[10] = 0;
        long j18 = j17 / 67108864;
        jArr[0] = j17 - (j18 << 26);
        jArr[1] = jArr[1] + j18;
    }

    public static void zze(long[] jArr) {
        long j4 = jArr[8];
        long j10 = jArr[18];
        long j11 = j4 + (j10 << 4);
        jArr[8] = j11;
        long j12 = j10 + j10 + j11;
        jArr[8] = j12;
        jArr[8] = j12 + j10;
        long j13 = jArr[7];
        long j14 = jArr[17];
        long j15 = j13 + (j14 << 4);
        jArr[7] = j15;
        long j16 = j14 + j14 + j15;
        jArr[7] = j16;
        jArr[7] = j16 + j14;
        long j17 = jArr[6];
        long j18 = jArr[16];
        long j19 = j17 + (j18 << 4);
        jArr[6] = j19;
        long j20 = j18 + j18 + j19;
        jArr[6] = j20;
        jArr[6] = j20 + j18;
        long j21 = jArr[5];
        long j22 = jArr[15];
        long j23 = j21 + (j22 << 4);
        jArr[5] = j23;
        long j24 = j22 + j22 + j23;
        jArr[5] = j24;
        jArr[5] = j24 + j22;
        long j25 = jArr[4];
        long j26 = jArr[14];
        long j27 = j25 + (j26 << 4);
        jArr[4] = j27;
        long j28 = j26 + j26 + j27;
        jArr[4] = j28;
        jArr[4] = j28 + j26;
        long j29 = jArr[3];
        long j30 = jArr[13];
        long j31 = j29 + (j30 << 4);
        jArr[3] = j31;
        long j32 = j30 + j30 + j31;
        jArr[3] = j32;
        jArr[3] = j32 + j30;
        long j33 = jArr[2];
        long j34 = jArr[12];
        long j35 = j33 + (j34 << 4);
        jArr[2] = j35;
        long j36 = j34 + j34 + j35;
        jArr[2] = j36;
        jArr[2] = j36 + j34;
        long j37 = jArr[1];
        long j38 = jArr[11];
        long j39 = j37 + (j38 << 4);
        jArr[1] = j39;
        long j40 = j38 + j38 + j39;
        jArr[1] = j40;
        jArr[1] = j40 + j38;
        long j41 = jArr[0];
        long j42 = jArr[10];
        long j43 = j41 + (j42 << 4);
        jArr[0] = j43;
        long j44 = j42 + j42 + j43;
        jArr[0] = j44;
        jArr[0] = j44 + j42;
    }

    public static void zzf(long[] jArr, long[] jArr2, long j4) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] * j4;
        }
    }

    public static void zzg(long[] jArr, long[] jArr2) {
        long j4 = jArr2[0];
        long j10 = j4 * j4;
        long j11 = jArr2[1];
        long j12 = (j4 + j4) * j11;
        long j13 = jArr2[2];
        long j14 = (j4 * j13) + (j11 * j11);
        long j15 = jArr2[3];
        long j16 = (j4 * j15) + (j11 * j13);
        long j17 = jArr2[4];
        long j18 = (j13 * j13) + (j11 * 4 * j15) + ((j4 + j4) * j17);
        long j19 = jArr2[5];
        long j20 = (j13 * j15) + (j11 * j17) + (j4 * j19);
        long j21 = jArr2[6];
        long j22 = (j15 * j15) + (j13 * j17) + (j4 * j21) + ((j11 + j11) * j19);
        long j23 = jArr2[7];
        long j24 = (j15 * j17) + (j13 * j19) + (j11 * j21) + (j4 * j23);
        long j25 = jArr2[8];
        long j26 = (j15 * j19) + (j11 * j23);
        long j27 = j26 + j26 + (j13 * j21) + (j4 * j25);
        long j28 = j27 + j27 + (j17 * j17);
        long j29 = jArr2[9];
        long j30 = (j17 * j19) + (j15 * j21) + (j13 * j23) + (j11 * j25) + (j4 * j29);
        long j31 = (j11 * j29) + (j15 * j23);
        long j32 = j31 + j31 + (j19 * j19) + (j17 * j21) + (j13 * j25);
        long j33 = (j19 * j21) + (j17 * j23) + (j15 * j25) + (j13 * j29);
        long j34 = (j15 * j29) + (j19 * j23);
        long j35 = j34 + j34 + (j17 * j25);
        long j36 = j35 + j35 + (j21 * j21);
        long j37 = (j21 * j23) + (j19 * j25) + (j17 * j29);
        long j38 = (j23 * j23) + (j21 * j25) + ((j19 + j19) * j29);
        long j39 = (j21 * j29) + (j23 * j25);
        zzc(new long[]{j10, j12, j14 + j14, j16 + j16, j18, j20 + j20, j22 + j22, j24 + j24, j28, j30 + j30, j32 + j32, j33 + j33, j36, j37 + j37, j38 + j38, j39 + j39, (j23 * 4 * j29) + (j25 * j25), (j25 + j25) * j29, (j29 + j29) * j29}, jArr);
    }

    public static void zzh(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void zzi(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static byte[] zzj(long[] jArr) {
        int i;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= 2) {
                break;
            }
            int i12 = 0;
            while (i12 < 9) {
                long j4 = jArrCopyOf[i12];
                int i13 = zzd[i12 & 1];
                int i14 = -((int) (((j4 >> 31) & j4) >> i13));
                jArrCopyOf[i12] = j4 + ((long) (i14 << i13));
                i12++;
                jArrCopyOf[i12] = jArrCopyOf[i12] - ((long) i14);
            }
            long j10 = jArrCopyOf[9];
            int i15 = -((int) (((j10 >> 31) & j10) >> 25));
            jArrCopyOf[9] = j10 + ((long) (i15 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i15) * 19);
            i11++;
        }
        long j11 = jArrCopyOf[0];
        int i16 = -((int) (((j11 >> 31) & j11) >> 26));
        jArrCopyOf[0] = j11 + ((long) (i16 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i16);
        int i17 = 0;
        while (i17 < 2) {
            int i18 = i10;
            while (i18 < 9) {
                long j12 = jArrCopyOf[i18];
                int i19 = i18 & 1;
                int i20 = i10;
                long j13 = j12 >> zzd[i19];
                jArrCopyOf[i18] = j12 & ((long) zzc[i19]);
                i18++;
                jArrCopyOf[i18] = jArrCopyOf[i18] + ((long) ((int) j13));
                i10 = i20;
                i17 = i17;
            }
            i17++;
        }
        int i21 = i10;
        long j14 = jArrCopyOf[9];
        jArrCopyOf[9] = j14 & 33554431;
        long j15 = (((long) ((int) (j14 >> 25))) * 19) + jArrCopyOf[i21];
        jArrCopyOf[i21] = j15;
        int i22 = ~((((int) j15) - 67108845) >> 31);
        for (int i23 = 1; i23 < 10; i23++) {
            int i24 = ~(((int) jArrCopyOf[i23]) ^ zzc[i23 & 1]);
            int i25 = i24 & (i24 << 16);
            int i26 = i25 & (i25 << 8);
            int i27 = i26 & (i26 << 4);
            int i28 = i27 & (i27 << 2);
            i22 &= (i28 & (i28 + i28)) >> 31;
        }
        jArrCopyOf[i21] = jArrCopyOf[i21] - ((long) (67108845 & i22));
        long j16 = 33554431 & i22;
        jArrCopyOf[1] = jArrCopyOf[1] - j16;
        for (i = 2; i < 10; i += 2) {
            jArrCopyOf[i] = jArrCopyOf[i] - ((long) (67108863 & i22));
            int i29 = i + 1;
            jArrCopyOf[i29] = jArrCopyOf[i29] - j16;
        }
        for (int i30 = i21; i30 < 10; i30++) {
            jArrCopyOf[i30] = jArrCopyOf[i30] << zzb[i30];
        }
        byte[] bArr = new byte[32];
        for (int i31 = i21; i31 < 10; i31++) {
            int i32 = zza[i31];
            long j17 = bArr[i32];
            long j18 = jArrCopyOf[i31];
            bArr[i32] = (byte) (j17 | (j18 & 255));
            int i33 = i32 + 1;
            bArr[i33] = (byte) (((long) bArr[i33]) | ((j18 >> 8) & 255));
            int i34 = i32 + 2;
            bArr[i34] = (byte) (((long) bArr[i34]) | ((j18 >> 16) & 255));
            int i35 = i32 + 3;
            bArr[i35] = (byte) (((long) bArr[i35]) | ((j18 >> 24) & 255));
        }
        return bArr;
    }

    public static long[] zzk(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i10 = zza[i];
            int i11 = bArr[i10] & 255;
            int i12 = bArr[i10 + 1] & 255;
            long j4 = ((long) i11) | (((long) i12) << 8);
            jArr[i] = (((j4 | (((long) (bArr[i10 + 2] & 255)) << 16)) | (((long) (bArr[i10 + 3] & 255)) << 24)) >> zzb[i]) & ((long) zzc[i & 1]);
        }
        return jArr;
    }
}

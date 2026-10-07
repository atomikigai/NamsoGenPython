package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmo {
    static final byte[][] zza = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}};

    public static void zza(long[] jArr, byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        int i = 32;
        if (bArr2.length != 32) {
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr2, 32);
        bArrCopyOf[31] = (byte) (bArrCopyOf[31] & 127);
        int i10 = 0;
        for (int i11 = 0; i11 < 7; i11++) {
            byte[][] bArr3 = zza;
            if (MessageDigest.isEqual(bArr3[i11], bArrCopyOf)) {
                throw new InvalidKeyException("Banned public key: ".concat(zzze.zza(bArr3[i11])));
            }
        }
        long[] jArrZzk = zzmv.zzk(bArrCopyOf);
        long[] jArr2 = new long[19];
        long[] jArr3 = new long[19];
        jArr3[0] = 1;
        long[] jArr4 = new long[19];
        jArr4[0] = 1;
        long[] jArr5 = new long[19];
        long[] jArr6 = new long[19];
        long[] jArr7 = new long[19];
        jArr7[0] = 1;
        long[] jArr8 = new long[19];
        long[] jArr9 = new long[19];
        jArr9[0] = 1;
        int i12 = 10;
        System.arraycopy(jArrZzk, 0, jArr2, 0, 10);
        int i13 = 0;
        while (i13 < i) {
            int i14 = bArr[31 - i13] & 255;
            while (i10 < 8) {
                int i15 = (i14 >> (7 - i10)) & 1;
                zzb(jArr4, jArr2, i15);
                zzb(jArr5, jArr3, i15);
                long[] jArrCopyOf = Arrays.copyOf(jArr4, i12);
                int i16 = i14;
                long[] jArr10 = new long[19];
                int i17 = i10;
                long[] jArr11 = new long[19];
                int i18 = i13;
                long[] jArr12 = new long[19];
                long[] jArr13 = new long[19];
                long[] jArr14 = new long[19];
                long[] jArr15 = jArr9;
                long[] jArr16 = new long[19];
                long[] jArr17 = new long[19];
                zzmv.zzi(jArr4, jArr4, jArr5);
                zzmv.zzh(jArr5, jArrCopyOf, jArr5);
                long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
                zzmv.zzi(jArr2, jArr2, jArr3);
                zzmv.zzh(jArr3, jArrCopyOf2, jArr3);
                zzmv.zzb(jArr13, jArr2, jArr5);
                zzmv.zzb(jArr14, jArr4, jArr3);
                zzmv.zze(jArr13);
                zzmv.zzd(jArr13);
                zzmv.zze(jArr14);
                zzmv.zzd(jArr14);
                long[] jArr18 = jArr2;
                System.arraycopy(jArr13, 0, jArrCopyOf2, 0, 10);
                zzmv.zzi(jArr13, jArr13, jArr14);
                zzmv.zzh(jArr14, jArrCopyOf2, jArr14);
                zzmv.zzg(jArr17, jArr13);
                zzmv.zzg(jArr16, jArr14);
                zzmv.zzb(jArr14, jArr16, jArrZzk);
                zzmv.zze(jArr14);
                zzmv.zzd(jArr14);
                System.arraycopy(jArr17, 0, jArr6, 0, 10);
                System.arraycopy(jArr14, 0, jArr7, 0, 10);
                zzmv.zzg(jArr11, jArr4);
                zzmv.zzg(jArr12, jArr5);
                zzmv.zzb(jArr8, jArr11, jArr12);
                zzmv.zze(jArr8);
                zzmv.zzd(jArr8);
                zzmv.zzh(jArr12, jArr11, jArr12);
                Arrays.fill(jArr10, 10, 18, 0L);
                zzmv.zzf(jArr10, jArr12, 121665L);
                zzmv.zzd(jArr10);
                zzmv.zzi(jArr10, jArr10, jArr11);
                zzmv.zzb(jArr15, jArr12, jArr10);
                zzmv.zze(jArr15);
                zzmv.zzd(jArr15);
                zzb(jArr8, jArr6, i15);
                zzb(jArr15, jArr7, i15);
                i10 = i17 + 1;
                long[] jArr19 = jArr7;
                jArr7 = jArr3;
                jArr3 = jArr19;
                long[] jArr20 = jArr8;
                jArr8 = jArr4;
                jArr4 = jArr20;
                jArr9 = jArr5;
                jArr5 = jArr15;
                jArr2 = jArr6;
                i14 = i16;
                i13 = i18;
                jArr6 = jArr18;
                i12 = 10;
            }
            i13++;
            i = 32;
            i10 = 0;
            i12 = 10;
        }
        int i19 = i12;
        long[] jArr21 = new long[i19];
        long[] jArr22 = new long[i19];
        long[] jArr23 = new long[i19];
        long[] jArr24 = new long[i19];
        long[] jArr25 = new long[i19];
        long[] jArr26 = new long[i19];
        long[] jArr27 = new long[i19];
        long[] jArr28 = new long[i19];
        long[] jArr29 = new long[i19];
        long[] jArr30 = new long[i19];
        long[] jArr31 = jArr2;
        long[] jArr32 = new long[i19];
        zzmv.zzg(jArr22, jArr5);
        zzmv.zzg(jArr32, jArr22);
        zzmv.zzg(jArr30, jArr32);
        zzmv.zza(jArr23, jArr30, jArr5);
        zzmv.zza(jArr24, jArr23, jArr22);
        zzmv.zzg(jArr30, jArr24);
        zzmv.zza(jArr25, jArr30, jArr23);
        zzmv.zzg(jArr30, jArr25);
        zzmv.zzg(jArr32, jArr30);
        zzmv.zzg(jArr30, jArr32);
        zzmv.zzg(jArr32, jArr30);
        zzmv.zzg(jArr30, jArr32);
        zzmv.zza(jArr26, jArr30, jArr25);
        zzmv.zzg(jArr30, jArr26);
        zzmv.zzg(jArr32, jArr30);
        for (int i20 = 2; i20 < 10; i20 += 2) {
            zzmv.zzg(jArr30, jArr32);
            zzmv.zzg(jArr32, jArr30);
        }
        zzmv.zza(jArr27, jArr32, jArr26);
        zzmv.zzg(jArr30, jArr27);
        zzmv.zzg(jArr32, jArr30);
        for (int i21 = 2; i21 < 20; i21 += 2) {
            zzmv.zzg(jArr30, jArr32);
            zzmv.zzg(jArr32, jArr30);
        }
        zzmv.zza(jArr30, jArr32, jArr27);
        zzmv.zzg(jArr32, jArr30);
        zzmv.zzg(jArr30, jArr32);
        for (int i22 = 2; i22 < 10; i22 += 2) {
            zzmv.zzg(jArr32, jArr30);
            zzmv.zzg(jArr30, jArr32);
        }
        zzmv.zza(jArr28, jArr30, jArr26);
        zzmv.zzg(jArr30, jArr28);
        zzmv.zzg(jArr32, jArr30);
        for (int i23 = 2; i23 < 50; i23 += 2) {
            zzmv.zzg(jArr30, jArr32);
            zzmv.zzg(jArr32, jArr30);
        }
        zzmv.zza(jArr29, jArr32, jArr28);
        zzmv.zzg(jArr32, jArr29);
        zzmv.zzg(jArr30, jArr32);
        for (int i24 = 2; i24 < 100; i24 += 2) {
            zzmv.zzg(jArr32, jArr30);
            zzmv.zzg(jArr30, jArr32);
        }
        zzmv.zza(jArr32, jArr30, jArr29);
        zzmv.zzg(jArr30, jArr32);
        zzmv.zzg(jArr32, jArr30);
        for (int i25 = 2; i25 < 50; i25 += 2) {
            zzmv.zzg(jArr30, jArr32);
            zzmv.zzg(jArr32, jArr30);
        }
        zzmv.zza(jArr30, jArr32, jArr28);
        zzmv.zzg(jArr32, jArr30);
        zzmv.zzg(jArr30, jArr32);
        zzmv.zzg(jArr32, jArr30);
        zzmv.zzg(jArr30, jArr32);
        zzmv.zzg(jArr32, jArr30);
        zzmv.zza(jArr21, jArr32, jArr24);
        zzmv.zza(jArr, jArr4, jArr21);
        long[] jArr33 = new long[10];
        long[] jArr34 = new long[10];
        long[] jArr35 = new long[11];
        long[] jArr36 = new long[11];
        long[] jArr37 = new long[11];
        zzmv.zza(jArr33, jArrZzk, jArr);
        zzmv.zzi(jArr34, jArrZzk, jArr);
        long[] jArr38 = new long[10];
        jArr38[0] = 486662;
        zzmv.zzi(jArr36, jArr34, jArr38);
        zzmv.zza(jArr36, jArr36, jArr3);
        zzmv.zzi(jArr36, jArr36, jArr31);
        zzmv.zza(jArr36, jArr36, jArr33);
        zzmv.zza(jArr36, jArr36, jArr31);
        zzmv.zzf(jArr35, jArr36, 4L);
        zzmv.zzd(jArr35);
        zzmv.zza(jArr36, jArr33, jArr3);
        zzmv.zzh(jArr36, jArr36, jArr3);
        zzmv.zza(jArr37, jArr34, jArr31);
        zzmv.zzi(jArr36, jArr36, jArr37);
        zzmv.zzg(jArr36, jArr36);
        if (!MessageDigest.isEqual(zzmv.zzj(jArr35), zzmv.zzj(jArr36))) {
            throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzze.zza(bArr2)));
        }
    }

    public static void zzb(long[] jArr, long[] jArr2, int i) {
        for (int i10 = 0; i10 < 10; i10++) {
            int i11 = (int) jArr[i10];
            int i12 = (-i) & (((int) jArr2[i10]) ^ i11);
            jArr[i10] = i11 ^ i12;
            jArr2[i10] = i12 ^ ((int) jArr2[i10]);
        }
    }
}

package com.google.android.recaptcha.internal;

import android.util.Base64;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmh {
    protected static final Charset zza = StandardCharsets.UTF_16;

    public static int zza(int i, int i10) {
        if (i % 2 != 0) {
            return (i | i10) - (i & i10);
        }
        return ((~i) & i10) | ((~i10) & i);
    }

    public static String zzb(String str, byte[] bArr, zzmi zzmiVar) {
        byte[] bArr2 = bArr;
        int i = 0;
        byte[] bArrDecode = Base64.decode(str, 0);
        byte[] bArr3 = new byte[12];
        int length = bArrDecode.length - 12;
        byte[] bArr4 = new byte[length];
        System.arraycopy(bArrDecode, 0, bArr3, 0, 12);
        System.arraycopy(bArrDecode, 12, bArr4, 0, length);
        int[] iArr = {511133343, 1277647508, 107287496, 338123662};
        if (bArr2.length != 32) {
            throw new IllegalArgumentException();
        }
        int[] iArr2 = new int[16];
        for (int i10 = 0; i10 < 4; i10++) {
            iArr2[i10] = zza(iArr[i10], 2131181306);
        }
        for (int i11 = 4; i11 < 12; i11++) {
            iArr2[i11] = zze(bArr2, (i11 - 4) * 4);
        }
        iArr2[12] = 1;
        for (int i12 = 13; i12 < 16; i12++) {
            iArr2[i12] = zze(bArr3, (i12 - 13) * 4);
        }
        int[] iArr3 = new int[16];
        System.arraycopy(iArr2, 0, iArr3, 0, 16);
        byte[] bArr5 = new byte[length];
        int i13 = 1;
        int i14 = length;
        int i15 = 0;
        while (i14 > 0) {
            System.arraycopy(iArr3, i, iArr2, i, 16);
            iArr2[12] = i13;
            for (int i16 = i; i16 < 10; i16++) {
                zzc(0, 4, 8, 12, iArr, bArr2, bArr3, i13, iArr2, iArr3);
                bArr2 = bArr;
                zzc(1, 5, 9, 13, iArr, bArr2, bArr3, i13, iArr2, iArr3);
                zzc(2, 6, 10, 14, iArr, bArr2, bArr3, i13, iArr2, iArr3);
                zzc(3, 7, 11, 15, iArr, bArr2, bArr3, i13, iArr2, iArr3);
                zzc(0, 5, 10, 15, iArr, bArr2, bArr3, i13, iArr2, iArr3);
                zzc(1, 6, 11, 12, iArr, bArr2, bArr3, i13, iArr2, iArr3);
                zzc(2, 7, 8, 13, iArr, bArr2, bArr3, i13, iArr2, iArr3);
                zzc(3, 4, 9, 14, iArr, bArr2, bArr3, i13, iArr2, iArr3);
            }
            byte[] bArr6 = new byte[64];
            for (int i17 = i; i17 < 16; i17++) {
                int i18 = iArr2[i17];
                int i19 = i17 * 4;
                bArr6[i19] = (byte) (i18 & 255);
                bArr6[i19 + 1] = (byte) ((i18 >> 8) & 255);
                bArr6[i19 + 2] = (byte) ((i18 >> 16) & 255);
                bArr6[i19 + 3] = (byte) ((i18 >> 24) & 255);
            }
            for (int i20 = 0; i20 < Math.min(64, i14); i20++) {
                int i21 = i15 + i20;
                bArr5[i21] = (byte) zza(bArr6[i20], bArr4[i21]);
            }
            i13++;
            i14 -= 64;
            i15 += 64;
            bArr2 = bArr;
            i = 0;
        }
        return new String(bArr5, zza);
    }

    public static final void zzc(int i, int i10, int i11, int i12, int[] iArr, byte[] bArr, byte[] bArr2, int i13, int[] iArr2, int[] iArr3) {
        zzd(i, i10, i12, 16, iArr, bArr, bArr2, i13, iArr2, iArr3);
        zzd(i11, i12, i10, 12, iArr, bArr, bArr2, i13, iArr2, iArr3);
        zzd(i, i10, i12, 8, iArr, bArr, bArr2, i13, iArr2, iArr3);
        zzd(i11, i12, i10, 7, iArr, bArr, bArr2, i13, iArr2, iArr3);
    }

    public static final void zzd(int i, int i10, int i11, int i12, int[] iArr, byte[] bArr, byte[] bArr2, int i13, int[] iArr2, int[] iArr3) {
        int i14 = iArr2[i] + iArr2[i10];
        iArr2[i] = i14;
        int iZza = zza(iArr2[i11], i14);
        iArr2[i11] = (iZza << i12) | (iZza >>> (32 - i12));
    }

    private static final int zze(byte[] bArr, int i) {
        int i10 = bArr[i] & 255;
        int i11 = bArr[i + 1] & 255;
        int i12 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i11 << 8) | i10 | (i12 << 16);
    }
}

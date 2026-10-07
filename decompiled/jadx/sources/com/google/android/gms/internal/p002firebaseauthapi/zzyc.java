package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.AEADBadTagException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyc implements zzbd {
    private static final ThreadLocal zza = new zzya();
    private static final ThreadLocal zzb = new zzyb();
    private final byte[] zzc;
    private final byte[] zzd;
    private final SecretKeySpec zze;
    private final int zzf;

    public zzyc(byte[] bArr, int i) throws GeneralSecurityException {
        if (!zzij.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-EAX in FIPS-mode.");
        }
        if (i != 12 && i != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.zzf = i;
        zzzl.zzb(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zze = secretKeySpec;
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrZzc = zzc(cipher.doFinal(new byte[16]));
        this.zzc = bArrZzc;
        this.zzd = zzc(bArrZzc);
    }

    private static byte[] zzc(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i = 0;
        while (i < 15) {
            byte b10 = bArr[i];
            int i10 = i + 1;
            bArr2[i] = (byte) (((b10 + b10) ^ ((bArr[i10] & 255) >>> 7)) & 255);
            i = i10;
        }
        byte b11 = bArr[15];
        bArr2[15] = (byte) (((bArr[0] >> 7) & 135) ^ (b11 + b11));
        return bArr2;
    }

    private final byte[] zzd(Cipher cipher, int i, byte[] bArr, int i10, int i11) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        byte[] bArrZze;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i;
        if (i11 == 0) {
            return cipher.doFinal(zze(bArr2, this.zzc));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i12 = 0;
        int i13 = 0;
        while (i11 - i13 > 16) {
            for (int i14 = 0; i14 < 16; i14++) {
                bArrDoFinal[i14] = (byte) (bArr[(i10 + i13) + i14] ^ bArrDoFinal[i14]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i13 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i13 + i10, i10 + i11);
        if (bArrCopyOfRange.length == 16) {
            bArrZze = zze(bArrCopyOfRange, this.zzc);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.zzd, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i12 >= length) {
                    break;
                }
                bArrCopyOf[i12] = (byte) (bArrCopyOf[i12] ^ bArrCopyOfRange[i12]);
                i12++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrZze = bArrCopyOf;
        }
        return cipher.doFinal(zze(bArrDoFinal, bArrZze));
    }

    private static byte[] zze(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr3[i] = (byte) (bArr[i] ^ bArr2[i]);
        }
        return bArr3;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = (length - this.zzf) - 16;
        if (i < 0) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        Cipher cipher = (Cipher) zza.get();
        cipher.init(1, this.zze);
        byte[] bArrZzd = zzd(cipher, 0, bArr, 0, this.zzf);
        byte[] bArrZzd2 = zzd(cipher, 1, bArr2, 0, 0);
        byte[] bArrZzd3 = zzd(cipher, 2, bArr, this.zzf, i);
        int i10 = length - 16;
        byte b10 = 0;
        for (int i11 = 0; i11 < 16; i11++) {
            b10 = (byte) (b10 | (((bArr[i10 + i11] ^ bArrZzd2[i11]) ^ bArrZzd[i11]) ^ bArrZzd3[i11]));
        }
        if (b10 != 0) {
            throw new AEADBadTagException("tag mismatch");
        }
        Cipher cipher2 = (Cipher) zzb.get();
        cipher2.init(1, this.zze, new IvParameterSpec(bArrZzd));
        return cipher2.doFinal(bArr, this.zzf, i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}

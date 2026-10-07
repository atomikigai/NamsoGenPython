package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzzg implements zzrw {
    private final SecretKey zza;
    private final byte[] zzb;
    private final byte[] zzc;

    public zzzg(byte[] bArr) throws GeneralSecurityException {
        zzzl.zzb(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.zza = secretKeySpec;
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKeySpec);
        byte[] bArrZzb = zzrd.zzb(cipherZzb.doFinal(new byte[16]));
        this.zzb = bArrZzb;
        this.zzc = zzrd.zzb(bArrZzb);
    }

    private static Cipher zzb() throws GeneralSecurityException {
        if (zzij.zza(1)) {
            return (Cipher) zzyv.zza.zza("AES/ECB/NoPadding");
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzrw
    public final byte[] zza(byte[] bArr, int i) throws GeneralSecurityException {
        if (i > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        SecretKey secretKey = this.zza;
        Cipher cipherZzb = zzb();
        cipherZzb.init(1, secretKey);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(((double) length) / 16.0d));
        int i10 = iMax - 1;
        int i11 = i10 * 16;
        byte[] bArrZzd = iMax * 16 == length ? zzyf.zzd(bArr, i11, this.zzb, 0, 16) : zzyf.zzc(zzrd.zza(Arrays.copyOfRange(bArr, i11, length)), this.zzc);
        byte[] bArrDoFinal = new byte[16];
        for (int i12 = 0; i12 < i10; i12++) {
            bArrDoFinal = cipherZzb.doFinal(zzyf.zzd(bArrDoFinal, 0, bArr, i12 * 16, 16));
        }
        return Arrays.copyOf(cipherZzb.doFinal(zzyf.zzc(bArrZzd, bArrDoFinal)), i);
    }
}

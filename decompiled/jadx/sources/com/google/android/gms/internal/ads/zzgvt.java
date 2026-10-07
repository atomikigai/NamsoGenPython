package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgvt implements zzgfm {
    private final SecretKey zza;
    private final byte[] zzb;

    private zzgvt(byte[] bArr, zzgwu zzgwuVar) throws GeneralSecurityException {
        if (!zzgmh.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        int i = zzgky.zza;
        zzgws.zza(bArr.length);
        this.zza = new SecretKeySpec(bArr, "AES");
        this.zzb = zzgwuVar.zzc();
    }

    public static zzgfm zzb(zzghw zzghwVar) throws GeneralSecurityException {
        return new zzgvt(zzghwVar.zzd().zzd(zzgfv.zza()), zzghwVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        byte[] bArr3 = this.zzb;
        int length = bArr.length;
        if (length < bArr3.length + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzgpj.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zzb;
        int i = zzgky.zza;
        Objects.equals(System.getProperty("java.vendor"), "The Android Project");
        GCMParameterSpec gCMParameterSpec = new GCMParameterSpec(128, bArr, bArr4.length, 12);
        SecretKey secretKey = this.zza;
        Cipher cipherZza = zzgky.zza();
        cipherZza.init(2, secretKey, gCMParameterSpec);
        if (bArr2 != null && bArr2.length != 0) {
            cipherZza.updateAAD(bArr2);
        }
        int length2 = this.zzb.length;
        return cipherZza.doFinal(bArr, length2 + 12, (length - length2) - 12);
    }
}

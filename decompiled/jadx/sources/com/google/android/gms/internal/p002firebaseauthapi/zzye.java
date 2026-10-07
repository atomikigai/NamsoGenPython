package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import q1.a;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzye implements zzbj {
    private static final Collection zza = Arrays.asList(64);
    private static final byte[] zzb = new byte[16];
    private final zzzg zzc;
    private final byte[] zzd;

    public zzye(byte[] bArr) throws GeneralSecurityException {
        if (!zzij.zza(1)) {
            throw new GeneralSecurityException("Can not use AES-SIV in FIPS-mode.");
        }
        Collection collection = zza;
        int length = bArr.length;
        if (!collection.contains(Integer.valueOf(length))) {
            throw new InvalidKeyException(a.j(length, "invalid key size: ", " bytes; key must have 64 bytes"));
        }
        int i = length >> 1;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
        this.zzd = Arrays.copyOfRange(bArr, i, length);
        this.zzc = new zzzg(bArrCopyOfRange);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbj
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrZzc;
        int length = bArr.length;
        if (length < 16) {
            throw new GeneralSecurityException("Ciphertext too short.");
        }
        Cipher cipher = (Cipher) zzyv.zza.zza("AES/CTR/NoPadding");
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
        byte[] bArr3 = (byte[]) bArrCopyOfRange.clone();
        bArr3[8] = (byte) (bArr3[8] & 127);
        bArr3[12] = (byte) (bArr3[12] & 127);
        cipher.init(2, new SecretKeySpec(this.zzd, "AES"), new IvParameterSpec(bArr3));
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 16, length);
        byte[] bArrDoFinal = cipher.doFinal(bArrCopyOfRange2);
        if (bArrCopyOfRange2.length == 0 && bArrDoFinal == null && zzzk.zza()) {
            bArrDoFinal = new byte[0];
        }
        byte[][] bArr4 = {bArr2, bArrDoFinal};
        byte[] bArrZza = this.zzc.zza(zzb, 16);
        for (char c10 = 0; c10 <= 0; c10 = 1) {
            byte[] bArr5 = bArr4[0];
            if (bArr5 == null) {
                bArr5 = new byte[0];
            }
            bArrZza = zzyf.zzc(zzrd.zzb(bArrZza), this.zzc.zza(bArr5, 16));
        }
        byte[] bArr6 = bArr4[1];
        int length2 = bArr6.length;
        if (length2 >= 16) {
            int length3 = bArrZza.length;
            if (length2 < length3) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            bArrZzc = Arrays.copyOf(bArr6, length2);
            for (int i = 0; i < bArrZza.length; i++) {
                int i10 = (length2 - length3) + i;
                bArrZzc[i10] = (byte) (bArrZzc[i10] ^ bArrZza[i]);
            }
        } else {
            bArrZzc = zzyf.zzc(zzrd.zza(bArr6), zzrd.zzb(bArrZza));
        }
        if (MessageDigest.isEqual(bArrCopyOfRange, this.zzc.zza(bArrZzc, 16))) {
            return bArrDoFinal;
        }
        throw new AEADBadTagException("Integrity check failed.");
    }
}

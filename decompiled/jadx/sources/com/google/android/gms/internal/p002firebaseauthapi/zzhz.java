package com.google.android.gms.internal.p002firebaseauthapi;

import android.os.Build;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzhz {
    private static final ThreadLocal zza = new zzhy();
    private final SecretKey zzb;
    private final boolean zzc;

    public zzhz(byte[] bArr, boolean z4) throws GeneralSecurityException {
        if (!zzij.zza(2)) {
            throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzzl.zzb(bArr.length);
        this.zzb = new SecretKeySpec(bArr, "AES");
        this.zzc = z4;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    public final byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        Integer numValueOf;
        if (bArr.length != 12) {
            throw new GeneralSecurityException("iv is wrong size");
        }
        boolean z4 = this.zzc;
        int i = true != z4 ? 16 : 28;
        int length = bArr2.length;
        if (length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (z4 && !ByteBuffer.wrap(bArr).equals(ByteBuffer.wrap(bArr2, 0, 12))) {
            throw new GeneralSecurityException("iv does not match prepended iv");
        }
        String property = System.getProperty("java.vendor");
        if (property != "The Android Project") {
            numValueOf = null;
            if (property != null && property.equals("The Android Project")) {
                numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
            }
        } else {
            numValueOf = Integer.valueOf(Build.VERSION.SDK_INT);
        }
        AlgorithmParameterSpec gCMParameterSpec = (numValueOf == null || numValueOf.intValue() > 19) ? new GCMParameterSpec(128, bArr, 0, 12) : new IvParameterSpec(bArr, 0, 12);
        ThreadLocal threadLocal = zza;
        ((Cipher) threadLocal.get()).init(2, this.zzb, gCMParameterSpec);
        boolean z10 = this.zzc;
        int i10 = true != z10 ? 0 : 12;
        if (z10) {
            length -= 12;
        }
        return ((Cipher) threadLocal.get()).doFinal(bArr2, i10, length);
    }
}

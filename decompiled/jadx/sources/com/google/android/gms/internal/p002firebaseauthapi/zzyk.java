package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyk {
    private final ECPrivateKey zza;

    public zzyk(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i, int i10) throws GeneralSecurityException {
        byte[] bArrZzb = zzyf.zzb(bArr, zzym.zzf(this.zza, zzym.zzh(this.zza.getParams(), i10, bArr)));
        Mac mac = (Mac) zzyv.zzb.zza(str);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
        } else {
            mac.init(new SecretKeySpec(bArr2, str));
        }
        byte[] bArr4 = new byte[i];
        mac.init(new SecretKeySpec(mac.doFinal(bArrZzb), str));
        byte[] bArrDoFinal = new byte[0];
        int i11 = 1;
        int i12 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update((byte[]) null);
            mac.update((byte) i11);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i13 = i12 + length;
            if (i13 >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr4, i12, i - i12);
                return bArr4;
            }
            System.arraycopy(bArrDoFinal, 0, bArr4, i12, length);
            i11++;
            i12 = i13;
        }
    }
}

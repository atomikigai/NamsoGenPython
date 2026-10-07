package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzln implements zzls {
    private final String zza;

    public zzln(String str) {
        this.zza = str;
    }

    private final byte[] zzf(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        Mac mac = (Mac) zzyv.zzb.zza(this.zza);
        if (i > mac.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i];
        mac.init(new SecretKeySpec(bArr, this.zza));
        byte[] bArrDoFinal = new byte[0];
        int i10 = 1;
        int i11 = 0;
        while (true) {
            mac.update(bArrDoFinal);
            mac.update(bArr2);
            mac.update((byte) i10);
            bArrDoFinal = mac.doFinal();
            int length = bArrDoFinal.length;
            int i12 = i11 + length;
            if (i12 >= i) {
                System.arraycopy(bArrDoFinal, 0, bArr3, i11, i - i11);
                return bArr3;
            }
            System.arraycopy(bArrDoFinal, 0, bArr3, i11, length);
            i10++;
            i11 = i12;
        }
    }

    private final byte[] zzg(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac mac = (Mac) zzyv.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.zza));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.zza));
        }
        return mac.doFinal(bArr);
    }

    public final int zza() throws GeneralSecurityException {
        return Mac.getInstance(this.zza).getMacLength();
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i) throws GeneralSecurityException {
        return zzf(zzg(zzmb.zzf("eae_prk", bArr2, bArr4), null), zzmb.zzg("shared_secret", bArr3, bArr4, i), i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzls
    public final byte[] zzc() throws GeneralSecurityException {
        String str = this.zza;
        int iHashCode = str.hashCode();
        if (iHashCode != 984523022) {
            if (iHashCode != 984524074) {
                if (iHashCode == 984525777 && str.equals("HmacSha512")) {
                    return zzmb.zzi;
                }
            } else if (str.equals("HmacSha384")) {
                return zzmb.zzh;
            }
        } else if (str.equals("HmacSha256")) {
            return zzmb.zzg;
        }
        throw new GeneralSecurityException("Could not determine HPKE KDF ID");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzls
    public final byte[] zzd(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) throws GeneralSecurityException {
        return zzf(bArr, zzmb.zzg(str, bArr2, bArr3, i), i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzls
    public final byte[] zze(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return zzg(zzmb.zzf(str, bArr2, bArr3), bArr);
    }
}

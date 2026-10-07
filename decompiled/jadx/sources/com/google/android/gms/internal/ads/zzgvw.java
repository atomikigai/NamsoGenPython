package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgvw implements zzgfm {
    private final zzgwm zza;
    private final zzggi zzb;
    private final int zzc;
    private final byte[] zzd;

    private zzgvw(zzgwm zzgwmVar, zzggi zzggiVar, int i, byte[] bArr) {
        this.zza = zzgwmVar;
        this.zzb = zzggiVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    public static zzgfm zzb(zzgha zzghaVar) throws GeneralSecurityException {
        zzgvp zzgvpVar = new zzgvp(zzghaVar.zzd().zzd(zzgfv.zza()), zzghaVar.zzb().zzd());
        String strValueOf = String.valueOf(zzghaVar.zzb().zzg());
        return new zzgvw(zzgvpVar, new zzgwr(new zzgwq("HMAC".concat(strValueOf), new SecretKeySpec(zzghaVar.zze().zzd(zzgfv.zza()), "HMAC")), zzghaVar.zzb().zze()), zzghaVar.zzb().zze(), zzghaVar.zzc().zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzd;
        int i = this.zzc;
        int length = bArr3.length;
        int length2 = bArr.length;
        if (length2 < i + length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzgpj.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] bArr4 = this.zzd;
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, bArr4.length, length2 - this.zzc);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, length2 - this.zzc, length2);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArrCopyOf = Arrays.copyOf(ByteBuffer.allocate(8).putLong(((long) bArr2.length) * 8).array(), 8);
        if (MessageDigest.isEqual(((zzgwr) this.zzb).zzc(zzgvu.zzb(bArr2, bArrCopyOfRange, bArrCopyOf)), bArrCopyOfRange2)) {
            return this.zza.zza(bArrCopyOfRange);
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}

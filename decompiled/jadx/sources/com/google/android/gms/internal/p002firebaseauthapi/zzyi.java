package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzyi implements zzbk {
    private static final byte[] zza = new byte[0];
    private final ECPrivateKey zzb;
    private final zzyk zzc;
    private final String zzd;
    private final byte[] zze;
    private final zzyh zzf;
    private final int zzg;

    public zzyi(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, zzyh zzyhVar) throws GeneralSecurityException {
        this.zzb = eCPrivateKey;
        this.zzc = new zzyk(eCPrivateKey);
        this.zze = bArr;
        this.zzd = str;
        this.zzg = i;
        this.zzf = zzyhVar;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:12:0x0049  */
    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbk
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int i;
        int length;
        int iZza = zzym.zza(this.zzb.getParams().getCurve());
        int i10 = this.zzg - 1;
        if (i10 != 0) {
            if (i10 != 1) {
                i = iZza + iZza;
            }
            length = bArr.length;
            if (length >= i) {
                throw new GeneralSecurityException("ciphertext too short");
            }
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i);
            return this.zzf.zzb(this.zzc.zza(bArrCopyOfRange, this.zzd, this.zze, null, this.zzf.zza(), this.zzg)).zza(Arrays.copyOfRange(bArr, i, length), zza);
        }
        iZza += iZza;
        i = iZza + 1;
        length = bArr.length;
        if (length >= i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 0, i);
        return this.zzf.zzb(this.zzc.zza(bArrCopyOfRange2, this.zzd, this.zze, null, this.zzf.zza(), this.zzg)).zza(Arrays.copyOfRange(bArr, i, length), zza);
    }
}

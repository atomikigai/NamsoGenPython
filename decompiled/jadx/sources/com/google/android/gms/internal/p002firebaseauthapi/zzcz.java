package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzcz implements zzbd {
    private final zzcl zza;
    private final zzrp zzb;
    private final zzrp zzc;

    public /* synthetic */ zzcz(zzcl zzclVar, zzcy zzcyVar) {
        zzrp zzrpVarZza;
        this.zza = zzclVar;
        if (zzclVar.zzf()) {
            zzrq zzrqVarZzb = zznp.zza().zzb();
            zzrv zzrvVarZza = zznm.zza(zzclVar);
            this.zzb = zzrqVarZzb.zza(zzrvVarZza, "aead", "encrypt");
            zzrpVarZza = zzrqVarZzb.zza(zzrvVarZza, "aead", "decrypt");
        } else {
            zzrpVarZza = zznm.zza;
            this.zzb = zzrpVarZza;
        }
        this.zzc = zzrpVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzch zzchVar : this.zza.zze(bArrCopyOf)) {
                try {
                    byte[] bArrZza = ((zzbd) zzchVar.zze()).zza(bArrCopyOfRange, bArr2);
                    zzchVar.zza();
                    int length2 = bArrCopyOfRange.length;
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzch zzchVar2 : this.zza.zze(zzbi.zza)) {
            try {
                byte[] bArrZza2 = ((zzbd) zzchVar2.zze()).zza(bArr, bArr2);
                zzchVar2.zza();
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbd
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        throw null;
    }
}

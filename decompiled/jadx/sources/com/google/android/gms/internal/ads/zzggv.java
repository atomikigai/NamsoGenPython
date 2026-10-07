package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzggv implements zzgfm {
    private final zzgou zza;

    public /* synthetic */ zzggv(zzgou zzgouVar, zzggw zzggwVar) {
        this.zza = zzgouVar;
        if (zzgouVar.zzg()) {
            zzgnf zzgnfVarZza = zzgnu.zzb().zza();
            zzgnj zzgnjVarZza = zzgnm.zza(zzgouVar);
            zzgnfVarZza.zza(zzgnjVarZza, "aead", "encrypt");
            zzgnfVarZza.zza(zzgnjVarZza, "aead", "decrypt");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzgos zzgosVar : this.zza.zzf(Arrays.copyOf(bArr, 5))) {
                try {
                    byte[] bArrZza = ((zzgfm) zzgosVar.zzd()).zza(bArr, bArr2);
                    zzgosVar.zza();
                    return bArrZza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgos zzgosVar2 : this.zza.zzf(zzgfr.zza)) {
            try {
                byte[] bArrZza2 = ((zzgfm) zzgosVar2.zzd()).zza(bArr, bArr2);
                zzgosVar2.zza();
                return bArrZza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}

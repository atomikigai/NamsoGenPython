package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzqv implements zzcd {
    private final zzcl zza;
    private final zzrp zzb;
    private final zzrp zzc;

    public /* synthetic */ zzqv(zzcl zzclVar, zzqu zzquVar) {
        zzrp zzrpVarZza;
        this.zza = zzclVar;
        if (zzclVar.zzf()) {
            zzrq zzrqVarZzb = zznp.zza().zzb();
            zzrv zzrvVarZza = zznm.zza(zzclVar);
            this.zzb = zzrqVarZzb.zza(zzrvVarZza, "mac", "compute");
            zzrpVarZza = zzrqVarZzb.zza(zzrvVarZza, "mac", "verify");
        } else {
            zzrpVarZza = zznm.zza;
            this.zzb = zzrpVarZza;
        }
        this.zzc = zzrpVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzcd
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length <= 5) {
            throw new GeneralSecurityException("tag too short");
        }
        for (zzch zzchVar : this.zza.zze(Arrays.copyOf(bArr, 5))) {
            try {
                ((zzcd) zzchVar.zzd()).zza(bArr, bArr2);
                zzchVar.zza();
                return;
            } catch (GeneralSecurityException unused) {
            }
        }
        for (zzch zzchVar2 : this.zza.zze(zzbi.zza)) {
            try {
                ((zzcd) zzchVar2.zzd()).zza(bArr, bArr2);
                zzchVar2.zza();
                return;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("invalid MAC");
    }
}

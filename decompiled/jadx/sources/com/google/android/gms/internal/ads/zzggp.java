package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzggp {
    public static zzggj zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgue zzgueVarZzf = zzgue.zzf(bArr, zzgyh.zza());
            zzgnz zzgnzVarZzc = zzgnz.zzc();
            zzgox zzgoxVarZza = zzgox.zza(zzgueVarZzf);
            return !zzgnzVarZzc.zzk(zzgoxVarZza) ? new zzgna(zzgoxVarZza) : zzgnzVarZzc.zzb(zzgoxVarZza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzggj zzggjVar) throws GeneralSecurityException {
        return ((zzgox) zzgnz.zzc().zze(zzggjVar, zzgox.class)).zzc().zzaV();
    }
}

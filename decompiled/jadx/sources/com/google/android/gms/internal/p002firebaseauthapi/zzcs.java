package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcs {
    public static zzce zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzwn zzwnVarZzd = zzwn.zzd(bArr, zzajx.zza());
            zznt zzntVarZzc = zznt.zzc();
            zzop zzopVarZza = zzop.zza(zzwnVarZzd);
            return !zzntVarZzc.zzi(zzopVarZza) ? new zznj(zzopVarZza) : zzntVarZzc.zzb(zzopVarZza);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zzb(zzce zzceVar) throws GeneralSecurityException {
        return zzceVar instanceof zznj ? ((zznj) zzceVar).zzb().zzc().zzq() : ((zzop) zznt.zzc().zzd(zzceVar, zzop.class)).zzc().zzq();
    }
}

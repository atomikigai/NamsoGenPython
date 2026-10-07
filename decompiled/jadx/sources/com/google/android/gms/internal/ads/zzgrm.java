package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgrm implements zzggi {
    private zzgrm(zzggi zzggiVar, zzgve zzgveVar, byte[] bArr) {
    }

    public static zzggi zza(zzgmz zzgmzVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzgow zzgowVarZza = zzgmzVar.zza(zzgfv.zza());
        zzgtx zzgtxVarZza = zzgua.zza();
        zzgtxVarZza.zzb(zzgowVarZza.zzg());
        zzgtxVarZza.zzc(zzgowVarZza.zze());
        zzgtxVarZza.zza(zzgowVarZza.zzb());
        zzggi zzggiVar = (zzggi) zzggm.zzb((zzgua) zzgtxVarZza.zzbr(), zzggi.class);
        zzgve zzgveVarZzc = zzgowVarZza.zzc();
        int iOrdinal = zzgveVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzgoa.zzb(zzgmzVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzgoa.zza(zzgmzVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
            }
            bArrZzc = zzgoa.zza(zzgmzVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzgoa.zza.zzc();
        }
        return new zzgrm(zzggiVar, zzgveVarZzc, bArrZzc);
    }
}

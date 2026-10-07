package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzglx implements zzgfm {
    private final zzgfm zza;
    private final byte[] zzb;

    private zzglx(zzgfm zzgfmVar, byte[] bArr) {
        this.zza = zzgfmVar;
        int length = bArr.length;
        if (length != 0 && length != 5) {
            throw new IllegalArgumentException("identifier has an invalid length");
        }
        this.zzb = bArr;
    }

    public static zzgfm zzb(zzgmz zzgmzVar) throws GeneralSecurityException {
        byte[] bArrZzc;
        zzgow zzgowVarZza = zzgmzVar.zza(zzgfv.zza());
        zzgtx zzgtxVarZza = zzgua.zza();
        zzgtxVarZza.zzb(zzgowVarZza.zzg());
        zzgtxVarZza.zzc(zzgowVarZza.zze());
        zzgtxVarZza.zza(zzgowVarZza.zzb());
        zzgfm zzgfmVar = (zzgfm) zzggm.zzb((zzgua) zzgtxVarZza.zzbr(), zzgfm.class);
        zzgve zzgveVarZzc = zzgowVarZza.zzc();
        int iOrdinal = zzgveVarZzc.ordinal();
        if (iOrdinal == 1) {
            bArrZzc = zzgoa.zzb(zzgmzVar.zzb().intValue()).zzc();
        } else if (iOrdinal == 2) {
            bArrZzc = zzgoa.zza(zzgmzVar.zzb().intValue()).zzc();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(zzgveVarZzc)));
            }
            bArrZzc = zzgoa.zza(zzgmzVar.zzb().intValue()).zzc();
        } else {
            bArrZzc = zzgoa.zza.zzc();
        }
        return new zzglx(zzgfmVar, bArrZzc);
    }

    public static zzgfm zzc(zzgfm zzgfmVar, zzgwu zzgwuVar) {
        return new zzglx(zzgfmVar, zzgwuVar.zzc());
    }

    @Override // com.google.android.gms.internal.ads.zzgfm
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (zzgpj.zzc(bArr3, bArr)) {
            return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
        }
        throw new GeneralSecurityException("wrong prefix");
    }
}

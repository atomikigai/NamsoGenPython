package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzqh extends zzog {
    public zzqh(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzog
    public final /* bridge */ /* synthetic */ Object zza(zzalp zzalpVar) throws GeneralSecurityException {
        zzvf zzvfVar = (zzvf) zzalpVar;
        zzvc zzvcVarZzb = zzvfVar.zzf().zzb();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzvfVar.zzg().zzq(), "HMAC");
        int iZza = zzvfVar.zzf().zza();
        zzvc zzvcVar = zzvc.UNKNOWN_HASH;
        int iOrdinal = zzvcVarZzb.ordinal();
        if (iOrdinal == 1) {
            return new zzzj(new zzzi("HMACSHA1", secretKeySpec), iZza);
        }
        if (iOrdinal == 2) {
            return new zzzj(new zzzi("HMACSHA384", secretKeySpec), iZza);
        }
        if (iOrdinal == 3) {
            return new zzzj(new zzzi("HMACSHA256", secretKeySpec), iZza);
        }
        if (iOrdinal == 4) {
            return new zzzj(new zzzi("HMACSHA512", secretKeySpec), iZza);
        }
        if (iOrdinal == 5) {
            return new zzzj(new zzzi("HMACSHA224", secretKeySpec), iZza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}

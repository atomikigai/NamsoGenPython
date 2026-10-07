package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzme implements zzlt {
    private final zzln zza;

    public zzme(zzln zzlnVar) {
        this.zza = zzlnVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlt
    public final byte[] zza(byte[] bArr, zzlu zzluVar) throws GeneralSecurityException {
        byte[] bArrZza = zzzm.zza(zzluVar.zza().zzc(), bArr);
        byte[] bArrZzb = zzyf.zzb(bArr, zzluVar.zzb().zzc());
        byte[] bArrZze = zzmb.zze(zzmb.zzc);
        zzln zzlnVar = this.zza;
        return zzlnVar.zzb(null, bArrZza, "eae_prk", bArrZzb, "shared_secret", bArrZze, zzlnVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlt
    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzc(), zzmb.zzg)) {
            return zzmb.zzc;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}

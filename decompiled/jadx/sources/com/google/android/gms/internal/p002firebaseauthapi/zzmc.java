package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzmc implements zzlt {
    private final zzln zza;
    private final int zzb;

    private zzmc(zzln zzlnVar, int i) {
        this.zza = zzlnVar;
        this.zzb = i;
    }

    public static zzmc zzc(int i) throws GeneralSecurityException {
        int i10 = i - 1;
        if (i10 != 0) {
            return i10 != 1 ? new zzmc(new zzln("HmacSha512"), 3) : new zzmc(new zzln("HmacSha384"), 2);
        }
        return new zzmc(new zzln("HmacSha256"), 1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlt
    public final byte[] zza(byte[] bArr, zzlu zzluVar) throws GeneralSecurityException {
        byte[] bArrZzf = zzym.zzf(zzym.zzg(this.zzb, zzluVar.zza().zzc()), zzym.zzh(zzym.zzi(this.zzb), 1, bArr));
        byte[] bArrZzb = zzyf.zzb(bArr, zzluVar.zzb().zzc());
        byte[] bArrZze = zzmb.zze(zzb());
        zzln zzlnVar = this.zza;
        return zzlnVar.zzb(null, bArrZzf, "eae_prk", bArrZzb, "shared_secret", bArrZze, zzlnVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlt
    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zzb - 1;
        if (i != 0) {
            return i != 1 ? zzmb.zzf : zzmb.zze;
        }
        return zzmb.zzd;
    }
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgmz extends zzgfw {
    private final zzgow zza;

    public zzgmz(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        zzc(zzgowVar, zzggnVar);
        this.zza = zzgowVar;
    }

    private static void zzc(zzgow zzgowVar, zzggn zzggnVar) throws GeneralSecurityException {
        int i = zzgmy.zzb[zzgowVar.zzb().ordinal()];
    }

    public final zzgow zza(zzggn zzggnVar) throws GeneralSecurityException {
        zzc(this.zza, zzggnVar);
        return this.zza;
    }

    public final Integer zzb() {
        return this.zza.zzf();
    }
}

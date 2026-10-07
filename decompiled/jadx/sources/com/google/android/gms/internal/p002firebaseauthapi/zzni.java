package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzni extends zzbn {
    private final zzoo zza;

    public zzni(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        zzc(zzooVar, zzcrVar);
        this.zza = zzooVar;
    }

    private static void zzc(zzoo zzooVar, zzcr zzcrVar) throws GeneralSecurityException {
        int i = zznh.zzb[zzooVar.zzb().ordinal()];
    }

    public final zzoo zza(zzcr zzcrVar) throws GeneralSecurityException {
        zzc(this.zza, zzcrVar);
        return this.zza;
    }

    public final Integer zzb() {
        return this.zza.zzf();
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzbv {
    private final zzce zza;

    private zzbv(zzce zzceVar) {
        this.zza = zzceVar;
    }

    public static zzbv zza(zzce zzceVar) throws GeneralSecurityException {
        return new zzbv(zzceVar);
    }

    public final zzwn zzb() throws GeneralSecurityException {
        zzce zzceVar = this.zza;
        return zzceVar instanceof zznj ? ((zznj) zzceVar).zzb().zzc() : ((zzop) zznt.zzc().zzd(zzceVar, zzop.class)).zzc();
    }
}

package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzqq {

    @Deprecated
    static final zzxr zza;

    @Deprecated
    static final zzxr zzb;

    @Deprecated
    static final zzxr zzc;

    static {
        new zzqj();
        zzxr zzxrVarZzb = zzxr.zzb();
        zza = zzxrVarZzb;
        zzb = zzxrVarZzb;
        zzc = zzxrVarZzb;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzqw.zzd();
        zzqa.zzd();
        zzqj.zzh(true);
        if (zzik.zzb()) {
            return;
        }
        zzpm.zzm(true);
    }
}

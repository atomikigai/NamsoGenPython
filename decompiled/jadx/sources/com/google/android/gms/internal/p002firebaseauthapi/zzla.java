package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzla {

    @Deprecated
    static final zzxr zza;

    @Deprecated
    static final zzxr zzb;

    @Deprecated
    static final zzxr zzc;

    static {
        new zzjn();
        new zzjl();
        zza = zzxr.zzb();
        zzb = zzxr.zzb();
        zzc = zzxr.zzb();
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzlc.zzd();
        zzle.zzd();
        zzcu.zza();
        zzjc.zza();
        if (zzik.zzb()) {
            return;
        }
        zzcq.zzf(new zzjl(), new zzjn(), true);
        int i = zzkf.zza;
        zzkf.zze(zznt.zzc());
        zzcq.zzf(new zzly(), new zzma(), true);
        int i10 = zzky.zza;
        zzky.zze(zznt.zzc());
    }
}

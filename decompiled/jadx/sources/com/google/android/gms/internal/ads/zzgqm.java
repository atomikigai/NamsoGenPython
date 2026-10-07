package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgqm {
    static {
        int i = zzgvh.zza;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzgqs.zzd();
        zzgpy.zzd();
        zzgqg.zza(true);
        if (zzgmi.zzb()) {
            return;
        }
        zzgpq.zzd(true);
    }
}

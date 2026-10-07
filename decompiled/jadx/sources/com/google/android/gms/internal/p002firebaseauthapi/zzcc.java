package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzcc {
    private static final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public static zzcb zza(String str) throws GeneralSecurityException {
        for (zzcb zzcbVar : zza) {
            if (zzcbVar.zzb(str)) {
                return zzcbVar;
            }
        }
        throw new GeneralSecurityException("No KMS client does support: ".concat(String.valueOf(str)));
    }
}

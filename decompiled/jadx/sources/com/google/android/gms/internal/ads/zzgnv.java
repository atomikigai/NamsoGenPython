package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgnv {
    private static final zzgnv zza = new zzgnv();
    private final Map zzb = new HashMap();

    public static zzgnv zzb() {
        return zza;
    }

    public final synchronized zzggj zza(String str) throws GeneralSecurityException {
        if (!this.zzb.containsKey("AES128_GCM")) {
            throw new GeneralSecurityException("Name AES128_GCM does not exist");
        }
        return (zzggj) this.zzb.get("AES128_GCM");
    }

    public final synchronized void zzc(String str, zzggj zzggjVar) throws GeneralSecurityException {
        try {
            if (!this.zzb.containsKey(str)) {
                this.zzb.put(str, zzggjVar);
                return;
            }
            if (((zzggj) this.zzb.get(str)).equals(zzggjVar)) {
                return;
            }
            throw new GeneralSecurityException("Parameters object with name " + str + " already exists (" + String.valueOf(this.zzb.get(str)) + "), cannot insert " + String.valueOf(zzggjVar));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(Map map) throws GeneralSecurityException {
        for (Map.Entry entry : map.entrySet()) {
            zzc((String) entry.getKey(), (zzggj) entry.getValue());
        }
    }
}

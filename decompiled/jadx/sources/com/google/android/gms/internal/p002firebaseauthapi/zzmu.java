package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmu {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzmu(Map map, Map map2, zzmt zzmtVar) {
        this.zza = map;
        this.zzb = map2;
    }

    public static zzms zza() {
        return new zzms(null);
    }

    public final Enum zzb(Object obj) throws GeneralSecurityException {
        Enum r10 = (Enum) this.zzb.get(obj);
        if (r10 != null) {
            return r10;
        }
        throw new GeneralSecurityException("Unable to convert object enum: ".concat(String.valueOf(obj)));
    }

    public final Object zzc(Enum r10) throws GeneralSecurityException {
        Object obj = this.zza.get(r10);
        if (obj != null) {
            return obj;
        }
        throw new GeneralSecurityException("Unable to convert proto enum: ".concat(String.valueOf(r10)));
    }
}

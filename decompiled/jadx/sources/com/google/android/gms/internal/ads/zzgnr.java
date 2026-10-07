package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgnr {
    private static final zzgnr zza = new zzgnr();
    private final Map zzb = new HashMap();

    public static zzgnr zza() {
        return zza;
    }

    public final synchronized void zzb(zzgnq zzgnqVar, Class cls) throws GeneralSecurityException {
        try {
            zzgnq zzgnqVar2 = (zzgnq) this.zzb.get(cls);
            if (zzgnqVar2 != null && !zzgnqVar2.equals(zzgnqVar)) {
                throw new GeneralSecurityException("Different key creator for parameters class already inserted");
            }
            this.zzb.put(cls, zzgnqVar);
        } catch (Throwable th) {
            throw th;
        }
    }
}

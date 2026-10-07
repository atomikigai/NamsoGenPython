package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgfz {
    public static final zzggj zza(zzggj zzggjVar) throws GeneralSecurityException {
        return zzggjVar != null ? zzggjVar : zzggp.zza(zzb(null).zzaV());
    }

    public static final zzgue zzb(zzggj zzggjVar) {
        try {
            return ((zzgox) zzgnz.zzc().zze(null, zzgox.class)).zzc();
        } catch (GeneralSecurityException e) {
            throw new zzgpi("Parsing parameters failed in getProto(). You probably want to call some Tink register function for ".concat("null"), e);
        }
    }
}

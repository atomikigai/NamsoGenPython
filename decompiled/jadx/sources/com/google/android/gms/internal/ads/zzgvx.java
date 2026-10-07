package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
final class zzgvx implements zzgwa {
    private final zzgwk zza;

    public /* synthetic */ zzgvx(zzgwk zzgwkVar, zzgwb zzgwbVar) {
        this.zza = zzgwkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgwa
    public final Object zza(String str) throws GeneralSecurityException {
        Iterator it = zzgwc.zzb("GmsCore_OpenSSL", "AndroidOpenSSL").iterator();
        while (it.hasNext()) {
            try {
                return this.zza.zza(str, (Provider) it.next());
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}

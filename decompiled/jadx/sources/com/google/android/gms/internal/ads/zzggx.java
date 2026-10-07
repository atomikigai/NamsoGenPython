package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzggx implements zzgov {
    private static final zzggx zza = new zzggx();
    private static final zzgom zzb = zzgom.zzb(new zzgok() { // from class: com.google.android.gms.internal.ads.zzggu
        @Override // com.google.android.gms.internal.ads.zzgok
        public final Object zza(zzgfw zzgfwVar) {
            return zzglx.zzb((zzgmz) zzgfwVar);
        }
    }, zzgmz.class, zzgfm.class);

    public static void zzd() throws GeneralSecurityException {
        zzgnw.zza().zzf(zza);
        zzgnw.zza().zze(zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final Class zza() {
        return zzgfm.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final Class zzb() {
        return zzgfm.class;
    }

    @Override // com.google.android.gms.internal.ads.zzgov
    public final /* synthetic */ Object zzc(zzgou zzgouVar) throws GeneralSecurityException {
        return new zzggv(zzgouVar, null);
    }
}

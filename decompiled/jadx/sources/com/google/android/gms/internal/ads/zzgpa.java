package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzgpa extends zzgmn {
    private static final zzgpa zza = new zzgpa();

    private zzgpa() {
    }

    public static zzgpa zzd() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgmn
    public final Class zza(Class cls) {
        return zzggm.zza(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgmn
    public final Object zzb(zzgfw zzgfwVar, Class cls) throws GeneralSecurityException {
        return zzgnw.zza().zzc(zzgfwVar, cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgmn
    public final Object zzc(zzgou zzgouVar, Class cls) throws GeneralSecurityException {
        int i = zzggm.zza;
        return zzgnw.zza().zzd(zzgouVar, cls);
    }
}

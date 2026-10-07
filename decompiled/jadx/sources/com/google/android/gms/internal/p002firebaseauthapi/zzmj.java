package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public final class zzmj {
    private static final Object zza = new Object();
    private static final String zzb = "zzmj";
    private final zzca zzc;
    private final zzbd zzd;
    private final zzbz zze;

    public /* synthetic */ zzmj(zzmh zzmhVar, zzmi zzmiVar) {
        this.zzc = new zzmm(zzmhVar.zza, zzmhVar.zzb, zzmhVar.zzc);
        this.zzd = zzmhVar.zze;
        this.zze = zzmhVar.zzh;
    }

    public static /* bridge */ /* synthetic */ boolean zzd() {
        return true;
    }

    public final synchronized zzby zza() throws GeneralSecurityException {
        return this.zze.zzb();
    }
}

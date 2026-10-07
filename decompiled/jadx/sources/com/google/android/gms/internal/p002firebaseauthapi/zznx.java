package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zznx {
    private final zzzo zza;
    private final Class zzb;

    public /* synthetic */ zznx(zzzo zzzoVar, Class cls, zznw zznwVar) {
        this.zza = zzzoVar;
        this.zzb = cls;
    }

    public static zznx zzb(zznv zznvVar, zzzo zzzoVar, Class cls) {
        return new zznu(zzzoVar, cls, zznvVar);
    }

    public abstract zzce zza(zzot zzotVar) throws GeneralSecurityException;

    public final zzzo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

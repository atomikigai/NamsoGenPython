package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzna {
    private final zzzo zza;
    private final Class zzb;

    public /* synthetic */ zzna(zzzo zzzoVar, Class cls, zzmz zzmzVar) {
        this.zza = zzzoVar;
        this.zzb = cls;
    }

    public static zzna zzb(zzmy zzmyVar, zzzo zzzoVar, Class cls) {
        return new zzmx(zzzoVar, cls, zzmyVar);
    }

    public abstract zzbn zza(zzot zzotVar, zzcr zzcrVar) throws GeneralSecurityException;

    public final zzzo zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

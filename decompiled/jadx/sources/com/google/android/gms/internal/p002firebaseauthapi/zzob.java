package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzob {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzob(Class cls, Class cls2, zzoa zzoaVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzob zzb(zznz zznzVar, Class cls, Class cls2) {
        return new zzny(cls, cls2, zznzVar);
    }

    public abstract zzot zza(zzce zzceVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

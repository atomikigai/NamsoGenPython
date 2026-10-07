package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzof {
    private final Class zza;
    private final Class zzb;

    public /* synthetic */ zzof(Class cls, Class cls2, zzoe zzoeVar) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public static zzof zzb(zzod zzodVar, Class cls, Class cls2) {
        return new zzoc(cls, cls2, zzodVar);
    }

    public abstract Object zza(zzbn zzbnVar) throws GeneralSecurityException;

    public final Class zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

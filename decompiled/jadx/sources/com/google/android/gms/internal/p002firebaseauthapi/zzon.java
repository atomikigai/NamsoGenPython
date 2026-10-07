package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzon extends zzng {
    private final Class zza;

    @SafeVarargs
    public zzon(Class cls, Class cls2, zzog... zzogVarArr) {
        super(cls, zzogVarArr);
        this.zza = cls2;
    }

    public abstract zzalp zzg(zzalp zzalpVar) throws GeneralSecurityException;
}

package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgms {
    private final zzgwu zza;
    private final Class zzb;

    public /* synthetic */ zzgms(zzgwu zzgwuVar, Class cls, zzgmr zzgmrVar) {
        this.zza = zzgwuVar;
        this.zzb = cls;
    }

    public static zzgms zzb(zzgmq zzgmqVar, zzgwu zzgwuVar, Class cls) {
        return new zzgmp(zzgwuVar, cls, zzgmqVar);
    }

    public abstract zzgfw zza(zzgpb zzgpbVar, zzggn zzggnVar) throws GeneralSecurityException;

    public final zzgwu zzc() {
        return this.zza;
    }

    public final Class zzd() {
        return this.zzb;
    }
}

package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzfwo implements Serializable {
    public static zzfwo zzc() {
        return zzfvy.zza;
    }

    public static zzfwo zzd(Object obj) {
        return obj == null ? zzfvy.zza : new zzfwv(obj);
    }

    public abstract zzfwo zza(zzfwh zzfwhVar);

    public abstract Object zzb(Object obj);
}

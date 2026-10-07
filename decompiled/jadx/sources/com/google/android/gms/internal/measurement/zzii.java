package com.google.android.gms.internal.measurement;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzii implements Serializable {
    public static zzii zzc() {
        return zzie.zza;
    }

    public static zzii zzd(Object obj) {
        return new zzik(obj);
    }

    public abstract Object zza();

    public abstract boolean zzb();
}

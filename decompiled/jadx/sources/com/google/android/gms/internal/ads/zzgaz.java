package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-90bdb1e633fc7deccf1f2262b96244d51f1613c31a781dbcb0c26e7e72a99457 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zzgaz implements Comparator {
    public static zzgaz zzb(Comparator comparator) {
        return new zzfyz(comparator);
    }

    public static zzgaz zzc() {
        return zzgax.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzgaz zza() {
        return new zzgbi(this);
    }
}
